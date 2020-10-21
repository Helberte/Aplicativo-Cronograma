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

public class act_telacadastro extends Activity implements B4AActivity{
	public static act_telacadastro mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.act_telacadastro");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_telacadastro).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.act_telacadastro");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.act_telacadastro", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_telacadastro) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_telacadastro) Resume **");
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
		return act_telacadastro.class;
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
            BA.LogInfo("** Activity (act_telacadastro) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_telacadastro) Pause event (activity is not paused). **");
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
            act_telacadastro mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_telacadastro) Resume **");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _painelimagem = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcabecalho = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledautorlivro = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmeta = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldataprevistafim = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledtitulolivro = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledpaginasoucap = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneledits = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldadoslivro = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltipoleitura = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmeta = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprevisaotermino = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmaximodigitostitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmaximodigitosautor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmaximodigitospagoucap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmaximodigitosmetapagoucap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblincongruenciatitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblincongruenciaautor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblincongruenciametapagoucap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblincongruenciapagoucap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btcancelar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btsalvar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btaddfoto = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radpagina = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radcapitulo = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrol = null;
public b4a.example.b4ximageview _b4ximagem = null;
public b4a.example.b4xfloattextfield _edb4xfloatnomelivro = null;
public static String _hoje = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbldataprevisao = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquantidadedias = null;
public b4a.example.b4xfloattextfield _edb4xfloatpagoucap = null;
public b4a.example.b4xfloattextfield _edb4xfloatautorlivro = null;
public b4a.example.b4xfloattextfield _edb4xfloatmetapagcap = null;
public static String _dataprevistafinal = "";
public b4a.example.classbancodados _banco = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.LabelWrapper _etiqueta = null;
int _esquerda = 0;
int _toposcrol = 0;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf = null;
int _tamanhoedits = 0;
int _tamanholabelobrigatorio = 0;
int _esquerdadoslabels = 0;
int _tamanhodoslabels = 0;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tl = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _lm = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _pt = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Activity.LoadLayout(\"Lay_TelaCadastro\")";
mostCurrent._activity.LoadLayout("Lay_TelaCadastro",mostCurrent.activityBA);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="painelImagem.Initialize(\"\")";
mostCurrent._painelimagem.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="panelCabecalho.Initialize (\"\")";
mostCurrent._panelcabecalho.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="panelEdTituloLivro.Initialize(\"\")";
mostCurrent._paneledtitulolivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="panelEdAutorLivro.Initialize(\"\")";
mostCurrent._paneledautorlivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="panelEdPaginasOuCap.Initialize(\"\")";
mostCurrent._paneledpaginasoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="panelMeta.Initialize(\"\")";
mostCurrent._panelmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="panelDataPrevistaFim.Initialize(\"\")";
mostCurrent._paneldataprevistafim.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="panelEdits.Initialize(\"\")";
mostCurrent._paneledits.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="lblDadosLivro.Initialize(\"\")";
mostCurrent._lbldadoslivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="lblTipoLeitura.Initialize(\"\")";
mostCurrent._lbltipoleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="lblMeta.Initialize(\"\")";
mostCurrent._lblmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="lblPrevisaoTermino.Initialize(\"\")";
mostCurrent._lblprevisaotermino.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="lblMaximoDigitosTitulo.Initialize(\"\")";
mostCurrent._lblmaximodigitostitulo.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="lblMaximoDigitosAutor.Initialize(\"\")";
mostCurrent._lblmaximodigitosautor.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="lblMaximoDigitosPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitospagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitosmetapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="lblIncongruenciaTitulo.Initialize(\"\")";
mostCurrent._lblincongruenciatitulo.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="lblIncongruenciaAutor.Initialize(\"\")";
mostCurrent._lblincongruenciaautor.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="lblIncongruenciaMetaPagOuCap.Initialize(\"\")";
mostCurrent._lblincongruenciametapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="lblIncongruenciaPagOuCap.Initialize(\"\")";
mostCurrent._lblincongruenciapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="btCancelar.Initialize (\"Event_btCancelar\")";
mostCurrent._btcancelar.Initialize(mostCurrent.activityBA,"Event_btCancelar");
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="btSalvar.Initialize(\"Event_btSalvar\")";
mostCurrent._btsalvar.Initialize(mostCurrent.activityBA,"Event_btSalvar");
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="btAddFoto.Initialize(\"\")";
mostCurrent._btaddfoto.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="radPagina.Initialize(\"radPagina\")";
mostCurrent._radpagina.Initialize(mostCurrent.activityBA,"radPagina");
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="radCapitulo.Initialize(\"radCapitulo\")";
mostCurrent._radcapitulo.Initialize(mostCurrent.activityBA,"radCapitulo");
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="radPagina.Checked = True";
mostCurrent._radpagina.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="scrol.Initialize( 500 )";
mostCurrent._scrol.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="Main.fotos.Initialize(\"CC\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("CC");
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="Dim etiqueta As Label";
_etiqueta = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="etiqueta.Initialize(\"\")";
_etiqueta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522027;
 //BA.debugLineNum = 4522027;BA.debugLine="lblMaximoDigitosTitulo.Text = \"0/100 \"";
mostCurrent._lblmaximodigitostitulo.setText(BA.ObjectToCharSequence("0/100 "));
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="lblMaximoDigitosAutor.Text = \"0/100 \"";
mostCurrent._lblmaximodigitosautor.setText(BA.ObjectToCharSequence("0/100 "));
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="lblMaximoDigitosPagOuCap.Text = \"0/4 \"";
mostCurrent._lblmaximodigitospagoucap.setText(BA.ObjectToCharSequence("0/4 "));
RDebugUtils.currentLine=4522030;
 //BA.debugLineNum = 4522030;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = \"0/4 \"";
mostCurrent._lblmaximodigitosmetapagoucap.setText(BA.ObjectToCharSequence("0/4 "));
RDebugUtils.currentLine=4522032;
 //BA.debugLineNum = 4522032;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522033;
 //BA.debugLineNum = 4522033;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522034;
 //BA.debugLineNum = 4522034;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Black";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522035;
 //BA.debugLineNum = 4522035;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.B";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522037;
 //BA.debugLineNum = 4522037;BA.debugLine="lblIncongruenciaAutor.TextColor = Colors.Red";
mostCurrent._lblincongruenciaautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=4522038;
 //BA.debugLineNum = 4522038;BA.debugLine="lblIncongruenciaMetaPagOuCap.TextColor = Colors.R";
mostCurrent._lblincongruenciametapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=4522039;
 //BA.debugLineNum = 4522039;BA.debugLine="lblIncongruenciaPagOuCap.TextColor = Colors.Red";
mostCurrent._lblincongruenciapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=4522040;
 //BA.debugLineNum = 4522040;BA.debugLine="lblIncongruenciaTitulo.TextColor = Colors.Red";
mostCurrent._lblincongruenciatitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=4522042;
 //BA.debugLineNum = 4522042;BA.debugLine="panelCabecalho.Color = Colors.RGB(0,165,255)";
mostCurrent._panelcabecalho.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (165),(int) (255)));
RDebugUtils.currentLine=4522043;
 //BA.debugLineNum = 4522043;BA.debugLine="Activity.AddView(panelCabecalho, 0%x, 0%y, 100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelcabecalho.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=4522045;
 //BA.debugLineNum = 4522045;BA.debugLine="btCancelar.Color = Colors.Transparent";
mostCurrent._btcancelar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522046;
 //BA.debugLineNum = 4522046;BA.debugLine="btCancelar.Text = \"CANCELAR\"";
mostCurrent._btcancelar.setText(BA.ObjectToCharSequence("CANCELAR"));
RDebugUtils.currentLine=4522047;
 //BA.debugLineNum = 4522047;BA.debugLine="btCancelar.TextSize = 19";
mostCurrent._btcancelar.setTextSize((float) (19));
RDebugUtils.currentLine=4522048;
 //BA.debugLineNum = 4522048;BA.debugLine="btCancelar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btcancelar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=4522050;
 //BA.debugLineNum = 4522050;BA.debugLine="btSalvar.Color = Colors.Transparent";
mostCurrent._btsalvar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522051;
 //BA.debugLineNum = 4522051;BA.debugLine="btSalvar.Text = \"SALVAR\"";
mostCurrent._btsalvar.setText(BA.ObjectToCharSequence("SALVAR"));
RDebugUtils.currentLine=4522052;
 //BA.debugLineNum = 4522052;BA.debugLine="btSalvar.TextSize = 19";
mostCurrent._btsalvar.setTextSize((float) (19));
RDebugUtils.currentLine=4522053;
 //BA.debugLineNum = 4522053;BA.debugLine="btSalvar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btsalvar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=4522056;
 //BA.debugLineNum = 4522056;BA.debugLine="panelCabecalho.AddView(btCancelar, 1%x,  1%y, 35%";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btcancelar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=4522057;
 //BA.debugLineNum = 4522057;BA.debugLine="Dim esquerda As Int = 100%x - btCancelar.Width -";
_esquerda = (int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btcancelar.getWidth()-mostCurrent._btcancelar.getLeft());
RDebugUtils.currentLine=4522058;
 //BA.debugLineNum = 4522058;BA.debugLine="panelCabecalho.AddView(btSalvar, esquerda, 1%y, 3";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btsalvar.getObject()),_esquerda,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=4522061;
 //BA.debugLineNum = 4522061;BA.debugLine="scrol.Color = Colors.Cyan";
mostCurrent._scrol.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=4522062;
 //BA.debugLineNum = 4522062;BA.debugLine="scrol.Panel.Color = Colors.RGB(223,223,223)";
mostCurrent._scrol.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (223),(int) (223),(int) (223)));
RDebugUtils.currentLine=4522064;
 //BA.debugLineNum = 4522064;BA.debugLine="Dim topoScrol As Int = panelCabecalho.Top + panel";
_toposcrol = (int) (mostCurrent._panelcabecalho.getTop()+mostCurrent._panelcabecalho.getHeight());
RDebugUtils.currentLine=4522065;
 //BA.debugLineNum = 4522065;BA.debugLine="Activity.AddView(scrol, 0%x, topoScrol , 100%x, 1";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._scrol.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),_toposcrol,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-_toposcrol));
RDebugUtils.currentLine=4522067;
 //BA.debugLineNum = 4522067;BA.debugLine="lblDadosLivro.Color = Colors.Transparent";
mostCurrent._lbldadoslivro.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522068;
 //BA.debugLineNum = 4522068;BA.debugLine="lblDadosLivro.Text = \"Dados do Livro\"";
mostCurrent._lbldadoslivro.setText(BA.ObjectToCharSequence("Dados do Livro"));
RDebugUtils.currentLine=4522069;
 //BA.debugLineNum = 4522069;BA.debugLine="lblDadosLivro.TextColor = Colors.Black";
mostCurrent._lbldadoslivro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522070;
 //BA.debugLineNum = 4522070;BA.debugLine="lblDadosLivro.TextSize = 17";
mostCurrent._lbldadoslivro.setTextSize((float) (17));
RDebugUtils.currentLine=4522074;
 //BA.debugLineNum = 4522074;BA.debugLine="Dim tf As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=4522075;
 //BA.debugLineNum = 4522075;BA.debugLine="tf = tf.CreateNew(Typeface.DEFAULT_BOLD, Typeface";
_tf = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_tf.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=4522076;
 //BA.debugLineNum = 4522076;BA.debugLine="lblDadosLivro.Typeface = tf";
mostCurrent._lbldadoslivro.setTypeface((android.graphics.Typeface)(_tf.getObject()));
RDebugUtils.currentLine=4522085;
 //BA.debugLineNum = 4522085;BA.debugLine="lblDadosLivro.Gravity = Gravity.CENTER";
mostCurrent._lbldadoslivro.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522087;
 //BA.debugLineNum = 4522087;BA.debugLine="scrol.Panel.AddView(lblDadosLivro, 0%x, 0%y, 100%";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbldadoslivro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522089;
 //BA.debugLineNum = 4522089;BA.debugLine="painelImagem.Width = 98%x";
mostCurrent._painelimagem.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA));
RDebugUtils.currentLine=4522093;
 //BA.debugLineNum = 4522093;BA.debugLine="Dim esquerda As Int = (100%x - painelImagem.Width";
_esquerda = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._painelimagem.getWidth())/(double)2);
RDebugUtils.currentLine=4522094;
 //BA.debugLineNum = 4522094;BA.debugLine="Dim tamanhoEdits As Int = painelImagem.Width";
_tamanhoedits = mostCurrent._painelimagem.getWidth();
RDebugUtils.currentLine=4522096;
 //BA.debugLineNum = 4522096;BA.debugLine="scrol.Panel.AddView(painelImagem, esquerda , lblD";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painelimagem.getObject()),_esquerda,(int) (mostCurrent._lbldadoslivro.getTop()+mostCurrent._lbldadoslivro.getHeight()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=4522098;
 //BA.debugLineNum = 4522098;BA.debugLine="painelImagem.LoadLayout(\"Lay_Imagem\")";
mostCurrent._painelimagem.LoadLayout("Lay_Imagem",mostCurrent.activityBA);
RDebugUtils.currentLine=4522100;
 //BA.debugLineNum = 4522100;BA.debugLine="B4XImagem.ResizeMode = \"FILL\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=4522101;
 //BA.debugLineNum = 4522101;BA.debugLine="B4XImagem.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4ximagem._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=4522103;
 //BA.debugLineNum = 4522103;BA.debugLine="scrol.Panel.Height = painelImagem.Top + painelIma";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()));
RDebugUtils.currentLine=4522105;
 //BA.debugLineNum = 4522105;BA.debugLine="scrol.Panel.AddView(panelEdits, esquerda, painelI";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledits.getObject()),_esquerda,(int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),_tamanhoedits,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=4522106;
 //BA.debugLineNum = 4522106;BA.debugLine="panelEdits.LoadLayout(\"Lay_edTituloLivro\")";
mostCurrent._paneledits.LoadLayout("Lay_edTituloLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=4522107;
 //BA.debugLineNum = 4522107;BA.debugLine="scrol.Panel.Height = panelEdits.Top + panelEdits.";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()));
RDebugUtils.currentLine=4522110;
 //BA.debugLineNum = 4522110;BA.debugLine="Dim tamanhoLabelObrigatorio As Int = (100%x / 2)";
_tamanholabelobrigatorio = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)/(double)2)-_esquerda);
RDebugUtils.currentLine=4522111;
 //BA.debugLineNum = 4522111;BA.debugLine="Dim esquerdaDosLabels As Int = esquerda + tamanho";
_esquerdadoslabels = (int) (_esquerda+_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522112;
 //BA.debugLineNum = 4522112;BA.debugLine="Dim tamanhoDosLabels As Int = panelEdits.Width -";
_tamanhodoslabels = (int) (mostCurrent._paneledits.getWidth()-_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522114;
 //BA.debugLineNum = 4522114;BA.debugLine="lblIncongruenciaTitulo.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciatitulo.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=4522115;
 //BA.debugLineNum = 4522115;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaTitulo, pa";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciatitulo,(int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()),_esquerda,_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522116;
 //BA.debugLineNum = 4522116;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitostitulo,(int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()),_esquerdadoslabels,_tamanhodoslabels);
RDebugUtils.currentLine=4522117;
 //BA.debugLineNum = 4522117;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=4522119;
 //BA.debugLineNum = 4522119;BA.debugLine="scrol.Panel.AddView(panelEdAutorLivro, esquerda,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledautorlivro.getObject()),_esquerda,(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),_tamanhoedits,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=4522120;
 //BA.debugLineNum = 4522120;BA.debugLine="panelEdAutorLivro.LoadLayout(\"Lay_edAutorLivro\")";
mostCurrent._paneledautorlivro.LoadLayout("Lay_edAutorLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=4522122;
 //BA.debugLineNum = 4522122;BA.debugLine="lblIncongruenciaAutor.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciaautor.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=4522123;
 //BA.debugLineNum = 4522123;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaAutor,pane";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciaautor,(int) (mostCurrent._paneledautorlivro.getTop()+mostCurrent._paneledautorlivro.getHeight()),_esquerda,_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522124;
 //BA.debugLineNum = 4522124;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitosautor,(int) (mostCurrent._paneledautorlivro.getTop()+mostCurrent._paneledautorlivro.getHeight()),_esquerdadoslabels,_tamanhodoslabels);
RDebugUtils.currentLine=4522125;
 //BA.debugLineNum = 4522125;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=4522127;
 //BA.debugLineNum = 4522127;BA.debugLine="lblTipoLeitura.Color = Colors.Transparent";
mostCurrent._lbltipoleitura.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522128;
 //BA.debugLineNum = 4522128;BA.debugLine="lblTipoLeitura.Text = \"Tipo de leitura\"";
mostCurrent._lbltipoleitura.setText(BA.ObjectToCharSequence("Tipo de leitura"));
RDebugUtils.currentLine=4522129;
 //BA.debugLineNum = 4522129;BA.debugLine="lblTipoLeitura.TextColor = Colors.Black";
mostCurrent._lbltipoleitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522130;
 //BA.debugLineNum = 4522130;BA.debugLine="lblTipoLeitura.TextSize = 17";
mostCurrent._lbltipoleitura.setTextSize((float) (17));
RDebugUtils.currentLine=4522132;
 //BA.debugLineNum = 4522132;BA.debugLine="Dim tl As Typeface";
_tl = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=4522133;
 //BA.debugLineNum = 4522133;BA.debugLine="tl = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_tl = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=4522134;
 //BA.debugLineNum = 4522134;BA.debugLine="lblTipoLeitura.Typeface = tl";
mostCurrent._lbltipoleitura.setTypeface((android.graphics.Typeface)(_tl.getObject()));
RDebugUtils.currentLine=4522135;
 //BA.debugLineNum = 4522135;BA.debugLine="lblTipoLeitura.Gravity = Gravity.CENTER";
mostCurrent._lbltipoleitura.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522137;
 //BA.debugLineNum = 4522137;BA.debugLine="scrol.Panel.AddView(lblTipoLeitura, 0%x, lblMaxim";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbltipoleitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lblmaximodigitosautor.getTop()+mostCurrent._lblmaximodigitosautor.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522138;
 //BA.debugLineNum = 4522138;BA.debugLine="scrol.Panel.Height = lblTipoLeitura.Top + lblTipo";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()));
RDebugUtils.currentLine=4522140;
 //BA.debugLineNum = 4522140;BA.debugLine="radPagina.Text = \"Por página\"";
mostCurrent._radpagina.setText(BA.ObjectToCharSequence("Por página"));
RDebugUtils.currentLine=4522141;
 //BA.debugLineNum = 4522141;BA.debugLine="radPagina.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radpagina.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=4522142;
 //BA.debugLineNum = 4522142;BA.debugLine="radPagina.TextSize = 16";
mostCurrent._radpagina.setTextSize((float) (16));
RDebugUtils.currentLine=4522143;
 //BA.debugLineNum = 4522143;BA.debugLine="radPagina.Gravity = Gravity.CENTER";
mostCurrent._radpagina.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522145;
 //BA.debugLineNum = 4522145;BA.debugLine="radCapitulo.Text = \"Por capítulo\"";
mostCurrent._radcapitulo.setText(BA.ObjectToCharSequence("Por capítulo"));
RDebugUtils.currentLine=4522146;
 //BA.debugLineNum = 4522146;BA.debugLine="radCapitulo.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radcapitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=4522147;
 //BA.debugLineNum = 4522147;BA.debugLine="radCapitulo.TextSize = 16";
mostCurrent._radcapitulo.setTextSize((float) (16));
RDebugUtils.currentLine=4522148;
 //BA.debugLineNum = 4522148;BA.debugLine="radCapitulo.Gravity = Gravity.CENTER";
mostCurrent._radcapitulo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522150;
 //BA.debugLineNum = 4522150;BA.debugLine="scrol.Panel.AddView(radPagina, 0%x , lblTipoLeitu";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radpagina.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522152;
 //BA.debugLineNum = 4522152;BA.debugLine="scrol.Panel.AddView(radCapitulo, radPagina.Width,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radcapitulo.getObject()),mostCurrent._radpagina.getWidth(),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522153;
 //BA.debugLineNum = 4522153;BA.debugLine="scrol.Panel.Height = radPagina.Top + radPagina.He";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._radpagina.getTop()+mostCurrent._radpagina.getHeight()));
RDebugUtils.currentLine=4522155;
 //BA.debugLineNum = 4522155;BA.debugLine="scrol.Panel.AddView(panelEdPaginasOuCap, esquerda";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledpaginasoucap.getObject()),_esquerda,(int) (mostCurrent._radcapitulo.getTop()+mostCurrent._radcapitulo.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),_tamanhoedits,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=4522156;
 //BA.debugLineNum = 4522156;BA.debugLine="panelEdPaginasOuCap.LoadLayout(\"Lay_edPagOuCapitu";
mostCurrent._paneledpaginasoucap.LoadLayout("Lay_edPagOuCapitulo",mostCurrent.activityBA);
RDebugUtils.currentLine=4522158;
 //BA.debugLineNum = 4522158;BA.debugLine="lblIncongruenciaPagOuCap.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciapagoucap.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=4522159;
 //BA.debugLineNum = 4522159;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaPagOuCap,";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciapagoucap,(int) (mostCurrent._paneledpaginasoucap.getTop()+mostCurrent._paneledpaginasoucap.getHeight()),_esquerda,_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522160;
 //BA.debugLineNum = 4522160;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitospagoucap,(int) (mostCurrent._paneledpaginasoucap.getTop()+mostCurrent._paneledpaginasoucap.getHeight()),_esquerdadoslabels,_tamanhodoslabels);
RDebugUtils.currentLine=4522161;
 //BA.debugLineNum = 4522161;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=4522163;
 //BA.debugLineNum = 4522163;BA.debugLine="lblMeta.Color = Colors.Transparent";
mostCurrent._lblmeta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522164;
 //BA.debugLineNum = 4522164;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas / cap ler";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas / cap ler por dia?"));
RDebugUtils.currentLine=4522165;
 //BA.debugLineNum = 4522165;BA.debugLine="lblMeta.TextColor = Colors.Black";
mostCurrent._lblmeta.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522166;
 //BA.debugLineNum = 4522166;BA.debugLine="lblMeta.TextSize = 17";
mostCurrent._lblmeta.setTextSize((float) (17));
RDebugUtils.currentLine=4522168;
 //BA.debugLineNum = 4522168;BA.debugLine="Dim lm As Typeface";
_lm = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=4522169;
 //BA.debugLineNum = 4522169;BA.debugLine="lm = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_lm = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=4522170;
 //BA.debugLineNum = 4522170;BA.debugLine="lblMeta.Typeface = lm";
mostCurrent._lblmeta.setTypeface((android.graphics.Typeface)(_lm.getObject()));
RDebugUtils.currentLine=4522171;
 //BA.debugLineNum = 4522171;BA.debugLine="lblMeta.Gravity = Gravity.CENTER";
mostCurrent._lblmeta.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522173;
 //BA.debugLineNum = 4522173;BA.debugLine="scrol.Panel.AddView(lblMeta, 0%x, etiqueta.Top +";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblmeta.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522174;
 //BA.debugLineNum = 4522174;BA.debugLine="scrol.Panel.Height = lblMeta.Top + lblMeta.Height";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()));
RDebugUtils.currentLine=4522176;
 //BA.debugLineNum = 4522176;BA.debugLine="scrol.Panel.AddView(panelMeta, esquerda, lblMeta.";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._panelmeta.getObject()),_esquerda,(int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),_tamanhoedits,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=4522177;
 //BA.debugLineNum = 4522177;BA.debugLine="panelMeta.LoadLayout(\"Lay_edMetaPagCap\")";
mostCurrent._panelmeta.LoadLayout("Lay_edMetaPagCap",mostCurrent.activityBA);
RDebugUtils.currentLine=4522179;
 //BA.debugLineNum = 4522179;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciametapagoucap.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=4522180;
 //BA.debugLineNum = 4522180;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaMetaPagOuC";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciametapagoucap,(int) (mostCurrent._panelmeta.getTop()+mostCurrent._panelmeta.getHeight()),_esquerda,_tamanholabelobrigatorio);
RDebugUtils.currentLine=4522181;
 //BA.debugLineNum = 4522181;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitosmetapagoucap,(int) (mostCurrent._panelmeta.getTop()+mostCurrent._panelmeta.getHeight()),_esquerdadoslabels,_tamanhodoslabels);
RDebugUtils.currentLine=4522182;
 //BA.debugLineNum = 4522182;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=4522184;
 //BA.debugLineNum = 4522184;BA.debugLine="lblPrevisaoTermino.Color = Colors.Transparent";
mostCurrent._lblprevisaotermino.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522185;
 //BA.debugLineNum = 4522185;BA.debugLine="lblPrevisaoTermino.Text = \"Previsão para término\"";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence("Previsão para término"));
RDebugUtils.currentLine=4522186;
 //BA.debugLineNum = 4522186;BA.debugLine="lblPrevisaoTermino.TextColor = Colors.Black";
mostCurrent._lblprevisaotermino.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4522187;
 //BA.debugLineNum = 4522187;BA.debugLine="lblPrevisaoTermino.TextSize = 17";
mostCurrent._lblprevisaotermino.setTextSize((float) (17));
RDebugUtils.currentLine=4522189;
 //BA.debugLineNum = 4522189;BA.debugLine="Dim pt As Typeface";
_pt = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=4522190;
 //BA.debugLineNum = 4522190;BA.debugLine="pt = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_pt = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=4522191;
 //BA.debugLineNum = 4522191;BA.debugLine="lblPrevisaoTermino.Typeface = pt";
mostCurrent._lblprevisaotermino.setTypeface((android.graphics.Typeface)(_pt.getObject()));
RDebugUtils.currentLine=4522192;
 //BA.debugLineNum = 4522192;BA.debugLine="lblPrevisaoTermino.Gravity = Gravity.CENTER";
mostCurrent._lblprevisaotermino.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522194;
 //BA.debugLineNum = 4522194;BA.debugLine="scrol.Panel.AddView(lblPrevisaoTermino, 0%x, etiq";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblprevisaotermino.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522195;
 //BA.debugLineNum = 4522195;BA.debugLine="scrol.Panel.Height = lblPrevisaoTermino.Top + lbl";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()));
RDebugUtils.currentLine=4522197;
 //BA.debugLineNum = 4522197;BA.debugLine="panelDataPrevistaFim.Color = Colors.Blue";
mostCurrent._paneldataprevistafim.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=4522198;
 //BA.debugLineNum = 4522198;BA.debugLine="scrol.Panel.AddView(panelDataPrevistaFim, esquerd";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneldataprevistafim.getObject()),_esquerda,(int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=4522199;
 //BA.debugLineNum = 4522199;BA.debugLine="panelDataPrevistaFim.LoadLayout(\"Lay_Previsao_ter";
mostCurrent._paneldataprevistafim.LoadLayout("Lay_Previsao_termino",mostCurrent.activityBA);
RDebugUtils.currentLine=4522200;
 //BA.debugLineNum = 4522200;BA.debugLine="scrol.Panel.Height = panelDataPrevistaFim.Top + p";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneldataprevistafim.getTop()+mostCurrent._paneldataprevistafim.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
RDebugUtils.currentLine=4522202;
 //BA.debugLineNum = 4522202;BA.debugLine="hoje = \"Dia: \" & DateTime.Date(DateTime.Now)";
mostCurrent._hoje = "Dia: "+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=4522203;
 //BA.debugLineNum = 4522203;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=4522205;
 //BA.debugLineNum = 4522205;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522206;
 //BA.debugLineNum = 4522206;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522207;
 //BA.debugLineNum = 4522207;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522208;
 //BA.debugLineNum = 4522208;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522209;
 //BA.debugLineNum = 4522209;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522211;
 //BA.debugLineNum = 4522211;BA.debugLine="lblIncongruenciaAutor.Visible = False";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522212;
 //BA.debugLineNum = 4522212;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522213;
 //BA.debugLineNum = 4522213;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522214;
 //BA.debugLineNum = 4522214;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522215;
 //BA.debugLineNum = 4522215;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _addlabel(Object _gravidade,anywheresoftware.b4a.objects.LabelWrapper _etiqueta,int _topo,int _esquerda,int _tamanho) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addlabel", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "addlabel", new Object[] {_gravidade,_etiqueta,_topo,_esquerda,_tamanho}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub AddLabel(gravidade As Object, etiqueta As Labe";
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="etiqueta.Gravity = Bit.Or(gravidade, Gravity.CENT";
_etiqueta.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or((int)(BA.ObjectToNumber(_gravidade)),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="etiqueta.Color = Colors.Transparent";
_etiqueta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="scrol.Panel.AddView(etiqueta, esquerda, topo, tam";
mostCurrent._scrol.getPanel().AddView((android.view.View)(_etiqueta.getObject()),_esquerda,_topo,_tamanho,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="Return etiqueta";
if (true) return _etiqueta;
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="btCancelar.Top = -5%y";
mostCurrent._btcancelar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="btCancelar.TextColor = Colors.Transparent";
mostCurrent._btcancelar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="btCancelar.SetLayoutAnimated(1000, 1%x, 1%y, 35%x";
mostCurrent._btcancelar.SetLayoutAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="btCancelar.SetTextColorAnimated(1500, Colors.RGB(";
mostCurrent._btcancelar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="btSalvar.Top = -5%y";
mostCurrent._btsalvar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="btSalvar.TextColor = Colors.Transparent";
mostCurrent._btsalvar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="btSalvar.SetLayoutAnimated(1000, 100%x - btSalvar";
mostCurrent._btsalvar.SetLayoutAnimated((int) (1000),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btsalvar.getWidth()-mostCurrent._btcancelar.getLeft()),mostCurrent._btcancelar.getTop(),mostCurrent._btcancelar.getWidth(),mostCurrent._btcancelar.getHeight());
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="btSalvar.SetTextColorAnimated(1500, Colors.RGB(21";
mostCurrent._btsalvar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="End Sub";
return "";
}
public static String  _btaddimagem_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btaddimagem_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btaddimagem_click", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub btAddImagem_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(processBA,"image/*","Choose image");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha!"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="End Sub";
return "";
}
public static String  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cc_result", new Object[] {_success,_dir,_filename}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="B4XImagem.ResizeMode = \"FIT\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FIT");
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="B4XImagem.Load(Dir, FileName)";
mostCurrent._b4ximagem._load /*String*/ (null,_dir,_filename);
 }else {
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Nenhuma foto escolhida"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatautorlivro_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatautorlivro_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatautorlivro_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub edB4XFloatAutorLivro_FocusChanged (HasFocus As";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="lblMaximoDigitosAutor.Visible = True";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatautorlivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub edB4XFloatAutorLivro_TextChanged (Old As Strin";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="edB4XFloatAutorLivro.Text = edB4XFloatAutorLivro";
mostCurrent._edb4xfloatautorlivro._settext /*String*/ (null,mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="If New.Length > 100 Then";
if (_new.length()>100) { 
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="lblIncongruenciaAutor.Visible = True";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="lblIncongruenciaAutor.Text = \" Texto inválido\"";
mostCurrent._lblincongruenciaautor.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Red";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="lblIncongruenciaAutor.Visible = False";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 };
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="lblMaximoDigitosAutor.Text = New.Length & \"/100 \"";
mostCurrent._lblmaximodigitosautor.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/100 "));
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatmetapagcap_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub edB4XFloatMetaPagCap_FocusChanged (HasFocus As";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = True";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatmetapagcap_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_textchanged", new Object[] {_old,_new}));}
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub edB4XFloatMetaPagCap_TextChanged (Old As Strin";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = New.Length &";
mostCurrent._lblmaximodigitosmetapagoucap.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/4 "));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Dim meta As Int = New";
_meta = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="quantPag = edB4XFloatPagOuCap.Text";
_quantpag = (int)(Double.parseDouble(mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=5308439;
 //BA.debugLineNum = 5308439;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence("Dia: "+_data));
 }else {
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=5308447;
 //BA.debugLineNum = 5308447;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5308450;
 //BA.debugLineNum = 5308450;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
RDebugUtils.currentLine=5308451;
 //BA.debugLineNum = 5308451;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = True";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5308452;
 //BA.debugLineNum = 5308452;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \" Texto invá";
mostCurrent._lblincongruenciametapagoucap.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=5308455;
 //BA.debugLineNum = 5308455;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5308456;
 //BA.debugLineNum = 5308456;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 };
RDebugUtils.currentLine=5308458;
 //BA.debugLineNum = 5308458;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatnomelivro_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatnomelivro_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatnomelivro_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub edB4XFloatNomeLivro_FocusChanged (HasFocus As";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="lblMaximoDigitosTitulo.Visible = True";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatnomelivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub edB4XFloatNomeLivro_TextChanged (Old As String";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="edB4XFloatNomeLivro.Text = edB4XFloatNomeLivro.T";
mostCurrent._edb4xfloatnomelivro._settext /*String*/ (null,mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="If New.Length > 100 Then";
if (_new.length()>100) { 
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="lblIncongruenciaTitulo.Visible = True";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="lblIncongruenciaTitulo.Text = \" Texto inválido\"";
mostCurrent._lblincongruenciatitulo.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Red";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 };
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="lblMaximoDigitosTitulo.Text = New.Length & \"/100";
mostCurrent._lblmaximodigitostitulo.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/100 "));
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatpagoucap_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatpagoucap_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatpagoucap_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub edB4XFloatPagOuCap_FocusChanged (HasFocus As B";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = True";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatpagoucap_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatpagoucap_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatpagoucap_textchanged", new Object[] {_old,_new}));}
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub edB4XFloatPagOuCap_TextChanged (Old As String,";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="lblMaximoDigitosPagOuCap.Text = New.Length & \"/4";
mostCurrent._lblmaximodigitospagoucap.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/4 "));
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Dim meta As Int";
_meta = 0;
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="quantPag = New";
_quantpag = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence("Dia: "+_data));
 }else {
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=5373980;
 //BA.debugLineNum = 5373980;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=5373984;
 //BA.debugLineNum = 5373984;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=5373985;
 //BA.debugLineNum = 5373985;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5373988;
 //BA.debugLineNum = 5373988;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
RDebugUtils.currentLine=5373989;
 //BA.debugLineNum = 5373989;BA.debugLine="lblIncongruenciaPagOuCap.Visible = True";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5373990;
 //BA.debugLineNum = 5373990;BA.debugLine="lblIncongruenciaPagOuCap.Text = \" Texto inválido";
mostCurrent._lblincongruenciapagoucap.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=5373991;
 //BA.debugLineNum = 5373991;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Red";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=5373993;
 //BA.debugLineNum = 5373993;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5373994;
 //BA.debugLineNum = 5373994;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Blac";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 };
RDebugUtils.currentLine=5373996;
 //BA.debugLineNum = 5373996;BA.debugLine="End Sub";
return "";
}
public static String  _event_btcancelar_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_btcancelar_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Event_btCancelar_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="btCancelar.SetColorAnimated(100, Colors.RGB(82,18";
mostCurrent._btcancelar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="End Sub";
return "";
}
public static void  _event_btsalvar_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btsalvar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "event_btsalvar_click", null); return;}
ResumableSub_Event_btSalvar_Click rsub = new ResumableSub_Event_btSalvar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Event_btSalvar_Click extends BA.ResumableSub {
public ResumableSub_Event_btSalvar_Click(b4a.example.act_telacadastro parent) {
this.parent = parent;
}
b4a.example.act_telacadastro parent;
String _pag_ou_cap = "";
int _meta = 0;
int _quantidade_pag_cap = 0;
String _cmd = "";
String _datainicial = "";
String _tipoleitura = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_telacadastro";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="btSalvar.SetColorAnimated(100, Colors.RGB(82,183,";
parent.mostCurrent._btsalvar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim pag_ou_cap As String";
_pag_ou_cap = "";
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="If edB4XFloatNomeLivro.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 46;
if ((parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Else If edB4XFloatAutorLivro.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 46;
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o título do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 5:
//C
this.state = 46;
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
_pag_ou_cap = "Quantos capítulos";
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
if (true) break;

case 8:
//if
this.state = 13;
if (parent.mostCurrent._radpagina.getChecked()) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_pag_ou_cap = "Quantas páginas";
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim = \"\" Then";
if (true) break;

case 14:
//if
this.state = 45;
if ((parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 16;
}else 
{RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="else If edB4XFloatMetaPagCap.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 18;
}else {
this.state = 20;
}}
if (true) break;

case 16:
//C
this.state = 45;
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! "+_pag_ou_cap+" o livro tem?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 18:
//C
this.state = 45;
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual a sua meta diária?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
_meta = 0;
_quantidade_pag_cap = 0;
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="quantidade_pag_cap = edB4XFloatPagOuCap.Text";
_quantidade_pag_cap = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="If meta > quantidade_pag_cap Then";
if (true) break;

case 21:
//if
this.state = 44;
if (_meta>_quantidade_pag_cap) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 44;
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Informações incoerentes"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 43;
this.catchState = 42;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 42;
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
_cmd = "";
_datainicial = "";
_tipoleitura = "";
RDebugUtils.currentLine=4849701;
 //BA.debugLineNum = 4849701;BA.debugLine="tipoLeitura = \"páginas\"";
_tipoleitura = "páginas";
RDebugUtils.currentLine=4849702;
 //BA.debugLineNum = 4849702;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"ca";
if (true) break;

case 29:
//if
this.state = 34;
if (parent.mostCurrent._radcapitulo.getChecked()) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_tipoleitura = "capítulos";
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=4849704;
 //BA.debugLineNum = 4849704;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
_datainicial = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edB4XFl";
_cmd = "exec sp_cad_livro_leitura '"+parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null)+"', '"+parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null)+"', '"+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+"', '"+_datainicial+"', '"+_tipoleitura+"', '"+parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)+"', '"+parent.mostCurrent._dataprevistafinal+"', '"+parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)+"'";
RDebugUtils.currentLine=4849715;
 //BA.debugLineNum = 4849715;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=4849717;
 //BA.debugLineNum = 4849717;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=4849719;
 //BA.debugLineNum = 4849719;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
if (true) break;

case 35:
//if
this.state = 40;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 37;
}else 
{RDebugUtils.currentLine=4849727;
 //BA.debugLineNum = 4849727;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 The";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 39;
}}
if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=4849721;
 //BA.debugLineNum = 4849721;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4849722;
 //BA.debugLineNum = 4849722;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4849723;
 //BA.debugLineNum = 4849723;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
RDebugUtils.currentLine=4849724;
 //BA.debugLineNum = 4849724;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=4849725;
 //BA.debugLineNum = 4849725;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=4849729;
 //BA.debugLineNum = 4849729;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4849730;
 //BA.debugLineNum = 4849730;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!!"),processBA);
RDebugUtils.currentLine=4849731;
 //BA.debugLineNum = 4849731;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
RDebugUtils.currentLine=4849732;
 //BA.debugLineNum = 4849732;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=4849733;
 //BA.debugLineNum = 4849733;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 40:
//C
this.state = 43;
;
 if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 0;
RDebugUtils.currentLine=4849737;
 //BA.debugLineNum = 4849737;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao tentar estabelecer a conexão. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção"),processBA);
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 0;
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=4849742;
 //BA.debugLineNum = 4849742;BA.debugLine="End Sub";
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
public static String  _radcapitulo_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radcapitulo_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radcapitulo_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 }else {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 };
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return "";
}
public static String  _radpagina_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radpagina_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radpagina_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 }else {
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 };
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="End Sub";
return "";
}
}