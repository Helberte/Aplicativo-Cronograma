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

public class codigolayleituras extends Activity implements B4AActivity{
	public static codigolayleituras mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigolayleituras");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigolayleituras).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigolayleituras");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigolayleituras", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigolayleituras) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigolayleituras) Resume **");
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
		return codigolayleituras.class;
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
            BA.LogInfo("** Activity (codigolayleituras) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigolayleituras) Pause event (activity is not paused). **");
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
            codigolayleituras mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigolayleituras) Resume **");
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
public static boolean _tempanel = false;
public static boolean _tempanelleituraconcluida = false;
public b4a.example.classbancodados _banco = null;
public anywheresoftware.b4a.objects.TabStripViewPager _tabstrip = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_inicial_leitura = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview2 = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnenhumaleitura = null;
public static int[] _cores = null;
public static int _tamanholista = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btadicionarleitura = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_lendo = null;
public static String _nomearquivo = "";
public static boolean _carrega_leitura_concluida = false;
public anywheresoftware.b4a.objects.PanelWrapper _panel_lidos = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_parabens = null;
public b4a.example.b4ximageview _b4ximage_parabens = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.codigolayleituras parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.codigolayleituras parent;
boolean _firsttime;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolayleituras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
parent.mostCurrent._activity.LoadLayout("LayLeiturasTabStrip",mostCurrent.activityBA);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu1",BA.ObjectToCharSequence("Lendo"));
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu2",BA.ObjectToCharSequence("Lidos"));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="banco.Initialize";
parent.mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
parent._cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
parent._cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
parent.mostCurrent._panelnenhumaleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="carrega_leitura_concluida = FirstTime";
parent._carrega_leitura_concluida = _firsttime;
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="If FirstTime Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_firsttime) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="If Success = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=4259864;
 //BA.debugLineNum = 4259864;BA.debugLine="btAdicionarLeitura.SetBackgroundImage(LoadBitmap(";
parent.mostCurrent._btadicionarleitura.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_adicionar.png").getObject()));
RDebugUtils.currentLine=4259865;
 //BA.debugLineNum = 4259865;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _atualiza_leituras() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "atualiza_leituras", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "atualiza_leituras", null));}
ResumableSub_Atualiza_leituras rsub = new ResumableSub_Atualiza_leituras(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Atualiza_leituras extends BA.ResumableSub {
public ResumableSub_Atualiza_leituras(b4a.example.codigolayleituras parent) {
this.parent = parent;
}
b4a.example.codigolayleituras parent;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
int _quantidade = 0;
anywheresoftware.b4a.objects.PanelWrapper[] _panels = null;
anywheresoftware.b4a.objects.collections.List _listainformacoes = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbltitulolivro = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbldatacomecoleitura = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lblprevisaotermino = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lblquantidadepaginas = null;
anywheresoftware.b4a.objects.ButtonWrapper[] _btanotar = null;
anywheresoftware.b4a.objects.ButtonWrapper[] _btlancar = null;
int _tamanho_fonte = 0;
int _topo = 0;
int _topolabel = 0;
int _i = 0;
int _altura = 0;
int step49;
int limit49;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolayleituras";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 31;
this.catchState = 30;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 30;
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
_cmd = "exec sp_atualiza_leituras "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
if (true) break;

case 4:
//if
this.state = 28;
if (_result.GetInt("RESULTADO")==2) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
if (_result.GetInt("RESULTADO")==0) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
if (_result.GetInt("RESULTADO")==1) { 
this.state = 14;
}else {
this.state = 27;
}}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="If temPanel Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._tempanel) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="lbl_Inicial_Leitura.Initialize(\"Event_lbl\")";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
 if (true) break;

case 10:
//C
this.state = 28;
;
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="lbl_Inicial_Leitura.Visible = True";
parent.mostCurrent._lbl_inicial_leitura.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
parent.mostCurrent._lbl_inicial_leitura.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.RGB(161,";
parent.mostCurrent._lbl_inicial_leitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (161),(int) (92),(int) (92)));
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
parent.mostCurrent._lbl_inicial_leitura.setTextSize((float) (20));
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="lbl_Inicial_Leitura.Gravity = Gravity.CENTER";
parent.mostCurrent._lbl_inicial_leitura.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="scrollView1.Initialize (800)";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (800));
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=4522012;
 //BA.debugLineNum = 4522012;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(parent.mostCurrent._lbl_inicial_leitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 12:
//C
this.state = 28;
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4522022;
 //BA.debugLineNum = 4522022;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
parent.mostCurrent._gradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),parent._cores);
RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="gradient.CornerRadius = 12";
parent.mostCurrent._gradient.setCornerRadius((float) (12));
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
_quantidade = _result.GetInt("QUANTIDADE");
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="Dim panels(quantidade) As Panel";
_panels = new anywheresoftware.b4a.objects.PanelWrapper[_quantidade];
{
int d0 = _panels.length;
for (int i0 = 0;i0 < d0;i0++) {
_panels[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="Dim listaInformacoes As List";
_listainformacoes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4522031;
 //BA.debugLineNum = 4522031;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
_lbltitulolivro = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbltitulolivro.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbltitulolivro[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4522032;
 //BA.debugLineNum = 4522032;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
_lbldatacomecoleitura = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbldatacomecoleitura.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbldatacomecoleitura[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4522033;
 //BA.debugLineNum = 4522033;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
_lblprevisaotermino = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblprevisaotermino.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblprevisaotermino[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4522034;
 //BA.debugLineNum = 4522034;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
_lblquantidadepaginas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblquantidadepaginas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblquantidadepaginas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4522036;
 //BA.debugLineNum = 4522036;BA.debugLine="Dim btAnotar(quantidade) As Button";
_btanotar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btanotar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btanotar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=4522037;
 //BA.debugLineNum = 4522037;BA.debugLine="Dim btLancar(quantidade) As Button";
_btlancar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btlancar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btlancar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=4522039;
 //BA.debugLineNum = 4522039;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
_tamanho_fonte = (int) (17.5);
RDebugUtils.currentLine=4522041;
 //BA.debugLineNum = 4522041;BA.debugLine="Dim topo As Int = 1%y";
_topo = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4522042;
 //BA.debugLineNum = 4522042;BA.debugLine="Dim topoLabel As Int = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4522044;
 //BA.debugLineNum = 4522044;BA.debugLine="If temPanel Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent._tempanel) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=4522045;
 //BA.debugLineNum = 4522045;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
RDebugUtils.currentLine=4522046;
 //BA.debugLineNum = 4522046;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=4522049;
 //BA.debugLineNum = 4522049;BA.debugLine="If temPanel = False Then";

case 18:
//if
this.state = 25;
if (parent._tempanel==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=4522051;
 //BA.debugLineNum = 4522051;BA.debugLine="temPanel = True";
parent._tempanel = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4522052;
 //BA.debugLineNum = 4522052;BA.debugLine="scrollView1.Initialize( 800 )";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (800));
RDebugUtils.currentLine=4522053;
 //BA.debugLineNum = 4522053;BA.debugLine="listaInformacoes.Initialize";
_listainformacoes.Initialize();
RDebugUtils.currentLine=4522055;
 //BA.debugLineNum = 4522055;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),parent.mostCurrent._btadicionarleitura.getTop());
RDebugUtils.currentLine=4522057;
 //BA.debugLineNum = 4522057;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4522058;
 //BA.debugLineNum = 4522058;BA.debugLine="For i = 0 To panels.Length - 1";
if (true) break;

case 21:
//for
this.state = 24;
step49 = 1;
limit49 = (int) (_panels.length-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if ((step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49)) this.state = 23;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step49)) ;
if (true) break;

case 23:
//C
this.state = 34;
RDebugUtils.currentLine=4522060;
 //BA.debugLineNum = 4522060;BA.debugLine="topoLabel = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4522061;
 //BA.debugLineNum = 4522061;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
_panels[_i].Initialize(mostCurrent.activityBA,"Event_panels");
RDebugUtils.currentLine=4522063;
 //BA.debugLineNum = 4522063;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
_lbltitulolivro[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522064;
 //BA.debugLineNum = 4522064;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
_lbldatacomecoleitura[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522065;
 //BA.debugLineNum = 4522065;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
_lblprevisaotermino[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522066;
 //BA.debugLineNum = 4522066;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
_lblquantidadepaginas[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4522068;
 //BA.debugLineNum = 4522068;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
_btanotar[_i].Initialize(mostCurrent.activityBA,"Event_btAnotar");
RDebugUtils.currentLine=4522069;
 //BA.debugLineNum = 4522069;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
_btlancar[_i].Initialize(mostCurrent.activityBA,"Event_btLancar");
RDebugUtils.currentLine=4522071;
 //BA.debugLineNum = 4522071;BA.debugLine="panels(i).Background = gradient";
_panels[_i].setBackground((android.graphics.drawable.Drawable)(parent.mostCurrent._gradient.getObject()));
RDebugUtils.currentLine=4522072;
 //BA.debugLineNum = 4522072;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
_panels[_i].setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4522073;
 //BA.debugLineNum = 4522073;BA.debugLine="panels(i).Elevation = 3dip";
_panels[_i].setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))));
RDebugUtils.currentLine=4522075;
 //BA.debugLineNum = 4522075;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(_panels[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_topo,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=4522076;
 //BA.debugLineNum = 4522076;BA.debugLine="panels(i).Tag = i";
_panels[_i].setTag((Object)(_i));
RDebugUtils.currentLine=4522078;
 //BA.debugLineNum = 4522078;BA.debugLine="lblTituloLivro(i) = configuraLabel(Result.Get";
_lbltitulolivro[_i] = _configuralabel(_result.GetString("nome"),(int) (23),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (151),(int) (1)));
RDebugUtils.currentLine=4522079;
 //BA.debugLineNum = 4522079;BA.debugLine="lblDataComecoLeitura(i) = configuraLabel(\"Com";
_lbldatacomecoleitura[_i] = _configuralabel("Começei ler dia "+_result.GetString("data_inicial"),_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4522080;
 //BA.debugLineNum = 4522080;BA.debugLine="lblPrevisaoTermino(i) = configuraLabel(\"Previ";
_lblprevisaotermino[_i] = _configuralabel("Previsão de Término "+_result.GetString("data_prevista_final"),_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4522081;
 //BA.debugLineNum = 4522081;BA.debugLine="lblQuantidadePaginas(i) = configuraLabel(Resu";
_lblquantidadepaginas[_i] = _configuralabel(_result.GetString("paginas_ou_cap_lidos")+" "+_result.GetString("tipo_de_leitura")+" de "+_result.GetString("quantidade_paginas"),_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4522083;
 //BA.debugLineNum = 4522083;BA.debugLine="Dim altura As Int = 3.5%y";
_altura = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.5),mostCurrent.activityBA);
RDebugUtils.currentLine=4522084;
 //BA.debugLineNum = 4522084;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
_panels[_i].AddView((android.view.View)(_lbltitulolivro[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522085;
 //BA.debugLineNum = 4522085;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
RDebugUtils.currentLine=4522086;
 //BA.debugLineNum = 4522086;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
_panels[_i].AddView((android.view.View)(_lbldatacomecoleitura[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4522087;
 //BA.debugLineNum = 4522087;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=4522088;
 //BA.debugLineNum = 4522088;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
_panels[_i].AddView((android.view.View)(_lblprevisaotermino[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4522089;
 //BA.debugLineNum = 4522089;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=4522090;
 //BA.debugLineNum = 4522090;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
_panels[_i].AddView((android.view.View)(_lblquantidadepaginas[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4522091;
 //BA.debugLineNum = 4522091;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=4522093;
 //BA.debugLineNum = 4522093;BA.debugLine="btAnotar(i).Tag = i";
_btanotar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=4522098;
 //BA.debugLineNum = 4522098;BA.debugLine="listaInformacoes.Add(\"'\" & Result.GetString(\"";
_listainformacoes.Add((Object)("'"+_result.GetString("nome")+"|¨'"+BA.NumberToString(_result.GetInt("quantidade_paginas"))+"|¨'"+BA.NumberToString(_result.GetInt("fk_id_Livro"))+"|¨'"+_result.GetString("usuarioNome")+"|¨'"+_result.GetString("tipo_de_leitura")+"|¨'"+_result.GetString("paginas_ou_cap_lidos")+"|¨'"+_result.GetString("meta")+"|"));
RDebugUtils.currentLine=4522106;
 //BA.debugLineNum = 4522106;BA.debugLine="tamanhoLista = 7";
parent._tamanholista = (int) (7);
RDebugUtils.currentLine=4522111;
 //BA.debugLineNum = 4522111;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
_btanotar[_i].setText(BA.ObjectToCharSequence("Anotar"));
RDebugUtils.currentLine=4522112;
 //BA.debugLineNum = 4522112;BA.debugLine="btAnotar(i).TextSize = 16";
_btanotar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=4522113;
 //BA.debugLineNum = 4522113;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
_btanotar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=4522114;
 //BA.debugLineNum = 4522114;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
_btanotar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522115;
 //BA.debugLineNum = 4522115;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
_panels[_i].AddView((android.view.View)(_btanotar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522117;
 //BA.debugLineNum = 4522117;BA.debugLine="btLancar(i).Tag = i";
_btlancar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=4522119;
 //BA.debugLineNum = 4522119;BA.debugLine="btLancar(i).Text = \"Lançar\"";
_btlancar[_i].setText(BA.ObjectToCharSequence("Lançar"));
RDebugUtils.currentLine=4522120;
 //BA.debugLineNum = 4522120;BA.debugLine="btLancar(i).TextSize = 16";
_btlancar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=4522121;
 //BA.debugLineNum = 4522121;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
_btlancar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=4522122;
 //BA.debugLineNum = 4522122;BA.debugLine="btLancar(i).Color = Colors.Transparent";
_btlancar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=4522123;
 //BA.debugLineNum = 4522123;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
_panels[_i].AddView((android.view.View)(_btlancar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=4522125;
 //BA.debugLineNum = 4522125;BA.debugLine="topo = topo + 25%y + 10dip";
_topo = (int) (_topo+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=4522127;
 //BA.debugLineNum = 4522127;BA.debugLine="scrollView1.Panel.Height = topo";
parent.mostCurrent._scrollview1.getPanel().setHeight(_topo);
RDebugUtils.currentLine=4522128;
 //BA.debugLineNum = 4522128;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=4522130;
 //BA.debugLineNum = 4522130;BA.debugLine="File.WriteList(File.DirInternal, nomeArquivo,";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent.mostCurrent._nomearquivo,_listainformacoes);
 if (true) break;

case 25:
//C
this.state = 28;
;
RDebugUtils.currentLine=4522133;
 //BA.debugLineNum = 4522133;BA.debugLine="lbl_Inicial_Leitura.Visible = False";
parent.mostCurrent._lbl_inicial_leitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522134;
 //BA.debugLineNum = 4522134;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=4522136;
 //BA.debugLineNum = 4522136;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522137;
 //BA.debugLineNum = 4522137;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
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
RDebugUtils.currentLine=4522140;
 //BA.debugLineNum = 4522140;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4522141;
 //BA.debugLineNum = 4522141;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4522143;
 //BA.debugLineNum = 4522143;BA.debugLine="End Sub";
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
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _resp = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
_resp = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Deseja realmente sair?"),BA.ObjectToCharSequence("Já vai?"),"Sim","","Não",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
if (_resp==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="KeyCode = 0";
_keycode = (int) (0);
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=4849703;
 //BA.debugLineNum = 4849703;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.codigolayleituras parent) {
this.parent = parent;
}
b4a.example.codigolayleituras parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolayleituras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="If Main.CadastrouAlgo Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._main._cadastroualgo /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 12;
return;
case 12:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="If Success = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;
;
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="If CodigoLancamentoLeitura.de_os_parabens Then";

case 8:
//if
this.state = 11;
if (parent.mostCurrent._codigolancamentoleitura._de_os_parabens /*boolean*/ ) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="CodigoLancamentoLeitura.de_os_parabens = False";
parent.mostCurrent._codigolancamentoleitura._de_os_parabens /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="B4XImage_parabens.Load(File.DirAssets, \"vitoriaL";
parent.mostCurrent._b4ximage_parabens._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"vitoriaLivro.jpg");
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="Panel_parabens.SetVisibleAnimated(1000, True)";
parent.mostCurrent._panel_parabens.SetVisibleAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.LabelWrapper  _configuralabel(String _texto,int _fonte,int _cor) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "configuralabel", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "configuralabel", new Object[] {_texto,_fonte,_cor}));}
anywheresoftware.b4a.objects.LabelWrapper _label = null;
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub configuraLabel(texto As String, fonte As Int,";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="Dim label As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="label.Initialize(\"\")";
_label.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="label.Text = texto";
_label.setText(BA.ObjectToCharSequence(_texto));
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="label.TextColor = cor";
_label.setTextColor(_cor);
RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="label.TextSize = fonte";
_label.setTextSize((float) (_fonte));
RDebugUtils.currentLine=27197448;
 //BA.debugLineNum = 27197448;BA.debugLine="Return label";
if (true) return _label;
RDebugUtils.currentLine=27197449;
 //BA.debugLineNum = 27197449;BA.debugLine="End Sub";
return null;
}
public static String  _btadicionarleitura_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btadicionarleitura_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btadicionarleitura_click", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub btAdicionarLeitura_Click";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="StartActivity(act_TelaCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_telacadastro.getObject()));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public static String  _btok_parabens_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btok_parabens_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btok_parabens_click", null));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Sub btOk_parabens_Click";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Panel_parabens.Visible = False";
mostCurrent._panel_parabens.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="End Sub";
return "";
}
public static String  _event_btanotar_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btanotar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_btanotar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _informacoes = "";
int _qtpag = 0;
int _codigolivro = 0;
String _nomelivro = "";
String _tipoleitura = "";
anywheresoftware.b4a.objects.collections.List _lista = null;
String[] _cols = null;
String _coluna = "";
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Event_btAnotar_Click";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Dim informacoes 		As String";
_informacoes = "";
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
_qtpag = 0;
_codigolivro = 0;
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Dim nomeLivro 			As String";
_nomelivro = "";
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="Dim tipoLeitura			As String";
_tipoleitura = "";
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="Try";
try {RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
_lista = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._nomearquivo);
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="informacoes = lista.Get(b.Tag)";
_informacoes = BA.ObjectToString(_lista.Get((int)(BA.ObjectToNumber(_b.getTag()))));
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="Dim cols(tamanhoLista), coluna As String";
_cols = new String[_tamanholista];
java.util.Arrays.fill(_cols,"");
_coluna = "";
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="For i = 0 To cols.Length - 1";
{
final int step12 = 1;
final int limit12 = (int) (_cols.length-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="coluna 	= informacoes.SubString2(informacoes.In";
_coluna = _informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"));
RDebugUtils.currentLine=4587541;
 //BA.debugLineNum = 4587541;BA.debugLine="informacoes = informacoes.SubString2(informacoe";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=4587543;
 //BA.debugLineNum = 4587543;BA.debugLine="cols(i) = coluna";
_cols[_i] = _coluna;
 }
};
RDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="nomeLivro = cols(0)";
_nomelivro = _cols[(int) (0)];
RDebugUtils.currentLine=4587547;
 //BA.debugLineNum = 4587547;BA.debugLine="qtPag = cols(1)";
_qtpag = (int)(Double.parseDouble(_cols[(int) (1)]));
RDebugUtils.currentLine=4587548;
 //BA.debugLineNum = 4587548;BA.debugLine="codigoLivro = cols(2)";
_codigolivro = (int)(Double.parseDouble(_cols[(int) (2)]));
RDebugUtils.currentLine=4587549;
 //BA.debugLineNum = 4587549;BA.debugLine="tipoLeitura = cols(4)";
_tipoleitura = _cols[(int) (4)];
RDebugUtils.currentLine=4587551;
 //BA.debugLineNum = 4587551;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
mostCurrent._codigolayanotacao._codigolivro /*int*/  = _codigolivro;
RDebugUtils.currentLine=4587552;
 //BA.debugLineNum = 4587552;BA.debugLine="CodigoLayAnotacao.qtPaginas   =	qtPag";
mostCurrent._codigolayanotacao._qtpaginas /*int*/  = _qtpag;
RDebugUtils.currentLine=4587553;
 //BA.debugLineNum = 4587553;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
mostCurrent._codigolayanotacao._nomedolivro /*String*/  = _nomelivro;
RDebugUtils.currentLine=4587554;
 //BA.debugLineNum = 4587554;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
mostCurrent._codigolayanotacao._tipoleitura /*String*/  = _tipoleitura;
RDebugUtils.currentLine=4587556;
 //BA.debugLineNum = 4587556;BA.debugLine="StartActivity(CodigoLayAnotacao)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayanotacao.getObject()));
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=4587558;
 //BA.debugLineNum = 4587558;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4587560;
 //BA.debugLineNum = 4587560;BA.debugLine="End Sub";
return "";
}
public static String  _event_btlancar_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_btlancar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_btlancar_click", null));}
String _titulolivro = "";
String _nomeusuario = "";
String _paginasatuais = "";
String _totalpaginas = "";
String _meta = "";
String _idlivro = "";
String _tipoleitura = "";
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
String _colunavalor = "";
String _valorsalvo = "";
String _col = "";
String[] _testearray = null;
int _coluna = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Event_btLancar_Click";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim tituloLivro As 		String";
_titulolivro = "";
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim nomeUsuario As 		String";
_nomeusuario = "";
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Dim paginasAtuais As 	String";
_paginasatuais = "";
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Dim totalPaginas As 	String";
_totalpaginas = "";
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Dim meta As 			String";
_meta = "";
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Dim idLivro As 			String";
_idlivro = "";
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Dim tipoLeitura As 		String";
_tipoleitura = "";
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="Try";
try {RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="Dim colunaValor, valorSalvo, col As String";
_colunavalor = "";
_valorsalvo = "";
_col = "";
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
_lista = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._nomearquivo);
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="colunaValor = lista.Get(b.Tag)";
_colunavalor = BA.ObjectToString(_lista.Get((int)(BA.ObjectToNumber(_b.getTag()))));
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="Dim testeArray(tamanhoLista) As	String";
_testearray = new String[_tamanholista];
java.util.Arrays.fill(_testearray,"");
RDebugUtils.currentLine=4653080;
 //BA.debugLineNum = 4653080;BA.debugLine="For coluna = 0 To testeArray.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_testearray.length-1);
_coluna = (int) (0) ;
for (;_coluna <= limit16 ;_coluna = _coluna + step16 ) {
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="col = colunaValor.SubString2(colunaValor.IndexO";
_col = _colunavalor.substring((int) (_colunavalor.indexOf("'")+1),_colunavalor.indexOf("|"));
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="valorSalvo = colunaValor.SubString2(colunaValor";
_valorsalvo = _colunavalor.substring((int) (_colunavalor.indexOf("¨")+1),_colunavalor.length());
RDebugUtils.currentLine=4653085;
 //BA.debugLineNum = 4653085;BA.debugLine="testeArray(coluna) = col";
_testearray[_coluna] = _col;
RDebugUtils.currentLine=4653086;
 //BA.debugLineNum = 4653086;BA.debugLine="colunaValor = valorSalvo";
_colunavalor = _valorsalvo;
 }
};
RDebugUtils.currentLine=4653090;
 //BA.debugLineNum = 4653090;BA.debugLine="tituloLivro = testeArray(0)";
_titulolivro = _testearray[(int) (0)];
RDebugUtils.currentLine=4653091;
 //BA.debugLineNum = 4653091;BA.debugLine="nomeUsuario = testeArray(3)";
_nomeusuario = _testearray[(int) (3)];
RDebugUtils.currentLine=4653092;
 //BA.debugLineNum = 4653092;BA.debugLine="paginasAtuais = testeArray(5)";
_paginasatuais = _testearray[(int) (5)];
RDebugUtils.currentLine=4653093;
 //BA.debugLineNum = 4653093;BA.debugLine="totalPaginas = testeArray(1)";
_totalpaginas = _testearray[(int) (1)];
RDebugUtils.currentLine=4653094;
 //BA.debugLineNum = 4653094;BA.debugLine="meta = testeArray(6)";
_meta = _testearray[(int) (6)];
RDebugUtils.currentLine=4653095;
 //BA.debugLineNum = 4653095;BA.debugLine="idLivro = testeArray(2)";
_idlivro = _testearray[(int) (2)];
RDebugUtils.currentLine=4653096;
 //BA.debugLineNum = 4653096;BA.debugLine="tipoLeitura = testeArray(4)";
_tipoleitura = _testearray[(int) (4)];
RDebugUtils.currentLine=4653098;
 //BA.debugLineNum = 4653098;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nomeUsuari";
mostCurrent._codigolancamentoleitura._nomeusuario /*String*/  = _nomeusuario;
RDebugUtils.currentLine=4653099;
 //BA.debugLineNum = 4653099;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = paginasAtu";
mostCurrent._codigolancamentoleitura._paginaatual /*int*/  = (int)(Double.parseDouble(_paginasatuais));
RDebugUtils.currentLine=4653100;
 //BA.debugLineNum = 4653100;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = tituloLivr";
mostCurrent._codigolancamentoleitura._titulolivro /*String*/  = _titulolivro;
RDebugUtils.currentLine=4653101;
 //BA.debugLineNum = 4653101;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = totalPagi";
mostCurrent._codigolancamentoleitura._totalpaginas /*int*/  = (int)(Double.parseDouble(_totalpaginas));
RDebugUtils.currentLine=4653102;
 //BA.debugLineNum = 4653102;BA.debugLine="CodigoLancamentoLeitura.meta = meta";
mostCurrent._codigolancamentoleitura._meta /*int*/  = (int)(Double.parseDouble(_meta));
RDebugUtils.currentLine=4653103;
 //BA.debugLineNum = 4653103;BA.debugLine="CodigoLancamentoLeitura.idLivro = idLivro";
mostCurrent._codigolancamentoleitura._idlivro /*int*/  = (int)(Double.parseDouble(_idlivro));
RDebugUtils.currentLine=4653104;
 //BA.debugLineNum = 4653104;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipoLeitur";
mostCurrent._codigolancamentoleitura._tipoleitura /*String*/  = _tipoleitura;
RDebugUtils.currentLine=4653106;
 //BA.debugLineNum = 4653106;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolancamentoleitura.getObject()));
 } 
       catch (Exception e38) {
			processBA.setLastException(e38);RDebugUtils.currentLine=4653109;
 //BA.debugLineNum = 4653109;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=4653111;
 //BA.debugLineNum = 4653111;BA.debugLine="End Sub";
return "";
}
public static String  _event_lbl_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_lbl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_lbl_click", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Event_lbl_Click";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="StartActivity(act_TelaCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_telacadastro.getObject()));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public static String  _event_panels_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_panels_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_panels_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub Event_panels_Click";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="p = Sender";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="MsgboxAsync(p.Tag, \"\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_p.getTag()),BA.ObjectToCharSequence(""),processBA);
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="End Sub";
return "";
}
public static void  _tabstrip_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabstrip_pageselected", false))
	 {Debug.delegate(mostCurrent.activityBA, "tabstrip_pageselected", new Object[] {_position}); return;}
ResumableSub_TabStrip_PageSelected rsub = new ResumableSub_TabStrip_PageSelected(null,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_TabStrip_PageSelected extends BA.ResumableSub {
public ResumableSub_TabStrip_PageSelected(b4a.example.codigolayleituras parent,int _position) {
this.parent = parent;
this._position = _position;
}
b4a.example.codigolayleituras parent;
int _position;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;
int _quantidade_linhas = 0;
anywheresoftware.b4a.objects.PanelWrapper[] _panels = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbl_titulo = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbl_data_termino = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbl_total_paginas = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbl_quantidade_lidas = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbl_dias_utilizados = null;
int _tamanho_fonte = 0;
int _topolabel = 0;
int _topo = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _g = null;
int _i = 0;
int _altura = 0;
int step37;
int limit37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolayleituras";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If Position = 1 Then";
if (true) break;

case 1:
//if
this.state = 33;
if (_position==1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="If carrega_leitura_concluida Or CodigoLancamento";
if (true) break;

case 4:
//if
this.state = 32;
if (parent._carrega_leitura_concluida || parent.mostCurrent._codigolancamentoleitura._terminouleitura /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="carrega_leitura_concluida = False";
parent._carrega_leitura_concluida = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="CodigoLancamentoLeitura.terminouLeitura = False";
parent.mostCurrent._codigolancamentoleitura._terminouleitura /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 31;
this.catchState = 30;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 30;
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="cmd = \"exec sp_atualiza_leitura_concluida \" &";
_cmd = "exec sp_atualiza_leitura_concluida "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "tabstrip_pageselected"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 34;
return;
case 34:
//C
this.state = 10;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 0 Then";
if (true) break;

case 10:
//if
this.state = 28;
if (_result.GetInt("RESULTADO")==0) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
if (_result.GetInt("RESULTADO")==1) { 
this.state = 14;
}else 
{RDebugUtils.currentLine=4784227;
 //BA.debugLineNum = 4784227;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 2 Then";
if (_result.GetInt("RESULTADO")==2) { 
this.state = 27;
}}}
if (true) break;

case 12:
//C
this.state = 28;
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="ToastMessageShow(\"Algo deu errado.\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado."),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="If temPanelLeituraConcluida Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent._tempanelleituraconcluida) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="temPanelLeituraConcluida = False";
parent._tempanelleituraconcluida = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4784153;
 //BA.debugLineNum = 4784153;BA.debugLine="scrollView2.RemoveView";
parent.mostCurrent._scrollview2.RemoveView();
 if (true) break;
;
RDebugUtils.currentLine=4784156;
 //BA.debugLineNum = 4784156;BA.debugLine="If temPanelLeituraConcluida = False Then";

case 18:
//if
this.state = 25;
if (parent._tempanelleituraconcluida==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="temPanelLeituraConcluida = True";
parent._tempanelleituraconcluida = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="Dim quantidade_linhas As Int = Result.GetInt";
_quantidade_linhas = _result.GetInt("QUANTIDADE_LINHAS");
RDebugUtils.currentLine=4784161;
 //BA.debugLineNum = 4784161;BA.debugLine="scrollView2.Initialize(500)";
parent.mostCurrent._scrollview2.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=4784162;
 //BA.debugLineNum = 4784162;BA.debugLine="Dim panels(quantidade_linhas) As Panel";
_panels = new anywheresoftware.b4a.objects.PanelWrapper[_quantidade_linhas];
{
int d0 = _panels.length;
for (int i0 = 0;i0 < d0;i0++) {
_panels[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="Dim lbl_titulo(quantidade_linhas) As Label";
_lbl_titulo = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade_linhas];
{
int d0 = _lbl_titulo.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbl_titulo[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4784165;
 //BA.debugLineNum = 4784165;BA.debugLine="Dim lbl_data_termino(quantidade_linhas) As L";
_lbl_data_termino = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade_linhas];
{
int d0 = _lbl_data_termino.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbl_data_termino[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4784166;
 //BA.debugLineNum = 4784166;BA.debugLine="Dim lbl_total_paginas(quantidade_linhas) As";
_lbl_total_paginas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade_linhas];
{
int d0 = _lbl_total_paginas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbl_total_paginas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="Dim lbl_quantidade_lidas(quantidade_linhas)";
_lbl_quantidade_lidas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade_linhas];
{
int d0 = _lbl_quantidade_lidas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbl_quantidade_lidas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4784168;
 //BA.debugLineNum = 4784168;BA.debugLine="Dim lbl_dias_utilizados(quantidade_linhas) A";
_lbl_dias_utilizados = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade_linhas];
{
int d0 = _lbl_dias_utilizados.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbl_dias_utilizados[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=4784170;
 //BA.debugLineNum = 4784170;BA.debugLine="Panel_lidos.AddView(scrollView2, 0%x, 0%y, 1";
parent.mostCurrent._panel_lidos.AddView((android.view.View)(parent.mostCurrent._scrollview2.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),parent.mostCurrent._btadicionarleitura.getTop());
RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
_tamanho_fonte = (int) (17.5);
RDebugUtils.currentLine=4784174;
 //BA.debugLineNum = 4784174;BA.debugLine="Dim topoLabel As Int = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4784175;
 //BA.debugLineNum = 4784175;BA.debugLine="Dim topo As Int = 1%y";
_topo = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4784176;
 //BA.debugLineNum = 4784176;BA.debugLine="Dim g As GradientDrawable";
_g = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=4784177;
 //BA.debugLineNum = 4784177;BA.debugLine="Dim cores(2) As Int";
parent._cores = new int[(int) (2)];
;
RDebugUtils.currentLine=4784178;
 //BA.debugLineNum = 4784178;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
parent._cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=4784179;
 //BA.debugLineNum = 4784179;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
parent._cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=4784181;
 //BA.debugLineNum = 4784181;BA.debugLine="g.Initialize(\"TOP_BOTTOM\", cores)";
_g.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),parent._cores);
RDebugUtils.currentLine=4784183;
 //BA.debugLineNum = 4784183;BA.debugLine="g.CornerRadius = 12";
_g.setCornerRadius((float) (12));
RDebugUtils.currentLine=4784185;
 //BA.debugLineNum = 4784185;BA.debugLine="For i = 0 To panels.Length - 1";
if (true) break;

case 21:
//for
this.state = 24;
step37 = 1;
limit37 = (int) (_panels.length-1);
_i = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 24;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 23;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 23:
//C
this.state = 36;
RDebugUtils.currentLine=4784187;
 //BA.debugLineNum = 4784187;BA.debugLine="topoLabel = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=4784189;
 //BA.debugLineNum = 4784189;BA.debugLine="lbl_titulo(i).Initialize(\"\")";
_lbl_titulo[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784190;
 //BA.debugLineNum = 4784190;BA.debugLine="lbl_data_termino(i).Initialize(\"\")";
_lbl_data_termino[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784191;
 //BA.debugLineNum = 4784191;BA.debugLine="lbl_total_paginas(i).Initialize(\"\")";
_lbl_total_paginas[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784192;
 //BA.debugLineNum = 4784192;BA.debugLine="lbl_quantidade_lidas(i).Initialize(\"\")";
_lbl_quantidade_lidas[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784193;
 //BA.debugLineNum = 4784193;BA.debugLine="lbl_dias_utilizados(i).Initialize(\"\")";
_lbl_dias_utilizados[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784195;
 //BA.debugLineNum = 4784195;BA.debugLine="panels(i).Initialize(\"\")";
_panels[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4784196;
 //BA.debugLineNum = 4784196;BA.debugLine="panels(i).Background = g";
_panels[_i].setBackground((android.graphics.drawable.Drawable)(_g.getObject()));
RDebugUtils.currentLine=4784197;
 //BA.debugLineNum = 4784197;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip";
_panels[_i].setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4784198;
 //BA.debugLineNum = 4784198;BA.debugLine="panels(i).Elevation = 3dip";
_panels[_i].setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))));
RDebugUtils.currentLine=4784200;
 //BA.debugLineNum = 4784200;BA.debugLine="panels(i).Color = Colors.White";
_panels[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784202;
 //BA.debugLineNum = 4784202;BA.debugLine="scrollView2.Panel.AddView(panels(i), 1%x, t";
parent.mostCurrent._scrollview2.getPanel().AddView((android.view.View)(_panels[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_topo,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (19),mostCurrent.activityBA));
RDebugUtils.currentLine=4784204;
 //BA.debugLineNum = 4784204;BA.debugLine="lbl_titulo(i) = configuraLabel(Result.GetSt";
_lbl_titulo[_i] = _configuralabel(_result.GetString("titulo"),(int) (23),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (151),(int) (1)));
RDebugUtils.currentLine=4784205;
 //BA.debugLineNum = 4784205;BA.debugLine="lbl_data_termino(i) = configuraLabel(\"Termi";
_lbl_data_termino[_i] = _configuralabel("Terminei no dia "+_result.GetString("data_canclusao"),_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4784206;
 //BA.debugLineNum = 4784206;BA.debugLine="lbl_total_paginas(i) = configuraLabel(Resul";
_lbl_total_paginas[_i] = _configuralabel(BA.NumberToString(_result.GetInt("paginas_ou_cap_lidos"))+" páginas de "+BA.NumberToString(_result.GetInt("quantidade_paginas")),_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4784207;
 //BA.debugLineNum = 4784207;BA.debugLine="lbl_dias_utilizados(i) = configuraLabel(\"Ga";
_lbl_dias_utilizados[_i] = _configuralabel("Gastei "+BA.NumberToString(_result.GetInt("total_dias_utilizados"))+" dias para terminar",_tamanho_fonte,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=4784209;
 //BA.debugLineNum = 4784209;BA.debugLine="Dim altura As Int = 3.5%y";
_altura = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.5),mostCurrent.activityBA);
RDebugUtils.currentLine=4784210;
 //BA.debugLineNum = 4784210;BA.debugLine="panels(i).AddView(lbl_titulo(i), 3%x, topoL";
_panels[_i].AddView((android.view.View)(_lbl_titulo[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=4784211;
 //BA.debugLineNum = 4784211;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
RDebugUtils.currentLine=4784212;
 //BA.debugLineNum = 4784212;BA.debugLine="panels(i).AddView(lbl_data_termino(i), 3%x,";
_panels[_i].AddView((android.view.View)(_lbl_data_termino[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4784213;
 //BA.debugLineNum = 4784213;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=4784214;
 //BA.debugLineNum = 4784214;BA.debugLine="panels(i).AddView(lbl_total_paginas(i), 3%x";
_panels[_i].AddView((android.view.View)(_lbl_total_paginas[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4784215;
 //BA.debugLineNum = 4784215;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=4784216;
 //BA.debugLineNum = 4784216;BA.debugLine="panels(i).AddView(lbl_dias_utilizados(i), 3";
_panels[_i].AddView((android.view.View)(_lbl_dias_utilizados[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=4784217;
 //BA.debugLineNum = 4784217;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=4784219;
 //BA.debugLineNum = 4784219;BA.debugLine="topo = topo + 19%y + 10dip";
_topo = (int) (_topo+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (19),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=4784221;
 //BA.debugLineNum = 4784221;BA.debugLine="scrollView2.Panel.Height = topo";
parent.mostCurrent._scrollview2.getPanel().setHeight(_topo);
RDebugUtils.currentLine=4784222;
 //BA.debugLineNum = 4784222;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=4784229;
 //BA.debugLineNum = 4784229;BA.debugLine="ToastMessageShow(\"Não existem leituras conclu";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Não existem leituras concluídas"),anywheresoftware.b4a.keywords.Common.True);
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
RDebugUtils.currentLine=4784233;
 //BA.debugLineNum = 4784233;BA.debugLine="ToastMessageShow(\"Problemas ao carregar leitur";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Problemas ao carregar leituras concluídas"),anywheresoftware.b4a.keywords.Common.True);
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
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=4784237;
 //BA.debugLineNum = 4784237;BA.debugLine="End Sub";
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
}