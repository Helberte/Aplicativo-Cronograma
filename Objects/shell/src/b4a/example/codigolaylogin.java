
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

public class codigolaylogin implements IRemote{
	public static codigolaylogin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigolaylogin() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigolaylogin"), "b4a.example.codigolaylogin");
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
		pcBA = new PCBA(this, codigolaylogin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _funcoes = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _edlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edsenha = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btconectar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.starter _starter = null;
public static b4a.example.act_telacadastro _act_telacadastro = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"act_TelaCadastro",Debug.moduleToString(b4a.example.act_telacadastro.class),"Activity",codigolaylogin.mostCurrent._activity,"btConectar",codigolaylogin.mostCurrent._btconectar,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoLancamentoLeitura",Debug.moduleToString(b4a.example.codigolancamentoleitura.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"DateUtils",codigolaylogin.mostCurrent._dateutils,"EdLogin",codigolaylogin.mostCurrent._edlogin,"EdSenha",codigolaylogin.mostCurrent._edsenha,"funcoes",codigolaylogin.mostCurrent._funcoes,"Main",Debug.moduleToString(b4a.example.main.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}