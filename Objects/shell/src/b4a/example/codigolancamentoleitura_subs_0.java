package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolancamentoleitura_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolancamentoleitura) ","codigolancamentoleitura",8,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"Lay_lancamento_leitura\")";
Debug.ShouldStop(16777216);
codigolancamentoleitura.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_lancamento_leitura")),codigolancamentoleitura.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="b4XImageViewFoto.ResizeMode = \"FILL\"";
Debug.ShouldStop(134217728);
codigolancamentoleitura.mostCurrent._b4ximageviewfoto.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL"));
 BA.debugLineNum = 29;BA.debugLine="b4XImageViewFoto.Load(File.DirAssets, \"livro.jpg\"";
Debug.ShouldStop(268435456);
codigolancamentoleitura.mostCurrent._b4ximageviewfoto.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(codigolancamentoleitura.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("livro.jpg")));
 BA.debugLineNum = 31;BA.debugLine="lblTituloLivro.Text = tituloLivro";
Debug.ShouldStop(1073741824);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runMethod(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._titulolivro));
 BA.debugLineNum = 32;BA.debugLine="lblNomeUsuario.Text = nomeUsuario";
Debug.ShouldStop(-2147483648);
codigolancamentoleitura.mostCurrent._lblnomeusuario.runMethod(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._nomeusuario));
 BA.debugLineNum = 33;BA.debugLine="edPaginaAtual.Text = paginaAtual";
Debug.ShouldStop(1);
codigolancamentoleitura.mostCurrent._edpaginaatual.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._paginaatual));
 BA.debugLineNum = 34;BA.debugLine="edTotalPaginas.Text = totalPaginas";
Debug.ShouldStop(2);
codigolancamentoleitura.mostCurrent._edtotalpaginas.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._totalpaginas));
 BA.debugLineNum = 36;BA.debugLine="edPaginaAtual.RequestFocus";
Debug.ShouldStop(8);
codigolancamentoleitura.mostCurrent._edpaginaatual.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (codigolancamentoleitura) ","codigolancamentoleitura",8,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigolancamentoleitura) ","codigolancamentoleitura",8,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btcancelar_click() throws Exception{
try {
		Debug.PushSubsStack("btCancelar_Click (codigolancamentoleitura) ","codigolancamentoleitura",8,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,49);
if (RapidSub.canDelegate("btcancelar_click")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","btcancelar_click");}
 BA.debugLineNum = 49;BA.debugLine="Sub btCancelar_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btok_click() throws Exception{
try {
		Debug.PushSubsStack("btOk_Click (codigolancamentoleitura) ","codigolancamentoleitura",8,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,53);
if (RapidSub.canDelegate("btok_click")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","btok_click");}
 BA.debugLineNum = 53;BA.debugLine="Sub btOk_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private lblTituloLivro As Label";
codigolancamentoleitura.mostCurrent._lbltitulolivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private lblNomeUsuario As Label";
codigolancamentoleitura.mostCurrent._lblnomeusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private edPaginaAtual As EditText";
codigolancamentoleitura.mostCurrent._edpaginaatual = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edTotalPaginas As EditText";
codigolancamentoleitura.mostCurrent._edtotalpaginas = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblPorcentagem As Label";
codigolancamentoleitura.mostCurrent._lblporcentagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private b4XImageViewFoto As B4XImageView";
codigolancamentoleitura.mostCurrent._b4ximageviewfoto = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public tituloLivro As String";
codigolancamentoleitura._titulolivro = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public nomeUsuario As String";
codigolancamentoleitura._nomeusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Public paginaAtual As Int";
codigolancamentoleitura._paginaatual = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Public totalPaginas As Int";
codigolancamentoleitura._totalpaginas = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}