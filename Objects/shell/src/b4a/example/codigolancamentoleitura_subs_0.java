package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolancamentoleitura_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_create", _firsttime);}
RemoteObject _p = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"Lay_lancamento_leitura\")";
Debug.ShouldStop(4);
codigolancamentoleitura.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_lancamento_leitura")),codigolancamentoleitura.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="b4XImageViewFoto.ResizeMode = \"FILL\"";
Debug.ShouldStop(16);
codigolancamentoleitura.mostCurrent._b4ximageviewfoto.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL"));
 BA.debugLineNum = 38;BA.debugLine="b4XImageViewFoto.Load(File.DirAssets, \"livro.jpg\"";
Debug.ShouldStop(32);
codigolancamentoleitura.mostCurrent._b4ximageviewfoto.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(codigolancamentoleitura.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("livro.jpg")));
 BA.debugLineNum = 40;BA.debugLine="lblTituloLivro.Text = tituloLivro";
Debug.ShouldStop(128);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runMethod(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._titulolivro));
 BA.debugLineNum = 41;BA.debugLine="lblNomeUsuario.Text = nomeUsuario";
Debug.ShouldStop(256);
codigolancamentoleitura.mostCurrent._lblnomeusuario.runMethod(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._nomeusuario));
 BA.debugLineNum = 42;BA.debugLine="edTotalPaginas.Text = totalPaginas";
Debug.ShouldStop(512);
codigolancamentoleitura.mostCurrent._edtotalpaginas.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._totalpaginas));
 BA.debugLineNum = 44;BA.debugLine="Dim p As Int";
Debug.ShouldStop(2048);
_p = RemoteObject.createImmutable(0);Debug.locals.put("p", _p);
 BA.debugLineNum = 46;BA.debugLine="p = (paginaAtual * 100) / totalPaginas";
Debug.ShouldStop(8192);
_p = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura._paginaatual,RemoteObject.createImmutable(100)}, "*",0, 1)),codigolancamentoleitura._totalpaginas}, "/",0, 0));Debug.locals.put("p", _p);
 BA.debugLineNum = 47;BA.debugLine="lblPorcentagem.Text = p & \" % Lidos\"";
Debug.ShouldStop(16384);
codigolancamentoleitura.mostCurrent._lblporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_p,RemoteObject.createImmutable(" % Lidos"))));
 BA.debugLineNum = 49;BA.debugLine="If paginaAtual + meta > totalPaginas Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura._paginaatual,codigolancamentoleitura._meta}, "+",1, 1),BA.numberCast(double.class, codigolancamentoleitura._totalpaginas))) { 
 BA.debugLineNum = 50;BA.debugLine="edPaginaAtual.Text = totalPaginas";
Debug.ShouldStop(131072);
codigolancamentoleitura.mostCurrent._edpaginaatual.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolancamentoleitura._totalpaginas));
 BA.debugLineNum = 51;BA.debugLine="p = (totalPaginas * 100) / totalPaginas";
Debug.ShouldStop(262144);
_p = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura._totalpaginas,RemoteObject.createImmutable(100)}, "*",0, 1)),codigolancamentoleitura._totalpaginas}, "/",0, 0));Debug.locals.put("p", _p);
 BA.debugLineNum = 52;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço \"";
Debug.ShouldStop(524288);
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Próximo avanço "),_p,RemoteObject.createImmutable("%"))));
 }else {
 BA.debugLineNum = 54;BA.debugLine="edPaginaAtual.Text = paginaAtual + meta";
Debug.ShouldStop(2097152);
codigolancamentoleitura.mostCurrent._edpaginaatual.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura._paginaatual,codigolancamentoleitura._meta}, "+",1, 1)));
 BA.debugLineNum = 55;BA.debugLine="p = ((paginaAtual + meta) * 100) / totalPaginas";
Debug.ShouldStop(4194304);
_p = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura._paginaatual,codigolancamentoleitura._meta}, "+",1, 1)),RemoteObject.createImmutable(100)}, "*",0, 1)),codigolancamentoleitura._totalpaginas}, "/",0, 0));Debug.locals.put("p", _p);
 BA.debugLineNum = 56;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço \"";
Debug.ShouldStop(8388608);
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Próximo avanço "),_p,RemoteObject.createImmutable("%"))));
 };
 BA.debugLineNum = 59;BA.debugLine="If tipoLeitura = \"capítulos\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",codigolancamentoleitura._tipoleitura,BA.ObjectToString("capítulos"))) { 
 BA.debugLineNum = 60;BA.debugLine="lblPaginaAtual.Text = \"Capítulo atual\"";
Debug.ShouldStop(134217728);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runMethod(true,"setText",BA.ObjectToCharSequence("Capítulo atual"));
 BA.debugLineNum = 61;BA.debugLine="lblTotalPaginas.Text = \"Total capítulos\"";
Debug.ShouldStop(268435456);
codigolancamentoleitura.mostCurrent._lbltotalpaginas.runMethod(true,"setText",BA.ObjectToCharSequence("Total capítulos"));
 }else 
{ BA.debugLineNum = 62;BA.debugLine="else if tipoLeitura = \"páginas\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",codigolancamentoleitura._tipoleitura,BA.ObjectToString("páginas"))) { 
 BA.debugLineNum = 63;BA.debugLine="lblPaginaAtual.Text = \"Página atual\"";
Debug.ShouldStop(1073741824);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runMethod(true,"setText",BA.ObjectToCharSequence("Página atual"));
 BA.debugLineNum = 64;BA.debugLine="lblTotalPaginas.Text = \"Total páginas\"";
Debug.ShouldStop(-2147483648);
codigolancamentoleitura.mostCurrent._lbltotalpaginas.runMethod(true,"setText",BA.ObjectToCharSequence("Total páginas"));
 }}
;
 BA.debugLineNum = 67;BA.debugLine="edPaginaAtual.RequestFocus";
Debug.ShouldStop(4);
codigolancamentoleitura.mostCurrent._edpaginaatual.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 68;BA.debugLine="banco.Initialize";
Debug.ShouldStop(8);
codigolancamentoleitura.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolancamentoleitura.processBA);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,83);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,71);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","activity_resume");}
RemoteObject _topo = RemoteObject.createImmutable(0);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="Dim topo As Int = b4XImageViewFoto.mBase.Top + b4";
Debug.ShouldStop(256);
_topo = RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura.mostCurrent._b4ximageviewfoto.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop"),codigolancamentoleitura.mostCurrent._b4ximageviewfoto.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 75;BA.debugLine="lblTituloLivro.TextColor = Colors.Transparent";
Debug.ShouldStop(1024);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runMethod(true,"setTextColor",codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 76;BA.debugLine="lblTituloLivro.Top = topo - 5%y";
Debug.ShouldStop(2048);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_topo,codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolancamentoleitura.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 78;BA.debugLine="lblTituloLivro.SetLayoutAnimated(1000, (b4XImageV";
Debug.ShouldStop(8192);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolancamentoleitura.mostCurrent._b4ximageviewfoto.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),codigolancamentoleitura.mostCurrent._lbltitulolivro.runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_topo),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),codigolancamentoleitura.mostCurrent.activityBA)));
 BA.debugLineNum = 79;BA.debugLine="lblTituloLivro.SetTextColorAnimated(1200, Colors.";
Debug.ShouldStop(16384);
codigolancamentoleitura.mostCurrent._lbltitulolivro.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1200)),(Object)(codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 221)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aparecepagatual() throws Exception{
try {
		Debug.PushSubsStack("AparecePagAtual (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,191);
if (RapidSub.canDelegate("aparecepagatual")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","aparecepagatual");}
 BA.debugLineNum = 191;BA.debugLine="Sub AparecePagAtual";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="lblPaginaAtual.SetLayoutAnimated(1200, 12%x, 3%y,";
Debug.ShouldStop(-2147483648);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1200)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),codigolancamentoleitura.mostCurrent.activityBA)));
 BA.debugLineNum = 193;BA.debugLine="lblPaginaAtual.SetTextColorAnimated(800, Colors.R";
Debug.ShouldStop(1);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 800)),(Object)(codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 111)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btCancelar_Click (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,87);
if (RapidSub.canDelegate("btcancelar_click")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","btcancelar_click");}
 BA.debugLineNum = 87;BA.debugLine="Sub btCancelar_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
codigolancamentoleitura.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btok_click() throws Exception{
try {
		Debug.PushSubsStack("btOk_Click (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,91);
if (RapidSub.canDelegate("btok_click")) { b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","btok_click"); return;}
ResumableSub_btOk_Click rsub = new ResumableSub_btOk_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btOk_Click extends BA.ResumableSub {
public ResumableSub_btOk_Click(b4a.example.codigolancamentoleitura parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolancamentoleitura parent;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btOk_Click (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,91);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 92;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//try
this.state = 20;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
 BA.debugLineNum = 94;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(536870912);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 96;BA.debugLine="cmd = \"exec sp_lancamento_leitura \" & Main.Id_do";
Debug.ShouldStop(-2147483648);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_lancamento_leitura "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable(", "),parent._idlivro,RemoteObject.createImmutable(", "),parent.mostCurrent._edpaginaatual.runMethod(true,"getText"),RemoteObject.createImmutable(""));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 100;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolancamentoleitura.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 102;BA.debugLine="Result.NextRow";
Debug.ShouldStop(32);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 104;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 110;BA.debugLine="Else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 116;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 10;
}}}
if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(\"Sucesso\",True)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sucesso")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 106;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(512);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 107;BA.debugLine="terminouLeitura = False";
Debug.ShouldStop(1024);
parent._terminouleitura = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 108;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolancamentoleitura.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"),BA.numberCast(int.class, 100));
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
 BA.debugLineNum = 109;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(\"Há algo errado na atualização";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Há algo errado na atualização!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(32768);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 113;BA.debugLine="terminouLeitura = True";
Debug.ShouldStop(65536);
parent._terminouleitura = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 114;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolancamentoleitura.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"),BA.numberCast(int.class, 100));
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
 BA.debugLineNum = 115;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 117;BA.debugLine="cmd = \"exec sp_adiciona_leitura_concluida \" & M";
Debug.ShouldStop(1048576);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_adiciona_leitura_concluida "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable(", "),parent._idlivro,RemoteObject.createImmutable(""));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 119;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolancamentoleitura.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 24;
return;
case 24:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 121;BA.debugLine="Result.NextRow";
Debug.ShouldStop(16777216);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 123;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 131;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 124;BA.debugLine="ToastMessageShow(\"Leitura concluída\",True)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Leitura concluída")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 126;BA.debugLine="terminouLeitura = True";
Debug.ShouldStop(536870912);
parent._terminouleitura = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 127;BA.debugLine="de_os_parabens = True";
Debug.ShouldStop(1073741824);
parent._de_os_parabens = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 128;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 129;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolancamentoleitura.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"),BA.numberCast(int.class, 200));
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
 BA.debugLineNum = 130;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 132;BA.debugLine="ToastMessageShow(\"Infelizmente algo deu errado";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Infelizmente algo deu errado.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 134;BA.debugLine="terminouLeitura = True";
Debug.ShouldStop(32);
parent._terminouleitura = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 135;BA.debugLine="de_os_parabens = False";
Debug.ShouldStop(64);
parent._de_os_parabens = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 136;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(128);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 137;BA.debugLine="Sleep(200)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolancamentoleitura.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolancamentoleitura", "btok_click"),BA.numberCast(int.class, 200));
this.state = 26;
return;
case 26:
//C
this.state = 16;
;
 BA.debugLineNum = 138;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow(\"Há algo errado na atualização!";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Há algo errado na atualização!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 145;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(65536);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 146;BA.debugLine="terminouLeitura = False";
Debug.ShouldStop(131072);
parent._terminouleitura = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 147;BA.debugLine="de_os_parabens = False";
Debug.ShouldStop(262144);
parent._de_os_parabens = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 148;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigolancamentoleitura.processBA, e0.toString());}
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
public static RemoteObject  _edpaginaatual_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edPaginaAtual_TextChanged (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,152);
if (RapidSub.canDelegate("edpaginaatual_textchanged")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","edpaginaatual_textchanged", _old, _new);}
RemoteObject _valor = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 152;BA.debugLine="Sub edPaginaAtual_TextChanged (Old As String, New";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 154;BA.debugLine="Dim valor As Int";
Debug.ShouldStop(33554432);
_valor = RemoteObject.createImmutable(0);Debug.locals.put("valor", _valor);
 BA.debugLineNum = 156;BA.debugLine="If New.Trim <> \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",_new.runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 158;BA.debugLine="If New > totalPaginas Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _new),BA.numberCast(double.class, codigolancamentoleitura._totalpaginas))) { 
 BA.debugLineNum = 159;BA.debugLine="lblIvalido.Visible = True";
Debug.ShouldStop(1073741824);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setVisible",codigolancamentoleitura.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="lblIvalido.Text = \"Inválido\"";
Debug.ShouldStop(-2147483648);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setText",BA.ObjectToCharSequence("Inválido"));
 BA.debugLineNum = 162;BA.debugLine="edPaginaAtual.TextColor = Colors.Red";
Debug.ShouldStop(2);
codigolancamentoleitura.mostCurrent._edpaginaatual.runMethod(true,"setTextColor",codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 163;BA.debugLine="SomePagAtual";
Debug.ShouldStop(4);
_somepagatual();
 BA.debugLineNum = 165;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço 0";
Debug.ShouldStop(16);
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence("Próximo avanço 0%"));
 BA.debugLineNum = 166;BA.debugLine="btOk.Enabled = False";
Debug.ShouldStop(32);
codigolancamentoleitura.mostCurrent._btok.runMethod(true,"setEnabled",codigolancamentoleitura.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 168;BA.debugLine="edPaginaAtual.TextColor = Colors.RGB(46,16,16)";
Debug.ShouldStop(128);
codigolancamentoleitura.mostCurrent._edpaginaatual.runMethod(true,"setTextColor",codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 46)),(Object)(BA.numberCast(int.class, 16)),(Object)(BA.numberCast(int.class, 16))));
 BA.debugLineNum = 169;BA.debugLine="lblIvalido.Visible = False";
Debug.ShouldStop(256);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setVisible",codigolancamentoleitura.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="lblIvalido.Text = \"Inválido\"";
Debug.ShouldStop(512);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setText",BA.ObjectToCharSequence("Inválido"));
 BA.debugLineNum = 171;BA.debugLine="AparecePagAtual";
Debug.ShouldStop(1024);
_aparecepagatual();
 BA.debugLineNum = 173;BA.debugLine="valor = ((New * 100) / totalPaginas)";
Debug.ShouldStop(4096);
_valor = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _new),RemoteObject.createImmutable(100)}, "*",0, 0)),codigolancamentoleitura._totalpaginas}, "/",0, 0)));Debug.locals.put("valor", _valor);
 BA.debugLineNum = 174;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço \"";
Debug.ShouldStop(8192);
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Próximo avanço "),_valor,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 175;BA.debugLine="btOk.Enabled = True";
Debug.ShouldStop(16384);
codigolancamentoleitura.mostCurrent._btok.runMethod(true,"setEnabled",codigolancamentoleitura.mostCurrent.__c.getField(true,"True"));
 };
 }else {
 BA.debugLineNum = 178;BA.debugLine="SomePagAtual";
Debug.ShouldStop(131072);
_somepagatual();
 BA.debugLineNum = 179;BA.debugLine="lblPrevisaoPorcentagem.Text = \"Próximo avanço 0%";
Debug.ShouldStop(262144);
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem.runMethod(true,"setText",BA.ObjectToCharSequence("Próximo avanço 0%"));
 BA.debugLineNum = 180;BA.debugLine="lblIvalido.Visible = True";
Debug.ShouldStop(524288);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setVisible",codigolancamentoleitura.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 181;BA.debugLine="lblIvalido.Text = \"Obrigatório\"";
Debug.ShouldStop(1048576);
codigolancamentoleitura.mostCurrent._lblivalido.runMethod(true,"setText",BA.ObjectToCharSequence("Obrigatório"));
 BA.debugLineNum = 182;BA.debugLine="btOk.Enabled = False";
Debug.ShouldStop(2097152);
codigolancamentoleitura.mostCurrent._btok.runMethod(true,"setEnabled",codigolancamentoleitura.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 20;BA.debugLine="Private lblTituloLivro As Label";
codigolancamentoleitura.mostCurrent._lbltitulolivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblNomeUsuario As Label";
codigolancamentoleitura.mostCurrent._lblnomeusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private edPaginaAtual As EditText";
codigolancamentoleitura.mostCurrent._edpaginaatual = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private edTotalPaginas As EditText";
codigolancamentoleitura.mostCurrent._edtotalpaginas = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblPorcentagem As Label";
codigolancamentoleitura.mostCurrent._lblporcentagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private b4XImageViewFoto As B4XImageView";
codigolancamentoleitura.mostCurrent._b4ximageviewfoto = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 26;BA.debugLine="Private lblIvalido As Label";
codigolancamentoleitura.mostCurrent._lblivalido = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblPaginaAtual As Label";
codigolancamentoleitura.mostCurrent._lblpaginaatual = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblPrevisaoPorcentagem As Label";
codigolancamentoleitura.mostCurrent._lblprevisaoporcentagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btOk As Button";
codigolancamentoleitura.mostCurrent._btok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim banco As ClassBancoDados";
codigolancamentoleitura.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 31;BA.debugLine="Private lblTotalPaginas As Label";
codigolancamentoleitura.mostCurrent._lbltotalpaginas = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="Public meta As Int";
codigolancamentoleitura._meta = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Public idLivro As Int";
codigolancamentoleitura._idlivro = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Public tipoLeitura As String";
codigolancamentoleitura._tipoleitura = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public terminouLeitura As Boolean = False";
codigolancamentoleitura._terminouleitura = codigolancamentoleitura.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 15;BA.debugLine="Public de_os_parabens As Boolean = False";
codigolancamentoleitura._de_os_parabens = codigolancamentoleitura.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _somepagatual() throws Exception{
try {
		Debug.PushSubsStack("SomePagAtual (codigolancamentoleitura) ","codigolancamentoleitura",7,codigolancamentoleitura.mostCurrent.activityBA,codigolancamentoleitura.mostCurrent,186);
if (RapidSub.canDelegate("somepagatual")) { return b4a.example.codigolancamentoleitura.remoteMe.runUserSub(false, "codigolancamentoleitura","somepagatual");}
 BA.debugLineNum = 186;BA.debugLine="Sub SomePagAtual";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="lblPaginaAtual.SetLayoutAnimated(1200, 12%x, 1%y,";
Debug.ShouldStop(67108864);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1200)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 12)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28)),codigolancamentoleitura.mostCurrent.activityBA)),(Object)(codigolancamentoleitura.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),codigolancamentoleitura.mostCurrent.activityBA)));
 BA.debugLineNum = 188;BA.debugLine="lblPaginaAtual.SetTextColorAnimated(800, Colors.T";
Debug.ShouldStop(134217728);
codigolancamentoleitura.mostCurrent._lblpaginaatual.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 800)),(Object)(codigolancamentoleitura.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}