B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.801
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: true
#End Region

Sub Process_Globals
	
End Sub

Sub Globals

	Private edNome As EditText
	Private edLogin As EditText
	Private edSenha As EditText
	Private edRepitaSenha As EditText
	Private panelCadSalvo As Panel
	Private lblCadSalvo As Label
	Private funcoes As ClassBancoDados
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("LayoutCadastro")
	
	edNome.RequestFocus
	
	panelCadSalvo.Visible = False
	lblCadSalvo.Visible = False
	funcoes.Initialize
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btSalvar_Click
	
	If edNome.Text.Trim = "" Then
		MsgboxAsync("Falta o nome","Está apressado?")
		edNome.RequestFocus
		
	Else If edLogin.Text.Trim = "" Then
		MsgboxAsync("Falta o login","Está apressado?")
		edLogin.RequestFocus
				
	Else If edSenha.Text.Trim = "" Then
		MsgboxAsync("Falta a senha","Está apressado?")
		edSenha.RequestFocus		
	
	Else			
		
		If edRepitaSenha.Text.Trim.Length < 8 Then
			MsgboxAsync("Sua senha precisa ter no mínimo 8 dígitos.","Senha inválida!")
			edRepitaSenha.RequestFocus
		
		Else If edSenha.Text.Trim <> edRepitaSenha.Text.Trim Then				
			MsgboxAsync("As senhas não coinsidem.","Atenção!")
			edRepitaSenha.Text = ""
			edSenha.RequestFocus
			
		Else				
			Try					
				
				Dim cmd As String = "exec sp_cad_usuario_cronograma '" & edNome.Text & _
															    "', '" & edLogin.Text & _
																"', '" & edSenha.Text & "' "
			
				Wait For (funcoes.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
				
				Result.NextRow
				
				If Result = Null Then
					
					MsgboxAsync("Problemas na conexão com banco de dados. " & LastException, "Atenção!")					
				else if Result.GetString("RESULTADO") = 0 Then						
					
					MsgboxAsync(Result.GetString("MENSAGEM"), "Ops!")
					edNome.RequestFocus
				Else
					
					edLogin.Enabled = False
					edNome.Enabled = False
					edRepitaSenha.Enabled = False
					edSenha.Enabled = False
							
					edSenha.TextColor = Colors.RGB(158, 130, 130)
					edLogin.TextColor = Colors.RGB(158, 130, 130)
					edNome.TextColor = Colors.RGB(158, 130, 130)
					edRepitaSenha.TextColor = Colors.RGB(158, 130, 130)
					
					Main.Id_do_Usuario = Result.GetInt("ID")
					ToastMessageShow("Sucesso!",True)
						
					lblCadSalvo.Visible = True
					panelCadSalvo.Visible = True
					lblCadSalvo.Text = Result.GetString("MENSAGEM")					
					Sleep(1200)
							
					StartActivity(CodigoLayLeituras)
					Activity.Finish
				End If
				Result.Close
			Catch
				Result.Close
				MsgboxAsync("Problemas na inserção de dados. " & LastException, "Atenção!")

			End Try				
		End If		
	End If
End Sub


Sub edSenha_TextChanged (Old As String, New As String)
	
	If New.Length > 8 Then		
		edSenha.Text = New.SubString2(0, 8)
		edSenha.SelectionStart = 8
	End If	
End Sub

Sub edRepitaSenha_TextChanged (Old As String, New As String)
	
	If New.Length > 8 Then
		edRepitaSenha.Text = New.SubString2(0, 8)
		edRepitaSenha.SelectionStart = 8
	End If	
End Sub















