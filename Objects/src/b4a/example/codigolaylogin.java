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

public class codigolaylogin extends Activity implements B4AActivity{
	public static codigolaylogin mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigolaylogin");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigolaylogin).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigolaylogin");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigolaylogin", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigolaylogin) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigolaylogin) Resume **");
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
		return codigolaylogin.class;
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
            BA.LogInfo("** Activity (codigolaylogin) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigolaylogin) Pause event (activity is not paused). **");
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
            codigolaylogin mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigolaylogin) Resume **");
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
public b4a.example.classbancodados _funcoes = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edsenha = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btconectar = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Activity.LoadLayout(\"LayLogin\")";
mostCurrent._activity.LoadLayout("LayLogin",mostCurrent.activityBA);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="EdLogin.RequestFocus";
mostCurrent._edlogin.RequestFocus();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="funcoes.Initialize";
mostCurrent._funcoes._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _btcadastro_click() throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcadastro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcadastro_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub btCadastro_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="StartActivity(CodigoCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastro.getObject()));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static void  _btconectar_click() throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btconectar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btconectar_click", null); return;}
ResumableSub_btConectar_Click rsub = new ResumableSub_btConectar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btConectar_Click extends BA.ResumableSub {
public ResumableSub_btConectar_Click(b4a.example.codigolaylogin parent) {
this.parent = parent;
}
b4a.example.codigolaylogin parent;
Object _ms = null;
int _result = 0;
String _exec = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result_2 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolaylogin";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If EdLogin.Text.Trim = \"\" And EdSenha.Text.Trim =";
if (true) break;

case 1:
//if
this.state = 28;
if ((parent.mostCurrent._edlogin.getText().trim()).equals("") && (parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="Else If EdSenha.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 13;
}else {
this.state = 15;
}}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="EdLogin.Text = EdLogin.Text.Trim";
parent.mostCurrent._edlogin.setText(BA.ObjectToCharSequence(parent.mostCurrent._edlogin.getText().trim()));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="EdSenha.Text = EdSenha.Text.Trim";
parent.mostCurrent._edsenha.setText(BA.ObjectToCharSequence(parent.mostCurrent._edsenha.getText().trim()));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim ms As Object = Msgbox2Async(\"Ainda não tem u";
_ms = anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ainda não tem um Cadastro, deseja faze-lo agora?"),BA.ObjectToCharSequence("Campos vazios"),"Sim","Cancelar ","Já tenho cadastro ",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Wait For (ms) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolaylogin", "btconectar_click"), _ms);
this.state = 29;
return;
case 29:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Else If Result = DialogResponse.CANCEL Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 10;
}}}
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="StartActivity(CodigoCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigocadastro.getObject()));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 11:
//C
this.state = 28;
;
 if (true) break;

case 13:
//C
this.state = 28;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="EdSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 27;
this.catchState = 26;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 26;
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="Dim exec As String = \"exec sp_encontra_usuario";
_exec = "exec sp_encontra_usuario '"+parent.mostCurrent._edlogin.getText()+"', '"+parent.mostCurrent._edsenha.getText()+"'";
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="wait For (funcoes.Insert_Consulta(exec)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolaylogin", "btconectar_click"), parent.mostCurrent._funcoes._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_exec));
this.state = 30;
return;
case 30:
//C
this.state = 19;
_result_2 = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="Result_2.NextRow";
_result_2.NextRow();
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="If Result_2.GetString(\"RESULTADO\") = 0 Then";
if (true) break;

case 19:
//if
this.state = 24;
if ((_result_2.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="MsgboxAsync(\"Usuário não encontrado.\",\"Ops!\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Usuário não encontrado."),BA.ObjectToCharSequence("Ops!"),processBA);
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="EdLogin.Text = \"\"";
parent.mostCurrent._edlogin.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="EdSenha.Text = \"\"";
parent.mostCurrent._edsenha.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="Main.Id_do_Usuario = Result_2.GetInt(\"ID_USUAR";
parent.mostCurrent._main._id_do_usuario /*int*/  = _result_2.GetInt("ID_USUARIO");
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
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
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="MsgboxAsync(\"Problemas ao verificar usuário. \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao verificar usuário. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="End Sub";
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
public static String  _edlogin_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edlogin_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edlogin_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub EdLogin_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="EdLogin.Text = EdLogin.Text.Replace(\"'\",\"\")";
mostCurrent._edlogin.setText(BA.ObjectToCharSequence(mostCurrent._edlogin.getText().replace("'","")));
 };
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public static String  _edsenha_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edsenha_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edsenha_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub EdSenha_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="EdSenha.Text = New.SubString2(0, 8)";
mostCurrent._edsenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="EdSenha.SelectionStart = 8";
mostCurrent._edsenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
}