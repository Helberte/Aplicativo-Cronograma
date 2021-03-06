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
public anywheresoftware.b4a.objects.PanelWrapper _panel_cabecalho = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltituloanotacao = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_anotacao = null;
public static boolean _verifica = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigo_laydetalheslivro _codigo_laydetalheslivro = null;
public b4a.example.modulo_funcoes _modulo_funcoes = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Activity.LoadLayout(\"Lay_Anotar\")";
mostCurrent._activity.LoadLayout("Lay_Anotar",mostCurrent.activityBA);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="edTituloAnotacao.RequestFocus";
mostCurrent._edtituloanotacao.RequestFocus();
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="nomeDoLivro = \"\"";
_nomedolivro = "";
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="qtPaginas = 0";
_qtpaginas = (int) (0);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
int[] _paginas = null;
int _i = 0;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim paginas(qtPaginas) As Int";
_paginas = new int[_qtpaginas];
;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="For i = 0 To qtPaginas - 1";
{
final int step2 = 1;
final int limit2 = (int) (_qtpaginas-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="paginas(i) = i + 1";
_paginas[_i] = (int) (_i+1);
 }
};
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="If lblAnotacaoRefPag.Text = \"página\" Then";
if ((mostCurrent._lblanotacaorefpag.getText()).equals("página")) { 
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente à p";
mostCurrent._lblanotacaorefpag.setText(BA.ObjectToCharSequence("Anotação referente à página"));
 }else {
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente ao";
mostCurrent._lblanotacaorefpag.setText(BA.ObjectToCharSequence("Anotação referente ao capítulo"));
 };
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="lblTitulo.Text = nomeDoLivro";
mostCurrent._lbltitulo.setText(BA.ObjectToCharSequence(_nomedolivro));
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="B4XComboBox1.SetItems(paginas)";
mostCurrent._b4xcombobox1._setitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(_paginas));
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="lblTitulo.TextColor = Colors.Transparent";
mostCurrent._lbltitulo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="lblTitulo.Top = -2.5%y";
mostCurrent._lbltitulo.setTop((int) (-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2.5),mostCurrent.activityBA)));
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="lblTitulo.SetTextColorAnimated(1000, Colors.RGB(1";
mostCurrent._lbltitulo.SetTextColorAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (195),(int) (21),(int) (21)));
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="lblTitulo.SetLayoutAnimated(1000, 0%x, 2.5%y, pan";
mostCurrent._lbltitulo.SetLayoutAnimated((int) (1000),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2.5),mostCurrent.activityBA),mostCurrent._panel_cabecalho.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
if ((mostCurrent._edtituloanotacao.getText().trim()).equals("")) { 
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="lblTituloAnotacao.TextColor = Colors.Transparent";
mostCurrent._lbltituloanotacao.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 }else {
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="ApareceTituloAnotacao";
_aparecetituloanotacao();
 };
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="End Sub";
return "";
}
public static String  _aparecetituloanotacao() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aparecetituloanotacao", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aparecetituloanotacao", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub ApareceTituloAnotacao";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="verifica = False";
_verifica = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="lblTituloAnotacao.Top = 0%y";
mostCurrent._lbltituloanotacao.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="lblTituloAnotacao.TextColor = Colors.Transparent";
mostCurrent._lbltituloanotacao.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="lblTituloAnotacao.SetTextColorAnimated(600, Color";
mostCurrent._lbltituloanotacao.SetTextColorAnimated((int) (600),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (195),(int) (21),(int) (21)));
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="lblTituloAnotacao.SetLayoutAnimated(900, (panel_a";
mostCurrent._lbltituloanotacao.SetLayoutAnimated((int) (900),(int) ((mostCurrent._panel_anotacao.getWidth()-mostCurrent._lbltituloanotacao.getWidth())/(double)2),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),(int) (mostCurrent._panel_anotacao.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.2),mostCurrent.activityBA));
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="End Sub";
return "";
}
public static String  _btcancelar_click() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcancelar_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub btCancelar_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="nomeDoLivro = \"\"";
_nomedolivro = "";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="qtPaginas = 0";
_qtpaginas = (int) (0);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((parent.mostCurrent._edtituloanotacao.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Else if edAnotacao.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edanotacao.getText().trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="edTituloAnotacao.RequestFocus";
parent.mostCurrent._edtituloanotacao.RequestFocus();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="ToastMessageShow(\"Insira um título para sua anot";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Insira um título para sua anotação"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 20;
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="edAnotacao.RequestFocus";
parent.mostCurrent._edanotacao.RequestFocus();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="ToastMessageShow(\"Cadê a anotação?\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cadê a anotação?"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Try";
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
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="cmd = \"exec sp_atualiza_anotacao \" & Main.Id_do";
_cmd = "exec sp_atualiza_anotacao "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+", "+BA.NumberToString(parent._codigolivro)+", "+parent.mostCurrent._b4xcombobox1._getselecteditem /*String*/ (null)+", '"+parent.mostCurrent._edtituloanotacao.getText()+"','"+parent.mostCurrent._edanotacao.getText()+"'";
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Wait For( banco.Insert_Consulta(cmd)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="ToastMessageShow(\"Tudo certo\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Tudo certo"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080221;
 //BA.debugLineNum = 3080221;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Algo deu errado!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080227;
 //BA.debugLineNum = 3080227;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolayanotacao", "btok_click"),(int) (400));
this.state = 24;
return;
case 24:
//C
this.state = 19;
;
RDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=3080231;
 //BA.debugLineNum = 3080231;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub edAnotacao_TextChanged (Old As String, New As";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="edAnotacao.Text = edAnotacao.Text.Replace(\"'\",\"\"";
mostCurrent._edanotacao.setText(BA.ObjectToCharSequence(mostCurrent._edanotacao.getText().replace("'","")));
 };
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="End Sub";
return "";
}
public static String  _edtituloanotacao_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtituloanotacao_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtituloanotacao_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub edTituloAnotacao_TextChanged (Old As String, N";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="edTituloAnotacao.Text = edTituloAnotacao.Text.Re";
mostCurrent._edtituloanotacao.setText(BA.ObjectToCharSequence(mostCurrent._edtituloanotacao.getText().replace("'","")));
 }else {
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
if ((mostCurrent._edtituloanotacao.getText().trim()).equals("")) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="SomeTituloAnotacao";
_sometituloanotacao();
 }else {
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="If verifica Then";
if (_verifica) { 
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="ApareceTituloAnotacao";
_aparecetituloanotacao();
 };
 };
 };
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="End Sub";
return "";
}
public static String  _sometituloanotacao() throws Exception{
RDebugUtils.currentModule="codigolayanotacao";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sometituloanotacao", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sometituloanotacao", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub SomeTituloAnotacao";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="verifica = True";
_verifica = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="lblTituloAnotacao.SetTextColorAnimated(600, Color";
mostCurrent._lbltituloanotacao.SetTextColorAnimated((int) (600),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="lblTituloAnotacao.SetLayoutAnimated(900, (panel_a";
mostCurrent._lbltituloanotacao.SetLayoutAnimated((int) (900),(int) ((mostCurrent._panel_anotacao.getWidth()-mostCurrent._lbltituloanotacao.getWidth())/(double)2),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),(int) (mostCurrent._panel_anotacao.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (3),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3.2),mostCurrent.activityBA));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
}