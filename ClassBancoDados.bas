B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Private driver As String = "net.sourceforge.jtds.jdbc.Driver"
	Private jdbcUrl As String = "jdbc:jtds:sqlserver://192.168.1.105:1433;databaseName=cronograma;logintimeout=10"
													' 192.168.1.105
													' 192.168.2.5
	Private usuario As String = "sa"
	Private senha As String = "254685ro"
	Private conexao As JdbcSQL
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize()
	
End Sub

Private Sub Conecta As ResumableSub
	Try
		conexao.Close
		conexao.InitializeAsync("MSSQL", driver, jdbcUrl, usuario, senha)
		Wait For MSSQL_Ready (Success As Boolean)
		Return Success
	Catch
		Return False
	End Try
End Sub


Sub Insert_Consulta(cmd As String) As ResumableSub
	Wait For (Conecta) Complete (Success As Boolean)
	If Success Then
		Dim result As Object = conexao.ExecQueryAsync("SP", cmd, Null)
		Try
			Wait For (result) SP_QueryComplete (Success As Boolean, rs As JdbcResultSet)
			If Success Then
				Return rs
			Else
				Return Null
			End If
		Catch
			Return Null
		End Try
	Else
		Return Null
	End If
End Sub









