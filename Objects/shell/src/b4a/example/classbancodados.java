
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class classbancodados {
    public static RemoteObject myClass;
	public classbancodados() {
	}
    public static PCBA staticBA = new PCBA(null, classbancodados.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _driver = RemoteObject.createImmutable("");
public static RemoteObject _jdbcurl = RemoteObject.createImmutable("");
public static RemoteObject _usuario = RemoteObject.createImmutable("");
public static RemoteObject _senha = RemoteObject.createImmutable("");
public static RemoteObject _conexao = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.act_telacadastro _act_telacadastro = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"conexao",_ref.getField(false, "_conexao"),"DateUtils",_ref.getField(false, "_dateutils"),"driver",_ref.getField(false, "_driver"),"jdbcUrl",_ref.getField(false, "_jdbcurl"),"senha",_ref.getField(false, "_senha"),"usuario",_ref.getField(false, "_usuario")};
}
}