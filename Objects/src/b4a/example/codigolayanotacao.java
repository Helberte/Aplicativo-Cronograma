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

public class codigolayanotacao extends Activity implements B4AActivity{
	public static codigolayanotacao mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigolayanotacao");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigolayanotacao).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigolayanotacao");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigolayanotacao", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigolayanotacao) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigolayanotacao) Resume **");
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
		return codigolayanotacao.class;
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
            BA.LogInfo("** Activity (codigolayanotacao) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigolayanotacao) Pause event (activity is not paused). **");
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
            codigolayanotacao mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigolayanotacao) Resume **");
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
public static String _nomedolivro = "";
public static int _qtpaginas = 0;
public static int _codigolivro = 0;
public static String _tipoleitura = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbltitulo = null;
public b4a.example.b4xcombobox _b4xcombobox1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtituloanotacao = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edanotacao = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btcancelar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btok = null;
public b4a.example.classbancodados _banco = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblanotacaorefpag = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Activity.LoadLayout(\"Lay_Anotar\")";
mostCurrent._activity.LoadLayout("Lay_Anotar",mostCurrent.activityBA);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="edTituloAnotacao.RequestFocus";
mostCurrent._edtituloanotacao.RequestFocus();
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="nomeDoLivro = \"\"";
_nomedolivro = "";
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="qtPaginas = 0";
_qtpaginas = (int) (0);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
int[] _paginas = null;
int _i = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim paginas(qtPaginas) As Int";
_paginas = new int[_qtpaginas];
;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="For i = 0 To qtPaginas - 1";
{
final int step2 = 1;
final int limit2 = (int) (_qtpaginas-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="paginas(i) = i + 1";
_paginas[_i] = (int) (_i+1);
 }
};
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="lblTitulo.Text = nomeDoLivro";
mostCurrent._lbltitulo.setText(BA.ObjectToCharSequence(_nomedolivro));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="B4XComboBox1.SetItems(paginas)";
mostCurrent._b4xcombobox1._setitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(_paginas));
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="If lblAnotacaoRefPag.Text = \"página\" Then";
if ((mostCurrent._lblanotacaorefpag.getText()).equals("página")) { 
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente à p";
mostCurrent._lblanotacaorefpag.setText(BA.ObjectToCharSequence("Anotação referente à página"));
 }else {
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente ao";
mostCurrent._lblanotacaorefpag.setText(BA.ObjectToCharSequence("Anotação referente ao capítulo"));
 };
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="End Sub";
return "";
}
public static String  _btcancelar_click() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcancelar_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btCancelar_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="nomeDoLivro = \"\"";
_nomedolivro = "";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="qtPaginas = 0";
_qtpaginas = (int) (0);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static void  _btok_click() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btok_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btok_click", null); return;}
ResumableSub_btOk_Click rsub = new ResumableSub_btOk_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btOk_Click extends BA.ResumableSub {
public ResumableSub_btOk_Click(b4a.example.codigolayanotacao parent) {
this.parent = parent;
}
b4a.example.codigolayanotacao parent;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((parent.mostCurrent._edtituloanotacao.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Else if edAnotacao.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edanotacao.getText().trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="edTituloAnotacao.RequestFocus";
parent.mostCurrent._edtituloanotacao.RequestFocus();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="ToastMessageShow(\"Insira um título para sua anot";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Insira um título para sua anotação"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 20;
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="edAnotacao.RequestFocus";
parent.mostCurrent._edanotacao.RequestFocus();
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="ToastMessageShow(\"Cadê a anotação?\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cadê a anotação?"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Try";
if (true) break;

case 8:
//try
this.state = 19;
this.catchState = 18;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 18;
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="cmd = \"exec sp_atualiza_anotacao \" & Main.Id_do";
_cmd = "exec sp_atualiza_anotacao "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+", "+BA.NumberToString(parent._codigolivro)+", "+parent.mostCurrent._b4xcombobox1._getselecteditem /*String*/ (null)+", '"+parent.mostCurrent._edtituloanotacao.getText()+"','"+parent.mostCurrent._edanotacao.getText()+"'";
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Wait For( banco.Insert_Consulta(cmd)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2293788;
 //BA.debugLineNum = 2293788;BA.debugLine="ToastMessageShow(\"Tudo certo\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Tudo certo"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 24;
return;
case 24:
//C
this.state = 19;
;
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293799;
 //BA.debugLineNum = 2293799;BA.debugLine="End Sub";
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
public static String  _edanotacao_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edanotacao_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edanotacao_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub edAnotacao_TextChanged (Old As String, New As";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="edAnotacao.Text = edAnotacao.Text.Replace(\"'\",\"\"";
mostCurrent._edanotacao.setText(BA.ObjectToCharSequence(mostCurrent._edanotacao.getText().replace("'","")));
 };
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="End Sub";
return "";
}
public static String  _edtituloanotacao_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtituloanotacao_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtituloanotacao_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub edTituloAnotacao_TextChanged (Old As String, N";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="edTituloAnotacao.Text = edTituloAnotacao.Text.Re";
mostCurrent._edtituloanotacao.setText(BA.ObjectToCharSequence(mostCurrent._edtituloanotacao.getText().replace("'","")));
 };
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="End Sub";
return "";
}
}