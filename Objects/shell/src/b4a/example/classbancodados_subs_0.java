package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class classbancodados_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private driver As String = \"net.sourceforge.jtds.";
classbancodados._driver = BA.ObjectToString("net.sourceforge.jtds.jdbc.Driver");__ref.setField("_driver",classbancodados._driver);
 //BA.debugLineNum = 3;BA.debugLine="Private jdbcUrl As String = \"jdbc:jtds:sqlserver:";
classbancodados._jdbcurl = BA.ObjectToString("jdbc:jtds:sqlserver://192.168.1.105:1433;databaseName=cronograma;logintimeout=10");__ref.setField("_jdbcurl",classbancodados._jdbcurl);
 //BA.debugLineNum = 6;BA.debugLine="Private usuario As String = \"sa\"";
classbancodados._usuario = BA.ObjectToString("sa");__ref.setField("_usuario",classbancodados._usuario);
 //BA.debugLineNum = 7;BA.debugLine="Private senha As String = \"254685ro\"";
classbancodados._senha = BA.ObjectToString("254685ro");__ref.setField("_senha",classbancodados._senha);
 //BA.debugLineNum = 8;BA.debugLine="Private conexao As JdbcSQL";
classbancodados._conexao = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_conexao",classbancodados._conexao);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conecta(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conecta (classbancodados) ","classbancodados",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("conecta")) { return __ref.runUserSub(false, "classbancodados","conecta", __ref);}
ResumableSub_Conecta rsub = new ResumableSub_Conecta(null,__ref);
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
public static class ResumableSub_Conecta extends BA.ResumableSub {
public ResumableSub_Conecta(b4a.example.classbancodados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.classbancodados parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Conecta (classbancodados) ","classbancodados",1,__ref.getField(false, "ba"),__ref,16);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 17;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 18;BA.debugLine="conexao.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_conexao" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 19;BA.debugLine="conexao.InitializeAsync(\"MSSQL\", driver, jdbcUrl";
Debug.ShouldStop(262144);
__ref.getField(false,"_conexao" /*RemoteObject*/ ).runVoidMethod ("InitializeAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("MSSQL")),(Object)(__ref.getField(true,"_driver" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_jdbcurl" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_usuario" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_senha" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="Wait For MSSQL_Ready (Success As Boolean)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","mssql_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "classbancodados", "conecta"), null);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 21;BA.debugLine="Return Success";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 23;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _mssql_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (classbancodados) ","classbancodados",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "classbancodados","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insert_consulta(RemoteObject __ref,RemoteObject _cmd) throws Exception{
try {
		Debug.PushSubsStack("Insert_Consulta (classbancodados) ","classbancodados",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("insert_consulta")) { return __ref.runUserSub(false, "classbancodados","insert_consulta", __ref, _cmd);}
ResumableSub_Insert_Consulta rsub = new ResumableSub_Insert_Consulta(null,__ref,_cmd);
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
public static class ResumableSub_Insert_Consulta extends BA.ResumableSub {
public ResumableSub_Insert_Consulta(b4a.example.classbancodados parent,RemoteObject __ref,RemoteObject _cmd) {
this.parent = parent;
this.__ref = __ref;
this._cmd = _cmd;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.classbancodados parent;
RemoteObject _cmd;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Insert_Consulta (classbancodados) ","classbancodados",1,__ref.getField(false, "ba"),__ref,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 29;BA.debugLine="Wait For (Conecta) Complete (Success As Boolean)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "classbancodados", "insert_consulta"), __ref.runClassMethod (b4a.example.classbancodados.class, "_conecta" /*RemoteObject*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 30;BA.debugLine="If Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 18;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 31;BA.debugLine="Dim result As Object = conexao.ExecQueryAsync(\"S";
Debug.ShouldStop(1073741824);
_result = __ref.getField(false,"_conexao" /*RemoteObject*/ ).runMethod(false,"ExecQueryAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SP")),(Object)(_cmd),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 33;BA.debugLine="Wait For (result) SP_QueryComplete (Success As";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","sp_querycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "classbancodados", "insert_consulta"), _result);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_rs = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("rs", _rs);
;
 BA.debugLineNum = 34;BA.debugLine="If Success Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 12;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 35;BA.debugLine="Return rs";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rs));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 37;BA.debugLine="Return Null";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 40;BA.debugLine="Return Null";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 0;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 43;BA.debugLine="Return Null";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _sp_querycomplete(RemoteObject __ref,RemoteObject _success,RemoteObject _rs) throws Exception{
}
}