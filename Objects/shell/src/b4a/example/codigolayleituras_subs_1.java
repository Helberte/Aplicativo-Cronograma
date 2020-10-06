package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigolayleituras_subs_1 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,27);
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
		Debug.PushSubsStack("Activity_Create (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,27);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"LayLeiturasTabStrip\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LayLeiturasTabStrip")),codigolayleituras.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu1\",\"Lendo\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu1")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lendo"))));
 BA.debugLineNum = 30;BA.debugLine="TabStrip.LoadLayout(\"LayLeitura_menu2\",\"Lidos\")";
Debug.ShouldStop(536870912);
parent.mostCurrent._tabstrip.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("LayLeitura_menu2")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lidos"))));
 BA.debugLineNum = 32;BA.debugLine="lbl_Inicial_Leitura.Initialize( \"Event_lbl\" )";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_inicial_leitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_lbl")));
 BA.debugLineNum = 34;BA.debugLine="banco.Initialize";
Debug.ShouldStop(2);
parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigolayleituras.processBA);
 BA.debugLineNum = 36;BA.debugLine="cores(0) = Colors.RGB(255,255,255)";
Debug.ShouldStop(8);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 37;BA.debugLine="cores(1) = Colors.RGB(255,255,255)";
Debug.ShouldStop(16);
parent._cores.setArrayElement (parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 39;BA.debugLine="panelNenhumaLeitura.Initialize( \"\" )";
Debug.ShouldStop(64);
parent.mostCurrent._panelnenhumaleitura.runVoidMethod ("Initialize",codigolayleituras.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 40;BA.debugLine="ScrollView1.Panel.Height = 100%y";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),codigolayleituras.mostCurrent.activityBA));
 BA.debugLineNum = 42;BA.debugLine="panelLeituras.Visible = False";
Debug.ShouldStop(512);
parent.mostCurrent._panelleituras.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(1024);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 46;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_create"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 48;BA.debugLine="If Success = False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,114);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 114;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,59);
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
		Debug.PushSubsStack("Activity_Resume (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,59);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 61;BA.debugLine="If CodigoCadastroLivro.cadastrou Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._codigocadastrolivro._cadastrou /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 62;BA.debugLine="Wait For (Atualiza_leituras) Complete (Success A";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "activity_resume"), _atualiza_leituras());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 64;BA.debugLine="CodigoCadastroLivro.cadastrou = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._codigocadastrolivro._cadastrou /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 65;BA.debugLine="If Success = False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 67;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\"";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 68;BA.debugLine="CodigoCadastroLivro.cadastrou = True";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,73);
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

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Atualiza_leituras (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,73);
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
 BA.debugLineNum = 75;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 77;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(4096);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 79;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(16384);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 81;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete (";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigolayleituras.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigolayleituras", "atualiza_leituras"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 83;BA.debugLine="Result.NextRow";
Debug.ShouldStop(262144);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 85;BA.debugLine="If Result.GetInt(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 87;BA.debugLine="panelLeituras.Visible = False";
Debug.ShouldStop(4194304);
parent.mostCurrent._panelleituras.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="btAdicionarLeitura.Visible = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._btadicionarleitura.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="lbl_Inicial_Leitura.Text = Result.GetString(\"ME";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM")))));
 BA.debugLineNum = 91;BA.debugLine="lbl_Inicial_Leitura.TextColor = Colors.Black";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 92;BA.debugLine="lbl_Inicial_Leitura.TextSize = 20";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_inicial_leitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 100;BA.debugLine="ScrollView1.Panel.AddView(lbl_Inicial_Leitura,";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._lbl_inicial_leitura.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigolayleituras.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigolayleituras.mostCurrent.activityBA)));
 BA.debugLineNum = 102;BA.debugLine="Return True";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 104;BA.debugLine="panelLeituras.Visible = True";
Debug.ShouldStop(128);
parent.mostCurrent._panelleituras.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="Return True";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 108;BA.debugLine="ToastMessageShow(\"Impossível carregar leituras\",";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Impossível carregar leituras")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 109;BA.debugLine="Return False";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btAdicionarLeitura_Click (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,118);
if (RapidSub.canDelegate("btadicionarleitura_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","btadicionarleitura_click");}
 BA.debugLineNum = 118;BA.debugLine="Sub btAdicionarLeitura_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="StartActivity(CodigoCadastroLivro)";
Debug.ShouldStop(4194304);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigocadastrolivro.getObject())));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Event_lbl_Click (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,55);
if (RapidSub.canDelegate("event_lbl_click")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","event_lbl_click");}
 BA.debugLineNum = 55;BA.debugLine="Sub Event_lbl_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="StartActivity(CodigoCadastroLivro)";
Debug.ShouldStop(8388608);
codigolayleituras.mostCurrent.__c.runVoidMethod ("StartActivity",codigolayleituras.processBA,(Object)((codigolayleituras.mostCurrent._codigocadastrolivro.getObject())));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 11;BA.debugLine="Private banco As ClassBancoDados";
codigolayleituras.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 12;BA.debugLine="Private TabStrip As TabStrip";
codigolayleituras.mostCurrent._tabstrip = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 14;BA.debugLine="Dim lbl_Inicial_Leitura As Label";
codigolayleituras.mostCurrent._lbl_inicial_leitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
codigolayleituras.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private panelLeituras As Panel";
codigolayleituras.mostCurrent._panelleituras = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim gradient As GradientDrawable";
codigolayleituras.mostCurrent._gradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");
 //BA.debugLineNum = 22;BA.debugLine="Dim panelNenhumaLeitura As Panel";
codigolayleituras.mostCurrent._panelnenhumaleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim cores(2) As Int";
codigolayleituras._cores = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="Private btAdicionarLeitura As Button";
codigolayleituras.mostCurrent._btadicionarleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabstrip_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("TabStrip_PageSelected (codigolayleituras) ","codigolayleituras",3,codigolayleituras.mostCurrent.activityBA,codigolayleituras.mostCurrent,122);
if (RapidSub.canDelegate("tabstrip_pageselected")) { return b4a.example.codigolayleituras.remoteMe.runUserSub(false, "codigolayleituras","tabstrip_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 122;BA.debugLine="Sub TabStrip_PageSelected (Position As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}