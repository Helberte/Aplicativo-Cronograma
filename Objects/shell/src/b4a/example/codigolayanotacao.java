
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

public class codigolayanotacao implements IRemote{
	public static codigolayanotacao mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigolayanotacao() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigolayanotacao"), "b4a.example.codigolayanotacao");
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
		pcBA = new PCBA(this, codigolayanotacao.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _nomedolivro = RemoteObject.createImmutable("");
public static RemoteObject _qtpaginas = RemoteObject.createImmutable(0);
public static RemoteObject _codigolivro = RemoteObject.createImmutable(0);
public static RemoteObject _lbltitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _b4xcombobox1 = RemoteObject.declareNull("b4a.example.b4xcombobox");
public static RemoteObject _edtituloanotacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edanotacao = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btcancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",codigolayanotacao.mostCurrent._activity,"B4XComboBox1",codigolayanotacao.mostCurrent._b4xcombobox1,"banco",codigolayanotacao.mostCurrent._banco,"btCancelar",codigolayanotacao.mostCurrent._btcancelar,"btOk",codigolayanotacao.mostCurrent._btok,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoCadastroLivro",Debug.moduleToString(b4a.example.codigocadastrolivro.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"codigoLivro",codigolayanotacao._codigolivro,"DateUtils",codigolayanotacao.mostCurrent._dateutils,"edAnotacao",codigolayanotacao.mostCurrent._edanotacao,"edTituloAnotacao",codigolayanotacao.mostCurrent._edtituloanotacao,"lblTitulo",codigolayanotacao.mostCurrent._lbltitulo,"Main",Debug.moduleToString(b4a.example.main.class),"nomeDoLivro",codigolayanotacao._nomedolivro,"qtPaginas",codigolayanotacao._qtpaginas,"Starter",Debug.moduleToString(b4a.example.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}