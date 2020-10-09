package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayanotacao_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"Lay_Anotar\")";
Debug.ShouldStop(67108864);
codigolayanotacao.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_Anotar")),codigolayanotacao.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="banco.Initialize";
Debug.ShouldStop(134217728);
codigolayanotacao.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayanotacao.processBA);
 BA.debugLineNum = 30;BA.debugLine="edTituloAnotacao.RequestFocus";
Debug.ShouldStop(536870912);
codigolayanotacao.mostCurrent._edtituloanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_KeyPress (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,96);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayanotacao.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 98;BA.debugLine="nomeDoLivro = \"\"";
Debug.ShouldStop(2);
codigolayanotacao._nomedolivro = BA.ObjectToString("");
 BA.debugLineNum = 99;BA.debugLine="qtPaginas = 0";
Debug.ShouldStop(4);
codigolayanotacao._qtpaginas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 100;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
codigolayanotacao.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 101;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return codigolayanotacao.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 103;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return codigolayanotacao.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","activity_resume");}
RemoteObject _paginas = null;
int _i = 0;
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim paginas(qtPaginas) As Int";
Debug.ShouldStop(2);
_paginas = RemoteObject.createNewArray ("int", new int[] {codigolayanotacao._qtpaginas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("paginas", _paginas);
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To qtPaginas - 1";
Debug.ShouldStop(8);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {codigolayanotacao._qtpaginas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="paginas(i) = i + 1";
Debug.ShouldStop(16);
_paginas.setArrayElement (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 40;BA.debugLine="lblTitulo.Text = nomeDoLivro";
Debug.ShouldStop(128);
codigolayanotacao.mostCurrent._lbltitulo.runMethod(true,"setText",BA.ObjectToCharSequence(codigolayanotacao._nomedolivro));
 BA.debugLineNum = 41;BA.debugLine="B4XComboBox1.SetItems(paginas)";
Debug.ShouldStop(256);
codigolayanotacao.mostCurrent._b4xcombobox1.runClassMethod (b4a.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(codigolayanotacao.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_paginas))));
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
		Debug.PushSubsStack("btCancelar_Click (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,49);
if (RapidSub.canDelegate("btcancelar_click")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","btcancelar_click");}
 BA.debugLineNum = 49;BA.debugLine="Sub btCancelar_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="nomeDoLivro = \"\"";
Debug.ShouldStop(131072);
codigolayanotacao._nomedolivro = BA.ObjectToString("");
 BA.debugLineNum = 51;BA.debugLine="qtPaginas = 0";
Debug.ShouldStop(262144);
codigolayanotacao._qtpaginas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
codigolayanotacao.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btOk_Click (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,55);
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
		Debug.PushSubsStack("btOk_Click (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="If edTituloAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 60;BA.debugLine="Else if edAnotacao.Text.Trim = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edanotacao.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 58;BA.debugLine="edTituloAnotacao.RequestFocus";
Debug.ShouldStop(33554432);
parent.mostCurrent._edtituloanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 59;BA.debugLine="ToastMessageShow(\"Insira um título para sua anot";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Insira um título para sua anotação")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 20;
 BA.debugLineNum = 61;BA.debugLine="edAnotacao.RequestFocus";
Debug.ShouldStop(268435456);
parent.mostCurrent._edanotacao.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 62;BA.debugLine="ToastMessageShow(\"Cadê a anotação?\",True)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cadê a anotação?")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 64;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 66;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(2);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 67;BA.debugLine="cmd = \"exec sp_atualiza_anotacao \" & Main.Id_do";
Debug.ShouldStop(4);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_anotacao "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable(", "),parent._codigolivro,RemoteObject.createImmutable(", "),parent.mostCurrent._b4xcombobox1.runClassMethod (b4a.example.b4xcombobox.class, "_getselecteditem" /*RemoteObject*/ ),RemoteObject.createImmutable(", '"),parent.mostCurrent._edtituloanotacao.runMethod(true,"getText"),RemoteObject.createImmutable("','"),parent.mostCurrent._edanotacao.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 73;BA.debugLine="Wait For( banco.Insert_Consulta(cmd)) Complete";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayanotacao.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 75;BA.debugLine="Result.NextRow";
Debug.ShouldStop(1024);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 77;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 82;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(1))) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="Sleep(400)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 80;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"Tudo certo\",True)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Tudo certo")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 84;BA.debugLine="Sleep(400)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 85;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 89;BA.debugLine="ToastMessageShow(\"Algo deu errado!\",True)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 90;BA.debugLine="Sleep(400)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigolayanotacao.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayanotacao", "btok_click"),BA.numberCast(int.class, 400));
this.state = 24;
return;
case 24:
//C
this.state = 19;
;
 BA.debugLineNum = 91;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("edAnotacao_TextChanged (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,113);
if (RapidSub.canDelegate("edanotacao_textchanged")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","edanotacao_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 113;BA.debugLine="Sub edAnotacao_TextChanged (Old As String, New As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 115;BA.debugLine="edAnotacao.Text = edAnotacao.Text.Replace(\"'\",\"\"";
Debug.ShouldStop(262144);
codigolayanotacao.mostCurrent._edanotacao.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolayanotacao.mostCurrent._edanotacao.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("edTituloAnotacao_TextChanged (codigolayanotacao) ","codigolayanotacao",4,codigolayanotacao.mostCurrent.activityBA,codigolayanotacao.mostCurrent,107);
if (RapidSub.canDelegate("edtituloanotacao_textchanged")) { return b4a.example.codigolayanotacao.remoteMe.runUserSub(false, "codigolayanotacao","edtituloanotacao_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 107;BA.debugLine="Sub edTituloAnotacao_TextChanged (Old As String, N";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 109;BA.debugLine="edTituloAnotacao.Text = edTituloAnotacao.Text.Re";
Debug.ShouldStop(4096);
codigolayanotacao.mostCurrent._edtituloanotacao.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolayanotacao.mostCurrent._edtituloanotacao.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private lblTitulo As Label";
codigolayanotacao.mostCurrent._lbltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
codigolayanotacao.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("b4a.example.b4xcombobox");
 //BA.debugLineNum = 17;BA.debugLine="Private edTituloAnotacao As EditText";
codigolayanotacao.mostCurrent._edtituloanotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edAnotacao As EditText";
codigolayanotacao.mostCurrent._edanotacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btCancelar As Button";
codigolayanotacao.mostCurrent._btcancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btOk As Button";
codigolayanotacao.mostCurrent._btok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim banco As ClassBancoDados";
codigolayanotacao.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 22;BA.debugLine="Private lblAnotacaoRefPag As Label";
codigolayanotacao.mostCurrent._lblanotacaorefpag = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Public nomeUsuario as String";
codigolayanotacao._nomeusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}