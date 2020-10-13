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
	Public tituloLivro As String
	Public nomeUsuario As String
	Public paginaAtual As Int
	Public totalPaginas As Int
	Public meta As Int
	Public idLivro As Int
	Public tipoLeitura As String
End Sub

Sub Globals

	Private lblTituloLivro As Label
	Private lblNomeUsuario As Label
	Private edPaginaAtual As EditText
	Private edTotalPaginas As EditText
	Private lblPorcentagem As Label
	Private b4XImageViewFoto As B4XImageView
	Private lblIvalido As Label
	Private lblPaginaAtual As Label
	Private lblPrevisaoPorcentagem As Label
	Private btOk As Button
	Dim banco As ClassBancoDados
	Private lblTotalPaginas As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("Lay_lancamento_leitura")
		
	b4XImageViewFoto.ResizeMode = "FILL"
	b4XImageViewFoto.Load(File.DirAssets, "livro.jpg")
	
	lblTituloLivro.Text = tituloLivro
	lblNomeUsuario.Text = nomeUsuario
	edPaginaAtual.Text = paginaAtual + meta
	edTotalPaginas.Text = totalPaginas
	
	edPaginaAtual.RequestFocus
	
	Dim p As Int
	
	p = (paginaAtual * 100) / totalPaginas 		
	lblPorcentagem.Text = p & " % Lidos"
	
	p = ((paginaAtual + meta) * 100) / totalPaginas	
	lblPrevisaoPorcentagem.Text = "Próximo avanço " & p & "%"
			
	If tipoLeitura = "capítulos" Then
		lblPaginaAtual.Text = "Capítulo atual"
		lblTotalPaginas.Text = "Total capítulos"
	else if tipoLeitura = "páginas" Then
		lblPaginaAtual.Text = "Página atual"
		lblTotalPaginas.Text = "Total páginas"
	End If
	
	banco.Initialize
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btCancelar_Click
	Activity.Finish
End Sub

Sub btOk_Click	
	Try
		
		Dim cmd As String
		
		cmd = "exec sp_lancamento_leitura " & Main.Id_do_Usuario & _
												 ", " & idLivro & _
												 ", " & edPaginaAtual.Text & ""		
		
		Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
		
		Result.NextRow
		
		If Result.GetInt("RESULTADO") = 1 Then
			ToastMessageShow("Sucesso",True)
			Main.CadastrouAlgo = True
			Sleep(100)
			Activity.Finish
		Else if Result.GetInt("RESULTADO") = 0 Then
			Sleep(100)
			Main.CadastrouAlgo = True			
			ToastMessageShow("Há algo errado na atualização!",True)
			Activity.Finish
		End If
		
	Catch
		ToastMessageShow("Há algo errado na atualização!",True)
		Main.CadastrouAlgo = False
		Activity.Finish
	End Try
End Sub

Sub edPaginaAtual_TextChanged (Old As String, New As String)
	
	Dim valor As Int
		
	If New.Trim <> "" Then
		
		If New > totalPaginas Then
			lblIvalido.Visible = True
			lblIvalido.Text = "Inválido"
			
			edPaginaAtual.TextColor = Colors.Red
			lblPaginaAtual.Visible = False
			lblPrevisaoPorcentagem.Text = "Próximo avanço 0%"
			btOk.Enabled = False
		Else
			edPaginaAtual.TextColor = Colors.RGB(46,16,16)
			lblIvalido.Visible = False
			lblIvalido.Text = "Inválido"
			
			lblPaginaAtual.Visible = True			
			valor = ((New * 100) / totalPaginas)
			lblPrevisaoPorcentagem.Text = "Próximo avanço " & valor & "%"
			btOk.Enabled = True
		End If	
	Else
		lblPaginaAtual.Visible = False
		lblPrevisaoPorcentagem.Text = "Próximo avanço 0%"
		lblIvalido.Visible = True
		lblIvalido.Text = "Obrigatório"
		btOk.Enabled = False
	End If			
End Sub