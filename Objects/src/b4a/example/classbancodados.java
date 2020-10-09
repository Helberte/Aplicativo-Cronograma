package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class classbancodados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.classbancodados");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.classbancodados.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _driver = "";
public String _jdbcurl = "";
public String _usuario = "";
public String _senha = "";
public anywheresoftware.b4j.objects.SQL _conexao = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
<<<<<<< Updated upstream
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private driver As String = \"net.sourceforge.jtds.";
_driver = "net.sourceforge.jtds.jdbc.Driver";
 //BA.debugLineNum = 3;BA.debugLine="Private jdbcUrl As String = \"jdbc:jtds:sqlserver:";
_jdbcurl = "jdbc:jtds:sqlserver://192.168.1.104:1433;databaseName=cronograma;logintimeout=10";
 //BA.debugLineNum = 4;BA.debugLine="Private usuario As String = \"sa\"";
_usuario = "sa";
 //BA.debugLineNum = 5;BA.debugLine="Private senha As String = \"254685ro\"";
_senha = "254685ro";
 //BA.debugLineNum = 6;BA.debugLine="Private conexao As JdbcSQL";
_conexao = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _conecta() throws Exception{
ResumableSub_Conecta rsub = new ResumableSub_Conecta(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Conecta extends BA.ResumableSub {
public ResumableSub_Conecta(b4a.example.classbancodados parent) {
this.parent = parent;
}
b4a.example.classbancodados parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 15;BA.debugLine="Try";
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
 //BA.debugLineNum = 16;BA.debugLine="conexao.Close";
parent._conexao.Close();
 //BA.debugLineNum = 17;BA.debugLine="conexao.InitializeAsync(\"MSSQL\", driver, jdbcUrl";
parent._conexao.InitializeAsync(ba,"MSSQL",parent._driver,parent._jdbcurl,parent._usuario,parent._senha);
 //BA.debugLineNum = 18;BA.debugLine="Wait For MSSQL_Ready (Success As Boolean)";
parent.__c.WaitFor("mssql_ready", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 19;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 21;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _mssql_ready(boolean _success) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
=======
public String  _initialize(b4a.example.classbancodados __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
>>>>>>> Stashed changes
innerInitialize(_ba);
RDebugUtils.currentModule="classbancodados";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _insert_consulta(b4a.example.classbancodados __ref,String _cmd) throws Exception{
RDebugUtils.currentModule="classbancodados";
if (Debug.shouldDelegate(ba, "insert_consulta", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "insert_consulta", new Object[] {_cmd}));}
ResumableSub_Insert_Consulta rsub = new ResumableSub_Insert_Consulta(this,__ref,_cmd);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Insert_Consulta extends BA.ResumableSub {
public ResumableSub_Insert_Consulta(b4a.example.classbancodados parent,b4a.example.classbancodados __ref,String _cmd) {
this.parent = parent;
this.__ref = __ref;
this._cmd = _cmd;
this.__ref = parent;
}
b4a.example.classbancodados __ref;
b4a.example.classbancodados parent;
String _cmd;
boolean _success = false;
Object _result = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="classbancodados";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Wait For (Conecta) Complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "classbancodados", "insert_consulta"), __ref._conecta /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_success) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="Dim result As Object = conexao.ExecQueryAsync(\"S";
_result = __ref._conexao /*anywheresoftware.b4j.objects.SQL*/ .ExecQueryAsync(ba,"SP",_cmd,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Try";
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
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="Wait For (result) SP_QueryComplete (Success As";
parent.__c.WaitFor("sp_querycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "classbancodados", "insert_consulta"), _result);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_success = (Boolean) result[1];
_rs = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[2];
;
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="If Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_success) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="Return rs";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rs));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=22085641;
 //BA.debugLineNum = 22085641;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=22085644;
 //BA.debugLineNum = 22085644;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
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
RDebugUtils.currentLine=22085647;
 //BA.debugLineNum = 22085647;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=22085649;
 //BA.debugLineNum = 22085649;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _class_globals(b4a.example.classbancodados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classbancodados";
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Private driver As String = \"net.sourceforge.jtds.";
_driver = "net.sourceforge.jtds.jdbc.Driver";
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Private jdbcUrl As String = \"jdbc:jtds:sqlserver:";
_jdbcurl = "jdbc:jtds:sqlserver://192.168.2.5:1433;databaseName=cronograma;logintimeout=10";
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Private usuario As String = \"sa\"";
_usuario = "sa";
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Private senha As String = \"254685ro\"";
_senha = "254685ro";
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Private conexao As JdbcSQL";
_conexao = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _conecta(b4a.example.classbancodados __ref) throws Exception{
RDebugUtils.currentModule="classbancodados";
if (Debug.shouldDelegate(ba, "conecta", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "conecta", null));}
ResumableSub_Conecta rsub = new ResumableSub_Conecta(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Conecta extends BA.ResumableSub {
public ResumableSub_Conecta(b4a.example.classbancodados parent,b4a.example.classbancodados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.classbancodados __ref;
b4a.example.classbancodados parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="classbancodados";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Try";
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
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="conexao.Close";
__ref._conexao /*anywheresoftware.b4j.objects.SQL*/ .Close();
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="conexao.InitializeAsync(\"MSSQL\", driver, jdbcUrl";
__ref._conexao /*anywheresoftware.b4j.objects.SQL*/ .InitializeAsync(ba,"MSSQL",__ref._driver /*String*/ ,__ref._jdbcurl /*String*/ ,__ref._usuario /*String*/ ,__ref._senha /*String*/ );
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Wait For MSSQL_Ready (Success As Boolean)";
parent.__c.WaitFor("mssql_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "classbancodados", "conecta"), null);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}