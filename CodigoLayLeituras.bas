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
	Dim temPanel As Boolean = False
End Sub

Sub Globals	
	Private banco As ClassBancoDados
	Private TabStrip As TabStrip
	
	Dim lbl_Inicial_Leitura As Label
	
	Dim scrollView1 As ScrollView

	Private panelLeituras As Panel
		
	Dim gradient As GradientDrawable
	Dim panelNenhumaLeitura As Panel
	Dim cores(2) As Int
	Private btAdicionarLeitura As Button
		
	Private Panel_lendo As Panel
	
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
	
	If CodigoCadastroLivro.cadastrou Or CodigoCadastro.cadastrouUsuario Then
		Wait For (Atualiza_leituras) Complete (Success As Boolean)
		
		CodigoCadastro.cadastrouUsuario = False
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
			
			scrollView1.Initialize (500)
			Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%x, 100%y)
			
			scrollView1.Panel.AddView(lbl_Inicial_Leitura, 1%x, 3%y, 98%x, 10%y)
						
			Return True	
		else if Result.GetInt("RESULTADO") = 0 Then
			
			ToastMessageShow(Result.GetString("MENSAGEM"),True)
			Return True
		else if Result.GetInt("RESULTADO") = 1 Then
						
			gradient.Initialize("TOP_BOTTOM", cores)
			
			gradient.CornerRadius = 12
			
			Dim quantidade As Int = Result.GetInt("QUANTIDADE")
			
			Dim panels(quantidade) As Panel
			
			Dim lblTituloLivro(quantidade) As Label
			Dim lblDataComecoLeitura(quantidade) As Label
			Dim lblPrevisaoTermino(quantidade) As Label
			Dim lblQuantidadePaginas(quantidade) As Label
	
			Dim btAnotar(quantidade) As Button
			Dim btLancar(quantidade) As Button
			
			Dim data_inicial As String
			Dim data_final As String
			
			Dim dia, mes, ano As String
			
			Dim topo As Int = 1%y
			Dim topoLabel As Int = 1%y
			
			If temPanel Then
				scrollView1.Panel.RemoveView
				temPanel = False
			End If
			
			If temPanel = False Then
				
				scrollView1.Initialize( 500 )
				Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%x, btAdicionarLeitura.Top)
							
							
				For i = 0 To panels.Length - 1
							
					dia = Result.GetString("data_inicial").SubString2(8, 10)
					mes = Result.GetString("data_inicial").SubString2(5, 7)
					ano = Result.GetString("data_inicial").SubString2(0, 4)
					
					data_inicial = dia & " / " & mes & " / " & ano
					
					dia = Result.GetString("data_prevista_final").SubString2(8, 10)
					mes = Result.GetString("data_prevista_final").SubString2(5, 7)
					ano = Result.GetString("data_prevista_final").SubString2(0, 4)
					
					data_final = dia & " / " & mes & " / " & ano
							
					topoLabel = 1%y
					panels(i).Initialize( "Event_panels" )
					
					lblTituloLivro(i).Initialize("")
					lblDataComecoLeitura(i).Initialize("")
					lblPrevisaoTermino(i).Initialize("")
					lblQuantidadePaginas(i).Initialize("")
	
					btAnotar(i).Initialize("")
					btLancar(i).Initialize("")									
					
					panels(i).Background = gradient
					
					scrollView1.Panel.AddView(panels(i), 1%x, topo, 98%x, 25%y)
			
				
					lblTituloLivro(i).Text = Result.GetString("nome")
					lblTituloLivro(i).TextColor = Colors.RGB(72,72,72)
					lblTituloLivro(i).TextSize = 19
					'lblTituloLivro(i).Color = Colors.Cyan
					
					lblDataComecoLeitura(i).Text = "Começei ler dia " & data_inicial
					lblDataComecoLeitura(i).TextColor = Colors.RGB(72,72,72)
					lblDataComecoLeitura(i).TextSize = 19
					'lblDataComecoLeitura(i).Color = Colors.Cyan
					
					lblPrevisaoTermino(i).Text = "Previsão de Término " & data_final
					lblPrevisaoTermino(i).TextColor = Colors.RGB(72,72,72)
					lblPrevisaoTermino(i).TextSize = 19
					'lblPrevisaoTermino(i).Color = Colors.Cyan
					
					lblQuantidadePaginas(i).Text = Result.GetString("paginas_ou_cap_lidos") & " páginas de " & Result.GetString("quantidade_paginas")
					lblQuantidadePaginas(i).TextColor = Colors.RGB(72,72,72)
					lblQuantidadePaginas(i).TextSize = 19
					'lblQuantidadePaginas(i).Color = Colors.Cyan
										
					panels(i).AddView(lblTituloLivro(i), 3%x, topoLabel, panels(i).Width - 5%x, 4%y)
					topoLabel = topoLabel + 4%y + 1dip
					panels(i).AddView(lblDataComecoLeitura(i), 3%x, topoLabel, panels(i).Width - 5%x, 4%y)
					topoLabel = topoLabel + 4%y + 1dip
					panels(i).AddView(lblPrevisaoTermino(i), 3%x, topoLabel, panels(i).Width - 5%x, 4%y)
					topoLabel = topoLabel + 4%y + 1dip
					panels(i).AddView(lblQuantidadePaginas(i), 3%x, topoLabel, panels(i).Width - 5%x, 4%y)
					topoLabel = topoLabel + 4%y + 15dip
					
					btAnotar(i).Text = "Anotar"
					btAnotar(i).TextSize = 16
					btAnotar(i).TextColor = Colors.ARGB(244,0,0,0)
					btAnotar(i).Color = Colors.Transparent
					panels(i).AddView(btAnotar(i), 3%x, topoLabel, 20%x, 6%y)
					
					btLancar(i).Text = "Lançar"
					btLancar(i).TextSize = 16
					btLancar(i).TextColor = Colors.ARGB(244,0,0,0)
					btLancar(i).Color = Colors.Transparent
					panels(i).AddView(btLancar(i), 25%x, topoLabel, 20%x, 6%y)
				
					temPanel = True
					
					topo = topo + 25%y + 10dip
					
					Result.NextRow
				Next		
				scrollView1.Panel.Height = topo
			End If	
			
			btAdicionarLeitura.Visible = True			
			Return True
		Else
			ToastMessageShow("Impossível carregar leituras",True)
			Return False
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