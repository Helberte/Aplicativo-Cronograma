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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigocadastrolivro");
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
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
String _dia = "";
String _mes = "";
String _ano = "";
 //BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"LayCadastroLivro\")";
mostCurrent._activity.LoadLayout("LayCadastroLivro",mostCurrent.activityBA);
 //BA.debugLineNum = 43;BA.debugLine="Main.fotos.Initialize(\"ContentChooser\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Initialize("ContentChooser");
 //BA.debugLineNum = 45;BA.debugLine="edTituloLivro.RequestFocus";
mostCurrent._edtitulolivro.RequestFocus();
 //BA.debugLineNum = 46;BA.debugLine="radPagina.Checked = True";
mostCurrent._radpagina.setChecked(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 48;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
 //BA.debugLineNum = 49;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por di";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 //BA.debugLineNum = 50;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
 //BA.debugLineNum = 52;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
 //BA.debugLineNum = 54;BA.debugLine="dia = DateTime.Date(DateTime.Now).SubString2(3, 5";
_dia = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (3),(int) (5));
 //BA.debugLineNum = 55;BA.debugLine="mes = DateTime.Date(DateTime.Now).SubString2(0, 2";
_mes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (0),(int) (2));
 //BA.debugLineNum = 56;BA.debugLine="ano = DateTime.Date(DateTime.Now).SubString2(6, 1";
_ano = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()).substring((int) (6),(int) (10));
 //BA.debugLineNum = 58;BA.debugLine="hoje = \"Dia: \" & dia & \" / \" & mes & \" / \" & ano";
mostCurrent._hoje = "Dia: "+_dia+" / "+_mes+" / "+_ano;
 //BA.debugLineNum = 60;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
 //BA.debugLineNum = 62;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 64;BA.debugLine="B4XImageView1.ResizeMode = \"FILL\"";
mostCurrent._b4ximageview1._setresizemode /*String*/ ("FILL");
 //BA.debugLineNum = 65;BA.debugLine="B4XImageView1.Load(File.DirAssets, \"livro.jpg\")";
mostCurrent._b4ximageview1._load /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"livro.jpg");
 //BA.debugLineNum = 67;BA.debugLine="banco.Initialize";
mostCurrent._banco._initialize /*String*/ (processBA);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _btaddfoto_click() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub btAddFoto_Click";
 //BA.debugLineNum = 176;BA.debugLine="Try";
try { //BA.debugLineNum = 177;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
mostCurrent._main._fotos /*anywheresoftware.b4a.phone.Phone.ContentChooser*/ .Show(processBA,"image/*","Choose image");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4); //BA.debugLineNum = 179;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha!"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public static String  _btcancelar_click() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub btCancelar_Click";
 //BA.debugLineNum = 207;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._codigolayleituras.getObject()));
 //BA.debugLineNum = 208;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static void  _btsalvar_click() throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 212;BA.debugLine="Dim pag_ou_cap As String";
_pag_ou_cap = "";
 //BA.debugLineNum = 214;BA.debugLine="If edTituloLivro.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 46;
if ((parent.mostCurrent._edtitulolivro.getText().trim()).equals("")) { 
this.state = 3;
}else if((parent.mostCurrent._edautorlivro.getText().trim()).equals("")) { 
this.state = 5;
}else {
this.state = 7;
}if (true) break;

case 3:
//C
this.state = 46;
 //BA.debugLineNum = 215;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o título do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 //BA.debugLineNum = 216;BA.debugLine="edTituloLivro.RequestFocus";
parent.mostCurrent._edtitulolivro.RequestFocus();
 if (true) break;

case 5:
//C
this.state = 46;
 //BA.debugLineNum = 218;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?"),BA.ObjectToCharSequence("Calma..."),processBA);
 //BA.debugLineNum = 219;BA.debugLine="edAutorLivro.RequestFocus";
parent.mostCurrent._edautorlivro.RequestFocus();
 if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 222;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
_pag_ou_cap = "Quantos capítulos";
 //BA.debugLineNum = 223;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
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
 //BA.debugLineNum = 225;BA.debugLine="If edQuantPagOuCap.Text.Trim = \"\" Then";
if (true) break;

case 14:
//if
this.state = 45;
if ((parent.mostCurrent._edquantpagoucap.getText().trim()).equals("")) { 
this.state = 16;
}else if((parent.mostCurrent._edmeta.getText().trim()).equals("")) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 16:
//C
this.state = 45;
 //BA.debugLineNum = 226;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! "+_pag_ou_cap+" o livro tem?"),BA.ObjectToCharSequence("Calma..."),processBA);
 //BA.debugLineNum = 227;BA.debugLine="edQuantPagOuCap.RequestFocus";
parent.mostCurrent._edquantpagoucap.RequestFocus();
 if (true) break;

case 18:
//C
this.state = 45;
 //BA.debugLineNum = 231;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Opa! qual a sua meta diária?"),BA.ObjectToCharSequence("Calma..."),processBA);
 //BA.debugLineNum = 232;BA.debugLine="edMeta.RequestFocus";
parent.mostCurrent._edmeta.RequestFocus();
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 234;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
_meta = 0;
_quantidade_pag_cap = 0;
 //BA.debugLineNum = 236;BA.debugLine="meta = edMeta.Text";
_meta = (int)(Double.parseDouble(parent.mostCurrent._edmeta.getText()));
 //BA.debugLineNum = 237;BA.debugLine="quantidade_pag_cap = edQuantPagOuCap.Text";
_quantidade_pag_cap = (int)(Double.parseDouble(parent.mostCurrent._edquantpagoucap.getText()));
 //BA.debugLineNum = 239;BA.debugLine="If meta > quantidade_pag_cap Then";
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
 //BA.debugLineNum = 240;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Informações incoerentes"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 243;BA.debugLine="Try";
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
 //BA.debugLineNum = 244;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
_cmd = "";
_datainicial = "";
_tipoleitura = "";
 //BA.debugLineNum = 246;BA.debugLine="tipoLeitura = \"PAGINA\"";
_tipoleitura = "PAGINA";
 //BA.debugLineNum = 247;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"CA";
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
_tipoleitura = "CAPITULO";
if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 249;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
_datainicial = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 251;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edTitul";
_cmd = "exec sp_cad_livro_leitura '"+parent.mostCurrent._edtitulolivro.getText()+"', '"+parent.mostCurrent._edautorlivro.getText()+"', '"+BA.NumberToString(parent.mostCurrent._main._id_do_usuario /*int*/ )+"', '"+_datainicial+"', '"+_tipoleitura+"', '"+parent.mostCurrent._edquantpagoucap.getText()+"', '"+parent.mostCurrent._dataprevistafinal+"', '"+parent.mostCurrent._edmeta.getText()+"'";
 //BA.debugLineNum = 260;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._banco._insert_consulta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_cmd));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[0];
;
 //BA.debugLineNum = 262;BA.debugLine="Result.NextRow";
_result.NextRow();
 //BA.debugLineNum = 264;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
if (true) break;

case 35:
//if
this.state = 40;
if ((_result.GetString("RESULTADO")).equals(BA.NumberToString(1))) { 
this.state = 37;
}else if((_result.GetString("RESULTADO")).equals(BA.NumberToString(0))) { 
this.state = 39;
}if (true) break;

case 37:
//C
this.state = 40;
 //BA.debugLineNum = 266;BA.debugLine="cadastrou = True";
parent._cadastrou = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 267;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 268;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
 //BA.debugLineNum = 269;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
 //BA.debugLineNum = 270;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 274;BA.debugLine="cadastrou = False";
parent._cadastrou = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 275;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_result.GetString("MENSAGEM")),BA.ObjectToCharSequence("Ops!!"),processBA);
 //BA.debugLineNum = 276;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
 //BA.debugLineNum = 277;BA.debugLine="StartActivity(CodigoLayLeituras)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._codigolayleituras.getObject()));
 //BA.debugLineNum = 278;BA.debugLine="Activity.Finish";
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
 //BA.debugLineNum = 282;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
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
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
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
public static void  _complete(anywheresoftware.b4j.objects.SQL.ResultSetWrapper _result) throws Exception{
}
public static String  _contentchooser_result(boolean _success,String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub ContentChooser_Result (Success As Boolean, Dir";
 //BA.debugLineNum = 184;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 185;BA.debugLine="B4XImageView1.ResizeMode = \"FIT\"";
mostCurrent._b4ximageview1._setresizemode /*String*/ ("FIT");
 //BA.debugLineNum = 187;BA.debugLine="B4XImageView1.Load(Dir, FileName)";
mostCurrent._b4ximageview1._load /*String*/ (_dir,_filename);
 //BA.debugLineNum = 188;BA.debugLine="lblFotoLivro.Visible = False";
mostCurrent._lblfotolivro.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 190;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Nenhuma foto escolhida"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public static String  _edautorlivro_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub edAutorLivro_TextChanged (Old As String, New A";
 //BA.debugLineNum = 201;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
 //BA.debugLineNum = 202;BA.debugLine="edAutorLivro.Text = edAutorLivro.Text.Replace(\"'";
mostCurrent._edautorlivro.setText(BA.ObjectToCharSequence(mostCurrent._edautorlivro.getText().replace("'","")));
 };
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static String  _edmeta_textchanged(String _old,String _new) throws Exception{
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
String _dia = "";
String _mes = "";
String _ano = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub edMeta_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 97;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
if ((mostCurrent._edmeta.getText().trim()).equals("") == false) { 
 //BA.debugLineNum = 99;BA.debugLine="Dim meta As Int = New";
_meta = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 100;BA.debugLine="Dim total As Int";
_total = 0;
 //BA.debugLineNum = 101;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
 //BA.debugLineNum = 103;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edquantpagoucap.getText().trim()).equals("") == false) { 
 //BA.debugLineNum = 105;BA.debugLine="quantPag = edQuantPagOuCap.Text";
_quantpag = (int)(Double.parseDouble(mostCurrent._edquantpagoucap.getText()));
 //BA.debugLineNum = 107;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
 //BA.debugLineNum = 109;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 110;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
 //BA.debugLineNum = 112;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
 //BA.debugLineNum = 114;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
 //BA.debugLineNum = 116;BA.debugLine="dia = data.SubString2(3,5)";
_dia = _data.substring((int) (3),(int) (5));
 //BA.debugLineNum = 117;BA.debugLine="mes = data.SubString2(0,2)";
_mes = _data.substring((int) (0),(int) (2));
 //BA.debugLineNum = 118;BA.debugLine="ano = data.SubString2(6,10)";
_ano = _data.substring((int) (6),(int) (10));
 //BA.debugLineNum = 120;BA.debugLine="dataPrevistaFinal = dia & \"/\" & mes & \"/\" & ano";
mostCurrent._dataprevistafinal = _dia+"/"+_mes+"/"+_ano;
 //BA.debugLineNum = 122;BA.debugLine="lblPrevisao.Text = \"Dia: \" & dia & \" / \" & mes";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence("Dia: "+_dia+" / "+_mes+" / "+_ano));
 }else {
 //BA.debugLineNum = 124;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
 //BA.debugLineNum = 125;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
 //BA.debugLineNum = 129;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
 //BA.debugLineNum = 130;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _edquantpagoucap_textchanged(String _old,String _new) throws Exception{
int _meta = 0;
int _total = 0;
int _quantpag = 0;
String _data = "";
String _dia = "";
String _mes = "";
String _ano = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub edQuantPagOuCap_TextChanged (Old As String, Ne";
 //BA.debugLineNum = 136;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
if ((mostCurrent._edmeta.getText().trim()).equals("") == false) { 
 //BA.debugLineNum = 138;BA.debugLine="Dim meta As Int";
_meta = 0;
 //BA.debugLineNum = 139;BA.debugLine="meta = edMeta.Text";
_meta = (int)(Double.parseDouble(mostCurrent._edmeta.getText()));
 //BA.debugLineNum = 141;BA.debugLine="Dim total As Int";
_total = 0;
 //BA.debugLineNum = 142;BA.debugLine="Dim quantPag As Int";
_quantpag = 0;
 //BA.debugLineNum = 144;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
if ((mostCurrent._edquantpagoucap.getText().trim()).equals("") == false) { 
 //BA.debugLineNum = 146;BA.debugLine="quantPag = New";
_quantpag = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 148;BA.debugLine="total = quantPag  / meta";
_total = (int) (_quantpag/(double)_meta);
 //BA.debugLineNum = 150;BA.debugLine="lblQuantidadeDias.Visible = True";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 151;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
mostCurrent._lblquantidadedias.setText(BA.ObjectToCharSequence("Total de dias: "+BA.NumberToString(_total)));
 //BA.debugLineNum = 153;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
_data = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),_total));
 //BA.debugLineNum = 155;BA.debugLine="Dim dia, mes, ano As String";
_dia = "";
_mes = "";
_ano = "";
 //BA.debugLineNum = 157;BA.debugLine="dia = data.SubString2(3,5)";
_dia = _data.substring((int) (3),(int) (5));
 //BA.debugLineNum = 158;BA.debugLine="mes = data.SubString2(0,2)";
_mes = _data.substring((int) (0),(int) (2));
 //BA.debugLineNum = 159;BA.debugLine="ano = data.SubString2(6,10)";
_ano = _data.substring((int) (6),(int) (10));
 //BA.debugLineNum = 161;BA.debugLine="dataPrevistaFinal = dia & \"/\" & mes & \"/\" & ano";
mostCurrent._dataprevistafinal = _dia+"/"+_mes+"/"+_ano;
 //BA.debugLineNum = 163;BA.debugLine="lblPrevisao.Text = \"Dia: \" & dia & \" / \" & mes";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence("Dia: "+_dia+" / "+_mes+" / "+_ano));
 }else {
 //BA.debugLineNum = 165;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
 //BA.debugLineNum = 166;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
 //BA.debugLineNum = 170;BA.debugLine="lblPrevisao.Text = hoje";
mostCurrent._lblprevisao.setText(BA.ObjectToCharSequence(mostCurrent._hoje));
 //BA.debugLineNum = 171;BA.debugLine="lblQuantidadeDias.Visible = False";
mostCurrent._lblquantidadedias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _edtitulolivro_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub edTituloLivro_TextChanged (Old As String, New";
 //BA.debugLineNum = 195;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
if (_new.indexOf("'")>=0) { 
 //BA.debugLineNum = 196;BA.debugLine="edTituloLivro.Text = edTituloLivro.Text.Replace(";
mostCurrent._edtitulolivro.setText(BA.ObjectToCharSequence(mostCurrent._edtitulolivro.getText().replace("'","")));
 };
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private edTituloLivro As EditText";
mostCurrent._edtitulolivro = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private radPagina As RadioButton";
mostCurrent._radpagina = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private radCapitulo As RadioButton";
mostCurrent._radcapitulo = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private edQuantPagOuCap As EditText";
mostCurrent._edquantpagoucap = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblMeta As Label";
mostCurrent._lblmeta = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private edMeta As EditText";
mostCurrent._edmeta = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private hoje As String";
mostCurrent._hoje = "";
 //BA.debugLineNum = 28;BA.debugLine="Private lblPrevisao As Label";
mostCurrent._lblprevisao = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblQuantidadeDias As Label";
mostCurrent._lblquantidadedias = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private btAddFoto As Button";
mostCurrent._btaddfoto = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private B4XImageView1 As B4XImageView";
mostCurrent._b4ximageview1 = new b4a.example.b4ximageview();
 //BA.debugLineNum = 32;BA.debugLine="Private lblFotoLivro As Label";
mostCurrent._lblfotolivro = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private edAutorLivro As EditText";
mostCurrent._edautorlivro = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private dataPrevistaFinal As String";
mostCurrent._dataprevistafinal = "";
 //BA.debugLineNum = 36;BA.debugLine="Private banco As ClassBancoDados";
mostCurrent._banco = new b4a.example.classbancodados();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public cadastrou As Boolean = False";
_cadastrou = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _radcapitulo_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 84;BA.debugLine="If Checked Then";
if (_checked) { 
 //BA.debugLineNum = 85;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
mostCurrent._edquantpagoucap.setHint("Quantidade capítulos");
 //BA.debugLineNum = 86;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 //BA.debugLineNum = 87;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
mostCurrent._edmeta.setHint("Quantidade de capítulos");
 }else {
 //BA.debugLineNum = 89;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
 //BA.debugLineNum = 90;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 //BA.debugLineNum = 91;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static String  _radpagina_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 72;BA.debugLine="If Checked Then";
if (_checked) { 
 //BA.debugLineNum = 73;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
mostCurrent._edquantpagoucap.setHint("Quantidade páginas");
 //BA.debugLineNum = 74;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 //BA.debugLineNum = 75;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
mostCurrent._edmeta.setHint("Quantidade de páginas");
 }else {
 //BA.debugLineNum = 77;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
mostCurrent._edquantpagoucap.setHint("Quantidade capítulos");
 //BA.debugLineNum = 78;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
mostCurrent._lblmeta.setText(BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 //BA.debugLineNum = 79;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
mostCurrent._edmeta.setHint("Quantidade de capítulos");
 };
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
}
