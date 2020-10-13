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

public class codigolancamentoleitura extends Activity implements B4AActivity{
	public static codigolancamentoleitura mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigolancamentoleitura");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigolancamentoleitura).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigolancamentoleitura");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigolancamentoleitura", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigolancamentoleitura) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigolancamentoleitura) Resume **");
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
		return codigolancamentoleitura.class;
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
            BA.LogInfo("** Activity (codigolancamentoleitura) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigolancamentoleitura) Pause event (activity is not paused). **");
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
            codigolancamentoleitura mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigolancamentoleitura) Resume **");
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
public static String _titulolivro = "";
public static String _nomeusuario = "";
public static int _paginaatual = 0;
public static int _totalpaginas = 0;
public static int _meta = 0;
public static int _idlivro = 0;
public static String _tipoleitura = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbltitulolivro = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnomeusuario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edpaginaatual = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtotalpaginas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblporcentagem = null;
public b4a.example.b4ximageview _b4ximageviewfoto = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblivalido = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpaginaatual = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprevisaoporcentagem = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btok = null;
public b4a.example.classbancodados _banco = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalpaginas = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _p = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Activity.LoadLayout(\"Lay_lancamento_leitura\")";
mostCurrent._activity.LoadLayout("Lay_lancamento_leitura",mostCurrent.activityBA);
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="b4XImageViewFoto.ResizeMode = \"FILL\"";
mostCurrent._b4ximageviewfoto._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="b4XImageViewFoto.Load(File.DirAssets, \"livro.jpg\"";
mostCurrent._b4ximageviewfoto._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="lblTituloLivro.Text = tituloLivro";
mostCurrent._lbltitulolivro.setText(BA.ObjectToCharSequence(_titulolivro));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="lblNomeUsuario.Text = nomeUsuario";
mostCurrent._lblnomeusuario.setText(BA.ObjectToCharSequence(_nomeusuario));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="edPaginaAtual.Text = paginaAtual + meta";
mostCurrent._edpaginaatual.setText(BA.ObjectToCharSequence(_paginaatual+_meta));
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="edTotalPaginas.Text = totalPaginas";
mostCurrent._edtotalpaginas.setText(BA.ObjectToCharSequence(_totalpaginas));
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="edPaginaAtual.RequestFocus";
mostCurrent._edpaginaatual.RequestFocus();
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="Dim p As Int";
_p = 0;
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="p = (paginaAtual * 100) / totalPaginas";
_p = (int) ((_paginaatual*100)/(double)_totalpaginas);
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="lblPorcentagem.Text = p & \" % Lidos\"";
mostCurrent._lblporcentagem.setText(BA.ObjectToCharSequence(BA.NumberToString(_p)+" % Lidos"));
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="p = ((paginaAtual + meta) * 100) / totalPaginas";
_p = (int) (((_paginaatual+_meta)*100)/(double)_totalpaginas);
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço \" &";
mostCurrent._lblprevisaoporcentagem.setText(BA.ObjectToCharSequence("Próximo avanço "+BA.NumberToString(_p)+"%"));
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="If tipoLeitura = \"capítulos\" Then";
if ((_tipoleitura).equals("capítulos")) { 
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="lblPaginaAtual.Text = \"Capítulo atual\"";
mostCurrent._lblpaginaatual.setText(BA.ObjectToCharSequence("Capítulo atual"));
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="lblTotalPaginas.Text = \"Total capítulos\"";
mostCurrent._lbltotalpaginas.setText(BA.ObjectToCharSequence("Total capítulos"));
 }else 
{RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="else if tipoLeitura = \"páginas\" Then";
if ((_tipoleitura).equals("páginas")) { 
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="lblPaginaAtual.Text = \"Página atual\"";
mostCurrent._lblpaginaatual.setText(BA.ObjectToCharSequence("Página atual"));
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="lblTotalPaginas.Text = \"Total páginas\"";
mostCurrent._lbltotalpaginas.setText(BA.ObjectToCharSequence("Total páginas"));
 }}
;
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public static String  _btcancelar_click() throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcancelar_click", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub btCancelar_Click";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public static void  _btok_click() throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btok_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btok_click", null); return;}
ResumableSub_btOk_Click rsub = new ResumableSub_btOk_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btOk_Click extends BA.ResumableSub {
public ResumableSub_btOk_Click(b4a.example.codigolancamentoleitura parent) {
this.parent = parent;
}
b4a.example.codigolancamentoleitura parent;
String _cmd = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Dim cmd As String";
_cmd = "";
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="cmd = \"exec sp_lancamento_leitura \" & Main.Id_do";
_cmd = "exec sp_lancamento_leitura "+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+", "+BA.NumberToString(parent._idlivro)+", "+parent.mostCurrent._edpaginaatual.getText()+"";
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolancamentoleitura", "btok_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_result.GetInt("RESULTADO")==1) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="Else if Result.GetInt(\"RESULTADO\") = 0 Then";
if (_result.GetInt("RESULTADO")==0) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="ToastMessageShow(\"Sucesso\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sucesso"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolancamentoleitura", "btok_click"),(int) (100));
this.state = 14;
return;
case 14:
//C
this.state = 9;
;
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigolancamentoleitura", "btok_click"),(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 9;
;
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="Main.CadastrouAlgo = True";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="ToastMessageShow(\"Há algo errado na atualização";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Há algo errado na atualização!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=5111834;
 //BA.debugLineNum = 5111834;BA.debugLine="ToastMessageShow(\"Há algo errado na atualização!";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Há algo errado na atualização!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="Main.CadastrouAlgo = False";
parent.mostCurrent._main._cadastroualgo /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5111836;
 //BA.debugLineNum = 5111836;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="End Sub";
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
public static String  _edpaginaatual_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigolancamentoleitura";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edpaginaatual_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edpaginaatual_textchanged", new Object[] {_old,_new}));}
int _valor = 0;
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub edPaginaAtual_TextChanged (Old As String, New";
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Dim valor As Int";
_valor = 0;
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="If New.Trim <> \"\" Then";
if ((_new.trim()).equals("") == false) { 
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="If New > totalPaginas Then";
if ((double)(Double.parseDouble(_new))>_totalpaginas) { 
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="lblIvalido.Visible = True";
mostCurrent._lblivalido.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="lblIvalido.Text = \"Inválido\"";
mostCurrent._lblivalido.setText(BA.ObjectToCharSequence("Inválido"));
RDebugUtils.currentLine=25165834;
 //BA.debugLineNum = 25165834;BA.debugLine="edPaginaAtual.TextColor = Colors.Red";
mostCurrent._edpaginaatual.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=25165835;
 //BA.debugLineNum = 25165835;BA.debugLine="lblPaginaAtual.Visible = False";
mostCurrent._lblpaginaatual.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25165836;
 //BA.debugLineNum = 25165836;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço 0";
mostCurrent._lblprevisaoporcentagem.setText(BA.ObjectToCharSequence("Próximo avanço 0%"));
RDebugUtils.currentLine=25165837;
 //BA.debugLineNum = 25165837;BA.debugLine="btOk.Enabled = False";
mostCurrent._btok.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=25165839;
 //BA.debugLineNum = 25165839;BA.debugLine="edPaginaAtual.TextColor = Colors.RGB(46,16,16)";
mostCurrent._edpaginaatual.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (46),(int) (16),(int) (16)));
RDebugUtils.currentLine=25165840;
 //BA.debugLineNum = 25165840;BA.debugLine="lblIvalido.Visible = False";
mostCurrent._lblivalido.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25165841;
 //BA.debugLineNum = 25165841;BA.debugLine="lblIvalido.Text = \"Inválido\"";
mostCurrent._lblivalido.setText(BA.ObjectToCharSequence("Inválido"));
RDebugUtils.currentLine=25165843;
 //BA.debugLineNum = 25165843;BA.debugLine="lblPaginaAtual.Visible = True";
mostCurrent._lblpaginaatual.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25165844;
 //BA.debugLineNum = 25165844;BA.debugLine="valor = ((New * 100) / totalPaginas)";
_valor = (int) ((((double)(Double.parseDouble(_new))*100)/(double)_totalpaginas));
RDebugUtils.currentLine=25165845;
 //BA.debugLineNum = 25165845;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço \"";
mostCurrent._lblprevisaoporcentagem.setText(BA.ObjectToCharSequence("Próximo avanço "+BA.NumberToString(_valor)+"%"));
RDebugUtils.currentLine=25165846;
 //BA.debugLineNum = 25165846;BA.debugLine="btOk.Enabled = True";
mostCurrent._btok.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
RDebugUtils.currentLine=25165849;
 //BA.debugLineNum = 25165849;BA.debugLine="lblPaginaAtual.Visible = False";
mostCurrent._lblpaginaatual.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25165850;
 //BA.debugLineNum = 25165850;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço 0%";
mostCurrent._lblprevisaoporcentagem.setText(BA.ObjectToCharSequence("Próximo avanço 0%"));
RDebugUtils.currentLine=25165851;
 //BA.debugLineNum = 25165851;BA.debugLine="lblIvalido.Visible = True";
mostCurrent._lblivalido.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25165852;
 //BA.debugLineNum = 25165852;BA.debugLine="lblIvalido.Text = \"Obrigatório\"";
mostCurrent._lblivalido.setText(BA.ObjectToCharSequence("Obrigatório"));
RDebugUtils.currentLine=25165853;
 //BA.debugLineNum = 25165853;BA.debugLine="btOk.Enabled = False";
mostCurrent._btok.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=25165855;
 //BA.debugLineNum = 25165855;BA.debugLine="End Sub";
return "";
}
}