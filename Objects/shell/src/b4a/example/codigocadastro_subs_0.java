package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigocadastro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"LayoutCadastro\")";
Debug.ShouldStop(4194304);
codigocadastro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayoutCadastro")),codigocadastro.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(16777216);
codigocadastro.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 27;BA.debugLine="panelCadSalvo.Visible = False";
Debug.ShouldStop(67108864);
codigocadastro.mostCurrent._panelcadsalvo.runMethod(true,"setVisible",codigocadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="lblCadSalvo.Visible = False";
Debug.ShouldStop(134217728);
codigocadastro.mostCurrent._lblcadsalvo.runMethod(true,"setVisible",codigocadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="funcoes.Initialize";
Debug.ShouldStop(268435456);
codigocadastro.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigocadastro.processBA);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btSalvar_Click (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,40);
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
		Debug.PushSubsStack("btSalvar_Click (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 42;BA.debugLine="If edNome.Text.Trim = \"\" Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._ednome.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 46;BA.debugLine="Else If edLogin.Text.Trim = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edlogin.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 50;BA.debugLine="Else If edSenha.Text.Trim = \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 32;
 BA.debugLineNum = 43;BA.debugLine="MsgboxAsync(\"Falta o nome\",\"Está apressado?\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta o nome")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 44;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(2048);
parent.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 if (true) break;

case 5:
//C
this.state = 32;
 BA.debugLineNum = 47;BA.debugLine="MsgboxAsync(\"Falta o login\",\"Está apressado?\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta o login")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 48;BA.debugLine="edLogin.RequestFocus";
Debug.ShouldStop(32768);
parent.mostCurrent._edlogin.runVoidMethod ("RequestFocus");
 if (true) break;

case 7:
//C
this.state = 32;
 BA.debugLineNum = 51;BA.debugLine="MsgboxAsync(\"Falta a senha\",\"Está apressado?\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Falta a senha")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Está apressado?"))),codigocadastro.processBA);
 BA.debugLineNum = 52;BA.debugLine="edSenha.RequestFocus";
Debug.ShouldStop(524288);
parent.mostCurrent._edsenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 56;BA.debugLine="If edRepitaSenha.Text.Trim.Length < 8 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 31;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._edrepitasenha.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 60;BA.debugLine="Else If edSenha.Text.Trim <> edRepitaSenha.Text.";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",parent.mostCurrent._edsenha.runMethod(true,"getText").runMethod(true,"trim"),parent.mostCurrent._edrepitasenha.runMethod(true,"getText").runMethod(true,"trim"))) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 12:
//C
this.state = 31;
 BA.debugLineNum = 57;BA.debugLine="MsgboxAsync(\"Sua senha precisa ter no mínimo 8";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Sua senha precisa ter no mínimo 8 dígitos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Senha inválida!"))),codigocadastro.processBA);
 BA.debugLineNum = 58;BA.debugLine="edRepitaSenha.RequestFocus";
Debug.ShouldStop(33554432);
parent.mostCurrent._edrepitasenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 14:
//C
this.state = 31;
 BA.debugLineNum = 61;BA.debugLine="MsgboxAsync(\"As senhas não coinsidem.\",\"Atenção";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("As senhas não coinsidem.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigocadastro.processBA);
 BA.debugLineNum = 62;BA.debugLine="edRepitaSenha.Text = \"\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._edrepitasenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 63;BA.debugLine="edSenha.RequestFocus";
Debug.ShouldStop(1073741824);
parent.mostCurrent._edsenha.runVoidMethod ("RequestFocus");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 66;BA.debugLine="Try";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 68;BA.debugLine="Dim cmd As String = \"exec sp_cad_usuario_crono";
Debug.ShouldStop(8);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_cad_usuario_cronograma '"),parent.mostCurrent._ednome.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edlogin.runMethod(true,"getText"),RemoteObject.createImmutable("', '"),parent.mostCurrent._edsenha.runMethod(true,"getText"),RemoteObject.createImmutable("' "));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 72;BA.debugLine="Wait For (funcoes.Insert_Consulta(cmd)) Comple";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigocadastro.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastro", "btsalvar_click"), parent.mostCurrent._funcoes.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 74;BA.debugLine="Result.NextRow";
Debug.ShouldStop(512);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 76;BA.debugLine="If Result = Null Then";
Debug.ShouldStop(2048);
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean("n",_result)) { 
this.state = 22;
}else 
{ BA.debugLineNum = 80;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 24;
}else {
this.state = 26;
}}
if (true) break;

case 22:
//C
this.state = 27;
 BA.debugLineNum = 78;BA.debugLine="cadastrouUsuario = False";
Debug.ShouldStop(8192);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 79;BA.debugLine="MsgboxAsync(\"Problemas na conexão com banco d";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas na conexão com banco de dados. "),parent.mostCurrent.__c.runMethod(false,"LastException",codigocadastro.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção!"))),codigocadastro.processBA);
 if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 82;BA.debugLine="cadastrouUsuario = False";
Debug.ShouldStop(131072);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 83;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"Op";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ops!"))),codigocadastro.processBA);
 BA.debugLineNum = 84;BA.debugLine="edNome.RequestFocus";
Debug.ShouldStop(524288);
parent.mostCurrent._ednome.runVoidMethod ("RequestFocus");
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 87;BA.debugLine="edLogin.Enabled = False";
Debug.ShouldStop(4194304);
parent.mostCurrent._edlogin.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="edNome.Enabled = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._ednome.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="edRepitaSenha.Enabled = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._edrepitasenha.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="edSenha.Enabled = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._edsenha.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="edSenha.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(134217728);
parent.mostCurrent._edsenha.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 93;BA.debugLine="edLogin.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(268435456);
parent.mostCurrent._edlogin.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 94;BA.debugLine="edNome.TextColor = Colors.RGB(158, 130, 130)";
Debug.ShouldStop(536870912);
parent.mostCurrent._ednome.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 95;BA.debugLine="edRepitaSenha.TextColor = Colors.RGB(158, 130";
Debug.ShouldStop(1073741824);
parent.mostCurrent._edrepitasenha.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 158)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 97;BA.debugLine="Main.Id_do_Usuario = Result.GetInt(\"ID\")";
Debug.ShouldStop(1);
parent.mostCurrent._main._id_do_usuario /*RemoteObject*/  = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));
 BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"Sucesso!\",True)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sucesso!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 100;BA.debugLine="lblCadSalvo.Visible = True";
Debug.ShouldStop(8);
parent.mostCurrent._lblcadsalvo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="panelCadSalvo.Visible = True";
Debug.ShouldStop(16);
parent.mostCurrent._panelcadsalvo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="lblCadSalvo.Text = Result.GetString(\"MENSAGEM";
Debug.ShouldStop(32);
parent.mostCurrent._lblcadsalvo.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 104;BA.debugLine="cadastrouUsuario = True";
Debug.ShouldStop(128);
parent._cadastrouusuario = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 105;BA.debugLine="Sleep(1200)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",codigocadastro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigocadastro", "btsalvar_click"),BA.numberCast(int.class, 1200));
this.state = 34;
return;
case 34:
//C
this.state = 27;
;
 BA.debugLineNum = 107;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",codigocadastro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 108;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 27:
//C
this.state = 30;
;
 BA.debugLineNum = 110;BA.debugLine="Result.Close";
Debug.ShouldStop(8192);
_result.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 112;BA.debugLine="Result.Close";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Close");
 BA.debugLineNum = 113;BA.debugLine="MsgboxAsync(\"Problemas na inserção de dados. \"";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("edRepitaSenha_TextChanged (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,129);
if (RapidSub.canDelegate("edrepitasenha_textchanged")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","edrepitasenha_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 129;BA.debugLine="Sub edRepitaSenha_TextChanged (Old As String, New";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="If New.Length > 8 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 132;BA.debugLine="edRepitaSenha.Text = New.SubString2(0, 8)";
Debug.ShouldStop(8);
codigocadastro.mostCurrent._edrepitasenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 133;BA.debugLine="edRepitaSenha.SelectionStart = 8";
Debug.ShouldStop(16);
codigocadastro.mostCurrent._edrepitasenha.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 8));
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("edSenha_TextChanged (codigocadastro) ","codigocadastro",1,codigocadastro.mostCurrent.activityBA,codigocadastro.mostCurrent,121);
if (RapidSub.canDelegate("edsenha_textchanged")) { return b4a.example.codigocadastro.remoteMe.runUserSub(false, "codigocadastro","edsenha_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 121;BA.debugLine="Sub edSenha_TextChanged (Old As String, New As Str";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="If New.Length > 8 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 124;BA.debugLine="edSenha.Text = New.SubString2(0, 8)";
Debug.ShouldStop(134217728);
codigocadastro.mostCurrent._edsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 125;BA.debugLine="edSenha.SelectionStart = 8";
Debug.ShouldStop(268435456);
codigocadastro.mostCurrent._edsenha.runMethod(true,"setSelectionStart",BA.numberCast(int.class, 8));
 };
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private edNome As EditText";
codigocadastro.mostCurrent._ednome = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private edLogin As EditText";
codigocadastro.mostCurrent._edlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private edSenha As EditText";
codigocadastro.mostCurrent._edsenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private edRepitaSenha As EditText";
codigocadastro.mostCurrent._edrepitasenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private panelCadSalvo As Panel";
codigocadastro.mostCurrent._panelcadsalvo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private lblCadSalvo As Label";
codigocadastro.mostCurrent._lblcadsalvo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private funcoes As ClassBancoDados";
codigocadastro.mostCurrent._funcoes = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public cadastrouUsuario as Boolean = False";
codigocadastro._cadastrouusuario = codigocadastro.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}