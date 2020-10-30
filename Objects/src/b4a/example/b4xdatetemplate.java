package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xdatetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xdatetemplate.class).invoke(this, new Object[] {null});
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
public int _month = 0;
public int _year = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _tempselectedday = 0;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvsbackground = null;
public long _selecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public int _highlightedcolor = 0;
public int _selectedcolor = 0;
public int _daysinmonthcolor = 0;
public int _daysinweekcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvsdays = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _firstday = 0;
public int _minyear = 0;
public int _maxyear = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
public anywheresoftware.b4a.objects.collections.List _months = null;
public b4a.example.b4xdialog _mdialog = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.act_telacadastro _act_telacadastro = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigo_laydetalheslivro _codigo_laydetalheslivro = null;
public b4a.example.modulo_funcoes _modulo_funcoes = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _btnmonth_click(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnmonth_click", true))
	 {return ((String) Debug.delegate(ba, "btnmonth_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub btnMonth_Click";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref._month /*int*/ -1+(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="month = (m Mod 12) + 1";
__ref._month /*int*/  = (int) ((_m%12)+1);
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawdays", true))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._months /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
__ref._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ >__ref._minyear /*int*/ );
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
__ref._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ <__ref._maxyear /*int*/ );
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="For day = 1 To daysInMonth";
{
final int step14 = 1;
final int limit14 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit14 ;_day = _day + step14 ) {
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),_daysfont,__ref._daysinmonthcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=11206677;
 //BA.debugLineNum = 11206677;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnyear_click", true))
	 {return ((String) Debug.delegate(ba, "btnyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub btnYear_Click";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="year = year + btn.Tag";
__ref._year /*int*/  = (int) (__ref._year /*int*/ +(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = (int) (0xff001bbd);
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = (int) (0xff0ba29b);
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=11075602;
 //BA.debugLineNum = 11075602;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=11075603;
 //BA.debugLineNum = 11075603;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075604;
 //BA.debugLineNum = 11075604;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075608;
 //BA.debugLineNum = 11075608;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075611;
 //BA.debugLineNum = 11075611;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075613;
 //BA.debugLineNum = 11075613;BA.debugLine="Private months As List";
_months = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11075614;
 //BA.debugLineNum = 11075614;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(b4a.example.b4xdatetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dayspanefg_touch", true))
	 {return ((String) Debug.delegate(ba, "dayspanefg_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
__ref._handlemouse /*String*/ (null,_x,_y,_action!=_p.TOUCH_ACTION_UP);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return "";
}
public String  _handlemouse(b4a.example.b4xdatetemplate __ref,double _x,double _y,boolean _move) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "handlemouse", true))
	 {return ((String) Debug.delegate(ba, "handlemouse", new Object[] {_x,_y,_move}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="If move Then";
if (_move) { 
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._highlightedcolor /*int*/ ,_boxx,_boxy);
 };
 }else {
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="SelectDay(newSelectedDay)";
__ref._selectday /*String*/ (null,_newselectedday);
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
 };
RDebugUtils.currentLine=11534355;
 //BA.debugLineNum = 11534355;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=11534356;
 //BA.debugLineNum = 11534356;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.b4xdatetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(b4a.example.b4xdatetemplate __ref,anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawbox", true))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ ),(float) (_x*__ref._boxw /*float*/ +__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ +__ref._boxh /*float*/ ));
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="End Sub";
return "";
}
public long  _getdate(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getdate", true))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub getDate As Long";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xdatetemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Return pnlDialog";
if (true) return __ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return null;
}
public String  _selectday(b4a.example.b4xdatetemplate __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "selectday", true))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub SelectDay(day As Int)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4a.example.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub Hide";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
__ref._mdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xdatetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DateTemplate",ba);
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="pnlDialog.Tag = Me";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="months = DateUtils.GetMonthsNames";
__ref._months /*anywheresoftware.b4a.objects.collections.List*/  = _dateutils._getmonthsnames(ba);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="selectedDate = DateTime.Now";
__ref._selecteddate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="setDate(selectedDate)";
__ref._setdate /*String*/ (null,__ref._selecteddate /*long*/ );
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="cvs.Initialize(DaysPaneFg)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanebg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)7);
RDebugUtils.currentLine=11141133;
 //BA.debugLineNum = 11141133;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)6);
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="vCorrection = 5dip";
__ref._vcorrection /*float*/  = (float) (__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._daystitlespane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="End Sub";
return "";
}
public String  _setdate(b4a.example.b4xdatetemplate __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub setDate(date As Long)";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="If lblYear.IsInitialized = False Then";
if (__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="selectedDate = date";
__ref._selecteddate /*long*/  = _date;
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date));
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._months /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="End Sub";
return "";
}
public String  _show(b4a.example.b4xdatetemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub Show (Dialog As B4XDialog)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = _dateutils._getdaysnames(ba);
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._firstday /*int*/ +7-1);
_i = __ref._firstday /*int*/  ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="cvsDays.DrawText(d.SubString2(0, 2), (i - FirstD";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_d.substring((int) (0),(int) (2)),(float) ((_i-__ref._firstday /*int*/ +0.5)*__ref._boxw /*float*/ ),(float) (__c.DipToCurrent((int) (20))),_daysfont,__ref._daysinweekcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="cvsDays.Invalidate";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="mDialog = Dialog";
__ref._mdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=11927563;
 //BA.debugLineNum = 11927563;BA.debugLine="End Sub";
return "";
}
}