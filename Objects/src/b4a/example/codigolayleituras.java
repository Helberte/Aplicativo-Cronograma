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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigolayleituras");
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
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static void  _activity_create(boolean _firsttime) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
parent.mostCurrent._activity.LoadLayout("LayLeiturasTabStrip",mostCurrent.activityBA);
 //BA.debugLineNum = 31;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu1",BA.ObjectToCharSequence("Lendo"));
 //BA.debugLineNum = 32;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
parent.mostCurrent._tabstrip.LoadLayout("LayLeitura_menu2",BA.ObjectToCharSequence("Lidos"));
 //BA.debugLineNum = 34;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
parent.mostCurrent._lbl_inicial_leitura.Initialize(mostCurrent.activityBA,"Event_lbl");
 //BA.debugLineNum = 36;BA.debugLine="banco.Initialize";
parent.mostCurrent._banco._initialize /*String*/ (processBA);
 //BA.debugLineNum = 38;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
parent._cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
 //BA.debugLineNum = 39;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
parent._cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255));
 //BA.debugLineNum = 41;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
parent.mostCurrent._panelnenhumaleitura.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 43;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 45;BA.debugLine="If FirstTime Then";
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
 //BA.debugLineNum = 46;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 48;BA.debugLine="If Success = False Then";
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
 //BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
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
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _success) throws Exception{
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _resp = 0;
 //BA.debugLineNum = 256;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 258;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 260;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
_resp = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Deseja realmente sair?"),BA.ObjectToCharSequence("Já vai?"),"Sim","","Não",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 262;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
if (_resp==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 264;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 265;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 267;BA.debugLine="KeyCode = 0";
_keycode = (int) (0);
 //BA.debugLineNum = 268;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
 //BA.debugLineNum = 271;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 61;BA.debugLine="If CodigoCadastroLivro.cadastrou Or CodigoCadastr";
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
 //BA.debugLineNum = 62;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="CodigoCadastro.cadastrouUsuario = False";
parent.mostCurrent._codigocadastro._cadastrouusuario /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 65;BA.debugLine="CodigoCadastroLivro.cadastrou = False";
parent.mostCurrent._codigocadastrolivro._cadastrou /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 66;BA.debugLine="If Success = False Then";
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
 //BA.debugLineNum = 68;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 69;BA.debugLine="CodigoCadastroLivro.cadastrou = True";
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
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _atualiza_leituras() throws Exception{
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
int step42;
int limit42;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 80;BA.debugLine="Try";
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
 //BA.debugLineNum = 82;BA.debugLine="Dim cmd As String";
_cmd = "";
 //BA.debugLineNum = 84;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
_cmd = "exec sp_atualiza_leituras "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ );
 //BA.debugLineNum = 86;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_cmd));
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="Result.NextRow";
_result.NextRow();
 //BA.debugLineNum = 90;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
if (true) break;

case 4:
//if
this.state = 24;
if (_result.GetInt("RESULTADO")==2) { 
this.state = 6;
}else if(_result.GetInt("RESULTADO")==0) { 
this.state = 8;
}else if(_result.GetInt("RESULTADO")==1) { 
this.state = 10;
}else {
this.state = 23;
}if (true) break;

case 6:
//C
this.state = 24;
 //BA.debugLineNum = 92;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 94;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
parent.mostCurrent._lbl_inicial_leitura.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
 //BA.debugLineNum = 95;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
parent.mostCurrent._lbl_inicial_leitura.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 96;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
parent.mostCurrent._lbl_inicial_leitura.setTextSize((float) (20));
 //BA.debugLineNum = 98;BA.debugLine="scrollView1.Initialize (500)";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
 //BA.debugLineNum = 99;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 101;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(parent.mostCurrent._lbl_inicial_leitura.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
 //BA.debugLineNum = 104;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = 24;
 //BA.debugLineNum = 106;BA.debugLine="btAdicionarLeitura.Visible = False";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 108;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 109;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 112;BA.debugLine="btAdicionarLeitura.Visible = True";
parent.mostCurrent._btadicionarleitura.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 114;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
parent.mostCurrent._gradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),parent._cores);
 //BA.debugLineNum = 116;BA.debugLine="gradient.CornerRadius = 12";
parent.mostCurrent._gradient.setCornerRadius((float) (12));
 //BA.debugLineNum = 118;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
_quantidade = _result.GetInt("QUANTIDADE");
 //BA.debugLineNum = 120;BA.debugLine="Dim panels(quantidade) As Panel";
_panels = new anywheresoftware.b4a.objects.PanelWrapper[_quantidade];
{
int d0 = _panels.length;
for (int i0 = 0;i0 < d0;i0++) {
_panels[i0] = new anywheresoftware.b4a.objects.PanelWrapper();
}
}
;
 //BA.debugLineNum = 123;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
_lbltitulolivro = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbltitulolivro.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbltitulolivro[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 124;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
_lbldatacomecoleitura = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lbldatacomecoleitura.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbldatacomecoleitura[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 125;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
_lblprevisaotermino = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblprevisaotermino.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblprevisaotermino[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 126;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
_lblquantidadepaginas = new anywheresoftware.b4a.objects.LabelWrapper[_quantidade];
{
int d0 = _lblquantidadepaginas.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblquantidadepaginas[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 128;BA.debugLine="Dim btAnotar(quantidade) As Button";
_btanotar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btanotar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btanotar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
 //BA.debugLineNum = 129;BA.debugLine="Dim btLancar(quantidade) As Button";
_btlancar = new anywheresoftware.b4a.objects.ButtonWrapper[_quantidade];
{
int d0 = _btlancar.length;
for (int i0 = 0;i0 < d0;i0++) {
_btlancar[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
 //BA.debugLineNum = 131;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
_tamanho_fonte = (int) (17.5);
 //BA.debugLineNum = 133;BA.debugLine="Dim topo As Int = 1%y";
_topo = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
 //BA.debugLineNum = 134;BA.debugLine="Dim topoLabel As Int = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
 //BA.debugLineNum = 136;BA.debugLine="If temPanel Then";
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
 //BA.debugLineNum = 137;BA.debugLine="scrollView1.Panel.RemoveView";
parent.mostCurrent._scrollview1.getPanel().RemoveView();
 //BA.debugLineNum = 138;BA.debugLine="temPanel = False";
parent._tempanel = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
 //BA.debugLineNum = 141;BA.debugLine="If temPanel = False Then";

case 14:
//if
this.state = 21;
if (parent._tempanel==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 143;BA.debugLine="scrollView1.Initialize( 500 )";
parent.mostCurrent._scrollview1.Initialize(mostCurrent.activityBA,(int) (500));
 //BA.debugLineNum = 144;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
parent.mostCurrent._panel_lendo.AddView((android.view.View)(parent.mostCurrent._scrollview1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),parent.mostCurrent._btadicionarleitura.getTop());
 //BA.debugLineNum = 147;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 148;BA.debugLine="For i = 0 To panels.Length - 1";
if (true) break;

case 17:
//for
this.state = 20;
step42 = 1;
limit42 = (int) (_panels.length-1);
_i = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 19;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step42)) ;
if (true) break;

case 19:
//C
this.state = 30;
 //BA.debugLineNum = 150;BA.debugLine="topoLabel = 1%y";
_topolabel = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
 //BA.debugLineNum = 151;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
_panels[_i].Initialize(mostCurrent.activityBA,"Event_panels");
 //BA.debugLineNum = 153;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
_lbltitulolivro[_i].Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 154;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
_lbldatacomecoleitura[_i].Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 155;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
_lblprevisaotermino[_i].Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 156;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
_lblquantidadepaginas[_i].Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 158;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
_btanotar[_i].Initialize(mostCurrent.activityBA,"Event_btAnotar");
 //BA.debugLineNum = 159;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
_btlancar[_i].Initialize(mostCurrent.activityBA,"Event_btLancar");
 //BA.debugLineNum = 161;BA.debugLine="panels(i).Background = gradient";
_panels[_i].setBackground((android.graphics.drawable.Drawable)(parent.mostCurrent._gradient.getObject()));
 //BA.debugLineNum = 162;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
_panels[_i].setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
 //BA.debugLineNum = 164;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
parent.mostCurrent._scrollview1.getPanel().AddView((android.view.View)(_panels[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),_topo,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA));
 //BA.debugLineNum = 166;BA.debugLine="lblTituloLivro(i).Text = Result.GetString(\"no";
_lbltitulolivro[_i].setText(BA.ObjectToCharSequence(_result.GetString("nome")));
 //BA.debugLineNum = 167;BA.debugLine="lblTituloLivro(i).TextColor = Colors.RGB(189,";
_lbltitulolivro[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (151),(int) (1)));
 //BA.debugLineNum = 168;BA.debugLine="lblTituloLivro(i).TextSize = 23";
_lbltitulolivro[_i].setTextSize((float) (23));
 //BA.debugLineNum = 171;BA.debugLine="lblDataComecoLeitura(i).Text = \"Começei ler d";
_lbldatacomecoleitura[_i].setText(BA.ObjectToCharSequence("Começei ler dia "+_result.GetString("data_inicial")));
 //BA.debugLineNum = 172;BA.debugLine="lblDataComecoLeitura(i).TextColor = Colors.RG";
_lbldatacomecoleitura[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
 //BA.debugLineNum = 173;BA.debugLine="lblDataComecoLeitura(i).TextSize = tamanho_fo";
_lbldatacomecoleitura[_i].setTextSize((float) (_tamanho_fonte));
 //BA.debugLineNum = 176;BA.debugLine="lblPrevisaoTermino(i).Text = \"Previsão de Tér";
_lblprevisaotermino[_i].setText(BA.ObjectToCharSequence("Previsão de Término "+_result.GetString("data_prevista_final")));
 //BA.debugLineNum = 177;BA.debugLine="lblPrevisaoTermino(i).TextColor = Colors.RGB(";
_lblprevisaotermino[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
 //BA.debugLineNum = 178;BA.debugLine="lblPrevisaoTermino(i).TextSize = tamanho_font";
_lblprevisaotermino[_i].setTextSize((float) (_tamanho_fonte));
 //BA.debugLineNum = 181;BA.debugLine="lblQuantidadePaginas(i).Text = Result.GetStri";
_lblquantidadepaginas[_i].setText(BA.ObjectToCharSequence(_result.GetString("paginas_ou_cap_lidos")+" "+_result.GetString("tipo_de_leitura")+" de "+_result.GetString("quantidade_paginas")));
 //BA.debugLineNum = 182;BA.debugLine="lblQuantidadePaginas(i).TextColor = Colors.RG";
_lblquantidadepaginas[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (72),(int) (72)));
 //BA.debugLineNum = 183;BA.debugLine="lblQuantidadePaginas(i).TextSize = tamanho_fo";
_lblquantidadepaginas[_i].setTextSize((float) (_tamanho_fonte));
 //BA.debugLineNum = 186;BA.debugLine="Dim altura As Int = 3.5%y";
_altura = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.5),mostCurrent.activityBA);
 //BA.debugLineNum = 187;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
_panels[_i].AddView((android.view.View)(_lbltitulolivro[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
 //BA.debugLineNum = 188;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 189;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
_panels[_i].AddView((android.view.View)(_lbldatacomecoleitura[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
 //BA.debugLineNum = 190;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 //BA.debugLineNum = 191;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
_panels[_i].AddView((android.view.View)(_lblprevisaotermino[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
 //BA.debugLineNum = 192;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 //BA.debugLineNum = 193;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
_panels[_i].AddView((android.view.View)(_lblquantidadepaginas[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,(int) (_panels[_i].getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),_altura);
 //BA.debugLineNum = 194;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
_topolabel = (int) (_topolabel+_altura+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
 //BA.debugLineNum = 196;BA.debugLine="btAnotar(i).Tag = Result.GetString(\"nome\") &";
_btanotar[_i].setTag((Object)(_result.GetString("nome")+"/"+_result.GetString("quantidade_paginas")+"|"+BA.NumberToString(_result.GetInt("fk_id_Livro"))));
 //BA.debugLineNum = 198;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
_btanotar[_i].setText(BA.ObjectToCharSequence("Anotar"));
 //BA.debugLineNum = 199;BA.debugLine="btAnotar(i).TextSize = 16";
_btanotar[_i].setTextSize((float) (16));
 //BA.debugLineNum = 200;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
_btanotar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
 //BA.debugLineNum = 201;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
_btanotar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 202;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
_panels[_i].AddView((android.view.View)(_btanotar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
 //BA.debugLineNum = 204;BA.debugLine="btLancar(i).Tag = i";
_btlancar[_i].setTag((Object)(_i));
 //BA.debugLineNum = 206;BA.debugLine="btLancar(i).Text = \"Lançar\"";
_btlancar[_i].setText(BA.ObjectToCharSequence("Lançar"));
 //BA.debugLineNum = 207;BA.debugLine="btLancar(i).TextSize = 16";
_btlancar[_i].setTextSize((float) (16));
 //BA.debugLineNum = 208;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
_btlancar[_i].setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (0),(int) (0)));
 //BA.debugLineNum = 209;BA.debugLine="btLancar(i).Color = Colors.Transparent";
_btlancar[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 210;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
_panels[_i].AddView((android.view.View)(_btlancar[_i].getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (35),mostCurrent.activityBA),_topolabel,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6.5),mostCurrent.activityBA));
 //BA.debugLineNum = 213;BA.debugLine="topo = topo + 25%y + 10dip";
_topo = (int) (_topo+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
 //BA.debugLineNum = 215;BA.debugLine="Result.NextRow";
_result.NextRow();
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 217;BA.debugLine="scrollView1.Panel.Height = topo";
parent.mostCurrent._scrollview1.getPanel().setHeight(_topo);
 if (true) break;

case 21:
//C
this.state = 24;
;
 //BA.debugLineNum = 219;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 221;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 222;BA.debugLine="Return False";
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
 //BA.debugLineNum = 225;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Impossível carregar leituras"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 226;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
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
public static String  _btadicionarleitura_click() throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub btAdicionarLeitura_Click";
 //BA.debugLineNum = 249;BA.debugLine="StartActivity(CodigoCadastroLivro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastrolivro.getObject()));
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _event_btanotar_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _informacoes = "";
int _qtpag = 0;
int _codigolivro = 0;
 //BA.debugLineNum = 230;BA.debugLine="Sub Event_btAnotar_Click";
 //BA.debugLineNum = 232;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 233;BA.debugLine="Dim informacoes As String";
_informacoes = "";
 //BA.debugLineNum = 234;BA.debugLine="Dim qtPag, codigoLivro As Int";
_qtpag = 0;
_codigolivro = 0;
 //BA.debugLineNum = 236;BA.debugLine="informacoes = b.Tag";
_informacoes = BA.ObjectToString(_b.getTag());
 //BA.debugLineNum = 237;BA.debugLine="qtPag = informacoes.SubString2(informacoes.IndexO";
_qtpag = (int)(Double.parseDouble(_informacoes.substring((int) (_informacoes.indexOf("/")+1),_informacoes.indexOf("|"))));
 //BA.debugLineNum = 238;BA.debugLine="codigoLivro = informacoes.SubString2(informacoes.";
_codigolivro = (int)(Double.parseDouble(_informacoes.substring((int) (_informacoes.indexOf("|")+1),_informacoes.length())));
 //BA.debugLineNum = 240;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
mostCurrent._codigolayanotacao._codigolivro /*int*/  = _codigolivro;
 //BA.debugLineNum = 241;BA.debugLine="CodigoLayAnotacao.qtPaginas = qtPag";
mostCurrent._codigolayanotacao._qtpaginas /*int*/  = _qtpag;
 //BA.debugLineNum = 242;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = informacoes.SubSt";
mostCurrent._codigolayanotacao._nomedolivro /*String*/  = _informacoes.substring((int) (0),_informacoes.indexOf("/"));
 //BA.debugLineNum = 244;BA.debugLine="StartActivity(CodigoLayAnotacao)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayanotacao.getObject()));
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _event_lbl_click() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Event_lbl_Click";
 //BA.debugLineNum = 56;BA.debugLine="StartActivity(CodigoCadastroLivro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastrolivro.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private banco As ClassBancoDados";
mostCurrent._banco = new b4a.example.classbancodados();
 //BA.debugLineNum = 13;BA.debugLine="Private TabStrip As TabStrip";
mostCurrent._tabstrip = new anywheresoftware.b4a.objects.TabStripViewPager();
 //BA.debugLineNum = 15;BA.debugLine="Dim lbl_Inicial_Leitura As Label";
mostCurrent._lbl_inicial_leitura = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim scrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim gradient As GradientDrawable";
mostCurrent._gradient = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 20;BA.debugLine="Dim panelNenhumaLeitura As Panel";
mostCurrent._panelnenhumaleitura = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim cores(2) As Int";
_cores = new int[(int) (2)];
;
 //BA.debugLineNum = 23;BA.debugLine="Private btAdicionarLeitura As Button";
mostCurrent._btadicionarleitura = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Panel_lendo As Panel";
mostCurrent._panel_lendo = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim temPanel As Boolean = False";
_tempanel = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _tabstrip_pageselected(int _position) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
}
