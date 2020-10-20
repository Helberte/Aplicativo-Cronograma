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

	Dim gradient As GradientDrawable
	Dim panelNenhumaLeitura As Panel
	Dim cores(2) As Int
	Dim tamanhoLista As Int	
	
	Private btAdicionarLeitura As Button
		
	Private Panel_lendo As Panel
	Private nomeArquivo As String = "Informacoes.ini"
		
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
	
	If Main.CadastrouAlgo Then
		Wait For (Atualiza_leituras) Complete (Success As Boolean)
	
		Main.CadastrouAlgo = False
		If Success = False Then			
			ToastMessageShow("Impossível carregar leituras",True)
			Main.CadastrouAlgo = True
		End If		
	End If	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub Atualiza_leituras As ResumableSub
	
	Try
		
		Dim cmd As String
		
		cmd = "exec sp_atualiza_leituras " & Main.Id_do_Usuario
		
		Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
		
		Result.NextRow
		
		If Result.GetInt("RESULTADO") = 2 Then
						
			btAdicionarLeitura.Visible = False
			
			lbl_Inicial_Leitura.Text = Result.GetString("MENSAGEM")
			lbl_Inicial_Leitura.TextColor = Colors.Black
			lbl_Inicial_Leitura.TextSize = 20			
			
			scrollView1.Initialize (500)
			Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%x, 100%y)
			
			scrollView1.Panel.AddView(lbl_Inicial_Leitura, 1%x, 3%y, 98%x, 10%y)
						
			
			Return True	
		else if Result.GetInt("RESULTADO") = 0 Then
			btAdicionarLeitura.Visible = False
			
			ToastMessageShow(Result.GetString("MENSAGEM"),True)
			Return True
		else if Result.GetInt("RESULTADO") = 1 Then
			
			btAdicionarLeitura.Visible = True
			
			gradient.Initialize("TOP_BOTTOM", cores)
			
			gradient.CornerRadius = 12
						
			Dim quantidade As Int = Result.GetInt("QUANTIDADE")
			
			Dim panels(quantidade) As Panel
			Dim listaInformacoes As List					
			
			Dim lblTituloLivro(quantidade) As Label
			Dim lblDataComecoLeitura(quantidade) As Label
			Dim lblPrevisaoTermino(quantidade) As Label
			Dim lblQuantidadePaginas(quantidade) As Label
	
			Dim btAnotar(quantidade) As Button
			Dim btLancar(quantidade) As Button
						
			Dim tamanho_fonte As Int = 17.5
						
			Dim topo As Int = 1%y
			Dim topoLabel As Int = 1%y
			
			If temPanel Then
				scrollView1.Panel.RemoveView
				temPanel = False
			End If
			
			If temPanel = False Then
				
				temPanel = True
				scrollView1.Initialize( 500 )
				listaInformacoes.Initialize
				
				Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%x, btAdicionarLeitura.Top)
				
									
				Dim i As Int	
				For i = 0 To panels.Length - 1
																										
					topoLabel = 1%y
					panels(i).Initialize( "Event_panels" )
					
					lblTituloLivro(i).Initialize("")
					lblDataComecoLeitura(i).Initialize("")
					lblPrevisaoTermino(i).Initialize("")
					lblQuantidadePaginas(i).Initialize("")
	
					btAnotar(i).Initialize("Event_btAnotar")
					btLancar(i).Initialize("Event_btLancar")
					
					panels(i).Background = gradient
					panels(i).Padding = Array As Int(0dip, 0dip, 0dip, 0dip)
					panels(i).Elevation = 3dip
					
					scrollView1.Panel.AddView(panels(i), 1%x, topo, 98%x, 25%y)
							
					lblTituloLivro(i).Text = Result.GetString("nome")
					lblTituloLivro(i).TextColor = Colors.RGB(189,151,1)
					lblTituloLivro(i).TextSize = 23
					'lblTituloLivro(i).Color = Colors.Cyan					
										
					lblDataComecoLeitura(i).Text = "Começei ler dia " & Result.GetString("data_inicial")
					lblDataComecoLeitura(i).TextColor = Colors.RGB(72,72,72)
					lblDataComecoLeitura(i).TextSize = tamanho_fonte
					'lblDataComecoLeitura(i).Color = Colors.Cyan
					
					lblPrevisaoTermino(i).Text = "Previsão de Término " & Result.GetString("data_prevista_final")
					lblPrevisaoTermino(i).TextColor = Colors.RGB(72,72,72)
					lblPrevisaoTermino(i).TextSize = tamanho_fonte
					'lblPrevisaoTermino(i).Color = Colors.Cyan
					
					lblQuantidadePaginas(i).Text = Result.GetString("paginas_ou_cap_lidos") & " " & Result.GetString("tipo_de_leitura") & " de " & Result.GetString("quantidade_paginas")
					lblQuantidadePaginas(i).TextColor = Colors.RGB(72,72,72)
					lblQuantidadePaginas(i).TextSize = tamanho_fonte
					'lblQuantidadePaginas(i).Color = Colors.Cyan
					
					Dim altura As Int = 3.5%y
					panels(i).AddView(lblTituloLivro(i), 3%x, topoLabel, panels(i).Width - 5%x, 5%y)
					topoLabel = topoLabel + altura + 18dip
					panels(i).AddView(lblDataComecoLeitura(i), 3%x, topoLabel, panels(i).Width - 5%x, altura)
					topoLabel = topoLabel + altura + 1dip
					panels(i).AddView(lblPrevisaoTermino(i), 3%x, topoLabel, panels(i).Width - 5%x, altura)
					topoLabel = topoLabel + altura + 1dip
					panels(i).AddView(lblQuantidadePaginas(i), 3%x, topoLabel, panels(i).Width - 5%x, altura)
					topoLabel = topoLabel + altura + 2dip
					
					btAnotar(i).Tag = i
					
					'https://www.b4x.com/android/forum/threads/text-files.6690/
					'https://www.b4x.com/android/help/files.html#file
					
					listaInformacoes.Add("'" & Result.GetString("nome") & _						'0
										 "|¨'" & Result.GetInt("quantidade_paginas") & _		'1
										 "|¨'" & Result.GetInt("fk_id_Livro") & _				'2
										 "|¨'" & Result.GetString("usuarioNome") & _			'3
										 "|¨'" & Result.GetString("tipo_de_leitura") & _		'4
										 "|¨'" & Result.GetString("paginas_ou_cap_lidos") & _	'5
										 "|¨'" & Result.GetString("meta") & "|")				'6				
							
					tamanhoLista = 7
					' ' - começo
					' | - final
					' ¨ - corte
				
					btAnotar(i).Text = "Anotar"
					btAnotar(i).TextSize = 16
					btAnotar(i).TextColor = Colors.RGB(244,0,0)
					btAnotar(i).Color = Colors.Transparent
					panels(i).AddView(btAnotar(i), 3%x, topoLabel, 30%x, 6.5%y)
					
					btLancar(i).Tag = i
					
					btLancar(i).Text = "Lançar"
					btLancar(i).TextSize = 16
					btLancar(i).TextColor = Colors.RGB(244,0,0)
					btLancar(i).Color = Colors.Transparent
					panels(i).AddView(btLancar(i), 35%x, topoLabel, 30%x, 6.5%y)
									
					topo = topo + 25%y + 10dip
					
					scrollView1.Panel.Height = topo
					Result.NextRow
				Next		
				File.WriteList(File.DirInternal, nomeArquivo, listaInformacoes)

			End If	
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

Sub Event_btAnotar_Click
		
	Dim b As Button = Sender
	
	Dim informacoes 		As String
	Dim qtPag, codigoLivro 	As Int
	Dim nomeLivro 			As String
	Dim tipoLeitura			As String
	
	Dim lista As List
	lista.Initialize
	
	Try
		lista = File.ReadList(File.DirInternal, nomeArquivo)
		informacoes = lista.Get(b.Tag)
		
		Dim cols(tamanhoLista), coluna As String
		
		For i = 0 To cols.Length - 1
			
			coluna 	= informacoes.SubString2(informacoes.IndexOf("'") + 1, informacoes.IndexOf("|"))
			informacoes = informacoes.SubString2(informacoes.IndexOf("¨") + 1, informacoes.Length)
			
			cols(i) = coluna
		Next
		
		nomeLivro = cols(0)
		qtPag = cols(1)
		codigoLivro = cols(2)
		tipoLeitura = cols(4)
		
		CodigoLayAnotacao.codigoLivro = codigoLivro
		CodigoLayAnotacao.qtPaginas   =	qtPag
		CodigoLayAnotacao.nomeDoLivro = nomeLivro
		CodigoLayAnotacao.tipoLeitura = tipoLeitura
		
		StartActivity(CodigoLayAnotacao)
	Catch
		ToastMessageShow("Arquivos inexistentes, reinicie o app.",True)
	End Try
End Sub

Sub Event_btLancar_Click
	
	Dim tituloLivro As 		String
	Dim nomeUsuario As 		String
	Dim paginasAtuais As 	String
	Dim totalPaginas As 	String
	Dim meta As 			String
	Dim idLivro As 			String
	Dim tipoLeitura As 		String
	
	Dim b As Button = Sender

	Dim lista As List
	lista.Initialize
		
	Try		
		Dim colunaValor, valorSalvo, col As String
		
		lista = File.ReadList(File.DirInternal, nomeArquivo)
			
		colunaValor = lista.Get(b.Tag)
		Dim testeArray(tamanhoLista) As	String
		
					
		For coluna = 0 To testeArray.Length - 1
				
			col = colunaValor.SubString2(colunaValor.IndexOf("'") + 1, colunaValor.IndexOf("|"))
			valorSalvo = colunaValor.SubString2(colunaValor.IndexOf("¨") + 1, colunaValor.Length)
					
			testeArray(coluna) = col
			colunaValor = valorSalvo
					
		Next
		
		tituloLivro = testeArray(0)
		nomeUsuario = testeArray(3)
		paginasAtuais = testeArray(5)
		totalPaginas = testeArray(1)
		meta = testeArray(6)
		idLivro = testeArray(2)
		tipoLeitura = testeArray(4)
		
		CodigoLancamentoLeitura.nomeUsuario = nomeUsuario
		CodigoLancamentoLeitura.paginaAtual = paginasAtuais
		CodigoLancamentoLeitura.tituloLivro = tituloLivro
		CodigoLancamentoLeitura.totalPaginas = totalPaginas
		CodigoLancamentoLeitura.meta = meta
		CodigoLancamentoLeitura.idLivro = idLivro
		CodigoLancamentoLeitura.tipoLeitura = tipoLeitura
		
		StartActivity(CodigoLancamentoLeitura)
	Catch
		
		ToastMessageShow("Arquivos inexistentes, reinicie o app.",True)
	End Try
End Sub

Sub btAdicionarLeitura_Click	
	StartActivity(act_TelaCadastro)	
End Sub

Sub TabStrip_PageSelected (Position As Int)
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	
	If KeyCode = KeyCodes.KEYCODE_BACK Then

		Dim resp As Int = Msgbox2("Deseja realmente sair?","Já vai?","Sim", "", "Não",Null)
		
		If resp = DialogResponse.POSITIVE Then
					
			ExitApplication
			Return False
		Else
			KeyCode = 0
			Return True
		End If
	Else
		Return True
	End If
	
'	Dim x As XUI
'		
'	If KeyCode = KeyCodes.KEYCODE_BACK Then
'	
'		Dim resp As Int = x.Msgbox2Async("Deseja realmente sair?","Já vai?","Sim", "", "Não",Null)
'		
'		Wait For (resp) MsgBox_Result (Result As Int)
'		
'		If Result = DialogResponse.POSITIVE Then
'					
'			ExitApplication
'			Return False
'		Else if Result = DialogResponse.NEGATIVE Then
'			KeyCode = 0
'			Return True
'		Else
'			Return False
'		End If
'	Else
'		Return True
'	End If		
End Sub
