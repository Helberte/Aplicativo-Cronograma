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

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Globals
	
	Private edTituloLivro As EditText
	Private radPagina As RadioButton
	Private radCapitulo As RadioButton
	Private edQuantPagOuCap As EditText
	Private lblMeta As Label
	Private edMeta As EditText
	Private hoje As String
	
	Private lblPrevisao As Label
	Private lblQuantidadeDias As Label
	Private btAddFoto As Button
	Private B4XImageView1 As B4XImageView
	Private lblFotoLivro As Label
	Private edAutorLivro As EditText
	Private dataPrevistaFinal As String
	
	Private banco As ClassBancoDados
	DateTime.DateFormat = "dd/MM/yyy"
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("LayCadastroLivro")
	
	Main.fotos.Initialize("ContentChooser")
	
	edTituloLivro.RequestFocus
	radPagina.Checked = True
	
	edQuantPagOuCap.Hint = "Quantidade páginas"
	lblMeta.Text = "Meta - Quantas páginas ler por dia?"
	edMeta.Hint = "Quantidade de páginas"
	
	hoje = "Dia: " & DateTime.Date(DateTime.Now)
	
	lblPrevisao.Text = hoje
	
	lblQuantidadeDias.Visible = False
	
	B4XImageView1.ResizeMode = "FILL"
	B4XImageView1.Load(File.DirAssets, "livro.jpg")
	
	banco.Initialize
End Sub


Sub radPagina_CheckedChange(Checked As Boolean)	
	If Checked Then
		edQuantPagOuCap.Hint = "Quantidade páginas"
		lblMeta.Text = "Meta - Quantas páginas ler por dia?"
		edMeta.Hint = "Quantidade de páginas"
	Else
		edQuantPagOuCap.Hint = "Quantidade capítulos"
		lblMeta.Text = "Meta - Quantos capítulos ler por dia?"
		edMeta.Hint = "Quantidade de capítulos"
	End If	
End Sub

Sub radCapitulo_CheckedChange(Checked As Boolean)
	If Checked Then
		edQuantPagOuCap.Hint = "Quantidade capítulos"
		lblMeta.Text = "Meta - Quantos capítulos ler por dia?"
		edMeta.Hint = "Quantidade de capítulos"
	Else				
		edQuantPagOuCap.Hint = "Quantidade páginas"
		lblMeta.Text = "Meta - Quantas páginas ler por dia?"
		edMeta.Hint = "Quantidade de páginas"
	End If
End Sub

Sub edMeta_TextChanged (Old As String, New As String)
	
	If edMeta.Text.Trim <> "" Then
		
		Dim meta As Int = New
		Dim total As Int
		Dim quantPag As Int
		
		If edQuantPagOuCap.Text.Trim <> "" Then
			
			quantPag = edQuantPagOuCap.Text
			
			total = quantPag  / meta
			
			lblQuantidadeDias.Visible = True
			lblQuantidadeDias.Text = "Total de dias: " & total
			
			Dim data As String = DateTime.Date( DateTime.Add(DateTime.Now, 0,0,total))
							
			dataPrevistaFinal = data
			
			lblPrevisao.Text = data
		Else
			lblPrevisao.Text = hoje
			lblQuantidadeDias.Visible = False
		End If
			
	Else
		lblPrevisao.Text = hoje		
		lblQuantidadeDias.Visible = False
	End If	
End Sub

Sub edQuantPagOuCap_TextChanged (Old As String, New As String)
	
	If edMeta.Text.Trim <> "" Then
		
		Dim meta As Int 
		meta = edMeta.Text
		
		Dim total As Int
		Dim quantPag As Int
		
		If edQuantPagOuCap.Text.Trim <> "" Then
			
			quantPag = New
			
			total = quantPag  / meta
			
			lblQuantidadeDias.Visible = True
			lblQuantidadeDias.Text = "Total de dias: " & total
			
			Dim data As String = DateTime.Date( DateTime.Add(DateTime.Now, 0,0,total))
			
			dataPrevistaFinal = data
			
			lblPrevisao.Text = data
		Else
			lblPrevisao.Text = hoje
			lblQuantidadeDias.Visible = False
		End If
					
	Else
		lblPrevisao.Text = hoje
		lblQuantidadeDias.Visible = False
	End If	
End Sub

Sub btAddFoto_Click
	Try
		Main.fotos.Show("image/*", "Choose image")				
	Catch
		ToastMessageShow("Falha!",True)
	End Try	
End Sub

Sub ContentChooser_Result (Success As Boolean, Dir As String, FileName As String)
	If Success Then	
		B4XImageView1.ResizeMode = "FIT"
		
		B4XImageView1.Load(Dir, FileName)
		lblFotoLivro.Visible = False
	Else
		ToastMessageShow("Nenhuma foto escolhida",True)
	End If
End Sub

Sub edTituloLivro_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edTituloLivro.Text = edTituloLivro.Text.Replace("'","")
	End If
End Sub

Sub edAutorLivro_TextChanged (Old As String, New As String)
	If New.IndexOf("'") >= 0 Then
		edAutorLivro.Text = edAutorLivro.Text.Replace("'","")
	End If
End Sub

Sub btCancelar_Click
	StartActivity(CodigoLayLeituras)
	Activity.Finish	
End Sub

Sub btSalvar_Click
	Dim pag_ou_cap As String
	
	If edTituloLivro.Text.Trim = "" Then
		MsgboxAsync("Opa! qual o título do livro?","Calma...")
		edTituloLivro.RequestFocus
	Else If edAutorLivro.Text.Trim = "" Then
		MsgboxAsync("Opa! qual o nome do autor do livro?","Calma...")
		edAutorLivro.RequestFocus
	Else
		
		pag_ou_cap = "Quantos capítulos"		
		If radPagina.Checked Then pag_ou_cap = "Quantas páginas"
		
		If edQuantPagOuCap.Text.Trim = "" Then
			MsgboxAsync("Opa! " & pag_ou_cap & " o livro tem?","Calma...")
			edQuantPagOuCap.RequestFocus
			
		else If edMeta.Text.Trim = "" Then
		
			MsgboxAsync("Opa! qual a sua meta diária?","Calma...")
			edMeta.RequestFocus
		Else
			Dim meta, quantidade_pag_cap As Int
			
			meta = edMeta.Text
			quantidade_pag_cap = edQuantPagOuCap.Text
			
			If meta > quantidade_pag_cap Then
				ToastMessageShow("Informações incoerentes",True)
			Else
				
				Try
					Dim cmd, dataInicial, tipoLeitura As String
			
					tipoLeitura = "páginas"
					If radCapitulo.Checked Then tipoLeitura = "capítulos"
								
					dataInicial = DateTime.Date(DateTime.Now)
			
					cmd = "exec sp_cad_livro_leitura '" & edTituloLivro.Text & _
												  "', '" & edAutorLivro.Text & _
												  "', '" & Main.Id_do_Usuario & _
												  "', '" & dataInicial & _
												  "', '" & tipoLeitura & _
												  "', '" & edQuantPagOuCap.Text & _
												  "', '" & dataPrevistaFinal & _
												  "', '" & edMeta.Text & "'"
			
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
End Sub