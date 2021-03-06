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
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigo_laydetalheslivro _codigo_laydetalheslivro = null;
public b4a.example.modulo_funcoes _modulo_funcoes = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Activity.LoadLayout(\"LayLogin\")";
mostCurrent._activity.LoadLayout("LayLogin",mostCurrent.activityBA);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="EdLogin.RequestFocus";
mostCurrent._edlogin.RequestFocus();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="funcoes.Initialize";
mostCurrent._funcoes._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _btcadastro_click() throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcadastro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcadastro_click", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub btCadastro_Click";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="StartActivity(CodigoCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigocadastro.getObject()));
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If EdLogin.Text.Trim = \"\" And EdSenha.Text.Trim =";
if (true) break;

case 1:
//if
this.state = 34;
if ((parent.mostCurrent._edlogin.getText().trim()).equals("") && (parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="Else If EdSenha.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edsenha.getText().trim()).equals("")) { 
this.state = 13;
}else {
this.state = 15;
}}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="EdLogin.Text = EdLogin.Text.Trim";
parent.mostCurrent._edlogin.setText(BA.ObjectToCharSequence(parent.mostCurrent._edlogin.getText().trim()));
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="EdSenha.Text = EdSenha.Text.Trim";
parent.mostCurrent._edsenha.setText(BA.ObjectToCharSequence(parent.mostCurrent._edsenha.getText().trim()));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Dim ms As Object = Msgbox2Async(\"Ainda não tem u";
_ms = anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ainda não tem um Cadastro, deseja faze-lo agora?"),BA.ObjectToCharSequence("Campos vazios"),"Sim","Cancelar ","Já tenho cadastro ",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="Wait For (ms) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolaylogin", "btconectar_click"), _ms);
this.state = 35;
return;
case 35:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="Else If Result = DialogResponse.CANCEL Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 10;
}}}
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="StartActivity(CodigoCadastro)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigocadastro.getObject()));
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 11:
//C
this.state = 34;
;
 if (true) break;

case 13:
//C
this.state = 34;
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="EdSenha.RequestFocus";
parent.mostCurrent._edsenha.RequestFocus();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 33;
this.catchState = 32;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 32;
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="Dim exec As String = \"exec sp_encontra_usuario";
_exec = "exec sp_encontra_usuario '"+parent.mostCurrent._edlogin.getText()+"', '"+parent.mostCurrent._edsenha.getText()+"'";
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="wait For (funcoes.Insert_Consulta(exec)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolaylogin", "btconectar_click"), parent.mostCurrent._funcoes._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_exec));
this.state = 36;
return;
case 36:
//C
this.state = 19;
_result_2 = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=3670049;
 //BA.debugLineNum = 3670049;BA.debugLine="If Result_2 = Null Then";
if (true) break;

case 19:
//if
this.state = 30;
if (_result_2== null) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 30;
RDebugUtils.currentLine=3670050;
 //BA.debugLineNum = 3670050;BA.debugLine="MsgboxAsync(\"Problemas ao verificar usuário. \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao verificar usuário. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=3670052;
 //BA.debugLineNum = 3670052;BA.debugLine="Result_2.NextRow";
_result_2.NextRow();
RDebugUtils.currentLine=3670054;
 //BA.debugLineNum = 3670054;BA.debugLine="If Result_2.GetString(\"RESULTADO\") = 0 Then";
if (true) break;

case 24:
//if
this.state = 29;
if ((_result_2.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=3670056;
 //BA.debugLineNum = 3670056;BA.debugLine="MsgboxAsync(\"Usuário não encontrado.\",\"Ops!\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Usuário não encontrado."),BA.ObjectToCharSequence("Ops!"),processBA);
RDebugUtils.currentLine=3670057;
 //BA.debugLineNum = 3670057;BA.debugLine="EdLogin.Text = \"\"";
parent.mostCurrent._edlogin.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3670058;
 //BA.debugLineNum = 3670058;BA.debugLine="EdSenha.Text = \"\"";
parent.mostCurrent._edsenha.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3670059;
 //BA.debugLineNum = 3670059;BA.debugLine="EdLogin.RequestFocus";
parent.mostCurrent._edlogin.RequestFocus();
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=3670061;
 //BA.debugLineNum = 3670061;BA.debugLine="Main.Id_do_Usuario = Result_2.GetInt(\"ID_USUA";
parent.mostCurrent._main._id_do_usuario /*int*/  = _result_2.GetInt("ID_USUARIO");
RDebugUtils.currentLine=3670063;
 //BA.debugLineNum = 3670063;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=3670064;
 //BA.debugLineNum = 3670064;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
RDebugUtils.currentLine=3670068;
 //BA.debugLineNum = 3670068;BA.debugLine="MsgboxAsync(\"Problemas ao verificar usuário. \"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao verificar usuário. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção!"),processBA);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670071;
 //BA.debugLineNum = 3670071;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub EdLogin_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="EdLogin.Text = EdLogin.Text.Replace(\"'\",\"\")";
mostCurrent._edlogin.setText(BA.ObjectToCharSequence(mostCurrent._edlogin.getText().replace("'","")));
 };
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="End Sub";
return "";
}
public static String  _edsenha_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolaylogin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edsenha_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edsenha_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub EdSenha_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If New.Length > 8 Then";
if (_new.length()>8) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="EdSenha.Text = New.SubString2(0, 8)";
mostCurrent._edsenha.setText(BA.ObjectToCharSequence(_new.substring((int) (0),(int) (8))));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="EdSenha.SelectionStart = 8";
mostCurrent._edsenha.setSelectionStart((int) (8));
 };
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="End Sub";
return "";
}
}