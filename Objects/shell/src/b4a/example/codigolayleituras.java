
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
public static RemoteObject _tempanel = RemoteObject.createImmutable(false);
public static RemoteObject _tempanelleituraconcluida = RemoteObject.createImmutable(false);
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _tabstrip = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabStripViewPager");
public static RemoteObject _lbl_inicial_leitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _scrollview2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _gradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
public static RemoteObject _panelnenhumaleitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cores = null;
public static RemoteObject _tamanholista = RemoteObject.createImmutable(0);
public static RemoteObject _btadicionarleitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel_lendo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _nomearquivo = RemoteObject.createImmutable("");
public static RemoteObject _carrega_leitura_concluida = RemoteObject.createImmutable(false);
public static RemoteObject _panel_lidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_parabens = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _b4ximage_parabens = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.act_telacadastro _act_telacadastro = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"act_TelaCadastro",Debug.moduleToString(b4a.example.act_telacadastro.class),"Activity",codigolayleituras.mostCurrent._activity,"B4XImage_parabens",codigolayleituras.mostCurrent._b4ximage_parabens,"banco",codigolayleituras.mostCurrent._banco,"btAdicionarLeitura",codigolayleituras.mostCurrent._btadicionarleitura,"carrega_leitura_concluida",codigolayleituras._carrega_leitura_concluida,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoLancamentoLeitura",Debug.moduleToString(b4a.example.codigolancamentoleitura.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"cores",codigolayleituras._cores,"DateUtils",codigolayleituras.mostCurrent._dateutils,"gradient",codigolayleituras.mostCurrent._gradient,"lbl_Inicial_Leitura",codigolayleituras.mostCurrent._lbl_inicial_leitura,"Main",Debug.moduleToString(b4a.example.main.class),"nomeArquivo",codigolayleituras.mostCurrent._nomearquivo,"Panel_lendo",codigolayleituras.mostCurrent._panel_lendo,"Panel_lidos",codigolayleituras.mostCurrent._panel_lidos,"Panel_parabens",codigolayleituras.mostCurrent._panel_parabens,"panelNenhumaLeitura",codigolayleituras.mostCurrent._panelnenhumaleitura,"scrollView1",codigolayleituras.mostCurrent._scrollview1,"scrollView2",codigolayleituras.mostCurrent._scrollview2,"Starter",Debug.moduleToString(b4a.example.starter.class),"TabStrip",codigolayleituras.mostCurrent._tabstrip,"tamanhoLista",codigolayleituras._tamanholista,"temPanel",codigolayleituras._tempanel,"temPanelLeituraConcluida",codigolayleituras._tempanelleituraconcluida,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}