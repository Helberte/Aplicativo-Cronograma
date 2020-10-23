B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
	Public nomeDoLivro As String
	Public qtPaginas, codigoLivro As Int
	Public tipoLeitura As String
End Sub

Sub Globals

	Private lblTitulo As Label
	Private B4XComboBox1 As B4XComboBox
	Private edTituloAnotacao As EditText
	Private edAnotacao As EditText
	Private btCancelar As Button
	Private btOk As Button
	Dim banco As ClassBancoDados
	Private lblAnotacaoRefPag As Label
	Private panel_cabecalho As Panel
	Private lblTituloAnotacao As Label
	Private panel_anotacao As Panel
	Dim verifica As Boolean = True
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("Lay_Anotar")
	banco.Initialize
	
	edTituloAnotacao.RequestFocus
	
End Sub

Sub Activity_Resume
	Dim paginas(qtPaginas) As Int
	
	For i = 0 To qtPaginas - 1
		paginas(i) = i + 1
	Next
	
	
	If lblAnotacaoRefPag.Text = "página" Then
		lblAnotacaoRefPag.Text = "Anotação referente à página"
	Else
		lblAnotacaoRefPag.Text = "Anotação referente ao capítulo"
	End If
	
	lblTitulo.Text = nomeDoLivro
	B4XComboBox1.SetItems(paginas)


	lblTitulo.TextColor = Colors.Transparent
	lblTitulo.Top = -2.5%y
	
	lblTitulo.SetTextColorAnimated(1000, Colors.RGB(195,21,21))
	lblTitulo.SetLayoutAnimated(1000, 0%x, 2.5%y, panel_cabecalho.Width, 6%y)

	If edTituloAnotacao.Text.Trim = "" Then
		lblTituloAnotacao.TextColor = Colors.Transparent
	Else
		ApareceTituloAnotacao
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btCancelar_Click
	nomeDoLivro = ""
	qtPaginas = 0
	Activity.Finish
End Sub

Sub btOk_Click
	
	If edTituloAnotacao.Text.Trim = "" Then
		edTituloAnotacao.RequestFocus
		ToastMessageShow("Insira um título para sua anotação",True)
	Else if edAnotacao.Text.Trim = "" Then
		edAnotacao.RequestFocus
		ToastMessageShow("Cadê a anotação?",True)
	Else
		Try
			
			Dim cmd As String 
			cmd = "exec sp_atualiza_anotacao " & Main.Id_do_Usuario & _
												", " & codigoLivro & _
												", " & B4XComboBox1.SelectedItem & _
												", '" & edTituloAnotacao.Text & _
												"','" & edAnotacao.Text & "'"
			
			Wait For( banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
			
			Result.NextRow
			
			If Result.GetString("RESULTADO") = 0 Then
				ToastMessageShow("Algo deu errado!",True)
				Sleep(400)
				Activity.Finish
				
			else if Result.GetString("RESULTADO") = 1 Then
				ToastMessageShow("Tudo certo",True)
				Sleep(400)
				Activity.Finish
				
			End If			
		Catch
			ToastMessageShow("Algo deu errado!",True)
			Sleep(400)
			Activity.Finish
		End Try		
	End If	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		nomeDoLivro = ""
		qtPaginas = 0
		Activity.Finish
		Return True
	Else
		Return False
	End If
End Sub

Sub edTituloAnotacao_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edTituloAnotacao.Text = edTituloAnotacao.Text.Replace("'","")
	Else
		If edTituloAnotacao.Text.Trim = "" Then
			SomeTituloAnotacao
		Else
			If verifica Then
				ApareceTituloAnotacao
			End If				
		End If
	End If
End Sub

Sub SomeTituloAnotacao
	verifica = True
	lblTituloAnotacao.SetTextColorAnimated(600, Colors.Transparent)
	lblTituloAnotacao.SetLayoutAnimated(900, (panel_anotacao.Width - lblTituloAnotacao.Width) / 2, 0%y, panel_anotacao.Width - 3%x, 3.2%y)
End Sub

Sub ApareceTituloAnotacao
	
	verifica = False
	lblTituloAnotacao.Top = 0%y
	lblTituloAnotacao.TextColor = Colors.Transparent
	
	lblTituloAnotacao.SetTextColorAnimated(600, Colors.RGB(195,21,21))
	lblTituloAnotacao.SetLayoutAnimated(900, (panel_anotacao.Width - lblTituloAnotacao.Width) / 2, 1%y, panel_anotacao.Width - 3%x, 3.2%y)

End Sub

Sub edAnotacao_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edAnotacao.Text = edAnotacao.Text.Replace("'","")
	End If
End Sub