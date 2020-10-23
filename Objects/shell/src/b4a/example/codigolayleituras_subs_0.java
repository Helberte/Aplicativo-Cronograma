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
<<<<<<< HEAD
		Debug.PushSubsStack("Activity_KeyPress (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,359);
=======
		Debug.PushSubsStack("Activity_KeyPress (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,365);
>>>>>>> main
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_keypress", _keycode);}
RemoteObject _resp = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 365;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 367;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 369;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
Debug.ShouldStop(65536);
_resp = codigolayleituras.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Deseja realmente sair?")),(Object)(BA.ObjectToCharSequence("Já vai?")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((codigolayleituras.mostCurrent.__c.getField(false,"Null"))),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 371;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_resp,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
<<<<<<< HEAD
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
=======
 BA.debugLineNum = 373;BA.debugLine="ExitApplication";
Debug.ShouldStop(1048576);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 374;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return codigolayleituras.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 376;BA.debugLine="KeyCode = 0";
Debug.ShouldStop(8388608);
_keycode = BA.numberCast(int.class, 0);Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 377;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 380;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
>>>>>>> main
 };
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
int step50;
int limit50;

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
this.state = 31;
this.catchState = 30;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 30;
 BA.debugLineNum = 83;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(262144);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 85;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(1048576);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 87;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 32;
return;
case 32:
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
this.state = 28;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 112;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 117;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 14;
}else {
this.state = 27;
}}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 93;BA.debugLine="If temPanel Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 10;
if (parent._tempanel.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 94;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(536870912);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 95;BA.debugLine="temPanel = False";
Debug.ShouldStop(1073741824);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 96;BA.debugLine="lbl_Inicial_Leitura.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 10:
//C
this.state = 28;
;
 BA.debugLineNum = 99;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(4);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 101;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 102;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 103;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
Debug.ShouldStop(64);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 105;BA.debugLine="scrollView1.Initialize (500)";
Debug.ShouldStop(256);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 106;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
Debug.ShouldStop(512);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 108;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
Debug.ShouldStop(2048);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._lbl_inicial_leitura.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 111;BA.debugLine="Return True";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 28;
 BA.debugLineNum = 113;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(65536);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="Return True";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 119;BA.debugLine="btAdicionarLeitura.Visible = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(16777216);
parent.mostCurrent._gradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(parent._cores));
 BA.debugLineNum = 123;BA.debugLine="gradient.CornerRadius = 12";
Debug.ShouldStop(67108864);
parent.mostCurrent._gradient.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 12));
 BA.debugLineNum = 125;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
Debug.ShouldStop(268435456);
_quantidade = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("QUANTIDADE")));Debug.locals.put("quantidade", _quantidade);Debug.locals.put("quantidade", _quantidade);
 BA.debugLineNum = 127;BA.debugLine="Dim panels(quantidade) As Panel";
Debug.ShouldStop(1073741824);
_panels = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("panels", _panels);
 BA.debugLineNum = 128;BA.debugLine="Dim listaInformacoes As List";
Debug.ShouldStop(-2147483648);
_listainformacoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaInformacoes", _listainformacoes);
 BA.debugLineNum = 130;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
Debug.ShouldStop(2);
_lbltitulolivro = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblTituloLivro", _lbltitulolivro);
 BA.debugLineNum = 131;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
Debug.ShouldStop(4);
_lbldatacomecoleitura = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblDataComecoLeitura", _lbldatacomecoleitura);
 BA.debugLineNum = 132;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
Debug.ShouldStop(8);
_lblprevisaotermino = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblPrevisaoTermino", _lblprevisaotermino);
 BA.debugLineNum = 133;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
Debug.ShouldStop(16);
_lblquantidadepaginas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblQuantidadePaginas", _lblquantidadepaginas);
 BA.debugLineNum = 135;BA.debugLine="Dim btAnotar(quantidade) As Button";
Debug.ShouldStop(64);
_btanotar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btAnotar", _btanotar);
 BA.debugLineNum = 136;BA.debugLine="Dim btLancar(quantidade) As Button";
Debug.ShouldStop(128);
_btlancar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btLancar", _btlancar);
 BA.debugLineNum = 138;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
Debug.ShouldStop(512);
_tamanho_fonte = BA.numberCast(int.class, 17.5);Debug.locals.put("tamanho_fonte", _tamanho_fonte);Debug.locals.put("tamanho_fonte", _tamanho_fonte);
 BA.debugLineNum = 140;BA.debugLine="Dim topo As Int = 1%y";
Debug.ShouldStop(2048);
_topo = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 141;BA.debugLine="Dim topoLabel As Int = 1%y";
Debug.ShouldStop(4096);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 143;BA.debugLine="If temPanel Then";
Debug.ShouldStop(16384);
if (true) break;

case 15:
//if
this.state = 18;
if (parent._tempanel.<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 144;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(32768);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 145;BA.debugLine="temPanel = False";
Debug.ShouldStop(65536);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
;
 BA.debugLineNum = 148;BA.debugLine="If temPanel = False Then";
Debug.ShouldStop(524288);

case 18:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",parent._tempanel,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 150;BA.debugLine="temPanel = True";
Debug.ShouldStop(2097152);
parent._tempanel = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 151;BA.debugLine="scrollView1.Initialize( 500 )";
Debug.ShouldStop(4194304);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 152;BA.debugLine="listaInformacoes.Initialize";
Debug.ShouldStop(8388608);
_listainformacoes.runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
Debug.ShouldStop(33554432);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent._btadicionarleitura.runMethod(true,"getTop")));
 BA.debugLineNum = 157;BA.debugLine="Dim i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To panels.Length - 1";
Debug.ShouldStop(536870912);
if (true) break;

case 21:
//for
this.state = 24;
step50 = 1;
limit50 = RemoteObject.solve(new RemoteObject[] {_panels.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if ((step50 > 0 && _i.<Integer>get().intValue() <= limit50) || (step50 < 0 && _i.<Integer>get().intValue() >= limit50)) this.state = 23;
if (true) break;

case 34:
//C
this.state = 33;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step50)) ;
Debug.locals.put("i", _i);
if (true) break;

case 23:
//C
this.state = 34;
 BA.debugLineNum = 160;BA.debugLine="topoLabel = 1%y";
Debug.ShouldStop(-2147483648);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 161;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
Debug.ShouldStop(1);
_panels.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_panels")));
 BA.debugLineNum = 163;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
Debug.ShouldStop(4);
_lbltitulolivro.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 164;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
Debug.ShouldStop(8);
_lbldatacomecoleitura.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 165;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
Debug.ShouldStop(16);
_lblprevisaotermino.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 166;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
Debug.ShouldStop(32);
_lblquantidadepaginas.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 168;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
Debug.ShouldStop(128);
_btanotar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btAnotar")));
 BA.debugLineNum = 169;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
Debug.ShouldStop(256);
_btlancar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btLancar")));
 BA.debugLineNum = 171;BA.debugLine="panels(i).Background = gradient";
Debug.ShouldStop(1024);
_panels.getArrayElement(false,_i).runMethod(false,"setBackground",(parent.mostCurrent._gradient.getObject()));
 BA.debugLineNum = 172;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
Debug.ShouldStop(2048);
_panels.getArrayElement(false,_i).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 173;BA.debugLine="panels(i).Elevation = 3dip";
Debug.ShouldStop(4096);
_panels.getArrayElement(false,_i).runMethod(true,"setElevation",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 175;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
Debug.ShouldStop(16384);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_panels.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topo),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 177;BA.debugLine="lblTituloLivro(i).Text = Result.GetString(\"no";
Debug.ShouldStop(65536);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome")))));
 BA.debugLineNum = 178;BA.debugLine="lblTituloLivro(i).TextColor = Colors.RGB(189,";
Debug.ShouldStop(131072);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 189)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 179;BA.debugLine="lblTituloLivro(i).TextSize = 23";
Debug.ShouldStop(262144);
_lbltitulolivro.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 23));
 BA.debugLineNum = 182;BA.debugLine="lblDataComecoLeitura(i).Text = \"Começei ler d";
Debug.ShouldStop(2097152);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Começei ler dia "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_inicial"))))));
 BA.debugLineNum = 183;BA.debugLine="lblDataComecoLeitura(i).TextColor = Colors.RG";
Debug.ShouldStop(4194304);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 184;BA.debugLine="lblDataComecoLeitura(i).TextSize = tamanho_fo";
Debug.ShouldStop(8388608);
_lbldatacomecoleitura.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 187;BA.debugLine="lblPrevisaoTermino(i).Text = \"Previsão de Tér";
Debug.ShouldStop(67108864);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Previsão de Término "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_prevista_final"))))));
 BA.debugLineNum = 188;BA.debugLine="lblPrevisaoTermino(i).TextColor = Colors.RGB(";
Debug.ShouldStop(134217728);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 189;BA.debugLine="lblPrevisaoTermino(i).TextSize = tamanho_font";
Debug.ShouldStop(268435456);
_lblprevisaotermino.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 192;BA.debugLine="lblQuantidadePaginas(i).Text = Result.GetStri";
Debug.ShouldStop(-2147483648);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable(" "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable(" de "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("quantidade_paginas"))))));
 BA.debugLineNum = 193;BA.debugLine="lblQuantidadePaginas(i).TextColor = Colors.RG";
Debug.ShouldStop(1);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72))));
 BA.debugLineNum = 194;BA.debugLine="lblQuantidadePaginas(i).TextSize = tamanho_fo";
Debug.ShouldStop(2);
_lblquantidadepaginas.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, _tamanho_fonte));
 BA.debugLineNum = 197;BA.debugLine="Dim altura As Int = 3.5%y";
Debug.ShouldStop(16);
_altura = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.5)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("altura", _altura);Debug.locals.put("altura", _altura);
 BA.debugLineNum = 198;BA.debugLine="panels(i).AddView(lblTituloLivro(i), 3%x, top";
Debug.ShouldStop(32);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lbltitulolivro.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 199;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
Debug.ShouldStop(64);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 200;BA.debugLine="panels(i).AddView(lblDataComecoLeitura(i), 3%";
Debug.ShouldStop(128);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lbldatacomecoleitura.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 201;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(256);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 202;BA.debugLine="panels(i).AddView(lblPrevisaoTermino(i), 3%x,";
Debug.ShouldStop(512);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lblprevisaotermino.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 203;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(1024);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 204;BA.debugLine="panels(i).AddView(lblQuantidadePaginas(i), 3%";
Debug.ShouldStop(2048);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_lblquantidadepaginas.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,_i).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 205;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
Debug.ShouldStop(4096);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 207;BA.debugLine="btAnotar(i).Tag = i";
Debug.ShouldStop(16384);
_btanotar.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 212;BA.debugLine="listaInformacoes.Add(\"'\" & Result.GetString(\"";
Debug.ShouldStop(524288);
_listainformacoes.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("quantidade_paginas"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fk_id_Livro"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("usuarioNome"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable("|¨'"),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("meta"))),RemoteObject.createImmutable("|")))));
 BA.debugLineNum = 220;BA.debugLine="tamanhoLista = 7";
Debug.ShouldStop(134217728);
parent._tamanholista = BA.numberCast(int.class, 7);
 BA.debugLineNum = 225;BA.debugLine="btAnotar(i).Text = \"Anotar\"";
Debug.ShouldStop(1);
_btanotar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Anotar"));
 BA.debugLineNum = 226;BA.debugLine="btAnotar(i).TextSize = 16";
Debug.ShouldStop(2);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 227;BA.debugLine="btAnotar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(4);
_btanotar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 228;BA.debugLine="btAnotar(i).Color = Colors.Transparent";
Debug.ShouldStop(8);
_btanotar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 229;BA.debugLine="panels(i).AddView(btAnotar(i), 3%x, topoLabel";
Debug.ShouldStop(16);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btanotar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 231;BA.debugLine="btLancar(i).Tag = i";
Debug.ShouldStop(64);
_btlancar.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 233;BA.debugLine="btLancar(i).Text = \"Lançar\"";
Debug.ShouldStop(256);
_btlancar.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Lançar"));
 BA.debugLineNum = 234;BA.debugLine="btLancar(i).TextSize = 16";
Debug.ShouldStop(512);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 235;BA.debugLine="btLancar(i).TextColor = Colors.RGB(244,0,0)";
Debug.ShouldStop(1024);
_btlancar.getArrayElement(false,_i).runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 236;BA.debugLine="btLancar(i).Color = Colors.Transparent";
Debug.ShouldStop(2048);
_btlancar.getArrayElement(false,_i).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 237;BA.debugLine="panels(i).AddView(btLancar(i), 35%x, topoLabe";
Debug.ShouldStop(4096);
_panels.getArrayElement(false,_i).runVoidMethod ("AddView",(Object)((_btlancar.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6.5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 239;BA.debugLine="topo = topo + 25%y + 10dip";
Debug.ShouldStop(16384);
_topo = RemoteObject.solve(new RemoteObject[] {_topo,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 241;BA.debugLine="scrollView1.Panel.Height = topo";
Debug.ShouldStop(65536);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",_topo);
 BA.debugLineNum = 242;BA.debugLine="Result.NextRow";
Debug.ShouldStop(131072);
_result.runVoidMethod ("NextRow");
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 244;BA.debugLine="File.WriteList(File.DirInternal, nomeArquivo,";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent.mostCurrent._nomearquivo),(Object)(_listainformacoes));
 if (true) break;

case 25:
//C
this.state = 28;
;
 BA.debugLineNum = 247;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 249;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 250;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 28:
//C
this.state = 31;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
<<<<<<< HEAD
 BA.debugLineNum = 247;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 248;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
=======
 BA.debugLineNum = 253;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 254;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) {
>>>>>>> main
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
<<<<<<< HEAD
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,351);
=======
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,357);
>>>>>>> main
if (RapidSub.canDelegate("btadicionarleitura_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btadicionarleitura_click");}
 BA.debugLineNum = 357;BA.debugLine="Sub btAdicionarLeitura_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="StartActivity(act_TelaCadastro)";
Debug.ShouldStop(32);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._act_telacadastro.getObject())));
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
<<<<<<< HEAD
		Debug.PushSubsStack("Event_btAnotar_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,252);
=======
		Debug.PushSubsStack("Event_btAnotar_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,258);
>>>>>>> main
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
 BA.debugLineNum = 258;BA.debugLine="Sub Event_btAnotar_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 260;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(8);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 262;BA.debugLine="Dim informacoes 		As String";
Debug.ShouldStop(32);
_informacoes = RemoteObject.createImmutable("");Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 263;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
Debug.ShouldStop(64);
_qtpag = RemoteObject.createImmutable(0);Debug.locals.put("qtPag", _qtpag);
_codigolivro = RemoteObject.createImmutable(0);Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 264;BA.debugLine="Dim nomeLivro 			As String";
Debug.ShouldStop(128);
_nomelivro = RemoteObject.createImmutable("");Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 265;BA.debugLine="Dim tipoLeitura			As String";
Debug.ShouldStop(256);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 267;BA.debugLine="Dim lista As List";
Debug.ShouldStop(1024);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 268;BA.debugLine="lista.Initialize";
Debug.ShouldStop(2048);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 270;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 271;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(16384);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 272;BA.debugLine="informacoes = lista.Get(b.Tag)";
Debug.ShouldStop(32768);
_informacoes = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 274;BA.debugLine="Dim cols(tamanhoLista), coluna As String";
Debug.ShouldStop(131072);
_cols = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cols", _cols);
_coluna = RemoteObject.createImmutable("");Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 276;BA.debugLine="For i = 0 To cols.Length - 1";
Debug.ShouldStop(524288);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cols.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 278;BA.debugLine="coluna 	= informacoes.SubString2(informacoes.In";
Debug.ShouldStop(2097152);
_coluna = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 279;BA.debugLine="informacoes = informacoes.SubString2(informacoe";
Debug.ShouldStop(4194304);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 281;BA.debugLine="cols(i) = coluna";
Debug.ShouldStop(16777216);
_cols.setArrayElement (_coluna,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 284;BA.debugLine="nomeLivro = cols(0)";
Debug.ShouldStop(134217728);
_nomelivro = _cols.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 285;BA.debugLine="qtPag = cols(1)";
Debug.ShouldStop(268435456);
_qtpag = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("qtPag", _qtpag);
 BA.debugLineNum = 286;BA.debugLine="codigoLivro = cols(2)";
Debug.ShouldStop(536870912);
_codigolivro = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 2)));Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 287;BA.debugLine="tipoLeitura = cols(4)";
Debug.ShouldStop(1073741824);
_tipoleitura = _cols.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 289;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
Debug.ShouldStop(1);
codigolayleituras.mostCurrent._codigolayanotacao._codigolivro /*RemoteObject*/  = _codigolivro;
 BA.debugLineNum = 290;BA.debugLine="CodigoLayAnotacao.qtPaginas   =	qtPag";
Debug.ShouldStop(2);
codigolayleituras.mostCurrent._codigolayanotacao._qtpaginas /*RemoteObject*/  = _qtpag;
 BA.debugLineNum = 291;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
Debug.ShouldStop(4);
codigolayleituras.mostCurrent._codigolayanotacao._nomedolivro /*RemoteObject*/  = _nomelivro;
 BA.debugLineNum = 292;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
Debug.ShouldStop(8);
codigolayleituras.mostCurrent._codigolayanotacao._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 294;BA.debugLine="StartActivity(CodigoLayAnotacao)";
Debug.ShouldStop(32);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolayanotacao.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e27.toString()); BA.debugLineNum = 296;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(128);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
<<<<<<< HEAD
		Debug.PushSubsStack("Event_btLancar_Click (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,294);
=======
		Debug.PushSubsStack("Event_btLancar_Click (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,300);
>>>>>>> main
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
 BA.debugLineNum = 300;BA.debugLine="Sub Event_btLancar_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 302;BA.debugLine="Dim tituloLivro As 		String";
Debug.ShouldStop(8192);
_titulolivro = RemoteObject.createImmutable("");Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 303;BA.debugLine="Dim nomeUsuario As 		String";
Debug.ShouldStop(16384);
_nomeusuario = RemoteObject.createImmutable("");Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 304;BA.debugLine="Dim paginasAtuais As 	String";
Debug.ShouldStop(32768);
_paginasatuais = RemoteObject.createImmutable("");Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 305;BA.debugLine="Dim totalPaginas As 	String";
Debug.ShouldStop(65536);
_totalpaginas = RemoteObject.createImmutable("");Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 306;BA.debugLine="Dim meta As 			String";
Debug.ShouldStop(131072);
_meta = RemoteObject.createImmutable("");Debug.locals.put("meta", _meta);
 BA.debugLineNum = 307;BA.debugLine="Dim idLivro As 			String";
Debug.ShouldStop(262144);
_idlivro = RemoteObject.createImmutable("");Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 308;BA.debugLine="Dim tipoLeitura As 		String";
Debug.ShouldStop(524288);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 310;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(2097152);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 312;BA.debugLine="Dim lista As List";
Debug.ShouldStop(8388608);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 313;BA.debugLine="lista.Initialize";
Debug.ShouldStop(16777216);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 315;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 316;BA.debugLine="Dim colunaValor, valorSalvo, col As String";
Debug.ShouldStop(134217728);
_colunavalor = RemoteObject.createImmutable("");Debug.locals.put("colunaValor", _colunavalor);
_valorsalvo = RemoteObject.createImmutable("");Debug.locals.put("valorSalvo", _valorsalvo);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 318;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(536870912);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 320;BA.debugLine="colunaValor = lista.Get(b.Tag)";
Debug.ShouldStop(-2147483648);
_colunavalor = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("colunaValor", _colunavalor);
 BA.debugLineNum = 321;BA.debugLine="Dim testeArray(tamanhoLista) As	String";
Debug.ShouldStop(1);
_testearray = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("testeArray", _testearray);
 BA.debugLineNum = 324;BA.debugLine="For coluna = 0 To testeArray.Length - 1";
Debug.ShouldStop(8);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_testearray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_coluna = 0 ;
for (;(step16 > 0 && _coluna <= limit16) || (step16 < 0 && _coluna >= limit16) ;_coluna = ((int)(0 + _coluna + step16))  ) {
Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 326;BA.debugLine="col = colunaValor.SubString2(colunaValor.IndexO";
Debug.ShouldStop(32);
_col = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("col", _col);
 BA.debugLineNum = 327;BA.debugLine="valorSalvo = colunaValor.SubString2(colunaValor";
Debug.ShouldStop(64);
_valorsalvo = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"length")));Debug.locals.put("valorSalvo", _valorsalvo);
 BA.debugLineNum = 329;BA.debugLine="testeArray(coluna) = col";
Debug.ShouldStop(256);
_testearray.setArrayElement (_col,BA.numberCast(int.class, _coluna));
 BA.debugLineNum = 330;BA.debugLine="colunaValor = valorSalvo";
Debug.ShouldStop(512);
_colunavalor = _valorsalvo;Debug.locals.put("colunaValor", _colunavalor);
 }
}Debug.locals.put("coluna", _coluna);
;
 BA.debugLineNum = 334;BA.debugLine="tituloLivro = testeArray(0)";
Debug.ShouldStop(8192);
_titulolivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 335;BA.debugLine="nomeUsuario = testeArray(3)";
Debug.ShouldStop(16384);
_nomeusuario = _testearray.getArrayElement(true,BA.numberCast(int.class, 3));Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 336;BA.debugLine="paginasAtuais = testeArray(5)";
Debug.ShouldStop(32768);
_paginasatuais = _testearray.getArrayElement(true,BA.numberCast(int.class, 5));Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 337;BA.debugLine="totalPaginas = testeArray(1)";
Debug.ShouldStop(65536);
_totalpaginas = _testearray.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 338;BA.debugLine="meta = testeArray(6)";
Debug.ShouldStop(131072);
_meta = _testearray.getArrayElement(true,BA.numberCast(int.class, 6));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 339;BA.debugLine="idLivro = testeArray(2)";
Debug.ShouldStop(262144);
_idlivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 340;BA.debugLine="tipoLeitura = testeArray(4)";
Debug.ShouldStop(524288);
_tipoleitura = _testearray.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 342;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nomeUsuari";
Debug.ShouldStop(2097152);
codigolayleituras.mostCurrent._codigolancamentoleitura._nomeusuario /*RemoteObject*/  = _nomeusuario;
 BA.debugLineNum = 343;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = paginasAtu";
Debug.ShouldStop(4194304);
codigolayleituras.mostCurrent._codigolancamentoleitura._paginaatual /*RemoteObject*/  = BA.numberCast(int.class, _paginasatuais);
 BA.debugLineNum = 344;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = tituloLivr";
Debug.ShouldStop(8388608);
codigolayleituras.mostCurrent._codigolancamentoleitura._titulolivro /*RemoteObject*/  = _titulolivro;
 BA.debugLineNum = 345;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = totalPagi";
Debug.ShouldStop(16777216);
codigolayleituras.mostCurrent._codigolancamentoleitura._totalpaginas /*RemoteObject*/  = BA.numberCast(int.class, _totalpaginas);
 BA.debugLineNum = 346;BA.debugLine="CodigoLancamentoLeitura.meta = meta";
Debug.ShouldStop(33554432);
codigolayleituras.mostCurrent._codigolancamentoleitura._meta /*RemoteObject*/  = BA.numberCast(int.class, _meta);
 BA.debugLineNum = 347;BA.debugLine="CodigoLancamentoLeitura.idLivro = idLivro";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent._codigolancamentoleitura._idlivro /*RemoteObject*/  = BA.numberCast(int.class, _idlivro);
 BA.debugLineNum = 348;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipoLeitur";
Debug.ShouldStop(134217728);
codigolayleituras.mostCurrent._codigolancamentoleitura._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 350;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
Debug.ShouldStop(536870912);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolancamentoleitura.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e38.toString()); BA.debugLineNum = 353;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(1);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 59;BA.debugLine="StartActivity(act_TelaCadastro)";
Debug.ShouldStop(67108864);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._act_telacadastro.getObject())));
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
<<<<<<< HEAD
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",6,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,355);
=======
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",5,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,361);
>>>>>>> main
if (RapidSub.canDelegate("tabstrip_pageselected")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","tabstrip_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 361;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}