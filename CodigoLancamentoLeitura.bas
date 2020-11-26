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
	Public tituloLivro As String
	Public nomeUsuario As String
	Public paginaAtual As Int
	Public totalPaginas As Int
	Public meta As Int
	Public idLivro As Int
	Public tipoLeitura As String
	Public terminouLeitura As Boolean = False
	Public de_os_parabens As Boolean = False
End Sub

Sub Globals

	Private lblTituloLivro As Label
	Private lblNomeUsuario As Label
	Private edPaginaAtual As EditText
	Private edTotalPaginas As EditText
	Private lblPorcentagem As Label
	Private b4XImageViewFoto As B4XImageView
	Private lblIvalido As Label
	Private lblPaginaAtual As Label
	Private lblPrevisaoPorcentagem As Label
	Private btOk As Button
	Dim banco As ClassBancoDados
	Private lblTotalPaginas As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)	
	Activity.LoadLayout("Lay_lancamento_leitura")
		
	b4XImageViewFoto.ResizeMode = "FILL"
	b4XImageViewFoto.Load(File.DirAssets, "livro.jpg")
		
	lblTituloLivro.Text = tituloLivro
	lblNomeUsuario.Text = nomeUsuario
	edTotalPaginas.Text = totalPaginas
	
	Dim p As Int
	
	p = (paginaAtual * 100) / totalPaginas
	lblPorcentagem.Text = p & " % Lidos"
	
	If paginaAtual + meta > totalPaginas Then
		edPaginaAtual.Text = totalPaginas
		p = (totalPaginas * 100) / totalPaginas
		lblPrevisaoPorcentagem.Text = "Próximo avanço " & p & "%"
	Else
		edPaginaAtual.Text = paginaAtual + meta
		p = ((paginaAtual + meta) * 100) / totalPaginas
		lblPrevisaoPorcentagem.Text = "Próximo avanço " & p & "%"
	End If	
			
	If tipoLeitura = "capítulos" Then
		lblPaginaAtual.Text = "Capítulo atual"
		lblTotalPaginas.Text = "Total capítulos"
	else if tipoLeitura = "páginas" Then
		lblPaginaAtual.Text = "Página atual"
		lblTotalPaginas.Text = "Total páginas"
	End If
	
	edPaginaAtual.RequestFocus
	banco.Initialize
End Sub

Sub Activity_Resume	
	
	Dim topo As Int = b4XImageViewFoto.mBase.Top + b4XImageViewFoto.mBase.Height
	
	lblTituloLivro.TextColor = Colors.Transparent
	lblTituloLivro.Top = topo - 5%y
	
	lblTituloLivro.SetLayoutAnimated(1000, (b4XImageViewFoto.mBase.Width - lblTituloLivro.Width) / 2, topo, 80%x, 7%y)
	lblTituloLivro.SetTextColorAnimated(1200, Colors.RGB(221,2,2))
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btCancelar_Click
	Activity.Finish
End Sub

Sub btOk_Click	
	Try
		
		Dim cmd As String
		
		cmd = "exec sp_lancamento_leitura " & Main.Id_do_Usuario & _
												 ", " & idLivro & _
												 ", " & edPaginaAtual.Text & ""		
		
		Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
		
		Result.NextRow
		
		If Result.GetInt("RESULTADO") = 1 Then
			ToastMessageShow("Sucesso",True)
			Main.CadastrouAlgo = True
			terminouLeitura = False
			Sleep(100)
			Activity.Finish
		Else if Result.GetInt("RESULTADO") = 0 Then								
			ToastMessageShow("Há algo errado na atualização!",True)
			Main.CadastrouAlgo = True
			terminouLeitura = True
			Sleep(100)
			Activity.Finish
		else if Result.GetInt("RESULTADO") = 2 Then
			cmd = "exec sp_adiciona_leitura_concluida " & Main.Id_do_Usuario & ", " & idLivro & ""
			
			Wait For (banco.Insert_Consulta(cmd)) Complete (Result As JdbcResultSet)
			
			Result.NextRow
			
			If Result.GetInt("RESULTADO") = 1 Then
				ToastMessageShow("Leitura concluída",True)
				
				terminouLeitura = True
				de_os_parabens = True
				Main.CadastrouAlgo = True
				Sleep(200)
				Activity.Finish
			else if Result.GetInt("RESULTADO") = 0 Then
				ToastMessageShow("Infelizmente algo deu errado.",True)
				
				terminouLeitura = True
				de_os_parabens = False
				Main.CadastrouAlgo = True
				Sleep(200)
				Activity.Finish
			End If		
			
		End If
		
	Catch
		ToastMessageShow("Há algo errado na atualização!",True)
		Main.CadastrouAlgo = False
		terminouLeitura = False
		de_os_parabens = False
		Activity.Finish
	End Try
End Sub

Sub edPaginaAtual_TextChanged (Old As String, New As String)
	
	Dim valor As Int
		
	If New.Trim <> "" Then
		
		If New > totalPaginas Then
			lblIvalido.Visible = True
			lblIvalido.Text = "Inválido"
			
			edPaginaAtual.TextColor = Colors.Red
			SomePagAtual
						
			lblPrevisaoPorcentagem.Text = "Próximo avanço 0%"
			btOk.Enabled = False
		Else
			edPaginaAtual.TextColor = Colors.RGB(46,16,16)
			lblIvalido.Visible = False
			lblIvalido.Text = "Inválido"			
			AparecePagAtual
						
			valor = ((New * 100) / totalPaginas)
			lblPrevisaoPorcentagem.Text = "Próximo avanço " & valor & "%"
			btOk.Enabled = True
		End If	
	Else
		SomePagAtual
		lblPrevisaoPorcentagem.Text = "Próximo avanço 0%"
		lblIvalido.Visible = True
		lblIvalido.Text = "Obrigatório"
		btOk.Enabled = False
	End If			
End Sub

Sub SomePagAtual
	lblPaginaAtual.SetLayoutAnimated(1200, 12%x, 1%y, 28%x, 7%y)
	lblPaginaAtual.SetTextColorAnimated(800, Colors.Transparent)
End Sub

Sub AparecePagAtual
	lblPaginaAtual.SetLayoutAnimated(1200, 12%x, 3%y, 28%x, 7%y)
	lblPaginaAtual.SetTextColorAnimated(800, Colors.RGB(111,0,0))
End Sub