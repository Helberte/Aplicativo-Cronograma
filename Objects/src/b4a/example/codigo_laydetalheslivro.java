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

public class codigo_laydetalheslivro extends Activity implements B4AActivity{
	public static codigo_laydetalheslivro mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.codigo_laydetalheslivro");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (codigo_laydetalheslivro).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.codigo_laydetalheslivro");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.codigo_laydetalheslivro", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (codigo_laydetalheslivro) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (codigo_laydetalheslivro) Resume **");
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
		return codigo_laydetalheslivro.class;
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
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Pause event (activity is not paused). **");
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
            codigo_laydetalheslivro mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (codigo_laydetalheslivro) Resume **");
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


public static class _dimensoes{
public boolean IsInitialized;
public int esquerda;
public int topo;
public int tamanho;
public void Initialize() {
IsInitialized = true;
esquerda = 0;
topo = 0;
tamanho = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dm_labels{
public boolean IsInitialized;
public int topo;
public void Initialize() {
IsInitialized = true;
topo = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bt_voltar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_cabecalho = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrol = null;
public anywheresoftware.b4a.objects.PanelWrapper _painel_imagem = null;
public b4a.example.codigo_laydetalheslivro._dm_labels _lbl = null;
public b4a.example.codigo_laydetalheslivro._dimensoes _dm = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _gradient = null;
public static int[] _cores = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _botoes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_usuario = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_livro = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.modulo_funcoes _modulo_funcoes = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _largura = 0;
int _esquerda = 0;
int _i = 0;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Activity.LoadLayout(\"Lay_detalhes_leituras\")";
mostCurrent._activity.LoadLayout("Lay_detalhes_leituras",mostCurrent.activityBA);
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="bt_voltar.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._bt_voltar.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bt_voltar.png").getObject()));
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="painel_imagem.Initialize( \"\" )";
mostCurrent._painel_imagem.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="lbl_livro.Initialize(\"\")";
mostCurrent._lbl_livro.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="lbl_usuario.Initialize(\"\")";
mostCurrent._lbl_usuario.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=26214408;
 //BA.debugLineNum = 26214408;BA.debugLine="dm.Initialize";
mostCurrent._dm.Initialize();
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="lbl.Initialize";
mostCurrent._lbl.Initialize();
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="dm.esquerda = 1%x";
mostCurrent._dm.esquerda /*int*/  = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=26214412;
 //BA.debugLineNum = 26214412;BA.debugLine="dm.tamanho = 98%x";
mostCurrent._dm.tamanho /*int*/  = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (98),mostCurrent.activityBA);
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="dm.topo = 1%y";
mostCurrent._dm.topo /*int*/  = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=26214415;
 //BA.debugLineNum = 26214415;BA.debugLine="cores(0) = Colors.Cyan";
_cores[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.Cyan;
RDebugUtils.currentLine=26214416;
 //BA.debugLineNum = 26214416;BA.debugLine="cores(1) = Colors.Cyan";
_cores[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.Cyan;
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
mostCurrent._gradient.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_cores);
RDebugUtils.currentLine=26214418;
 //BA.debugLineNum = 26214418;BA.debugLine="gradient.CornerRadius = 60";
mostCurrent._gradient.setCornerRadius((float) (60));
RDebugUtils.currentLine=26214421;
 //BA.debugLineNum = 26214421;BA.debugLine="painel_imagem.Color = Colors.Cyan";
mostCurrent._painel_imagem.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=26214423;
 //BA.debugLineNum = 26214423;BA.debugLine="scrol.Panel.AddView(painel_imagem, dm.esquerda, d";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._painel_imagem.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=26214424;
 //BA.debugLineNum = 26214424;BA.debugLine="painel_imagem.LoadLayout(\"Lay_imagem_tela_detalhe";
mostCurrent._painel_imagem.LoadLayout("Lay_imagem_tela_detalhes",mostCurrent.activityBA);
RDebugUtils.currentLine=26214426;
 //BA.debugLineNum = 26214426;BA.debugLine="lbl_livro = Configura_label(\"Helberte costa\", Col";
mostCurrent._lbl_livro = _configura_label("Helberte costa",anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (13),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=26214427;
 //BA.debugLineNum = 26214427;BA.debugLine="lbl_usuario = Configura_label(\"As cronicas\", Colo";
mostCurrent._lbl_usuario = _configura_label("As cronicas",anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (13),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=26214429;
 //BA.debugLineNum = 26214429;BA.debugLine="lbl_livro.Gravity = Gravity.CENTER";
mostCurrent._lbl_livro.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=26214430;
 //BA.debugLineNum = 26214430;BA.debugLine="lbl_usuario.Gravity = Gravity.CENTER";
mostCurrent._lbl_usuario.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=26214432;
 //BA.debugLineNum = 26214432;BA.debugLine="dm.topo = dm.topo + painel_imagem.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._painel_imagem.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=26214433;
 //BA.debugLineNum = 26214433;BA.debugLine="scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.to";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbl_livro.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=26214435;
 //BA.debugLineNum = 26214435;BA.debugLine="dm.topo = dm.topo + lbl_livro.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._lbl_livro.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=26214436;
 //BA.debugLineNum = 26214436;BA.debugLine="scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._lbl_usuario.getObject()),mostCurrent._dm.esquerda /*int*/ ,mostCurrent._dm.topo /*int*/ ,mostCurrent._dm.tamanho /*int*/ ,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA));
RDebugUtils.currentLine=26214438;
 //BA.debugLineNum = 26214438;BA.debugLine="dm.topo = dm.topo + lbl_usuario.Height + 1dip";
mostCurrent._dm.topo /*int*/  = (int) (mostCurrent._dm.topo /*int*/ +mostCurrent._lbl_usuario.getHeight()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=26214440;
 //BA.debugLineNum = 26214440;BA.debugLine="Dim largura As Int = 17%x";
_largura = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (17),mostCurrent.activityBA);
RDebugUtils.currentLine=26214442;
 //BA.debugLineNum = 26214442;BA.debugLine="Dim esquerda As Int = 1.5%x";
_esquerda = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1.5),mostCurrent.activityBA);
RDebugUtils.currentLine=26214444;
 //BA.debugLineNum = 26214444;BA.debugLine="esquerda = (100%x -((esquerda * 4) + (largura * 5";
_esquerda = (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-((_esquerda*4)+(_largura*5)))/(double)2);
RDebugUtils.currentLine=26214446;
 //BA.debugLineNum = 26214446;BA.debugLine="For i = 0 To botoes.Length - 1";
{
final int step30 = 1;
final int limit30 = (int) (mostCurrent._botoes.length-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=26214448;
 //BA.debugLineNum = 26214448;BA.debugLine="botoes(i).Initialize(\"Event_botoes\")";
mostCurrent._botoes[_i].Initialize(mostCurrent.activityBA,"Event_botoes");
RDebugUtils.currentLine=26214449;
 //BA.debugLineNum = 26214449;BA.debugLine="botoes(i).Color = Colors.Cyan";
mostCurrent._botoes[_i].setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=26214450;
 //BA.debugLineNum = 26214450;BA.debugLine="botoes(i).Background = gradient";
mostCurrent._botoes[_i].setBackground((android.graphics.drawable.Drawable)(mostCurrent._gradient.getObject()));
RDebugUtils.currentLine=26214452;
 //BA.debugLineNum = 26214452;BA.debugLine="scrol.Panel.AddView(botoes(i), esquerda, dm.topo";
mostCurrent._scrol.getPanel().AddView((android.view.View)(mostCurrent._botoes[_i].getObject()),_esquerda,mostCurrent._dm.topo /*int*/ ,_largura,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=26214454;
 //BA.debugLineNum = 26214454;BA.debugLine="esquerda = esquerda + botoes(i).Width + 1.5%x";
_esquerda = (int) (_esquerda+mostCurrent._botoes[_i].getWidth()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1.5),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=26214458;
 //BA.debugLineNum = 26214458;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _configura_label(String _texto,int _cor_fundo,int _fonte,int _cor_texto) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "configura_label", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(mostCurrent.activityBA, "configura_label", new Object[] {_texto,_cor_fundo,_fonte,_cor_texto}));}
anywheresoftware.b4a.objects.LabelWrapper _label = null;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Sub Configura_label(texto As String, cor_fundo As";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim label As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="label.Initialize(\"\")";
_label.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="label.Text = texto";
_label.setText(BA.ObjectToCharSequence(_texto));
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="label.Color = cor_fundo";
_label.setColor(_cor_fundo);
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="label.TextSize = fonte";
_label.setTextSize((float) (_fonte));
RDebugUtils.currentLine=27590664;
 //BA.debugLineNum = 27590664;BA.debugLine="label.TextColor = cor_texto";
_label.setTextColor(_cor_texto);
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="Return label";
if (true) return _label;
RDebugUtils.currentLine=27590667;
 //BA.debugLineNum = 27590667;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="End Sub";
return "";
}
public static String  _bt_voltar_click() throws Exception{
RDebugUtils.currentModule="codigo_laydetalheslivro";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bt_voltar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bt_voltar_click", null));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Sub bt_voltar_Click";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return "";
}
}