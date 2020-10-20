package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xformatter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xformatter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xformatdata{
public boolean IsInitialized;
public String Prefix;
public String Postfix;
public int MinimumIntegers;
public int MinimumFractions;
public int MaximumFractions;
public String GroupingCharacter;
public String DecimalPoint;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont FormatFont;
public double RangeStart;
public double RangeEnd;
public boolean RemoveMinusSign;
public String IntegerPaddingChar;
public String FractionPaddingChar;
public void Initialize() {
IsInitialized = true;
Prefix = "";
Postfix = "";
MinimumIntegers = 0;
MinimumFractions = 0;
MaximumFractions = 0;
GroupingCharacter = "";
DecimalPoint = "";
TextColor = 0;
FormatFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RangeStart = 0;
RangeEnd = 0;
RemoveMinusSign = false;
IntegerPaddingChar = "";
FractionPaddingChar = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _formats = null;
public int _max_value = 0;
public int _min_value = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.b4xformatter._b4xformatdata  _getdefaultformat(b4a.example.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getdefaultformat", true))
	 {return ((b4a.example.b4xformatter._b4xformatdata) Debug.delegate(ba, "getdefaultformat", null));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Public Sub GetDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Return formats.Get(0)";
if (true) return (b4a.example.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return null;
}
public String  _format(b4a.example.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "format", true))
	 {return ((String) Debug.delegate(ba, "format", new Object[] {_number}));}
b4a.example.b4xformatter._b4xformatdata _data = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _numberstartindex = 0;
double _factor = 0;
int _whole = 0;
double _frac = 0;
int _g = 0;
int _fracstartindex = 0;
int _lastzerocount = 0;
int _multipler = 0;
int _w = 0;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub Format (Number As Double) As String";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If Number < MIN_VALUE Or Number > MAX_VALUE Then";
if (_number<__ref._min_value /*int*/  || _number>__ref._max_value /*int*/ ) { 
if (true) return "OVERFLOW";};
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Dim data As B4XFormatData = GetFormatData (Number";
_data = __ref._getformatdata /*b4a.example.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="sb.Append(data.Prefix)";
_sb.Append(_data.Prefix /*String*/ );
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="Dim NumberStartIndex As Int = sb.Length";
_numberstartindex = _sb.getLength();
RDebugUtils.currentLine=22544391;
 //BA.debugLineNum = 22544391;BA.debugLine="Dim factor As Double = Power(10, -data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ -1)*5;
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="If Number < -factor And data.RemoveMinusSign = Fa";
if (_number<-_factor && _data.RemoveMinusSign /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22544393;
 //BA.debugLineNum = 22544393;BA.debugLine="sb.Append(\"-\")";
_sb.Append("-");
RDebugUtils.currentLine=22544394;
 //BA.debugLineNum = 22544394;BA.debugLine="NumberStartIndex = NumberStartIndex + 1";
_numberstartindex = (int) (_numberstartindex+1);
 };
RDebugUtils.currentLine=22544396;
 //BA.debugLineNum = 22544396;BA.debugLine="Number = Abs(Number) + factor";
_number = __c.Abs(_number)+_factor;
RDebugUtils.currentLine=22544397;
 //BA.debugLineNum = 22544397;BA.debugLine="Dim whole As Int = Number";
_whole = (int) (_number);
RDebugUtils.currentLine=22544398;
 //BA.debugLineNum = 22544398;BA.debugLine="Dim frac As Double = Number - whole";
_frac = _number-_whole;
RDebugUtils.currentLine=22544399;
 //BA.debugLineNum = 22544399;BA.debugLine="Dim g As Int";
_g = 0;
RDebugUtils.currentLine=22544400;
 //BA.debugLineNum = 22544400;BA.debugLine="Do While whole > 0";
while (_whole>0) {
RDebugUtils.currentLine=22544401;
 //BA.debugLineNum = 22544401;BA.debugLine="If g > 0 And g Mod 3 = 0 And data.GroupingCharac";
if (_g>0 && _g%3==0 && _data.GroupingCharacter /*String*/ .length()>0) { 
RDebugUtils.currentLine=22544402;
 //BA.debugLineNum = 22544402;BA.debugLine="sb.Insert(NumberStartIndex, data.GroupingCharac";
_sb.Insert(_numberstartindex,_data.GroupingCharacter /*String*/ );
 };
RDebugUtils.currentLine=22544404;
 //BA.debugLineNum = 22544404;BA.debugLine="g = g + 1";
_g = (int) (_g+1);
RDebugUtils.currentLine=22544405;
 //BA.debugLineNum = 22544405;BA.debugLine="sb.Insert(NumberStartIndex, whole Mod 10)";
_sb.Insert(_numberstartindex,BA.NumberToString(_whole%10));
RDebugUtils.currentLine=22544406;
 //BA.debugLineNum = 22544406;BA.debugLine="whole = whole / 10";
_whole = (int) (_whole/(double)10);
 }
;
RDebugUtils.currentLine=22544408;
 //BA.debugLineNum = 22544408;BA.debugLine="Do While sb.Length - NumberStartIndex < data.Mini";
while (_sb.getLength()-_numberstartindex<_data.MinimumIntegers /*int*/ ) {
RDebugUtils.currentLine=22544409;
 //BA.debugLineNum = 22544409;BA.debugLine="sb.Insert(NumberStartIndex, data.IntegerPaddingC";
_sb.Insert(_numberstartindex,_data.IntegerPaddingChar /*String*/ );
 }
;
RDebugUtils.currentLine=22544411;
 //BA.debugLineNum = 22544411;BA.debugLine="If data.MaximumFractions > 0 And (data.MinimumFra";
if (_data.MaximumFractions /*int*/ >0 && (_data.MinimumFractions /*int*/ >0 || _frac>0)) { 
RDebugUtils.currentLine=22544412;
 //BA.debugLineNum = 22544412;BA.debugLine="Dim FracStartIndex As Int = sb.Length";
_fracstartindex = _sb.getLength();
RDebugUtils.currentLine=22544413;
 //BA.debugLineNum = 22544413;BA.debugLine="Dim LastZeroCount As Int";
_lastzerocount = 0;
RDebugUtils.currentLine=22544414;
 //BA.debugLineNum = 22544414;BA.debugLine="Dim Multipler As Int = 10";
_multipler = (int) (10);
RDebugUtils.currentLine=22544415;
 //BA.debugLineNum = 22544415;BA.debugLine="Do While frac >= 2 * factor And sb.Length - Frac";
while (_frac>=2*_factor && _sb.getLength()-_fracstartindex<_data.MaximumFractions /*int*/ ) {
RDebugUtils.currentLine=22544416;
 //BA.debugLineNum = 22544416;BA.debugLine="Dim w As Int = (frac * Multipler)";
_w = (int) ((_frac*_multipler));
RDebugUtils.currentLine=22544417;
 //BA.debugLineNum = 22544417;BA.debugLine="w = w Mod 10";
_w = (int) (_w%10);
RDebugUtils.currentLine=22544418;
 //BA.debugLineNum = 22544418;BA.debugLine="If w = 0 Then LastZeroCount = LastZeroCount + 1";
if (_w==0) { 
_lastzerocount = (int) (_lastzerocount+1);}
else {
_lastzerocount = (int) (0);};
RDebugUtils.currentLine=22544419;
 //BA.debugLineNum = 22544419;BA.debugLine="sb.Append(w)";
_sb.Append(BA.NumberToString(_w));
RDebugUtils.currentLine=22544420;
 //BA.debugLineNum = 22544420;BA.debugLine="Multipler = Multipler * 10";
_multipler = (int) (_multipler*10);
 }
;
RDebugUtils.currentLine=22544422;
 //BA.debugLineNum = 22544422;BA.debugLine="If data.FractionPaddingChar <> \"0\" And LastZeroC";
if ((_data.FractionPaddingChar /*String*/ ).equals("0") == false && _lastzerocount>0) { 
RDebugUtils.currentLine=22544423;
 //BA.debugLineNum = 22544423;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
RDebugUtils.currentLine=22544424;
 //BA.debugLineNum = 22544424;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 };
RDebugUtils.currentLine=22544426;
 //BA.debugLineNum = 22544426;BA.debugLine="Do While sb.Length - FracStartIndex < data.Minim";
while (_sb.getLength()-_fracstartindex<_data.MinimumFractions /*int*/ ) {
RDebugUtils.currentLine=22544427;
 //BA.debugLineNum = 22544427;BA.debugLine="sb.Append(data.FractionPaddingChar)";
_sb.Append(_data.FractionPaddingChar /*String*/ );
RDebugUtils.currentLine=22544428;
 //BA.debugLineNum = 22544428;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 }
;
RDebugUtils.currentLine=22544430;
 //BA.debugLineNum = 22544430;BA.debugLine="LastZeroCount = Min(LastZeroCount, sb.Length - F";
_lastzerocount = (int) (__c.Min(_lastzerocount,_sb.getLength()-_fracstartindex-_data.MinimumFractions /*int*/ ));
RDebugUtils.currentLine=22544431;
 //BA.debugLineNum = 22544431;BA.debugLine="If LastZeroCount > 0 Then";
if (_lastzerocount>0) { 
RDebugUtils.currentLine=22544432;
 //BA.debugLineNum = 22544432;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
 };
RDebugUtils.currentLine=22544434;
 //BA.debugLineNum = 22544434;BA.debugLine="If sb.Length > FracStartIndex Then sb.Insert(Fra";
if (_sb.getLength()>_fracstartindex) { 
_sb.Insert(_fracstartindex,_data.DecimalPoint /*String*/ );};
 };
RDebugUtils.currentLine=22544436;
 //BA.debugLineNum = 22544436;BA.debugLine="sb.Append(data.Postfix)";
_sb.Append(_data.Postfix /*String*/ );
RDebugUtils.currentLine=22544437;
 //BA.debugLineNum = 22544437;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=22544438;
 //BA.debugLineNum = 22544438;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
b4a.example.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="formats.Initialize";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="Dim d As B4XFormatData = CreateDefaultFormat";
_d = __ref._createdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null);
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="AddFormatData(d, MIN_VALUE, MAX_VALUE, True)";
__ref._addformatdata /*String*/ (null,_d,__ref._min_value /*int*/ ,__ref._max_value /*int*/ ,__c.True);
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="End Sub";
return "";
}
public String  _addformatdata(b4a.example.b4xformatter __ref,b4a.example.b4xformatter._b4xformatdata _data,double _rangestart,double _rangeend,boolean _includeedges) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "addformatdata", true))
	 {return ((String) Debug.delegate(ba, "addformatdata", new Object[] {_data,_rangestart,_rangeend,_includeedges}));}
double _factor = 0;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub AddFormatData (Data As B4XFormatData, R";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim factor As Double = Power(10, -Data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ );
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="If IncludeEdges = False Then";
if (_includeedges==__c.False) { 
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="RangeStart = RangeStart + factor";
_rangestart = _rangestart+_factor;
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="RangeEnd = RangeEnd - factor";
_rangeend = _rangeend-_factor;
 };
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="RangeStart = RangeStart - factor / 2";
_rangestart = _rangestart-_factor/(double)2;
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="RangeEnd = RangeEnd + factor / 2";
_rangeend = _rangeend+_factor/(double)2;
RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="Data.RangeStart = RangeStart";
_data.RangeStart /*double*/  = _rangestart;
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="Data.RangeEnd = RangeEnd";
_data.RangeEnd /*double*/  = _rangeend;
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="formats.Add(Data)";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_data));
RDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Type B4XFormatData (Prefix As String, Postfix As";
;
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="Private formats As List";
_formats = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Public Const MAX_VALUE = 0x7fffffff, MIN_VALUE =";
_max_value = (int) (0x7fffffff);
_min_value = (int) (0x80000000);
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xformatter._b4xformatdata  _copyformatdata(b4a.example.b4xformatter __ref,b4a.example.b4xformatter._b4xformatdata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "copyformatdata", true))
	 {return ((b4a.example.b4xformatter._b4xformatdata) Debug.delegate(ba, "copyformatdata", new Object[] {_data}));}
b4a.example.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub CopyFormatData (Data As B4XFormatData)";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim d As B4XFormatData";
_d = new b4a.example.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="d.DecimalPoint = Data.DecimalPoint";
_d.DecimalPoint /*String*/  = _data.DecimalPoint /*String*/ ;
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="If Data.FormatFont.IsInitialized Then";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getIsInitialized()) { 
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="d.FormatFont = xui.CreateFont(Data.FormatFont.To";
_d.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((android.graphics.Typeface)(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
 };
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="d.GroupingCharacter = Data.GroupingCharacter";
_d.GroupingCharacter /*String*/  = _data.GroupingCharacter /*String*/ ;
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="d.MaximumFractions = Data.MaximumFractions";
_d.MaximumFractions /*int*/  = _data.MaximumFractions /*int*/ ;
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="d.MinimumFractions = Data.MinimumFractions";
_d.MinimumFractions /*int*/  = _data.MinimumFractions /*int*/ ;
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="d.MinimumIntegers = Data.MinimumIntegers";
_d.MinimumIntegers /*int*/  = _data.MinimumIntegers /*int*/ ;
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="d.Postfix = Data.Postfix";
_d.Postfix /*String*/  = _data.Postfix /*String*/ ;
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="d.Prefix = Data.Prefix";
_d.Prefix /*String*/  = _data.Prefix /*String*/ ;
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="d.RangeEnd = Data.RangeEnd";
_d.RangeEnd /*double*/  = _data.RangeEnd /*double*/ ;
RDebugUtils.currentLine=22282256;
 //BA.debugLineNum = 22282256;BA.debugLine="d.RangeStart = Data.RangeStart";
_d.RangeStart /*double*/  = _data.RangeStart /*double*/ ;
RDebugUtils.currentLine=22282257;
 //BA.debugLineNum = 22282257;BA.debugLine="d.RemoveMinusSign = Data.RemoveMinusSign";
_d.RemoveMinusSign /*boolean*/  = _data.RemoveMinusSign /*boolean*/ ;
RDebugUtils.currentLine=22282258;
 //BA.debugLineNum = 22282258;BA.debugLine="d.TextColor = Data.TextColor";
_d.TextColor /*int*/  = _data.TextColor /*int*/ ;
RDebugUtils.currentLine=22282259;
 //BA.debugLineNum = 22282259;BA.debugLine="d.FractionPaddingChar = Data.FractionPaddingChar";
_d.FractionPaddingChar /*String*/  = _data.FractionPaddingChar /*String*/ ;
RDebugUtils.currentLine=22282260;
 //BA.debugLineNum = 22282260;BA.debugLine="d.IntegerPaddingChar = Data.IntegerPaddingChar";
_d.IntegerPaddingChar /*String*/  = _data.IntegerPaddingChar /*String*/ ;
RDebugUtils.currentLine=22282261;
 //BA.debugLineNum = 22282261;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=22282262;
 //BA.debugLineNum = 22282262;BA.debugLine="End Sub";
return null;
}
public b4a.example.b4xformatter._b4xformatdata  _createdefaultformat(b4a.example.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "createdefaultformat", true))
	 {return ((b4a.example.b4xformatter._b4xformatdata) Debug.delegate(ba, "createdefaultformat", null));}
b4a.example.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub CreateDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Dim d As B4XFormatData";
_d = new b4a.example.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="d.GroupingCharacter = \",\"";
_d.GroupingCharacter /*String*/  = ",";
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="d.DecimalPoint = \".\"";
_d.DecimalPoint /*String*/  = ".";
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="d.MaximumFractions = 3";
_d.MaximumFractions /*int*/  = (int) (3);
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="d.MinimumIntegers = 1";
_d.MinimumIntegers /*int*/  = (int) (1);
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="d.IntegerPaddingChar = \"0\"";
_d.IntegerPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="d.FractionPaddingChar = \"0\"";
_d.FractionPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=22151178;
 //BA.debugLineNum = 22151178;BA.debugLine="End Sub";
return null;
}
public b4a.example.b4xformatter._b4xformatdata  _getformatdata(b4a.example.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getformatdata", true))
	 {return ((b4a.example.b4xformatter._b4xformatdata) Debug.delegate(ba, "getformatdata", new Object[] {_number}));}
int _i = 0;
b4a.example.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub GetFormatData (Number As Double) As B4X";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="For i = formats.Size - 1 To 1 Step - 1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="Dim d As B4XFormatData = formats.Get(i)";
_d = (b4a.example.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="If Number <= d.RangeEnd And Number >= d.RangeSta";
if (_number<=_d.RangeEnd /*double*/  && _number>=_d.RangeStart /*double*/ ) { 
if (true) return _d;};
 }
};
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="Return formats.Get(0)";
if (true) return (b4a.example.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="End Sub";
return null;
}
public String  _formatlabel(b4a.example.b4xformatter __ref,double _number,anywheresoftware.b4a.objects.B4XViewWrapper _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "formatlabel", true))
	 {return ((String) Debug.delegate(ba, "formatlabel", new Object[] {_number,_label}));}
b4a.example.b4xformatter._b4xformatdata _data = null;
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub FormatLabel (Number As Double, Label As";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Label.Text = Format(Number)";
_label.setText(BA.ObjectToCharSequence(__ref._format /*String*/ (null,_number)));
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Dim data As B4XFormatData = GetFormatData(Number)";
_data = __ref._getformatdata /*b4a.example.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="If data.TextColor <> 0 Then Label.TextColor = dat";
if (_data.TextColor /*int*/ !=0) { 
_label.setTextColor(_data.TextColor /*int*/ );};
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="If data.FormatFont.IsInitialized Then Label.Font";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getIsInitialized()) { 
_label.setFont(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );};
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xformatter._b4xformatdata  _newformatdata(b4a.example.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "newformatdata", true))
	 {return ((b4a.example.b4xformatter._b4xformatdata) Debug.delegate(ba, "newformatdata", null));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub NewFormatData As B4XFormatData";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Return CopyFormatData(GetDefaultFormat)";
if (true) return __ref._copyformatdata /*b4a.example.b4xformatter._b4xformatdata*/ (null,__ref._getdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null));
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return null;
}
}