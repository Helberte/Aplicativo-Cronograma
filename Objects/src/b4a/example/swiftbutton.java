package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.swiftbutton.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public int _clr1 = 0;
public int _clr2 = 0;
public int _disabledcolor = 0;
public boolean _pressed = false;
public Object _tag = null;
public boolean _mdisabled = false;
public int _cornersradius = 0;
public int _sideheight = 0;
public boolean _mhaptic = false;
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
public String  _base_resize(b4a.example.swiftbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (__ref._sideheight /*int*/ ),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="If pressed = False Then";
if (__ref._pressed /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="xLBL.Top = 0";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr2 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._sideheight /*int*/ ));
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr1 /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="xLBL.Top = SideHeight";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__ref._sideheight /*int*/ );
RDebugUtils.currentLine=24772622;
 //BA.debugLineNum = 24772622;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=24772623;
 //BA.debugLineNum = 24772623;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=24772624;
 //BA.debugLineNum = 24772624;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (__ref._mdisabled /*boolean*/ ) { 
_c = __ref._disabledcolor /*int*/ ;}
else {
_c = __ref._clr1 /*int*/ ;};
RDebugUtils.currentLine=24772625;
 //BA.debugLineNum = 24772625;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_c,__c.True,(float) (0));
 };
RDebugUtils.currentLine=24772628;
 //BA.debugLineNum = 24772628;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=24772629;
 //BA.debugLineNum = 24772629;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="Public xLBL As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_clr1 = 0;
_clr2 = 0;
_disabledcolor = 0;
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="Private pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=24117257;
 //BA.debugLineNum = 24117257;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=24117258;
 //BA.debugLineNum = 24117258;BA.debugLine="Private mDisabled As Boolean";
_mdisabled = false;
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="Public CornersRadius, SideHeight As Int";
_cornersradius = 0;
_sideheight = 0;
RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.swiftbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"p");
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
__ref._disabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(0xff999999)));
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
__ref._cornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
__ref._sideheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
__ref._mdisabled /*boolean*/  = __c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("ButtonEnabled"),(Object)(__c.True))));
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="xLBL = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=24248334;
 //BA.debugLineNum = 24248334;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=24248335;
 //BA.debugLineNum = 24248335;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=24248336;
 //BA.debugLineNum = 24248336;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=24248337;
 //BA.debugLineNum = 24248337;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=24248339;
 //BA.debugLineNum = 24248339;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(__ref._mdisabled /*boolean*/ );
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.swiftbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(b4a.example.swiftbutton __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "p_touch", true))
	 {return ((String) Debug.delegate(ba, "p_touch", new Object[] {_action,_x,_y}));}
boolean _inside = false;
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="If mDisabled Then Return";
if (__ref._mdisabled /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() && _y>0 && _y<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="SetPressedState(True)";
__ref._setpressedstate /*String*/ (null,__c.True);
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="If pressed <> Inside Then";
if (__ref._pressed /*boolean*/ !=_inside) { 
RDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="SetPressedState(Inside)";
__ref._setpressedstate /*String*/ (null,_inside);
RDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
 break; }
case 2: {
RDebugUtils.currentLine=24510477;
 //BA.debugLineNum = 24510477;BA.debugLine="SetPressedState(False)";
__ref._setpressedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=24510478;
 //BA.debugLineNum = 24510478;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24510479;
 //BA.debugLineNum = 24510479;BA.debugLine="If Inside Then";
if (_inside) { 
RDebugUtils.currentLine=24510480;
 //BA.debugLineNum = 24510480;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=24510481;
 //BA.debugLineNum = 24510481;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
 };
 break; }
}
;
RDebugUtils.currentLine=24510484;
 //BA.debugLineNum = 24510484;BA.debugLine="End Sub";
return "";
}
public String  _setpressedstate(b4a.example.swiftbutton __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setpressedstate", true))
	 {return ((String) Debug.delegate(ba, "setpressedstate", new Object[] {_newstate}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="If pressed = NewState Then Return";
if (__ref._pressed /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown",(int) (0))) { 
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown");
 };
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp",(int) (0))) { 
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp");
 };
RDebugUtils.currentLine=24576008;
 //BA.debugLineNum = 24576008;BA.debugLine="pressed= NewState";
__ref._pressed /*boolean*/  = _newstate;
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="End Sub";
return "";
}
public String  _setcolors(b4a.example.swiftbutton __ref,int _primary,int _secondary) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setcolors", true))
	 {return ((String) Debug.delegate(ba, "setcolors", new Object[] {_primary,_secondary}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="clr1 = Primary";
__ref._clr1 /*int*/  = _primary;
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="clr2 = Secondary";
__ref._clr2 /*int*/  = _secondary;
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.swiftbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub setEnabled(b As Boolean)";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="mDisabled = Not(b)";
__ref._mdisabled /*boolean*/  = __c.Not(_b);
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="End Sub";
return "";
}
}