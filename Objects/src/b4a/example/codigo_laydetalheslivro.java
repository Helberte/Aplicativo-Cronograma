package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class codigo_laydetalheslivro extends Activity implements B4AActivity{
	public static codigo_laydetalheslivro mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigo_laydetalheslivro");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigo_laydetalheslivro).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigo_laydetalheslivro");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigo_laydetalheslivro", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigo_laydetalheslivro) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigo_laydetalheslivro) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return codigo_laydetalheslivro.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            codigo_laydetalheslivro mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }


public static class _dimensoes{
public boolean IsInitialized;
public int esquerda;
public int topo;
public int tamanho;
public void Initialize() {
IsInitialized = true;
esquerda = 0;
topo = 0;
tamanho = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dm_labels{
public boolean IsInitialized;
public int topo;
public void Initialize() {
IsInitialized = true;
topo = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _dt_inicio = "";
public static String _dt_termino = "";
public static String _pg_atual = "";
public static String _pg_total = "";
public static String _pg_meta = "";
public static String _nome_usuario = "";
public static String _nome_livro = "";
public static String _tipo_leitura = "";
public static String _id_livro = "";
public static b4a.example.classbancodados _banco = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bt_voltar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_cabecalho = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrol = null;
public anywheresoftware.b4a.objects.PanelWrapper _painel_imagem = null;
public b4a.example.codigo_laydetalheslivro._dm_labels _lbl = null;
public b4a.example.codigo_laydetalheslivro._dimensoes _dm = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _botoes = null;
public anywheresoftware.b4a.objects.PanelWrapper _painel_botoes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_usuario = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_livro = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_detalhes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_dt_inicio = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_dt_termino = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_pg_atual = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_pg_total = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_pg_meta = null;
public anywheresoftware.b4a.objects.LabelWrapper _rot_dt_inicio = null;
public anywheresoftware.b4a.objects.LabelWrapper _rot_dt_termino = null;
public anywheresoftware.b4a.objects.LabelWrapper _rot_pg_atual = null;
public anywheresoftware.b4a.objects.LabelWrapper _rot_pg_total = null;
public anywheresoftware.b4a.objects.LabelWrapper _rot_pg_meta = null;
public b4a.example.b4ximageview _b4x_imagem = null;
public static boolean _seguro_cadastrou_algo = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.modulo_funcoes _modulo_funcoes = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
Object _g = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd_color = null;
int[] _cores_label = null;
int _lbl_cor_fundo = 0;
int _lbl_cor_fonte = 0;
int _fonte_rot = 0;
int _largura = 0;
int _esquerda = 0;
int _i = 0;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Activity.LoadLayout(\"Lay_detalhes_leituras\")";
mostCurrent._activity.LoadLayout("Lay_detalhes_leituras",mostCurrent.activityBA);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="bt_voltar.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._bt_voltar.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_voltar.png").getObject()));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="painel_botoes.Initialize(\"\")";
mostCurrent._painel_botoes.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="banco.Initialize";
_banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="painel_imagem.Initialize( \"\" )";
mostCurrent._painel_imagem.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="lbl_livro.Initialize(\"\")";
mostCurrent._lbl_livro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="lbl_usuario.Initialize(\"\")";
mostCurrent._lbl_usuario.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="panel_detalhes.Initialize(\"\")";
mostCurrent._panel_detalhes.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="lbl_dt_inicio.Initialize(\"\")";
mostCurrent._lbl_dt_inicio.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="lbl_dt_termino.Initialize(\"\")";
mostCurrent._lbl_dt_termino.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="lbl_pg_atual.Initialize(\"\")";
mostCurrent._lbl_pg_atual.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="lbl_pg_total.Initialize(\"\")";
mostCurrent._lbl_pg_total.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="lbl_pg_meta.Initialize(\"\")";
mostCurrent._lbl_pg_meta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="rot_dt_inicio.Initialize(\"\")";
mostCurrent._rot_dt_inicio.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="rot_dt_termino.Initialize(\"\")";
mostCurrent._rot_dt_termino.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291475;
 //BA.debugLineNum = 6291475;BA.debugLine="rot_pg_atual.Initialize(\"\")";
mostCurrent._rot_pg_atual.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291476;
 //BA.debugLineNum = 6291476;BA.debugLine="rot_pg_meta.Initialize(\"\")";
mostCurrent._rot_pg_meta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291477;
 //BA.debugLineNum = 6291477;BA.debugLine="rot_pg_total.Initialize(\"\")";
mostCurrent._rot_pg_total.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6291479;
 //BA.debugLineNum = 6291479;BA.debugLine="Dim g As Object";
_g = new Object();
RDebugUtils.currentLine=6291480;
 //BA.debugLineNum = 6291480;BA.debugLine="Dim gd_color As GradientDrawable";
_gd_color = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6291481;
 //BA.debugLineNum = 6291481;BA.debugLine="Dim cores_label(2) As Int";
_cores_label = new int[(int) (2)];
;
RDebugUtils.currentLine=6291483;
 //BA.debugLineNum = 6291483;BA.debugLine="g = Bit.Or(Gravity.LEFT, Gravity.CENTER_VERTICAL)";
_g = (Object)(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.LEFT,anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=6291485;
 //BA.debugLineNum = 6291485;BA.debugLine="cores_label(0) = Colors.RGB(241, 201, 201)";
_cores_label[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (241),(int) (201),(int) (201));
RDebugUtils.currentLine=6291486;
 //BA.debugLineNum = 6291486;BA.debugLine="cores_label(1) = Colors.RGB(241, 201, 201)";
_cores_label[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (241),(int) (201),(int) (201));
RDebugUtils.currentLine=6291488;
 //BA.debugLineNum = 6291488;BA.debugLine="gd_color.Initialize(\"TOP_BOTTOM\", cores_label)";
_gd_color.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_cores_label);
RDebugUtils.currentLine=6291489;
 //BA.debugLineNum = 6291489;BA.debugLine="gd_color.CornerRadius = 100";
_gd_color.setCornerRadius((float) (100));
RDebugUtils.currentLine=6291491;
 //BA.debugLineNum = 6291491;BA.debugLine="Dim lbl_cor_fundo As Int = Colors.RGB(241, 201, 2";
_lbl_cor_fundo = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (241),(int) (201),(int) (201));
RDebugUtils.currentLine=6291492;
 //BA.debugLineNum = 6291492;BA.debugLine="Dim lbl_cor_fonte As Int = Colors.RGB(104,30,30)";
_lbl_cor_fonte = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (104),(int) (30),(int) (30));
RDebugUtils.currentLine=6291494;
 //BA.debugLineNum = 6291494;BA.debugLine="lbl_dt_inicio = Configura_label(dt_inicio, lbl_co";
mostCurrent._lbl_dt_inicio = _configura_label(_dt_inicio,_lbl_cor_fundo,(int) (20),_lbl_cor_fonte);
RDebugUtils.currentLine=6291495;
 //BA.debugLineNum = 6291495;BA.debugLine="lbl_dt_termino = Configura_label(dt_termino, lbl_";
mostCurrent._lbl_dt_termino = _configura_label(_dt_termino,_lbl_cor_fundo,(int) (20),_lbl_cor_fonte);
RDebugUtils.currentLine=6291496;
 //BA.debugLineNum = 6291496;BA.debugLine="lbl_pg_atual = Configura_label(pg_atual, lbl_cor_";
mostCurrent._lbl_pg_atual = _configura_label(_pg_atual,_lbl_cor_fundo,(int) (20),_lbl_cor_fonte);
RDebugUtils.currentLine=6291497;
 //BA.debugLineNum = 6291497;BA.debugLine="lbl_pg_total = Configura_label(pg_total, lbl_cor_";
mostCurrent._lbl_pg_total = _configura_label(_pg_total,_lbl_cor_fundo,(int) (20),_lbl_cor_fonte);
RDebugUtils.currentLine=6291498;
 //BA.debugLineNum = 6291498;BA.debugLine="lbl_pg_meta = Configura_label(pg_meta, lbl_cor_fu";
mostCurrent._lbl_pg_meta = _configura_label(_pg_meta,_lbl_cor_fundo,(int) (20),_lbl_cor_fonte);
RDebugUtils.currentLine=6291500;
 //BA.debugLineNum = 6291500;BA.debugLine="Dim fonte_rot As Int = 15";
_fonte_rot = (int) (15);
RDebugUtils.currentLine=6291501;
 //BA.debugLineNum = 6291501;BA.debugLine="If tipo_leitura = \"páginas\" Then";
if ((_tipo_leitura).equals("páginas")) { 
RDebugUtils.currentLine=6291502;
 //BA.debugLineNum = 6291502;BA.debugLine="tipo_leitura = \"Página\"";
_tipo_leitura = "Página";
 }else {
RDebugUtils.currentLine=6291504;
 //BA.debugLineNum = 6291504;BA.debugLine="tipo_leitura = \"Capítulo\"";
_tipo_leitura = "Capítulo";
 };
RDebugUtils.currentLine=6291506;
 //BA.debugLineNum = 6291506;BA.debugLine="rot_dt_inicio = Configura_label(\"Data de início\",";
mostCurrent._rot_dt_inicio = _configura_label("Data de início",anywheresoftware.b4a.keywords.Common.Colors.Transparent,_fonte_rot,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291507;
 //BA.debugLineNum = 6291507;BA.debugLine="rot_dt_termino = Configura_label(\"Previsão de tér";
mostCurrent._rot_dt_termino = _configura_label("Previsão de término",anywheresoftware.b4a.keywords.Common.Colors.Transparent,_fonte_rot,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291508;
 //BA.debugLineNum = 6291508;BA.debugLine="rot_pg_atual = Configura_label( tipo_leitura & \"";
mostCurrent._rot_pg_atual = _configura_label(_tipo_leitura+" atual",anywheresoftware.b4a.keywords.Common.Colors.Transparent,_fonte_rot,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291509;
 //BA.debugLineNum = 6291509;BA.debugLine="rot_pg_meta = Configura_label(\"Meta\", Colors.Tran";
mostCurrent._rot_pg_meta = _configura_label("Meta",anywheresoftware.b4a.keywords.Common.Colors.Transparent,_fonte_rot,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291510;
 //BA.debugLineNum = 6291510;BA.debugLine="If tipo_leitura = \"Página\" Then";
if ((_tipo_leitura).equals("Página")) { 
RDebugUtils.currentLine=6291511;
 //BA.debugLineNum = 6291511;BA.debugLine="tipo_leitura = \"páginas\"";
_tipo_leitura = "páginas";
 }else {
RDebugUtils.currentLine=6291513;
 //BA.debugLineNum = 6291513;BA.debugLine="tipo_leitura = \"capítulos\"";
_tipo_leitura = "capítulos";
 };
RDebugUtils.currentLine=6291515;
 //BA.debugLineNum = 6291515;BA.debugLine="rot_pg_total = Configura_label(\"Total de \" & tipo";
mostCurrent._rot_pg_total = _configura_label("Total de "+_tipo_leitura,anywheresoftware.b4a.keywords.Common.Colors.Transparent,_fonte_rot,anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291517;
 //BA.debugLineNum = 6291517;BA.debugLine="lbl_dt_inicio.Gravity = g";
mostCurrent._lbl_dt_inicio.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291518;
 //BA.debugLineNum = 6291518;BA.debugLine="lbl_dt_termino.Gravity = g";
mostCurrent._lbl_dt_termino.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291519;
 //BA.debugLineNum = 6291519;BA.debugLine="lbl_pg_atual.Gravity = g";
mostCurrent._lbl_pg_atual.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291520;
 //BA.debugLineNum = 6291520;BA.debugLine="lbl_pg_total.Gravity = g";
mostCurrent._lbl_pg_total.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291521;
 //BA.debugLineNum = 6291521;BA.debugLine="lbl_pg_meta.Gravity = g";
mostCurrent._lbl_pg_meta.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291523;
 //BA.debugLineNum = 6291523;BA.debugLine="lbl_dt_inicio.Background = gd_color";
mostCurrent._lbl_dt_inicio.setBackground((android.graphics.drawable.Drawable)(_gd_color.getObject()));
RDebugUtils.currentLine=6291524;
 //BA.debugLineNum = 6291524;BA.debugLine="lbl_dt_termino.Background = gd_color";
mostCurrent._lbl_dt_termino.setBackground((android.graphics.drawable.Drawable)(_gd_color.getObject()));
RDebugUtils.currentLine=6291525;
 //BA.debugLineNum = 6291525;BA.debugLine="lbl_pg_atual.Background = gd_color";
mostCurrent._lbl_pg_atual.setBackground((android.graphics.drawable.Drawable)(_gd_color.getObject()));
RDebugUtils.currentLine=6291526;
 //BA.debugLineNum = 6291526;BA.debugLine="lbl_pg_total.Background = gd_color";
mostCurrent._lbl_pg_total.setBackground((android.graphics.drawable.Drawable)(_gd_color.getObject()));
RDebugUtils.currentLine=6291527;
 //BA.debugLineNum = 6291527;BA.debugLine="lbl_pg_meta.Background = gd_color";
mostCurrent._lbl_pg_meta.setBackground((android.graphics.drawable.Drawable)(_gd_color.getObject()));
RDebugUtils.currentLine=6291529;
 //BA.debugLineNum = 6291529;BA.debugLine="lbl_dt_inicio.Padding = Array As Int (25dip, 0dip";
mostCurrent._lbl_dt_inicio.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291530;
 //BA.debugLineNum = 6291530;BA.debugLine="lbl_dt_termino.Padding = Array As Int (25dip, 0di";
mostCurrent._lbl_dt_termino.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291531;
 //BA.debugLineNum = 6291531;BA.debugLine="lbl_pg_atual.Padding = Array As Int (25dip, 0dip,";
mostCurrent._lbl_pg_atual.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291532;
 //BA.debugLineNum = 6291532;BA.debugLine="lbl_pg_total.Padding = Array As Int (25dip, 0dip,";
mostCurrent._lbl_pg_total.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291533;
 //BA.debugLineNum = 6291533;BA.debugLine="lbl_pg_meta.Padding = Array As Int (25dip, 0dip,";
mostCurrent._lbl_pg_meta.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291535;
 //BA.debugLineNum = 6291535;BA.debugLine="rot_dt_inicio.Gravity = g";
mostCurrent._rot_dt_inicio.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291536;
 //BA.debugLineNum = 6291536;BA.debugLine="rot_dt_termino.Gravity = g";
mostCurrent._rot_dt_termino.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291537;
 //BA.debugLineNum = 6291537;BA.debugLine="rot_pg_atual.Gravity = g";
mostCurrent._rot_pg_atual.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291538;
 //BA.debugLineNum = 6291538;BA.debugLine="rot_pg_meta.Gravity = g";
mostCurrent._rot_pg_meta.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291539;
 //BA.debugLineNum = 6291539;BA.debugLine="rot_pg_total.Gravity = g";
mostCurrent._rot_pg_total.setGravity((int)(BA.ObjectToNumber(_g)));
RDebugUtils.currentLine=6291541;
 //BA.debugLineNum = 6291541;BA.debugLine="rot_dt_inicio.Padding = Array As Int (25dip, 0dip";
mostCurrent._rot_dt_inicio.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291542;
 //BA.debugLineNum = 6291542;BA.debugLine="rot_dt_termino.Padding = Array As Int (25dip, 0di";
mostCurrent._rot_dt_termino.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291543;
 //BA.debugLineNum = 6291543;BA.debugLine="rot_pg_atual.Padding = Array As Int (25dip, 0dip,";
mostCurrent._rot_pg_atual.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291544;
 //BA.debugLineNum = 6291544;BA.debugLine="rot_pg_meta.Padding = Array As Int (25dip, 0dip,";
mostCurrent._rot_pg_meta.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291545;
 //BA.debugLineNum = 6291545;BA.debugLine="rot_pg_total.Padding = Array As Int (25dip, 0dip,";
mostCurrent._rot_pg_total.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=6291547;
 //BA.debugLineNum = 6291547;BA.debugLine="lbl_livro = Configura_label(nome_livro, Colors.Tr";
mostCurrent._lbl_livro = _configura_label(_nome_livro,anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (13),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291548;
 //BA.debugLineNum = 6291548;BA.debugLine="lbl_usuario = Configura_label(nome_usuario, Color";
mostCurrent._lbl_usuario = _configura_label(_nome_usuario,anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (13),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6291550;
 //BA.debugLineNum = 6291550;BA.debugLine="lbl_livro.Gravity = Gravity.CENTER";
mostCurrent._lbl_livro.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=6291551;
 //BA.debugLineNum = 6291551;BA.debugLine="lbl_usuario.Gravity = Gravity.CENTER";
mostCurrent._lbl_usuario.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=6291553;
 //BA.debugLineNum = 6291553;BA.debugLine="dm.Initialize";
mostCurrent._dm.Initialize();
RDebugUtils.currentLine=6291554;
 //BA.debugLineNum = 6291554;BA.debugLine="lbl.Initialize";
mostCurrent._lbl.Initialize();
RDebugUtils.currentLine=6291556;
 //BA.debugLineNum = 6291556;BA.debugLine="dm.esquerda = 1%x";
mostCurrent._dm.esquerda /*int*/  = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=6291557;
 //BA.debugLineNum = 6291557;BA.debugLine="dm.tamanho = 98%x";
mostCurrent._dm.tamanho /*int*/  = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA);
RDebugUtils.currentLine=6291558;
 //BA.debugLineNum = 6291558;BA.debugLine="dm.topo = 1%y";
mostCurrent._dm.topo /*int*/  = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=6291560;
 //BA.debugLineNum = 6291560;BA.debugLine="painel_imagem.Color = Colors.Cyan";
mostCurrent._painel_imagem.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=6291562;
 //BA.debugLineNum = 6291562;BA.debugLine="scrol.Panel.AddView(painel_imagem, dm.esquerda, d";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painel_imagem.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=6291563;
 //BA.debugLineNum = 6291563;BA.debugLine="painel_imagem.LoadLayout(\"Lay_imagem_tela_detalhe";
mostCurrent._painel_imagem.LoadLayout("Lay_imagem_tela_detalhes",mostCurrent.activityBA);
RDebugUtils.currentLine=6291564;
 //BA.debugLineNum = 6291564;BA.debugLine="b4x_imagem.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4x_imagem._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=6291565;
 //BA.debugLineNum = 6291565;BA.debugLine="b4x_imagem.ResizeMode = \"FILL\"";
mostCurrent._b4x_imagem._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=6291567;
 //BA.debugLineNum = 6291567;BA.debugLine="dm.topo = dm.topo + painel_imagem.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._painel_imagem.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=6291568;
 //BA.debugLineNum = 6291568;BA.debugLine="scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.to";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbl_livro.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=6291570;
 //BA.debugLineNum = 6291570;BA.debugLine="dm.topo = dm.topo + lbl_livro.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._lbl_livro.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=6291571;
 //BA.debugLineNum = 6291571;BA.debugLine="scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbl_usuario.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=6291573;
 //BA.debugLineNum = 6291573;BA.debugLine="dm.topo = dm.topo + lbl_usuario.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._lbl_usuario.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=6291575;
 //BA.debugLineNum = 6291575;BA.debugLine="painel_botoes.Color = Colors.Transparent";
mostCurrent._painel_botoes.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=6291576;
 //BA.debugLineNum = 6291576;BA.debugLine="scrol.Panel.AddView(painel_botoes, 0%x, dm.topo,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painel_botoes.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),mostCurrent._dm.topo /*int*/ ,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (11),mostCurrent.activityBA));
RDebugUtils.currentLine=6291578;
 //BA.debugLineNum = 6291578;BA.debugLine="Dim largura As Int = 17%x";
_largura = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA);
RDebugUtils.currentLine=6291579;
 //BA.debugLineNum = 6291579;BA.debugLine="Dim esquerda As Int = 1.7%x";
_esquerda = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1.7),mostCurrent.activityBA);
RDebugUtils.currentLine=6291581;
 //BA.debugLineNum = 6291581;BA.debugLine="esquerda = (100%x -((esquerda * 4) + (largura * 5";
_esquerda = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-((_esquerda*4)+(_largura*5)))/(double)2);
RDebugUtils.currentLine=6291583;
 //BA.debugLineNum = 6291583;BA.debugLine="For i = 0 To botoes.Length - 1";
{
final int step99 = 1;
final int limit99 = (int) (mostCurrent._botoes.length-1);
_i = (int) (0) ;
for (;_i <= limit99 ;_i = _i + step99 ) {
RDebugUtils.currentLine=6291585;
 //BA.debugLineNum = 6291585;BA.debugLine="botoes(i).Initialize(\"Event_botoes\")";
mostCurrent._botoes[_i].Initialize(mostCurrent.activityBA,"Event_botoes");
RDebugUtils.currentLine=6291586;
 //BA.debugLineNum = 6291586;BA.debugLine="botoes(i).Color = Colors.Cyan";
mostCurrent._botoes[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=6291587;
 //BA.debugLineNum = 6291587;BA.debugLine="botoes(i).Background = Gradient_border(Colors.Cy";
mostCurrent._botoes[_i].setBackground((android.graphics.drawable.Drawable)(_gradient_border(anywheresoftware.b4a.keywords.Common.Colors.Cyan,anywheresoftware.b4a.keywords.Common.Colors.Cyan,(int) (60)).getObject()));
RDebugUtils.currentLine=6291588;
 //BA.debugLineNum = 6291588;BA.debugLine="botoes(i).Tag = i";
mostCurrent._botoes[_i].setTag((Object)(_i));
RDebugUtils.currentLine=6291590;
 //BA.debugLineNum = 6291590;BA.debugLine="painel_botoes.AddView(botoes(i), esquerda, 0%y,";
mostCurrent._painel_botoes.AddView((android.view.View)(mostCurrent._botoes[_i].getObject()),_esquerda,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),_largura,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=6291592;
 //BA.debugLineNum = 6291592;BA.debugLine="esquerda = esquerda + botoes(i).Width + 1.7%x";
_esquerda = (int) (_esquerda+mostCurrent._botoes[_i].getWidth()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1.7),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=6291595;
 //BA.debugLineNum = 6291595;BA.debugLine="botoes(0).SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._botoes[(int) (0)].SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_add_leitura.ico").getObject()));
RDebugUtils.currentLine=6291596;
 //BA.debugLineNum = 6291596;BA.debugLine="botoes(1).SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._botoes[(int) (1)].SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_anotacao.ico").getObject()));
RDebugUtils.currentLine=6291597;
 //BA.debugLineNum = 6291597;BA.debugLine="botoes(2).SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._botoes[(int) (2)].SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_editar.ico").getObject()));
RDebugUtils.currentLine=6291598;
 //BA.debugLineNum = 6291598;BA.debugLine="botoes(3).SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._botoes[(int) (3)].SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"img_bt_apagar.ico").getObject()));
RDebugUtils.currentLine=6291599;
 //BA.debugLineNum = 6291599;BA.debugLine="botoes(4).SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._botoes[(int) (4)].SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"img_historicos.ico").getObject()));
RDebugUtils.currentLine=6291601;
 //BA.debugLineNum = 6291601;BA.debugLine="dm.topo = dm.topo + painel_botoes.Height + 3%y";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._painel_botoes.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=6291602;
 //BA.debugLineNum = 6291602;BA.debugLine="panel_detalhes.Background = Gradient_border(Color";
mostCurrent._panel_detalhes.setBackground((android.graphics.drawable.Drawable)(_gradient_border(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (239),(int) (239),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (239),(int) (239),(int) (239)),(int) (15)).getObject()));
RDebugUtils.currentLine=6291604;
 //BA.debugLineNum = 6291604;BA.debugLine="scrol.Panel.AddView(panel_detalhes, dm.esquerda,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._panel_detalhes.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (60),mostCurrent.activityBA));
RDebugUtils.currentLine=6291606;
 //BA.debugLineNum = 6291606;BA.debugLine="panel_detalhes.AddView(rot_dt_inicio, dm.esquerda";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._rot_dt_inicio.getObject()),mostCurrent._dm.esquerda /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=6291607;
 //BA.debugLineNum = 6291607;BA.debugLine="panel_detalhes.AddView(lbl_dt_inicio, dm.esquerda";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._lbl_dt_inicio.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._rot_dt_inicio.getHeight()+mostCurrent._rot_dt_inicio.getTop()),(int) (mostCurrent._panel_detalhes.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=6291609;
 //BA.debugLineNum = 6291609;BA.debugLine="panel_detalhes.AddView(rot_dt_termino, dm.esquerd";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._rot_dt_termino.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._lbl_dt_inicio.getTop()+mostCurrent._lbl_dt_inicio.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=6291610;
 //BA.debugLineNum = 6291610;BA.debugLine="panel_detalhes.AddView(lbl_dt_termino, dm.esquerd";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._lbl_dt_termino.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._rot_dt_termino.getHeight()+mostCurrent._rot_dt_termino.getTop()),(int) (mostCurrent._panel_detalhes.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=6291612;
 //BA.debugLineNum = 6291612;BA.debugLine="panel_detalhes.AddView(rot_pg_atual, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._rot_pg_atual.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._lbl_dt_termino.getTop()+mostCurrent._lbl_dt_termino.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=6291613;
 //BA.debugLineNum = 6291613;BA.debugLine="panel_detalhes.AddView(lbl_pg_atual, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._lbl_pg_atual.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._rot_pg_atual.getHeight()+mostCurrent._rot_pg_atual.getTop()),(int) (mostCurrent._panel_detalhes.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=6291615;
 //BA.debugLineNum = 6291615;BA.debugLine="panel_detalhes.AddView(rot_pg_total, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._rot_pg_total.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._lbl_pg_atual.getTop()+mostCurrent._lbl_pg_atual.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=6291616;
 //BA.debugLineNum = 6291616;BA.debugLine="panel_detalhes.AddView(lbl_pg_total, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._lbl_pg_total.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._rot_pg_total.getHeight()+mostCurrent._rot_pg_total.getTop()),(int) (mostCurrent._panel_detalhes.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=6291618;
 //BA.debugLineNum = 6291618;BA.debugLine="panel_detalhes.AddView(rot_pg_meta, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._rot_pg_meta.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._lbl_pg_total.getTop()+mostCurrent._lbl_pg_total.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=6291619;
 //BA.debugLineNum = 6291619;BA.debugLine="panel_detalhes.AddView(lbl_pg_meta, dm.esquerda,";
mostCurrent._panel_detalhes.AddView((android.view.View)(mostCurrent._lbl_pg_meta.getObject()),mostCurrent._dm.esquerda /*int*/ ,(int) (mostCurrent._rot_pg_meta.getHeight()+mostCurrent._rot_pg_meta.getTop()),(int) (mostCurrent._panel_detalhes.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=6291621;
 //BA.debugLineNum = 6291621;BA.debugLine="dm.topo = dm.topo + panel_detalhes.Height + 15dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._panel_detalhes.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=6291622;
 //BA.debugLineNum = 6291622;BA.debugLine="scrol.Panel.Height = dm.topo";
mostCurrent._scrol.getPanel().setHeight(mostCurrent._dm.topo /*int*/ );
RDebugUtils.currentLine=6291623;
 //BA.debugLineNum = 6291623;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _configura_label(String _texto,int _cor_fundo,int _fonte,int _cor_texto) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "configura_label", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "configura_label", new Object[] {_texto,_cor_fundo,_fonte,_cor_texto}));}
anywheresoftware.b4a.objects.LabelWrapper _label = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Configura_label(texto As String, cor_fundo As";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim label As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="label.Initialize(\"\")";
_label.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="label.Text = texto";
_label.setText(BA.ObjectToCharSequence(_texto));
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="label.Color = cor_fundo";
_label.setColor(_cor_fundo);
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="label.TextSize = fonte";
_label.setTextSize((float) (_fonte));
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="label.TextColor = cor_texto";
_label.setTextColor(_cor_texto);
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="Return label";
if (true) return _label;
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.drawable.GradientDrawable  _gradient_border(int _cor_1,int _cor_2,int _corner_radius) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gradient_border", false))
	 {return ((anywheresoftware.b4a.objects.drawable.GradientDrawable) Debug.delegate(mostCurrent.activityBA, "gradient_border", new Object[] {_cor_1,_cor_2,_corner_radius}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _g_p = null;
int[] _cor_p = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Gradient_border(cor_1 As Int, cor_2 As Int, co";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Dim g_p As GradientDrawable";
_g_p = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Dim cor_p(2) As Int";
_cor_p = new int[(int) (2)];
;
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="cor_p(0) = cor_1";
_cor_p[(int) (0)] = _cor_1;
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="cor_p(1) = cor_2";
_cor_p[(int) (1)] = _cor_2;
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="g_p.Initialize(\"TOP_BOTTOM\", cor_p)";
_g_p.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_cor_p);
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="g_p.CornerRadius = corner_radius";
_g_p.setCornerRadius((float) (_corner_radius));
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="Return g_p";
if (true) return _g_p;
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Main.CadastrouAlgo = seguro_cadastrou_algo";
mostCurrent._main._cadastroualgo /*boolean*/  = _seguro_cadastrou_algo;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="seguro_cadastrou_algo = False";
_seguro_cadastrou_algo = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.codigo_laydetalheslivro parent) {
this.parent = parent;
}
b4a.example.codigo_laydetalheslivro parent;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
int _i = 0;
int step17;
int limit17;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="If Main.CadastrouAlgo Then";
if (true) break;

case 1:
//if
this.state = 32;
if (parent.mostCurrent._main._cadastroualgo /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="seguro_cadastrou_algo = Main.CadastrouAlgo";
parent._seguro_cadastrou_algo = parent.mostCurrent._main._cadastroualgo /*boolean*/ ;
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
_cmd = "exec sp_atualiza_leituras "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 31;
this.catchState = 30;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 30;
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigo_laydetalheslivro", "activity_resume"), parent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=6488080;
 //BA.debugLineNum = 6488080;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
if (true) break;

case 7:
//if
this.state = 28;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 2 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(2))) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=6488092;
 //BA.debugLineNum = 6488092;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 17;
}}}
if (true) break;

case 9:
//C
this.state = 28;
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="If CodigoLancamentoLeitura.terminouLeitura The";
if (true) break;

case 12:
//if
this.state = 15;
if (parent.mostCurrent._codigolancamentoleitura._terminouleitura /*boolean*/ ) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="painel_botoes.RemoveViewAt(0)";
parent.mostCurrent._painel_botoes.RemoveViewAt((int) (0));
 if (true) break;

case 15:
//C
this.state = 28;
;
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=6488094;
 //BA.debugLineNum = 6488094;BA.debugLine="For i = 0 To Result.GetString(\"QUANTIDADE\") -";
if (true) break;

case 18:
//for
this.state = 27;
step17 = 1;
limit17 = (int) ((double)(Double.parseDouble(_result.GetString("QUANTIDADE")))-1);
_i = (int) (0) ;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 27;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 20;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=6488096;
 //BA.debugLineNum = 6488096;BA.debugLine="If Result.GetInt(\"fk_id_livro\") = id_livro T";
if (true) break;

case 21:
//if
this.state = 26;
if (_result.GetInt("fk_id_livro")==(double)(Double.parseDouble(parent._id_livro))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=6488098;
 //BA.debugLineNum = 6488098;BA.debugLine="lbl_dt_inicio.Text = Result.GetString(\"data_";
parent.mostCurrent._lbl_dt_inicio.setText(BA.ObjectToCharSequence(_result.GetString("data_inicial")));
RDebugUtils.currentLine=6488099;
 //BA.debugLineNum = 6488099;BA.debugLine="lbl_dt_termino.Text = Result.GetString(\"data";
parent.mostCurrent._lbl_dt_termino.setText(BA.ObjectToCharSequence(_result.GetString("data_prevista_final")));
RDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="lbl_pg_atual.Text = Result.GetInt(\"paginas_o";
parent.mostCurrent._lbl_pg_atual.setText(BA.ObjectToCharSequence(_result.GetInt("paginas_ou_cap_lidos")));
RDebugUtils.currentLine=6488101;
 //BA.debugLineNum = 6488101;BA.debugLine="lbl_pg_total.Text = Result.GetString(\"quanti";
parent.mostCurrent._lbl_pg_total.setText(BA.ObjectToCharSequence(_result.GetString("quantidade_paginas")));
RDebugUtils.currentLine=6488102;
 //BA.debugLineNum = 6488102;BA.debugLine="lbl_pg_meta.Text = Result.GetString(\"meta\")";
parent.mostCurrent._lbl_pg_meta.setText(BA.ObjectToCharSequence(_result.GetString("meta")));
RDebugUtils.currentLine=6488104;
 //BA.debugLineNum = 6488104;BA.debugLine="pg_meta = Result.GetString(\"meta\")";
parent._pg_meta = _result.GetString("meta");
RDebugUtils.currentLine=6488105;
 //BA.debugLineNum = 6488105;BA.debugLine="nome_usuario = Result.GetString(\"usuarioNome";
parent._nome_usuario = _result.GetString("usuarioNome");
RDebugUtils.currentLine=6488106;
 //BA.debugLineNum = 6488106;BA.debugLine="pg_atual = Result.GetString(\"paginas_ou_cap_";
parent._pg_atual = _result.GetString("paginas_ou_cap_lidos");
RDebugUtils.currentLine=6488107;
 //BA.debugLineNum = 6488107;BA.debugLine="tipo_leitura = Result.GetString(\"tipo_de_lei";
parent._tipo_leitura = _result.GetString("tipo_de_leitura");
RDebugUtils.currentLine=6488108;
 //BA.debugLineNum = 6488108;BA.debugLine="pg_total = Result.GetString(\"quantidade_pagi";
parent._pg_total = _result.GetString("quantidade_paginas");
RDebugUtils.currentLine=6488109;
 //BA.debugLineNum = 6488109;BA.debugLine="id_livro = Result.GetString(\"fk_id_livro\")";
parent._id_livro = _result.GetString("fk_id_livro");
RDebugUtils.currentLine=6488110;
 //BA.debugLineNum = 6488110;BA.debugLine="nome_livro = Result.GetString(\"nome\")";
parent._nome_livro = _result.GetString("nome");
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=6488112;
 //BA.debugLineNum = 6488112;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;

case 26:
//C
this.state = 35;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
RDebugUtils.currentLine=6488118;
 //BA.debugLineNum = 6488118;BA.debugLine="ToastMessageShow(\"Algo deu errado\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=6488122;
 //BA.debugLineNum = 6488122;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _bt_voltar_click() throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bt_voltar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bt_voltar_click", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub bt_voltar_Click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public static String  _event_botoes_click() throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_botoes_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_botoes_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _botao = null;
int _numero = 0;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Event_botoes_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim botao As Button";
_botao = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim numero As Int";
_numero = 0;
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="botao.Initialize(\"\")";
_botao.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="botao = Sender";
_botao = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="numero = botao.Tag";
_numero = (int)(BA.ObjectToNumber(_botao.getTag()));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="If numero = 0 Then";
if (_numero==0) { 
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="CodigoLancamentoLeitura.meta = pg_meta";
mostCurrent._codigolancamentoleitura._meta /*int*/  = (int)(Double.parseDouble(_pg_meta));
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nome_usuar";
mostCurrent._codigolancamentoleitura._nomeusuario /*String*/  = _nome_usuario;
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = pg_atual";
mostCurrent._codigolancamentoleitura._paginaatual /*int*/  = (int)(Double.parseDouble(_pg_atual));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipo_leitu";
mostCurrent._codigolancamentoleitura._tipoleitura /*String*/  = _tipo_leitura;
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = pg_total";
mostCurrent._codigolancamentoleitura._totalpaginas /*int*/  = (int)(Double.parseDouble(_pg_total));
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="CodigoLancamentoLeitura.idLivro = id_livro";
mostCurrent._codigolancamentoleitura._idlivro /*int*/  = (int)(Double.parseDouble(_id_livro));
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = nome_livro";
mostCurrent._codigolancamentoleitura._titulolivro /*String*/  = _nome_livro;
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolancamentoleitura.getObject()));
 };
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="End Sub";
return "";
}
}