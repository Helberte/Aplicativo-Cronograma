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
public anywheresoftware.b4a.objects.ButtonWrapper _btadicionarleitura = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_lendo = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
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
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
parent.mostCurrent._activity.LoadLayout("LayLeiturasTabStrip",mostCurrent.activityBA);
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu1",BA.ObjectToCharSequence("Lendo"));
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu2",BA.ObjectToCharSequence("Lidos"));
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
RDebugUtils.currentLine=22872072;
 //BA.debugLineNum = 22872072;BA.debugLine="banco.Initialize";
parent.mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
parent._cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
parent._cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
parent.mostCurrent._panelnenhumaleitura.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=22872079;
 //BA.debugLineNum = 22872079;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22872081;
 //BA.debugLineNum = 22872081;BA.debugLine="If FirstTime Then";
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
RDebugUtils.currentLine=22872082;
 //BA.debugLineNum = 22872082;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=22872084;
 //BA.debugLineNum = 22872084;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=22872085;
 //BA.debugLineNum = 22872085;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
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
RDebugUtils.currentLine=22872089;
 //BA.debugLineNum = 22872089;BA.debugLine="End Sub";
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
int step45;
int limit45;

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
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 27;
this.catchState = 26;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 26;
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
_cmd = "exec sp_atualiza_leituras "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
if (true) break;

case 4:
//if
this.state = 24;
if (_result.GetInt("RESULTADO")==2) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=23134235;
 //BA.debugLineNum = 23134235;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
if (_result.GetInt("RESULTADO")==0) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=23134240;
 //BA.debugLineNum = 23134240;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
if (_result.GetInt("RESULTADO")==1) { 
this.state = 10;
}else {
this.state = 23;
}}}
if (true) break;

case 6:
//C
this.state = 24;
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
parent.mostCurrent._lbl_inicial_leitura.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
RDebugUtils.currentLine=23134225;
 //BA.debugLineNum = 23134225;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
parent.mostCurrent._lbl_inicial_leitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
parent.mostCurrent._lbl_inicial_leitura.setTextSize((float) (20));
RDebugUtils.currentLine=23134228;
 //BA.debugLineNum = 23134228;BA.debugLine="scrollView1.Initialize (500)";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=23134229;
 //BA.debugLineNum = 23134229;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=23134231;
 //BA.debugLineNum = 23134231;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(parent.mostCurrent._lbl_inicial_leitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=23134234;
 //BA.debugLineNum = 23134234;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = 24;
RDebugUtils.currentLine=23134236;
 //BA.debugLineNum = 23134236;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134238;
 //BA.debugLineNum = 23134238;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134239;
 //BA.debugLineNum = 23134239;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=23134242;
 //BA.debugLineNum = 23134242;BA.debugLine="btAdicionarLeitura.Visible = True";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134244;
 //BA.debugLineNum = 23134244;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
parent.mostCurrent._gradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),parent._cores);
RDebugUtils.currentLine=23134246;
 //BA.debugLineNum = 23134246;BA.debugLine="gradient.CornerRadius = 12";
parent.mostCurrent._gradient.setCornerRadius((float) (12));
RDebugUtils.currentLine=23134248;
 //BA.debugLineNum = 23134248;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
_quantidade = _result.GetInt("QUANTIDADE");
RDebugUtils.currentLine=23134250;
 //BA.debugLineNum = 23134250;BA.debugLine="Dim panels(quantidade) As Panel";
_panels = new anywheresoftware.b4a.objects.PanelWrapper[_quantidade];
{
int d0 = _panels.length;
for (int i0 = 0;i0 < d0;i0++) {
_panels[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
RDebugUtils.currentLine=23134251;
 //BA.debugLineNum = 23134251;BA.debugLine="Dim listaInformacoes As List";
_listainformacoes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23134253;
 //BA.debugLineNum = 23134253;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
_lbltitulolivro = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbltitulolivro.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbltitulolivro[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23134254;
 //BA.debugLineNum = 23134254;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
_lbldatacomecoleitura = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbldatacomecoleitura.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbldatacomecoleitura[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23134255;
 //BA.debugLineNum = 23134255;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
_lblprevisaotermino = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblprevisaotermino.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblprevisaotermino[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23134256;
 //BA.debugLineNum = 23134256;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
_lblquantidadepaginas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblquantidadepaginas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblquantidadepaginas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23134258;
 //BA.debugLineNum = 23134258;BA.debugLine="Dim btAnotar(quantidade) As Button";
_btanotar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btanotar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btanotar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=23134259;
 //BA.debugLineNum = 23134259;BA.debugLine="Dim btLancar(quantidade) As Button";
_btlancar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btlancar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btlancar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
RDebugUtils.currentLine=23134261;
 //BA.debugLineNum = 23134261;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
_tamanho_fonte = (int) (17.5);
RDebugUtils.currentLine=23134263;
 //BA.debugLineNum = 23134263;BA.debugLine="Dim topo As Int = 1%y";
_topo = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=23134264;
 //BA.debugLineNum = 23134264;BA.debugLine="Dim topoLabel As Int = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=23134266;
 //BA.debugLineNum = 23134266;BA.debugLine="If temPanel Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent._tempanel) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=23134267;
 //BA.debugLineNum = 23134267;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
RDebugUtils.currentLine=23134268;
 //BA.debugLineNum = 23134268;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=23134271;
 //BA.debugLineNum = 23134271;BA.debugLine="If temPanel = False Then";

case 14:
//if
this.state = 21;
if (parent._tempanel==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=23134273;
 //BA.debugLineNum = 23134273;BA.debugLine="temPanel = True";
parent._tempanel = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23134274;
 //BA.debugLineNum = 23134274;BA.debugLine="scrollView1.Initialize( 500 )";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
RDebugUtils.currentLine=23134275;
 //BA.debugLineNum = 23134275;BA.debugLine="listaInformacoes.Initialize";
_listainformacoes.Initialize();
RDebugUtils.currentLine=23134277;
 //BA.debugLineNum = 23134277;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),parent.mostCurrent._btadicionarleitura.getTop());
RDebugUtils.currentLine=23134280;
 //BA.debugLineNum = 23134280;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23134281;
 //BA.debugLineNum = 23134281;BA.debugLine="For i = 0 To panels.Length - 1";
if (true) break;

case 17:
//for
this.state = 20;
step45 = 1;
limit45 = (int) (_panels.length-1);
_i = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if ((step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45)) this.state = 19;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step45)) ;
if (true) break;

case 19:
//C
this.state = 30;
RDebugUtils.currentLine=23134283;
 //BA.debugLineNum = 23134283;BA.debugLine="topoLabel = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=23134284;
 //BA.debugLineNum = 23134284;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
_panels[_i].Initialize(mostCurrent.activityBA,"Event_panels");
RDebugUtils.currentLine=23134286;
 //BA.debugLineNum = 23134286;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
_lbltitulolivro[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=23134287;
 //BA.debugLineNum = 23134287;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
_lbldatacomecoleitura[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=23134288;
 //BA.debugLineNum = 23134288;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
_lblprevisaotermino[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=23134289;
 //BA.debugLineNum = 23134289;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
_lblquantidadepaginas[_i].Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=23134291;
 //BA.debugLineNum = 23134291;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
_btanotar[_i].Initialize(mostCurrent.activityBA,"Event_btAnotar");
RDebugUtils.currentLine=23134292;
 //BA.debugLineNum = 23134292;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
_btlancar[_i].Initialize(mostCurrent.activityBA,"Event_btLancar");
RDebugUtils.currentLine=23134294;
 //BA.debugLineNum = 23134294;BA.debugLine="panels(i).Background = gradient";
_panels[_i].setBackground((android.graphics.drawable.Drawable)(parent.mostCurrent._gradient.getObject()));
RDebugUtils.currentLine=23134295;
 //BA.debugLineNum = 23134295;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
_panels[_i].setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=23134297;
 //BA.debugLineNum = 23134297;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(_panels[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_topo,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA));
RDebugUtils.currentLine=23134299;
 //BA.debugLineNum = 23134299;BA.debugLine="lblTituloLivro(i).Text = Result.GetString(\"no";
_lbltitulolivro[_i].setText(BA.ObjectToCharSequence(_result.GetString("nome")));
RDebugUtils.currentLine=23134300;
 //BA.debugLineNum = 23134300;BA.debugLine="lblTituloLivro(i).TextColor = Colors.RGB(189,";
_lbltitulolivro[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (151),(int) (1)));
RDebugUtils.currentLine=23134301;
 //BA.debugLineNum = 23134301;BA.debugLine="lblTituloLivro(i).TextSize = 23";
_lbltitulolivro[_i].setTextSize((float) (23));
RDebugUtils.currentLine=23134304;
 //BA.debugLineNum = 23134304;BA.debugLine="lblDataComecoLeitura(i).Text = \"Começei ler d";
_lbldatacomecoleitura[_i].setText(BA.ObjectToCharSequence("Começei ler dia "+_result.GetString("data_inicial")));
RDebugUtils.currentLine=23134305;
 //BA.debugLineNum = 23134305;BA.debugLine="lblDataComecoLeitura(i).TextColor = Colors.RG";
_lbldatacomecoleitura[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=23134306;
 //BA.debugLineNum = 23134306;BA.debugLine="lblDataComecoLeitura(i).TextSize = tamanho_fo";
_lbldatacomecoleitura[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=23134309;
 //BA.debugLineNum = 23134309;BA.debugLine="lblPrevisaoTermino(i).Text = \"Previsão de Tér";
_lblprevisaotermino[_i].setText(BA.ObjectToCharSequence("Previsão de Término "+_result.GetString("data_prevista_final")));
RDebugUtils.currentLine=23134310;
 //BA.debugLineNum = 23134310;BA.debugLine="lblPrevisaoTermino(i).TextColor = Colors.RGB(";
_lblprevisaotermino[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=23134311;
 //BA.debugLineNum = 23134311;BA.debugLine="lblPrevisaoTermino(i).TextSize = tamanho_font";
_lblprevisaotermino[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=23134314;
 //BA.debugLineNum = 23134314;BA.debugLine="lblQuantidadePaginas(i).Text = Result.GetStri";
_lblquantidadepaginas[_i].setText(BA.ObjectToCharSequence(_result.GetString("paginas_ou_cap_lidos")+" "+_result.GetString("tipo_de_leitura")+" de "+_result.GetString("quantidade_paginas")));
RDebugUtils.currentLine=23134315;
 //BA.debugLineNum = 23134315;BA.debugLine="lblQuantidadePaginas(i).TextColor = Colors.RG";
_lblquantidadepaginas[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
RDebugUtils.currentLine=23134316;
 //BA.debugLineNum = 23134316;BA.debugLine="lblQuantidadePaginas(i).TextSize = tamanho_fo";
_lblquantidadepaginas[_i].setTextSize((float) (_tamanho_fonte));
RDebugUtils.currentLine=23134319;
 //BA.debugLineNum = 23134319;BA.debugLine="Dim altura As Int = 3.5%y";
_altura = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.5),mostCurrent.activityBA);
RDebugUtils.currentLine=23134320;
 //BA.debugLineNum = 23134320;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
_panels[_i].AddView((android.view.View)(_lbltitulolivro[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=23134321;
 //BA.debugLineNum = 23134321;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
RDebugUtils.currentLine=23134322;
 //BA.debugLineNum = 23134322;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
_panels[_i].AddView((android.view.View)(_lbldatacomecoleitura[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=23134323;
 //BA.debugLineNum = 23134323;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=23134324;
 //BA.debugLineNum = 23134324;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
_panels[_i].AddView((android.view.View)(_lblprevisaotermino[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=23134325;
 //BA.debugLineNum = 23134325;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=23134326;
 //BA.debugLineNum = 23134326;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
_panels[_i].AddView((android.view.View)(_lblquantidadepaginas[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
RDebugUtils.currentLine=23134327;
 //BA.debugLineNum = 23134327;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=23134329;
 //BA.debugLineNum = 23134329;BA.debugLine="btAnotar(i).Tag = i";
_btanotar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=23134333;
 //BA.debugLineNum = 23134333;BA.debugLine="listaInformacoes.Add(\" '\" & Result.GetString(";
_listainformacoes.Add((Object)(" '"+_result.GetString("nome")+"|¨'"+BA.NumberToString(_result.GetInt("quantidade_paginas"))+"|¨'"+BA.NumberToString(_result.GetInt("fk_id_Livro"))+"|¨'"+_result.GetString("usuarioNome")+"|¨'"+_result.GetString("tipo_de_leitura")+"|"));
RDebugUtils.currentLine=23134339;
 //BA.debugLineNum = 23134339;BA.debugLine="File.WriteList(File.DirInternal, \"Informacoes";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Informacoes.txt",_listainformacoes);
RDebugUtils.currentLine=23134341;
 //BA.debugLineNum = 23134341;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
_btanotar[_i].setText(BA.ObjectToCharSequence("Anotar"));
RDebugUtils.currentLine=23134342;
 //BA.debugLineNum = 23134342;BA.debugLine="btAnotar(i).TextSize = 16";
_btanotar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=23134343;
 //BA.debugLineNum = 23134343;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
_btanotar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=23134344;
 //BA.debugLineNum = 23134344;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
_btanotar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=23134345;
 //BA.debugLineNum = 23134345;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
_panels[_i].AddView((android.view.View)(_btanotar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=23134347;
 //BA.debugLineNum = 23134347;BA.debugLine="btLancar(i).Tag = i";
_btlancar[_i].setTag((Object)(_i));
RDebugUtils.currentLine=23134349;
 //BA.debugLineNum = 23134349;BA.debugLine="btLancar(i).Text = \"Lançar\"";
_btlancar[_i].setText(BA.ObjectToCharSequence("Lançar"));
RDebugUtils.currentLine=23134350;
 //BA.debugLineNum = 23134350;BA.debugLine="btLancar(i).TextSize = 16";
_btlancar[_i].setTextSize((float) (16));
RDebugUtils.currentLine=23134351;
 //BA.debugLineNum = 23134351;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
_btlancar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
RDebugUtils.currentLine=23134352;
 //BA.debugLineNum = 23134352;BA.debugLine="btLancar(i).Color = Colors.Transparent";
_btlancar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=23134353;
 //BA.debugLineNum = 23134353;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
_panels[_i].AddView((android.view.View)(_btlancar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
RDebugUtils.currentLine=23134356;
 //BA.debugLineNum = 23134356;BA.debugLine="topo = topo + 25%y + 10dip";
_topo = (int) (_topo+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=23134358;
 //BA.debugLineNum = 23134358;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=23134360;
 //BA.debugLineNum = 23134360;BA.debugLine="scrollView1.Panel.Height = topo";
parent.mostCurrent._scrollview1.getPanel().setHeight(_topo);
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=23134362;
 //BA.debugLineNum = 23134362;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=23134364;
 //BA.debugLineNum = 23134364;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134365;
 //BA.debugLineNum = 23134365;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=23134368;
 //BA.debugLineNum = 23134368;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134369;
 //BA.debugLineNum = 23134369;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=23134371;
 //BA.debugLineNum = 23134371;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
_resp = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Deseja realmente sair?"),BA.ObjectToCharSequence("Já vai?"),"Sim","","Não",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
if (_resp==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="KeyCode = 0";
_keycode = (int) (0);
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=23396367;
 //BA.debugLineNum = 23396367;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=23396391;
 //BA.debugLineNum = 23396391;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="If CodigoCadastroLivro.cadastrou Or CodigoCadastr";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._codigocadastrolivro._cadastrou /*boolean*/  || parent.mostCurrent._codigocadastro._cadastrouusuario /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="CodigoCadastro.cadastrouUsuario = False";
parent.mostCurrent._codigocadastro._cadastrouusuario /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="CodigoCadastroLivro.cadastrou = False";
parent.mostCurrent._codigocadastrolivro._cadastrou /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="CodigoCadastroLivro.cadastrou = True";
parent.mostCurrent._codigocadastrolivro._cadastrou /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
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
RDebugUtils.currentLine=23003149;
 //BA.debugLineNum = 23003149;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btadicionarleitura_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btadicionarleitura_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btadicionarleitura_click", null));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub btAdicionarLeitura_Click";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="StartActivity(CodigoCadastroLivro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastrolivro.getObject()));
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="End Sub";
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
String _nomeusuario = "";
String _nomelivro = "";
String _tipoleitura = "";
anywheresoftware.b4a.objects.collections.List _lista = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub Event_btAnotar_Click";
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="Dim informacoes 		As String";
_informacoes = "";
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
_qtpag = 0;
_codigolivro = 0;
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Dim nomeUsuario 		As String";
_nomeusuario = "";
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="Dim nomeLivro 			As String";
_nomelivro = "";
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="Dim tipoLeitura			As String";
_tipoleitura = "";
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23199755;
 //BA.debugLineNum = 23199755;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="If File.Exists(File.DirInternal, \"Informacoes.txt";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Informacoes.txt")) { 
RDebugUtils.currentLine=23199759;
 //BA.debugLineNum = 23199759;BA.debugLine="lista = File.ReadList(File.DirInternal, \"Informa";
_lista = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"Informacoes.txt");
RDebugUtils.currentLine=23199761;
 //BA.debugLineNum = 23199761;BA.debugLine="informacoes = lista.Get(b.Tag)";
_informacoes = BA.ObjectToString(_lista.Get((int)(BA.ObjectToNumber(_b.getTag()))));
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="nomeLivro =   informacoes.SubString2(informacoes";
_nomelivro = _informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"));
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=23199766;
 //BA.debugLineNum = 23199766;BA.debugLine="qtPag = 	  informacoes.SubString2(informacoes.In";
_qtpag = (int)(Double.parseDouble(_informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"))));
RDebugUtils.currentLine=23199767;
 //BA.debugLineNum = 23199767;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=23199769;
 //BA.debugLineNum = 23199769;BA.debugLine="codigoLivro = informacoes.SubString2(informacoes";
_codigolivro = (int)(Double.parseDouble(_informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"))));
RDebugUtils.currentLine=23199770;
 //BA.debugLineNum = 23199770;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=23199772;
 //BA.debugLineNum = 23199772;BA.debugLine="nomeUsuario = informacoes.SubString2(informacoes";
_nomeusuario = _informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"));
RDebugUtils.currentLine=23199773;
 //BA.debugLineNum = 23199773;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
_informacoes = _informacoes.substring((int) (_informacoes.indexOf("¨")+1),_informacoes.length());
RDebugUtils.currentLine=23199775;
 //BA.debugLineNum = 23199775;BA.debugLine="tipoLeitura = informacoes.SubString2(informacoes";
_tipoleitura = _informacoes.substring((int) (_informacoes.indexOf("'")+1),_informacoes.indexOf("|"));
RDebugUtils.currentLine=23199777;
 //BA.debugLineNum = 23199777;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
mostCurrent._codigolayanotacao._codigolivro /*int*/  = _codigolivro;
RDebugUtils.currentLine=23199778;
 //BA.debugLineNum = 23199778;BA.debugLine="CodigoLayAnotacao.qtPaginas = qtPag";
mostCurrent._codigolayanotacao._qtpaginas /*int*/  = _qtpag;
RDebugUtils.currentLine=23199779;
 //BA.debugLineNum = 23199779;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
mostCurrent._codigolayanotacao._nomedolivro /*String*/  = _nomelivro;
RDebugUtils.currentLine=23199780;
 //BA.debugLineNum = 23199780;BA.debugLine="CodigoLayAnotacao.nomeUsuario = nomeUsuario";
mostCurrent._codigolayanotacao._nomeusuario /*String*/  = _nomeusuario;
RDebugUtils.currentLine=23199781;
 //BA.debugLineNum = 23199781;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
mostCurrent._codigolayanotacao._tipoleitura /*String*/  = _tipoleitura;
RDebugUtils.currentLine=23199783;
 //BA.debugLineNum = 23199783;BA.debugLine="StartActivity(CodigoLayAnotacao)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayanotacao.getObject()));
 }else {
RDebugUtils.currentLine=23199785;
 //BA.debugLineNum = 23199785;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=23199787;
 //BA.debugLineNum = 23199787;BA.debugLine="End Sub";
return "";
}
public static String  _event_lbl_click() throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "event_lbl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "event_lbl_click", null));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Sub Event_lbl_Click";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="StartActivity(CodigoCadastroLivro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastrolivro.getObject()));
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="End Sub";
return "";
}
public static String  _tabstrip_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="codigolayleituras";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabstrip_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tabstrip_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="End Sub";
return "";
}
}