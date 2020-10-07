package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xuiviewsutils {
private static xuiviewsutils mostCurrent = new xuiviewsutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public static String  _performhapticfeedback(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(null, "performhapticfeedback", new Object[] {_ba,_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Initialize";
_initialize(_ba);
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="jo.RunMethod(\"performHapticFeedback\", Array(1))";
_jo.RunMethod("performHapticFeedback",new Object[]{(Object)(1)});
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(null, "settextorcsbuildertolabel", new Object[] {_ba,_xlbl,_text}));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=23724044;
 //BA.debugLineNum = 23724044;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(anywheresoftware.b4a.BA _ba,b4a.example3.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(null, "addstubtoclvifneeded", new Object[] {_ba,_customlistview1,_color}));}
b4a.example3.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"stub");
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=23658507;
 //BA.debugLineNum = 23658507;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight((int) (_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize()));
 };
RDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(null, "setbitmapandfill", new Object[] {_ba,_imageview,_bmp}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="iiv.Gravity = Gravity.FILL";
_iiv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="End Sub";
return "";
}
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "initialize", true))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="End Sub";
return "";
}
}