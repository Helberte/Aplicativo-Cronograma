package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4ximageview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4ximageview.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _setresizemode(b4a.example.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="End Sub";
return "";
}
public String  _load(b4a.example.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="setBitmap(LoadBitmapSample(Dir, FileName, mBase.W";
__ref._setbitmap /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_dir,_filename,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()).getObject())));
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="SetCircleClip(mRound)";
__ref._setcircleclip /*String*/ (null,__ref._mround /*boolean*/ );
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=12582934;
 //BA.debugLineNum = 12582934;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=12582936;
 //BA.debugLineNum = 12582936;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("912582939","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2)),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2)),(int) (__c.Round(_imageviewwidth)),(int) (__c.Round(_imageviewheight)));
RDebugUtils.currentLine=12582942;
 //BA.debugLineNum = 12582942;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.b4ximageview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="setRoundedImage(Props.Get(\"Round\"))";
__ref._setroundedimage /*String*/ (null,BA.ObjectToBoolean(_props.Get((Object)("Round"))));
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="setResizeMode(Props.Get(\"ResizeMode\"))";
__ref._setresizemode /*String*/ (null,BA.ObjectToString(_props.Get((Object)("ResizeMode"))));
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4a.example.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="SetCircleClip(b)";
__ref._setcircleclip /*String*/ (null,_b);
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="End Sub";
return null;
}
public String  _getresizemode(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(b4a.example.b4ximageview __ref,boolean _set) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcircleclip", true))
	 {return ((String) Debug.delegate(ba, "setcircleclip", new Object[] {_set}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub SetCircleClip (Set As Boolean)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="If Set Then";
if (_set) { 
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)));
 }else {
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=12910613;
 //BA.debugLineNum = 12910613;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=12910614;
 //BA.debugLineNum = 12910614;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(Set))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(_set)});
RDebugUtils.currentLine=12910616;
 //BA.debugLineNum = 12910616;BA.debugLine="End Sub";
return "";
}
}