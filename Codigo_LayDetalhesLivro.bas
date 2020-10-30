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
	
	Public dt_inicio As 	String
	Public dt_termino As 	String
	Public pg_atual As 		String
	Public pg_total As 		String
	Public pg_meta As 		String
	Public nome_usuario As	String
	Public nome_livro As 	String
	Public tipo_leitura As 	String
	Public id_livro As 		String
	
	Private banco As 		ClassBancoDados
End Sub

Sub Globals	
	Private bt_voltar As 				Button
	Private panel_cabecalho As 			Panel
	Private scrol As 					ScrollView
	
	
	Dim painel_imagem As				Panel
	Type Dimensoes (esquerda As Int, topo As Int, tamanho As Int)
	Type Dm_labels (topo As Int)
	Dim lbl As 							Dm_labels
	Dim dm As 							Dimensoes
	Dim botoes(5) As 					Button 
	dim painel_botoes as 				Panel
	
	Dim lbl_usuario As 					Label
	Dim lbl_livro	As					Label
	Dim panel_detalhes As				Panel
	
	Dim lbl_dt_inicio As 				Label
	Dim lbl_dt_termino As 				Label
	Dim lbl_pg_atual As 				Label
	Dim lbl_pg_total As 				Label
	Dim lbl_pg_meta As 			    	Label
	
	Dim rot_dt_inicio As				Label
	Dim rot_dt_termino As 				Label
	Dim rot_pg_atual As 				Label
	Dim rot_pg_total As 				Label
	Dim rot_pg_meta As 			    	Label
	
	Private b4x_imagem As B4XImageView
	Dim seguro_cadastrou_algo As 		Boolean = False
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("Lay_detalhes_leituras")
	bt_voltar.SetBackgroundImage(LoadBitmap(File.DirAssets, "bt_voltar.png"))
	painel_botoes.Initialize("")
	
	banco.Initialize
	painel_imagem.Initialize( "" )
	lbl_livro.Initialize("")
	lbl_usuario.Initialize("")
	panel_detalhes.Initialize("")
	
	lbl_dt_inicio.Initialize("")
	lbl_dt_termino.Initialize("")
	lbl_pg_atual.Initialize("")
	lbl_pg_total.Initialize("")
	lbl_pg_meta.Initialize("")
	
	rot_dt_inicio.Initialize("")
	rot_dt_termino.Initialize("")
	rot_pg_atual.Initialize("")
	rot_pg_meta.Initialize("")
	rot_pg_total.Initialize("")
	
	Dim g As Object
	Dim gd_color As GradientDrawable
	Dim cores_label(2) As Int
	
	g = Bit.Or(Gravity.LEFT, Gravity.CENTER_VERTICAL)
	
	cores_label(0) = Colors.RGB(241, 201, 201)
	cores_label(1) = Colors.RGB(241, 201, 201)
	
	gd_color.Initialize("TOP_BOTTOM", cores_label)	
	gd_color.CornerRadius = 100
	
	Dim lbl_cor_fundo As Int = Colors.RGB(241, 201, 201)
	Dim lbl_cor_fonte As Int = Colors.RGB(104,30,30)
	
	lbl_dt_inicio = Configura_label(dt_inicio, lbl_cor_fundo , 20, lbl_cor_fonte)
	lbl_dt_termino = Configura_label(dt_termino, lbl_cor_fundo, 20, lbl_cor_fonte)
	lbl_pg_atual = Configura_label(pg_atual, lbl_cor_fundo, 20, lbl_cor_fonte)
	lbl_pg_total = Configura_label(pg_total, lbl_cor_fundo, 20, lbl_cor_fonte)
	lbl_pg_meta = Configura_label(pg_meta, lbl_cor_fundo, 20, lbl_cor_fonte)
	
	Dim fonte_rot As Int = 15
	If tipo_leitura = "páginas" Then
		tipo_leitura = "Página"
	Else
		tipo_leitura = "Capítulo"
	End If
	rot_dt_inicio = Configura_label("Data de início", Colors.Transparent, fonte_rot, Colors.Black)
	rot_dt_termino = Configura_label("Previsão de término", Colors.Transparent, fonte_rot, Colors.Black)
	rot_pg_atual = Configura_label( tipo_leitura & " atual", Colors.Transparent, fonte_rot, Colors.Black)
	rot_pg_meta = Configura_label("Meta", Colors.Transparent, fonte_rot, Colors.Black)
	If tipo_leitura = "Página" Then
		tipo_leitura = "páginas"
	Else
		tipo_leitura = "capítulos"
	End If
	rot_pg_total = Configura_label("Total de " & tipo_leitura, Colors.Transparent, fonte_rot, Colors.Black)
	
	lbl_dt_inicio.Gravity = g
	lbl_dt_termino.Gravity = g
	lbl_pg_atual.Gravity = g
	lbl_pg_total.Gravity = g
	lbl_pg_meta.Gravity = g
	
	lbl_dt_inicio.Background = gd_color
	lbl_dt_termino.Background = gd_color
	lbl_pg_atual.Background = gd_color
	lbl_pg_total.Background = gd_color
	lbl_pg_meta.Background = gd_color
	
	lbl_dt_inicio.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	lbl_dt_termino.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	lbl_pg_atual.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	lbl_pg_total.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	lbl_pg_meta.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	
	rot_dt_inicio.Gravity = g
	rot_dt_termino.Gravity = g
	rot_pg_atual.Gravity = g
	rot_pg_meta.Gravity = g
	rot_pg_total.Gravity = g	
	
	rot_dt_inicio.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	rot_dt_termino.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	rot_pg_atual.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	rot_pg_meta.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	rot_pg_total.Padding = Array As Int (25dip, 0dip, 0dip, 0dip)
	
	lbl_livro = Configura_label(nome_livro, Colors.Transparent, 13, Colors.Black)
	lbl_usuario = Configura_label(nome_usuario, Colors.Transparent, 13, Colors.Black)
	
	lbl_livro.Gravity = Gravity.CENTER
	lbl_usuario.Gravity = Gravity.CENTER
		
	dm.Initialize
	lbl.Initialize
	
	dm.esquerda = 1%x
	dm.tamanho = 98%x
	dm.topo = 1%y
	
	painel_imagem.Color = Colors.Cyan
		
	scrol.Panel.AddView(painel_imagem, dm.esquerda, dm.topo, dm.tamanho, 30%y)
	painel_imagem.LoadLayout("Lay_imagem_tela_detalhes")
	b4x_imagem.Load(File.DirAssets, "livro.jpg")
	b4x_imagem.ResizeMode = "FILL"
			
	dm.topo = dm.topo + painel_imagem.Height + 1dip
	scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.topo, dm.tamanho, 3%y)
	
	dm.topo = dm.topo + lbl_livro.Height + 1dip
	scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.topo, dm.tamanho, 3%y)
	
	dm.topo = dm.topo + lbl_usuario.Height + 1dip
	
	painel_botoes.Color = Colors.Transparent
	scrol.Panel.AddView(painel_botoes, 0%x, dm.topo, 100%x, 11%y)
	
	Dim largura As Int = 17%x	
	Dim esquerda As Int = 1.7%x
	
	esquerda = (100%x -((esquerda * 4) + (largura * 5))) / 2	
			
	For i = 0 To botoes.Length - 1
		
		botoes(i).Initialize("Event_botoes")
		botoes(i).Color = Colors.Cyan
		botoes(i).Background = Gradient_border(Colors.Cyan, Colors.Cyan, 60)
		botoes(i).Tag = i
		
		painel_botoes.AddView(botoes(i), esquerda, 0%y, largura, 10%y)
		
		esquerda = esquerda + botoes(i).Width + 1.7%x
	Next
	
	botoes(0).SetBackgroundImage(LoadBitmap(File.DirAssets, "bt_add_leitura.ico"))
	botoes(1).SetBackgroundImage(LoadBitmap(File.DirAssets, "bt_anotacao.ico"))
	botoes(2).SetBackgroundImage(LoadBitmap(File.DirAssets, "bt_editar.ico"))
	botoes(3).SetBackgroundImage(LoadBitmap(File.DirAssets, "img_bt_apagar.ico"))
	botoes(4).SetBackgroundImage(LoadBitmap(File.DirAssets, "img_historicos.ico"))
		
	dm.topo = dm.topo + painel_botoes.Height + 3%y
	panel_detalhes.Background = Gradient_border(Colors.RGB(239,239,239), Colors.RGB(239,239,239), 15)
	
	scrol.Panel.AddView(panel_detalhes, dm.esquerda, dm.topo, dm.tamanho, 60%y)
	
	panel_detalhes.AddView(rot_dt_inicio, dm.esquerda, 1%y, dm.tamanho, 4%y)
	panel_detalhes.AddView(lbl_dt_inicio, dm.esquerda, rot_dt_inicio.Height + rot_dt_inicio.Top,panel_detalhes.Width - 2%x , 6%y)
	
	panel_detalhes.AddView(rot_dt_termino, dm.esquerda, lbl_dt_inicio.Top + lbl_dt_inicio.Height + 1%y, dm.tamanho, 4%y)
	panel_detalhes.AddView(lbl_dt_termino, dm.esquerda, rot_dt_termino.Height + rot_dt_termino.Top,panel_detalhes.Width - 2%x , 6%y)
		
	panel_detalhes.AddView(rot_pg_atual, dm.esquerda, lbl_dt_termino.Top + lbl_dt_termino.Height + 1%y, dm.tamanho, 4%y)
	panel_detalhes.AddView(lbl_pg_atual, dm.esquerda, rot_pg_atual.Height + rot_pg_atual.Top,panel_detalhes.Width - 2%x , 6%y)
		
	panel_detalhes.AddView(rot_pg_total, dm.esquerda, lbl_pg_atual.Top + lbl_pg_atual.Height + 1%y, dm.tamanho, 4%y)
	panel_detalhes.AddView(lbl_pg_total, dm.esquerda, rot_pg_total.Height + rot_pg_total.Top, panel_detalhes.Width - 2%x , 6%y)
		
	panel_detalhes.AddView(rot_pg_meta, dm.esquerda, lbl_pg_total.Top + lbl_pg_total.Height + 1%y, dm.tamanho, 4%y)
	panel_detalhes.AddView(lbl_pg_meta, dm.esquerda, rot_pg_meta.Height + rot_pg_meta.Top, panel_detalhes.Width - 2%x , 6%y)
		
	dm.topo = dm.topo + panel_detalhes.Height + 15dip
	scrol.Panel.Height = dm.topo
End Sub

Sub Gradient_border(cor_1 As Int, cor_2 As Int, corner_radius As Int) As GradientDrawable
	 
	Dim g_p As GradientDrawable
	Dim cor_p(2) As Int
	cor_p(0) = cor_1
	cor_p(1) = cor_2
	g_p.Initialize("TOP_BOTTOM", cor_p)
	g_p.CornerRadius = corner_radius
	Return g_p
End Sub

Sub Configura_label(texto As String, cor_fundo As Int, fonte As Int, cor_texto As Int) As Label
	Dim label As Label
	
	label.Initialize("")
	
	label.Text = texto
	label.Color = cor_fundo
	label.TextSize = fonte
	label.TextColor = cor_texto
	
	Return label
End Sub

Sub Activity_Resume

	Dim cmd As String
	
	If Main.CadastrouAlgo Then
		seguro_cadastrou_algo = Main.CadastrouAlgo
		Main.CadastrouAlgo = False
				
		cmd = "exec sp_atualiza_leituras " & Main.Id_do_Usuario
		
		Try
			Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
			
			Result.NextRow
			
			
			If Result.GetString("RESULTADO") = 0 Then
				
				ToastMessageShow(Result.GetString("MENSAGEM"), True)
			else if Result.GetString("RESULTADO") = 2 Then
				
				If CodigoLancamentoLeitura.terminouLeitura Then
						
					painel_botoes.RemoveViewAt(0)
										
				End If
				
				ToastMessageShow(Result.GetString("MENSAGEM"), True)
			else if Result.GetString("RESULTADO") = 1 Then
				
				For i = 0 To Result.GetString("QUANTIDADE") - 1										
						
				 	If Result.GetInt("fk_id_livro") = id_livro Then
						
						lbl_dt_inicio.Text = Result.GetString("data_inicial")
						lbl_dt_termino.Text = Result.GetString("data_prevista_final")
						lbl_pg_atual.Text = Result.GetInt("paginas_ou_cap_lidos")
						lbl_pg_total.Text = Result.GetString("quantidade_paginas")
						lbl_pg_meta.Text = Result.GetString("meta")
						
						pg_meta = Result.GetString("meta")
						nome_usuario = Result.GetString("usuarioNome")
						pg_atual = Result.GetString("paginas_ou_cap_lidos")
						tipo_leitura = Result.GetString("tipo_de_leitura")
						pg_total = Result.GetString("quantidade_paginas")
						id_livro = Result.GetString("fk_id_livro")
						nome_livro = Result.GetString("nome")
					Else
						Result.NextRow
					End If					

				Next
			End If				
		Catch
			ToastMessageShow("Algo deu errado",True)
		End Try
			
	End If			
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Main.CadastrouAlgo = seguro_cadastrou_algo
	seguro_cadastrou_algo = False
End Sub


Sub bt_voltar_Click
	Activity.Finish
End Sub

Sub Event_botoes_Click
	Dim botao As Button
	Dim numero As Int
	botao.Initialize("")
	botao = Sender
	
	numero = botao.Tag
	If numero = 0 Then
		
		CodigoLancamentoLeitura.meta = pg_meta
		CodigoLancamentoLeitura.nomeUsuario = nome_usuario
		CodigoLancamentoLeitura.paginaAtual = pg_atual
		CodigoLancamentoLeitura.tipoLeitura = tipo_leitura
		CodigoLancamentoLeitura.totalPaginas = pg_total
		CodigoLancamentoLeitura.idLivro = id_livro
		CodigoLancamentoLeitura.tituloLivro = nome_livro
		
		StartActivity(CodigoLancamentoLeitura)
	End If
End Sub