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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public nomeDoLivro As String
	Public qtPaginas As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private lblTitulo As Label
	Private B4XComboBox1 As B4XComboBox
	Private edTituloAnotacao As EditText
	Private edAnotacao As EditText
	Private btCancelar As Button
	Private btOk As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("Lay_Anotar")
	
	edTituloAnotacao.RequestFocus
End Sub

Sub Activity_Resume
	Dim paginas(qtPaginas) As Int
	
	For i = 0 To qtPaginas - 1
		paginas(i) = i + 1
	Next
	
	lblTitulo.Text = nomeDoLivro
	B4XComboBox1.SetItems(paginas)	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btCancelar_Click
	nomeDoLivro = ""
	qtPaginas = 0
	Activity.Finish
End Sub

Sub btOk_Click
	
	
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		nomeDoLivro = ""
		qtPaginas = 0
		Activity.Finish
		Return True
	Else
		Return False
	End If
End Sub