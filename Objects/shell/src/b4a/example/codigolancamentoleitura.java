
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class codigolancamentoleitura implements IRemote{
	public static codigolancamentoleitura mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigolancamentoleitura() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigolancamentoleitura"), "b4a.example.codigolancamentoleitura");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, codigolancamentoleitura.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _titulolivro = RemoteObject.createImmutable("");
public static RemoteObject _nomeusuario = RemoteObject.createImmutable("");
public static RemoteObject _paginaatual = RemoteObject.createImmutable(0);
public static RemoteObject _totalpaginas = RemoteObject.createImmutable(0);
public static RemoteObject _meta = RemoteObject.createImmutable(0);
public static RemoteObject _idlivro = RemoteObject.createImmutable(0);
public static RemoteObject _tipoleitura = RemoteObject.createImmutable("");
public static RemoteObject _terminouleitura = RemoteObject.createImmutable(false);
public static RemoteObject _de_os_parabens = RemoteObject.createImmutable(false);
public static RemoteObject _lbltitulolivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnomeusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edpaginaatual = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edtotalpaginas = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblporcentagem = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _b4ximageviewfoto = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _lblivalido = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblpaginaatual = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprevisaoporcentagem = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _lbltotalpaginas = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.act_telacadastro _act_telacadastro = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.codigo_laydetalheslivro _codigo_laydetalheslivro = null;
public static b4a.example.modulo_funcoes _modulo_funcoes = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"act_TelaCadastro",Debug.moduleToString(b4a.example.act_telacadastro.class),"Activity",codigolancamentoleitura.mostCurrent._activity,"b4XImageViewFoto",codigolancamentoleitura.mostCurrent._b4ximageviewfoto,"banco",codigolancamentoleitura.mostCurrent._banco,"btOk",codigolancamentoleitura.mostCurrent._btok,"Codigo_LayDetalhesLivro",Debug.moduleToString(b4a.example.codigo_laydetalheslivro.class),"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"DateUtils",codigolancamentoleitura.mostCurrent._dateutils,"de_os_parabens",codigolancamentoleitura._de_os_parabens,"edPaginaAtual",codigolancamentoleitura.mostCurrent._edpaginaatual,"edTotalPaginas",codigolancamentoleitura.mostCurrent._edtotalpaginas,"idLivro",codigolancamentoleitura._idlivro,"lblIvalido",codigolancamentoleitura.mostCurrent._lblivalido,"lblNomeUsuario",codigolancamentoleitura.mostCurrent._lblnomeusuario,"lblPaginaAtual",codigolancamentoleitura.mostCurrent._lblpaginaatual,"lblPorcentagem",codigolancamentoleitura.mostCurrent._lblporcentagem,"lblPrevisaoPorcentagem",codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem,"lblTituloLivro",codigolancamentoleitura.mostCurrent._lbltitulolivro,"lblTotalPaginas",codigolancamentoleitura.mostCurrent._lbltotalpaginas,"Main",Debug.moduleToString(b4a.example.main.class),"meta",codigolancamentoleitura._meta,"modulo_funcoes",Debug.moduleToString(b4a.example.modulo_funcoes.class),"nomeUsuario",codigolancamentoleitura._nomeusuario,"paginaAtual",codigolancamentoleitura._paginaatual,"Starter",Debug.moduleToString(b4a.example.starter.class),"terminouLeitura",codigolancamentoleitura._terminouleitura,"tipoLeitura",codigolancamentoleitura._tipoleitura,"tituloLivro",codigolancamentoleitura._titulolivro,"totalPaginas",codigolancamentoleitura._totalpaginas,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}