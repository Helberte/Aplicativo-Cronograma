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
End Sub

Sub Globals

	Private lblTituloLivro As Label
	Private lblNomeUsuario As Label
	Private edPaginaAtual As EditText
	Private edTotalPaginas As EditText
	Private lblPorcentagem As Label
	Private b4XImageViewFoto As B4XImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("Lay_lancamento_leitura")
	
	
	b4XImageViewFoto.ResizeMode = "FILL"
	b4XImageViewFoto.Load(File.DirAssets, "livro.jpg")
	
	lblTituloLivro.Text = tituloLivro
	lblNomeUsuario.Text = nomeUsuario
	edPaginaAtual.Text = paginaAtual
	edTotalPaginas.Text = totalPaginas
	
	edPaginaAtual.RequestFocus
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btCancelar_Click
	Activity.Finish
End Sub

Sub btOk_Click
	
End Sub