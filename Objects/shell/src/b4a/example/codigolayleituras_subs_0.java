package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayleituras_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,36);
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
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
Debug.ShouldStop(32);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayLeiturasTabStrip")),codigolayleituras.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
Debug.ShouldStop(64);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu1")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lendo"))));
 BA.debugLineNum = 40;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
Debug.ShouldStop(128);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu2")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lidos"))));
 BA.debugLineNum = 42;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_lbl")));
 BA.debugLineNum = 44;BA.debugLine="banco.Initialize";
Debug.ShouldStop(2048);
parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayleituras.processBA);
 BA.debugLineNum = 46;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
Debug.ShouldStop(8192);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 47;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
Debug.ShouldStop(16384);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 49;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
Debug.ShouldStop(65536);
parent.mostCurrent._panelnenhumaleitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 51;BA.debugLine="carrega_leitura_concluida = FirstTime";
Debug.ShouldStop(262144);
parent._carrega_leitura_concluida = _firsttime;
 BA.debugLineNum = 52;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 53;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 55;BA.debugLine="If Success = False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 56;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 60;BA.debugLine="btAdicionarLeitura.SetBackgroundImage(LoadBitmap(";
Debug.ShouldStop(134217728);
parent.mostCurrent._btadicionarleitura.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_adicionar.png"))).getObject())));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_KeyPress (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,490);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_keypress", _keycode);}
RemoteObject _resp = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 490;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 492;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 494;BA.debugLine="Dim resp As Int = Msgbox2(\"Deseja realmente sair";
Debug.ShouldStop(8192);
_resp = codigolayleituras.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Deseja realmente sair?")),(Object)(BA.ObjectToCharSequence("Já vai?")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((codigolayleituras.mostCurrent.__c.getField(false,"Null"))),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 496;BA.debugLine="If resp = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_resp,BA.numberCast(double.class, codigolayleituras.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 498;BA.debugLine="ExitApplication";
Debug.ShouldStop(131072);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 499;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 501;BA.debugLine="KeyCode = 0";
Debug.ShouldStop(1048576);
_keycode = BA.numberCast(int.class, 0);Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 502;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 505;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return codigolayleituras.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,88);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,68);
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
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 70;BA.debugLine="If Main.CadastrouAlgo Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 71;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 12;
return;
case 12:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 73;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(256);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 74;BA.debugLine="If Success = False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 75;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 76;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(2048);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;
;
 BA.debugLineNum = 80;BA.debugLine="If CodigoLancamentoLeitura.de_os_parabens Then";
Debug.ShouldStop(32768);

case 8:
//if
this.state = 11;
if (parent.mostCurrent._codigolancamentoleitura._de_os_parabens /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 81;BA.debugLine="CodigoLancamentoLeitura.de_os_parabens = False";
Debug.ShouldStop(65536);
parent.mostCurrent._codigolancamentoleitura._de_os_parabens /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 83;BA.debugLine="B4XImage_parabens.Load(File.DirAssets, \"vitoriaL";
Debug.ShouldStop(262144);
parent.mostCurrent._b4ximage_parabens.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("vitoriaLivro.jpg")));
 BA.debugLineNum = 84;BA.debugLine="Panel_parabens.SetVisibleAnimated(1000, True)";
Debug.ShouldStop(524288);
parent.mostCurrent._panel_parabens.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,92);
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
int step49;
int limit49;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,92);
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
 BA.debugLineNum = 93;BA.debugLine="Try";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 95;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(1073741824);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 97;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(1);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 99;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 101;BA.debugLine="Result.NextRow";
Debug.ShouldStop(16);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 103;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 123;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 127;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 14;
}else {
this.state = 27;
}}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 105;BA.debugLine="If temPanel Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 106;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(512);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 107;BA.debugLine="temPanel = False";
Debug.ShouldStop(1024);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 108;BA.debugLine="lbl_Inicial_Leitura.Initialize(\"Event_lbl\")";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_lbl")));
 if (true) break;

case 10:
//C
this.state = 28;
;
 BA.debugLineNum = 111;BA.debugLine="lbl_Inicial_Leitura.Visible = True";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 113;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.RGB(161,";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 161)),(Object)(BA.numberCast(int.class, 92)),(Object)(BA.numberCast(int.class, 92))));
 BA.debugLineNum = 114;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 115;BA.debugLine="lbl_Inicial_Leitura.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setGravity",parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 117;BA.debugLine="scrollView1.Initialize (800)";
Debug.ShouldStop(1048576);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 800)));
 BA.debugLineNum = 118;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100%";
Debug.ShouldStop(2097152);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 120;BA.debugLine="scrollView1.Panel.AddView(lbl_Inicial_Leitura,";
Debug.ShouldStop(8388608);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._lbl_inicial_leitura.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 122;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 28;
 BA.debugLineNum = 125;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),T";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 126;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 130;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(2);
parent.mostCurrent._gradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(parent._cores));
 BA.debugLineNum = 132;BA.debugLine="gradient.CornerRadius = 12";
Debug.ShouldStop(8);
parent.mostCurrent._gradient.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 12));
 BA.debugLineNum = 134;BA.debugLine="Dim quantidade As Int = Result.GetInt(\"QUANTIDA";
Debug.ShouldStop(32);
_quantidade = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("QUANTIDADE")));Debug.locals.put("quantidade", _quantidade);Debug.locals.put("quantidade", _quantidade);
 BA.debugLineNum = 136;BA.debugLine="Dim panels(quantidade) As Panel";
Debug.ShouldStop(128);
_panels = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("panels", _panels);
 BA.debugLineNum = 137;BA.debugLine="Dim listaInformacoes As List";
Debug.ShouldStop(256);
_listainformacoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaInformacoes", _listainformacoes);
 BA.debugLineNum = 139;BA.debugLine="Dim lblTituloLivro(quantidade) As Label";
Debug.ShouldStop(1024);
_lbltitulolivro = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblTituloLivro", _lbltitulolivro);
 BA.debugLineNum = 140;BA.debugLine="Dim lblDataComecoLeitura(quantidade) As Label";
Debug.ShouldStop(2048);
_lbldatacomecoleitura = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblDataComecoLeitura", _lbldatacomecoleitura);
 BA.debugLineNum = 141;BA.debugLine="Dim lblPrevisaoTermino(quantidade) As Label";
Debug.ShouldStop(4096);
_lblprevisaotermino = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblPrevisaoTermino", _lblprevisaotermino);
 BA.debugLineNum = 142;BA.debugLine="Dim lblQuantidadePaginas(quantidade) As Label";
Debug.ShouldStop(8192);
_lblquantidadepaginas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lblQuantidadePaginas", _lblquantidadepaginas);
 BA.debugLineNum = 144;BA.debugLine="Dim btAnotar(quantidade) As Button";
Debug.ShouldStop(32768);
_btanotar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btAnotar", _btanotar);
 BA.debugLineNum = 145;BA.debugLine="Dim btLancar(quantidade) As Button";
Debug.ShouldStop(65536);
_btlancar = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {_quantidade.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("btLancar", _btlancar);
 BA.debugLineNum = 147;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
Debug.ShouldStop(262144);
_tamanho_fonte = BA.numberCast(int.class, 17.5);Debug.locals.put("tamanho_fonte", _tamanho_fonte);Debug.locals.put("tamanho_fonte", _tamanho_fonte);
 BA.debugLineNum = 149;BA.debugLine="Dim topo As Int = 1%y";
Debug.ShouldStop(1048576);
_topo = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 150;BA.debugLine="Dim topoLabel As Int = 1%y";
Debug.ShouldStop(2097152);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 152;BA.debugLine="If temPanel Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 153;BA.debugLine="scrollView1.Panel.RemoveView";
Debug.ShouldStop(16777216);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 154;BA.debugLine="temPanel = False";
Debug.ShouldStop(33554432);
parent._tempanel = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
;
 BA.debugLineNum = 157;BA.debugLine="If temPanel = False Then";
Debug.ShouldStop(268435456);

case 18:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",parent._tempanel,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 159;BA.debugLine="temPanel = True";
Debug.ShouldStop(1073741824);
parent._tempanel = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 160;BA.debugLine="scrollView1.Initialize( 800 )";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._scrollview1.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 800)));
 BA.debugLineNum = 161;BA.debugLine="listaInformacoes.Initialize";
Debug.ShouldStop(1);
_listainformacoes.runVoidMethod ("Initialize");
 BA.debugLineNum = 163;BA.debugLine="Panel_lendo.AddView(scrollView1, 0%x, 0%y, 100";
Debug.ShouldStop(4);
parent.mostCurrent._panel_lendo.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._btadicionarleitura.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._btadicionarleitura.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 9)))}, "-+",2, 0))));
 BA.debugLineNum = 165;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="For i = 0 To panels.Length - 1";
Debug.ShouldStop(32);
if (true) break;

case 21:
//for
this.state = 24;
step49 = 1;
limit49 = RemoteObject.solve(new RemoteObject[] {_panels.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if ((step49 > 0 && _i.<Integer>get().intValue() <= limit49) || (step49 < 0 && _i.<Integer>get().intValue() >= limit49)) this.state = 23;
if (true) break;

case 34:
//C
this.state = 33;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step49)) ;
Debug.locals.put("i", _i);
if (true) break;

case 23:
//C
this.state = 34;
 BA.debugLineNum = 168;BA.debugLine="topoLabel = 1%y";
Debug.ShouldStop(128);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 169;BA.debugLine="panels(i).Initialize( \"Event_panels\" )";
Debug.ShouldStop(256);
_panels.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_panels")));
 BA.debugLineNum = 171;BA.debugLine="lblTituloLivro(i).Initialize(\"\")";
Debug.ShouldStop(1024);
_lbltitulolivro.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 172;BA.debugLine="lblDataComecoLeitura(i).Initialize(\"\")";
Debug.ShouldStop(2048);
_lbldatacomecoleitura.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 173;BA.debugLine="lblPrevisaoTermino(i).Initialize(\"\")";
Debug.ShouldStop(4096);
_lblprevisaotermino.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 174;BA.debugLine="lblQuantidadePaginas(i).Initialize(\"\")";
Debug.ShouldStop(8192);
_lblquantidadepaginas.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 176;BA.debugLine="btAnotar(i).Initialize(\"Event_btAnotar\")";
Debug.ShouldStop(32768);
_btanotar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btAnotar")));
 BA.debugLineNum = 177;BA.debugLine="btLancar(i).Initialize(\"Event_btLancar\")";
Debug.ShouldStop(65536);
_btlancar.getArrayElement(false,_i).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btLancar")));
 BA.debugLineNum = 179;BA.debugLine="panels(i).Background = gradient";
Debug.ShouldStop(262144);
_panels.getArrayElement(false,_i).runMethod(false,"setBackground",(parent.mostCurrent._gradient.getObject()));
 BA.debugLineNum = 180;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip,";
Debug.ShouldStop(524288);
_panels.getArrayElement(false,_i).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 181;BA.debugLine="panels(i).Elevation = 3dip";
Debug.ShouldStop(1048576);
_panels.getArrayElement(false,_i).runMethod(true,"setElevation",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 183;BA.debugLine="scrollView1.Panel.AddView(panels(i), 1%x, top";
Debug.ShouldStop(4194304);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_panels.getArrayElement(false,_i).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topo),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 184;BA.debugLine="panels(i).Tag = i";
Debug.ShouldStop(8388608);
_panels.getArrayElement(false,_i).runMethod(false,"setTag",(_i));
 BA.debugLineNum = 186;BA.debugLine="lblTituloLivro(i) = configuraLabel(Result.Get";
Debug.ShouldStop(33554432);
_lbltitulolivro.setArrayElement (_configuralabel(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome"))),BA.numberCast(int.class, 23),parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 189)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 1)))),_i);
 BA.debugLineNum = 187;BA.debugLine="lblDataComecoLeitura(i) = configuraLabel(\"Com";
Debug.ShouldStop(67108864);
_lbldatacomecoleitura.setArrayElement (_configuralabel(RemoteObject.concat(RemoteObject.createImmutable("Começei ler dia "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_inicial")))),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),_i);
 BA.debugLineNum = 188;BA.debugLine="lblPrevisaoTermino(i) = configuraLabel(\"Previ";
Debug.ShouldStop(134217728);
_lblprevisaotermino.setArrayElement (_configuralabel(RemoteObject.concat(RemoteObject.createImmutable("Previsão de Término "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_prevista_final")))),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),_i);
 BA.debugLineNum = 189;BA.debugLine="lblQuantidadePaginas(i) = configuraLabel(Resu";
Debug.ShouldStop(268435456);
_lblquantidadepaginas.setArrayElement (_configuralabel(RemoteObject.concat(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable(" "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable(" de "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("quantidade_paginas")))),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),_i);
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

case 24:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 238;BA.debugLine="File.WriteList(File.DirInternal, nomeArquivo,";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(parent.mostCurrent._nomearquivo),(Object)(_listainformacoes));
 if (true) break;

case 25:
//C
this.state = 28;
;
 BA.debugLineNum = 241;BA.debugLine="lbl_Inicial_Leitura.Visible = False";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="Return True";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 244;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 245;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 248;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 249;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,364);
if (RapidSub.canDelegate("btadicionarleitura_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btadicionarleitura_click");}
 BA.debugLineNum = 364;BA.debugLine="Sub btAdicionarLeitura_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 365;BA.debugLine="StartActivity(act_TelaCadastro)";
Debug.ShouldStop(4096);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._act_telacadastro.getObject())));
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btok_parabens_click() throws Exception{
try {
		Debug.PushSubsStack("btOk_parabens_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,531);
if (RapidSub.canDelegate("btok_parabens_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btok_parabens_click");}
 BA.debugLineNum = 531;BA.debugLine="Sub btOk_parabens_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 532;BA.debugLine="Panel_parabens.Visible = False";
Debug.ShouldStop(524288);
codigolayleituras.mostCurrent._panel_parabens.runMethod(true,"setVisible",codigolayleituras.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configuralabel(RemoteObject _texto,RemoteObject _fonte,RemoteObject _cor) throws Exception{
try {
		Debug.PushSubsStack("configuraLabel (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,479);
if (RapidSub.canDelegate("configuralabel")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","configuralabel", _texto, _fonte, _cor);}
RemoteObject _label = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("texto", _texto);
Debug.locals.put("fonte", _fonte);
Debug.locals.put("cor", _cor);
 BA.debugLineNum = 479;BA.debugLine="Sub configuraLabel(texto As String, fonte As Int,";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="Dim label As Label";
Debug.ShouldStop(-2147483648);
_label = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("label", _label);
 BA.debugLineNum = 481;BA.debugLine="label.Initialize(\"\")";
Debug.ShouldStop(1);
_label.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 483;BA.debugLine="label.Text = texto";
Debug.ShouldStop(4);
_label.runMethod(true,"setText",BA.ObjectToCharSequence(_texto));
 BA.debugLineNum = 484;BA.debugLine="label.TextColor = cor";
Debug.ShouldStop(8);
_label.runMethod(true,"setTextColor",_cor);
 BA.debugLineNum = 485;BA.debugLine="label.TextSize = fonte";
Debug.ShouldStop(16);
_label.runMethod(true,"setTextSize",BA.numberCast(float.class, _fonte));
 BA.debugLineNum = 487;BA.debugLine="Return label";
Debug.ShouldStop(64);
if (true) return _label;
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_btanotar_click() throws Exception{
try {
		Debug.PushSubsStack("Event_btAnotar_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,265);
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
 BA.debugLineNum = 265;BA.debugLine="Sub Event_btAnotar_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 267;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(1024);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 269;BA.debugLine="Dim informacoes 		As String";
Debug.ShouldStop(4096);
_informacoes = RemoteObject.createImmutable("");Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 270;BA.debugLine="Dim qtPag, codigoLivro 	As Int";
Debug.ShouldStop(8192);
_qtpag = RemoteObject.createImmutable(0);Debug.locals.put("qtPag", _qtpag);
_codigolivro = RemoteObject.createImmutable(0);Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 271;BA.debugLine="Dim nomeLivro 			As String";
Debug.ShouldStop(16384);
_nomelivro = RemoteObject.createImmutable("");Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 272;BA.debugLine="Dim tipoLeitura			As String";
Debug.ShouldStop(32768);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 274;BA.debugLine="Dim lista As List";
Debug.ShouldStop(131072);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 275;BA.debugLine="lista.Initialize";
Debug.ShouldStop(262144);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 277;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 278;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(2097152);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 279;BA.debugLine="informacoes = lista.Get(b.Tag)";
Debug.ShouldStop(4194304);
_informacoes = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 281;BA.debugLine="Dim cols(tamanhoLista), coluna As String";
Debug.ShouldStop(16777216);
_cols = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cols", _cols);
_coluna = RemoteObject.createImmutable("");Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 283;BA.debugLine="For i = 0 To cols.Length - 1";
Debug.ShouldStop(67108864);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_cols.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="coluna 	= informacoes.SubString2(informacoes.In";
Debug.ShouldStop(268435456);
_coluna = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 286;BA.debugLine="informacoes = informacoes.SubString2(informacoe";
Debug.ShouldStop(536870912);
_informacoes = _informacoes.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_informacoes.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_informacoes.runMethod(true,"length")));Debug.locals.put("informacoes", _informacoes);
 BA.debugLineNum = 288;BA.debugLine="cols(i) = coluna";
Debug.ShouldStop(-2147483648);
_cols.setArrayElement (_coluna,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 291;BA.debugLine="nomeLivro = cols(0)";
Debug.ShouldStop(4);
_nomelivro = _cols.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("nomeLivro", _nomelivro);
 BA.debugLineNum = 292;BA.debugLine="qtPag = cols(1)";
Debug.ShouldStop(8);
_qtpag = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("qtPag", _qtpag);
 BA.debugLineNum = 293;BA.debugLine="codigoLivro = cols(2)";
Debug.ShouldStop(16);
_codigolivro = BA.numberCast(int.class, _cols.getArrayElement(true,BA.numberCast(int.class, 2)));Debug.locals.put("codigoLivro", _codigolivro);
 BA.debugLineNum = 294;BA.debugLine="tipoLeitura = cols(4)";
Debug.ShouldStop(32);
_tipoleitura = _cols.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 296;BA.debugLine="CodigoLayAnotacao.codigoLivro = codigoLivro";
Debug.ShouldStop(128);
codigolayleituras.mostCurrent._codigolayanotacao._codigolivro /*RemoteObject*/  = _codigolivro;
 BA.debugLineNum = 297;BA.debugLine="CodigoLayAnotacao.qtPaginas   =	qtPag";
Debug.ShouldStop(256);
codigolayleituras.mostCurrent._codigolayanotacao._qtpaginas /*RemoteObject*/  = _qtpag;
 BA.debugLineNum = 298;BA.debugLine="CodigoLayAnotacao.nomeDoLivro = nomeLivro";
Debug.ShouldStop(512);
codigolayleituras.mostCurrent._codigolayanotacao._nomedolivro /*RemoteObject*/  = _nomelivro;
 BA.debugLineNum = 299;BA.debugLine="CodigoLayAnotacao.tipoLeitura = tipoLeitura";
Debug.ShouldStop(1024);
codigolayleituras.mostCurrent._codigolayanotacao._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 301;BA.debugLine="StartActivity(CodigoLayAnotacao)";
Debug.ShouldStop(4096);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolayanotacao.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e27.toString()); BA.debugLineNum = 303;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(16384);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Event_btLancar_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,307);
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
 BA.debugLineNum = 307;BA.debugLine="Sub Event_btLancar_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 309;BA.debugLine="Dim tituloLivro As 		String";
Debug.ShouldStop(1048576);
_titulolivro = RemoteObject.createImmutable("");Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 310;BA.debugLine="Dim nomeUsuario As 		String";
Debug.ShouldStop(2097152);
_nomeusuario = RemoteObject.createImmutable("");Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 311;BA.debugLine="Dim paginasAtuais As 	String";
Debug.ShouldStop(4194304);
_paginasatuais = RemoteObject.createImmutable("");Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 312;BA.debugLine="Dim totalPaginas As 	String";
Debug.ShouldStop(8388608);
_totalpaginas = RemoteObject.createImmutable("");Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 313;BA.debugLine="Dim meta As 			String";
Debug.ShouldStop(16777216);
_meta = RemoteObject.createImmutable("");Debug.locals.put("meta", _meta);
 BA.debugLineNum = 314;BA.debugLine="Dim idLivro As 			String";
Debug.ShouldStop(33554432);
_idlivro = RemoteObject.createImmutable("");Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 315;BA.debugLine="Dim tipoLeitura As 		String";
Debug.ShouldStop(67108864);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 317;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 319;BA.debugLine="Dim lista As List";
Debug.ShouldStop(1073741824);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 320;BA.debugLine="lista.Initialize";
Debug.ShouldStop(-2147483648);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 322;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 323;BA.debugLine="Dim colunaValor, valorSalvo, col As String";
Debug.ShouldStop(4);
_colunavalor = RemoteObject.createImmutable("");Debug.locals.put("colunaValor", _colunavalor);
_valorsalvo = RemoteObject.createImmutable("");Debug.locals.put("valorSalvo", _valorsalvo);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 325;BA.debugLine="lista = File.ReadList(File.DirInternal, nomeArqu";
Debug.ShouldStop(16);
_lista = codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(codigolayleituras.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(codigolayleituras.mostCurrent._nomearquivo));Debug.locals.put("lista", _lista);
 BA.debugLineNum = 327;BA.debugLine="colunaValor = lista.Get(b.Tag)";
Debug.ShouldStop(64);
_colunavalor = BA.ObjectToString(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag")))));Debug.locals.put("colunaValor", _colunavalor);
 BA.debugLineNum = 328;BA.debugLine="Dim testeArray(tamanhoLista) As	String";
Debug.ShouldStop(128);
_testearray = RemoteObject.createNewArray ("String", new int[] {codigolayleituras._tamanholista.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("testeArray", _testearray);
 BA.debugLineNum = 331;BA.debugLine="For coluna = 0 To testeArray.Length - 1";
Debug.ShouldStop(1024);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_testearray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_coluna = 0 ;
for (;(step16 > 0 && _coluna <= limit16) || (step16 < 0 && _coluna >= limit16) ;_coluna = ((int)(0 + _coluna + step16))  ) {
Debug.locals.put("coluna", _coluna);
 BA.debugLineNum = 333;BA.debugLine="col = colunaValor.SubString2(colunaValor.IndexO";
Debug.ShouldStop(4096);
_col = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("|")))));Debug.locals.put("col", _col);
 BA.debugLineNum = 334;BA.debugLine="valorSalvo = colunaValor.SubString2(colunaValor";
Debug.ShouldStop(8192);
_valorsalvo = _colunavalor.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_colunavalor.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("¨"))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_colunavalor.runMethod(true,"length")));Debug.locals.put("valorSalvo", _valorsalvo);
 BA.debugLineNum = 336;BA.debugLine="testeArray(coluna) = col";
Debug.ShouldStop(32768);
_testearray.setArrayElement (_col,BA.numberCast(int.class, _coluna));
 BA.debugLineNum = 337;BA.debugLine="colunaValor = valorSalvo";
Debug.ShouldStop(65536);
_colunavalor = _valorsalvo;Debug.locals.put("colunaValor", _colunavalor);
 }
}Debug.locals.put("coluna", _coluna);
;
 BA.debugLineNum = 341;BA.debugLine="tituloLivro = testeArray(0)";
Debug.ShouldStop(1048576);
_titulolivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("tituloLivro", _titulolivro);
 BA.debugLineNum = 342;BA.debugLine="nomeUsuario = testeArray(3)";
Debug.ShouldStop(2097152);
_nomeusuario = _testearray.getArrayElement(true,BA.numberCast(int.class, 3));Debug.locals.put("nomeUsuario", _nomeusuario);
 BA.debugLineNum = 343;BA.debugLine="paginasAtuais = testeArray(5)";
Debug.ShouldStop(4194304);
_paginasatuais = _testearray.getArrayElement(true,BA.numberCast(int.class, 5));Debug.locals.put("paginasAtuais", _paginasatuais);
 BA.debugLineNum = 344;BA.debugLine="totalPaginas = testeArray(1)";
Debug.ShouldStop(8388608);
_totalpaginas = _testearray.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("totalPaginas", _totalpaginas);
 BA.debugLineNum = 345;BA.debugLine="meta = testeArray(6)";
Debug.ShouldStop(16777216);
_meta = _testearray.getArrayElement(true,BA.numberCast(int.class, 6));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 346;BA.debugLine="idLivro = testeArray(2)";
Debug.ShouldStop(33554432);
_idlivro = _testearray.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("idLivro", _idlivro);
 BA.debugLineNum = 347;BA.debugLine="tipoLeitura = testeArray(4)";
Debug.ShouldStop(67108864);
_tipoleitura = _testearray.getArrayElement(true,BA.numberCast(int.class, 4));Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 349;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nomeUsuari";
Debug.ShouldStop(268435456);
codigolayleituras.mostCurrent._codigolancamentoleitura._nomeusuario /*RemoteObject*/  = _nomeusuario;
 BA.debugLineNum = 350;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = paginasAtu";
Debug.ShouldStop(536870912);
codigolayleituras.mostCurrent._codigolancamentoleitura._paginaatual /*RemoteObject*/  = BA.numberCast(int.class, _paginasatuais);
 BA.debugLineNum = 351;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = tituloLivr";
Debug.ShouldStop(1073741824);
codigolayleituras.mostCurrent._codigolancamentoleitura._titulolivro /*RemoteObject*/  = _titulolivro;
 BA.debugLineNum = 352;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = totalPagi";
Debug.ShouldStop(-2147483648);
codigolayleituras.mostCurrent._codigolancamentoleitura._totalpaginas /*RemoteObject*/  = BA.numberCast(int.class, _totalpaginas);
 BA.debugLineNum = 353;BA.debugLine="CodigoLancamentoLeitura.meta = meta";
Debug.ShouldStop(1);
codigolayleituras.mostCurrent._codigolancamentoleitura._meta /*RemoteObject*/  = BA.numberCast(int.class, _meta);
 BA.debugLineNum = 354;BA.debugLine="CodigoLancamentoLeitura.idLivro = idLivro";
Debug.ShouldStop(2);
codigolayleituras.mostCurrent._codigolancamentoleitura._idlivro /*RemoteObject*/  = BA.numberCast(int.class, _idlivro);
 BA.debugLineNum = 355;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipoLeitur";
Debug.ShouldStop(4);
codigolayleituras.mostCurrent._codigolancamentoleitura._tipoleitura /*RemoteObject*/  = _tipoleitura;
 BA.debugLineNum = 357;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
Debug.ShouldStop(16);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigolancamentoleitura.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",codigolayleituras.processBA, e38.toString()); BA.debugLineNum = 360;BA.debugLine="ToastMessageShow(\"Arquivos inexistentes, reinici";
Debug.ShouldStop(128);
codigolayleituras.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Arquivos inexistentes, reinicie o app.")),(Object)(codigolayleituras.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Event_lbl_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,64);
if (RapidSub.canDelegate("event_lbl_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_lbl_click");}
 BA.debugLineNum = 64;BA.debugLine="Sub Event_lbl_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="StartActivity(act_TelaCadastro)";
Debug.ShouldStop(1);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._act_telacadastro.getObject())));
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
public static RemoteObject  _event_panels_click() throws Exception{
try {
		Debug.PushSubsStack("Event_panels_Click (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,253);
if (RapidSub.canDelegate("event_panels_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_panels_click");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _t = RemoteObject.createImmutable(0);
 BA.debugLineNum = 253;BA.debugLine="Sub Event_panels_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 255;BA.debugLine="Dim t As Int";
Debug.ShouldStop(1073741824);
_t = RemoteObject.createImmutable(0);Debug.locals.put("t", _t);
 BA.debugLineNum = 257;BA.debugLine="p = Sender";
Debug.ShouldStop(1);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), codigolayleituras.mostCurrent.__c.runMethod(false,"Sender",codigolayleituras.mostCurrent.activityBA));
 BA.debugLineNum = 258;BA.debugLine="t = p.Tag";
Debug.ShouldStop(2);
_t = BA.numberCast(int.class, _p.runMethod(false,"getTag"));Debug.locals.put("t", _t);
 BA.debugLineNum = 260;BA.debugLine="If t = 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 261;BA.debugLine="StartActivity(Codigo_LayDetalhesLivro)";
Debug.ShouldStop(16);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigo_laydetalheslivro.getObject())));
 };
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 18;BA.debugLine="Dim scrollView2 As ScrollView";
codigolayleituras.mostCurrent._scrollview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim gradient As GradientDrawable";
codigolayleituras.mostCurrent._gradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");
 //BA.debugLineNum = 21;BA.debugLine="Dim panelNenhumaLeitura As Panel";
codigolayleituras.mostCurrent._panelnenhumaleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim cores(2) As Int";
codigolayleituras._cores = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});
 //BA.debugLineNum = 23;BA.debugLine="Dim tamanhoLista As Int";
codigolayleituras._tamanholista = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="Private btAdicionarLeitura As Button";
codigolayleituras.mostCurrent._btadicionarleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Panel_lendo As Panel";
codigolayleituras.mostCurrent._panel_lendo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private nomeArquivo As String = \"Informacoes.ini\"";
codigolayleituras.mostCurrent._nomearquivo = BA.ObjectToString("Informacoes.ini");
 //BA.debugLineNum = 29;BA.debugLine="Dim carrega_leitura_concluida As Boolean";
codigolayleituras._carrega_leitura_concluida = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 31;BA.debugLine="Private Panel_lidos As Panel";
codigolayleituras.mostCurrent._panel_lidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Panel_parabens As Panel";
codigolayleituras.mostCurrent._panel_parabens = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private B4XImage_parabens As B4XImageView";
codigolayleituras.mostCurrent._b4ximage_parabens = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim temPanel As Boolean = False";
codigolayleituras._tempanel = codigolayleituras.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 8;BA.debugLine="Dim temPanelLeituraConcluida As Boolean = False";
codigolayleituras._tempanelleituraconcluida = codigolayleituras.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _tabstrip_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,368);
if (RapidSub.canDelegate("tabstrip_pageselected")) { b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","tabstrip_pageselected", _position); return;}
ResumableSub_TabStrip_PageSelected rsub = new ResumableSub_TabStrip_PageSelected(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TabStrip_PageSelected extends BA.ResumableSub {
public ResumableSub_TabStrip_PageSelected(b4a.example.codigolayleituras parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigolayleituras parent;
RemoteObject _position;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _quantidade_linhas = RemoteObject.createImmutable(0);
RemoteObject _panels = null;
RemoteObject _lbl_titulo = null;
RemoteObject _lbl_data_termino = null;
RemoteObject _lbl_total_paginas = null;
RemoteObject _lbl_quantidade_lidas = null;
RemoteObject _lbl_dias_utilizados = null;
RemoteObject _tamanho_fonte = RemoteObject.createImmutable(0);
RemoteObject _topolabel = RemoteObject.createImmutable(0);
RemoteObject _topo = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
int _i = 0;
RemoteObject _altura = RemoteObject.createImmutable(0);
int step37;
int limit37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",8,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,368);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 370;BA.debugLine="If Position = 1 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 371;BA.debugLine="If carrega_leitura_concluida Or CodigoLancamento";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 32;
if (RemoteObject.solveBoolean(".",parent._carrega_leitura_concluida) || RemoteObject.solveBoolean(".",parent.mostCurrent._codigolancamentoleitura._terminouleitura /*RemoteObject*/ )) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 372;BA.debugLine="carrega_leitura_concluida = False";
Debug.ShouldStop(524288);
parent._carrega_leitura_concluida = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 373;BA.debugLine="CodigoLancamentoLeitura.terminouLeitura = False";
Debug.ShouldStop(1048576);
parent.mostCurrent._codigolancamentoleitura._terminouleitura /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 375;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//try
this.state = 31;
this.catchState = 30;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 30;
 BA.debugLineNum = 377;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(16777216);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 379;BA.debugLine="cmd = \"exec sp_atualiza_leitura_concluida \" &";
Debug.ShouldStop(67108864);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leitura_concluida "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 381;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "tabstrip_pageselected"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 34;
return;
case 34:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 383;BA.debugLine="Result.NextRow";
Debug.ShouldStop(1073741824);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 385;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 387;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 1))) { 
this.state = 14;
}else 
{ BA.debugLineNum = 467;BA.debugLine="else if Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 27;
}}}
if (true) break;

case 12:
//C
this.state = 28;
 BA.debugLineNum = 386;BA.debugLine="ToastMessageShow(\"Algo deu errado.\",True)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 390;BA.debugLine="If temPanelLeituraConcluida Then";
Debug.ShouldStop(32);
if (true) break;

case 15:
//if
this.state = 18;
if (parent._tempanelleituraconcluida.<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 391;BA.debugLine="temPanelLeituraConcluida = False";
Debug.ShouldStop(64);
parent._tempanelleituraconcluida = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 393;BA.debugLine="scrollView2.RemoveView";
Debug.ShouldStop(256);
parent.mostCurrent._scrollview2.runVoidMethod ("RemoveView");
 if (true) break;
;
 BA.debugLineNum = 396;BA.debugLine="If temPanelLeituraConcluida = False Then";
Debug.ShouldStop(2048);

case 18:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",parent._tempanelleituraconcluida,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 397;BA.debugLine="temPanelLeituraConcluida = True";
Debug.ShouldStop(4096);
parent._tempanelleituraconcluida = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 399;BA.debugLine="Dim quantidade_linhas As Int = Result.GetInt";
Debug.ShouldStop(16384);
_quantidade_linhas = _result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("QUANTIDADE_LINHAS")));Debug.locals.put("quantidade_linhas", _quantidade_linhas);Debug.locals.put("quantidade_linhas", _quantidade_linhas);
 BA.debugLineNum = 401;BA.debugLine="scrollView2.Initialize(500)";
Debug.ShouldStop(65536);
parent.mostCurrent._scrollview2.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 402;BA.debugLine="Dim panels(quantidade_linhas) As Panel";
Debug.ShouldStop(131072);
_panels = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("panels", _panels);
 BA.debugLineNum = 404;BA.debugLine="Dim lbl_titulo(quantidade_linhas) As Label";
Debug.ShouldStop(524288);
_lbl_titulo = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbl_titulo", _lbl_titulo);
 BA.debugLineNum = 405;BA.debugLine="Dim lbl_data_termino(quantidade_linhas) As L";
Debug.ShouldStop(1048576);
_lbl_data_termino = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbl_data_termino", _lbl_data_termino);
 BA.debugLineNum = 406;BA.debugLine="Dim lbl_total_paginas(quantidade_linhas) As";
Debug.ShouldStop(2097152);
_lbl_total_paginas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbl_total_paginas", _lbl_total_paginas);
 BA.debugLineNum = 407;BA.debugLine="Dim lbl_quantidade_lidas(quantidade_linhas)";
Debug.ShouldStop(4194304);
_lbl_quantidade_lidas = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbl_quantidade_lidas", _lbl_quantidade_lidas);
 BA.debugLineNum = 408;BA.debugLine="Dim lbl_dias_utilizados(quantidade_linhas) A";
Debug.ShouldStop(8388608);
_lbl_dias_utilizados = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {_quantidade_linhas.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbl_dias_utilizados", _lbl_dias_utilizados);
 BA.debugLineNum = 410;BA.debugLine="Panel_lidos.AddView(scrollView2, 0%x, 0%y, 1";
Debug.ShouldStop(33554432);
parent.mostCurrent._panel_lidos.runVoidMethod ("AddView",(Object)((parent.mostCurrent._scrollview2.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._btadicionarleitura.runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._btadicionarleitura.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 9)))}, "-+",2, 0))));
 BA.debugLineNum = 413;BA.debugLine="Dim tamanho_fonte As Int = 17.5";
Debug.ShouldStop(268435456);
_tamanho_fonte = BA.numberCast(int.class, 17.5);Debug.locals.put("tamanho_fonte", _tamanho_fonte);Debug.locals.put("tamanho_fonte", _tamanho_fonte);
 BA.debugLineNum = 414;BA.debugLine="Dim topoLabel As Int = 1%y";
Debug.ShouldStop(536870912);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 415;BA.debugLine="Dim topo As Int = 1%y";
Debug.ShouldStop(1073741824);
_topo = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topo", _topo);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 416;BA.debugLine="Dim g As GradientDrawable";
Debug.ShouldStop(-2147483648);
_g = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("g", _g);
 BA.debugLineNum = 417;BA.debugLine="Dim cores(2) As Int";
Debug.ShouldStop(1);
parent._cores = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});
 BA.debugLineNum = 418;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
Debug.ShouldStop(2);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 419;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
Debug.ShouldStop(4);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 421;BA.debugLine="g.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(16);
_g.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(parent._cores));
 BA.debugLineNum = 423;BA.debugLine="g.CornerRadius = 12";
Debug.ShouldStop(64);
_g.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 12));
 BA.debugLineNum = 425;BA.debugLine="For i = 0 To panels.Length - 1";
Debug.ShouldStop(256);
if (true) break;

case 21:
//for
this.state = 24;
step37 = 1;
limit37 = RemoteObject.solve(new RemoteObject[] {_panels.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 24;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 23;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step37)) ;
Debug.locals.put("i", _i);
if (true) break;

case 23:
//C
this.state = 36;
 BA.debugLineNum = 427;BA.debugLine="topoLabel = 1%y";
Debug.ShouldStop(1024);
_topolabel = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 429;BA.debugLine="lbl_titulo(i).Initialize(\"\")";
Debug.ShouldStop(4096);
_lbl_titulo.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 430;BA.debugLine="lbl_data_termino(i).Initialize(\"\")";
Debug.ShouldStop(8192);
_lbl_data_termino.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 431;BA.debugLine="lbl_total_paginas(i).Initialize(\"\")";
Debug.ShouldStop(16384);
_lbl_total_paginas.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 432;BA.debugLine="lbl_quantidade_lidas(i).Initialize(\"\")";
Debug.ShouldStop(32768);
_lbl_quantidade_lidas.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 433;BA.debugLine="lbl_dias_utilizados(i).Initialize(\"\")";
Debug.ShouldStop(65536);
_lbl_dias_utilizados.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 435;BA.debugLine="panels(i).Initialize(\"\")";
Debug.ShouldStop(262144);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 436;BA.debugLine="panels(i).Background = g";
Debug.ShouldStop(524288);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(_g.getObject()));
 BA.debugLineNum = 437;BA.debugLine="panels(i).Padding = Array As Int(0dip, 0dip";
Debug.ShouldStop(1048576);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 438;BA.debugLine="panels(i).Elevation = 3dip";
Debug.ShouldStop(2097152);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setElevation",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 440;BA.debugLine="panels(i).Color = Colors.White";
Debug.ShouldStop(8388608);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 442;BA.debugLine="scrollView2.Panel.AddView(panels(i), 1%x, t";
Debug.ShouldStop(33554432);
parent.mostCurrent._scrollview2.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_panels.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topo),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 19)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 444;BA.debugLine="lbl_titulo(i) = configuraLabel(Result.GetSt";
Debug.ShouldStop(134217728);
_lbl_titulo.setArrayElement (_configuralabel(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("titulo"))),BA.numberCast(int.class, 23),parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 189)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 1)))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 445;BA.debugLine="lbl_data_termino(i) = configuraLabel(\"Termi";
Debug.ShouldStop(268435456);
_lbl_data_termino.setArrayElement (_configuralabel(RemoteObject.concat(RemoteObject.createImmutable("Terminei no dia "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_canclusao")))),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 446;BA.debugLine="lbl_total_paginas(i) = configuraLabel(Resul";
Debug.ShouldStop(536870912);
_lbl_total_paginas.setArrayElement (_configuralabel(RemoteObject.concat(_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos"))),RemoteObject.createImmutable(" "),_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura"))),RemoteObject.createImmutable(" de "),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("quantidade_paginas")))),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 447;BA.debugLine="lbl_dias_utilizados(i) = configuraLabel(\"Ga";
Debug.ShouldStop(1073741824);
_lbl_dias_utilizados.setArrayElement (_configuralabel(RemoteObject.concat(RemoteObject.createImmutable("Gastei "),_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("total_dias_utilizados"))),RemoteObject.createImmutable(" dias para terminar")),_tamanho_fonte,parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 72)))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 449;BA.debugLine="Dim altura As Int = 3.5%y";
Debug.ShouldStop(1);
_altura = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.5)),codigolayleituras.mostCurrent.activityBA);Debug.locals.put("altura", _altura);Debug.locals.put("altura", _altura);
 BA.debugLineNum = 450;BA.debugLine="panels(i).AddView(lbl_titulo(i), 3%x, topoL";
Debug.ShouldStop(2);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("AddView",(Object)((_lbl_titulo.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 451;BA.debugLine="topoLabel = topoLabel + altura + 18dip";
Debug.ShouldStop(4);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 452;BA.debugLine="panels(i).AddView(lbl_data_termino(i), 3%x,";
Debug.ShouldStop(8);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("AddView",(Object)((_lbl_data_termino.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 453;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(16);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 454;BA.debugLine="panels(i).AddView(lbl_total_paginas(i), 3%x";
Debug.ShouldStop(32);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("AddView",(Object)((_lbl_total_paginas.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 455;BA.debugLine="topoLabel = topoLabel + altura + 1dip";
Debug.ShouldStop(64);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 456;BA.debugLine="panels(i).AddView(lbl_dias_utilizados(i), 3";
Debug.ShouldStop(128);
_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("AddView",(Object)((_lbl_dias_utilizados.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(_topolabel),(Object)(RemoteObject.solve(new RemoteObject[] {_panels.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),codigolayleituras.mostCurrent.activityBA)}, "-",1, 1)),(Object)(_altura));
 BA.debugLineNum = 457;BA.debugLine="topoLabel = topoLabel + altura + 2dip";
Debug.ShouldStop(256);
_topolabel = RemoteObject.solve(new RemoteObject[] {_topolabel,_altura,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1);Debug.locals.put("topoLabel", _topolabel);
 BA.debugLineNum = 459;BA.debugLine="topo = topo + 19%y + 10dip";
Debug.ShouldStop(1024);
_topo = RemoteObject.solve(new RemoteObject[] {_topo,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 19)),codigolayleituras.mostCurrent.activityBA),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1);Debug.locals.put("topo", _topo);
 BA.debugLineNum = 461;BA.debugLine="scrollView2.Panel.Height = topo";
Debug.ShouldStop(4096);
parent.mostCurrent._scrollview2.runMethod(false,"getPanel").runMethod(true,"setHeight",_topo);
 BA.debugLineNum = 462;BA.debugLine="Result.NextRow";
Debug.ShouldStop(8192);
_result.runVoidMethod ("NextRow");
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 469;BA.debugLine="ToastMessageShow(\"Não existem leituras conclu";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Não existem leituras concluídas")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
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
 BA.debugLineNum = 473;BA.debugLine="ToastMessageShow(\"Problemas ao carregar leitur";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Problemas ao carregar leituras concluídas")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
}