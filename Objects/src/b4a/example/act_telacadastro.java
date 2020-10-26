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


public static class _edit{
public boolean IsInitialized;
public int tamanho;
public int esquerda;
public int topo;
public void Initialize() {
IsInitialized = true;
tamanho = 0;
esquerda = 0;
topo = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _rotulodimencoes{
public boolean IsInitialized;
public int tamanho;
public int esquerda;
public void Initialize() {
IsInitialized = true;
tamanho = 0;
esquerda = 0;
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
public anywheresoftware.b4a.objects.LabelWrapper _lbldataprevisao = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquantidadedias = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btcancelar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btsalvar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btaddfoto = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radpagina = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radcapitulo = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrol = null;
public b4a.example.b4ximageview _b4ximagem = null;
public b4a.example.b4xfloattextfield _edb4xfloatnomelivro = null;
public b4a.example.b4xfloattextfield _edb4xfloatpagoucap = null;
public b4a.example.b4xfloattextfield _edb4xfloatautorlivro = null;
public b4a.example.b4xfloattextfield _edb4xfloatmetapagcap = null;
public b4a.example.classbancodados _banco = null;
public b4a.example.act_telacadastro._rotulodimencoes _rotulo = null;
public b4a.example.act_telacadastro._edit _edit = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _negritoitalico = null;
public static String _hoje = "";
public static String _dataprevistafinal = "";
public static boolean _txt_titulo_invalido = false;
public static boolean _txt_autor_invalido = false;
public static boolean _txt_pagoucap_invalido = false;
public static boolean _txt_metapagoucap_invalido = false;
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
int _btsalvaresquerda = 0;
int _toposcrol = 0;
int _tamanholabelobrigatorio = 0;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Activity.LoadLayout(\"Lay_TelaCadastro\")";
mostCurrent._activity.LoadLayout("Lay_TelaCadastro",mostCurrent.activityBA);
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="negritoItalico = negritoItalico.CreateNew(Typefac";
mostCurrent._negritoitalico = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(mostCurrent._negritoitalico.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="painelImagem.Initialize(\"\")";
mostCurrent._painelimagem.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="panelCabecalho.Initialize (\"\")";
mostCurrent._panelcabecalho.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="panelEdTituloLivro.Initialize(\"\")";
mostCurrent._paneledtitulolivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="panelEdAutorLivro.Initialize(\"\")";
mostCurrent._paneledautorlivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="panelEdPaginasOuCap.Initialize(\"\")";
mostCurrent._paneledpaginasoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316173;
 //BA.debugLineNum = 20316173;BA.debugLine="panelMeta.Initialize(\"\")";
mostCurrent._panelmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="panelDataPrevistaFim.Initialize(\"\")";
mostCurrent._paneldataprevistafim.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316175;
 //BA.debugLineNum = 20316175;BA.debugLine="panelEdits.Initialize(\"\")";
mostCurrent._paneledits.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316177;
 //BA.debugLineNum = 20316177;BA.debugLine="lblDadosLivro.Initialize(\"\")";
mostCurrent._lbldadoslivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="lblTipoLeitura.Initialize(\"\")";
mostCurrent._lbltipoleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316179;
 //BA.debugLineNum = 20316179;BA.debugLine="lblMeta.Initialize(\"\")";
mostCurrent._lblmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316180;
 //BA.debugLineNum = 20316180;BA.debugLine="lblPrevisaoTermino.Initialize(\"\")";
mostCurrent._lblprevisaotermino.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316181;
 //BA.debugLineNum = 20316181;BA.debugLine="lblMaximoDigitosTitulo.Initialize(\"\")";
mostCurrent._lblmaximodigitostitulo.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316182;
 //BA.debugLineNum = 20316182;BA.debugLine="lblMaximoDigitosAutor.Initialize(\"\")";
mostCurrent._lblmaximodigitosautor.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316183;
 //BA.debugLineNum = 20316183;BA.debugLine="lblMaximoDigitosPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitospagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316184;
 //BA.debugLineNum = 20316184;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitosmetapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316185;
 //BA.debugLineNum = 20316185;BA.debugLine="lblIncongruenciaTitulo.Initialize(\"\")";
mostCurrent._lblincongruenciatitulo.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316186;
 //BA.debugLineNum = 20316186;BA.debugLine="lblIncongruenciaAutor.Initialize(\"\")";
mostCurrent._lblincongruenciaautor.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316187;
 //BA.debugLineNum = 20316187;BA.debugLine="lblIncongruenciaMetaPagOuCap.Initialize(\"\")";
mostCurrent._lblincongruenciametapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316188;
 //BA.debugLineNum = 20316188;BA.debugLine="lblIncongruenciaPagOuCap.Initialize(\"\")";
mostCurrent._lblincongruenciapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316190;
 //BA.debugLineNum = 20316190;BA.debugLine="lblDadosLivro.Color = Colors.Transparent";
mostCurrent._lbldadoslivro.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316191;
 //BA.debugLineNum = 20316191;BA.debugLine="lblDadosLivro.Text = \"Dados do Livro\"";
mostCurrent._lbldadoslivro.setText(BA.ObjectToCharSequence("Dados do Livro"));
RDebugUtils.currentLine=20316192;
 //BA.debugLineNum = 20316192;BA.debugLine="lblDadosLivro.TextColor = Colors.Black";
mostCurrent._lbldadoslivro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316193;
 //BA.debugLineNum = 20316193;BA.debugLine="lblDadosLivro.TextSize = 17";
mostCurrent._lbldadoslivro.setTextSize((float) (17));
RDebugUtils.currentLine=20316194;
 //BA.debugLineNum = 20316194;BA.debugLine="lblDadosLivro.Typeface = negritoItalico";
mostCurrent._lbldadoslivro.setTypeface((android.graphics.Typeface)(mostCurrent._negritoitalico.getObject()));
RDebugUtils.currentLine=20316195;
 //BA.debugLineNum = 20316195;BA.debugLine="lblDadosLivro.Gravity = Gravity.CENTER";
mostCurrent._lbldadoslivro.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316197;
 //BA.debugLineNum = 20316197;BA.debugLine="lblTipoLeitura.Color = Colors.Transparent";
mostCurrent._lbltipoleitura.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316198;
 //BA.debugLineNum = 20316198;BA.debugLine="lblTipoLeitura.Text = \"Tipo de leitura\"";
mostCurrent._lbltipoleitura.setText(BA.ObjectToCharSequence("Tipo de leitura"));
RDebugUtils.currentLine=20316199;
 //BA.debugLineNum = 20316199;BA.debugLine="lblTipoLeitura.TextColor = Colors.Black";
mostCurrent._lbltipoleitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316200;
 //BA.debugLineNum = 20316200;BA.debugLine="lblTipoLeitura.TextSize = 17";
mostCurrent._lbltipoleitura.setTextSize((float) (17));
RDebugUtils.currentLine=20316201;
 //BA.debugLineNum = 20316201;BA.debugLine="lblTipoLeitura.Typeface = negritoItalico";
mostCurrent._lbltipoleitura.setTypeface((android.graphics.Typeface)(mostCurrent._negritoitalico.getObject()));
RDebugUtils.currentLine=20316202;
 //BA.debugLineNum = 20316202;BA.debugLine="lblTipoLeitura.Gravity = Gravity.CENTER";
mostCurrent._lbltipoleitura.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316204;
 //BA.debugLineNum = 20316204;BA.debugLine="lblMeta.Color = Colors.Transparent";
mostCurrent._lblmeta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316205;
 //BA.debugLineNum = 20316205;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas / cap ler";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas / cap ler por dia?"));
RDebugUtils.currentLine=20316206;
 //BA.debugLineNum = 20316206;BA.debugLine="lblMeta.TextColor = Colors.Black";
mostCurrent._lblmeta.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316207;
 //BA.debugLineNum = 20316207;BA.debugLine="lblMeta.TextSize = 17";
mostCurrent._lblmeta.setTextSize((float) (17));
RDebugUtils.currentLine=20316208;
 //BA.debugLineNum = 20316208;BA.debugLine="lblMeta.Typeface = negritoItalico";
mostCurrent._lblmeta.setTypeface((android.graphics.Typeface)(mostCurrent._negritoitalico.getObject()));
RDebugUtils.currentLine=20316209;
 //BA.debugLineNum = 20316209;BA.debugLine="lblMeta.Gravity = Gravity.CENTER";
mostCurrent._lblmeta.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316211;
 //BA.debugLineNum = 20316211;BA.debugLine="lblPrevisaoTermino.Color = Colors.Transparent";
mostCurrent._lblprevisaotermino.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316212;
 //BA.debugLineNum = 20316212;BA.debugLine="lblPrevisaoTermino.Text = \"Previsão para término\"";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence("Previsão para término"));
RDebugUtils.currentLine=20316213;
 //BA.debugLineNum = 20316213;BA.debugLine="lblPrevisaoTermino.TextColor = Colors.Black";
mostCurrent._lblprevisaotermino.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316214;
 //BA.debugLineNum = 20316214;BA.debugLine="lblPrevisaoTermino.TextSize = 17";
mostCurrent._lblprevisaotermino.setTextSize((float) (17));
RDebugUtils.currentLine=20316215;
 //BA.debugLineNum = 20316215;BA.debugLine="lblPrevisaoTermino.Typeface = negritoItalico";
mostCurrent._lblprevisaotermino.setTypeface((android.graphics.Typeface)(mostCurrent._negritoitalico.getObject()));
RDebugUtils.currentLine=20316216;
 //BA.debugLineNum = 20316216;BA.debugLine="lblPrevisaoTermino.Gravity = Gravity.CENTER";
mostCurrent._lblprevisaotermino.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316218;
 //BA.debugLineNum = 20316218;BA.debugLine="btCancelar.Initialize (\"Event_btCancelar\")";
mostCurrent._btcancelar.Initialize(mostCurrent.activityBA,"Event_btCancelar");
RDebugUtils.currentLine=20316219;
 //BA.debugLineNum = 20316219;BA.debugLine="btSalvar.Initialize(\"Event_btSalvar\")";
mostCurrent._btsalvar.Initialize(mostCurrent.activityBA,"Event_btSalvar");
RDebugUtils.currentLine=20316220;
 //BA.debugLineNum = 20316220;BA.debugLine="btAddFoto.Initialize(\"\")";
mostCurrent._btaddfoto.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316222;
 //BA.debugLineNum = 20316222;BA.debugLine="btCancelar.Color = Colors.Transparent";
mostCurrent._btcancelar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316223;
 //BA.debugLineNum = 20316223;BA.debugLine="btCancelar.Text = \"CANCELAR\"";
mostCurrent._btcancelar.setText(BA.ObjectToCharSequence("CANCELAR"));
RDebugUtils.currentLine=20316224;
 //BA.debugLineNum = 20316224;BA.debugLine="btCancelar.TextSize = 19";
mostCurrent._btcancelar.setTextSize((float) (19));
RDebugUtils.currentLine=20316225;
 //BA.debugLineNum = 20316225;BA.debugLine="btCancelar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btcancelar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20316227;
 //BA.debugLineNum = 20316227;BA.debugLine="btSalvar.Color = Colors.Transparent";
mostCurrent._btsalvar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20316228;
 //BA.debugLineNum = 20316228;BA.debugLine="btSalvar.Text = \"SALVAR\"";
mostCurrent._btsalvar.setText(BA.ObjectToCharSequence("SALVAR"));
RDebugUtils.currentLine=20316229;
 //BA.debugLineNum = 20316229;BA.debugLine="btSalvar.TextSize = 19";
mostCurrent._btsalvar.setTextSize((float) (19));
RDebugUtils.currentLine=20316230;
 //BA.debugLineNum = 20316230;BA.debugLine="btSalvar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btsalvar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20316232;
 //BA.debugLineNum = 20316232;BA.debugLine="radPagina.Initialize(\"radPagina\")";
mostCurrent._radpagina.Initialize(mostCurrent.activityBA,"radPagina");
RDebugUtils.currentLine=20316233;
 //BA.debugLineNum = 20316233;BA.debugLine="radCapitulo.Initialize(\"radCapitulo\")";
mostCurrent._radcapitulo.Initialize(mostCurrent.activityBA,"radCapitulo");
RDebugUtils.currentLine=20316234;
 //BA.debugLineNum = 20316234;BA.debugLine="radPagina.Checked = True";
mostCurrent._radpagina.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20316236;
 //BA.debugLineNum = 20316236;BA.debugLine="radPagina.Text = \"Por página\"";
mostCurrent._radpagina.setText(BA.ObjectToCharSequence("Por página"));
RDebugUtils.currentLine=20316237;
 //BA.debugLineNum = 20316237;BA.debugLine="radPagina.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radpagina.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=20316238;
 //BA.debugLineNum = 20316238;BA.debugLine="radPagina.TextSize = 16";
mostCurrent._radpagina.setTextSize((float) (16));
RDebugUtils.currentLine=20316239;
 //BA.debugLineNum = 20316239;BA.debugLine="radPagina.Gravity = Gravity.CENTER";
mostCurrent._radpagina.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316241;
 //BA.debugLineNum = 20316241;BA.debugLine="radCapitulo.Text = \"Por capítulo\"";
mostCurrent._radcapitulo.setText(BA.ObjectToCharSequence("Por capítulo"));
RDebugUtils.currentLine=20316242;
 //BA.debugLineNum = 20316242;BA.debugLine="radCapitulo.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radcapitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=20316243;
 //BA.debugLineNum = 20316243;BA.debugLine="radCapitulo.TextSize = 16";
mostCurrent._radcapitulo.setTextSize((float) (16));
RDebugUtils.currentLine=20316244;
 //BA.debugLineNum = 20316244;BA.debugLine="radCapitulo.Gravity = Gravity.CENTER";
mostCurrent._radcapitulo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=20316246;
 //BA.debugLineNum = 20316246;BA.debugLine="lblMaximoDigitosTitulo.Text = \"0/100 \"";
mostCurrent._lblmaximodigitostitulo.setText(BA.ObjectToCharSequence("0/100 "));
RDebugUtils.currentLine=20316247;
 //BA.debugLineNum = 20316247;BA.debugLine="lblMaximoDigitosAutor.Text = \"0/100 \"";
mostCurrent._lblmaximodigitosautor.setText(BA.ObjectToCharSequence("0/100 "));
RDebugUtils.currentLine=20316248;
 //BA.debugLineNum = 20316248;BA.debugLine="lblMaximoDigitosPagOuCap.Text = \"0/4 \"";
mostCurrent._lblmaximodigitospagoucap.setText(BA.ObjectToCharSequence("0/4 "));
RDebugUtils.currentLine=20316249;
 //BA.debugLineNum = 20316249;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = \"0/4 \"";
mostCurrent._lblmaximodigitosmetapagoucap.setText(BA.ObjectToCharSequence("0/4 "));
RDebugUtils.currentLine=20316251;
 //BA.debugLineNum = 20316251;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316252;
 //BA.debugLineNum = 20316252;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316253;
 //BA.debugLineNum = 20316253;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316254;
 //BA.debugLineNum = 20316254;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316256;
 //BA.debugLineNum = 20316256;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316257;
 //BA.debugLineNum = 20316257;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316258;
 //BA.debugLineNum = 20316258;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Black";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316259;
 //BA.debugLineNum = 20316259;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.B";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20316261;
 //BA.debugLineNum = 20316261;BA.debugLine="lblIncongruenciaAutor.TextColor = Colors.Red";
mostCurrent._lblincongruenciaautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=20316262;
 //BA.debugLineNum = 20316262;BA.debugLine="lblIncongruenciaMetaPagOuCap.TextColor = Colors.R";
mostCurrent._lblincongruenciametapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=20316263;
 //BA.debugLineNum = 20316263;BA.debugLine="lblIncongruenciaPagOuCap.TextColor = Colors.Red";
mostCurrent._lblincongruenciapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=20316264;
 //BA.debugLineNum = 20316264;BA.debugLine="lblIncongruenciaTitulo.TextColor = Colors.Red";
mostCurrent._lblincongruenciatitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=20316266;
 //BA.debugLineNum = 20316266;BA.debugLine="lblIncongruenciaAutor.Visible = False";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316267;
 //BA.debugLineNum = 20316267;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316268;
 //BA.debugLineNum = 20316268;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316269;
 //BA.debugLineNum = 20316269;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316271;
 //BA.debugLineNum = 20316271;BA.debugLine="scrol.Initialize( 500 )";
mostCurrent._scrol.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=20316272;
 //BA.debugLineNum = 20316272;BA.debugLine="Main.fotos.Initialize(\"CC\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("CC");
RDebugUtils.currentLine=20316274;
 //BA.debugLineNum = 20316274;BA.debugLine="Dim etiqueta As Label";
_etiqueta = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20316275;
 //BA.debugLineNum = 20316275;BA.debugLine="etiqueta.Initialize(\"\")";
_etiqueta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=20316277;
 //BA.debugLineNum = 20316277;BA.debugLine="edit.Initialize";
mostCurrent._edit.Initialize();
RDebugUtils.currentLine=20316278;
 //BA.debugLineNum = 20316278;BA.debugLine="rotulo.Initialize";
mostCurrent._rotulo.Initialize();
RDebugUtils.currentLine=20316283;
 //BA.debugLineNum = 20316283;BA.debugLine="panelCabecalho.Color = Colors.RGB(0,165,255)";
mostCurrent._panelcabecalho.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (165),(int) (255)));
RDebugUtils.currentLine=20316284;
 //BA.debugLineNum = 20316284;BA.debugLine="Activity.AddView(panelCabecalho, 0%x, 0%y, 100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelcabecalho.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=20316286;
 //BA.debugLineNum = 20316286;BA.debugLine="panelCabecalho.AddView(btCancelar, 1%x,  1%y, 35%";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btcancelar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=20316287;
 //BA.debugLineNum = 20316287;BA.debugLine="Dim btSalvarEsquerda As Int = 100%x - btCancelar.";
_btsalvaresquerda = (int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btcancelar.getWidth()-mostCurrent._btcancelar.getLeft());
RDebugUtils.currentLine=20316288;
 //BA.debugLineNum = 20316288;BA.debugLine="panelCabecalho.AddView(btSalvar, btSalvarEsquerda";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btsalvar.getObject()),_btsalvaresquerda,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=20316290;
 //BA.debugLineNum = 20316290;BA.debugLine="scrol.Color = Colors.Cyan";
mostCurrent._scrol.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=20316291;
 //BA.debugLineNum = 20316291;BA.debugLine="scrol.Panel.Color = Colors.RGB(223,223,223)";
mostCurrent._scrol.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (223),(int) (223),(int) (223)));
RDebugUtils.currentLine=20316293;
 //BA.debugLineNum = 20316293;BA.debugLine="Dim topoScrol As Int = panelCabecalho.Top + panel";
_toposcrol = (int) (mostCurrent._panelcabecalho.getTop()+mostCurrent._panelcabecalho.getHeight());
RDebugUtils.currentLine=20316294;
 //BA.debugLineNum = 20316294;BA.debugLine="Activity.AddView(scrol, 0%x, topoScrol , 100%x, 1";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._scrol.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),_toposcrol,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-_toposcrol));
RDebugUtils.currentLine=20316296;
 //BA.debugLineNum = 20316296;BA.debugLine="scrol.Panel.AddView(lblDadosLivro, 0%x, 0%y, 100%";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbldadoslivro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316298;
 //BA.debugLineNum = 20316298;BA.debugLine="painelImagem.Width = 98%x";
mostCurrent._painelimagem.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA));
RDebugUtils.currentLine=20316300;
 //BA.debugLineNum = 20316300;BA.debugLine="edit.esquerda = (100%x - painelImagem.Width) / 2";
mostCurrent._edit.esquerda /*int*/  = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._painelimagem.getWidth())/(double)2);
RDebugUtils.currentLine=20316301;
 //BA.debugLineNum = 20316301;BA.debugLine="edit.tamanho =  painelImagem.Width";
mostCurrent._edit.tamanho /*int*/  = mostCurrent._painelimagem.getWidth();
RDebugUtils.currentLine=20316303;
 //BA.debugLineNum = 20316303;BA.debugLine="scrol.Panel.AddView(painelImagem, edit.esquerda ,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painelimagem.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (mostCurrent._lbldadoslivro.getTop()+mostCurrent._lbldadoslivro.getHeight()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=20316305;
 //BA.debugLineNum = 20316305;BA.debugLine="painelImagem.LoadLayout(\"Lay_Imagem\")";
mostCurrent._painelimagem.LoadLayout("Lay_Imagem",mostCurrent.activityBA);
RDebugUtils.currentLine=20316307;
 //BA.debugLineNum = 20316307;BA.debugLine="B4XImagem.ResizeMode = \"FILL\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=20316308;
 //BA.debugLineNum = 20316308;BA.debugLine="B4XImagem.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4ximagem._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=20316310;
 //BA.debugLineNum = 20316310;BA.debugLine="scrol.Panel.Height = painelImagem.Top + painelIma";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()));
RDebugUtils.currentLine=20316312;
 //BA.debugLineNum = 20316312;BA.debugLine="scrol.Panel.AddView(panelEdits, edit.esquerda, pa";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledits.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._edit.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=20316313;
 //BA.debugLineNum = 20316313;BA.debugLine="panelEdits.LoadLayout(\"Lay_edTituloLivro\")";
mostCurrent._paneledits.LoadLayout("Lay_edTituloLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=20316315;
 //BA.debugLineNum = 20316315;BA.debugLine="scrol.Panel.Height = panelEdits.Top + panelEdits.";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()));
RDebugUtils.currentLine=20316317;
 //BA.debugLineNum = 20316317;BA.debugLine="Dim tamanhoLabelObrigatorio As Int = (100%x / 2)";
_tamanholabelobrigatorio = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)/(double)2)-mostCurrent._edit.esquerda /*int*/ );
RDebugUtils.currentLine=20316319;
 //BA.debugLineNum = 20316319;BA.debugLine="rotulo.esquerda =  edit.esquerda + tamanhoLabelOb";
mostCurrent._rotulo.esquerda /*int*/  = (int) (mostCurrent._edit.esquerda /*int*/ +_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316320;
 //BA.debugLineNum = 20316320;BA.debugLine="rotulo.tamanho = panelEdits.Width - tamanhoLabelO";
mostCurrent._rotulo.tamanho /*int*/  = (int) (mostCurrent._paneledits.getWidth()-_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316322;
 //BA.debugLineNum = 20316322;BA.debugLine="lblIncongruenciaTitulo.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciatitulo.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=20316323;
 //BA.debugLineNum = 20316323;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaTitulo, pa";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciatitulo,(int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()),mostCurrent._edit.esquerda /*int*/ ,_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316324;
 //BA.debugLineNum = 20316324;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitostitulo,(int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()),mostCurrent._rotulo.esquerda /*int*/ ,mostCurrent._rotulo.tamanho /*int*/ );
RDebugUtils.currentLine=20316325;
 //BA.debugLineNum = 20316325;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=20316327;
 //BA.debugLineNum = 20316327;BA.debugLine="scrol.Panel.AddView(panelEdAutorLivro, edit.esque";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledautorlivro.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._edit.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=20316328;
 //BA.debugLineNum = 20316328;BA.debugLine="panelEdAutorLivro.LoadLayout(\"Lay_edAutorLivro\")";
mostCurrent._paneledautorlivro.LoadLayout("Lay_edAutorLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=20316330;
 //BA.debugLineNum = 20316330;BA.debugLine="lblIncongruenciaAutor.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciaautor.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=20316331;
 //BA.debugLineNum = 20316331;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaAutor,pane";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciaautor,(int) (mostCurrent._paneledautorlivro.getTop()+mostCurrent._paneledautorlivro.getHeight()),mostCurrent._edit.esquerda /*int*/ ,_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316332;
 //BA.debugLineNum = 20316332;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitosautor,(int) (mostCurrent._paneledautorlivro.getTop()+mostCurrent._paneledautorlivro.getHeight()),mostCurrent._rotulo.esquerda /*int*/ ,mostCurrent._rotulo.tamanho /*int*/ );
RDebugUtils.currentLine=20316333;
 //BA.debugLineNum = 20316333;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=20316335;
 //BA.debugLineNum = 20316335;BA.debugLine="scrol.Panel.AddView(lblTipoLeitura, 0%x, lblMaxim";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbltipoleitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lblmaximodigitosautor.getTop()+mostCurrent._lblmaximodigitosautor.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316336;
 //BA.debugLineNum = 20316336;BA.debugLine="scrol.Panel.Height = lblTipoLeitura.Top + lblTipo";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()));
RDebugUtils.currentLine=20316338;
 //BA.debugLineNum = 20316338;BA.debugLine="scrol.Panel.AddView(radPagina, 0%x , lblTipoLeitu";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radpagina.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316340;
 //BA.debugLineNum = 20316340;BA.debugLine="scrol.Panel.AddView(radCapitulo, radPagina.Width,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radcapitulo.getObject()),mostCurrent._radpagina.getWidth(),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316341;
 //BA.debugLineNum = 20316341;BA.debugLine="scrol.Panel.Height = radPagina.Top + radPagina.He";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._radpagina.getTop()+mostCurrent._radpagina.getHeight()));
RDebugUtils.currentLine=20316343;
 //BA.debugLineNum = 20316343;BA.debugLine="scrol.Panel.AddView(panelEdPaginasOuCap, edit.esq";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledpaginasoucap.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (mostCurrent._radcapitulo.getTop()+mostCurrent._radcapitulo.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._edit.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=20316344;
 //BA.debugLineNum = 20316344;BA.debugLine="panelEdPaginasOuCap.LoadLayout(\"Lay_edPagOuCapitu";
mostCurrent._paneledpaginasoucap.LoadLayout("Lay_edPagOuCapitulo",mostCurrent.activityBA);
RDebugUtils.currentLine=20316346;
 //BA.debugLineNum = 20316346;BA.debugLine="lblIncongruenciaPagOuCap.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciapagoucap.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=20316347;
 //BA.debugLineNum = 20316347;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaPagOuCap,";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciapagoucap,(int) (mostCurrent._paneledpaginasoucap.getTop()+mostCurrent._paneledpaginasoucap.getHeight()),mostCurrent._edit.esquerda /*int*/ ,_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316348;
 //BA.debugLineNum = 20316348;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitospagoucap,(int) (mostCurrent._paneledpaginasoucap.getTop()+mostCurrent._paneledpaginasoucap.getHeight()),mostCurrent._rotulo.esquerda /*int*/ ,mostCurrent._rotulo.tamanho /*int*/ );
RDebugUtils.currentLine=20316349;
 //BA.debugLineNum = 20316349;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=20316351;
 //BA.debugLineNum = 20316351;BA.debugLine="scrol.Panel.AddView(lblMeta, 0%x, etiqueta.Top +";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblmeta.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316352;
 //BA.debugLineNum = 20316352;BA.debugLine="scrol.Panel.Height = lblMeta.Top + lblMeta.Height";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()));
RDebugUtils.currentLine=20316354;
 //BA.debugLineNum = 20316354;BA.debugLine="scrol.Panel.AddView(panelMeta, edit.esquerda, lbl";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._panelmeta.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._edit.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=20316355;
 //BA.debugLineNum = 20316355;BA.debugLine="panelMeta.LoadLayout(\"Lay_edMetaPagCap\")";
mostCurrent._panelmeta.LoadLayout("Lay_edMetaPagCap",mostCurrent.activityBA);
RDebugUtils.currentLine=20316357;
 //BA.debugLineNum = 20316357;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \"Obrigatório\"";
mostCurrent._lblincongruenciametapagoucap.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=20316358;
 //BA.debugLineNum = 20316358;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaMetaPagOuC";
_addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.LEFT),mostCurrent._lblincongruenciametapagoucap,(int) (mostCurrent._panelmeta.getTop()+mostCurrent._panelmeta.getHeight()),mostCurrent._edit.esquerda /*int*/ ,_tamanholabelobrigatorio);
RDebugUtils.currentLine=20316359;
 //BA.debugLineNum = 20316359;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
_etiqueta = _addlabel((Object)(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT),mostCurrent._lblmaximodigitosmetapagoucap,(int) (mostCurrent._panelmeta.getTop()+mostCurrent._panelmeta.getHeight()),mostCurrent._rotulo.esquerda /*int*/ ,mostCurrent._rotulo.tamanho /*int*/ );
RDebugUtils.currentLine=20316360;
 //BA.debugLineNum = 20316360;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=20316362;
 //BA.debugLineNum = 20316362;BA.debugLine="scrol.Panel.AddView(lblPrevisaoTermino, 0%x, etiq";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblprevisaotermino.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=20316363;
 //BA.debugLineNum = 20316363;BA.debugLine="scrol.Panel.Height = lblPrevisaoTermino.Top + lbl";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()));
RDebugUtils.currentLine=20316365;
 //BA.debugLineNum = 20316365;BA.debugLine="panelDataPrevistaFim.Color = Colors.Blue";
mostCurrent._paneldataprevistafim.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=20316366;
 //BA.debugLineNum = 20316366;BA.debugLine="scrol.Panel.AddView(panelDataPrevistaFim, edit.es";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneldataprevistafim.getObject()),mostCurrent._edit.esquerda /*int*/ ,(int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=20316367;
 //BA.debugLineNum = 20316367;BA.debugLine="panelDataPrevistaFim.LoadLayout(\"Lay_Previsao_ter";
mostCurrent._paneldataprevistafim.LoadLayout("Lay_Previsao_termino",mostCurrent.activityBA);
RDebugUtils.currentLine=20316368;
 //BA.debugLineNum = 20316368;BA.debugLine="scrol.Panel.Height = panelDataPrevistaFim.Top + p";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneldataprevistafim.getTop()+mostCurrent._paneldataprevistafim.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
RDebugUtils.currentLine=20316370;
 //BA.debugLineNum = 20316370;BA.debugLine="hoje = \"Dia: \" & DateTime.Date(DateTime.Now)";
mostCurrent._hoje = "Dia: "+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=20316371;
 //BA.debugLineNum = 20316371;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=20316373;
 //BA.debugLineNum = 20316373;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316374;
 //BA.debugLineNum = 20316374;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _addlabel(Object _gravidade,anywheresoftware.b4a.objects.LabelWrapper _etiqueta,int _topo,int _esquerda,int _tamanho) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addlabel", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "addlabel", new Object[] {_gravidade,_etiqueta,_topo,_esquerda,_tamanho}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub AddLabel(gravidade As Object, etiqueta As Labe";
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="etiqueta.Gravity = Bit.Or(gravidade, Gravity.CENT";
_etiqueta.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or((int)(BA.ObjectToNumber(_gravidade)),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="etiqueta.Color = Colors.Transparent";
_etiqueta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="scrol.Panel.AddView(etiqueta, esquerda, topo, tam";
mostCurrent._scrol.getPanel().AddView((android.view.View)(_etiqueta.getObject()),_esquerda,_topo,_tamanho,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="Return etiqueta";
if (true) return _etiqueta;
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="btCancelar.Top = -5%y";
mostCurrent._btcancelar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="btCancelar.TextColor = Colors.Transparent";
mostCurrent._btcancelar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="btCancelar.SetLayoutAnimated(1000, 1%x, 1%y, 35%x";
mostCurrent._btcancelar.SetLayoutAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="btCancelar.SetTextColorAnimated(1500, Colors.RGB(";
mostCurrent._btcancelar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="btSalvar.Top = -5%y";
mostCurrent._btsalvar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="btSalvar.TextColor = Colors.Transparent";
mostCurrent._btsalvar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="btSalvar.SetLayoutAnimated(1000, 100%x - btSalvar";
mostCurrent._btsalvar.SetLayoutAnimated((int) (1000),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btsalvar.getWidth()-mostCurrent._btcancelar.getLeft()),mostCurrent._btcancelar.getTop(),mostCurrent._btcancelar.getWidth(),mostCurrent._btcancelar.getHeight());
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="btSalvar.SetTextColorAnimated(1500, Colors.RGB(21";
mostCurrent._btsalvar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="End Sub";
return "";
}
public static String  _btaddimagem_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btaddimagem_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btaddimagem_click", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub btAddImagem_Click";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Try";
try {RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(processBA,"image/*","Choose image");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha!"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="End Sub";
return "";
}
public static String  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cc_result", new Object[] {_success,_dir,_filename}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="B4XImagem.ResizeMode = \"FIT\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FIT");
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="B4XImagem.Load(Dir, FileName)";
mostCurrent._b4ximagem._load /*String*/ (null,_dir,_filename);
 }else {
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Nenhuma foto escolhida"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=20774921;
 //BA.debugLineNum = 20774921;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatautorlivro_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatautorlivro_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatautorlivro_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub edB4XFloatAutorLivro_FocusChanged (HasFocus As";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="lblMaximoDigitosAutor.Visible = True";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="If lblIncongruenciaAutor.Visible = False Or txt_";
if (mostCurrent._lblincongruenciaautor.getVisible()==anywheresoftware.b4a.keywords.Common.False || _txt_autor_invalido==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
mostCurrent._lblmaximodigitosautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatautorlivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub edB4XFloatAutorLivro_TextChanged (Old As Strin";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="edB4XFloatAutorLivro.Text = edB4XFloatAutorLivro";
mostCurrent._edb4xfloatautorlivro._settext /*String*/ (null,mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="If New.Length > 100 Then";
if (_new.length()>100) { 
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="lblIncongruenciaAutor.Visible = True";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="lblIncongruenciaAutor.Text = \" Texto inválido\"";
mostCurrent._lblincongruenciaautor.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Red";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="txt_Autor_invalido = True";
_txt_autor_invalido = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="lblIncongruenciaAutor.Visible = False";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20971532;
 //BA.debugLineNum = 20971532;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
mostCurrent._lblmaximodigitosautor.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=20971533;
 //BA.debugLineNum = 20971533;BA.debugLine="txt_Autor_invalido = False";
_txt_autor_invalido = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=20971535;
 //BA.debugLineNum = 20971535;BA.debugLine="lblMaximoDigitosAutor.Text = New.Length & \"/100 \"";
mostCurrent._lblmaximodigitosautor.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/100 "));
RDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatmetapagcap_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatmetapagcap_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub edB4XFloatMetaPagCap_FocusChanged (HasFocus As";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = True";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="If lblIncongruenciaMetaPagOuCap.Visible = False";
if (mostCurrent._lblincongruenciametapagoucap.getVisible()==anywheresoftware.b4a.keywords.Common.False || _txt_metapagoucap_invalido==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
mostCurrent._lblmaximodigitosmetapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub edB4XFloatMetaPagCap_TextChanged (Old As Strin";
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = New.Length &";
mostCurrent._lblmaximodigitosmetapagoucap.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/4 "));
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="Dim meta As Int = New";
_meta = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=21102600;
 //BA.debugLineNum = 21102600;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=21102604;
 //BA.debugLineNum = 21102604;BA.debugLine="quantPag = edB4XFloatPagOuCap.Text";
_quantpag = (int)(Double.parseDouble(mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=21102606;
 //BA.debugLineNum = 21102606;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=21102608;
 //BA.debugLineNum = 21102608;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21102609;
 //BA.debugLineNum = 21102609;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=21102611;
 //BA.debugLineNum = 21102611;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=21102613;
 //BA.debugLineNum = 21102613;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=21102615;
 //BA.debugLineNum = 21102615;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence("Dia: "+_data));
 }else {
RDebugUtils.currentLine=21102617;
 //BA.debugLineNum = 21102617;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21102618;
 //BA.debugLineNum = 21102618;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=21102622;
 //BA.debugLineNum = 21102622;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21102623;
 //BA.debugLineNum = 21102623;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21102626;
 //BA.debugLineNum = 21102626;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
RDebugUtils.currentLine=21102627;
 //BA.debugLineNum = 21102627;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = True";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21102628;
 //BA.debugLineNum = 21102628;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \" Texto invá";
mostCurrent._lblincongruenciametapagoucap.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=21102629;
 //BA.debugLineNum = 21102629;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=21102630;
 //BA.debugLineNum = 21102630;BA.debugLine="txt_MetaPagOuCap_invalido = True";
_txt_metapagoucap_invalido = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=21102632;
 //BA.debugLineNum = 21102632;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21102633;
 //BA.debugLineNum = 21102633;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
mostCurrent._lblmaximodigitosmetapagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=21102634;
 //BA.debugLineNum = 21102634;BA.debugLine="txt_MetaPagOuCap_invalido = False";
_txt_metapagoucap_invalido = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21102636;
 //BA.debugLineNum = 21102636;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatnomelivro_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatnomelivro_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatnomelivro_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub edB4XFloatNomeLivro_FocusChanged (HasFocus As";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="lblMaximoDigitosTitulo.Visible = True";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="If lblIncongruenciaTitulo.Visible = False Or txt";
if (mostCurrent._lblincongruenciatitulo.getVisible()==anywheresoftware.b4a.keywords.Common.False || _txt_titulo_invalido==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
mostCurrent._lblmaximodigitostitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatnomelivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub edB4XFloatNomeLivro_TextChanged (Old As String";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="edB4XFloatNomeLivro.Text = edB4XFloatNomeLivro.T";
mostCurrent._edb4xfloatnomelivro._settext /*String*/ (null,mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="If New.Length > 100 Then";
if (_new.length()>100) { 
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="lblIncongruenciaTitulo.Visible = True";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="lblIncongruenciaTitulo.Text = \" Texto inválido\"";
mostCurrent._lblincongruenciatitulo.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Red";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=21037065;
 //BA.debugLineNum = 21037065;BA.debugLine="txt_titulo_invalido = True";
_txt_titulo_invalido = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=21037067;
 //BA.debugLineNum = 21037067;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21037068;
 //BA.debugLineNum = 21037068;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
mostCurrent._lblmaximodigitostitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="txt_titulo_invalido = False";
_txt_titulo_invalido = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="lblMaximoDigitosTitulo.Text = New.Length & \"/100";
mostCurrent._lblmaximodigitostitulo.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/100 "));
RDebugUtils.currentLine=21037074;
 //BA.debugLineNum = 21037074;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatpagoucap_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatpagoucap_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatpagoucap_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub edB4XFloatPagOuCap_FocusChanged (HasFocus As B";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = True";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="If lblIncongruenciaPagOuCap.Visible = False Or t";
if (mostCurrent._lblincongruenciapagoucap.getVisible()==anywheresoftware.b4a.keywords.Common.False || _txt_pagoucap_invalido==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
mostCurrent._lblmaximodigitospagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub edB4XFloatPagOuCap_TextChanged (Old As String,";
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="lblMaximoDigitosPagOuCap.Text = New.Length & \"/4";
mostCurrent._lblmaximodigitospagoucap.setText(BA.ObjectToCharSequence(BA.NumberToString(_new.length())+"/4 "));
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="Dim meta As Int";
_meta = 0;
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=21168142;
 //BA.debugLineNum = 21168142;BA.debugLine="quantPag = New";
_quantpag = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=21168146;
 //BA.debugLineNum = 21168146;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21168147;
 //BA.debugLineNum = 21168147;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=21168149;
 //BA.debugLineNum = 21168149;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=21168151;
 //BA.debugLineNum = 21168151;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=21168153;
 //BA.debugLineNum = 21168153;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence("Dia: "+_data));
 }else {
RDebugUtils.currentLine=21168155;
 //BA.debugLineNum = 21168155;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21168156;
 //BA.debugLineNum = 21168156;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=21168160;
 //BA.debugLineNum = 21168160;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21168161;
 //BA.debugLineNum = 21168161;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21168164;
 //BA.debugLineNum = 21168164;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
RDebugUtils.currentLine=21168165;
 //BA.debugLineNum = 21168165;BA.debugLine="lblIncongruenciaPagOuCap.Visible = True";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21168166;
 //BA.debugLineNum = 21168166;BA.debugLine="lblIncongruenciaPagOuCap.Text = \" Texto inválido";
mostCurrent._lblincongruenciapagoucap.setText(BA.ObjectToCharSequence(" Texto inválido"));
RDebugUtils.currentLine=21168167;
 //BA.debugLineNum = 21168167;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Red";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=21168168;
 //BA.debugLineNum = 21168168;BA.debugLine="txt_PagOuCap_invalido = True";
_txt_pagoucap_invalido = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=21168170;
 //BA.debugLineNum = 21168170;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21168171;
 //BA.debugLineNum = 21168171;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Blac";
mostCurrent._lblmaximodigitospagoucap.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=21168172;
 //BA.debugLineNum = 21168172;BA.debugLine="txt_PagOuCap_invalido = False";
_txt_pagoucap_invalido = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21168174;
 //BA.debugLineNum = 21168174;BA.debugLine="End Sub";
return "";
}
public static String  _event_btcancelar_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_btcancelar_click", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub Event_btCancelar_Click";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="btCancelar.SetColorAnimated(100, Colors.RGB(82,18";
mostCurrent._btcancelar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="btSalvar.SetColorAnimated(100, Colors.RGB(82,183,";
parent.mostCurrent._btsalvar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Dim pag_ou_cap As String";
_pag_ou_cap = "";
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="If VerificaTamanhoTexto Then";
if (true) break;

case 1:
//if
this.state = 52;
if (_verificatamanhotexto()) { 
this.state = 3;
}else {
this.state = 51;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="If edB4XFloatNomeLivro.Text.Trim = \"\" Then";
if (true) break;

case 4:
//if
this.state = 49;
if ((parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="Else If edB4XFloatAutorLivro.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 8;
}else {
this.state = 10;
}}
if (true) break;

case 6:
//C
this.state = 49;
RDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Cal";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o título do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="TextoObrigatorio";
_textoobrigatorio();
 if (true) break;

case 8:
//C
this.state = 49;
RDebugUtils.currentLine=20643851;
 //BA.debugLineNum = 20643851;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="TextoObrigatorio";
_textoobrigatorio();
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=20643855;
 //BA.debugLineNum = 20643855;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
_pag_ou_cap = "Quantos capítulos";
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
if (true) break;

case 11:
//if
this.state = 16;
if (parent.mostCurrent._radpagina.getChecked()) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
_pag_ou_cap = "Quantas páginas";
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=20643858;
 //BA.debugLineNum = 20643858;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim = \"\" Then";
if (true) break;

case 17:
//if
this.state = 48;
if ((parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 19;
}else 
{RDebugUtils.currentLine=20643862;
 //BA.debugLineNum = 20643862;BA.debugLine="else If edB4XFloatMetaPagCap.Text.Trim = \"\" The";
if ((parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 21;
}else {
this.state = 23;
}}
if (true) break;

case 19:
//C
this.state = 48;
RDebugUtils.currentLine=20643859;
 //BA.debugLineNum = 20643859;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro t";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! "+_pag_ou_cap+" o livro tem?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=20643860;
 //BA.debugLineNum = 20643860;BA.debugLine="TextoObrigatorio";
_textoobrigatorio();
 if (true) break;

case 21:
//C
this.state = 48;
RDebugUtils.currentLine=20643864;
 //BA.debugLineNum = 20643864;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Ca";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual a sua meta diária?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=20643865;
 //BA.debugLineNum = 20643865;BA.debugLine="TextoObrigatorio";
_textoobrigatorio();
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
_meta = 0;
_quantidade_pag_cap = 0;
RDebugUtils.currentLine=20643869;
 //BA.debugLineNum = 20643869;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=20643870;
 //BA.debugLineNum = 20643870;BA.debugLine="quantidade_pag_cap = edB4XFloatPagOuCap.Text";
_quantidade_pag_cap = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=20643872;
 //BA.debugLineNum = 20643872;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
_cmd = "";
_datainicial = "";
_tipoleitura = "";
RDebugUtils.currentLine=20643874;
 //BA.debugLineNum = 20643874;BA.debugLine="tipoLeitura = \"páginas\"";
_tipoleitura = "páginas";
RDebugUtils.currentLine=20643875;
 //BA.debugLineNum = 20643875;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"cap";
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._radcapitulo.getChecked()) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_tipoleitura = "capítulos";
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=20643877;
 //BA.debugLineNum = 20643877;BA.debugLine="If meta > quantidade_pag_cap Then";
if (true) break;

case 30:
//if
this.state = 47;
if (_meta>_quantidade_pag_cap) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 47;
RDebugUtils.currentLine=20643878;
 //BA.debugLineNum = 20643878;BA.debugLine="ToastMessageShow(\"Sua meta é maior que o n° d";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sua meta é maior que o n° de "+_tipoleitura),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=20643881;
 //BA.debugLineNum = 20643881;BA.debugLine="Try";
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
RDebugUtils.currentLine=20643883;
 //BA.debugLineNum = 20643883;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
_datainicial = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=20643885;
 //BA.debugLineNum = 20643885;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edB4XF";
_cmd = "exec sp_cad_livro_leitura '"+parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null)+"', '"+parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null)+"', '"+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+"', '"+_datainicial+"', '"+_tipoleitura+"', '"+parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)+"', '"+parent.mostCurrent._dataprevistafinal+"', '"+parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)+"'";
RDebugUtils.currentLine=20643894;
 //BA.debugLineNum = 20643894;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 53;
return;
case 53:
//C
this.state = 38;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=20643896;
 //BA.debugLineNum = 20643896;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=20643898;
 //BA.debugLineNum = 20643898;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
if (true) break;

case 38:
//if
this.state = 43;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 40;
}else 
{RDebugUtils.currentLine=20643906;
 //BA.debugLineNum = 20643906;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 Th";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 42;
}}
if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=20643900;
 //BA.debugLineNum = 20643900;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=20643901;
 //BA.debugLineNum = 20643901;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643902;
 //BA.debugLineNum = 20643902;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (100));
this.state = 54;
return;
case 54:
//C
this.state = 43;
;
RDebugUtils.currentLine=20643903;
 //BA.debugLineNum = 20643903;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=20643904;
 //BA.debugLineNum = 20643904;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=20643908;
 //BA.debugLineNum = 20643908;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643909;
 //BA.debugLineNum = 20643909;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!!"),processBA);
RDebugUtils.currentLine=20643910;
 //BA.debugLineNum = 20643910;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (1000));
this.state = 55;
return;
case 55:
//C
this.state = 43;
;
RDebugUtils.currentLine=20643911;
 //BA.debugLineNum = 20643911;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=20643912;
 //BA.debugLineNum = 20643912;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
RDebugUtils.currentLine=20643916;
 //BA.debugLineNum = 20643916;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao tentar estabelecer a conexão. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção"),processBA);
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 0;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=20643923;
 //BA.debugLineNum = 20643923;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Informações incoerentes"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 52:
//C
this.state = -1;
;
RDebugUtils.currentLine=20643925;
 //BA.debugLineNum = 20643925;BA.debugLine="End Sub";
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
public static boolean  _verificatamanhotexto() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verificatamanhotexto", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "verificatamanhotexto", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub VerificaTamanhoTexto As Boolean";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="If edB4XFloatNomeLivro.Text.Length > 100 Then Ret";
if (mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).length()>100) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="If edB4XFloatAutorLivro.Text.Length > 100 Then Re";
if (mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).length()>100) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="If edB4XFloatPagOuCap.Text.Length > 4 Then Return";
if (mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).length()>4) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="If edB4XFloatMetaPagCap.Text.Length > 4 Then Retu";
if (mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).length()>4) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="End Sub";
return false;
}
public static String  _textoobrigatorio() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "textoobrigatorio", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "textoobrigatorio", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub TextoObrigatorio";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="lblIncongruenciaAutor.Text = \" Texto obrigatório\"";
mostCurrent._lblincongruenciaautor.setText(BA.ObjectToCharSequence(" Texto obrigatório"));
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="lblIncongruenciaTitulo.Text = \" Texto obrigatório";
mostCurrent._lblincongruenciatitulo.setText(BA.ObjectToCharSequence(" Texto obrigatório"));
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="lblIncongruenciaPagOuCap.Text = \" Quantidade obri";
mostCurrent._lblincongruenciapagoucap.setText(BA.ObjectToCharSequence(" Quantidade obrigatória"));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \" Quantidade";
mostCurrent._lblincongruenciametapagoucap.setText(BA.ObjectToCharSequence(" Quantidade obrigatória"));
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="If edB4XFloatAutorLivro.Text.Trim = \"\" Then";
if ((mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).trim()).equals("")) { 
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="lblIncongruenciaAutor.Visible = True";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="lblIncongruenciaAutor.Visible = False";
mostCurrent._lblincongruenciaautor.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="If edB4XFloatNomeLivro.Text.Trim = \"\" Then";
if ((mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).trim()).equals("")) { 
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="lblIncongruenciaTitulo.Visible = True";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
mostCurrent._lblincongruenciatitulo.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim = \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("")) { 
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="lblIncongruenciaPagOuCap.Visible = True";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
mostCurrent._lblincongruenciapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21495832;
 //BA.debugLineNum = 21495832;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim = \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("")) { 
RDebugUtils.currentLine=21495833;
 //BA.debugLineNum = 21495833;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = True";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21495835;
 //BA.debugLineNum = 21495835;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
mostCurrent._lblincongruenciametapagoucap.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21495837;
 //BA.debugLineNum = 21495837;BA.debugLine="End Sub";
return "";
}
public static String  _radcapitulo_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radcapitulo_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radcapitulo_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 }else {
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 };
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="End Sub";
return "";
}
public static String  _radpagina_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radpagina_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radpagina_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 }else {
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 };
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="End Sub";
return "";
}
}