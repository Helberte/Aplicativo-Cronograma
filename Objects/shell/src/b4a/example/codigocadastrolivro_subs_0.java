package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigocadastrolivro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="Activity.LoadLayout(\"LayCadastroLivro\")";
Debug.ShouldStop(512);
codigocadastrolivro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayCadastroLivro")),codigocadastrolivro.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="Main.fotos.Initialize(\"ContentChooser\")";
Debug.ShouldStop(2048);
codigocadastrolivro.mostCurrent._main._fotos /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("ContentChooser")));
 BA.debugLineNum = 46;BA.debugLine="edTituloLivro.RequestFocus";
Debug.ShouldStop(8192);
codigocadastrolivro.mostCurrent._edtitulolivro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 47;BA.debugLine="radPagina.Checked = True";
Debug.ShouldStop(16384);
codigocadastrolivro.mostCurrent._radpagina.runMethodAndSync(true,"setChecked",codigocadastrolivro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
Debug.ShouldStop(65536);
codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"setHint",BA.ObjectToString("Quantidade páginas"));
 BA.debugLineNum = 50;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por di";
Debug.ShouldStop(131072);
codigocadastrolivro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 BA.debugLineNum = 51;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
Debug.ShouldStop(262144);
codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"setHint",BA.ObjectToString("Quantidade de páginas"));
 BA.debugLineNum = 53;BA.debugLine="hoje = \"Dia: \" & DateTime.Date(DateTime.Now)";
Debug.ShouldStop(1048576);
codigocadastrolivro.mostCurrent._hoje = RemoteObject.concat(RemoteObject.createImmutable("Dia: "),codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 55;BA.debugLine="lblPrevisao.Text = hoje";
Debug.ShouldStop(4194304);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._hoje));
 BA.debugLineNum = 57;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(16777216);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="B4XImageView1.ResizeMode = \"FILL\"";
Debug.ShouldStop(67108864);
codigocadastrolivro.mostCurrent._b4ximageview1.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL"));
 BA.debugLineNum = 60;BA.debugLine="B4XImageView1.Load(File.DirAssets, \"livro.jpg\")";
Debug.ShouldStop(134217728);
codigocadastrolivro.mostCurrent._b4ximageview1.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("livro.jpg")));
 BA.debugLineNum = 62;BA.debugLine="banco.Initialize";
Debug.ShouldStop(536870912);
codigocadastrolivro.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigocadastrolivro.processBA);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,14);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 14;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,10);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","activity_resume");}
 BA.debugLineNum = 10;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btaddfoto_click() throws Exception{
try {
		Debug.PushSubsStack("btAddFoto_Click (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,158);
if (RapidSub.canDelegate("btaddfoto_click")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","btaddfoto_click");}
 BA.debugLineNum = 158;BA.debugLine="Sub btAddFoto_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 160;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
Debug.ShouldStop(-2147483648);
codigocadastrolivro.mostCurrent._main._fotos /*RemoteObject*/ .runVoidMethod ("Show",codigocadastrolivro.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Choose image")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigocadastrolivro.processBA, e4.toString()); BA.debugLineNum = 162;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
Debug.ShouldStop(2);
codigocadastrolivro.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Falha!")),(Object)(codigocadastrolivro.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btCancelar_Click (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,189);
if (RapidSub.canDelegate("btcancelar_click")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","btcancelar_click");}
 BA.debugLineNum = 189;BA.debugLine="Sub btCancelar_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(536870912);
codigocadastrolivro.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastrolivro.processBA,(Object)((codigocadastrolivro.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 191;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
codigocadastrolivro.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btsalvar_click() throws Exception{
try {
		Debug.PushSubsStack("btSalvar_Click (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,194);
if (RapidSub.canDelegate("btsalvar_click")) { b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","btsalvar_click"); return;}
ResumableSub_btSalvar_Click rsub = new ResumableSub_btSalvar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btSalvar_Click extends BA.ResumableSub {
public ResumableSub_btSalvar_Click(b4a.example.codigocadastrolivro parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigocadastrolivro parent;
RemoteObject _pag_ou_cap = RemoteObject.createImmutable("");
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _quantidade_pag_cap = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _datainicial = RemoteObject.createImmutable("");
RemoteObject _tipoleitura = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btSalvar_Click (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,194);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 195;BA.debugLine="Dim pag_ou_cap As String";
Debug.ShouldStop(4);
_pag_ou_cap = RemoteObject.createImmutable("");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
 BA.debugLineNum = 197;BA.debugLine="If edTituloLivro.Text.Trim = \"\" Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edtitulolivro.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 200;BA.debugLine="Else If edAutorLivro.Text.Trim = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edautorlivro.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 46;
 BA.debugLineNum = 198;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual o título do livro?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),codigocadastrolivro.processBA);
 BA.debugLineNum = 199;BA.debugLine="edTituloLivro.RequestFocus";
Debug.ShouldStop(64);
parent.mostCurrent._edtitulolivro.runVoidMethod ("RequestFocus");
 if (true) break;

case 5:
//C
this.state = 46;
 BA.debugLineNum = 201;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),codigocadastrolivro.processBA);
 BA.debugLineNum = 202;BA.debugLine="edAutorLivro.RequestFocus";
Debug.ShouldStop(512);
parent.mostCurrent._edautorlivro.runVoidMethod ("RequestFocus");
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 205;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
Debug.ShouldStop(4096);
_pag_ou_cap = BA.ObjectToString("Quantos capítulos");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
 BA.debugLineNum = 206;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
Debug.ShouldStop(8192);
if (true) break;

case 8:
//if
this.state = 13;
if (parent.mostCurrent._radpagina.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_pag_ou_cap = BA.ObjectToString("Quantas páginas");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 208;BA.debugLine="If edQuantPagOuCap.Text.Trim = \"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 14:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edquantpagoucap.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 16;
}else 
{ BA.debugLineNum = 212;BA.debugLine="else If edMeta.Text.Trim = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edmeta.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 18;
}else {
this.state = 20;
}}
if (true) break;

case 16:
//C
this.state = 45;
 BA.debugLineNum = 209;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Opa! "),_pag_ou_cap,RemoteObject.createImmutable(" o livro tem?")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),codigocadastrolivro.processBA);
 BA.debugLineNum = 210;BA.debugLine="edQuantPagOuCap.RequestFocus";
Debug.ShouldStop(131072);
parent.mostCurrent._edquantpagoucap.runVoidMethod ("RequestFocus");
 if (true) break;

case 18:
//C
this.state = 45;
 BA.debugLineNum = 214;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual a sua meta diária?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),codigocadastrolivro.processBA);
 BA.debugLineNum = 215;BA.debugLine="edMeta.RequestFocus";
Debug.ShouldStop(4194304);
parent.mostCurrent._edmeta.runVoidMethod ("RequestFocus");
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 217;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
Debug.ShouldStop(16777216);
_meta = RemoteObject.createImmutable(0);Debug.locals.put("meta", _meta);
_quantidade_pag_cap = RemoteObject.createImmutable(0);Debug.locals.put("quantidade_pag_cap", _quantidade_pag_cap);
 BA.debugLineNum = 219;BA.debugLine="meta = edMeta.Text";
Debug.ShouldStop(67108864);
_meta = BA.numberCast(int.class, parent.mostCurrent._edmeta.runMethod(true,"getText"));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 220;BA.debugLine="quantidade_pag_cap = edQuantPagOuCap.Text";
Debug.ShouldStop(134217728);
_quantidade_pag_cap = BA.numberCast(int.class, parent.mostCurrent._edquantpagoucap.runMethod(true,"getText"));Debug.locals.put("quantidade_pag_cap", _quantidade_pag_cap);
 BA.debugLineNum = 222;BA.debugLine="If meta > quantidade_pag_cap Then";
Debug.ShouldStop(536870912);
if (true) break;

case 21:
//if
this.state = 44;
if (RemoteObject.solveBoolean(">",_meta,BA.numberCast(double.class, _quantidade_pag_cap))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 44;
 BA.debugLineNum = 223;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Informações incoerentes")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 226;BA.debugLine="Try";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 227;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
Debug.ShouldStop(4);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
_datainicial = RemoteObject.createImmutable("");Debug.locals.put("dataInicial", _datainicial);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 229;BA.debugLine="tipoLeitura = \"páginas\"";
Debug.ShouldStop(16);
_tipoleitura = BA.ObjectToString("páginas");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 230;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"ca";
Debug.ShouldStop(32);
if (true) break;

case 29:
//if
this.state = 34;
if (parent.mostCurrent._radcapitulo.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_tipoleitura = BA.ObjectToString("capítulos");Debug.locals.put("tipoLeitura", _tipoleitura);
if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 232;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(128);
_datainicial = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("dataInicial", _datainicial);
 BA.debugLineNum = 234;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edTitul";
Debug.ShouldStop(512);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_cad_livro_leitura '"),parent.mostCurrent._edtitulolivro.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edautorlivro.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable("', '"),_datainicial,RemoteObject.createImmutable("', '"),_tipoleitura,RemoteObject.createImmutable("', '"),parent.mostCurrent._edquantpagoucap.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._dataprevistafinal,RemoteObject.createImmutable("', '"),parent.mostCurrent._edmeta.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 243;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigocadastrolivro.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastrolivro", "btsalvar_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 245;BA.debugLine="Result.NextRow";
Debug.ShouldStop(1048576);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 247;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 35:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(1))) { 
this.state = 37;
}else 
{ BA.debugLineNum = 255;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 The";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 39;
}}
if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 249;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(16777216);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 250;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 251;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigocadastrolivro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastrolivro", "btsalvar_click"),BA.numberCast(int.class, 100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
 BA.debugLineNum = 252;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastrolivro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 253;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 257;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(1);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 258;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ops!!"))),codigocadastrolivro.processBA);
 BA.debugLineNum = 259;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigocadastrolivro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastrolivro", "btsalvar_click"),BA.numberCast(int.class, 1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
 BA.debugLineNum = 260;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastrolivro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 261;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 40:
//C
this.state = 43;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 0;
 BA.debugLineNum = 265;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas ao tentar estabelecer a conexão. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigocadastrolivro.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção"))),codigocadastrolivro.processBA);
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
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigocadastrolivro.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _contentchooser_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ContentChooser_Result (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,166);
if (RapidSub.canDelegate("contentchooser_result")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","contentchooser_result", _success, _dir, _filename);}
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 166;BA.debugLine="Sub ContentChooser_Result (Success As Boolean, Dir";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="If Success Then";
Debug.ShouldStop(64);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="B4XImageView1.ResizeMode = \"FIT\"";
Debug.ShouldStop(128);
codigocadastrolivro.mostCurrent._b4ximageview1.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FIT"));
 BA.debugLineNum = 170;BA.debugLine="B4XImageView1.Load(Dir, FileName)";
Debug.ShouldStop(512);
codigocadastrolivro.mostCurrent._b4ximageview1.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 171;BA.debugLine="lblFotoLivro.Visible = False";
Debug.ShouldStop(1024);
codigocadastrolivro.mostCurrent._lblfotolivro.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 173;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
Debug.ShouldStop(4096);
codigocadastrolivro.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nenhuma foto escolhida")),(Object)(codigocadastrolivro.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edautorlivro_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edAutorLivro_TextChanged (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,183);
if (RapidSub.canDelegate("edautorlivro_textchanged")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","edautorlivro_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 183;BA.debugLine="Sub edAutorLivro_TextChanged (Old As String, New A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 185;BA.debugLine="edAutorLivro.Text = edAutorLivro.Text.Replace(\"'";
Debug.ShouldStop(16777216);
codigocadastrolivro.mostCurrent._edautorlivro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._edautorlivro.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edmeta_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edMeta_TextChanged (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,90);
if (RapidSub.canDelegate("edmeta_textchanged")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","edmeta_textchanged", _old, _new);}
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _quantpag = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 90;BA.debugLine="Sub edMeta_TextChanged (Old As String, New As Stri";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 94;BA.debugLine="Dim meta As Int = New";
Debug.ShouldStop(536870912);
_meta = BA.numberCast(int.class, _new);Debug.locals.put("meta", _meta);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 95;BA.debugLine="Dim total As Int";
Debug.ShouldStop(1073741824);
_total = RemoteObject.createImmutable(0);Debug.locals.put("total", _total);
 BA.debugLineNum = 96;BA.debugLine="Dim quantPag As Int";
Debug.ShouldStop(-2147483648);
_quantpag = RemoteObject.createImmutable(0);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 98;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 100;BA.debugLine="quantPag = edQuantPagOuCap.Text";
Debug.ShouldStop(8);
_quantpag = BA.numberCast(int.class, codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"getText"));Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 102;BA.debugLine="total = quantPag  / meta";
Debug.ShouldStop(32);
_total = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_quantpag,_meta}, "/",0, 0));Debug.locals.put("total", _total);
 BA.debugLineNum = 104;BA.debugLine="lblQuantidadeDias.Visible = True";
Debug.ShouldStop(128);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
Debug.ShouldStop(256);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total de dias: "),_total)));
 BA.debugLineNum = 107;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
Debug.ShouldStop(1024);
_data = codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_total))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 109;BA.debugLine="dataPrevistaFinal = data";
Debug.ShouldStop(4096);
codigocadastrolivro.mostCurrent._dataprevistafinal = _data;
 BA.debugLineNum = 111;BA.debugLine="lblPrevisao.Text = data";
Debug.ShouldStop(16384);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(_data));
 }else {
 BA.debugLineNum = 113;BA.debugLine="lblPrevisao.Text = hoje";
Debug.ShouldStop(65536);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._hoje));
 BA.debugLineNum = 114;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(131072);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 118;BA.debugLine="lblPrevisao.Text = hoje";
Debug.ShouldStop(2097152);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._hoje));
 BA.debugLineNum = 119;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(4194304);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edquantpagoucap_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edQuantPagOuCap_TextChanged (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,123);
if (RapidSub.canDelegate("edquantpagoucap_textchanged")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","edquantpagoucap_textchanged", _old, _new);}
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _quantpag = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 123;BA.debugLine="Sub edQuantPagOuCap_TextChanged (Old As String, Ne";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="If edMeta.Text.Trim <> \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 127;BA.debugLine="Dim meta As Int";
Debug.ShouldStop(1073741824);
_meta = RemoteObject.createImmutable(0);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 128;BA.debugLine="meta = edMeta.Text";
Debug.ShouldStop(-2147483648);
_meta = BA.numberCast(int.class, codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"getText"));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 130;BA.debugLine="Dim total As Int";
Debug.ShouldStop(2);
_total = RemoteObject.createImmutable(0);Debug.locals.put("total", _total);
 BA.debugLineNum = 131;BA.debugLine="Dim quantPag As Int";
Debug.ShouldStop(4);
_quantpag = RemoteObject.createImmutable(0);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 133;BA.debugLine="If edQuantPagOuCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 135;BA.debugLine="quantPag = New";
Debug.ShouldStop(64);
_quantpag = BA.numberCast(int.class, _new);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 137;BA.debugLine="total = quantPag  / meta";
Debug.ShouldStop(256);
_total = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_quantpag,_meta}, "/",0, 0));Debug.locals.put("total", _total);
 BA.debugLineNum = 139;BA.debugLine="lblQuantidadeDias.Visible = True";
Debug.ShouldStop(1024);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
Debug.ShouldStop(2048);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total de dias: "),_total)));
 BA.debugLineNum = 142;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
Debug.ShouldStop(8192);
_data = codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_total))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 144;BA.debugLine="dataPrevistaFinal = data";
Debug.ShouldStop(32768);
codigocadastrolivro.mostCurrent._dataprevistafinal = _data;
 BA.debugLineNum = 146;BA.debugLine="lblPrevisao.Text = data";
Debug.ShouldStop(131072);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(_data));
 }else {
 BA.debugLineNum = 148;BA.debugLine="lblPrevisao.Text = hoje";
Debug.ShouldStop(524288);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._hoje));
 BA.debugLineNum = 149;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(1048576);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 153;BA.debugLine="lblPrevisao.Text = hoje";
Debug.ShouldStop(16777216);
codigocadastrolivro.mostCurrent._lblprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._hoje));
 BA.debugLineNum = 154;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(33554432);
codigocadastrolivro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",codigocadastrolivro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtitulolivro_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edTituloLivro_TextChanged (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,177);
if (RapidSub.canDelegate("edtitulolivro_textchanged")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","edtitulolivro_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 177;BA.debugLine="Sub edTituloLivro_TextChanged (Old As String, New";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 179;BA.debugLine="edTituloLivro.Text = edTituloLivro.Text.Replace(";
Debug.ShouldStop(262144);
codigocadastrolivro.mostCurrent._edtitulolivro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigocadastrolivro.mostCurrent._edtitulolivro.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private edTituloLivro As EditText";
codigocadastrolivro.mostCurrent._edtitulolivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private radPagina As RadioButton";
codigocadastrolivro.mostCurrent._radpagina = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private radCapitulo As RadioButton";
codigocadastrolivro.mostCurrent._radcapitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private edQuantPagOuCap As EditText";
codigocadastrolivro.mostCurrent._edquantpagoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblMeta As Label";
codigocadastrolivro.mostCurrent._lblmeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private edMeta As EditText";
codigocadastrolivro.mostCurrent._edmeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private hoje As String";
codigocadastrolivro.mostCurrent._hoje = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private lblPrevisao As Label";
codigocadastrolivro.mostCurrent._lblprevisao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblQuantidadeDias As Label";
codigocadastrolivro.mostCurrent._lblquantidadedias = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btAddFoto As Button";
codigocadastrolivro.mostCurrent._btaddfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private B4XImageView1 As B4XImageView";
codigocadastrolivro.mostCurrent._b4ximageview1 = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 32;BA.debugLine="Private lblFotoLivro As Label";
codigocadastrolivro.mostCurrent._lblfotolivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private edAutorLivro As EditText";
codigocadastrolivro.mostCurrent._edautorlivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private dataPrevistaFinal As String";
codigocadastrolivro.mostCurrent._dataprevistafinal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Private banco As ClassBancoDados";
codigocadastrolivro.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 37;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyy\"";
codigocadastrolivro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyy"));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radcapitulo_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radCapitulo_CheckedChange (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,78);
if (RapidSub.canDelegate("radcapitulo_checkedchange")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","radcapitulo_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 78;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If Checked Then";
Debug.ShouldStop(16384);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
Debug.ShouldStop(32768);
codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"setHint",BA.ObjectToString("Quantidade capítulos"));
 BA.debugLineNum = 81;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
Debug.ShouldStop(65536);
codigocadastrolivro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 BA.debugLineNum = 82;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
Debug.ShouldStop(131072);
codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"setHint",BA.ObjectToString("Quantidade de capítulos"));
 }else {
 BA.debugLineNum = 84;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
Debug.ShouldStop(524288);
codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"setHint",BA.ObjectToString("Quantidade páginas"));
 BA.debugLineNum = 85;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
Debug.ShouldStop(1048576);
codigocadastrolivro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 BA.debugLineNum = 86;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
Debug.ShouldStop(2097152);
codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"setHint",BA.ObjectToString("Quantidade de páginas"));
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radpagina_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radPagina_CheckedChange (codigocadastrolivro) ","codigocadastrolivro",3,codigocadastrolivro.mostCurrent.activityBA,codigocadastrolivro.mostCurrent,66);
if (RapidSub.canDelegate("radpagina_checkedchange")) { return b4a.example.codigocadastrolivro.remoteMe.runUserSub(false, "codigocadastrolivro","radpagina_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 66;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="If Checked Then";
Debug.ShouldStop(4);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade páginas\"";
Debug.ShouldStop(8);
codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"setHint",BA.ObjectToString("Quantidade páginas"));
 BA.debugLineNum = 69;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
Debug.ShouldStop(16);
codigocadastrolivro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 BA.debugLineNum = 70;BA.debugLine="edMeta.Hint = \"Quantidade de páginas\"";
Debug.ShouldStop(32);
codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"setHint",BA.ObjectToString("Quantidade de páginas"));
 }else {
 BA.debugLineNum = 72;BA.debugLine="edQuantPagOuCap.Hint = \"Quantidade capítulos\"";
Debug.ShouldStop(128);
codigocadastrolivro.mostCurrent._edquantpagoucap.runMethod(true,"setHint",BA.ObjectToString("Quantidade capítulos"));
 BA.debugLineNum = 73;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
Debug.ShouldStop(256);
codigocadastrolivro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 BA.debugLineNum = 74;BA.debugLine="edMeta.Hint = \"Quantidade de capítulos\"";
Debug.ShouldStop(512);
codigocadastrolivro.mostCurrent._edmeta.runMethod(true,"setHint",BA.ObjectToString("Quantidade de capítulos"));
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}