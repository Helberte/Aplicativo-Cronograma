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
	Dim gradient As 					GradientDrawable
	Dim cores(2) As 					Int
	Dim botoes(5) As 					Button 
	
	Dim lbl_usuario As 					Label
	Dim lbl_livro	As					Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("Lay_detalhes_leituras")
	bt_voltar.SetBackgroundImage(LoadBitmap(File.DirAssets, "bt_voltar.png"))
	
	painel_imagem.Initialize( "" )
	lbl_livro.Initialize("")
	lbl_usuario.Initialize("")
	
	dm.Initialize
	lbl.Initialize
	
	dm.esquerda = 1%x
	dm.tamanho = 98%x
	dm.topo = 1%y
	
	cores(0) = Colors.Cyan
	cores(1) = Colors.Cyan	
	gradient.Initialize("TOP_BOTTOM", cores)
	gradient.CornerRadius = 60
	
	
	painel_imagem.Color = Colors.Cyan
		
	scrol.Panel.AddView(painel_imagem, dm.esquerda, dm.topo, dm.tamanho, 30%y)
	painel_imagem.LoadLayout("Lay_imagem_tela_detalhes")
		
	lbl_livro = Configura_label("Helberte costa", Colors.Transparent, 13, Colors.Black)
	lbl_usuario = Configura_label("As cronicas", Colors.Transparent, 13, Colors.Black)
	
	lbl_livro.Gravity = Gravity.CENTER
	lbl_usuario.Gravity = Gravity.CENTER
	
	dm.topo = dm.topo + painel_imagem.Height + 1dip
	scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.topo, dm.tamanho, 3%y)
	
	dm.topo = dm.topo + lbl_livro.Height + 1dip
	scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.topo, dm.tamanho, 3%y)
	
	dm.topo = dm.topo + lbl_usuario.Height + 1dip
	
	Dim largura As Int = 17%x
	
	Dim esquerda As Int = 1.5%x
	
	esquerda = (100%x -((esquerda * 4) + (largura * 5))) / 2
		
	For i = 0 To botoes.Length - 1
		
		botoes(i).Initialize("Event_botoes")
		botoes(i).Color = Colors.Cyan
		botoes(i).Background = gradient
		
		scrol.Panel.AddView(botoes(i), esquerda, dm.topo, largura, 10%y)
		
		esquerda = esquerda + botoes(i).Width + 1.5%x
	Next	
	
	
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

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub bt_voltar_Click
	Activity.Finish
End Sub