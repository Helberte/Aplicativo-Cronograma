
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

public class codigo_laydetalheslivro implements IRemote{
	public static codigo_laydetalheslivro mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public codigo_laydetalheslivro() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("codigo_laydetalheslivro"), "b4a.example.codigo_laydetalheslivro");
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
		pcBA = new PCBA(this, codigo_laydetalheslivro.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dt_inicio = RemoteObject.createImmutable("");
public static RemoteObject _dt_termino = RemoteObject.createImmutable("");
public static RemoteObject _pg_atual = RemoteObject.createImmutable("");
public static RemoteObject _pg_total = RemoteObject.createImmutable("");
public static RemoteObject _pg_meta = RemoteObject.createImmutable("");
public static RemoteObject _nome_usuario = RemoteObject.createImmutable("");
public static RemoteObject _nome_livro = RemoteObject.createImmutable("");
public static RemoteObject _tipo_leitura = RemoteObject.createImmutable("");
public static RemoteObject _id_livro = RemoteObject.createImmutable("");
public static RemoteObject _banco = RemoteObject.declareNull("b4a.example.classbancodados");
public static RemoteObject _bt_voltar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel_cabecalho = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrol = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _painel_imagem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl = RemoteObject.declareNull("b4a.example.codigo_laydetalheslivro._dm_labels");
public static RemoteObject _dm = RemoteObject.declareNull("b4a.example.codigo_laydetalheslivro._dimensoes");
public static RemoteObject _botoes = null;
public static RemoteObject _painel_botoes = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_usuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_livro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel_detalhes = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_dt_inicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_dt_termino = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_pg_atual = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_pg_total = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_pg_meta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rot_dt_inicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rot_dt_termino = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rot_pg_atual = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rot_pg_total = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _rot_pg_meta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _b4x_imagem = RemoteObject.declareNull("b4a.example.b4ximageview");
public static RemoteObject _seguro_cadastrou_algo = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.act_telacadastro _act_telacadastro = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.modulo_funcoes _modulo_funcoes = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"act_TelaCadastro",Debug.moduleToString(b4a.example.act_telacadastro.class),"Activity",codigo_laydetalheslivro.mostCurrent._activity,"b4x_imagem",codigo_laydetalheslivro.mostCurrent._b4x_imagem,"banco",codigo_laydetalheslivro._banco,"botoes",codigo_laydetalheslivro.mostCurrent._botoes,"bt_voltar",codigo_laydetalheslivro.mostCurrent._bt_voltar,"CodigoCadastro",Debug.moduleToString(b4a.example.codigocadastro.class),"CodigoLancamentoLeitura",Debug.moduleToString(b4a.example.codigolancamentoleitura.class),"CodigoLayAnotacao",Debug.moduleToString(b4a.example.codigolayanotacao.class),"CodigoLayLeituras",Debug.moduleToString(b4a.example.codigolayleituras.class),"CodigoLayLogin",Debug.moduleToString(b4a.example.codigolaylogin.class),"DateUtils",codigo_laydetalheslivro.mostCurrent._dateutils,"dm",codigo_laydetalheslivro.mostCurrent._dm,"dt_inicio",codigo_laydetalheslivro._dt_inicio,"dt_termino",codigo_laydetalheslivro._dt_termino,"id_livro",codigo_laydetalheslivro._id_livro,"lbl",codigo_laydetalheslivro.mostCurrent._lbl,"lbl_dt_inicio",codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio,"lbl_dt_termino",codigo_laydetalheslivro.mostCurrent._lbl_dt_termino,"lbl_livro",codigo_laydetalheslivro.mostCurrent._lbl_livro,"lbl_pg_atual",codigo_laydetalheslivro.mostCurrent._lbl_pg_atual,"lbl_pg_meta",codigo_laydetalheslivro.mostCurrent._lbl_pg_meta,"lbl_pg_total",codigo_laydetalheslivro.mostCurrent._lbl_pg_total,"lbl_usuario",codigo_laydetalheslivro.mostCurrent._lbl_usuario,"Main",Debug.moduleToString(b4a.example.main.class),"modulo_funcoes",Debug.moduleToString(b4a.example.modulo_funcoes.class),"nome_livro",codigo_laydetalheslivro._nome_livro,"nome_usuario",codigo_laydetalheslivro._nome_usuario,"painel_botoes",codigo_laydetalheslivro.mostCurrent._painel_botoes,"painel_imagem",codigo_laydetalheslivro.mostCurrent._painel_imagem,"panel_cabecalho",codigo_laydetalheslivro.mostCurrent._panel_cabecalho,"panel_detalhes",codigo_laydetalheslivro.mostCurrent._panel_detalhes,"pg_atual",codigo_laydetalheslivro._pg_atual,"pg_meta",codigo_laydetalheslivro._pg_meta,"pg_total",codigo_laydetalheslivro._pg_total,"rot_dt_inicio",codigo_laydetalheslivro.mostCurrent._rot_dt_inicio,"rot_dt_termino",codigo_laydetalheslivro.mostCurrent._rot_dt_termino,"rot_pg_atual",codigo_laydetalheslivro.mostCurrent._rot_pg_atual,"rot_pg_meta",codigo_laydetalheslivro.mostCurrent._rot_pg_meta,"rot_pg_total",codigo_laydetalheslivro.mostCurrent._rot_pg_total,"scrol",codigo_laydetalheslivro.mostCurrent._scrol,"seguro_cadastrou_algo",codigo_laydetalheslivro._seguro_cadastrou_algo,"Starter",Debug.moduleToString(b4a.example.starter.class),"tipo_leitura",codigo_laydetalheslivro._tipo_leitura,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}