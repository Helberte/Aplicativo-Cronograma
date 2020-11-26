package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolaylogin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,14);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 14;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="Activity.LoadLayout(\"LayLogin\")";
Debug.ShouldStop(32768);
codigolaylogin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayLogin")),codigolaylogin.mostCurrent.activityBA);
 BA.debugLineNum = 18;BA.debugLine="EdLogin.RequestFocus";
Debug.ShouldStop(131072);
codigolaylogin.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 19;BA.debugLine="funcoes.Initialize";
Debug.ShouldStop(262144);
codigolaylogin.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolaylogin.processBA);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_KeyPress (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,115);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 115;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolaylogin.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
codigolaylogin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 118;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) return codigolaylogin.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 120;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return codigolaylogin.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,92);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,88);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","activity_resume");}
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btcadastro_click() throws Exception{
try {
		Debug.PushSubsStack("btCadastro_Click (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,96);
if (RapidSub.canDelegate("btcadastro_click")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","btcadastro_click");}
 BA.debugLineNum = 96;BA.debugLine="Sub btCadastro_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="StartActivity(CodigoCadastro)";
Debug.ShouldStop(1);
codigolaylogin.mostCurrent.__c.runVoidMethod ("StartActivity",codigolaylogin.processBA,(Object)((codigolaylogin.mostCurrent._codigocadastro.getObject())));
 BA.debugLineNum = 98;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
codigolaylogin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btconectar_click() throws Exception{
try {
		Debug.PushSubsStack("btConectar_Click (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,31);
if (RapidSub.canDelegate("btconectar_click")) { b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","btconectar_click"); return;}
ResumableSub_btConectar_Click rsub = new ResumableSub_btConectar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btConectar_Click extends BA.ResumableSub {
public ResumableSub_btConectar_Click(b4a.example.codigolaylogin parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolaylogin parent;
RemoteObject _ms = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _exec = RemoteObject.createImmutable("");
RemoteObject _result_2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btConectar_Click (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 33;BA.debugLine="If EdLogin.Text.Trim = \"\" And EdSenha.Text.Trim =";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edlogin.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 54;BA.debugLine="Else If EdSenha.Text.Trim = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 13;
}else {
this.state = 15;
}}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 35;BA.debugLine="EdLogin.Text = EdLogin.Text.Trim";
Debug.ShouldStop(4);
parent.mostCurrent._edlogin.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._edlogin.runMethod(true,"getText").runMethod(true,"trim")));
 BA.debugLineNum = 36;BA.debugLine="EdSenha.Text = EdSenha.Text.Trim";
Debug.ShouldStop(8);
parent.mostCurrent._edsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim")));
 BA.debugLineNum = 38;BA.debugLine="Dim ms As Object = Msgbox2Async(\"Ainda não tem u";
Debug.ShouldStop(32);
_ms = parent.mostCurrent.__c.runMethod(false,"Msgbox2Async",(Object)(BA.ObjectToCharSequence("Ainda não tem um Cadastro, deseja faze-lo agora?")),(Object)(BA.ObjectToCharSequence("Campos vazios")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("Cancelar ")),(Object)(BA.ObjectToString("Já tenho cadastro ")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),codigolaylogin.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("ms", _ms);Debug.locals.put("ms", _ms);
 BA.debugLineNum = 40;BA.debugLine="Wait For (ms) Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", codigolaylogin.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolaylogin", "btconectar_click"), _ms);
this.state = 35;
return;
case 35:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 42;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 46;BA.debugLine="Else If Result = DialogResponse.CANCEL Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 49;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 10;
}}}
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 44;BA.debugLine="StartActivity(CodigoCadastro)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigolaylogin.processBA,(Object)((parent.mostCurrent._codigocadastro.getObject())));
 BA.debugLineNum = 45;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 47;BA.debugLine="EdLogin.RequestFocus";
Debug.ShouldStop(16384);
parent.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 50;BA.debugLine="EdLogin.RequestFocus";
Debug.ShouldStop(131072);
parent.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 if (true) break;

case 11:
//C
this.state = 34;
;
 if (true) break;

case 13:
//C
this.state = 34;
 BA.debugLineNum = 55;BA.debugLine="EdSenha.RequestFocus";
Debug.ShouldStop(4194304);
parent.mostCurrent._edsenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 58;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 16:
//try
this.state = 33;
this.catchState = 32;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 32;
 BA.debugLineNum = 60;BA.debugLine="Dim exec As String = \"exec sp_encontra_usuario";
Debug.ShouldStop(134217728);
_exec = RemoteObject.concat(RemoteObject.createImmutable("exec sp_encontra_usuario '"),parent.mostCurrent._edlogin.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edsenha.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("exec", _exec);Debug.locals.put("exec", _exec);
 BA.debugLineNum = 62;BA.debugLine="wait For (funcoes.Insert_Consulta(exec)) Comple";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolaylogin.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolaylogin", "btconectar_click"), parent.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_exec)));
this.state = 36;
return;
case 36:
//C
this.state = 19;
_result_2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result_2", _result_2);
;
 BA.debugLineNum = 64;BA.debugLine="If Result_2 = Null Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 19:
//if
this.state = 30;
if (RemoteObject.solveBoolean("n",_result_2)) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 30;
 BA.debugLineNum = 65;BA.debugLine="MsgboxAsync(\"Problemas ao verificar usuário. \"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas ao verificar usuário. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigolaylogin.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigolaylogin.processBA);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 67;BA.debugLine="Result_2.NextRow";
Debug.ShouldStop(4);
_result_2.runVoidMethod ("NextRow");
 BA.debugLineNum = 69;BA.debugLine="If Result_2.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_result_2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 71;BA.debugLine="MsgboxAsync(\"Usuário não encontrado.\",\"Ops!\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Usuário não encontrado.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ops!"))),codigolaylogin.processBA);
 BA.debugLineNum = 72;BA.debugLine="EdLogin.Text = \"\"";
Debug.ShouldStop(128);
parent.mostCurrent._edlogin.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 73;BA.debugLine="EdSenha.Text = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._edsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 74;BA.debugLine="EdLogin.RequestFocus";
Debug.ShouldStop(512);
parent.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 76;BA.debugLine="Main.Id_do_Usuario = Result_2.GetInt(\"ID_USUA";
Debug.ShouldStop(2048);
parent.mostCurrent._main._id_do_usuario /*RemoteObject*/  = _result_2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID_USUARIO")));
 BA.debugLineNum = 78;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigolaylogin.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 33;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
 BA.debugLineNum = 83;BA.debugLine="MsgboxAsync(\"Problemas ao verificar usuário. \"";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas ao verificar usuário. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigolaylogin.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigolaylogin.processBA);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigolaylogin.processBA, e0.toString());}
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static void  _complete(RemoteObject _result_2) throws Exception{
}
public static RemoteObject  _edlogin_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EdLogin_TextChanged (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,108);
if (RapidSub.canDelegate("edlogin_textchanged")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","edlogin_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 108;BA.debugLine="Sub EdLogin_TextChanged (Old As String, New As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 110;BA.debugLine="EdLogin.Text = EdLogin.Text.Replace(\"'\",\"\")";
Debug.ShouldStop(8192);
codigolaylogin.mostCurrent._edlogin.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(codigolaylogin.mostCurrent._edlogin.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edsenha_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EdSenha_TextChanged (codigolaylogin) ","codigolaylogin",5,codigolaylogin.mostCurrent.activityBA,codigolaylogin.mostCurrent,101);
if (RapidSub.canDelegate("edsenha_textchanged")) { return b4a.example.codigolaylogin.remoteMe.runUserSub(false, "codigolaylogin","edsenha_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 101;BA.debugLine="Sub EdSenha_TextChanged (Old As String, New As Str";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If New.Length > 8 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 103;BA.debugLine="EdSenha.Text = New.SubString2(0, 8)";
Debug.ShouldStop(64);
codigolaylogin.mostCurrent._edsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 104;BA.debugLine="EdSenha.SelectionStart = 8";
Debug.ShouldStop(128);
codigolaylogin.mostCurrent._edsenha.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 8));
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private funcoes As ClassBancoDados";
codigolaylogin.mostCurrent._funcoes = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 26;BA.debugLine="Private EdLogin As EditText";
codigolaylogin.mostCurrent._edlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EdSenha As EditText";
codigolaylogin.mostCurrent._edsenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btConectar As Button";
codigolaylogin.mostCurrent._btconectar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}