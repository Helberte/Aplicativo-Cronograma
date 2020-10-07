package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigocadastro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"LayoutCadastro\")";
Debug.ShouldStop(16777216);
codigocadastro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayoutCadastro")),codigocadastro.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(67108864);
codigocadastro.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 29;BA.debugLine="panelCadSalvo.Visible = False";
Debug.ShouldStop(268435456);
codigocadastro.mostCurrent._panelcadsalvo.runMethod(true,"setVisible",codigocadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="lblCadSalvo.Visible = False";
Debug.ShouldStop(536870912);
codigocadastro.mostCurrent._lblcadsalvo.runMethod(true,"setVisible",codigocadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="funcoes.Initialize";
Debug.ShouldStop(1073741824);
codigocadastro.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigocadastro.processBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_KeyPress (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,139);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 139;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigocadastro.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 141;BA.debugLine="StartActivity(CodigoLayLogin)";
Debug.ShouldStop(4096);
codigocadastro.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastro.processBA,(Object)((codigocadastro.mostCurrent._codigolaylogin.getObject())));
 BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
codigocadastro.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 143;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return codigocadastro.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 145;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return codigocadastro.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btSalvar_Click (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,42);
if (RapidSub.canDelegate("btsalvar_click")) { b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","btsalvar_click"); return;}
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
public ResumableSub_btSalvar_Click(b4a.example.codigocadastro parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigocadastro parent;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btSalvar_Click (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 44;BA.debugLine="If edNome.Text.Trim = \"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._ednome.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 48;BA.debugLine="Else If edLogin.Text.Trim = \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edlogin.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 52;BA.debugLine="Else If edSenha.Text.Trim = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 32;
 BA.debugLineNum = 45;BA.debugLine="MsgboxAsync(\"Falta o nome\",\"Está apressado?\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta o nome")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 46;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(8192);
parent.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 if (true) break;

case 5:
//C
this.state = 32;
 BA.debugLineNum = 49;BA.debugLine="MsgboxAsync(\"Falta o login\",\"Está apressado?\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta o login")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 50;BA.debugLine="edLogin.RequestFocus";
Debug.ShouldStop(131072);
parent.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 if (true) break;

case 7:
//C
this.state = 32;
 BA.debugLineNum = 53;BA.debugLine="MsgboxAsync(\"Falta a senha\",\"Está apressado?\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta a senha")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 54;BA.debugLine="edSenha.RequestFocus";
Debug.ShouldStop(2097152);
parent.mostCurrent._edsenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 58;BA.debugLine="If edRepitaSenha.Text.Trim.Length < 8 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 10:
//if
this.state = 31;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._edrepitasenha.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 62;BA.debugLine="Else If edSenha.Text.Trim <> edRepitaSenha.Text.";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),parent.mostCurrent._edrepitasenha.runMethod(true,"getText").runMethod(true,"trim"))) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 12:
//C
this.state = 31;
 BA.debugLineNum = 59;BA.debugLine="MsgboxAsync(\"Sua senha precisa ter no mínimo 8";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Sua senha precisa ter no mínimo 8 dígitos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Senha inválida!"))),codigocadastro.processBA);
 BA.debugLineNum = 60;BA.debugLine="edRepitaSenha.RequestFocus";
Debug.ShouldStop(134217728);
parent.mostCurrent._edrepitasenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 14:
//C
this.state = 31;
 BA.debugLineNum = 63;BA.debugLine="MsgboxAsync(\"As senhas não coinsidem.\",\"Atenção";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("As senhas não coinsidem.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigocadastro.processBA);
 BA.debugLineNum = 64;BA.debugLine="edRepitaSenha.Text = \"\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._edrepitasenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 65;BA.debugLine="edSenha.RequestFocus";
Debug.ShouldStop(1);
parent.mostCurrent._edsenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 68;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 17:
//try
this.state = 30;
this.catchState = 29;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 29;
 BA.debugLineNum = 70;BA.debugLine="Dim cmd As String = \"exec sp_cad_usuario_crono";
Debug.ShouldStop(32);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_cad_usuario_cronograma '"),parent.mostCurrent._ednome.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edlogin.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edsenha.runMethod(true,"getText"),RemoteObject.createImmutable("' "));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 74;BA.debugLine="Wait For (funcoes.Insert_Consulta(cmd)) Comple";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigocadastro.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastro", "btsalvar_click"), parent.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 76;BA.debugLine="Result.NextRow";
Debug.ShouldStop(2048);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 78;BA.debugLine="If Result = Null Then";
Debug.ShouldStop(8192);
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean("n",_result)) { 
this.state = 22;
}else 
{ BA.debugLineNum = 82;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 24;
}else {
this.state = 26;
}}
if (true) break;

case 22:
//C
this.state = 27;
 BA.debugLineNum = 80;BA.debugLine="cadastrouUsuario = False";
Debug.ShouldStop(32768);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 81;BA.debugLine="MsgboxAsync(\"Problemas na conexão com banco d";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas na conexão com banco de dados. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigocadastro.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigocadastro.processBA);
 if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 84;BA.debugLine="cadastrouUsuario = False";
Debug.ShouldStop(524288);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 85;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"Op";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ops!"))),codigocadastro.processBA);
 BA.debugLineNum = 86;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(2097152);
parent.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 89;BA.debugLine="edLogin.Enabled = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._edlogin.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="edNome.Enabled = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._ednome.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="edRepitaSenha.Enabled = False";
Debug.ShouldStop(67108864);
parent.mostCurrent._edrepitasenha.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="edSenha.Enabled = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._edsenha.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="edSenha.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(536870912);
parent.mostCurrent._edsenha.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 95;BA.debugLine="edLogin.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._edlogin.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 96;BA.debugLine="edNome.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._ednome.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 97;BA.debugLine="edRepitaSenha.TextColor = Colors.RGB(158, 130";
Debug.ShouldStop(1);
parent.mostCurrent._edrepitasenha.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 99;BA.debugLine="Main.Id_do_Usuario = Result.GetInt(\"ID\")";
Debug.ShouldStop(4);
parent.mostCurrent._main._id_do_usuario /*RemoteObject*/  = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));
 BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(\"Sucesso!\",True)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sucesso!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 102;BA.debugLine="lblCadSalvo.Visible = True";
Debug.ShouldStop(32);
parent.mostCurrent._lblcadsalvo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="panelCadSalvo.Visible = True";
Debug.ShouldStop(64);
parent.mostCurrent._panelcadsalvo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="lblCadSalvo.Text = Result.GetString(\"MENSAGEM";
Debug.ShouldStop(128);
parent.mostCurrent._lblcadsalvo.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 106;BA.debugLine="cadastrouUsuario = True";
Debug.ShouldStop(512);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 107;BA.debugLine="Sleep(1200)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigocadastro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastro", "btsalvar_click"),BA.numberCast(int.class, 1200));
this.state = 34;
return;
case 34:
//C
this.state = 27;
;
 BA.debugLineNum = 109;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 110;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 27:
//C
this.state = 30;
;
 BA.debugLineNum = 112;BA.debugLine="Result.Close";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 114;BA.debugLine="Result.Close";
Debug.ShouldStop(131072);
_result.runVoidMethod ("Close");
 BA.debugLineNum = 115;BA.debugLine="MsgboxAsync(\"Problemas na inserção de dados. \"";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas na inserção de dados. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigocadastro.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigocadastro.processBA);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigocadastro.processBA, e0.toString());}
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
public static RemoteObject  _edrepitasenha_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edRepitaSenha_TextChanged (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,131);
if (RapidSub.canDelegate("edrepitasenha_textchanged")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","edrepitasenha_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 131;BA.debugLine="Sub edRepitaSenha_TextChanged (Old As String, New";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="If New.Length > 8 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 134;BA.debugLine="edRepitaSenha.Text = New.SubString2(0, 8)";
Debug.ShouldStop(32);
codigocadastro.mostCurrent._edrepitasenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 135;BA.debugLine="edRepitaSenha.SelectionStart = 8";
Debug.ShouldStop(64);
codigocadastro.mostCurrent._edrepitasenha.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 8));
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("edSenha_TextChanged (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,123);
if (RapidSub.canDelegate("edsenha_textchanged")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","edsenha_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 123;BA.debugLine="Sub edSenha_TextChanged (Old As String, New As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="If New.Length > 8 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 126;BA.debugLine="edSenha.Text = New.SubString2(0, 8)";
Debug.ShouldStop(536870912);
codigocadastro.mostCurrent._edsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 127;BA.debugLine="edSenha.SelectionStart = 8";
Debug.ShouldStop(1073741824);
codigocadastro.mostCurrent._edsenha.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 8));
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private edNome As EditText";
codigocadastro.mostCurrent._ednome = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private edLogin As EditText";
codigocadastro.mostCurrent._edlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private edSenha As EditText";
codigocadastro.mostCurrent._edsenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private edRepitaSenha As EditText";
codigocadastro.mostCurrent._edrepitasenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private panelCadSalvo As Panel";
codigocadastro.mostCurrent._panelcadsalvo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lblCadSalvo As Label";
codigocadastro.mostCurrent._lblcadsalvo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private funcoes As ClassBancoDados";
codigocadastro.mostCurrent._funcoes = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 21;BA.debugLine="Private lblMostrarSenha As Label";
codigocadastro.mostCurrent._lblmostrarsenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblmostrarsenha_click() throws Exception{
try {
		Debug.PushSubsStack("lblMostrarSenha_Click (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,149);
if (RapidSub.canDelegate("lblmostrarsenha_click")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","lblmostrarsenha_click");}
 BA.debugLineNum = 149;BA.debugLine="Sub lblMostrarSenha_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="If mostrarSenha Then";
Debug.ShouldStop(4194304);
if (codigocadastro._mostrarsenha.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="edSenha.PasswordMode = True";
Debug.ShouldStop(8388608);
codigocadastro.mostCurrent._edsenha.runVoidMethod ("setPasswordMode",codigocadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="mostrarSenha = False";
Debug.ShouldStop(16777216);
codigocadastro._mostrarsenha = codigocadastro.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 154;BA.debugLine="lblMostrarSenha.Text = \"Mostrar senha\"";
Debug.ShouldStop(33554432);
codigocadastro.mostCurrent._lblmostrarsenha.runMethod(true,"setText",BA.ObjectToCharSequence("Mostrar senha"));
 }else {
 BA.debugLineNum = 157;BA.debugLine="edSenha.PasswordMode = False";
Debug.ShouldStop(268435456);
codigocadastro.mostCurrent._edsenha.runVoidMethod ("setPasswordMode",codigocadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 158;BA.debugLine="mostrarSenha = True";
Debug.ShouldStop(536870912);
codigocadastro._mostrarsenha = codigocadastro.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 159;BA.debugLine="lblMostrarSenha.Text = \"Esconder senha\"";
Debug.ShouldStop(1073741824);
codigocadastro.mostCurrent._lblmostrarsenha.runMethod(true,"setText",BA.ObjectToCharSequence("Esconder senha"));
 };
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public cadastrouUsuario As Boolean = False";
codigocadastro._cadastrouusuario = codigocadastro.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 8;BA.debugLine="Private mostrarSenha As Boolean = True";
codigocadastro._mostrarsenha = codigocadastro.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}