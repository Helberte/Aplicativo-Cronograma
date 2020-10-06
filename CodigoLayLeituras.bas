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
	
	Dim lbl_Inicial_Leitura As Label
	
	Private ScrollView1 As ScrollView


	Private panelLeituras As Panel
		
	Dim gradient As GradientDrawable
	Dim panelNenhumaLeitura As Panel
	Dim cores(2) As Int
	Private btAdicionarLeitura As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("LayLeiturasTabStrip")	
	TabStrip.LoadLayout("LayLeitura_menu1","Lendo")
	TabStrip.LoadLayout("LayLeitura_menu2","Lidos")
	
	lbl_Inicial_Leitura.Initialize( "Event_lbl" )
	
	banco.Initialize	
		
	cores(0) = Colors.RGB(255,255,255)
	cores(1) = Colors.RGB(255,255,255)
	
	panelNenhumaLeitura.Initialize( "" )
	ScrollView1.Panel.Height = 100%y
	
	panelLeituras.Visible = False
	btAdicionarLeitura.Visible = False
	
	If FirstTime Then		
		Wait For (Atualiza_leituras) Complete (Success As Boolean)
		
		If Success = False Then
			ToastMessageShow("Impossível carregar leituras",True)
		End If
	End If
	
End Sub

Sub Event_lbl_Click
	StartActivity(CodigoCadastroLivro)
End Sub

Sub Activity_Resume
	
	If CodigoCadastroLivro.cadastrou Then
		Wait For (Atualiza_leituras) Complete (Success As Boolean)
		
		CodigoCadastroLivro.cadastrou = False
		If Success = False Then
			
			ToastMessageShow("Impossível carregar leituras",True)
			CodigoCadastroLivro.cadastrou = True
		End If		
	End If	
End Sub

Sub Atualiza_leituras As ResumableSub
	
	Try
		
		Dim cmd As String
		
		cmd = "exec sp_atualiza_leituras " & Main.Id_do_Usuario
		
		Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
		
		Result.NextRow
		
		If Result.GetInt("RESULTADO") = 2 Then
						
			panelLeituras.Visible = False
			btAdicionarLeitura.Visible = False
			
			lbl_Inicial_Leitura.Text = Result.GetString("MENSAGEM")
			lbl_Inicial_Leitura.TextColor = Colors.Black
			lbl_Inicial_Leitura.TextSize = 20
			
			
'			gradient.Initialize("TOP_BOTTOM", cores)
'			
'			gradient.CornerRadius = 12
'			panelNenhumaLeitura.Background = gradient
			
			ScrollView1.Panel.AddView(lbl_Inicial_Leitura, 1%x, 3%y, 98%x, 10%y)
						
			Return True		
		Else
			panelLeituras.Visible = True
			Return True
		End If
	Catch
		ToastMessageShow("Impossível carregar leituras",True)
		Return False
	End Try
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub btAdicionarLeitura_Click	
	StartActivity(CodigoCadastroLivro)	
End Sub

Sub TabStrip_PageSelected (Position As Int)
	
End Sub