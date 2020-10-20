
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

public class act_telacadastro implements IRemote{
	public static act_telacadastro mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public act_telacadastro() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("act_telacadastro"), "b4a.example.act_telacadastro");
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
		pcBA = new PCBA(this, act_telacadastro.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _painelimagem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelcabecalho = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneledautorlivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmeta = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneldataprevistafim = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneledtitulolivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneledpaginasoucap = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneledits = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbldadoslivro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltipoleitura = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmeta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprevisaotermino = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmaximodigitostitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmaximodigitosautor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmaximodigitospagoucap = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmaximodigitosmetapagoucap = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btcancelar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btsalvar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btaddfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _radpagina = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _radcapitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _scrol = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _b4ximagem = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _edb4xfloatnomelivro = RemoteObject.declareNull("b4a.example.b4xfloattextfield");
public static RemoteObject _hoje = RemoteObject.createImmutable("");
public static RemoteObject _lbldataprevisao = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblquantidadedias = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edb4xfloatpagoucap = RemoteObject.declareNull("b4a.example.b4xfloattextfield");
public static RemoteObject _edb4xfloatautorlivro = RemoteObject.declareNull("b4a.example.b4xfloattextfield");
public static RemoteObject _edb4xfloatmetapagcap = RemoteObject.declareNull("b4a.example.b4xfloattextfield");
public static RemoteObject _dataprevistafinal = RemoteObject.createImmutable("");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",act_telacadastro.mostCurrent._activity,"B4XImagem",act_telacadastro.mostCurrent._b4ximagem,"banco",act_telacadastro.mostCurrent._banco,"btAddFoto",act_telacadastro.mostCurrent._btaddfoto,"btCancelar",act_telacadastro.mostCurrent._btcancelar,"btSalvar",act_telacadastro.mostCurrent._btsalvar,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoCadastroLivro",Debug.moduleToString(b4a.example.codigocadastrolivro.class),"CodigoLancamentoLeitura",Debug.moduleToString(b4a.example.codigolancamentoleitura.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"dataPrevistaFinal",act_telacadastro.mostCurrent._dataprevistafinal,"DateUtils",act_telacadastro.mostCurrent._dateutils,"edB4XFloatAutorLivro",act_telacadastro.mostCurrent._edb4xfloatautorlivro,"edB4XFloatMetaPagCap",act_telacadastro.mostCurrent._edb4xfloatmetapagcap,"edB4XFloatNomeLivro",act_telacadastro.mostCurrent._edb4xfloatnomelivro,"edB4XFloatPagOuCap",act_telacadastro.mostCurrent._edb4xfloatpagoucap,"hoje",act_telacadastro.mostCurrent._hoje,"lblDadosLivro",act_telacadastro.mostCurrent._lbldadoslivro,"lblDataPrevisao",act_telacadastro.mostCurrent._lbldataprevisao,"lblMaximoDigitosAutor",act_telacadastro.mostCurrent._lblmaximodigitosautor,"lblMaximoDigitosMetaPagOuCap",act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap,"lblMaximoDigitosPagOuCap",act_telacadastro.mostCurrent._lblmaximodigitospagoucap,"lblMaximoDigitosTitulo",act_telacadastro.mostCurrent._lblmaximodigitostitulo,"lblMeta",act_telacadastro.mostCurrent._lblmeta,"lblPrevisaoTermino",act_telacadastro.mostCurrent._lblprevisaotermino,"lblQuantidadeDias",act_telacadastro.mostCurrent._lblquantidadedias,"lblTipoLeitura",act_telacadastro.mostCurrent._lbltipoleitura,"Main",Debug.moduleToString(b4a.example.main.class),"painelImagem",act_telacadastro.mostCurrent._painelimagem,"panelCabecalho",act_telacadastro.mostCurrent._panelcabecalho,"panelDataPrevistaFim",act_telacadastro.mostCurrent._paneldataprevistafim,"panelEdAutorLivro",act_telacadastro.mostCurrent._paneledautorlivro,"panelEdits",act_telacadastro.mostCurrent._paneledits,"panelEdPaginasOuCap",act_telacadastro.mostCurrent._paneledpaginasoucap,"panelEdTituloLivro",act_telacadastro.mostCurrent._paneledtitulolivro,"panelMeta",act_telacadastro.mostCurrent._panelmeta,"radCapitulo",act_telacadastro.mostCurrent._radcapitulo,"radPagina",act_telacadastro.mostCurrent._radpagina,"scrol",act_telacadastro.mostCurrent._scrol,"Starter",Debug.moduleToString(b4a.example.starter.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}