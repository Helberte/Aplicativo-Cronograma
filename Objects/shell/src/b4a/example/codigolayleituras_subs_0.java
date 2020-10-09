package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayleituras_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.codigolayleituras parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolayleituras parent;
RemoteObject _firsttime;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayLeiturasTabStrip")),codigolayleituras.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
Debug.ShouldStop(1);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu1")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lendo"))));
 BA.debugLineNum = 34;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
Debug.ShouldStop(2);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu2")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lidos"))));
 BA.debugLineNum = 36;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_lbl")));
 BA.debugLineNum = 38;BA.debugLine="banco.Initialize";
Debug.ShouldStop(32);
parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayleituras.processBA);
 BA.debugLineNum = 40;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
Debug.ShouldStop(128);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 41;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
Debug.ShouldStop(256);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 43;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
Debug.ShouldStop(1024);
parent.mostCurrent._panelnenhumaleitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(4096);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 8;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 48;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 50;BA.debugLine="If Success = False Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 51;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

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
public static void  _complete(RemoteObject _success) throws Exception{
}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,299);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_keypress", _keycode);}
RemoteObject _resp = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 299;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 301;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 303;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
Debug.ShouldStop(16384);
_resp = codigolayleituras.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Deseja realmente sair?")),(Object)(BA.ObjectToCharSequence("Já vai?")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((codigolayleituras.mostCurrent.__c.getField(false,"Null"))),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 305;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_resp,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 307;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 308;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 310;BA.debugLine="KeyCode = 0";
Debug.ShouldStop(2097152);
_keycode = BA.numberCast(int.class, 0);Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 311;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 314;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,76);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) { b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.codigolayleituras parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolayleituras parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 63;BA.debugLine="If CodigoCadastroLivro.cadastrou Or CodigoCadastr";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._codigocadastrolivro._cadastrou /*RemoteObject*/ ) || RemoteObject.solveBoolean(".",parent.mostCurrent._codigocadastro._cadastrouusuario /*RemoteObject*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 64;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 66;BA.debugLine="CodigoCadastro.cadastrouUsuario = False";
Debug.ShouldStop(2);
parent.mostCurrent._codigocadastro._cadastrouusuario /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 67;BA.debugLine="CodigoCadastroLivro.cadastrou = False";
Debug.ShouldStop(4);
parent.mostCurrent._codigocadastrolivro._cadastrou /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 68;BA.debugLine="If Success = False Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 71;BA.debugLine="CodigoCadastroLivro.cadastrou = True";
Debug.ShouldStop(64);
parent.mostCurrent._codigocadastrolivro._cadastrou /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

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
public static RemoteObject  _atualiza_leituras() throws Exception{
try {
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,80);
if (RapidSub.canDelegate("atualiza_leituras")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","atualiza_leituras");}
ResumableSub_Atualiza_leituras rsub = new ResumableSub_Atualiza_leituras(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Atualiza_leituras extends BA.ResumableSub {
public ResumableSub_Atualiza_leituras(b4a.example.codigolayleituras parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolayleituras parent;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _quantidade = RemoteObject.createImmutable(0);
RemoteObject _panels = null;
RemoteObject _listainformacoes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lbltitulolivro = null;
RemoteObject _lbldatacomecoleitura = null;
RemoteObject _lblprevisaotermino = null;
RemoteObject _lblquantidadepaginas = null;
RemoteObject _btanotar = null;
RemoteObject _btlancar = null;
RemoteObject _tamanho_fonte = RemoteObject.createImmutable(0);
RemoteObject _topo = RemoteObject.createImmutable(0);
RemoteObject _topolabel = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _altura = RemoteObject.createImmutable(0);
int step45;
int limit45;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,80);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 82;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 27;
this.catchState = 26;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 26;
 BA.debugLineNum = 84;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(524288);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 86;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(2097152);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 88;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 90;BA.debugLine="Result.NextRow";
Debug.ShouldStop(33554432);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 92;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 107;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 112;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 10;
}else {
this.state = 23;
}}}
if (true) break;

case 6:
//C
this.state = 24;
 BA.debugLineNum = 94;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(536870912);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 97;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
Debug.ShouldStop(1);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 98;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
Debug.ShouldStop(2);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 100;BA.debugLine="scrollView1.Initialize (500)";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 101;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
Debug.ShouldStop(16);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 103;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._lbl_inicial_leitura.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 106;BA.debugLine="Return True";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 24;
 BA.debugLineNum = 108;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(2048);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 111;BA.debugLine="Return True";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 114;BA.debugLine="btAdicionarLeitura.Visible = True";
Debug.ShouldStop(131072);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(524288);
parent.mostCurrent._gradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(parent._cores));
 BA.debugLineNum = 118;BA.debugLine="gradient.CornerRadius = 12";
Debug.ShouldStop(2097152);
parent.mostCurrent._gradient.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 12));
 BA.debugLineNum = 120;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
Debug.ShouldStop(8388608);
_quantidade = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("QUANTIDADE")));Debug.locals.put("quantidade", _quantidade);Debug.locals.put("quantidade", _quantidade);
 BA.debugLineNum = 122;BA.debugLine="Dim panels(quantidade) As Panel";
Debug.ShouldStop(33554432);
_panels = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("panels", _panels);
 BA.debugLineNum = 123;BA.debugLine="Dim listaInformacoes As List";
Debug.ShouldStop(67108864);
_listainformacoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaInformacoes", _listainformacoes);
 BA.debugLineNum = 125;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
Debug.ShouldStop(268435456);
_lbltitulolivro = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblTituloLivro", _lbltitulolivro);
 BA.debugLineNum = 126;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
Debug.ShouldStop(536870912);
_lbldatacomecoleitura = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblDataComecoLeitura", _lbldatacomecoleitura);
 BA.debugLineNum = 127;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
Debug.ShouldStop(1073741824);
_lblprevisaotermino = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblPrevisaoTermino", _lblprevisaotermino);
 BA.debugLineNum = 128;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
Debug.ShouldStop(-2147483648);
_lblquantidadepaginas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblQuantidadePaginas", _lblquantidadepaginas);
 BA.debugLineNum = 130;BA.debugLine="Dim btAnotar(quantidade) As Button";
Debug.ShouldStop(2);
_btanotar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btAnotar", _btanotar);
 BA.debugLineNum = 131;BA.debugLine="Dim btLancar(quantidade) As Button";
Debug.ShouldStop(4);
_btlancar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btLancar", _btlancar);
 BA.debugLineNum = 133;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
Debug.ShouldStop(16);
_tamanho_fonte = BA.numberCast(int.class, 17.5);Debug.locals.put("tamanho_fonte", _tamanho_fonte);Debug.locals.put("tamanho_fonte", _tamanho_fonte);
 BA.debugLineNum = 135;BA.debugLine="Dim topo As Int = 1%y";
Debug.ShouldStop(64);
_topo = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 136;BA.debugLine="Dim topoLabel As Int = 1%y";
Debug.ShouldStop(128);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 138;BA.debugLine="If temPanel Then";
Debug.ShouldStop(512);
if (true) break;

case 11:
//if
this.state = 14;
if (parent._tempanel.<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 139;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(1024);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 140;BA.debugLine="temPanel = False";
Debug.ShouldStop(2048);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
;
 BA.debugLineNum = 143;BA.debugLine="If temPanel = False Then";
Debug.ShouldStop(16384);

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent._tempanel,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 145;BA.debugLine="temPanel = True";
Debug.ShouldStop(65536);
parent._tempanel = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 146;BA.debugLine="scrollView1.Initialize( 500 )";
Debug.ShouldStop(131072);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 147;BA.debugLine="listaInformacoes.Initialize";
Debug.ShouldStop(262144);
_listainformacoes.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
Debug.ShouldStop(1048576);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent._btadicionarleitura.runMethod(true,"getTop")));
 BA.debugLineNum = 152;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 153;BA.debugLine="For i = 0 To panels.Length - 1";
Debug.ShouldStop(16777216);
if (true) break;

case 17:
//for
this.state = 20;
step45 = 1;
limit45 = RemoteObject.solve(new RemoteObject[] {_panels.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if ((step45 > 0 && _i.<Integer>get().intValue() <= limit45) || (step45 < 0 && _i.<Integer>get().intValue() >= limit45)) this.state = 19;
if (true) break;

case 30:
//C
this.state = 29;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step45)) ;
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 30;
 BA.debugLineNum = 155;BA.debugLine="topoLabel = 1%y";
Debug.ShouldStop(67108864);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 156;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
Debug.ShouldStop(134217728);
_panels.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_panels")));
 BA.debugLineNum = 158;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
Debug.ShouldStop(536870912);
_lbltitulolivro.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 159;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
Debug.ShouldStop(1073741824);
_lbldatacomecoleitura.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 160;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_lblprevisaotermino.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 161;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
Debug.ShouldStop(1);
_lblquantidadepaginas.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 163;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
Debug.ShouldStop(4);
_btanotar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btAnotar")));
 BA.debugLineNum = 164;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
Debug.ShouldStop(8);
_btlancar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btLancar")));
 BA.debugLineNum = 166;BA.debugLine="panels(i).Background = gradient";
Debug.ShouldStop(32);
_panels.getArrayElement(false,_i).runMethod(false,"setBackground",(parent.mostCurrent._gradient.getObject()));
 BA.debugLineNum = 167;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
Debug.ShouldStop(64);
_panels.getArrayElement(false,_i).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 169;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
Debug.ShouldStop(256);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_panels.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topo),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 171;BA.debugLine="lblTituloLivro(i).Text = Result.GetString(\"no";
Debug.ShouldStop(1024);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome")))));
 BA.debugLineNum = 172;BA.debugLine="lblTituloLivro(i).TextColor = Colors.RGB(189,";
Debug.ShouldStop(2048);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 189)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 173;BA.debugLine="lblTituloLivro(i).TextSize = 23";
Debug.ShouldStop(4096);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 23));
 BA.debugLineNum = 176;BA.debugLine="lblDataComecoLeitura(i).Text = \"Começei ler d";
Debug.ShouldStop(32768);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Começei ler dia "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_inicial"))))));
 BA.debugLineNum = 177;BA.debugLine="lblDataComecoLeitura(i).TextColor = Colors.RG";
Debug.ShouldStop(65536);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 178;BA.debugLine="lblDataComecoLeitura(i).TextSize = tamanho_fo";
Debug.ShouldStop(131072);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 181;BA.debugLine="lblPrevisaoTermino(i).Text = \"Previsão de Tér";
Debug.ShouldStop(1048576);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Previsão de Término "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_prevista_final"))))));
 BA.debugLineNum = 182;BA.debugLine="lblPrevisaoTermino(i).TextColor = Colors.RGB(";
Debug.ShouldStop(2097152);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 183;BA.debugLine="lblPrevisaoTermino(i).TextSize = tamanho_font";
Debug.ShouldStop(4194304);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 186;BA.debugLine="lblQuantidadePaginas(i).Text = Result.GetStri";
Debug.ShouldStop(33554432);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable(" "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable(" de "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("quantidade_paginas"))))));
 BA.debugLineNum = 187;BA.debugLine="lblQuantidadePaginas(i).TextColor = Colors.RG";
Debug.ShouldStop(67108864);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 188;BA.debugLine="lblQuantidadePaginas(i).TextSize = tamanho_fo";
Debug.ShouldStop(134217728);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 191;BA.debugLine="Dim altura As Int = 3.5%y";
Debug.ShouldStop(1073741824);
_altura = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.5)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("altura", _altura);Debug.locals.put("altura", _altura);
 BA.debugLineNum = 192;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
Debug.ShouldStop(-2147483648);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lbltitulolivro.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 193;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
Debug.ShouldStop(1);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 194;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
Debug.ShouldStop(2);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lbldatacomecoleitura.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 195;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(4);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 196;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
Debug.ShouldStop(8);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lblprevisaotermino.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 197;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(16);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 198;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
Debug.ShouldStop(32);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lblquantidadepaginas.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 199;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
Debug.ShouldStop(64);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 201;BA.debugLine="btAnotar(i).Tag = i";
Debug.ShouldStop(256);
_btanotar.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 205;BA.debugLine="listaInformacoes.Add(\" '\" & Result.GetString(";
Debug.ShouldStop(4096);
_listainformacoes.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" '"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("quantidade_paginas"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fk_id_Livro"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("usuarioNome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable("|")))));
 BA.debugLineNum = 211;BA.debugLine="File.WriteList(File.DirInternal, \"Informacoes";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("Informacoes.txt")),(Object)(_listainformacoes));
 BA.debugLineNum = 213;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
Debug.ShouldStop(1048576);
_btanotar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Anotar"));
 BA.debugLineNum = 214;BA.debugLine="btAnotar(i).TextSize = 16";
Debug.ShouldStop(2097152);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 215;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(4194304);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 216;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
Debug.ShouldStop(8388608);
_btanotar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 217;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
Debug.ShouldStop(16777216);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btanotar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 219;BA.debugLine="btLancar(i).Tag = i";
Debug.ShouldStop(67108864);
_btlancar.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 221;BA.debugLine="btLancar(i).Text = \"Lançar\"";
Debug.ShouldStop(268435456);
_btlancar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Lançar"));
 BA.debugLineNum = 222;BA.debugLine="btLancar(i).TextSize = 16";
Debug.ShouldStop(536870912);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 223;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(1073741824);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 224;BA.debugLine="btLancar(i).Color = Colors.Transparent";
Debug.ShouldStop(-2147483648);
_btlancar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 225;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
Debug.ShouldStop(1);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btlancar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 228;BA.debugLine="topo = topo + 25%y + 10dip";
Debug.ShouldStop(8);
_topo = RemoteObject.solve(new RemoteObject[] {_topo,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 230;BA.debugLine="Result.NextRow";
Debug.ShouldStop(32);
_result.runVoidMethod ("NextRow");
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 232;BA.debugLine="scrollView1.Panel.Height = topo";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",_topo);
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 234;BA.debugLine="Return True";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 236;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 237;BA.debugLine="Return False";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 24:
//C
this.state = 27;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 240;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 241;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e0.toString());}
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
public static RemoteObject  _btadicionarleitura_click() throws Exception{
try {
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,291);
if (RapidSub.canDelegate("btadicionarleitura_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btadicionarleitura_click");}
 BA.debugLineNum = 291;BA.debugLine="Sub btAdicionarLeitura_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="StartActivity(CodigoCadastroLivro)";
Debug.ShouldStop(8);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigocadastrolivro.getObject())));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_btanotar_click() throws Exception{
try {
		Debug.PushSubsStack("Event_btAnotar_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,246);
if (RapidSub.canDelegate("event_btanotar_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_btanotar_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _informacoes = RemoteObject.createImmutable("");
RemoteObject _qtpag = RemoteObject.createImmutable(0);
RemoteObject _codigolivro = RemoteObject.createImmutable(0);
RemoteObject _nomeusuario = RemoteObject.createImmutable("");
RemoteObject _nomelivro = RemoteObject.createImmutable("");
RemoteObject _tipoleitura = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 246;BA.debugLine="Sub Event_btAnotar_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 248;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(8388608);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 250;BA.debugLine="Dim informacoes 		As String";
Debug.ShouldStop(33554432);
_informacoes = RemoteObject.createImmutable("");Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 251;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
Debug.ShouldStop(67108864);
_qtpag = RemoteObject.createImmutable(0);Debug.locals.put("qtPag", _qtpag);
_codigolivro = RemoteObject.createImmutable(0);Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 252;BA.debugLine="Dim nomeUsuario 		As String";
Debug.ShouldStop(134217728);
_nomeusuario = RemoteObject.createImmutable("");Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 253;BA.debugLine="Dim nomeLivro 			As String";
Debug.ShouldStop(268435456);
_nomelivro = RemoteObject.createImmutable("");Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 254;BA.debugLine="Dim tipoLeitura			As String";
Debug.ShouldStop(536870912);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 256;BA.debugLine="Dim lista As List";
Debug.ShouldStop(-2147483648);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 257;BA.debugLine="lista.Initialize";
Debug.ShouldStop(1);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 259;BA.debugLine="If File.Exists(File.DirInternal, \"Informacoes.txt";
Debug.ShouldStop(4);
if (codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Informacoes.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 261;BA.debugLine="lista = File.ReadList(File.DirInternal, \"Informa";
Debug.ShouldStop(16);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Informacoes.txt")));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 263;BA.debugLine="informacoes = lista.Get(b.Tag)";
Debug.ShouldStop(64);
_informacoes = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 265;BA.debugLine="nomeLivro =   informacoes.SubString2(informacoes";
Debug.ShouldStop(256);
_nomelivro = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 266;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
Debug.ShouldStop(512);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 268;BA.debugLine="qtPag = 	  informacoes.SubString2(informacoes.In";
Debug.ShouldStop(2048);
_qtpag = BA.numberCast(int.class, _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|"))))));Debug.locals.put("qtPag", _qtpag);
 BA.debugLineNum = 269;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
Debug.ShouldStop(4096);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 271;BA.debugLine="codigoLivro = informacoes.SubString2(informacoes";
Debug.ShouldStop(16384);
_codigolivro = BA.numberCast(int.class, _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|"))))));Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 272;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
Debug.ShouldStop(32768);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 274;BA.debugLine="nomeUsuario = informacoes.SubString2(informacoes";
Debug.ShouldStop(131072);
_nomeusuario = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 275;BA.debugLine="informacoes = informacoes.SubString2(informacoes";
Debug.ShouldStop(262144);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 277;BA.debugLine="tipoLeitura = informacoes.SubString2(informacoes";
Debug.ShouldStop(1048576);
_tipoleitura = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 279;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
Debug.ShouldStop(4194304);
codigolayleituras.mostCurrent._codigolayanotacao._codigolivro /*RemoteObject*/  = _codigolivro;
 BA.debugLineNum = 280;BA.debugLine="CodigoLayAnotacao.qtPaginas = qtPag";
Debug.ShouldStop(8388608);
codigolayleituras.mostCurrent._codigolayanotacao._qtpaginas /*RemoteObject*/  = _qtpag;
 BA.debugLineNum = 281;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
Debug.ShouldStop(16777216);
codigolayleituras.mostCurrent._codigolayanotacao._nomedolivro /*RemoteObject*/  = _nomelivro;
 BA.debugLineNum = 282;BA.debugLine="CodigoLayAnotacao.nomeUsuario = nomeUsuario";
Debug.ShouldStop(33554432);
codigolayleituras.mostCurrent._codigolayanotacao._nomeusuario /*RemoteObject*/  = _nomeusuario;
 BA.debugLineNum = 283;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent._codigolayanotacao._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 285;BA.debugLine="StartActivity(CodigoLayAnotacao)";
Debug.ShouldStop(268435456);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolayanotacao.getObject())));
 }else {
 BA.debugLineNum = 287;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(1073741824);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_lbl_click() throws Exception{
try {
		Debug.PushSubsStack("Event_lbl_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,57);
if (RapidSub.canDelegate("event_lbl_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_lbl_click");}
 BA.debugLineNum = 57;BA.debugLine="Sub Event_lbl_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(CodigoCadastroLivro)";
Debug.ShouldStop(33554432);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigocadastrolivro.getObject())));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
 //BA.debugLineNum = 12;BA.debugLine="Private banco As ClassBancoDados";
codigolayleituras.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 13;BA.debugLine="Private TabStrip As TabStrip";
codigolayleituras.mostCurrent._tabstrip = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 15;BA.debugLine="Dim lbl_Inicial_Leitura As Label";
codigolayleituras.mostCurrent._lbl_inicial_leitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim scrollView1 As ScrollView";
codigolayleituras.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim gradient As GradientDrawable";
codigolayleituras.mostCurrent._gradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");
 //BA.debugLineNum = 20;BA.debugLine="Dim panelNenhumaLeitura As Panel";
codigolayleituras.mostCurrent._panelnenhumaleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim cores(2) As Int";
codigolayleituras._cores = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});
 //BA.debugLineNum = 23;BA.debugLine="Private btAdicionarLeitura As Button";
codigolayleituras.mostCurrent._btadicionarleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Panel_lendo As Panel";
codigolayleituras.mostCurrent._panel_lendo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim temPanel As Boolean = False";
codigolayleituras._tempanel = codigolayleituras.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabstrip_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,295);
if (RapidSub.canDelegate("tabstrip_pageselected")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","tabstrip_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 295;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}