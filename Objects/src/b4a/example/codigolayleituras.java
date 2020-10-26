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
public b4a.example.classbancodados _banco = null;
public anywheresoftware.b4a.objects.TabStripViewPager _tabstrip = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_inicial_leitura = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnenhumaleitura = null;
public static int[] _cores = null;
public static int _tamanholista = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btadicionarleitura = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_lendo = null;
public static String _nomearquivo = "";
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
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
parent.mostCurrent._activity.LoadLayout("LayLeiturasTabStrip",mostCurrent.activityBA);
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu1",BA.ObjectToCharSequence("Lendo"));
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu2",BA.ObjectToCharSequence("Lidos"));
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="banco.Initialize";
parent.mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=24117258;
 //BA.debugLineNum = 24117258;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
parent._cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
parent._cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
parent.mostCurrent._panelnenhumaleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=24117263;
 //BA.debugLineNum = 24117263;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24117265;
 //BA.debugLineNum = 24117265;BA.debugLine="If FirstTime Then";
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
RDebugUtils.currentLine=24117266;
 //BA.debugLineNum = 24117266;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=24117268;
 //BA.debugLineNum = 24117268;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=24117269;
 //BA.debugLineNum = 24117269;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
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
RDebugUtils.currentLine=24117273;
 //BA.debugLineNum = 24117273;BA.debugLine="End Sub";
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
int step50;
int limit50;

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
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Try";
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
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
_cmd = "exec sp_atualiza_leituras "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=24379404;
 //BA.debugLineNum = 24379404;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
if (true) break;

case 4:
//if
this.state = 28;
if (_result.GetInt("RESULTADO")==2) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=24379425;
 //BA.debugLineNum = 24379425;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
if (_result.GetInt("RESULTADO")==0) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=24379430;
 //BA.debugLineNum = 24379430;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
if (_result.GetInt("RESULTADO")==1) { 
this.state = 14;
}else {
this.state = 27;
}}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24379406;
 //BA.debugLineNum = 24379406;BA.debugLine="If temPanel Then";
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
RDebugUtils.currentLine=24379407;
 //BA.debugLineNum = 24379407;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=24379409;
 //BA.debugLineNum = 24379409;BA.debugLine="lbl_Inicial_Leitura.Initialize(\"Event_lbl\")";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
 if (true) break;

case 10:
//C
this.state = 28;
;
RDebugUtils.currentLine=24379412;
 //BA.debugLineNum = 24379412;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24379414;
 //BA.debugLineNum = 24379414;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
parent.mostCurrent._lbl_inicial_leitura.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
RDebugUtils.currentLine=24379415;
 //BA.debugLineNum = 24379415;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
parent.mostCurrent._lbl_inicial_leitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=24379416;
 //BA.debugLineNum = 24379416;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
parent.mostCurrent._lbl_inicial_leitura.setTextSize((float) (20));
RDebugUtils.currentLine=24379418;
 //BA.debugLineNum = 24379418;BA.debugLine="scrollView1.Initialize (500)";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=24379419;
 //BA.debugLineNum = 24379419;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(parent.mostCurrent._lbl_inicial_leitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=24379424;
 //BA.debugLineNum = 24379424;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 12:
//C
this.state = 28;
RDebugUtils.currentLine=24379426;
 //BA.debugLineNum = 24379426;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24379428;
 //BA.debugLineNum = 24379428;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24379429;
 //BA.debugLineNum = 24379429;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=24379432;
 //BA.debugLineNum = 24379432;BA.debugLine="btAdicionarLeitura.Visible = True";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24379434;
 //BA.debugLineNum = 24379434;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
parent.mostCurrent._gradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),parent._cores);
RDebugUtils.currentLine=24379436;
 //BA.debugLineNum = 24379436;BA.debugLine="gradient.CornerRadius = 12";
parent.mostCurrent._gradient.setCornerRadius((float) (12));
RDebugUtils.currentLine=24379438;
 //BA.debugLineNum = 24379438;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
_quantidade = _result.GetInt("QUANTIDADE");
RDebugUtils.currentLine=24379440;
 //BA.debugLineNum = 24379440;BA.debugLine="Dim panels(quantidade) As Panel";
_panels = new anywheresoftware.b4a.objects.PanelWrapper[_quantidade];
{
int d0 = _panels.length;
for (int i0 = 0;i0 < d0;i0++) {
_panels[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=24379441;
 //BA.debugLineNum = 24379441;BA.debugLine="Dim listaInformacoes As List";
_listainformacoes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24379443;
 //BA.debugLineNum = 24379443;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
_lbltitulolivro = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbltitulolivro.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbltitulolivro[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24379444;
 //BA.debugLineNum = 24379444;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
_lbldatacomecoleitura = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbldatacomecoleitura.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbldatacomecoleitura[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24379445;
 //BA.debugLineNum = 24379445;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
_lblprevisaotermino = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblprevisaotermino.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblprevisaotermino[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24379446;
 //BA.debugLineNum = 24379446;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
_lblquantidadepaginas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblquantidadepaginas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblquantidadepaginas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24379448;
 //BA.debugLineNum = 24379448;BA.debugLine="Dim btAnotar(quantidade) As Button";
_btanotar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btanotar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btanotar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=24379449;
 //BA.debugLineNum = 24379449;BA.debugLine="Dim btLancar(quantidade) As Button";
_btlancar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btlancar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btlancar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=24379451;
 //BA.debugLineNum = 24379451;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
_tamanho_fonte = (int) (17.5);
RDebugUtils.currentLine=24379453;
 //BA.debugLineNum = 24379453;BA.debugLine="Dim topo As Int = 1%y";
_topo = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=24379454;
 //BA.debugLineNum = 24379454;BA.debugLine="Dim topoLabel As Int = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=24379456;
 //BA.debugLineNum = 24379456;BA.debugLine="If temPanel Then";
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
RDebugUtils.currentLine=24379457;
 //BA.debugLineNum = 24379457;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
RDebugUtils.currentLine=24379458;
 //BA.debugLineNum = 24379458;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=24379461;
 //BA.debugLineNum = 24379461;BA.debugLine="If temPanel = False Then";

case 18:
//if
this.state = 25;
if (parent._tempanel==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=24379463;
 //BA.debugLineNum = 24379463;BA.debugLine="temPanel = True";
parent._tempanel = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=24379464;
 //BA.debugLineNum = 24379464;BA.debugLine="scrollView1.Initialize( 500 )";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=24379465;
 //BA.debugLineNum = 24379465;BA.debugLine="listaInformacoes.Initialize";
_listainformacoes.Initialize();
RDebugUtils.currentLine=24379467;
 //BA.debugLineNum = 24379467;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),parent.mostCurrent._btadicionarleitura.getTop());
RDebugUtils.currentLine=24379470;
 //BA.debugLineNum = 24379470;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=24379471;
 //BA.debugLineNum = 24379471;BA.debugLine="For i = 0 To panels.Length - 1";
if (true) break;

case 21:
//for
this.state = 24;
step50 = 1;
limit50 = (int) (_panels.length-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 23;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step50)) ;
if (true) break;

case 23:
//C
this.state = 34;
RDebugUtils.currentLine=24379473;
 //BA.debugLineNum = 24379473;BA.debugLine="topoLabel = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=24379474;
 //BA.debugLineNum = 24379474;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
_panels[_i].Initialize(mostCurrent.activityBA,"Event_panels");
RDebugUtils.currentLine=24379476;
 //BA.debugLineNum = 24379476;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
_lbltitulolivro[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=24379477;
 //BA.debugLineNum = 24379477;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
_lbldatacomecoleitura[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=24379478;
 //BA.debugLineNum = 24379478;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
_lblprevisaotermino[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=24379479;
 //BA.debugLineNum = 24379479;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
_lblquantidadepaginas[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=24379481;
 //BA.debugLineNum = 24379481;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
_btanotar[_i].Initialize(mostCurrent.activityBA,"Event_btAnotar");
RDebugUtils.currentLine=24379482;
 //BA.debugLineNum = 24379482;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
_btlancar[_i].Initialize(mostCurrent.activityBA,"Event_btLancar");
RDebugUtils.currentLine=24379484;
 //BA.debugLineNum = 24379484;BA.debugLine="panels(i).Background = gradient";
_panels[_i].setBackground((android.graphics.drawable.Drawable)(parent.mostCurrent._gradient.getObject()));
RDebugUtils.currentLine=24379485;
 //BA.debugLineNum = 24379485;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
_panels[_i].setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=24379486;
 //BA.debugLineNum = 24379486;BA.debugLine="panels(i).Elevation = 3dip";
_panels[_i].setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))));
RDebugUtils.currentLine=24379488;
 //BA.debugLineNum = 24379488;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(_panels[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_topo,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=24379490;
 //BA.debugLineNum = 24379490;BA.debugLine="lblTituloLivro(i).Text = Result.GetString(\"no";
_lbltitulolivro[_i].setText(BA.ObjectToCharSequence(_result.GetString("nome")));
RDebugUtils.currentLine=24379491;
 //BA.debugLineNum = 24379491;BA.debugLine="lblTituloLivro(i).TextColor = Colors.RGB(189,";
_lbltitulolivro[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (151),(int) (1)));
RDebugUtils.currentLine=24379492;
 //BA.debugLineNum = 24379492;BA.debugLine="lblTituloLivro(i).TextSize = 23";
_lbltitulolivro[_i].setTextSize((float) (23));
RDebugUtils.currentLine=24379495;
 //BA.debugLineNum = 24379495;BA.debugLine="lblDataComecoLeitura(i).Text = \"Começei ler d";
_lbldatacomecoleitura[_i].setText(BA.ObjectToCharSequence("Começei ler dia "+_result.GetString("data_inicial")));
RDebugUtils.currentLine=24379496;
 //BA.debugLineNum = 24379496;BA.debugLine="lblDataComecoLeitura(i).TextColor = Colors.RG";
_lbldatacomecoleitura[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=24379497;
 //BA.debugLineNum = 24379497;BA.debugLine="lblDataComecoLeitura(i).TextSize = tamanho_fo";
_lbldatacomecoleitura[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=24379500;
 //BA.debugLineNum = 24379500;BA.debugLine="lblPrevisaoTermino(i).Text = \"Previsão de Tér";
_lblprevisaotermino[_i].setText(BA.ObjectToCharSequence("Previsão de Término "+_result.GetString("data_prevista_final")));
RDebugUtils.currentLine=24379501;
 //BA.debugLineNum = 24379501;BA.debugLine="lblPrevisaoTermino(i).TextColor = Colors.RGB(";
_lblprevisaotermino[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=24379502;
 //BA.debugLineNum = 24379502;BA.debugLine="lblPrevisaoTermino(i).TextSize = tamanho_font";
_lblprevisaotermino[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=24379505;
 //BA.debugLineNum = 24379505;BA.debugLine="lblQuantidadePaginas(i).Text = Result.GetStri";
_lblquantidadepaginas[_i].setText(BA.ObjectToCharSequence(_result.GetString("paginas_ou_cap_lidos")+" "+_result.GetString("tipo_de_leitura")+" de "+_result.GetString("quantidade_paginas")));
RDebugUtils.currentLine=24379506;
 //BA.debugLineNum = 24379506;BA.debugLine="lblQuantidadePaginas(i).TextColor = Colors.RG";
_lblquantidadepaginas[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=24379507;
 //BA.debugLineNum = 24379507;BA.debugLine="lblQuantidadePaginas(i).TextSize = tamanho_fo";
_lblquantidadepaginas[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=24379510;
 //BA.debugLineNum = 24379510;BA.debugLine="Dim altura As Int = 3.5%y";
_altura = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.5),mostCurrent.activityBA);
RDebugUtils.currentLine=24379511;
 //BA.debugLineNum = 24379511;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
_panels[_i].AddView((android.view.View)(_lbltitulolivro[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=24379512;
 //BA.debugLineNum = 24379512;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
RDebugUtils.currentLine=24379513;
 //BA.debugLineNum = 24379513;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
_panels[_i].AddView((android.view.View)(_lbldatacomecoleitura[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=24379514;
 //BA.debugLineNum = 24379514;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=24379515;
 //BA.debugLineNum = 24379515;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
_panels[_i].AddView((android.view.View)(_lblprevisaotermino[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=24379516;
 //BA.debugLineNum = 24379516;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=24379517;
 //BA.debugLineNum = 24379517;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
_panels[_i].AddView((android.view.View)(_lblquantidadepaginas[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=24379518;
 //BA.debugLineNum = 24379518;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=24379520;
 //BA.debugLineNum = 24379520;BA.debugLine="btAnotar(i).Tag = i";
_btanotar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=24379525;
 //BA.debugLineNum = 24379525;BA.debugLine="listaInformacoes.Add(\"'\" & Result.GetString(\"";
_listainformacoes.Add((Object)("'"+_result.GetString("nome")+"|¨'"+BA.NumberToString(_result.GetInt("quantidade_paginas"))+"|¨'"+BA.NumberToString(_result.GetInt("fk_id_Livro"))+"|¨'"+_result.GetString("usuarioNome")+"|¨'"+_result.GetString("tipo_de_leitura")+"|¨'"+_result.GetString("paginas_ou_cap_lidos")+"|¨'"+_result.GetString("meta")+"|"));
RDebugUtils.currentLine=24379533;
 //BA.debugLineNum = 24379533;BA.debugLine="tamanhoLista = 7";
parent._tamanholista = (int) (7);
RDebugUtils.currentLine=24379538;
 //BA.debugLineNum = 24379538;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
_btanotar[_i].setText(BA.ObjectToCharSequence("Anotar"));
RDebugUtils.currentLine=24379539;
 //BA.debugLineNum = 24379539;BA.debugLine="btAnotar(i).TextSize = 16";
_btanotar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=24379540;
 //BA.debugLineNum = 24379540;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
_btanotar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=24379541;
 //BA.debugLineNum = 24379541;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
_btanotar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=24379542;
 //BA.debugLineNum = 24379542;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
_panels[_i].AddView((android.view.View)(_btanotar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=24379544;
 //BA.debugLineNum = 24379544;BA.debugLine="btLancar(i).Tag = i";
_btlancar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=24379546;
 //BA.debugLineNum = 24379546;BA.debugLine="btLancar(i).Text = \"Lançar\"";
_btlancar[_i].setText(BA.ObjectToCharSequence("Lançar"));
RDebugUtils.currentLine=24379547;
 //BA.debugLineNum = 24379547;BA.debugLine="btLancar(i).TextSize = 16";
_btlancar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=24379548;
 //BA.debugLineNum = 24379548;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
_btlancar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=24379549;
 //BA.debugLineNum = 24379549;BA.debugLine="btLancar(i).Color = Colors.Transparent";
_btlancar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=24379550;
 //BA.debugLineNum = 24379550;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
_panels[_i].AddView((android.view.View)(_btlancar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=24379552;
 //BA.debugLineNum = 24379552;BA.debugLine="topo = topo + 25%y + 10dip";
_topo = (int) (_topo+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=24379554;
 //BA.debugLineNum = 24379554;BA.debugLine="scrollView1.Panel.Height = topo";
parent.mostCurrent._scrollview1.getPanel().setHeight(_topo);
RDebugUtils.currentLine=24379555;
 //BA.debugLineNum = 24379555;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=24379557;
 //BA.debugLineNum = 24379557;BA.debugLine="File.WriteList(File.DirInternal, nomeArquivo,";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),parent.mostCurrent._nomearquivo,_listainformacoes);
 if (true) break;

case 25:
//C
this.state = 28;
;
RDebugUtils.currentLine=24379560;
 //BA.debugLineNum = 24379560;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=24379562;
 //BA.debugLineNum = 24379562;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24379563;
 //BA.debugLineNum = 24379563;BA.debugLine="Return False";
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
RDebugUtils.currentLine=24379566;
 //BA.debugLineNum = 24379566;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24379567;
 //BA.debugLineNum = 24379567;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24379569;
 //BA.debugLineNum = 24379569;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
_resp = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Deseja realmente sair?"),BA.ObjectToCharSequence("Já vai?"),"Sim","","Não",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
if (_resp==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="KeyCode = 0";
_keycode = (int) (0);
RDebugUtils.currentLine=24707084;
 //BA.debugLineNum = 24707084;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=24707087;
 //BA.debugLineNum = 24707087;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=24707111;
 //BA.debugLineNum = 24707111;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="If Main.CadastrouAlgo Then";
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
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
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
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btadicionarleitura_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btadicionarleitura_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btadicionarleitura_click", null));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub btAdicionarLeitura_Click";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="StartActivity(act_TelaCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_telacadastro.getObject()));
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub Event_btAnotar_Click";
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="Dim informacoes 		As String";
_informacoes = "";
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
_qtpag = 0;
_codigolivro = 0;
RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="Dim nomeLivro 			As String";
_nomelivro = "";
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="Dim tipoLeitura			As String";
_tipoleitura = "";
RDebugUtils.currentLine=24444937;
 //BA.debugLineNum = 24444937;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24444938;
 //BA.debugLineNum = 24444938;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=24444940;
 //BA.debugLineNum = 24444940;BA.debugLine="Try";
try {RDebugUtils.currentLine=24444941;
 //BA.debugLineNum = 24444941;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
_lista = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._nomearquivo);
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="informacoes = lista.Get(b.Tag)";
_informacoes = BA.ObjectToString(_lista.Get((int)(BA.ObjectToNumber(_b.getTag()))));
RDebugUtils.currentLine=24444944;
 //BA.debugLineNum = 24444944;BA.debugLine="Dim cols(tamanhoLista), coluna As String";
_cols = new String[_tamanholista];
java.util.Arrays.fill(_cols,"");
_coluna = "";
RDebugUtils.currentLine=24444946;
 //BA.debugLineNum = 24444946;BA.debugLine="For i = 0 To cols.Length - 1";
{
final int step12 = 1;
final int limit12 = (int) (_cols.length-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=24444948;
 //BA.debugLineNum = 24444948;BA.debugLine="coluna 	= informacoes.SubString2(informacoes.In";
_coluna = _informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"));
RDebugUtils.currentLine=24444949;
 //BA.debugLineNum = 24444949;BA.debugLine="informacoes = informacoes.SubString2(informacoe";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=24444951;
 //BA.debugLineNum = 24444951;BA.debugLine="cols(i) = coluna";
_cols[_i] = _coluna;
 }
};
RDebugUtils.currentLine=24444954;
 //BA.debugLineNum = 24444954;BA.debugLine="nomeLivro = cols(0)";
_nomelivro = _cols[(int) (0)];
RDebugUtils.currentLine=24444955;
 //BA.debugLineNum = 24444955;BA.debugLine="qtPag = cols(1)";
_qtpag = (int)(Double.parseDouble(_cols[(int) (1)]));
RDebugUtils.currentLine=24444956;
 //BA.debugLineNum = 24444956;BA.debugLine="codigoLivro = cols(2)";
_codigolivro = (int)(Double.parseDouble(_cols[(int) (2)]));
RDebugUtils.currentLine=24444957;
 //BA.debugLineNum = 24444957;BA.debugLine="tipoLeitura = cols(4)";
_tipoleitura = _cols[(int) (4)];
RDebugUtils.currentLine=24444959;
 //BA.debugLineNum = 24444959;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
mostCurrent._codigolayanotacao._codigolivro /*int*/  = _codigolivro;
RDebugUtils.currentLine=24444960;
 //BA.debugLineNum = 24444960;BA.debugLine="CodigoLayAnotacao.qtPaginas   =	qtPag";
mostCurrent._codigolayanotacao._qtpaginas /*int*/  = _qtpag;
RDebugUtils.currentLine=24444961;
 //BA.debugLineNum = 24444961;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
mostCurrent._codigolayanotacao._nomedolivro /*String*/  = _nomelivro;
RDebugUtils.currentLine=24444962;
 //BA.debugLineNum = 24444962;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
mostCurrent._codigolayanotacao._tipoleitura /*String*/  = _tipoleitura;
RDebugUtils.currentLine=24444964;
 //BA.debugLineNum = 24444964;BA.debugLine="StartActivity(CodigoLayAnotacao)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayanotacao.getObject()));
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=24444966;
 //BA.debugLineNum = 24444966;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=24444968;
 //BA.debugLineNum = 24444968;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub Event_btLancar_Click";
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="Dim tituloLivro As 		String";
_titulolivro = "";
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="Dim nomeUsuario As 		String";
_nomeusuario = "";
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="Dim paginasAtuais As 	String";
_paginasatuais = "";
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="Dim totalPaginas As 	String";
_totalpaginas = "";
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="Dim meta As 			String";
_meta = "";
RDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="Dim idLivro As 			String";
_idlivro = "";
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="Dim tipoLeitura As 		String";
_tipoleitura = "";
RDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24510477;
 //BA.debugLineNum = 24510477;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=24510479;
 //BA.debugLineNum = 24510479;BA.debugLine="Try";
try {RDebugUtils.currentLine=24510480;
 //BA.debugLineNum = 24510480;BA.debugLine="Dim colunaValor, valorSalvo, col As String";
_colunavalor = "";
_valorsalvo = "";
_col = "";
RDebugUtils.currentLine=24510482;
 //BA.debugLineNum = 24510482;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
_lista = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),mostCurrent._nomearquivo);
RDebugUtils.currentLine=24510484;
 //BA.debugLineNum = 24510484;BA.debugLine="colunaValor = lista.Get(b.Tag)";
_colunavalor = BA.ObjectToString(_lista.Get((int)(BA.ObjectToNumber(_b.getTag()))));
RDebugUtils.currentLine=24510485;
 //BA.debugLineNum = 24510485;BA.debugLine="Dim testeArray(tamanhoLista) As	String";
_testearray = new String[_tamanholista];
java.util.Arrays.fill(_testearray,"");
RDebugUtils.currentLine=24510488;
 //BA.debugLineNum = 24510488;BA.debugLine="For coluna = 0 To testeArray.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_testearray.length-1);
_coluna = (int) (0) ;
for (;_coluna <= limit16 ;_coluna = _coluna + step16 ) {
RDebugUtils.currentLine=24510490;
 //BA.debugLineNum = 24510490;BA.debugLine="col = colunaValor.SubString2(colunaValor.IndexO";
_col = _colunavalor.substring((int) (_colunavalor.indexOf("'")+1),_colunavalor.indexOf("|"));
RDebugUtils.currentLine=24510491;
 //BA.debugLineNum = 24510491;BA.debugLine="valorSalvo = colunaValor.SubString2(colunaValor";
_valorsalvo = _colunavalor.substring((int) (_colunavalor.indexOf("¨")+1),_colunavalor.length());
RDebugUtils.currentLine=24510493;
 //BA.debugLineNum = 24510493;BA.debugLine="testeArray(coluna) = col";
_testearray[_coluna] = _col;
RDebugUtils.currentLine=24510494;
 //BA.debugLineNum = 24510494;BA.debugLine="colunaValor = valorSalvo";
_colunavalor = _valorsalvo;
 }
};
RDebugUtils.currentLine=24510498;
 //BA.debugLineNum = 24510498;BA.debugLine="tituloLivro = testeArray(0)";
_titulolivro = _testearray[(int) (0)];
RDebugUtils.currentLine=24510499;
 //BA.debugLineNum = 24510499;BA.debugLine="nomeUsuario = testeArray(3)";
_nomeusuario = _testearray[(int) (3)];
RDebugUtils.currentLine=24510500;
 //BA.debugLineNum = 24510500;BA.debugLine="paginasAtuais = testeArray(5)";
_paginasatuais = _testearray[(int) (5)];
RDebugUtils.currentLine=24510501;
 //BA.debugLineNum = 24510501;BA.debugLine="totalPaginas = testeArray(1)";
_totalpaginas = _testearray[(int) (1)];
RDebugUtils.currentLine=24510502;
 //BA.debugLineNum = 24510502;BA.debugLine="meta = testeArray(6)";
_meta = _testearray[(int) (6)];
RDebugUtils.currentLine=24510503;
 //BA.debugLineNum = 24510503;BA.debugLine="idLivro = testeArray(2)";
_idlivro = _testearray[(int) (2)];
RDebugUtils.currentLine=24510504;
 //BA.debugLineNum = 24510504;BA.debugLine="tipoLeitura = testeArray(4)";
_tipoleitura = _testearray[(int) (4)];
RDebugUtils.currentLine=24510506;
 //BA.debugLineNum = 24510506;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nomeUsuari";
mostCurrent._codigolancamentoleitura._nomeusuario /*String*/  = _nomeusuario;
RDebugUtils.currentLine=24510507;
 //BA.debugLineNum = 24510507;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = paginasAtu";
mostCurrent._codigolancamentoleitura._paginaatual /*int*/  = (int)(Double.parseDouble(_paginasatuais));
RDebugUtils.currentLine=24510508;
 //BA.debugLineNum = 24510508;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = tituloLivr";
mostCurrent._codigolancamentoleitura._titulolivro /*String*/  = _titulolivro;
RDebugUtils.currentLine=24510509;
 //BA.debugLineNum = 24510509;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = totalPagi";
mostCurrent._codigolancamentoleitura._totalpaginas /*int*/  = (int)(Double.parseDouble(_totalpaginas));
RDebugUtils.currentLine=24510510;
 //BA.debugLineNum = 24510510;BA.debugLine="CodigoLancamentoLeitura.meta = meta";
mostCurrent._codigolancamentoleitura._meta /*int*/  = (int)(Double.parseDouble(_meta));
RDebugUtils.currentLine=24510511;
 //BA.debugLineNum = 24510511;BA.debugLine="CodigoLancamentoLeitura.idLivro = idLivro";
mostCurrent._codigolancamentoleitura._idlivro /*int*/  = (int)(Double.parseDouble(_idlivro));
RDebugUtils.currentLine=24510512;
 //BA.debugLineNum = 24510512;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipoLeitur";
mostCurrent._codigolancamentoleitura._tipoleitura /*String*/  = _tipoleitura;
RDebugUtils.currentLine=24510514;
 //BA.debugLineNum = 24510514;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolancamentoleitura.getObject()));
 } 
       catch (Exception e38) {
			processBA.setLastException(e38);RDebugUtils.currentLine=24510517;
 //BA.debugLineNum = 24510517;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=24510519;
 //BA.debugLineNum = 24510519;BA.debugLine="End Sub";
return "";
}
public static String  _event_lbl_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_lbl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_lbl_click", null));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Sub Event_lbl_Click";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="StartActivity(act_TelaCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_telacadastro.getObject()));
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="End Sub";
return "";
}
public static String  _tabstrip_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabstrip_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tabstrip_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="End Sub";
return "";
}
}