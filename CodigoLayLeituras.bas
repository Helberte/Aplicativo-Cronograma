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

Sub Process_Globals

End Sub

Sub Globals
	
	Private banco As ClassBancoDados
	Private TabStrip As TabStrip
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("LayLeiturasTabStrip")
	
	TabStrip.LoadLayout("LayLeitura_menu1","Lendo")
	TabStrip.LoadLayout("LayLeitura_menu2","Lidos")
		
	banco.Initialize	
End Sub

Sub Activity_Resume
	Try
		
'		Dim cmd As String
'		
'		cmd = "exec sp_atualiza_leituras " & Main.Id_do_Usuario
'		
'		Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
'		
'		Result.NextRow
'		
'		If Result.GetInt("RESULTADO") = 2 Then
'						
'		End If	
	
	Catch
		ToastMessageShow("Impossível carregar leituras",True)
	End Try
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub btAdicionarLeitura_Click	
	StartActivity(CodigoCadastroLivro)	
End Sub

Sub TabStrip_PageSelected (Position As Int)
	MsgboxAsync(Position,"")
End Sub