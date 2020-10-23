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

	'Deixar texto em italico via linha de código
	'https://www.b4x.com/android/forum/threads/how-do-i-set-an-edittext-view-to-italic.123206/

	'Definir texto no centro
	'https://www.b4x.com/android/forum/threads/centering-text-in-label-programmatically.100900/
	'Dim lblCard1 As B4XView 'in Globals
	'lblCard1.SetTextAlignment("CENTER", "CENTER")
	'lblCard1.Gravity = Gravity.CENTER
	'lblDadosLivro.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL)
	
Sub Globals	
	Dim painelImagem As			 			Panel
	Dim panelCabecalho As 					Panel
	Dim panelEdAutorLivro As 				Panel
	Dim panelMeta As 						Panel
	Dim panelDataPrevistaFim As 			Panel
	Dim panelEdTituloLivro As 				Panel
	Dim panelEdPaginasOuCap As 				Panel
	Dim panelEdits As 						Panel
	
	Dim lblDadosLivro As 					Label
	Dim lblTipoLeitura As 					Label
	Dim lblMeta As 							Label
	Dim lblPrevisaoTermino As 				Label
	Dim lblMaximoDigitosTitulo As 			Label
	Dim lblMaximoDigitosAutor As 			Label
	Dim lblMaximoDigitosPagOuCap As			Label
	Dim lblMaximoDigitosMetaPagOuCap  As	Label
	Dim lblIncongruenciaTitulo As			Label
	Dim lblIncongruenciaAutor As			Label
	Dim lblIncongruenciaMetaPagOuCap As		Label
	Dim lblIncongruenciaPagOuCap As			Label	
	Private lblDataPrevisao As			 	Label
	Private lblQuantidadeDias As 			Label
	
	Dim btCancelar As 						Button
	Dim btSalvar As 						Button	
	Dim btAddFoto As 						Button	

	Dim radPagina As 						RadioButton
	Dim radCapitulo As 						RadioButton	
		
	Dim scrol As 							ScrollView
	Private B4XImagem As 					B4XImageView
	Private edB4XFloatNomeLivro As 			B4XFloatTextField		
	Private edB4XFloatPagOuCap As 			B4XFloatTextField
	Private edB4XFloatAutorLivro As	 		B4XFloatTextField
	Private edB4XFloatMetaPagCap As 		B4XFloatTextField
	
	Dim banco As 							ClassBancoDados		
	
	DateTime.DateFormat = "dd/MM/yyy"
	Type edit (tamanho As Int, esquerda As Int, topo As Int)
	Type rotuloDimencoes (tamanho As Int, esquerda As Int)
	Dim rotulo As 							rotuloDimencoes
	Dim edit As 							edit
	Dim negritoItalico As Typeface
	Dim hoje As 							String
	Private dataPrevistaFinal As 			String
	
	Dim txt_titulo_invalido As					Boolean = False
	Dim txt_Autor_invalido As					Boolean = False
	Dim txt_PagOuCap_invalido As				Boolean = False
	Dim txt_MetaPagOuCap_invalido As			Boolean = False
End Sub

Sub Activity_Create(FirstTime As Boolean)	
	Activity.LoadLayout("Lay_TelaCadastro")
		
	'INICIALIZAÇÕES E CONFIGURAÇÕES DOS COMPONENTES
		
	negritoItalico = negritoItalico.CreateNew(Typeface.DEFAULT_BOLD, Typeface.STYLE_ITALIC)
	banco.Initialize	
	
	painelImagem.Initialize("")
	panelCabecalho.Initialize ("")
	panelEdTituloLivro.Initialize("")
	panelEdAutorLivro.Initialize("")
	panelEdPaginasOuCap.Initialize("")
	panelMeta.Initialize("")
	panelDataPrevistaFim.Initialize("")
	panelEdits.Initialize("")
				
	lblDadosLivro.Initialize("")
	lblTipoLeitura.Initialize("")
	lblMeta.Initialize("")
	lblPrevisaoTermino.Initialize("")
	lblMaximoDigitosTitulo.Initialize("")
	lblMaximoDigitosAutor.Initialize("")
	lblMaximoDigitosPagOuCap.Initialize("")
	lblMaximoDigitosMetaPagOuCap.Initialize("")
	lblIncongruenciaTitulo.Initialize("")
	lblIncongruenciaAutor.Initialize("")
	lblIncongruenciaMetaPagOuCap.Initialize("")
	lblIncongruenciaPagOuCap.Initialize("")
	
	lblDadosLivro.Color = Colors.Transparent
	lblDadosLivro.Text = "Dados do Livro"
	lblDadosLivro.TextColor = Colors.Black
	lblDadosLivro.TextSize = 17
	lblDadosLivro.Typeface = negritoItalico
	lblDadosLivro.Gravity = Gravity.CENTER
	
	lblTipoLeitura.Color = Colors.Transparent
	lblTipoLeitura.Text = "Tipo de leitura"
	lblTipoLeitura.TextColor = Colors.Black
	lblTipoLeitura.TextSize = 17	
	lblTipoLeitura.Typeface = negritoItalico
	lblTipoLeitura.Gravity = Gravity.CENTER
	
	lblMeta.Color = Colors.Transparent
	lblMeta.Text = "Meta - Quantas páginas / cap ler por dia?"
	lblMeta.TextColor = Colors.Black
	lblMeta.TextSize = 17		
	lblMeta.Typeface = negritoItalico
	lblMeta.Gravity = Gravity.CENTER
	
	lblPrevisaoTermino.Color = Colors.Transparent
	lblPrevisaoTermino.Text = "Previsão para término"
	lblPrevisaoTermino.TextColor = Colors.Black
	lblPrevisaoTermino.TextSize = 17	
	lblPrevisaoTermino.Typeface = negritoItalico
	lblPrevisaoTermino.Gravity = Gravity.CENTER
	
	btCancelar.Initialize ("Event_btCancelar")
	btSalvar.Initialize("Event_btSalvar")	
	btAddFoto.Initialize("")
	
	btCancelar.Color = Colors.Transparent
	btCancelar.Text = "CANCELAR"
	btCancelar.TextSize = 19
	btCancelar.Typeface = Typeface.DEFAULT_BOLD
	
	btSalvar.Color = Colors.Transparent
	btSalvar.Text = "SALVAR"
	btSalvar.TextSize = 19
	btSalvar.Typeface = Typeface.DEFAULT_BOLD
	
	radPagina.Initialize("radPagina")
	radCapitulo.Initialize("radCapitulo")
	radPagina.Checked = True
	
	radPagina.Text = "Por página"
	radPagina.TextColor = Colors.RGB(83,0,0)
	radPagina.TextSize = 16
	radPagina.Gravity = Gravity.CENTER
	
	radCapitulo.Text = "Por capítulo"
	radCapitulo.TextColor = Colors.RGB(83,0,0)
	radCapitulo.TextSize = 16
	radCapitulo.Gravity = Gravity.CENTER
	
	lblMaximoDigitosTitulo.Text = "0/100 "
	lblMaximoDigitosAutor.Text = "0/100 "
	lblMaximoDigitosPagOuCap.Text = "0/4 "
	lblMaximoDigitosMetaPagOuCap.Text = "0/4 "
	
	lblMaximoDigitosTitulo.Visible = False
	lblMaximoDigitosAutor.Visible = False
	lblMaximoDigitosPagOuCap.Visible = False
	lblMaximoDigitosMetaPagOuCap.Visible = False
		
	lblMaximoDigitosTitulo.TextColor = Colors.Black
	lblMaximoDigitosAutor.TextColor = Colors.Black
	lblMaximoDigitosPagOuCap.TextColor = Colors.Black
	lblMaximoDigitosMetaPagOuCap.TextColor = Colors.Black
	
	lblIncongruenciaAutor.TextColor = Colors.Red
	lblIncongruenciaMetaPagOuCap.TextColor = Colors.Red
	lblIncongruenciaPagOuCap.TextColor = Colors.Red
	lblIncongruenciaTitulo.TextColor = Colors.Red
	
	lblIncongruenciaAutor.Visible = False
	lblIncongruenciaMetaPagOuCap.Visible = False
	lblIncongruenciaPagOuCap.Visible = False
	lblIncongruenciaTitulo.Visible = False
	
	scrol.Initialize( 500 )
	Main.fotos.Initialize("CC")
	
	Dim etiqueta As Label
	etiqueta.Initialize("")
	
	edit.Initialize
	rotulo.Initialize
	
	
	'INCERÇÕES NA ATIVIDADE E DENTRO DO SCROL
	
	panelCabecalho.Color = Colors.RGB(0,165,255)
	Activity.AddView(panelCabecalho, 0%x, 0%y, 100%x, 10%y)	
			
	panelCabecalho.AddView(btCancelar, 1%x,  1%y, 35%x, 7%y)
	Dim btSalvarEsquerda As Int = 100%x - btCancelar.Width - btCancelar.Left
	panelCabecalho.AddView(btSalvar, btSalvarEsquerda, 1%y, 35%x, 7%y)
			
	scrol.Color = Colors.Cyan
	scrol.Panel.Color = Colors.RGB(223,223,223)
	
	Dim topoScrol As Int = panelCabecalho.Top + panelCabecalho.Height
	Activity.AddView(scrol, 0%x, topoScrol , 100%x, 100%y - topoScrol)	
	
	scrol.Panel.AddView(lblDadosLivro, 0%x, 0%y, 100%x, 5%y)
	
	painelImagem.Width = 98%x
	
	edit.esquerda = (100%x - painelImagem.Width) / 2
	edit.tamanho =  painelImagem.Width

	scrol.Panel.AddView(painelImagem, edit.esquerda , lblDadosLivro.Top + lblDadosLivro.Height, 98%x, 30%y)
	
	painelImagem.LoadLayout("Lay_Imagem")
	
	B4XImagem.ResizeMode = "FILL"
	B4XImagem.Load(File.DirAssets, "livro.jpg")
	
	scrol.Panel.Height = painelImagem.Top + painelImagem.Height
	
	scrol.Panel.AddView(panelEdits, edit.esquerda, painelImagem.Top + painelImagem.Height + 5dip, edit.tamanho, 8%y)
	panelEdits.LoadLayout("Lay_edTituloLivro")
	
	scrol.Panel.Height = panelEdits.Top + panelEdits.Height
		
	Dim tamanhoLabelObrigatorio As Int = (100%x / 2) - edit.esquerda
	
	rotulo.esquerda =  edit.esquerda + tamanhoLabelObrigatorio
	rotulo.tamanho = panelEdits.Width - tamanhoLabelObrigatorio

	lblIncongruenciaTitulo.Text = "Obrigatório"
	AddLabel(Gravity.LEFT, lblIncongruenciaTitulo, panelEdits.Top + panelEdits.Height, edit.esquerda, tamanhoLabelObrigatorio)
	etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigitosTitulo, panelEdits.Top + panelEdits.Height, rotulo.esquerda, rotulo.tamanho)
	scrol.Panel.Height = etiqueta.Top + etiqueta.Height	
	
	scrol.Panel.AddView(panelEdAutorLivro, edit.esquerda, etiqueta.Top + etiqueta.Height + 5dip, edit.tamanho, 8%y)
	panelEdAutorLivro.LoadLayout("Lay_edAutorLivro")
	
	lblIncongruenciaAutor.Text = "Obrigatório"
	AddLabel(Gravity.LEFT, lblIncongruenciaAutor,panelEdAutorLivro.Top + panelEdAutorLivro.Height, edit.esquerda,tamanhoLabelObrigatorio)
	etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigitosAutor, panelEdAutorLivro.Top + panelEdAutorLivro.Height, rotulo.esquerda, rotulo.tamanho)
	scrol.Panel.Height = etiqueta.Top + etiqueta.Height	
	
	scrol.Panel.AddView(lblTipoLeitura, 0%x, lblMaximoDigitosAutor.Top + lblMaximoDigitosAutor.Height + 5dip, 100%x, 5%y)
	scrol.Panel.Height = lblTipoLeitura.Top + lblTipoLeitura.Height
	
	scrol.Panel.AddView(radPagina, 0%x , lblTipoLeitura.Top + lblTipoLeitura.Height + 5dip, 50%x, 5%y)

	scrol.Panel.AddView(radCapitulo, radPagina.Width, lblTipoLeitura.Top + lblTipoLeitura.Height + 5dip, 50%x, 5%y)
	scrol.Panel.Height = radPagina.Top + radPagina.Height
	 
	scrol.Panel.AddView(panelEdPaginasOuCap, edit.esquerda, radCapitulo.Top + radCapitulo.Height + 5dip, edit.tamanho, 8%y)
	panelEdPaginasOuCap.LoadLayout("Lay_edPagOuCapitulo")
			
	lblIncongruenciaPagOuCap.Text = "Obrigatório"
	AddLabel(Gravity.LEFT, lblIncongruenciaPagOuCap, panelEdPaginasOuCap.Top + panelEdPaginasOuCap.Height, edit.esquerda, tamanhoLabelObrigatorio)
	etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigitosPagOuCap, panelEdPaginasOuCap.Top + panelEdPaginasOuCap.Height, rotulo.esquerda, rotulo.tamanho)
	scrol.Panel.Height = etiqueta.Top + etiqueta.Height 
	
	scrol.Panel.AddView(lblMeta, 0%x, etiqueta.Top + etiqueta.Height + 5dip, 100%x, 5%y)
	scrol.Panel.Height = lblMeta.Top + lblMeta.Height
	
	scrol.Panel.AddView(panelMeta, edit.esquerda, lblMeta.Top + lblMeta.Height + 5dip, edit.tamanho, 8%y)
	panelMeta.LoadLayout("Lay_edMetaPagCap")
		
	lblIncongruenciaMetaPagOuCap.Text = "Obrigatório"
	AddLabel(Gravity.LEFT, lblIncongruenciaMetaPagOuCap, panelMeta.Top + panelMeta.Height, edit.esquerda, tamanhoLabelObrigatorio)
	etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigitosMetaPagOuCap, panelMeta.Top + panelMeta.Height, rotulo.esquerda, rotulo.tamanho)
	scrol.Panel.Height = etiqueta.Top + etiqueta.Height
	
	scrol.Panel.AddView(lblPrevisaoTermino, 0%x, etiqueta.Top + etiqueta.Height + 5dip, 100%x, 5%y)
	scrol.Panel.Height = lblPrevisaoTermino.Top + lblPrevisaoTermino.Height
	
	panelDataPrevistaFim.Color = Colors.Blue	
	scrol.Panel.AddView(panelDataPrevistaFim, edit.esquerda, lblPrevisaoTermino.Top + lblPrevisaoTermino.Height + 5dip, panelEdits.Width, 15%y)
	panelDataPrevistaFim.LoadLayout("Lay_Previsao_termino")
	scrol.Panel.Height = panelDataPrevistaFim.Top + panelDataPrevistaFim.Height + 10dip

	hoje = "Dia: " & DateTime.Date(DateTime.Now)
	lblDataPrevisao.Text = hoje
	
	lblQuantidadeDias.Visible = False	
End Sub

Sub AddLabel(gravidade As Object, etiqueta As Label, topo As Int, esquerda As Int, tamanho As Int) As Label
	
	etiqueta.Gravity = Bit.Or(gravidade, Gravity.CENTER_VERTICAL)
	etiqueta.Color = Colors.Transparent
	
	scrol.Panel.AddView(etiqueta, esquerda, topo, tamanho, 4%y)
	Return etiqueta
End Sub

Sub Activity_Resume
	btCancelar.Top = -5%y
	btCancelar.TextColor = Colors.Transparent	
	btCancelar.SetLayoutAnimated(1000, 1%x, 1%y, 35%x, 7%y)
	btCancelar.SetTextColorAnimated(1500, Colors.RGB(213,4,4))
	
	btSalvar.Top = -5%y
	btSalvar.TextColor = Colors.Transparent
	btSalvar.SetLayoutAnimated(1000, 100%x - btSalvar.Width - btCancelar.Left, btCancelar.Top, btCancelar.Width, btCancelar.Height)
	btSalvar.SetTextColorAnimated(1500, Colors.RGB(213,4,4))
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)	
End Sub


Sub Event_btCancelar_Click
	btCancelar.SetColorAnimated(100, Colors.RGB(82,183,239), Colors.Transparent)	
	StartActivity(CodigoLayLeituras)
	Activity.Finish
End Sub

Sub Event_btSalvar_Click
	btSalvar.SetColorAnimated(100, Colors.RGB(82,183,239), Colors.Transparent)
	
	Dim pag_ou_cap As String
	
	If VerificaTamanhoTexto Then
		
		If edB4XFloatNomeLivro.Text.Trim = "" Then
			MsgboxAsync("Opa! qual o título do livro?","Calma...")
			TextoObrigatorio
		Else If edB4XFloatAutorLivro.Text.Trim = "" Then
			MsgboxAsync("Opa! qual o nome do autor do livro?","Calma...")
			TextoObrigatorio
		Else
			
			pag_ou_cap = "Quantos capítulos"
			If radPagina.Checked Then pag_ou_cap = "Quantas páginas"
			
			If edB4XFloatPagOuCap.Text.Trim = "" Then
				MsgboxAsync("Opa! " & pag_ou_cap & " o livro tem?","Calma...")
				TextoObrigatorio
				
			else If edB4XFloatMetaPagCap.Text.Trim = "" Then
			
				MsgboxAsync("Opa! qual a sua meta diária?","Calma...")
				TextoObrigatorio
			Else
				Dim meta, quantidade_pag_cap As Int
				
				meta = edB4XFloatMetaPagCap.Text
				quantidade_pag_cap = edB4XFloatPagOuCap.Text
				
				Dim cmd, dataInicial, tipoLeitura As String
				
				tipoLeitura = "páginas"
				If radCapitulo.Checked Then tipoLeitura = "capítulos"
				
				If meta > quantidade_pag_cap Then
					ToastMessageShow("Sua meta é maior que o n° de " & tipoLeitura,True)
				Else
					
					Try						
									
						dataInicial = DateTime.Date(DateTime.Now)
						
						cmd = "exec sp_cad_livro_leitura '" & edB4XFloatNomeLivro.Text & _
													  "', '" & edB4XFloatAutorLivro.Text & _
													  "', '" & Main.Id_do_Usuario & _
													  "', '" & dataInicial & _
													  "', '" & tipoLeitura & _
													  "', '" & edB4XFloatPagOuCap.Text & _
													  "', '" & dataPrevistaFinal & _
													  "', '" & edB4XFloatMetaPagCap.Text & "'"
				
						Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
				
						Result.NextRow
				
						If Result.GetString("RESULTADO") = 1 Then
							
							Main.CadastrouAlgo = True
							ToastMessageShow(Result.GetString("MENSAGEM"), True)
							Sleep(100)
							StartActivity(CodigoLayLeituras)
							Activity.Finish
					
						else if Result.GetString("RESULTADO") = 0 Then
							
							Main.CadastrouAlgo = False
							MsgboxAsync(Result.GetString("MENSAGEM"), "Ops!!")
							Sleep(1000)
							StartActivity(CodigoLayLeituras)
							Activity.Finish
						End If
				
					Catch
						MsgboxAsync("Problemas ao tentar estabelecer a conexão. " & LastException,"Atenção")
					End Try
				End If
			End If
		End If
		
	Else
		ToastMessageShow("Informações incoerentes",True)
	End If		
End Sub

Sub btAddImagem_Click
	Try
		Main.fotos.Show("image/*", "Choose image")
	Catch
		ToastMessageShow("Falha!",True)
	End Try
End Sub

Sub CC_Result (Success As Boolean, Dir As String, FileName As String)
	If Success Then
		B4XImagem.ResizeMode = "FIT"
		
		B4XImagem.Load(Dir, FileName)
		'lblFotoLivro.Visible = False
	Else
		ToastMessageShow("Nenhuma foto escolhida",True)
	End If
End Sub

Sub radPagina_CheckedChange(Checked As Boolean)
	If Checked Then
		lblMeta.Text = "Meta - Quantas páginas ler por dia?"
	Else
		lblMeta.Text = "Meta - Quantos capítulos ler por dia?"
	End If
End Sub

Sub radCapitulo_CheckedChange(Checked As Boolean)
	If Checked Then
		lblMeta.Text = "Meta - Quantos capítulos ler por dia?"
	Else
		lblMeta.Text = "Meta - Quantas páginas ler por dia?"
	End If
End Sub

Sub edB4XFloatAutorLivro_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edB4XFloatAutorLivro.Text = edB4XFloatAutorLivro.Text.Replace("'","")
	End If
	
	If New.Length > 100 Then
		lblIncongruenciaAutor.Visible = True
		lblIncongruenciaAutor.Text = " Texto inválido"
		lblMaximoDigitosAutor.TextColor = Colors.Red
		txt_Autor_invalido = True
	Else
		lblIncongruenciaAutor.Visible = False
		lblMaximoDigitosAutor.TextColor = Colors.Black
		txt_Autor_invalido = False
	End If
	lblMaximoDigitosAutor.Text = New.Length & "/100 "
End Sub

Sub edB4XFloatNomeLivro_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edB4XFloatNomeLivro.Text = edB4XFloatNomeLivro.Text.Replace("'","")
	End If
	
	If New.Length > 100 Then
		lblIncongruenciaTitulo.Visible = True
		lblIncongruenciaTitulo.Text = " Texto inválido"
		lblMaximoDigitosTitulo.TextColor = Colors.Red
		txt_titulo_invalido = True
	Else
		lblIncongruenciaTitulo.Visible = False
		lblMaximoDigitosTitulo.TextColor = Colors.Black
		txt_titulo_invalido = False
	End If
	
	lblMaximoDigitosTitulo.Text = New.Length & "/100 "			
	
End Sub

Sub edB4XFloatMetaPagCap_TextChanged (Old As String, New As String)
	
	lblMaximoDigitosMetaPagOuCap.Text = New.Length & "/4 "
	
	If edB4XFloatMetaPagCap.Text.Trim <> "" Then
		
		Dim meta As Int = New
		Dim total As Int
		Dim quantPag As Int
		
		If edB4XFloatPagOuCap.Text.Trim <> "" Then
			
			quantPag = edB4XFloatPagOuCap.Text
			
			total = quantPag  / meta
			
			lblQuantidadeDias.Visible = True
			lblQuantidadeDias.Text = "Total de dias: " & total
			
			Dim data As String = DateTime.Date( DateTime.Add(DateTime.Now, 0,0,total))
							
			dataPrevistaFinal = data
			
			lblDataPrevisao.Text = "Dia: " & data
		Else
			lblDataPrevisao.Text = hoje
			lblQuantidadeDias.Visible = False
		End If
			
	Else
		lblDataPrevisao.Text = hoje
		lblQuantidadeDias.Visible = False
	End If
	
	If New.Length > 4 Then
		lblIncongruenciaMetaPagOuCap.Visible = True
		lblIncongruenciaMetaPagOuCap.Text = " Texto inválido"
		lblMaximoDigitosMetaPagOuCap.TextColor = Colors.Red
		txt_MetaPagOuCap_invalido = True
	Else
		lblIncongruenciaMetaPagOuCap.Visible = False
		lblMaximoDigitosMetaPagOuCap.TextColor = Colors.Black
		txt_MetaPagOuCap_invalido = False
	End If
End Sub

Sub edB4XFloatPagOuCap_TextChanged (Old As String, New As String)
	
	lblMaximoDigitosPagOuCap.Text = New.Length & "/4 "
	
	If edB4XFloatMetaPagCap.Text.Trim <> "" Then
		
		Dim meta As Int
		meta = edB4XFloatMetaPagCap.Text
		
		Dim total As Int
		Dim quantPag As Int
		
		If edB4XFloatPagOuCap.Text.Trim <> "" Then
			
			quantPag = New
			
			total = quantPag  / meta
			
			lblQuantidadeDias.Visible = True
			lblQuantidadeDias.Text = "Total de dias: " & total
			
			Dim data As String = DateTime.Date( DateTime.Add(DateTime.Now, 0,0,total))
			
			dataPrevistaFinal = data
			
			lblDataPrevisao.Text = "Dia: " & data
		Else
			lblDataPrevisao.Text = hoje
			lblQuantidadeDias.Visible = False
		End If
					
	Else
		lblDataPrevisao.Text = hoje
		lblQuantidadeDias.Visible = False
	End If
	
	If New.Length > 4 Then
		lblIncongruenciaPagOuCap.Visible = True
		lblIncongruenciaPagOuCap.Text = " Texto inválido"
		lblMaximoDigitosPagOuCap.TextColor = Colors.Red
		txt_PagOuCap_invalido = True
	Else
		lblIncongruenciaPagOuCap.Visible = False
		lblMaximoDigitosPagOuCap.TextColor = Colors.Black
		txt_PagOuCap_invalido = False
	End If
End Sub

Sub edB4XFloatNomeLivro_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		lblMaximoDigitosTitulo.Visible = True
	Else		
		If lblIncongruenciaTitulo.Visible = False Or txt_titulo_invalido = False Then
			lblMaximoDigitosTitulo.Visible = False
		End If
	End If
End Sub

Sub edB4XFloatAutorLivro_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		lblMaximoDigitosAutor.Visible = True
	Else
		If lblIncongruenciaAutor.Visible = False Or txt_Autor_invalido = False Then
			lblMaximoDigitosAutor.Visible = False
		End If		
	End If
End Sub

Sub edB4XFloatPagOuCap_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		lblMaximoDigitosPagOuCap.Visible = True
	Else
		If lblIncongruenciaPagOuCap.Visible = False Or txt_PagOuCap_invalido = False Then
			lblMaximoDigitosPagOuCap.Visible = False
		End If		
	End If
End Sub

Sub edB4XFloatMetaPagCap_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		lblMaximoDigitosMetaPagOuCap.Visible = True
	Else
		If lblIncongruenciaMetaPagOuCap.Visible = False Or txt_MetaPagOuCap_invalido = False Then
			lblMaximoDigitosMetaPagOuCap.Visible = False
		End If		
	End If
End Sub

Sub TextoObrigatorio
	lblIncongruenciaAutor.Text = " Texto obrigatório"
	lblIncongruenciaTitulo.Text = " Texto obrigatório"
	lblIncongruenciaPagOuCap.Text = " Quantidade obrigatória"
	lblIncongruenciaMetaPagOuCap.Text = " Quantidade obrigatória"
	
	If edB4XFloatAutorLivro.Text.Trim = "" Then
		lblIncongruenciaAutor.Visible = True 
	Else 
		lblIncongruenciaAutor.Visible = False
	End If
	
	If edB4XFloatNomeLivro.Text.Trim = "" Then
		lblIncongruenciaTitulo.Visible = True 
	Else 
		lblIncongruenciaTitulo.Visible = False
	End If
	
	If edB4XFloatPagOuCap.Text.Trim = "" Then
		lblIncongruenciaPagOuCap.Visible = True 
	Else 
		lblIncongruenciaPagOuCap.Visible = False
	End If
	
	If edB4XFloatMetaPagCap.Text.Trim = "" Then
		lblIncongruenciaMetaPagOuCap.Visible = True 
	Else 
		lblIncongruenciaMetaPagOuCap.Visible = False
	End If
End Sub


Sub VerificaTamanhoTexto As Boolean
	
	If edB4XFloatNomeLivro.Text.Length > 100 Then Return False
	If edB4XFloatAutorLivro.Text.Length > 100 Then Return False
	If edB4XFloatPagOuCap.Text.Length > 4 Then Return False
	If edB4XFloatMetaPagCap.Text.Length > 4 Then Return False
	Return True	
End Sub