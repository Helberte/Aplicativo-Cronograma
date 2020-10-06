package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xinputtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xinputtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public String _text = "";
public b4a.example.b4xdialog _xdialog = null;
public String _regexpattern = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public boolean _mallowdecimals = false;
public int _bordercolor = 0;
public int _bordercolorinvalid = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xinputtemplate parent,b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.b4xinputtemplate __ref;
b4a.example.b4xinputtemplate parent;
b4a.example.b4xdialog _dialog;
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xinputtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="TextField1.Text = Text";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._text /*String*/ ));
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Validate(Text)";
__ref._validate /*String*/ (null,__ref._text /*String*/ );
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="TextField1.RequestFocus";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Dim tf As EditText = TextField1";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
_tf = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="tf.SelectAll";
_tf.SelectAll();
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="IME.ShowKeyboard(TextField1)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.b4xinputtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Text = TextField1.Text";
__ref._text /*String*/  = __ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
 };
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Public Text As String";
_text = "";
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Public RegexPattern As String";
_regexpattern = "";
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="Public lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Private mAllowDecimals As Boolean";
_mallowdecimals = false;
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="Private BorderColor = xui.Color_White, BorderColo";
_bordercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
_bordercolorinvalid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(b4a.example.b4xinputtemplate __ref,boolean _allowdecimals,boolean _allownegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "configurefornumbers", true))
	 {return ((String) Debug.delegate(ba, "configurefornumbers", new Object[] {_allowdecimals,_allownegative}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim et As EditText = TextField1";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="If AllowDecimals Or AllowNegative Then";
if (_allowdecimals || _allownegative) { 
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_DECIMAL_NUMBERS);
 }else {
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="et.InputType = et.INPUT_TYPE_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_NUMBERS);
 };
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=13172757;
 //BA.debugLineNum = 13172757;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
if (_allowdecimals && _allownegative==__c.False) { 
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.True) { 
RDebugUtils.currentLine=13172760;
 //BA.debugLineNum = 13172760;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)$";
 }else 
{RDebugUtils.currentLine=13172761;
 //BA.debugLineNum = 13172761;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.False) { 
RDebugUtils.currentLine=13172762;
 //BA.debugLineNum = 13172762;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)$";
 }}}}
;
RDebugUtils.currentLine=13172764;
 //BA.debugLineNum = 13172764;BA.debugLine="mAllowDecimals = AllowDecimals";
__ref._mallowdecimals /*boolean*/  = _allowdecimals;
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xinputtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XInputTemplate",ba);
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="TextField1.TextColor = xui.Color_White";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Dim jo As JavaObject = TextField1";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="End Sub";
return "";
}
public String  _setborder(b4a.example.b4xinputtemplate __ref,int _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_bc}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub SetBorder(bc As Int)";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_bc,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalid(b4a.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "isvalid", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalid", new Object[] {_new}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (__ref._regexpattern /*String*/ ).equals("") || __c.Regex.IsMatch(__ref._regexpattern /*String*/ ,_new);
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return false;
}
public String  _setbordercolor(b4a.example.b4xinputtemplate __ref,int _valid,int _invalid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((String) Debug.delegate(ba, "setbordercolor", new Object[] {_valid,_invalid}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub SetBorderColor(Valid As Int, Invalid As";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="BorderColor = Valid";
__ref._bordercolor /*int*/  = _valid;
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="BorderColorInvalid = Invalid";
__ref._bordercolorinvalid /*int*/  = _invalid;
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="End Sub";
return "";
}
public String  _validate(b4a.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((String) Debug.delegate(ba, "validate", new Object[] {_new}));}
int _bc = 0;
boolean _enabled = false;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub Validate (New As String)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim bc As Int = BorderColor";
_bc = __ref._bordercolor /*int*/ ;
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="If IsValid(New) = False Then";
if (__ref._isvalid /*boolean*/ (null,_new)==__c.False) { 
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="bc = BorderColorInvalid";
_bc = __ref._bordercolorinvalid /*int*/ ;
 };
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4a.example.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,_enabled);
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="SetBorder(bc)";
__ref._setborder /*String*/ (null,_bc);
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_action(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_action", true))
	 {return ((String) Debug.delegate(ba, "textfield1_action", null));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub TextField1_Action";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="TextField1_EnterPressed";
__ref._textfield1_enterpressed /*String*/ (null);
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "textfield1_enterpressed", null));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub TextField1_EnterPressed";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (__ref._isvalid /*boolean*/ (null,__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())) { 
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);};
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(b4a.example.b4xinputtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_textchanged", true))
	 {return ((String) Debug.delegate(ba, "textfield1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="Validate (New)";
__ref._validate /*String*/ (null,_new);
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("textfield1_textchanged");
}
}