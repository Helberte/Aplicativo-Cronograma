package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayleituras_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,31);
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
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
Debug.ShouldStop(1);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayLeiturasTabStrip")),codigolayleituras.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
Debug.ShouldStop(2);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu1")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lendo"))));
 BA.debugLineNum = 35;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
Debug.ShouldStop(4);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu2")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lidos"))));
 BA.debugLineNum = 37;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_lbl")));
 BA.debugLineNum = 39;BA.debugLine="banco.Initialize";
Debug.ShouldStop(64);
parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayleituras.processBA);
 BA.debugLineNum = 41;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
Debug.ShouldStop(256);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 42;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
Debug.ShouldStop(512);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 44;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
Debug.ShouldStop(2048);
parent.mostCurrent._panelnenhumaleitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(8192);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 49;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 51;BA.debugLine="If Success = False Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 52;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_KeyPress (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,359);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_keypress", _keycode);}
RemoteObject _resp = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 359;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 361;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 363;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
Debug.ShouldStop(1024);
_resp = codigolayleituras.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Deseja realmente sair?")),(Object)(BA.ObjectToCharSequence("Já vai?")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((codigolayleituras.mostCurrent.__c.getField(false,"Null"))),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 365;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_resp,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 367;BA.debugLine="ExitApplication";
Debug.ShouldStop(16384);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 368;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 370;BA.debugLine="KeyCode = 0";
Debug.ShouldStop(131072);
_keycode = BA.numberCast(int.class, 0);Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 371;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 374;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,75);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 75;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
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
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,62);
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
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,62);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 64;BA.debugLine="If Main.CadastrouAlgo Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._main._cadastroualgo /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 65;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 67;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(4);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
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
 BA.debugLineNum = 69;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 70;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(32);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
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
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,79);
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
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,79);
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
 BA.debugLineNum = 81;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 83;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(262144);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 85;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(1048576);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 87;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 89;BA.debugLine="Result.NextRow";
Debug.ShouldStop(16777216);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 91;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 106;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 111;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 10;
}else {
this.state = 23;
}}}
if (true) break;

case 6:
//C
this.state = 24;
 BA.debugLineNum = 93;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 96;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 97;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
Debug.ShouldStop(1);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 99;BA.debugLine="scrollView1.Initialize (500)";
Debug.ShouldStop(4);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 100;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
Debug.ShouldStop(8);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 102;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
Debug.ShouldStop(32);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._lbl_inicial_leitura.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 105;BA.debugLine="Return True";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 24;
 BA.debugLineNum = 107;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(1024);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 110;BA.debugLine="Return True";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 113;BA.debugLine="btAdicionarLeitura.Visible = True";
Debug.ShouldStop(65536);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(262144);
parent.mostCurrent._gradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(parent._cores));
 BA.debugLineNum = 117;BA.debugLine="gradient.CornerRadius = 12";
Debug.ShouldStop(1048576);
parent.mostCurrent._gradient.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 12));
 BA.debugLineNum = 119;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
Debug.ShouldStop(4194304);
_quantidade = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("QUANTIDADE")));Debug.locals.put("quantidade", _quantidade);Debug.locals.put("quantidade", _quantidade);
 BA.debugLineNum = 121;BA.debugLine="Dim panels(quantidade) As Panel";
Debug.ShouldStop(16777216);
_panels = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("panels", _panels);
 BA.debugLineNum = 122;BA.debugLine="Dim listaInformacoes As List";
Debug.ShouldStop(33554432);
_listainformacoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaInformacoes", _listainformacoes);
 BA.debugLineNum = 124;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
Debug.ShouldStop(134217728);
_lbltitulolivro = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblTituloLivro", _lbltitulolivro);
 BA.debugLineNum = 125;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
Debug.ShouldStop(268435456);
_lbldatacomecoleitura = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblDataComecoLeitura", _lbldatacomecoleitura);
 BA.debugLineNum = 126;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
Debug.ShouldStop(536870912);
_lblprevisaotermino = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblPrevisaoTermino", _lblprevisaotermino);
 BA.debugLineNum = 127;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
Debug.ShouldStop(1073741824);
_lblquantidadepaginas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblQuantidadePaginas", _lblquantidadepaginas);
 BA.debugLineNum = 129;BA.debugLine="Dim btAnotar(quantidade) As Button";
Debug.ShouldStop(1);
_btanotar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btAnotar", _btanotar);
 BA.debugLineNum = 130;BA.debugLine="Dim btLancar(quantidade) As Button";
Debug.ShouldStop(2);
_btlancar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btLancar", _btlancar);
 BA.debugLineNum = 132;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
Debug.ShouldStop(8);
_tamanho_fonte = BA.numberCast(int.class, 17.5);Debug.locals.put("tamanho_fonte", _tamanho_fonte);Debug.locals.put("tamanho_fonte", _tamanho_fonte);
 BA.debugLineNum = 134;BA.debugLine="Dim topo As Int = 1%y";
Debug.ShouldStop(32);
_topo = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 135;BA.debugLine="Dim topoLabel As Int = 1%y";
Debug.ShouldStop(64);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 137;BA.debugLine="If temPanel Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 138;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(512);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 139;BA.debugLine="temPanel = False";
Debug.ShouldStop(1024);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
;
 BA.debugLineNum = 142;BA.debugLine="If temPanel = False Then";
Debug.ShouldStop(8192);

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent._tempanel,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 144;BA.debugLine="temPanel = True";
Debug.ShouldStop(32768);
parent._tempanel = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 145;BA.debugLine="scrollView1.Initialize( 500 )";
Debug.ShouldStop(65536);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 146;BA.debugLine="listaInformacoes.Initialize";
Debug.ShouldStop(131072);
_listainformacoes.runVoidMethod ("Initialize");
 BA.debugLineNum = 148;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
Debug.ShouldStop(524288);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent._btadicionarleitura.runMethod(true,"getTop")));
 BA.debugLineNum = 151;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4194304);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 152;BA.debugLine="For i = 0 To panels.Length - 1";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 154;BA.debugLine="topoLabel = 1%y";
Debug.ShouldStop(33554432);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 155;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
Debug.ShouldStop(67108864);
_panels.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_panels")));
 BA.debugLineNum = 157;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
Debug.ShouldStop(268435456);
_lbltitulolivro.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 158;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
Debug.ShouldStop(536870912);
_lbldatacomecoleitura.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 159;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
Debug.ShouldStop(1073741824);
_lblprevisaotermino.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 160;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_lblquantidadepaginas.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 162;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
Debug.ShouldStop(2);
_btanotar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btAnotar")));
 BA.debugLineNum = 163;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
Debug.ShouldStop(4);
_btlancar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btLancar")));
 BA.debugLineNum = 165;BA.debugLine="panels(i).Background = gradient";
Debug.ShouldStop(16);
_panels.getArrayElement(false,_i).runMethod(false,"setBackground",(parent.mostCurrent._gradient.getObject()));
 BA.debugLineNum = 166;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
Debug.ShouldStop(32);
_panels.getArrayElement(false,_i).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 167;BA.debugLine="panels(i).Elevation = 3dip";
Debug.ShouldStop(64);
_panels.getArrayElement(false,_i).runMethod(true,"setElevation",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
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
 BA.debugLineNum = 206;BA.debugLine="listaInformacoes.Add(\"'\" & Result.GetString(\"";
Debug.ShouldStop(8192);
_listainformacoes.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("quantidade_paginas"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fk_id_Livro"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("usuarioNome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("meta"))),RemoteObject.createImmutable("|")))));
 BA.debugLineNum = 214;BA.debugLine="tamanhoLista = 7";
Debug.ShouldStop(2097152);
parent._tamanholista = BA.numberCast(int.class, 7);
 BA.debugLineNum = 219;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
Debug.ShouldStop(67108864);
_btanotar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Anotar"));
 BA.debugLineNum = 220;BA.debugLine="btAnotar(i).TextSize = 16";
Debug.ShouldStop(134217728);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 221;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(268435456);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 222;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
Debug.ShouldStop(536870912);
_btanotar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 223;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
Debug.ShouldStop(1073741824);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btanotar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 225;BA.debugLine="btLancar(i).Tag = i";
Debug.ShouldStop(1);
_btlancar.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 227;BA.debugLine="btLancar(i).Text = \"Lançar\"";
Debug.ShouldStop(4);
_btlancar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Lançar"));
 BA.debugLineNum = 228;BA.debugLine="btLancar(i).TextSize = 16";
Debug.ShouldStop(8);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 229;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(16);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 230;BA.debugLine="btLancar(i).Color = Colors.Transparent";
Debug.ShouldStop(32);
_btlancar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 231;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
Debug.ShouldStop(64);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btlancar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 233;BA.debugLine="topo = topo + 25%y + 10dip";
Debug.ShouldStop(256);
_topo = RemoteObject.solve(new RemoteObject[] {_topo,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 235;BA.debugLine="scrollView1.Panel.Height = topo";
Debug.ShouldStop(1024);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",_topo);
 BA.debugLineNum = 236;BA.debugLine="Result.NextRow";
Debug.ShouldStop(2048);
_result.runVoidMethod ("NextRow");
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 238;BA.debugLine="File.WriteList(File.DirInternal, nomeArquivo,";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent.mostCurrent._nomearquivo),(Object)(_listainformacoes));
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 241;BA.debugLine="Return True";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 243;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 244;BA.debugLine="Return False";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 247;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 248;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,351);
if (RapidSub.canDelegate("btadicionarleitura_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btadicionarleitura_click");}
 BA.debugLineNum = 351;BA.debugLine="Sub btAdicionarLeitura_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="StartActivity(act_TelaCadastro)";
Debug.ShouldStop(-2147483648);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._act_telacadastro.getObject())));
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Event_btAnotar_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,252);
if (RapidSub.canDelegate("event_btanotar_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_btanotar_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _informacoes = RemoteObject.createImmutable("");
RemoteObject _qtpag = RemoteObject.createImmutable(0);
RemoteObject _codigolivro = RemoteObject.createImmutable(0);
RemoteObject _nomelivro = RemoteObject.createImmutable("");
RemoteObject _tipoleitura = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
RemoteObject _coluna = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 252;BA.debugLine="Sub Event_btAnotar_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 254;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(536870912);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 256;BA.debugLine="Dim informacoes 		As String";
Debug.ShouldStop(-2147483648);
_informacoes = RemoteObject.createImmutable("");Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 257;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
Debug.ShouldStop(1);
_qtpag = RemoteObject.createImmutable(0);Debug.locals.put("qtPag", _qtpag);
_codigolivro = RemoteObject.createImmutable(0);Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 258;BA.debugLine="Dim nomeLivro 			As String";
Debug.ShouldStop(2);
_nomelivro = RemoteObject.createImmutable("");Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 259;BA.debugLine="Dim tipoLeitura			As String";
Debug.ShouldStop(4);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 261;BA.debugLine="Dim lista As List";
Debug.ShouldStop(16);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 262;BA.debugLine="lista.Initialize";
Debug.ShouldStop(32);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 264;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 265;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(256);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 266;BA.debugLine="informacoes = lista.Get(b.Tag)";
Debug.ShouldStop(512);
_informacoes = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 268;BA.debugLine="Dim cols(tamanhoLista), coluna As String";
Debug.ShouldStop(2048);
_cols = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cols", _cols);
_coluna = RemoteObject.createImmutable("");Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 270;BA.debugLine="For i = 0 To cols.Length - 1";
Debug.ShouldStop(8192);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cols.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 272;BA.debugLine="coluna 	= informacoes.SubString2(informacoes.In";
Debug.ShouldStop(32768);
_coluna = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 273;BA.debugLine="informacoes = informacoes.SubString2(informacoe";
Debug.ShouldStop(65536);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 275;BA.debugLine="cols(i) = coluna";
Debug.ShouldStop(262144);
_cols.setArrayElement (_coluna,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 278;BA.debugLine="nomeLivro = cols(0)";
Debug.ShouldStop(2097152);
_nomelivro = _cols.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 279;BA.debugLine="qtPag = cols(1)";
Debug.ShouldStop(4194304);
_qtpag = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("qtPag", _qtpag);
 BA.debugLineNum = 280;BA.debugLine="codigoLivro = cols(2)";
Debug.ShouldStop(8388608);
_codigolivro = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 2)));Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 281;BA.debugLine="tipoLeitura = cols(4)";
Debug.ShouldStop(16777216);
_tipoleitura = _cols.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 283;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent._codigolayanotacao._codigolivro /*RemoteObject*/  = _codigolivro;
 BA.debugLineNum = 284;BA.debugLine="CodigoLayAnotacao.qtPaginas   =	qtPag";
Debug.ShouldStop(134217728);
codigolayleituras.mostCurrent._codigolayanotacao._qtpaginas /*RemoteObject*/  = _qtpag;
 BA.debugLineNum = 285;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
Debug.ShouldStop(268435456);
codigolayleituras.mostCurrent._codigolayanotacao._nomedolivro /*RemoteObject*/  = _nomelivro;
 BA.debugLineNum = 286;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
Debug.ShouldStop(536870912);
codigolayleituras.mostCurrent._codigolayanotacao._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 288;BA.debugLine="StartActivity(CodigoLayAnotacao)";
Debug.ShouldStop(-2147483648);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolayanotacao.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e27.toString()); BA.debugLineNum = 290;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(2);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_btlancar_click() throws Exception{
try {
		Debug.PushSubsStack("Event_btLancar_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,294);
if (RapidSub.canDelegate("event_btlancar_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_btlancar_click");}
RemoteObject _titulolivro = RemoteObject.createImmutable("");
RemoteObject _nomeusuario = RemoteObject.createImmutable("");
RemoteObject _paginasatuais = RemoteObject.createImmutable("");
RemoteObject _totalpaginas = RemoteObject.createImmutable("");
RemoteObject _meta = RemoteObject.createImmutable("");
RemoteObject _idlivro = RemoteObject.createImmutable("");
RemoteObject _tipoleitura = RemoteObject.createImmutable("");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colunavalor = RemoteObject.createImmutable("");
RemoteObject _valorsalvo = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _testearray = null;
int _coluna = 0;
 BA.debugLineNum = 294;BA.debugLine="Sub Event_btLancar_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 296;BA.debugLine="Dim tituloLivro As 		String";
Debug.ShouldStop(128);
_titulolivro = RemoteObject.createImmutable("");Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 297;BA.debugLine="Dim nomeUsuario As 		String";
Debug.ShouldStop(256);
_nomeusuario = RemoteObject.createImmutable("");Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 298;BA.debugLine="Dim paginasAtuais As 	String";
Debug.ShouldStop(512);
_paginasatuais = RemoteObject.createImmutable("");Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 299;BA.debugLine="Dim totalPaginas As 	String";
Debug.ShouldStop(1024);
_totalpaginas = RemoteObject.createImmutable("");Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 300;BA.debugLine="Dim meta As 			String";
Debug.ShouldStop(2048);
_meta = RemoteObject.createImmutable("");Debug.locals.put("meta", _meta);
 BA.debugLineNum = 301;BA.debugLine="Dim idLivro As 			String";
Debug.ShouldStop(4096);
_idlivro = RemoteObject.createImmutable("");Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 302;BA.debugLine="Dim tipoLeitura As 		String";
Debug.ShouldStop(8192);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 304;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(32768);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 306;BA.debugLine="Dim lista As List";
Debug.ShouldStop(131072);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 307;BA.debugLine="lista.Initialize";
Debug.ShouldStop(262144);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 309;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 310;BA.debugLine="Dim colunaValor, valorSalvo, col As String";
Debug.ShouldStop(2097152);
_colunavalor = RemoteObject.createImmutable("");Debug.locals.put("colunaValor", _colunavalor);
_valorsalvo = RemoteObject.createImmutable("");Debug.locals.put("valorSalvo", _valorsalvo);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 312;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(8388608);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 314;BA.debugLine="colunaValor = lista.Get(b.Tag)";
Debug.ShouldStop(33554432);
_colunavalor = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("colunaValor", _colunavalor);
 BA.debugLineNum = 315;BA.debugLine="Dim testeArray(tamanhoLista) As	String";
Debug.ShouldStop(67108864);
_testearray = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("testeArray", _testearray);
 BA.debugLineNum = 318;BA.debugLine="For coluna = 0 To testeArray.Length - 1";
Debug.ShouldStop(536870912);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_testearray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_coluna = 0 ;
for (;(step16 > 0 && _coluna <= limit16) || (step16 < 0 && _coluna >= limit16) ;_coluna = ((int)(0 + _coluna + step16))  ) {
Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 320;BA.debugLine="col = colunaValor.SubString2(colunaValor.IndexO";
Debug.ShouldStop(-2147483648);
_col = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("col", _col);
 BA.debugLineNum = 321;BA.debugLine="valorSalvo = colunaValor.SubString2(colunaValor";
Debug.ShouldStop(1);
_valorsalvo = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"length")));Debug.locals.put("valorSalvo", _valorsalvo);
 BA.debugLineNum = 323;BA.debugLine="testeArray(coluna) = col";
Debug.ShouldStop(4);
_testearray.setArrayElement (_col,BA.numberCast(int.class, _coluna));
 BA.debugLineNum = 324;BA.debugLine="colunaValor = valorSalvo";
Debug.ShouldStop(8);
_colunavalor = _valorsalvo;Debug.locals.put("colunaValor", _colunavalor);
 }
}Debug.locals.put("coluna", _coluna);
;
 BA.debugLineNum = 328;BA.debugLine="tituloLivro = testeArray(0)";
Debug.ShouldStop(128);
_titulolivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 329;BA.debugLine="nomeUsuario = testeArray(3)";
Debug.ShouldStop(256);
_nomeusuario = _testearray.getArrayElement(true,BA.numberCast(int.class, 3));Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 330;BA.debugLine="paginasAtuais = testeArray(5)";
Debug.ShouldStop(512);
_paginasatuais = _testearray.getArrayElement(true,BA.numberCast(int.class, 5));Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 331;BA.debugLine="totalPaginas = testeArray(1)";
Debug.ShouldStop(1024);
_totalpaginas = _testearray.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 332;BA.debugLine="meta = testeArray(6)";
Debug.ShouldStop(2048);
_meta = _testearray.getArrayElement(true,BA.numberCast(int.class, 6));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 333;BA.debugLine="idLivro = testeArray(2)";
Debug.ShouldStop(4096);
_idlivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 334;BA.debugLine="tipoLeitura = testeArray(4)";
Debug.ShouldStop(8192);
_tipoleitura = _testearray.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 336;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nomeUsuari";
Debug.ShouldStop(32768);
codigolayleituras.mostCurrent._codigolancamentoleitura._nomeusuario /*RemoteObject*/  = _nomeusuario;
 BA.debugLineNum = 337;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = paginasAtu";
Debug.ShouldStop(65536);
codigolayleituras.mostCurrent._codigolancamentoleitura._paginaatual /*RemoteObject*/  = BA.numberCast(int.class, _paginasatuais);
 BA.debugLineNum = 338;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = tituloLivr";
Debug.ShouldStop(131072);
codigolayleituras.mostCurrent._codigolancamentoleitura._titulolivro /*RemoteObject*/  = _titulolivro;
 BA.debugLineNum = 339;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = totalPagi";
Debug.ShouldStop(262144);
codigolayleituras.mostCurrent._codigolancamentoleitura._totalpaginas /*RemoteObject*/  = BA.numberCast(int.class, _totalpaginas);
 BA.debugLineNum = 340;BA.debugLine="CodigoLancamentoLeitura.meta = meta";
Debug.ShouldStop(524288);
codigolayleituras.mostCurrent._codigolancamentoleitura._meta /*RemoteObject*/  = BA.numberCast(int.class, _meta);
 BA.debugLineNum = 341;BA.debugLine="CodigoLancamentoLeitura.idLivro = idLivro";
Debug.ShouldStop(1048576);
codigolayleituras.mostCurrent._codigolancamentoleitura._idlivro /*RemoteObject*/  = BA.numberCast(int.class, _idlivro);
 BA.debugLineNum = 342;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipoLeitur";
Debug.ShouldStop(2097152);
codigolayleituras.mostCurrent._codigolancamentoleitura._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 344;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
Debug.ShouldStop(8388608);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolancamentoleitura.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e38.toString()); BA.debugLineNum = 347;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Event_lbl_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,58);
if (RapidSub.canDelegate("event_lbl_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_lbl_click");}
 BA.debugLineNum = 58;BA.debugLine="Sub Event_lbl_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="StartActivity(CodigoCadastroLivro)";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigocadastrolivro.getObject())));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
 //BA.debugLineNum = 22;BA.debugLine="Dim tamanhoLista As Int";
codigolayleituras._tamanholista = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="Private btAdicionarLeitura As Button";
codigolayleituras.mostCurrent._btadicionarleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Panel_lendo As Panel";
codigolayleituras.mostCurrent._panel_lendo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private nomeArquivo As String = \"Informacoes.ini\"";
codigolayleituras.mostCurrent._nomearquivo = BA.ObjectToString("Informacoes.ini");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,355);
if (RapidSub.canDelegate("tabstrip_pageselected")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","tabstrip_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 355;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}