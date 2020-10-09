
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

public class codigocadastrolivro implements IRemote{
	public static codigocadastrolivro mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigocadastrolivro() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigocadastrolivro"), "b4a.example.codigocadastrolivro");
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
		pcBA = new PCBA(this, codigocadastrolivro.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _cadastrou = RemoteObject.createImmutable(false);
public static RemoteObject _edtitulolivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _radpagina = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _radcapitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _edquantpagoucap = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblmeta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edmeta = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _hoje = RemoteObject.createImmutable("");
public static RemoteObject _lblprevisao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblquantidadedias = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btaddfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _b4ximageview1 = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _lblfotolivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edautorlivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _dataprevistafinal = RemoteObject.createImmutable("");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",codigocadastrolivro.mostCurrent._activity,"B4XImageView1",codigocadastrolivro.mostCurrent._b4ximageview1,"banco",codigocadastrolivro.mostCurrent._banco,"btAddFoto",codigocadastrolivro.mostCurrent._btaddfoto,"cadastrou",codigocadastrolivro._cadastrou,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"dataPrevistaFinal",codigocadastrolivro.mostCurrent._dataprevistafinal,"DateUtils",codigocadastrolivro.mostCurrent._dateutils,"edAutorLivro",codigocadastrolivro.mostCurrent._edautorlivro,"edMeta",codigocadastrolivro.mostCurrent._edmeta,"edQuantPagOuCap",codigocadastrolivro.mostCurrent._edquantpagoucap,"edTituloLivro",codigocadastrolivro.mostCurrent._edtitulolivro,"hoje",codigocadastrolivro.mostCurrent._hoje,"lblFotoLivro",codigocadastrolivro.mostCurrent._lblfotolivro,"lblMeta",codigocadastrolivro.mostCurrent._lblmeta,"lblPrevisao",codigocadastrolivro.mostCurrent._lblprevisao,"lblQuantidadeDias",codigocadastrolivro.mostCurrent._lblquantidadedias,"Main",Debug.moduleToString(b4a.example.main.class),"radCapitulo",codigocadastrolivro.mostCurrent._radcapitulo,"radPagina",codigocadastrolivro.mostCurrent._radpagina,"Starter",Debug.moduleToString(b4a.example.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}