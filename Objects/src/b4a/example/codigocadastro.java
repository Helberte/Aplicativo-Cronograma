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

public class codigocadastro extends Activity implements B4AActivity{
	public static codigocadastro mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigocadastro");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigocadastro).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigocadastro");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigocadastro", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigocadastro) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigocadastro) Resume **");
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
		return codigocadastro.class;
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
            BA.LogInfo("** Activity (codigocadastro) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigocadastro) Pause event (activity is not paused). **");
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
            codigocadastro mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigocadastro) Resume **");
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
public static boolean _mostrarsenha = false;
public anywheresoftware.b4a.objects.EditTextWrapper _ednome = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edsenha = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edrepitasenha = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcadsalvo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcadsalvo = null;
public b4a.example.classbancodados _funcoes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmostrarsenha = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Activity.LoadLayout(\"LayoutCadastro\")";
mostCurrent._activity.LoadLayout("LayoutCadastro",mostCurrent.activityBA);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="edNome.RequestFocus";
mostCurrent._ednome.RequestFocus();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="panelCadSalvo.Visible = False";
mostCurrent._panelcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="lblCadSalvo.Visible = False";
mostCurrent._lblcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="funcoes.Initialize";
mostCurrent._funcoes._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="StartActivity(CodigoLayLogin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolaylogin.getObject()));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigocadastro";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static void  _btsalvar_click() throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btsalvar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btsalvar_click", null); return;}
ResumableSub_btSalvar_Click rsub = new ResumableSub_btSalvar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btSalvar_Click extends BA.ResumableSub {
public ResumableSub_btSalvar_Click(b4a.example.codigocadastro parent) {
this.parent = parent;
}
b4a.example.codigocadastro parent;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigocadastro";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If edNome.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 32;
if ((parent.mostCurrent._ednome.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Else If edLogin.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edlogin.getText().trim()).equals("")) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Else If edSenha.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 32;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="MsgboxAsync(\"Falta o nome\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta o nome"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="edNome.RequestFocus";
parent.mostCurrent._ednome.RequestFocus();
 if (true) break;

case 5:
//C
this.state = 32;
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="MsgboxAsync(\"Falta o login\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta o login"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="edLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 7:
//C
this.state = 32;
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="MsgboxAsync(\"Falta a senha\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta a senha"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="edSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="If edRepitaSenha.Text.Trim.Length < 8 Then";
if (true) break;

case 10:
//if
this.state = 31;
if (parent.mostCurrent._edrepitasenha.getText().trim().length()<8) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="Else If edSenha.Text.Trim <> edRepitaSenha.Text.";
if ((parent.mostCurrent._edsenha.getText().trim()).equals(parent.mostCurrent._edrepitasenha.getText().trim()) == false) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 12:
//C
this.state = 31;
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="MsgboxAsync(\"Sua senha precisa ter no mínimo 8";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Sua senha precisa ter no mínimo 8 dígitos."),BA.ObjectToCharSequence("Senha inválida!"),processBA);
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="edRepitaSenha.RequestFocus";
parent.mostCurrent._edrepitasenha.RequestFocus();
 if (true) break;

case 14:
//C
this.state = 31;
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="MsgboxAsync(\"As senhas não coinsidem.\",\"Atenção";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("As senhas não coinsidem."),BA.ObjectToCharSequence("Atenção!"),processBA);
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="edRepitaSenha.Text = \"\"";
parent.mostCurrent._edrepitasenha.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="edSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="Try";
if (true) break;

case 17:
//try
this.state = 30;
this.catchState = 29;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 29;
RDebugUtils.currentLine=2359324;
 //BA.debugLineNum = 2359324;BA.debugLine="Dim cmd As String = \"exec sp_cad_usuario_crono";
_cmd = "exec sp_cad_usuario_cronograma '"+parent.mostCurrent._ednome.getText()+"', '"+parent.mostCurrent._edlogin.getText()+"', '"+parent.mostCurrent._edsenha.getText()+"' ";
RDebugUtils.currentLine=2359328;
 //BA.debugLineNum = 2359328;BA.debugLine="Wait For (funcoes.Insert_Consulta(cmd)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastro", "btsalvar_click"), parent.mostCurrent._funcoes._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=2359330;
 //BA.debugLineNum = 2359330;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=2359332;
 //BA.debugLineNum = 2359332;BA.debugLine="If Result = Null Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_result== null) { 
this.state = 22;
}else 
{RDebugUtils.currentLine=2359336;
 //BA.debugLineNum = 2359336;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 24;
}else {
this.state = 26;
}}
if (true) break;

case 22:
//C
this.state = 27;
RDebugUtils.currentLine=2359334;
 //BA.debugLineNum = 2359334;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2359335;
 //BA.debugLineNum = 2359335;BA.debugLine="MsgboxAsync(\"Problemas na conexão com banco d";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas na conexão com banco de dados. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=2359338;
 //BA.debugLineNum = 2359338;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2359339;
 //BA.debugLineNum = 2359339;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"Op";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!"),processBA);
RDebugUtils.currentLine=2359340;
 //BA.debugLineNum = 2359340;BA.debugLine="edNome.RequestFocus";
parent.mostCurrent._ednome.RequestFocus();
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=2359343;
 //BA.debugLineNum = 2359343;BA.debugLine="edLogin.Enabled = False";
parent.mostCurrent._edlogin.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359344;
 //BA.debugLineNum = 2359344;BA.debugLine="edNome.Enabled = False";
parent.mostCurrent._ednome.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359345;
 //BA.debugLineNum = 2359345;BA.debugLine="edRepitaSenha.Enabled = False";
parent.mostCurrent._edrepitasenha.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359346;
 //BA.debugLineNum = 2359346;BA.debugLine="edSenha.Enabled = False";
parent.mostCurrent._edsenha.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359348;
 //BA.debugLineNum = 2359348;BA.debugLine="edSenha.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._edsenha.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=2359349;
 //BA.debugLineNum = 2359349;BA.debugLine="edLogin.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._edlogin.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=2359350;
 //BA.debugLineNum = 2359350;BA.debugLine="edNome.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._ednome.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=2359351;
 //BA.debugLineNum = 2359351;BA.debugLine="edRepitaSenha.TextColor = Colors.RGB(158, 130";
parent.mostCurrent._edrepitasenha.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=2359353;
 //BA.debugLineNum = 2359353;BA.debugLine="Main.Id_do_Usuario = Result.GetInt(\"ID\")";
parent.mostCurrent._main._id_do_usuario /*int*/  = _result.GetInt("ID");
RDebugUtils.currentLine=2359354;
 //BA.debugLineNum = 2359354;BA.debugLine="ToastMessageShow(\"Sucesso!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sucesso!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359356;
 //BA.debugLineNum = 2359356;BA.debugLine="lblCadSalvo.Visible = True";
parent.mostCurrent._lblcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359357;
 //BA.debugLineNum = 2359357;BA.debugLine="panelCadSalvo.Visible = True";
parent.mostCurrent._panelcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359358;
 //BA.debugLineNum = 2359358;BA.debugLine="lblCadSalvo.Text = Result.GetString(\"MENSAGEM";
parent.mostCurrent._lblcadsalvo.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
RDebugUtils.currentLine=2359360;
 //BA.debugLineNum = 2359360;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2359361;
 //BA.debugLineNum = 2359361;BA.debugLine="Sleep(1200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastro", "btsalvar_click"),(int) (1200));
this.state = 34;
return;
case 34:
//C
this.state = 27;
;
RDebugUtils.currentLine=2359363;
 //BA.debugLineNum = 2359363;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=2359364;
 //BA.debugLineNum = 2359364;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=2359366;
 //BA.debugLineNum = 2359366;BA.debugLine="Result.Close";
_result.Close();
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=2359368;
 //BA.debugLineNum = 2359368;BA.debugLine="Result.Close";
_result.Close();
RDebugUtils.currentLine=2359369;
 //BA.debugLineNum = 2359369;BA.debugLine="MsgboxAsync(\"Problemas na inserção de dados. \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas na inserção de dados. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359374;
 //BA.debugLineNum = 2359374;BA.debugLine="End Sub";
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
public static String  _edrepitasenha_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edrepitasenha_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edrepitasenha_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub edRepitaSenha_TextChanged (Old As String, New";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="edRepitaSenha.Text = New.SubString2(0, 8)";
mostCurrent._edrepitasenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="edRepitaSenha.SelectionStart = 8";
mostCurrent._edrepitasenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public static String  _edsenha_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edsenha_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edsenha_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub edSenha_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="edSenha.Text = New.SubString2(0, 8)";
mostCurrent._edsenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="edSenha.SelectionStart = 8";
mostCurrent._edsenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public static String  _lblmostrarsenha_click() throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblmostrarsenha_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblmostrarsenha_click", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub lblMostrarSenha_Click";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="If mostrarSenha Then";
if (_mostrarsenha) { 
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="edSenha.PasswordMode = False";
mostCurrent._edsenha.setPasswordMode(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="mostrarSenha = False";
_mostrarsenha = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="lblMostrarSenha.Text = \"Esconder senha\"";
mostCurrent._lblmostrarsenha.setText(BA.ObjectToCharSequence("Esconder senha"));
 }else {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="edSenha.PasswordMode = True";
mostCurrent._edsenha.setPasswordMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="mostrarSenha = True";
_mostrarsenha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="lblMostrarSenha.Text = \"Mostrar senha\"";
mostCurrent._lblmostrarsenha.setText(BA.ObjectToCharSequence("Mostrar senha"));
 };
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="End Sub";
return "";
}
}