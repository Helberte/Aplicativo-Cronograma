package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scrollinglabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.scrollinglabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.scrollinglabel.class).invoke(this, new Object[] {null});
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
public String _mtext = "";
public int _taskindex = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public int _widthpersecond = 0;
public int _startpositiondelay = 0;
public int _mtextcolor = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.scrollinglabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.scrollinglabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
boolean _needtocreatenewlabel = false;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
float _originaltextwidth = 0f;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _duplicatetext = "";
float _width = 0f;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim NeedToCreateNewLabel As Boolean = True";
_needtocreatenewlabel = __c.True;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Dim parent As B4XView = mBase.GetView(0)";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="If parent.NumberOfViews > 0 Then";
if (_parent.getNumberOfViews()>0) { 
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="Dim p As B4XView = parent.GetView(0)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _parent.GetView((int) (0));
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="If p.Tag = \"static\" Then";
if ((_p.getTag()).equals((Object)("static"))) { 
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="NeedToCreateNewLabel = False";
_needtocreatenewlabel = __c.False;
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, parent.Width, pare";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=21823497;
 //BA.debugLineNum = 21823497;BA.debugLine="Dim xlbl As B4XView = p.GetView(0)";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = _p.GetView((int) (0));
RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, parent.Width, p";
_xlbl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 };
 };
RDebugUtils.currentLine=21823502;
 //BA.debugLineNum = 21823502;BA.debugLine="Dim originalTextWidth As Float = MeasureTextWidth";
_originaltextwidth = __ref._measuretextwidth /*float*/ (null,_t,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21823503;
 //BA.debugLineNum = 21823503;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=21823504;
 //BA.debugLineNum = 21823504;BA.debugLine="If NeedToCreateNewLabel Then";
if (_needtocreatenewlabel) { 
RDebugUtils.currentLine=21823505;
 //BA.debugLineNum = 21823505;BA.debugLine="parent.RemoveAllViews";
_parent.RemoveAllViews();
RDebugUtils.currentLine=21823506;
 //BA.debugLineNum = 21823506;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21823507;
 //BA.debugLineNum = 21823507;BA.debugLine="parent.AddView(p, 0, 0, parent.Width, parent.Hei";
_parent.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=21823508;
 //BA.debugLineNum = 21823508;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21823509;
 //BA.debugLineNum = 21823509;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=21823511;
 //BA.debugLineNum = 21823511;BA.debugLine="lbl.SingleLine = True";
_lbl.setSingleLine(__c.True);
RDebugUtils.currentLine=21823512;
 //BA.debugLineNum = 21823512;BA.debugLine="lbl.Padding = Array As Int(0, 0, 0, 0)";
_lbl.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=21823514;
 //BA.debugLineNum = 21823514;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=21823515;
 //BA.debugLineNum = 21823515;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=21823516;
 //BA.debugLineNum = 21823516;BA.debugLine="xlbl.Font = fnt";
_xlbl.setFont(__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21823518;
 //BA.debugLineNum = 21823518;BA.debugLine="p.AddView(xlbl, 0, 0, mBase.Width, mBase.Height)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=21823520;
 //BA.debugLineNum = 21823520;BA.debugLine="xlbl.TextColor = mTextColor";
_xlbl.setTextColor(__ref._mtextcolor /*int*/ );
RDebugUtils.currentLine=21823521;
 //BA.debugLineNum = 21823521;BA.debugLine="If originalTextWidth <= mBase.Width Then";
if (_originaltextwidth<=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
RDebugUtils.currentLine=21823522;
 //BA.debugLineNum = 21823522;BA.debugLine="xlbl.Text = t";
_xlbl.setText(BA.ObjectToCharSequence(_t));
RDebugUtils.currentLine=21823523;
 //BA.debugLineNum = 21823523;BA.debugLine="p.Tag = \"static\"";
_p.setTag((Object)("static"));
RDebugUtils.currentLine=21823524;
 //BA.debugLineNum = 21823524;BA.debugLine="StopScrolling";
__ref._stopscrolling /*String*/ (null);
 }else {
RDebugUtils.currentLine=21823526;
 //BA.debugLineNum = 21823526;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
RDebugUtils.currentLine=21823527;
 //BA.debugLineNum = 21823527;BA.debugLine="Dim duplicateText As String = t & \"   \" & t";
_duplicatetext = _t+"   "+_t;
RDebugUtils.currentLine=21823528;
 //BA.debugLineNum = 21823528;BA.debugLine="Dim Width As Float = MeasureTextWidth(duplicateT";
_width = __ref._measuretextwidth /*float*/ (null,_duplicatetext,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21823529;
 //BA.debugLineNum = 21823529;BA.debugLine="p.Width = Width";
_p.setWidth((int) (_width));
RDebugUtils.currentLine=21823530;
 //BA.debugLineNum = 21823530;BA.debugLine="xlbl.Width = Width";
_xlbl.setWidth((int) (_width));
RDebugUtils.currentLine=21823531;
 //BA.debugLineNum = 21823531;BA.debugLine="xlbl.Text = duplicateText";
_xlbl.setText(BA.ObjectToCharSequence(_duplicatetext));
RDebugUtils.currentLine=21823532;
 //BA.debugLineNum = 21823532;BA.debugLine="StartScrolling (p, originalTextWidth)";
__ref._startscrolling /*void*/ (null,_p,_originaltextwidth);
 };
RDebugUtils.currentLine=21823534;
 //BA.debugLineNum = 21823534;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Private taskIndex As Int";
_taskindex = 0;
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Private fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="Public WidthPerSecond As Int = 100dip";
_widthpersecond = __c.DipToCurrent((int) (100));
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="Public StartPositionDelay As Int = 1000";
_startpositiondelay = (int) (1000);
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="Private mTextColor As Int = xui.Color_Black";
_mtextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.scrollinglabel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="mText = Lbl.Text";
__ref._mtext /*String*/  = _lbl.getText();
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Dim l As B4XView = Lbl";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="fnt = l.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _l.getFont();
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=21692429;
 //BA.debugLineNum = 21692429;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="End Sub";
return "";
}
public int  _gettextcolor(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "gettextcolor", true))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Return mTextColor";
if (true) return __ref._mtextcolor /*int*/ ;
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.scrollinglabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="End Sub";
return "";
}
public float  _measuretextwidth(b4a.example.scrollinglabel __ref,String _s,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "measuretextwidth", true))
	 {return ((Float) Debug.delegate(ba, "measuretextwidth", new Object[] {_s,_font1}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub MeasureTextWidth(s As String, font1 As";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Return cvs.MeasureText(s, font1).Width";
if (true) return __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_s,_font1).getWidth();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return 0f;
}
public String  _stopscrolling(b4a.example.scrollinglabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "stopscrolling", true))
	 {return ((String) Debug.delegate(ba, "stopscrolling", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub StopScrolling";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="taskIndex = taskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public void  _startscrolling(b4a.example.scrollinglabel __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) throws Exception{
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "startscrolling", true))
	 {Debug.delegate(ba, "startscrolling", new Object[] {_p,_originalwidth}); return;}
ResumableSub_StartScrolling rsub = new ResumableSub_StartScrolling(this,__ref,_p,_originalwidth);
rsub.resume(ba, null);
}
public static class ResumableSub_StartScrolling extends BA.ResumableSub {
public ResumableSub_StartScrolling(b4a.example.scrollinglabel parent,b4a.example.scrollinglabel __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) {
this.parent = parent;
this.__ref = __ref;
this._p = _p;
this._originalwidth = _originalwidth;
this.__ref = parent;
}
b4a.example.scrollinglabel __ref;
b4a.example.scrollinglabel parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p;
float _originalwidth;
int _myindex = 0;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scrollinglabel";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="taskIndex = taskIndex + 1";
__ref._taskindex /*int*/  = (int) (__ref._taskindex /*int*/ +1);
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="Dim myIndex As Int = taskIndex";
_myindex = __ref._taskindex /*int*/ ;
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="Dim duration As Int = p.Width / WidthPerSecond *";
_duration = (int) (_p.getWidth()/(double)__ref._widthpersecond /*int*/ *1000);
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),__ref._startpositiondelay /*int*/ );
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Do While True";
if (true) break;

case 7:
//do while
this.state = 22;
while (parent.__c.True) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="p.SetLayoutAnimated(duration, -(p.Width - Origin";
_p.SetLayoutAnimated(_duration,(int) (-(_p.getWidth()-_originalwidth)),_p.getTop(),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),_duration);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scrollinglabel", "startscrolling"),__ref._startpositiondelay /*int*/ );
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 16:
//if
this.state = 21;
if (_myindex!=__ref._taskindex /*int*/ ) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) return ;
if (true) break;

case 21:
//C
this.state = 7;
;
RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Heig";
_p.SetLayoutAnimated((int) (0),(int) (0),_p.getTop(),_p.getWidth(),_p.getHeight());
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _settextcolor(b4a.example.scrollinglabel __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="scrollinglabel";
if (Debug.shouldDelegate(ba, "settextcolor", true))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_c}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub setTextColor(c As Int)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="mTextColor = c";
__ref._mtextcolor /*int*/  = _c;
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="End Sub";
return "";
}
}