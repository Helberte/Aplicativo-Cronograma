package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayanotacao_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Lay_Anotar\")";
Debug.ShouldStop(536870912);
codigolayanotacao.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_Anotar")),codigolayanotacao.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="banco.Initialize";
Debug.ShouldStop(1073741824);
codigolayanotacao.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayanotacao.processBA);
 BA.debugLineNum = 33;BA.debugLine="edTituloAnotacao.RequestFocus";
Debug.ShouldStop(1);
codigolayanotacao.mostCurrent._edtituloanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,120);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 120;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayanotacao.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 122;BA.debugLine="nomeDoLivro = \"\"";
Debug.ShouldStop(33554432);
codigolayanotacao._nomedolivro = BA.ObjectToString("");
 BA.debugLineNum = 123;BA.debugLine="qtPaginas = 0";
Debug.ShouldStop(67108864);
codigolayanotacao._qtpaginas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 124;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
codigolayanotacao.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 125;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return codigolayanotacao.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 127;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return codigolayanotacao.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_resume");}
RemoteObject _paginas = null;
int _i = 0;
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim paginas(qtPaginas) As Int";
Debug.ShouldStop(32);
_paginas = RemoteObject.createNewArray ("int", new int[] {codigolayanotacao._qtpaginas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("paginas", _paginas);
 BA.debugLineNum = 40;BA.debugLine="For i = 0 To qtPaginas - 1";
Debug.ShouldStop(128);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {codigolayanotacao._qtpaginas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="paginas(i) = i + 1";
Debug.ShouldStop(256);
_paginas.setArrayElement (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 45;BA.debugLine="If lblAnotacaoRefPag.Text = \"página\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",codigolayanotacao.mostCurrent._lblanotacaorefpag.runMethod(true,"getText"),BA.ObjectToString("página"))) { 
 BA.debugLineNum = 46;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente à p";
Debug.ShouldStop(8192);
codigolayanotacao.mostCurrent._lblanotacaorefpag.runMethod(true,"setText",BA.ObjectToCharSequence("Anotação referente à página"));
 }else {
 BA.debugLineNum = 48;BA.debugLine="lblAnotacaoRefPag.Text = \"Anotação referente ao";
Debug.ShouldStop(32768);
codigolayanotacao.mostCurrent._lblanotacaorefpag.runMethod(true,"setText",BA.ObjectToCharSequence("Anotação referente ao capítulo"));
 };
 BA.debugLineNum = 51;BA.debugLine="lblTitulo.Text = nomeDoLivro";
Debug.ShouldStop(262144);
codigolayanotacao.mostCurrent._lbltitulo.runMethod(true,"setText",BA.ObjectToCharSequence(codigolayanotacao._nomedolivro));
 BA.debugLineNum = 52;BA.debugLine="B4XComboBox1.SetItems(paginas)";
Debug.ShouldStop(524288);
codigolayanotacao.mostCurrent._b4xcombobox1.runClassMethod (b4a.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(codigolayanotacao.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_paginas))));
 BA.debugLineNum = 55;BA.debugLine="lblTitulo.TextColor = Colors.Transparent";
Debug.ShouldStop(4194304);
codigolayanotacao.mostCurrent._lbltitulo.runMethod(true,"setTextColor",codigolayanotacao.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 56;BA.debugLine="lblTitulo.Top = -2.5%y";
Debug.ShouldStop(8388608);
codigolayanotacao.mostCurrent._lbltitulo.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),codigolayanotacao.mostCurrent.activityBA).<Integer>get().intValue())));
 BA.debugLineNum = 58;BA.debugLine="lblTitulo.SetTextColorAnimated(1000, Colors.RGB(1";
Debug.ShouldStop(33554432);
codigolayanotacao.mostCurrent._lbltitulo.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(codigolayanotacao.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 195)),(Object)(BA.numberCast(int.class, 21)),(Object)(BA.numberCast(int.class, 21)))));
 BA.debugLineNum = 59;BA.debugLine="lblTitulo.SetLayoutAnimated(1000, 0%x, 2.5%y, pan";
Debug.ShouldStop(67108864);
codigolayanotacao.mostCurrent._lbltitulo.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayanotacao.mostCurrent.activityBA)),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),codigolayanotacao.mostCurrent.activityBA)),(Object)(codigolayanotacao.mostCurrent._panel_cabecalho.runMethod(true,"getWidth")),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigolayanotacao.mostCurrent.activityBA)));
 BA.debugLineNum = 61;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",codigolayanotacao.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 62;BA.debugLine="lblTituloAnotacao.TextColor = Colors.Transparent";
Debug.ShouldStop(536870912);
codigolayanotacao.mostCurrent._lbltituloanotacao.runMethod(true,"setTextColor",codigolayanotacao.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 }else {
 BA.debugLineNum = 64;BA.debugLine="ApareceTituloAnotacao";
Debug.ShouldStop(-2147483648);
_aparecetituloanotacao();
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aparecetituloanotacao() throws Exception{
try {
		Debug.PushSubsStack("ApareceTituloAnotacao (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,151);
if (RapidSub.canDelegate("aparecetituloanotacao")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","aparecetituloanotacao");}
 BA.debugLineNum = 151;BA.debugLine="Sub ApareceTituloAnotacao";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="verifica = False";
Debug.ShouldStop(16777216);
codigolayanotacao._verifica = codigolayanotacao.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 154;BA.debugLine="lblTituloAnotacao.Top = 0%y";
Debug.ShouldStop(33554432);
codigolayanotacao.mostCurrent._lbltituloanotacao.runMethod(true,"setTop",codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayanotacao.mostCurrent.activityBA));
 BA.debugLineNum = 155;BA.debugLine="lblTituloAnotacao.TextColor = Colors.Transparent";
Debug.ShouldStop(67108864);
codigolayanotacao.mostCurrent._lbltituloanotacao.runMethod(true,"setTextColor",codigolayanotacao.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 157;BA.debugLine="lblTituloAnotacao.SetTextColorAnimated(600, Color";
Debug.ShouldStop(268435456);
codigolayanotacao.mostCurrent._lbltituloanotacao.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(codigolayanotacao.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 195)),(Object)(BA.numberCast(int.class, 21)),(Object)(BA.numberCast(int.class, 21)))));
 BA.debugLineNum = 158;BA.debugLine="lblTituloAnotacao.SetLayoutAnimated(900, (panel_a";
Debug.ShouldStop(536870912);
codigolayanotacao.mostCurrent._lbltituloanotacao.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 900)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolayanotacao.mostCurrent._panel_anotacao.runMethod(true,"getWidth"),codigolayanotacao.mostCurrent._lbltituloanotacao.runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayanotacao.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {codigolayanotacao.mostCurrent._panel_anotacao.runMethod(true,"getWidth"),codigolayanotacao.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayanotacao.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.2)),codigolayanotacao.mostCurrent.activityBA)));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btCancelar_Click (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,73);
if (RapidSub.canDelegate("btcancelar_click")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","btcancelar_click");}
 BA.debugLineNum = 73;BA.debugLine="Sub btCancelar_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="nomeDoLivro = \"\"";
Debug.ShouldStop(512);
codigolayanotacao._nomedolivro = BA.ObjectToString("");
 BA.debugLineNum = 75;BA.debugLine="qtPaginas = 0";
Debug.ShouldStop(1024);
codigolayanotacao._qtpaginas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 76;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
codigolayanotacao.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btOk_Click (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,79);
if (RapidSub.canDelegate("btok_click")) { b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","btok_click"); return;}
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
public ResumableSub_btOk_Click(b4a.example.codigolayanotacao parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolayanotacao parent;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btOk_Click (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,79);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 81;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 84;BA.debugLine="Else if edAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 82;BA.debugLine="edTituloAnotacao.RequestFocus";
Debug.ShouldStop(131072);
parent.mostCurrent._edtituloanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"Insira um título para sua anot";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Insira um título para sua anotação")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 20;
 BA.debugLineNum = 85;BA.debugLine="edAnotacao.RequestFocus";
Debug.ShouldStop(1048576);
parent.mostCurrent._edanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(\"Cadê a anotação?\",True)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cadê a anotação?")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 88;BA.debugLine="Try";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 90;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(33554432);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 91;BA.debugLine="cmd = \"exec sp_atualiza_anotacao \" & Main.Id_do";
Debug.ShouldStop(67108864);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_anotacao "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable(", "),parent._codigolivro,RemoteObject.createImmutable(", "),parent.mostCurrent._b4xcombobox1.runClassMethod (b4a.example.b4xcombobox.class, "_getselecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable(", '"),parent.mostCurrent._edtituloanotacao.runMethod(true,"getText"),RemoteObject.createImmutable("','"),parent.mostCurrent._edanotacao.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 97;BA.debugLine="Wait For( banco.Insert_Consulta(cmd)) Complete";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayanotacao.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 99;BA.debugLine="Result.NextRow";
Debug.ShouldStop(4);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 101;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 106;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(1))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 102;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 103;BA.debugLine="Sleep(400)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 104;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 107;BA.debugLine="ToastMessageShow(\"Tudo certo\",True)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Tudo certo")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 108;BA.debugLine="Sleep(400)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 109;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 16:
//C
this.state = 19;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 BA.debugLineNum = 113;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 114;BA.debugLine="Sleep(400)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 24;
return;
case 24:
//C
this.state = 19;
;
 BA.debugLineNum = 115;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
parent.mostCurrent._activity.runVoidMethod ("Finish");
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
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigolayanotacao.processBA, e0.toString());}
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
public static RemoteObject  _edanotacao_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edAnotacao_TextChanged (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,162);
if (RapidSub.canDelegate("edanotacao_textchanged")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","edanotacao_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 162;BA.debugLine="Sub edAnotacao_TextChanged (Old As String, New As";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 164;BA.debugLine="edAnotacao.Text = edAnotacao.Text.Replace(\"'\",\"\"";
Debug.ShouldStop(8);
codigolayanotacao.mostCurrent._edanotacao.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolayanotacao.mostCurrent._edanotacao.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtituloanotacao_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edTituloAnotacao_TextChanged (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,131);
if (RapidSub.canDelegate("edtituloanotacao_textchanged")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","edtituloanotacao_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 131;BA.debugLine="Sub edTituloAnotacao_TextChanged (Old As String, N";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 133;BA.debugLine="edTituloAnotacao.Text = edTituloAnotacao.Text.Re";
Debug.ShouldStop(16);
codigolayanotacao.mostCurrent._edtituloanotacao.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolayanotacao.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 }else {
 BA.debugLineNum = 135;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",codigolayanotacao.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 136;BA.debugLine="SomeTituloAnotacao";
Debug.ShouldStop(128);
_sometituloanotacao();
 }else {
 BA.debugLineNum = 138;BA.debugLine="If verifica Then";
Debug.ShouldStop(512);
if (codigolayanotacao._verifica.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 139;BA.debugLine="ApareceTituloAnotacao";
Debug.ShouldStop(1024);
_aparecetituloanotacao();
 };
 };
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private lblTitulo As Label";
codigolayanotacao.mostCurrent._lbltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
codigolayanotacao.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("b4a.example.b4xcombobox");
 //BA.debugLineNum = 16;BA.debugLine="Private edTituloAnotacao As EditText";
codigolayanotacao.mostCurrent._edtituloanotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private edAnotacao As EditText";
codigolayanotacao.mostCurrent._edanotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btCancelar As Button";
codigolayanotacao.mostCurrent._btcancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btOk As Button";
codigolayanotacao.mostCurrent._btok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim banco As ClassBancoDados";
codigolayanotacao.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 21;BA.debugLine="Private lblAnotacaoRefPag As Label";
codigolayanotacao.mostCurrent._lblanotacaorefpag = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private panel_cabecalho As Panel";
codigolayanotacao.mostCurrent._panel_cabecalho = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblTituloAnotacao As Label";
codigolayanotacao.mostCurrent._lbltituloanotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private panel_anotacao As Panel";
codigolayanotacao.mostCurrent._panel_anotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim verifica As Boolean = True";
codigolayanotacao._verifica = codigolayanotacao.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public nomeDoLivro As String";
codigolayanotacao._nomedolivro = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public qtPaginas, codigoLivro As Int";
codigolayanotacao._qtpaginas = RemoteObject.createImmutable(0);
codigolayanotacao._codigolivro = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 9;BA.debugLine="Public tipoLeitura As String";
codigolayanotacao._tipoleitura = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sometituloanotacao() throws Exception{
try {
		Debug.PushSubsStack("SomeTituloAnotacao (codigolayanotacao) ","codigolayanotacao",5,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,145);
if (RapidSub.canDelegate("sometituloanotacao")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","sometituloanotacao");}
 BA.debugLineNum = 145;BA.debugLine="Sub SomeTituloAnotacao";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="verifica = True";
Debug.ShouldStop(131072);
codigolayanotacao._verifica = codigolayanotacao.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 147;BA.debugLine="lblTituloAnotacao.SetTextColorAnimated(600, Color";
Debug.ShouldStop(262144);
codigolayanotacao.mostCurrent._lbltituloanotacao.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 600)),(Object)(codigolayanotacao.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 148;BA.debugLine="lblTituloAnotacao.SetLayoutAnimated(900, (panel_a";
Debug.ShouldStop(524288);
codigolayanotacao.mostCurrent._lbltituloanotacao.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 900)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigolayanotacao.mostCurrent._panel_anotacao.runMethod(true,"getWidth"),codigolayanotacao.mostCurrent._lbltituloanotacao.runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayanotacao.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {codigolayanotacao.mostCurrent._panel_anotacao.runMethod(true,"getWidth"),codigolayanotacao.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayanotacao.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigolayanotacao.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.2)),codigolayanotacao.mostCurrent.activityBA)));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}