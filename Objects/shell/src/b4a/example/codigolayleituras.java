
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

public class codigolayleituras implements IRemote{
	public static codigolayleituras mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigolayleituras() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigolayleituras"), "b4a.example.codigolayleituras");
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
		pcBA = new PCBA(this, codigolayleituras.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _tabstrip = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _lbl_inicial_leitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelleituras = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _gradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
public static RemoteObject _panelnenhumaleitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cores = null;
public static RemoteObject _btadicionarleitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",codigolayleituras.mostCurrent._activity,"banco",codigolayleituras.mostCurrent._banco,"btAdicionarLeitura",codigolayleituras.mostCurrent._btadicionarleitura,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoCadastroLivro",Debug.moduleToString(b4a.example.codigocadastrolivro.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"cores",codigolayleituras._cores,"DateUtils",codigolayleituras.mostCurrent._dateutils,"gradient",codigolayleituras.mostCurrent._gradient,"lbl_Inicial_Leitura",codigolayleituras.mostCurrent._lbl_inicial_leitura,"Main",Debug.moduleToString(b4a.example.main.class),"panelLeituras",codigolayleituras.mostCurrent._panelleituras,"panelNenhumaLeitura",codigolayleituras.mostCurrent._panelnenhumaleitura,"ScrollView1",codigolayleituras.mostCurrent._scrollview1,"Starter",Debug.moduleToString(b4a.example.starter.class),"TabStrip",codigolayleituras.mostCurrent._tabstrip,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}