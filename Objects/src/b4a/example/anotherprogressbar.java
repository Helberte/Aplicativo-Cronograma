package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.anotherprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.anotherprogressbar.class).invoke(this, new Object[] {null});
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
public b4a.example.bcpath._bcbrush _busybrush = null;
public int _backgroundcolor = 0;
public int _busyindex = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _miv = null;
public b4a.example.bcpath._bcbrush _transparentbrush = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _emptycolor = 0;
public b4a.example.bcpath._bcbrush _emptybrush = null;
public int _mvalue = 0;
public Object _tag = null;
public float _valuechangepersecond = 0f;
public int _cornerradius = 0;
public int _brushoffsetdelta = 0;
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
public String  _base_resize(b4a.example.anotherprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="End Sub";
return "";
}
public String  _updategraphics(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "updategraphics", true))
	 {return ((String) Debug.delegate(ba, "updategraphics", null));}
int _width = 0;
b4a.example.bitmapcreator _template = null;
b4a.example.bitmapcreator._argbcolor _bcolor = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub UpdateGraphics";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._emptycolor /*int*/ );
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._backgroundcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width));
 }else {
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
 };
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 }else {
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 };
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_template);
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="If mValue = 100 Then";
if (__ref._mvalue /*int*/ ==100) { 
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0),(int) (15));
 }else {
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0),(int) (15));
 };
RDebugUtils.currentLine=7602204;
 //BA.debugLineNum = 7602204;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="setVisible(mBase.Visible)";
__ref._setvisible /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible());
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="End Sub";
return "";
}
public void  _busyloop(b4a.example.anotherprogressbar __ref) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "busyloop", true))
	 {Debug.delegate(ba, "busyloop", null); return;}
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4a.example.anotherprogressbar parent,b4a.example.anotherprogressbar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.anotherprogressbar __ref;
b4a.example.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = __ref._busyindex /*int*/ ;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight));
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==__ref._busyindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._vertical /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0))));
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*__ref._valuechangepersecond /*float*/ );
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ +parent.__c.Min(_change,__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ ));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ -parent.__c.Min(_change,__ref._currentvalue /*float*/ -__ref._mvalue /*int*/ ));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=7536666;
 //BA.debugLineNum = 7536666;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (__ref._currentvalue /*float*/ <100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=7536667;
 //BA.debugLineNum = 7536667;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
 if (true) break;
;
RDebugUtils.currentLine=7536669;
 //BA.debugLineNum = 7536669;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (__ref._vertical /*boolean*/ ) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=7536670;
 //BA.debugLineNum = 7536670;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=7536672;
 //BA.debugLineNum = 7536672;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=7536675;
 //BA.debugLineNum = 7536675;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(_r,__ref._busybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
RDebugUtils.currentLine=7536676;
 //BA.debugLineNum = 7536676;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"BC",_tasks);
RDebugUtils.currentLine=7536677;
 //BA.debugLineNum = 7536677;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"), null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=7536678;
 //BA.debugLineNum = 7536678;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = __ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
RDebugUtils.currentLine=7536679;
 //BA.debugLineNum = 7536679;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(_bmp,__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=7536680;
 //BA.debugLineNum = 7536680;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"),(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=7536682;
 //BA.debugLineNum = 7536682;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Private BusyBrush As BCBrush";
_busybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Private BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="Private BusyIndex As Int";
_busyindex = 0;
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Private mIV As B4XView";
_miv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="Private CurrentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_emptycolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="Private EmptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_valuechangepersecond = (float) (60);
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="Public CornerRadius As Int";
_cornerradius = 0;
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_brushoffsetdelta = (int) (3);
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.anotherprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="mIV = iv";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="mIV.Color = xui.Color_Transparent";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
__ref._setvalue /*String*/ (null,(int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
__ref._cornerradius /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="mValue = Max(0, Min(100, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(0,__c.Min(100,_v)));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.anotherprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public String  _setvaluenoanimation(b4a.example.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvaluenoanimation", true))
	 {return ((String) Debug.delegate(ba, "setvaluenoanimation", new Object[] {_v}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="setValue(v)";
__ref._setvalue /*String*/ (null,_v);
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.anotherprogressbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub setVisible(b As Boolean)";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="BusyIndex = BusyIndex + 1";
__ref._busyindex /*int*/  = (int) (__ref._busyindex /*int*/ +1);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="BusyLoop";
__ref._busyloop /*void*/ (null);
 };
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="mBase.Visible = b";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_b);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="End Sub";
return "";
}
}