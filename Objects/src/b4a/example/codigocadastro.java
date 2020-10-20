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
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Activity.LoadLayout(\"LayoutCadastro\")";
mostCurrent._activity.LoadLayout("LayoutCadastro",mostCurrent.activityBA);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="edNome.RequestFocus";
mostCurrent._ednome.RequestFocus();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="panelCadSalvo.Visible = False";
mostCurrent._panelcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="lblCadSalvo.Visible = False";
mostCurrent._lblcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="funcoes.Initialize";
mostCurrent._funcoes._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="StartActivity(CodigoLayLogin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolaylogin.getObject()));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigocadastro";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If edNome.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 32;
if ((parent.mostCurrent._ednome.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Else If edLogin.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edlogin.getText().trim()).equals("")) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Else If edSenha.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 32;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="MsgboxAsync(\"Falta o nome\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta o nome"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="edNome.RequestFocus";
parent.mostCurrent._ednome.RequestFocus();
 if (true) break;

case 5:
//C
this.state = 32;
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="MsgboxAsync(\"Falta o login\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta o login"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="edLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 7:
//C
this.state = 32;
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="MsgboxAsync(\"Falta a senha\",\"Está apressado?\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Falta a senha"),BA.ObjectToCharSequence("Está apressado?"),processBA);
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="edSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="If edRepitaSenha.Text.Trim.Length < 8 Then";
if (true) break;

case 10:
//if
this.state = 31;
if (parent.mostCurrent._edrepitasenha.getText().trim().length()<8) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Else If edSenha.Text.Trim <> edRepitaSenha.Text.";
if ((parent.mostCurrent._edsenha.getText().trim()).equals(parent.mostCurrent._edrepitasenha.getText().trim()) == false) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 12:
//C
this.state = 31;
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="MsgboxAsync(\"Sua senha precisa ter no mínimo 8";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Sua senha precisa ter no mínimo 8 dígitos."),BA.ObjectToCharSequence("Senha inválida!"),processBA);
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="edRepitaSenha.RequestFocus";
parent.mostCurrent._edrepitasenha.RequestFocus();
 if (true) break;

case 14:
//C
this.state = 31;
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="MsgboxAsync(\"As senhas não coinsidem.\",\"Atenção";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("As senhas não coinsidem."),BA.ObjectToCharSequence("Atenção!"),processBA);
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="edRepitaSenha.Text = \"\"";
parent.mostCurrent._edrepitasenha.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="edSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="Try";
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
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="Dim cmd As String = \"exec sp_cad_usuario_crono";
_cmd = "exec sp_cad_usuario_cronograma '"+parent.mostCurrent._ednome.getText()+"', '"+parent.mostCurrent._edlogin.getText()+"', '"+parent.mostCurrent._edsenha.getText()+"' ";
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Wait For (funcoes.Insert_Consulta(cmd)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastro", "btsalvar_click"), parent.mostCurrent._funcoes._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="If Result = Null Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_result== null) { 
this.state = 22;
}else 
{RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 24;
}else {
this.state = 26;
}}
if (true) break;

case 22:
//C
this.state = 27;
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="MsgboxAsync(\"Problemas na conexão com banco d";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas na conexão com banco de dados. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"Op";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!"),processBA);
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="edNome.RequestFocus";
parent.mostCurrent._ednome.RequestFocus();
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="edLogin.Enabled = False";
parent.mostCurrent._edlogin.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="edNome.Enabled = False";
parent.mostCurrent._ednome.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="edRepitaSenha.Enabled = False";
parent.mostCurrent._edrepitasenha.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="edSenha.Enabled = False";
parent.mostCurrent._edsenha.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="edSenha.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._edsenha.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="edLogin.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._edlogin.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=917558;
 //BA.debugLineNum = 917558;BA.debugLine="edNome.TextColor = Colors.RGB(158, 130, 130)";
parent.mostCurrent._ednome.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=917559;
 //BA.debugLineNum = 917559;BA.debugLine="edRepitaSenha.TextColor = Colors.RGB(158, 130";
parent.mostCurrent._edrepitasenha.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (158),(int) (130),(int) (130)));
RDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="Main.Id_do_Usuario = Result.GetInt(\"ID\")";
parent.mostCurrent._main._id_do_usuario /*int*/  = _result.GetInt("ID");
RDebugUtils.currentLine=917562;
 //BA.debugLineNum = 917562;BA.debugLine="ToastMessageShow(\"Sucesso!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sucesso!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917564;
 //BA.debugLineNum = 917564;BA.debugLine="lblCadSalvo.Visible = True";
parent.mostCurrent._lblcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917565;
 //BA.debugLineNum = 917565;BA.debugLine="panelCadSalvo.Visible = True";
parent.mostCurrent._panelcadsalvo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917566;
 //BA.debugLineNum = 917566;BA.debugLine="lblCadSalvo.Text = Result.GetString(\"MENSAGEM";
parent.mostCurrent._lblcadsalvo.setText(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")));
RDebugUtils.currentLine=917568;
 //BA.debugLineNum = 917568;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=917569;
 //BA.debugLineNum = 917569;BA.debugLine="Sleep(1200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastro", "btsalvar_click"),(int) (1200));
this.state = 34;
return;
case 34:
//C
this.state = 27;
;
RDebugUtils.currentLine=917571;
 //BA.debugLineNum = 917571;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=917572;
 //BA.debugLineNum = 917572;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=917574;
 //BA.debugLineNum = 917574;BA.debugLine="Result.Close";
_result.Close();
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=917576;
 //BA.debugLineNum = 917576;BA.debugLine="Result.Close";
_result.Close();
RDebugUtils.currentLine=917577;
 //BA.debugLineNum = 917577;BA.debugLine="MsgboxAsync(\"Problemas na inserção de dados. \"";
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
RDebugUtils.currentLine=917582;
 //BA.debugLineNum = 917582;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub edRepitaSenha_TextChanged (Old As String, New";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="edRepitaSenha.Text = New.SubString2(0, 8)";
mostCurrent._edrepitasenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="edRepitaSenha.SelectionStart = 8";
mostCurrent._edrepitasenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="End Sub";
return "";
}
public static String  _edsenha_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edsenha_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edsenha_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub edSenha_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="edSenha.Text = New.SubString2(0, 8)";
mostCurrent._edsenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="edSenha.SelectionStart = 8";
mostCurrent._edsenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="End Sub";
return "";
}
public static String  _lblmostrarsenha_click() throws Exception{
RDebugUtils.currentModule="codigocadastro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblmostrarsenha_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblmostrarsenha_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub lblMostrarSenha_Click";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If mostrarSenha Then";
if (_mostrarsenha) { 
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="edSenha.PasswordMode = False";
mostCurrent._edsenha.setPasswordMode(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="mostrarSenha = False";
_mostrarsenha = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="lblMostrarSenha.Text = \"Esconder senha\"";
mostCurrent._lblmostrarsenha.setText(BA.ObjectToCharSequence("Esconder senha"));
 }else {
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="edSenha.PasswordMode = True";
mostCurrent._edsenha.setPasswordMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="mostrarSenha = True";
_mostrarsenha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="lblMostrarSenha.Text = \"Mostrar senha\"";
mostCurrent._lblmostrarsenha.setText(BA.ObjectToCharSequence("Mostrar senha"));
 };
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="End Sub";
return "";
}
}