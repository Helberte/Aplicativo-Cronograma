B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.801
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

'DOCUMENTAÇÃO

'https://www.b4x.com/android/documentation.html

Sub Process_Globals
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("LayLogin")
	
	EdLogin.RequestFocus
	funcoes.Initialize
	
End Sub

Sub Globals
	
	Private funcoes As ClassBancoDados
	Private EdLogin As EditText
	Private EdSenha As EditText	
	Private btConectar As Button
End Sub

Sub btConectar_Click
	
	If EdLogin.Text.Trim = "" And EdSenha.Text.Trim = "" Then
		
		EdLogin.Text = EdLogin.Text.Trim
		EdSenha.Text = EdSenha.Text.Trim
			
		Dim ms As Object = Msgbox2Async("Ainda não tem um Cadastro, deseja faze-lo agora?","Campos vazios","Sim","Cancelar ","Já tenho cadastro ", Null, False)
		
		Wait For (ms) Msgbox_Result (Result As Int)
		
		If Result = DialogResponse.POSITIVE Then
			
			StartActivity(CodigoCadastro)
			Activity.Finish
		Else If Result = DialogResponse.CANCEL Then
			EdLogin.RequestFocus
						
		Else If Result = DialogResponse.NEGATIVE Then
			EdLogin.RequestFocus
			
		End If				
		
	Else If EdSenha.Text.Trim = "" Then		
		EdSenha.RequestFocus
		
	Else				
		Try
			
			Dim exec As String = "exec sp_encontra_usuario '" & EdLogin.Text & "', '" & EdSenha.Text & "'"
					
			wait For (funcoes.Insert_Consulta(exec)) Complete (Result_2 As JdbcResultSet)
			
			Result_2.NextRow
			
			If Result_2.GetString("RESULTADO") = 0 Then
					
				MsgboxAsync("Usuário não encontrado.","Ops!")
				EdLogin.Text = ""
				EdSenha.Text = ""
				EdLogin.RequestFocus
			Else
				
				Main.Id_do_Usuario = Result_2.GetInt("ID_USUARIO")
				
				StartActivity(CodigoLayLeituras)
				Activity.Finish						
			End If										
		Catch
			MsgboxAsync("Problemas ao verificar usuário. " & LastException, "Atenção!")
		End Try		
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btCadastro_Click
	StartActivity(CodigoCadastro)
	Activity.Finish
End Sub

Sub EdSenha_TextChanged (Old As String, New As String)	
	If New.Length > 8 Then
		EdSenha.Text = New.SubString2(0, 8)
		EdSenha.SelectionStart = 8
	End If
End Sub

Sub EdLogin_TextChanged (Old As String, New As String)	
	If New.IndexOf("'") >= 0 Then		
		EdLogin.Text = EdLogin.Text.Replace("'","")		
	End If	
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Activity.Finish
		Return False
	Else
		Return True
	End If
End Sub











