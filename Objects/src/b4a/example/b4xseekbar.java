package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xseekbar.class).invoke(this, new Object[] {null});
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
public int _color1 = 0;
public int _color2 = 0;
public int _thumbcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _mvalue = 0;
public int _minvalue = 0;
public int _maxvalue = 0;
public int _interval = 0;
public boolean _vertical = false;
public int _size1 = 0;
public int _size2 = 0;
public int _radius1 = 0;
public int _radius2 = 0;
public boolean _pressed = false;
public int _size = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
<<<<<<< HEAD
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
=======
>>>>>>> main
public b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
<<<<<<< HEAD
=======
public b4a.example.act_telacadastro _act_telacadastro = null;
>>>>>>> main
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.b4xseekbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
<<<<<<< HEAD
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _update(b4a.example.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
int _s1 = 0;
int _y = 0;
int _x = 0;
<<<<<<< HEAD
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=16646159;
 //BA.debugLineNum = 16646159;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=16646161;
 //BA.debugLineNum = 16646161;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=16646162;
 //BA.debugLineNum = 16646162;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=16646163;
 //BA.debugLineNum = 16646163;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=16646164;
 //BA.debugLineNum = 16646164;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
=======
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=20250634;
 //BA.debugLineNum = 20250634;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=20250635;
 //BA.debugLineNum = 20250635;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=20250639;
 //BA.debugLineNum = 20250639;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=20250640;
 //BA.debugLineNum = 20250640;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=20250641;
 //BA.debugLineNum = 20250641;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=20250642;
 //BA.debugLineNum = 20250642;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=20250643;
 //BA.debugLineNum = 20250643;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=20250644;
 //BA.debugLineNum = 20250644;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
>>>>>>> main
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 };
 };
<<<<<<< HEAD
RDebugUtils.currentLine=16646168;
 //BA.debugLineNum = 16646168;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20250648;
 //BA.debugLineNum = 20250648;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=20250649;
 //BA.debugLineNum = 20250649;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _class_globals(b4a.example.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
<<<<<<< HEAD
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_color1 = 0;
_color2 = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="Public MinValue, MaxValue As Int";
_minvalue = 0;
_maxvalue = 0;
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
=======
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_color1 = 0;
_color2 = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="Public MinValue, MaxValue As Int";
_minvalue = 0;
_maxvalue = 0;
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
>>>>>>> main
_size1 = __c.DipToCurrent((int) (4));
_size2 = __c.DipToCurrent((int) (2));
_radius1 = __c.DipToCurrent((int) (6));
_radius2 = __c.DipToCurrent((int) (12));
<<<<<<< HEAD
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=19988496;
 //BA.debugLineNum = 19988496;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _designercreateview(b4a.example.b4xseekbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
<<<<<<< HEAD
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color1")));
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color2")));
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
__ref._interval /*int*/  = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="MinValue = Props.Get(\"Min\")";
__ref._minvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="MaxValue = Props.Get(\"Max\")";
__ref._maxvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
__ref._radius2 /*int*/  = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color1")));
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color2")));
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
__ref._interval /*int*/  = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="MinValue = Props.Get(\"Min\")";
__ref._minvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="MaxValue = Props.Get(\"Max\")";
__ref._maxvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
__ref._radius2 /*int*/  = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public int  _getvalue(b4a.example.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
<<<<<<< HEAD
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
>>>>>>> main
return 0;
}
public String  _initialize(b4a.example.b4xseekbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
<<<<<<< HEAD
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _raisetouchstateevent(b4a.example.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "raisetouchstateevent", true))
	 {return ((String) Debug.delegate(ba, "raisetouchstateevent", null));}
<<<<<<< HEAD
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _setvalue(b4a.example.b4xseekbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
<<<<<<< HEAD
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _setvaluebasedontouch(b4a.example.b4xseekbar __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvaluebasedontouch", true))
	 {return ((String) Debug.delegate(ba, "setvaluebasedontouch", new Object[] {_x,_y}));}
int _v = 0;
int _newvalue = 0;
<<<<<<< HEAD
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=16842764;
 //BA.debugLineNum = 16842764;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=16842767;
 //BA.debugLineNum = 16842767;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=20447247;
 //BA.debugLineNum = 20447247;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
public String  _touchpanel_touch(b4a.example.b4xseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
<<<<<<< HEAD
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="End Sub";
>>>>>>> main
return "";
}
}