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

public class codigocadastrolivro extends Activity implements B4AActivity{
	public static codigocadastrolivro mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigocadastrolivro");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigocadastrolivro).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigocadastrolivro");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigocadastrolivro", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigocadastrolivro) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigocadastrolivro) Resume **");
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
		return codigocadastrolivro.class;
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
            BA.LogInfo("** Activity (codigocadastrolivro) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigocadastrolivro) Pause event (activity is not paused). **");
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
            codigocadastrolivro mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigocadastrolivro) Resume **");
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
public static boolean _cadastrou = false;
public anywheresoftware.b4a.objects.EditTextWrapper _edtitulolivro = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radpagina = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radcapitulo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edquantpagoucap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmeta = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edmeta = null;
public static String _hoje = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblprevisao = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquantidadedias = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btaddfoto = null;
public b4a.example.b4ximageview _b4ximageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfotolivro = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edautorlivro = null;
public static String _dataprevistafinal = "";
public b4a.example.classbancodados _banco = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _dia = "";
String _mes = "";
String _ano = "";
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Activity.LoadLayout(\"LayCadastroLivro\")";
mostCurrent._activity.LoadLayout("LayCadastroLivro",mostCurrent.activityBA);
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Main.fotos.Initialize(\"ContentChooser\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("ContentChooser");
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="edTituloLivro.RequestFocus";
mostCurrent._edtitulolivro.RequestFocus();
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="radPagina.Checked = True";
mostCurrent._radpagina.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por di";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="dia = DateTime.Date(DateTime.Now).SubString2(3, 5";
_dia = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (3),(int) (5));
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="mes = DateTime.Date(DateTime.Now).SubString2(0, 2";
_mes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (0),(int) (2));
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="ano = DateTime.Date(DateTime.Now).SubString2(6, 1";
_ano = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (6),(int) (10));
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="hoje = \"Dia: \" & dia & \" / \" & mes & \" / \" & ano";
mostCurrent._hoje = "Dia: "+_dia+" / "+_mes+" / "+_ano;
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="B4XImageView1.ResizeMode = \"FILL\"";
mostCurrent._b4ximageview1._setresizemode /*String*/ (null,"FILL");
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="B4XImageView1.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4ximageview1._load /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=21364765;
 //BA.debugLineNum = 21364765;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return "";
}
public static String  _btaddfoto_click() throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btaddfoto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btaddfoto_click", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub btAddFoto_Click";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Try";
try {RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(processBA,"image/*","Choose image");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha!"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="End Sub";
return "";
}
public static String  _btcancelar_click() throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btcancelar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btcancelar_click", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub btCancelar_Click";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="End Sub";
return "";
}
public static void  _btsalvar_click() throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btsalvar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btsalvar_click", null); return;}
ResumableSub_btSalvar_Click rsub = new ResumableSub_btSalvar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btSalvar_Click extends BA.ResumableSub {
public ResumableSub_btSalvar_Click(b4a.example.codigocadastrolivro parent) {
this.parent = parent;
}
b4a.example.codigocadastrolivro parent;
String _pag_ou_cap = "";
int _meta = 0;
int _quantidade_pag_cap = 0;
String _cmd = "";
String _datainicial = "";
String _tipoleitura = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Dim pag_ou_cap As String";
_pag_ou_cap = "";
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="If edTituloLivro.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 46;
if ((parent.mostCurrent._edtitulolivro.getText().trim()).equals("")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Else If edAutorLivro.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edautorlivro.getText().trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 46;
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o título do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="edTituloLivro.RequestFocus";
parent.mostCurrent._edtitulolivro.RequestFocus();
 if (true) break;

case 5:
//C
this.state = 46;
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="edAutorLivro.RequestFocus";
parent.mostCurrent._edautorlivro.RequestFocus();
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
_pag_ou_cap = "Quantos capítulos";
RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
if (true) break;

case 8:
//if
this.state = 13;
if (parent.mostCurrent._radpagina.getChecked()) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_pag_ou_cap = "Quantas páginas";
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="If edQuantPagOuCap.Text.Trim = \"\" Then";
if (true) break;

case 14:
//if
this.state = 45;
if ((parent.mostCurrent._edquantpagoucap.getText().trim()).equals("")) { 
this.state = 16;
}else 
{RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="else If edMeta.Text.Trim = \"\" Then";
if ((parent.mostCurrent._edmeta.getText().trim()).equals("")) { 
this.state = 18;
}else {
this.state = 20;
}}
if (true) break;

case 16:
//C
this.state = 45;
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! "+_pag_ou_cap+" o livro tem?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=22020112;
 //BA.debugLineNum = 22020112;BA.debugLine="edQuantPagOuCap.RequestFocus";
parent.mostCurrent._edquantpagoucap.RequestFocus();
 if (true) break;

case 18:
//C
this.state = 45;
RDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual a sua meta diária?"),BA.ObjectToCharSequence("Calma..."),processBA);
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="edMeta.RequestFocus";
parent.mostCurrent._edmeta.RequestFocus();
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
_meta = 0;
_quantidade_pag_cap = 0;
RDebugUtils.currentLine=22020121;
 //BA.debugLineNum = 22020121;BA.debugLine="meta = edMeta.Text";
_meta = (int)(Double.parseDouble(parent.mostCurrent._edmeta.getText()));
RDebugUtils.currentLine=22020122;
 //BA.debugLineNum = 22020122;BA.debugLine="quantidade_pag_cap = edQuantPagOuCap.Text";
_quantidade_pag_cap = (int)(Double.parseDouble(parent.mostCurrent._edquantpagoucap.getText()));
RDebugUtils.currentLine=22020124;
 //BA.debugLineNum = 22020124;BA.debugLine="If meta > quantidade_pag_cap Then";
if (true) break;

case 21:
//if
this.state = 44;
if (_meta>_quantidade_pag_cap) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 44;
RDebugUtils.currentLine=22020125;
 //BA.debugLineNum = 22020125;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Informações incoerentes"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=22020128;
 //BA.debugLineNum = 22020128;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 43;
this.catchState = 42;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 42;
RDebugUtils.currentLine=22020129;
 //BA.debugLineNum = 22020129;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
_cmd = "";
_datainicial = "";
_tipoleitura = "";
RDebugUtils.currentLine=22020131;
 //BA.debugLineNum = 22020131;BA.debugLine="tipoLeitura = \"páginas\"";
_tipoleitura = "páginas";
RDebugUtils.currentLine=22020132;
 //BA.debugLineNum = 22020132;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"ca";
if (true) break;

case 29:
//if
this.state = 34;
if (parent.mostCurrent._radcapitulo.getChecked()) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_tipoleitura = "capítulos";
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=22020134;
 //BA.debugLineNum = 22020134;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
_datainicial = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=22020136;
 //BA.debugLineNum = 22020136;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edTitul";
_cmd = "exec sp_cad_livro_leitura '"+parent.mostCurrent._edtitulolivro.getText()+"', '"+parent.mostCurrent._edautorlivro.getText()+"', '"+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+"', '"+_datainicial+"', '"+_tipoleitura+"', '"+parent.mostCurrent._edquantpagoucap.getText()+"', '"+parent.mostCurrent._dataprevistafinal+"', '"+parent.mostCurrent._edmeta.getText()+"'";
RDebugUtils.currentLine=22020145;
 //BA.debugLineNum = 22020145;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastrolivro", "btsalvar_click"), parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_cmd));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
RDebugUtils.currentLine=22020147;
 //BA.debugLineNum = 22020147;BA.debugLine="Result.NextRow";
_result.NextRow();
RDebugUtils.currentLine=22020149;
 //BA.debugLineNum = 22020149;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
if (true) break;

case 35:
//if
this.state = 40;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 37;
}else 
{RDebugUtils.currentLine=22020157;
 //BA.debugLineNum = 22020157;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 The";
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 39;
}}
if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=22020151;
 //BA.debugLineNum = 22020151;BA.debugLine="cadastrou = True";
parent._cadastrou = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22020152;
 //BA.debugLineNum = 22020152;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22020153;
 //BA.debugLineNum = 22020153;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastrolivro", "btsalvar_click"),(int) (100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
RDebugUtils.currentLine=22020154;
 //BA.debugLineNum = 22020154;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=22020155;
 //BA.debugLineNum = 22020155;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=22020159;
 //BA.debugLineNum = 22020159;BA.debugLine="cadastrou = False";
parent._cadastrou = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22020160;
 //BA.debugLineNum = 22020160;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!!"),processBA);
RDebugUtils.currentLine=22020161;
 //BA.debugLineNum = 22020161;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "codigocadastrolivro", "btsalvar_click"),(int) (1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
RDebugUtils.currentLine=22020162;
 //BA.debugLineNum = 22020162;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
RDebugUtils.currentLine=22020163;
 //BA.debugLineNum = 22020163;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 40:
//C
this.state = 43;
;
 if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 0;
RDebugUtils.currentLine=22020167;
 //BA.debugLineNum = 22020167;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Problemas ao tentar estabelecer a conexão. "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA))),BA.ObjectToCharSequence("Atenção"),processBA);
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 0;
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=22020172;
 //BA.debugLineNum = 22020172;BA.debugLine="End Sub";
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
public static String  _contentchooser_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentchooser_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentchooser_result", new Object[] {_success,_dir,_filename}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub ContentChooser_Result (Success As Boolean, Dir";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="B4XImageView1.ResizeMode = \"FIT\"";
mostCurrent._b4ximageview1._setresizemode /*String*/ (null,"FIT");
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="B4XImageView1.Load(Dir, FileName)";
mostCurrent._b4ximageview1._load /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="lblFotoLivro.Visible = False";
mostCurrent._lblfotolivro.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Nenhuma foto escolhida"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="End Sub";
return "";
}
public static String  _edautorlivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edautorlivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edautorlivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub edAutorLivro_TextChanged (Old As String, New A";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="edAutorLivro.Text = edAutorLivro.Text.Replace(\"'";
mostCurrent._edautorlivro.setText(BA.ObjectToCharSequence(mostCurrent._edautorlivro.getText().replace("'","")));
 };
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="End Sub";
return "";
}
public static String  _edmeta_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edmeta_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edmeta_textchanged", new Object[] {_old,_new}));}
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
String _dia = "";
String _mes = "";
String _ano = "";
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub edMeta_TextChanged (Old As String, New As Stri";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
if ((mostCurrent._edmeta.getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Dim meta As Int = New";
_meta = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edquantpagoucap.getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="quantPag = edQuantPagOuCap.Text";
_quantpag = (int)(Double.parseDouble(mostCurrent._edquantpagoucap.getText()));
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
RDebugUtils.currentLine=21561365;
 //BA.debugLineNum = 21561365;BA.debugLine="dia = data.SubString2(3,5)";
_dia = _data.substring((int) (3),(int) (5));
RDebugUtils.currentLine=21561366;
 //BA.debugLineNum = 21561366;BA.debugLine="mes = data.SubString2(0,2)";
_mes = _data.substring((int) (0),(int) (2));
RDebugUtils.currentLine=21561367;
 //BA.debugLineNum = 21561367;BA.debugLine="ano = data.SubString2(6,10)";
_ano = _data.substring((int) (6),(int) (10));
RDebugUtils.currentLine=21561369;
 //BA.debugLineNum = 21561369;BA.debugLine="dataPrevistaFinal = dia & \"/\" & mes & \"/\" & ano";
mostCurrent._dataprevistafinal = _dia+"/"+_mes+"/"+_ano;
RDebugUtils.currentLine=21561371;
 //BA.debugLineNum = 21561371;BA.debugLine="lblPrevisao.Text = \"Dia: \" & dia & \" / \" & mes";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence("Dia: "+_dia+" / "+_mes+" / "+_ano));
 }else {
RDebugUtils.currentLine=21561373;
 //BA.debugLineNum = 21561373;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=21561378;
 //BA.debugLineNum = 21561378;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21561379;
 //BA.debugLineNum = 21561379;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21561381;
 //BA.debugLineNum = 21561381;BA.debugLine="End Sub";
return "";
}
public static String  _edquantpagoucap_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edquantpagoucap_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edquantpagoucap_textchanged", new Object[] {_old,_new}));}
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
String _dia = "";
String _mes = "";
String _ano = "";
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub edQuantPagOuCap_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
if ((mostCurrent._edmeta.getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Dim meta As Int";
_meta = 0;
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="meta = edMeta.Text";
_meta = (int)(Double.parseDouble(mostCurrent._edmeta.getText()));
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Dim total As Int";
_total = 0;
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edquantpagoucap.getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="quantPag = New";
_quantpag = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
RDebugUtils.currentLine=21626896;
 //BA.debugLineNum = 21626896;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
RDebugUtils.currentLine=21626899;
 //BA.debugLineNum = 21626899;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
RDebugUtils.currentLine=21626903;
 //BA.debugLineNum = 21626903;BA.debugLine="dia = data.SubString2(3,5)";
_dia = _data.substring((int) (3),(int) (5));
RDebugUtils.currentLine=21626904;
 //BA.debugLineNum = 21626904;BA.debugLine="mes = data.SubString2(0,2)";
_mes = _data.substring((int) (0),(int) (2));
RDebugUtils.currentLine=21626905;
 //BA.debugLineNum = 21626905;BA.debugLine="ano = data.SubString2(6,10)";
_ano = _data.substring((int) (6),(int) (10));
RDebugUtils.currentLine=21626907;
 //BA.debugLineNum = 21626907;BA.debugLine="dataPrevistaFinal = dia & \"/\" & mes & \"/\" & ano";
mostCurrent._dataprevistafinal = _dia+"/"+_mes+"/"+_ano;
RDebugUtils.currentLine=21626909;
 //BA.debugLineNum = 21626909;BA.debugLine="lblPrevisao.Text = \"Dia: \" & dia & \" / \" & mes";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence("Dia: "+_dia+" / "+_mes+" / "+_ano));
 }else {
RDebugUtils.currentLine=21626911;
 //BA.debugLineNum = 21626911;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21626912;
 //BA.debugLineNum = 21626912;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=21626916;
 //BA.debugLineNum = 21626916;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
RDebugUtils.currentLine=21626917;
 //BA.debugLineNum = 21626917;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21626919;
 //BA.debugLineNum = 21626919;BA.debugLine="End Sub";
return "";
}
public static String  _edtitulolivro_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edtitulolivro_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edtitulolivro_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub edTituloLivro_TextChanged (Old As String, New";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="edTituloLivro.Text = edTituloLivro.Text.Replace(";
mostCurrent._edtitulolivro.setText(BA.ObjectToCharSequence(mostCurrent._edtitulolivro.getText().replace("'","")));
 };
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="End Sub";
return "";
}
public static String  _radcapitulo_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radcapitulo_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radcapitulo_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
mostCurrent._edquantpagoucap.setHint("Quantidade capítulos");
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
mostCurrent._edmeta.setHint("Quantidade de capítulos");
 }else {
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
 };
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="End Sub";
return "";
}
public static String  _radpagina_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="codigocadastrolivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "radpagina_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "radpagina_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
 }else {
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
mostCurrent._edquantpagoucap.setHint("Quantidade capítulos");
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
mostCurrent._edmeta.setHint("Quantidade de capítulos");
 };
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="End Sub";
return "";
}
}