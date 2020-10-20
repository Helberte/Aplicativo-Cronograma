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
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
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
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tl = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _lm = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _pt = null;
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="Activity.LoadLayout(\"Lay_TelaCadastro\")";
mostCurrent._activity.LoadLayout("Lay_TelaCadastro",mostCurrent.activityBA);
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="painelImagem.Initialize(\"\")";
mostCurrent._painelimagem.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="panelCabecalho.Initialize (\"\")";
mostCurrent._panelcabecalho.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362437;
 //BA.debugLineNum = 25362437;BA.debugLine="panelEdTituloLivro.Initialize(\"\")";
mostCurrent._paneledtitulolivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362438;
 //BA.debugLineNum = 25362438;BA.debugLine="panelEdAutorLivro.Initialize(\"\")";
mostCurrent._paneledautorlivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362439;
 //BA.debugLineNum = 25362439;BA.debugLine="panelEdPaginasOuCap.Initialize(\"\")";
mostCurrent._paneledpaginasoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362440;
 //BA.debugLineNum = 25362440;BA.debugLine="panelMeta.Initialize(\"\")";
mostCurrent._panelmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362441;
 //BA.debugLineNum = 25362441;BA.debugLine="panelDataPrevistaFim.Initialize(\"\")";
mostCurrent._paneldataprevistafim.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362442;
 //BA.debugLineNum = 25362442;BA.debugLine="panelEdits.Initialize(\"\")";
mostCurrent._paneledits.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362444;
 //BA.debugLineNum = 25362444;BA.debugLine="lblDadosLivro.Initialize(\"\")";
mostCurrent._lbldadoslivro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362445;
 //BA.debugLineNum = 25362445;BA.debugLine="lblTipoLeitura.Initialize(\"\")";
mostCurrent._lbltipoleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362446;
 //BA.debugLineNum = 25362446;BA.debugLine="lblMeta.Initialize(\"\")";
mostCurrent._lblmeta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362447;
 //BA.debugLineNum = 25362447;BA.debugLine="lblPrevisaoTermino.Initialize(\"\")";
mostCurrent._lblprevisaotermino.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362448;
 //BA.debugLineNum = 25362448;BA.debugLine="lblMaximoDigitosTitulo.Initialize(\"\")";
mostCurrent._lblmaximodigitostitulo.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362449;
 //BA.debugLineNum = 25362449;BA.debugLine="lblMaximoDigitosAutor.Initialize(\"\")";
mostCurrent._lblmaximodigitosautor.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362450;
 //BA.debugLineNum = 25362450;BA.debugLine="lblMaximoDigitosPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitospagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362451;
 //BA.debugLineNum = 25362451;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Initialize(\"\")";
mostCurrent._lblmaximodigitosmetapagoucap.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362453;
 //BA.debugLineNum = 25362453;BA.debugLine="btCancelar.Initialize (\"Event_btCancelar\")";
mostCurrent._btcancelar.Initialize(mostCurrent.activityBA,"Event_btCancelar");
RDebugUtils.currentLine=25362454;
 //BA.debugLineNum = 25362454;BA.debugLine="btSalvar.Initialize(\"Event_btSalvar\")";
mostCurrent._btsalvar.Initialize(mostCurrent.activityBA,"Event_btSalvar");
RDebugUtils.currentLine=25362455;
 //BA.debugLineNum = 25362455;BA.debugLine="btAddFoto.Initialize(\"\")";
mostCurrent._btaddfoto.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362457;
 //BA.debugLineNum = 25362457;BA.debugLine="radPagina.Initialize(\"radPagina\")";
mostCurrent._radpagina.Initialize(mostCurrent.activityBA,"radPagina");
RDebugUtils.currentLine=25362458;
 //BA.debugLineNum = 25362458;BA.debugLine="radCapitulo.Initialize(\"radCapitulo\")";
mostCurrent._radcapitulo.Initialize(mostCurrent.activityBA,"radCapitulo");
RDebugUtils.currentLine=25362459;
 //BA.debugLineNum = 25362459;BA.debugLine="radPagina.Checked = True";
mostCurrent._radpagina.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25362462;
 //BA.debugLineNum = 25362462;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=25362464;
 //BA.debugLineNum = 25362464;BA.debugLine="scrol.Initialize( 500 )";
mostCurrent._scrol.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=25362467;
 //BA.debugLineNum = 25362467;BA.debugLine="Dim etiqueta As Label";
_etiqueta = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25362468;
 //BA.debugLineNum = 25362468;BA.debugLine="etiqueta.Initialize(\"\")";
_etiqueta.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=25362471;
 //BA.debugLineNum = 25362471;BA.debugLine="panelCabecalho.Color = Colors.RGB(0,165,255)";
mostCurrent._panelcabecalho.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (165),(int) (255)));
RDebugUtils.currentLine=25362472;
 //BA.debugLineNum = 25362472;BA.debugLine="Activity.AddView(panelCabecalho, 0%x, 0%y, 100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelcabecalho.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=25362474;
 //BA.debugLineNum = 25362474;BA.debugLine="btCancelar.Color = Colors.Transparent";
mostCurrent._btcancelar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362475;
 //BA.debugLineNum = 25362475;BA.debugLine="btCancelar.Text = \"CANCELAR\"";
mostCurrent._btcancelar.setText(BA.ObjectToCharSequence("CANCELAR"));
RDebugUtils.currentLine=25362476;
 //BA.debugLineNum = 25362476;BA.debugLine="btCancelar.TextSize = 19";
mostCurrent._btcancelar.setTextSize((float) (19));
RDebugUtils.currentLine=25362477;
 //BA.debugLineNum = 25362477;BA.debugLine="btCancelar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btcancelar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25362479;
 //BA.debugLineNum = 25362479;BA.debugLine="btSalvar.Color = Colors.Transparent";
mostCurrent._btsalvar.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362480;
 //BA.debugLineNum = 25362480;BA.debugLine="btSalvar.Text = \"SALVAR\"";
mostCurrent._btsalvar.setText(BA.ObjectToCharSequence("SALVAR"));
RDebugUtils.currentLine=25362481;
 //BA.debugLineNum = 25362481;BA.debugLine="btSalvar.TextSize = 19";
mostCurrent._btsalvar.setTextSize((float) (19));
RDebugUtils.currentLine=25362482;
 //BA.debugLineNum = 25362482;BA.debugLine="btSalvar.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btsalvar.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25362485;
 //BA.debugLineNum = 25362485;BA.debugLine="panelCabecalho.AddView(btCancelar, 1%x,  1%y, 35%";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btcancelar.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=25362486;
 //BA.debugLineNum = 25362486;BA.debugLine="Dim esquerda As Int = 100%x - btCancelar.Width -";
_esquerda = (int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btcancelar.getWidth()-mostCurrent._btcancelar.getLeft());
RDebugUtils.currentLine=25362487;
 //BA.debugLineNum = 25362487;BA.debugLine="panelCabecalho.AddView(btSalvar, esquerda, 1%y, 3";
mostCurrent._panelcabecalho.AddView((android.view.View)(mostCurrent._btsalvar.getObject()),_esquerda,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=25362490;
 //BA.debugLineNum = 25362490;BA.debugLine="scrol.Color = Colors.Cyan";
mostCurrent._scrol.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=25362491;
 //BA.debugLineNum = 25362491;BA.debugLine="scrol.Panel.Color = Colors.RGB(223,223,223)";
mostCurrent._scrol.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (223),(int) (223),(int) (223)));
RDebugUtils.currentLine=25362493;
 //BA.debugLineNum = 25362493;BA.debugLine="Dim topoScrol As Int = panelCabecalho.Top + panel";
_toposcrol = (int) (mostCurrent._panelcabecalho.getTop()+mostCurrent._panelcabecalho.getHeight());
RDebugUtils.currentLine=25362494;
 //BA.debugLineNum = 25362494;BA.debugLine="Activity.AddView(scrol, 0%x, topoScrol , 100%x, 1";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._scrol.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),_toposcrol,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-_toposcrol));
RDebugUtils.currentLine=25362496;
 //BA.debugLineNum = 25362496;BA.debugLine="lblDadosLivro.Color = Colors.Transparent";
mostCurrent._lbldadoslivro.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362497;
 //BA.debugLineNum = 25362497;BA.debugLine="lblDadosLivro.Text = \"Dados do Livro\"";
mostCurrent._lbldadoslivro.setText(BA.ObjectToCharSequence("Dados do Livro"));
RDebugUtils.currentLine=25362498;
 //BA.debugLineNum = 25362498;BA.debugLine="lblDadosLivro.TextColor = Colors.Black";
mostCurrent._lbldadoslivro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=25362499;
 //BA.debugLineNum = 25362499;BA.debugLine="lblDadosLivro.TextSize = 17";
mostCurrent._lbldadoslivro.setTextSize((float) (17));
RDebugUtils.currentLine=25362503;
 //BA.debugLineNum = 25362503;BA.debugLine="Dim tf As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=25362504;
 //BA.debugLineNum = 25362504;BA.debugLine="tf = tf.CreateNew(Typeface.DEFAULT_BOLD, Typeface";
_tf = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_tf.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=25362505;
 //BA.debugLineNum = 25362505;BA.debugLine="lblDadosLivro.Typeface = tf";
mostCurrent._lbldadoslivro.setTypeface((android.graphics.Typeface)(_tf.getObject()));
RDebugUtils.currentLine=25362514;
 //BA.debugLineNum = 25362514;BA.debugLine="lblDadosLivro.Gravity = Gravity.CENTER";
mostCurrent._lbldadoslivro.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362516;
 //BA.debugLineNum = 25362516;BA.debugLine="scrol.Panel.AddView(lblDadosLivro, 0%x, 0%y, 100%";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbldadoslivro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362518;
 //BA.debugLineNum = 25362518;BA.debugLine="painelImagem.Width = 98%x";
mostCurrent._painelimagem.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA));
RDebugUtils.currentLine=25362519;
 //BA.debugLineNum = 25362519;BA.debugLine="Dim esquerda As Int = (100%x - painelImagem.Width";
_esquerda = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._painelimagem.getWidth())/(double)2);
RDebugUtils.currentLine=25362521;
 //BA.debugLineNum = 25362521;BA.debugLine="scrol.Panel.AddView(painelImagem, esquerda , lblD";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painelimagem.getObject()),_esquerda,(int) (mostCurrent._lbldadoslivro.getTop()+mostCurrent._lbldadoslivro.getHeight()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=25362523;
 //BA.debugLineNum = 25362523;BA.debugLine="painelImagem.LoadLayout(\"Lay_Imagem\")";
mostCurrent._painelimagem.LoadLayout("Lay_Imagem",mostCurrent.activityBA);
RDebugUtils.currentLine=25362525;
 //BA.debugLineNum = 25362525;BA.debugLine="B4XImagem.ResizeMode = \"FILL\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=25362526;
 //BA.debugLineNum = 25362526;BA.debugLine="B4XImagem.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4ximagem._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=25362528;
 //BA.debugLineNum = 25362528;BA.debugLine="scrol.Panel.Height = painelImagem.Top + painelIma";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()));
RDebugUtils.currentLine=25362530;
 //BA.debugLineNum = 25362530;BA.debugLine="scrol.Panel.AddView(panelEdits, esquerda, painelI";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledits.getObject()),_esquerda,(int) (mostCurrent._painelimagem.getTop()+mostCurrent._painelimagem.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._painelimagem.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=25362531;
 //BA.debugLineNum = 25362531;BA.debugLine="panelEdits.LoadLayout(\"Lay_edTituloLivro\")";
mostCurrent._paneledits.LoadLayout("Lay_edTituloLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=25362532;
 //BA.debugLineNum = 25362532;BA.debugLine="scrol.Panel.Height = panelEdits.Top + panelEdits.";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()));
RDebugUtils.currentLine=25362535;
 //BA.debugLineNum = 25362535;BA.debugLine="etiqueta = AddLabelMaxDigitos(lblMaximoDigitosTit";
_etiqueta = _addlabelmaxdigitos(mostCurrent._lblmaximodigitostitulo,(int) (mostCurrent._paneledits.getTop()+mostCurrent._paneledits.getHeight()),_esquerda);
RDebugUtils.currentLine=25362536;
 //BA.debugLineNum = 25362536;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=25362538;
 //BA.debugLineNum = 25362538;BA.debugLine="scrol.Panel.AddView(panelEdAutorLivro, esquerda,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledautorlivro.getObject()),_esquerda,(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),_etiqueta.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=25362539;
 //BA.debugLineNum = 25362539;BA.debugLine="panelEdAutorLivro.LoadLayout(\"Lay_edAutorLivro\")";
mostCurrent._paneledautorlivro.LoadLayout("Lay_edAutorLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=25362541;
 //BA.debugLineNum = 25362541;BA.debugLine="etiqueta = AddLabelMaxDigitos(lblMaximoDigitosAut";
_etiqueta = _addlabelmaxdigitos(mostCurrent._lblmaximodigitosautor,(int) (mostCurrent._paneledautorlivro.getTop()+mostCurrent._paneledautorlivro.getHeight()),_esquerda);
RDebugUtils.currentLine=25362542;
 //BA.debugLineNum = 25362542;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=25362544;
 //BA.debugLineNum = 25362544;BA.debugLine="lblTipoLeitura.Color = Colors.Transparent";
mostCurrent._lbltipoleitura.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362545;
 //BA.debugLineNum = 25362545;BA.debugLine="lblTipoLeitura.Text = \"Tipo de leitura\"";
mostCurrent._lbltipoleitura.setText(BA.ObjectToCharSequence("Tipo de leitura"));
RDebugUtils.currentLine=25362546;
 //BA.debugLineNum = 25362546;BA.debugLine="lblTipoLeitura.TextColor = Colors.Black";
mostCurrent._lbltipoleitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=25362547;
 //BA.debugLineNum = 25362547;BA.debugLine="lblTipoLeitura.TextSize = 17";
mostCurrent._lbltipoleitura.setTextSize((float) (17));
RDebugUtils.currentLine=25362549;
 //BA.debugLineNum = 25362549;BA.debugLine="Dim tl As Typeface";
_tl = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=25362550;
 //BA.debugLineNum = 25362550;BA.debugLine="tl = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_tl = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=25362551;
 //BA.debugLineNum = 25362551;BA.debugLine="lblTipoLeitura.Typeface = tl";
mostCurrent._lbltipoleitura.setTypeface((android.graphics.Typeface)(_tl.getObject()));
RDebugUtils.currentLine=25362552;
 //BA.debugLineNum = 25362552;BA.debugLine="lblTipoLeitura.Gravity = Gravity.CENTER";
mostCurrent._lbltipoleitura.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362554;
 //BA.debugLineNum = 25362554;BA.debugLine="scrol.Panel.AddView(lblTipoLeitura, 0%x, lblMaxim";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbltipoleitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lblmaximodigitosautor.getTop()+mostCurrent._lblmaximodigitosautor.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362555;
 //BA.debugLineNum = 25362555;BA.debugLine="scrol.Panel.Height = lblTipoLeitura.Top + lblTipo";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()));
RDebugUtils.currentLine=25362557;
 //BA.debugLineNum = 25362557;BA.debugLine="radPagina.Text = \"Por página\"";
mostCurrent._radpagina.setText(BA.ObjectToCharSequence("Por página"));
RDebugUtils.currentLine=25362558;
 //BA.debugLineNum = 25362558;BA.debugLine="radPagina.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radpagina.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=25362559;
 //BA.debugLineNum = 25362559;BA.debugLine="radPagina.TextSize = 16";
mostCurrent._radpagina.setTextSize((float) (16));
RDebugUtils.currentLine=25362560;
 //BA.debugLineNum = 25362560;BA.debugLine="radPagina.Gravity = Gravity.CENTER";
mostCurrent._radpagina.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362562;
 //BA.debugLineNum = 25362562;BA.debugLine="radCapitulo.Text = \"Por capítulo\"";
mostCurrent._radcapitulo.setText(BA.ObjectToCharSequence("Por capítulo"));
RDebugUtils.currentLine=25362563;
 //BA.debugLineNum = 25362563;BA.debugLine="radCapitulo.TextColor = Colors.RGB(83,0,0)";
mostCurrent._radcapitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (0),(int) (0)));
RDebugUtils.currentLine=25362564;
 //BA.debugLineNum = 25362564;BA.debugLine="radCapitulo.TextSize = 16";
mostCurrent._radcapitulo.setTextSize((float) (16));
RDebugUtils.currentLine=25362565;
 //BA.debugLineNum = 25362565;BA.debugLine="radCapitulo.Gravity = Gravity.CENTER";
mostCurrent._radcapitulo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362567;
 //BA.debugLineNum = 25362567;BA.debugLine="scrol.Panel.AddView(radPagina, 0%x , lblTipoLeitu";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radpagina.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362569;
 //BA.debugLineNum = 25362569;BA.debugLine="scrol.Panel.AddView(radCapitulo, radPagina.Width,";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._radcapitulo.getObject()),mostCurrent._radpagina.getWidth(),(int) (mostCurrent._lbltipoleitura.getTop()+mostCurrent._lbltipoleitura.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362570;
 //BA.debugLineNum = 25362570;BA.debugLine="scrol.Panel.Height = radPagina.Top + radPagina.He";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._radpagina.getTop()+mostCurrent._radpagina.getHeight()));
RDebugUtils.currentLine=25362572;
 //BA.debugLineNum = 25362572;BA.debugLine="scrol.Panel.AddView(panelEdPaginasOuCap, esquerda";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneledpaginasoucap.getObject()),_esquerda,(int) (mostCurrent._radcapitulo.getTop()+mostCurrent._radcapitulo.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=25362573;
 //BA.debugLineNum = 25362573;BA.debugLine="panelEdPaginasOuCap.LoadLayout(\"Lay_edPagOuCapitu";
mostCurrent._paneledpaginasoucap.LoadLayout("Lay_edPagOuCapitulo",mostCurrent.activityBA);
RDebugUtils.currentLine=25362575;
 //BA.debugLineNum = 25362575;BA.debugLine="etiqueta = AddLabelMaxDigitos(lblMaximoDigitosPag";
_etiqueta = _addlabelmaxdigitos(mostCurrent._lblmaximodigitospagoucap,(int) (mostCurrent._paneledpaginasoucap.getTop()+mostCurrent._paneledpaginasoucap.getHeight()),_esquerda);
RDebugUtils.currentLine=25362576;
 //BA.debugLineNum = 25362576;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=25362578;
 //BA.debugLineNum = 25362578;BA.debugLine="lblMeta.Color = Colors.Transparent";
mostCurrent._lblmeta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362579;
 //BA.debugLineNum = 25362579;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas / cap ler";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas / cap ler por dia?"));
RDebugUtils.currentLine=25362580;
 //BA.debugLineNum = 25362580;BA.debugLine="lblMeta.TextColor = Colors.Black";
mostCurrent._lblmeta.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=25362581;
 //BA.debugLineNum = 25362581;BA.debugLine="lblMeta.TextSize = 17";
mostCurrent._lblmeta.setTextSize((float) (17));
RDebugUtils.currentLine=25362583;
 //BA.debugLineNum = 25362583;BA.debugLine="Dim lm As Typeface";
_lm = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=25362584;
 //BA.debugLineNum = 25362584;BA.debugLine="lm = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_lm = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=25362585;
 //BA.debugLineNum = 25362585;BA.debugLine="lblMeta.Typeface = lm";
mostCurrent._lblmeta.setTypeface((android.graphics.Typeface)(_lm.getObject()));
RDebugUtils.currentLine=25362586;
 //BA.debugLineNum = 25362586;BA.debugLine="lblMeta.Gravity = Gravity.CENTER";
mostCurrent._lblmeta.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362588;
 //BA.debugLineNum = 25362588;BA.debugLine="scrol.Panel.AddView(lblMeta, 0%x, etiqueta.Top +";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblmeta.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362589;
 //BA.debugLineNum = 25362589;BA.debugLine="scrol.Panel.Height = lblMeta.Top + lblMeta.Height";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()));
RDebugUtils.currentLine=25362591;
 //BA.debugLineNum = 25362591;BA.debugLine="scrol.Panel.AddView(panelMeta, esquerda, lblMeta.";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._panelmeta.getObject()),_esquerda,(int) (mostCurrent._lblmeta.getTop()+mostCurrent._lblmeta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA));
RDebugUtils.currentLine=25362592;
 //BA.debugLineNum = 25362592;BA.debugLine="panelMeta.LoadLayout(\"Lay_edMetaPagCap\")";
mostCurrent._panelmeta.LoadLayout("Lay_edMetaPagCap",mostCurrent.activityBA);
RDebugUtils.currentLine=25362594;
 //BA.debugLineNum = 25362594;BA.debugLine="etiqueta = AddLabelMaxDigitos(lblMaximoDigitosMet";
_etiqueta = _addlabelmaxdigitos(mostCurrent._lblmaximodigitosmetapagoucap,(int) (mostCurrent._panelmeta.getTop()+mostCurrent._panelmeta.getHeight()),_esquerda);
RDebugUtils.currentLine=25362595;
 //BA.debugLineNum = 25362595;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
mostCurrent._scrol.getPanel().setHeight((int) (_etiqueta.getTop()+_etiqueta.getHeight()));
RDebugUtils.currentLine=25362597;
 //BA.debugLineNum = 25362597;BA.debugLine="lblPrevisaoTermino.Color = Colors.Transparent";
mostCurrent._lblprevisaotermino.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25362598;
 //BA.debugLineNum = 25362598;BA.debugLine="lblPrevisaoTermino.Text = \"Previsão para término\"";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence("Previsão para término"));
RDebugUtils.currentLine=25362599;
 //BA.debugLineNum = 25362599;BA.debugLine="lblPrevisaoTermino.TextColor = Colors.Black";
mostCurrent._lblprevisaotermino.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=25362600;
 //BA.debugLineNum = 25362600;BA.debugLine="lblPrevisaoTermino.TextSize = 17";
mostCurrent._lblprevisaotermino.setTextSize((float) (17));
RDebugUtils.currentLine=25362602;
 //BA.debugLineNum = 25362602;BA.debugLine="Dim pt As Typeface";
_pt = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=25362603;
 //BA.debugLineNum = 25362603;BA.debugLine="pt = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
_pt = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC)));
RDebugUtils.currentLine=25362604;
 //BA.debugLineNum = 25362604;BA.debugLine="lblPrevisaoTermino.Typeface = pt";
mostCurrent._lblprevisaotermino.setTypeface((android.graphics.Typeface)(_pt.getObject()));
RDebugUtils.currentLine=25362605;
 //BA.debugLineNum = 25362605;BA.debugLine="lblPrevisaoTermino.Gravity = Gravity.CENTER";
mostCurrent._lblprevisaotermino.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=25362607;
 //BA.debugLineNum = 25362607;BA.debugLine="scrol.Panel.AddView(lblPrevisaoTermino, 0%x, etiq";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lblprevisaotermino.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),(int) (_etiqueta.getTop()+_etiqueta.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=25362608;
 //BA.debugLineNum = 25362608;BA.debugLine="scrol.Panel.Height = lblPrevisaoTermino.Top + lbl";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()));
RDebugUtils.currentLine=25362610;
 //BA.debugLineNum = 25362610;BA.debugLine="panelDataPrevistaFim.Color = Colors.Blue";
mostCurrent._paneldataprevistafim.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=25362611;
 //BA.debugLineNum = 25362611;BA.debugLine="scrol.Panel.AddView(panelDataPrevistaFim, esquerd";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._paneldataprevistafim.getObject()),_esquerda,(int) (mostCurrent._lblprevisaotermino.getTop()+mostCurrent._lblprevisaotermino.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=25362612;
 //BA.debugLineNum = 25362612;BA.debugLine="panelDataPrevistaFim.LoadLayout(\"Lay_Previsao_ter";
mostCurrent._paneldataprevistafim.LoadLayout("Lay_Previsao_termino",mostCurrent.activityBA);
RDebugUtils.currentLine=25362613;
 //BA.debugLineNum = 25362613;BA.debugLine="scrol.Panel.Height = panelDataPrevistaFim.Top + p";
mostCurrent._scrol.getPanel().setHeight((int) (mostCurrent._paneldataprevistafim.getTop()+mostCurrent._paneldataprevistafim.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
RDebugUtils.currentLine=25362615;
 //BA.debugLineNum = 25362615;BA.debugLine="hoje = \"Dia: \" & DateTime.Date(DateTime.Now)";
mostCurrent._hoje = "Dia: "+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=25362616;
 //BA.debugLineNum = 25362616;BA.debugLine="lblDataPrevisao.Text = hoje";
mostCurrent._lbldataprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=25362618;
 //BA.debugLineNum = 25362618;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25362619;
 //BA.debugLineNum = 25362619;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _addlabelmaxdigitos(anywheresoftware.b4a.objects.LabelWrapper _etiqueta,int _topo,int _esquerda) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addlabelmaxdigitos", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "addlabelmaxdigitos", new Object[] {_etiqueta,_topo,_esquerda}));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Sub AddLabelMaxDigitos(etiqueta As Label, topo As";
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="etiqueta.Text = \"1/100  \"";
_etiqueta.setText(BA.ObjectToCharSequence("1/100  "));
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="etiqueta.Gravity = Bit.Or(Gravity.RIGHT, Gravity.";
_etiqueta.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT,anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=25427972;
 //BA.debugLineNum = 25427972;BA.debugLine="etiqueta.TextColor = Colors.Black";
_etiqueta.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=25427973;
 //BA.debugLineNum = 25427973;BA.debugLine="etiqueta.Color = Colors.Transparent";
_etiqueta.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25427975;
 //BA.debugLineNum = 25427975;BA.debugLine="scrol.Panel.AddView(etiqueta, esquerda, topo, pan";
mostCurrent._scrol.getPanel().AddView((android.view.View)(_etiqueta.getObject()),_esquerda,_topo,mostCurrent._paneledits.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=25427976;
 //BA.debugLineNum = 25427976;BA.debugLine="Return etiqueta";
if (true) return _etiqueta;
RDebugUtils.currentLine=25427977;
 //BA.debugLineNum = 25427977;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="btCancelar.Top = -5%y";
mostCurrent._btcancelar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="btCancelar.TextColor = Colors.Transparent";
mostCurrent._btcancelar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="btCancelar.SetLayoutAnimated(1000, 1%x, 1%y, 35%x";
mostCurrent._btcancelar.SetLayoutAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="btCancelar.SetTextColorAnimated(1500, Colors.RGB(";
mostCurrent._btcancelar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="btSalvar.Top = -5%y";
mostCurrent._btsalvar.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="btSalvar.TextColor = Colors.Transparent";
mostCurrent._btsalvar.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="btSalvar.SetLayoutAnimated(1000, 100%x - btSalvar";
mostCurrent._btsalvar.SetLayoutAnimated((int) (1000),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._btsalvar.getWidth()-mostCurrent._btcancelar.getLeft()),mostCurrent._btcancelar.getTop(),mostCurrent._btcancelar.getWidth(),mostCurrent._btcancelar.getHeight());
RDebugUtils.currentLine=25493513;
 //BA.debugLineNum = 25493513;BA.debugLine="btSalvar.SetTextColorAnimated(1500, Colors.RGB(21";
mostCurrent._btsalvar.SetTextColorAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (213),(int) (4),(int) (4)));
RDebugUtils.currentLine=25493515;
 //BA.debugLineNum = 25493515;BA.debugLine="End Sub";
return "";
}
public static String  _btaddimagem_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btaddimagem_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btaddimagem_click", null));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Sub btAddImagem_Click";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Try";
try {RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(processBA,"image/*","Choose image");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha!"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="End Sub";
return "";
}
public static String  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cc_result", new Object[] {_success,_dir,_filename}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="B4XImagem.ResizeMode = \"FIT\"";
mostCurrent._b4ximagem._setresizemode /*String*/ (null,"FIT");
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="B4XImagem.Load(Dir, FileName)";
mostCurrent._b4ximagem._load /*String*/ (null,_dir,_filename);
 }else {
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Nenhuma foto escolhida"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=25755657;
 //BA.debugLineNum = 25755657;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatautorlivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatautorlivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Sub edB4XFloatAutorLivro_TextChanged (Old As Strin";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="edB4XFloatAutorLivro.Text = edB4XFloatAutorLivro";
mostCurrent._edb4xfloatautorlivro._settext /*String*/ (null,mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Sub edB4XFloatMetaPagCap_TextChanged (Old As Strin";
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="Dim meta As Int = New";
_meta = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=26411013;
 //BA.debugLineNum = 26411013;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=26411014;
 //BA.debugLineNum = 26411014;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=26411016;
 //BA.debugLineNum = 26411016;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=26411018;
 //BA.debugLineNum = 26411018;BA.debugLine="quantPag = edB4XFloatPagOuCap.Text";
_quantpag = (int)(Double.parseDouble(mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=26411020;
 //BA.debugLineNum = 26411020;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=26411022;
 //BA.debugLineNum = 26411022;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26411023;
 //BA.debugLineNum = 26411023;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=26411025;
 //BA.debugLineNum = 26411025;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=26411027;
 //BA.debugLineNum = 26411027;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=26411029;
 //BA.debugLineNum = 26411029;BA.debugLine="lblPrevisaoTermino.Text = data";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(_data));
 }else {
RDebugUtils.currentLine=26411031;
 //BA.debugLineNum = 26411031;BA.debugLine="lblPrevisaoTermino.Text = hoje";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=26411032;
 //BA.debugLineNum = 26411032;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=26411036;
 //BA.debugLineNum = 26411036;BA.debugLine="lblPrevisaoTermino.Text = hoje";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=26411037;
 //BA.debugLineNum = 26411037;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=26411039;
 //BA.debugLineNum = 26411039;BA.debugLine="End Sub";
return "";
}
public static String  _edb4xfloatnomelivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edb4xfloatnomelivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Sub edB4XFloatNomeLivro_TextChanged (Old As String";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="edB4XFloatNomeLivro.Text = edB4XFloatNomeLivro.T";
mostCurrent._edb4xfloatnomelivro._settext /*String*/ (null,mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).replace("'",""));
 };
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub edB4XFloatPagOuCap_TextChanged (Old As String,";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="Dim meta As Int";
_meta = 0;
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("") == false) { 
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="quantPag = New";
_quantpag = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=26476557;
 //BA.debugLineNum = 26476557;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=26476559;
 //BA.debugLineNum = 26476559;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26476560;
 //BA.debugLineNum = 26476560;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=26476564;
 //BA.debugLineNum = 26476564;BA.debugLine="dataPrevistaFinal = data";
mostCurrent._dataprevistafinal = _data;
RDebugUtils.currentLine=26476566;
 //BA.debugLineNum = 26476566;BA.debugLine="lblPrevisaoTermino.Text = data";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(_data));
 }else {
RDebugUtils.currentLine=26476568;
 //BA.debugLineNum = 26476568;BA.debugLine="lblPrevisaoTermino.Text = hoje";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=26476569;
 //BA.debugLineNum = 26476569;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=26476573;
 //BA.debugLineNum = 26476573;BA.debugLine="lblPrevisaoTermino.Text = hoje";
mostCurrent._lblprevisaotermino.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=26476574;
 //BA.debugLineNum = 26476574;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=26476576;
 //BA.debugLineNum = 26476576;BA.debugLine="End Sub";
return "";
}
public static String  _event_btcancelar_click() throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_btcancelar_click", null));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub Event_btCancelar_Click";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="btCancelar.SetColorAnimated(100, Colors.RGB(82,18";
mostCurrent._btcancelar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="btSalvar.SetColorAnimated(100, Colors.RGB(82,183,";
parent.mostCurrent._btsalvar.SetColorAnimated((int) (100),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (82),(int) (183),(int) (239)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="Dim pag_ou_cap As String";
_pag_ou_cap = "";
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="If edB4XFloatNomeLivro.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 46;
if ((parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=26214408;
 //BA.debugLineNum = 26214408;BA.debugLine="Else If edB4XFloatAutorLivro.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 46;
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o título do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 5:
//C
this.state = 46;
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
_pag_ou_cap = "Quantos capítulos";
RDebugUtils.currentLine=26214414;
 //BA.debugLineNum = 26214414;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
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
RDebugUtils.currentLine=26214416;
 //BA.debugLineNum = 26214416;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim = \"\" Then";
if (true) break;

case 14:
//if
this.state = 45;
if ((parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 16;
}else 
{RDebugUtils.currentLine=26214420;
 //BA.debugLineNum = 26214420;BA.debugLine="else If edB4XFloatMetaPagCap.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null).trim()).equals("")) { 
this.state = 18;
}else {
this.state = 20;
}}
if (true) break;

case 16:
//C
this.state = 45;
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! "+_pag_ou_cap+" o livro tem?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 18:
//C
this.state = 45;
RDebugUtils.currentLine=26214422;
 //BA.debugLineNum = 26214422;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual a sua meta diária?"),BA.ObjectToCharSequence("Calma..."),processBA);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=26214425;
 //BA.debugLineNum = 26214425;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
_meta = 0;
_quantidade_pag_cap = 0;
RDebugUtils.currentLine=26214427;
 //BA.debugLineNum = 26214427;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
_meta = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)));
RDebugUtils.currentLine=26214428;
 //BA.debugLineNum = 26214428;BA.debugLine="quantidade_pag_cap = edB4XFloatPagOuCap.Text";
_quantidade_pag_cap = (int)(Double.parseDouble(parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)));
RDebugUtils.currentLine=26214430;
 //BA.debugLineNum = 26214430;BA.debugLine="If meta > quantidade_pag_cap Then";
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
RDebugUtils.currentLine=26214431;
 //BA.debugLineNum = 26214431;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Informações incoerentes"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=26214434;
 //BA.debugLineNum = 26214434;BA.debugLine="Try";
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
RDebugUtils.currentLine=26214435;
 //BA.debugLineNum = 26214435;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
_cmd = "";
_datainicial = "";
_tipoleitura = "";
RDebugUtils.currentLine=26214437;
 //BA.debugLineNum = 26214437;BA.debugLine="tipoLeitura = \"páginas\"";
_tipoleitura = "páginas";
RDebugUtils.currentLine=26214438;
 //BA.debugLineNum = 26214438;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"ca";
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
RDebugUtils.currentLine=26214440;
 //BA.debugLineNum = 26214440;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
_datainicial = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=26214442;
 //BA.debugLineNum = 26214442;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edB4XFl";
_cmd = "exec sp_cad_livro_leitura '"+parent.mostCurrent._edb4xfloatnomelivro._gettext /*String*/ (null)+"', '"+parent.mostCurrent._edb4xfloatautorlivro._gettext /*String*/ (null)+"', '"+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+"', '"+_datainicial+"', '"+_tipoleitura+"', '"+parent.mostCurrent._edb4xfloatpagoucap._gettext /*String*/ (null)+"', '"+parent.mostCurrent._dataprevistafinal+"', '"+parent.mostCurrent._edb4xfloatmetapagcap._gettext /*String*/ (null)+"'";
RDebugUtils.currentLine=26214451;
 //BA.debugLineNum = 26214451;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=26214453;
 //BA.debugLineNum = 26214453;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=26214455;
 //BA.debugLineNum = 26214455;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
if (true) break;

case 35:
//if
this.state = 40;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 37;
}else 
{RDebugUtils.currentLine=26214463;
 //BA.debugLineNum = 26214463;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 The";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 39;
}}
if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=26214457;
 //BA.debugLineNum = 26214457;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=26214458;
 //BA.debugLineNum = 26214458;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26214459;
 //BA.debugLineNum = 26214459;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
RDebugUtils.currentLine=26214460;
 //BA.debugLineNum = 26214460;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=26214461;
 //BA.debugLineNum = 26214461;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=26214465;
 //BA.debugLineNum = 26214465;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=26214466;
 //BA.debugLineNum = 26214466;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!!"),processBA);
RDebugUtils.currentLine=26214467;
 //BA.debugLineNum = 26214467;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_telacadastro", "event_btsalvar_click"),(int) (1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
RDebugUtils.currentLine=26214468;
 //BA.debugLineNum = 26214468;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=26214469;
 //BA.debugLineNum = 26214469;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=26214473;
 //BA.debugLineNum = 26214473;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
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
RDebugUtils.currentLine=26214478;
 //BA.debugLineNum = 26214478;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 }else {
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 };
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="End Sub";
return "";
}
public static String  _radpagina_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_telacadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radpagina_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radpagina_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 }else {
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 };
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="End Sub";
return "";
}
}