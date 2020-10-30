package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class madewithlove extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.madewithlove");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.madewithlove.class).invoke(this, new Object[] {null});
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
public String  _base_resize(b4a.example.madewithlove __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Wid";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.madewithlove __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.madewithlove __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=23199762;
 //BA.debugLineNum = 23199762;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="cs.Initialize.Append(\"Made with \").Typeface(Typef";
_cs.Initialize().Append(BA.ObjectToCharSequence("Made with ")).Typeface(__c.Typeface.getFONTAWESOME()).Color(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red).Append(BA.ObjectToCharSequence(__c.Chr((int) (0xf004)))).Pop().Pop().Append(BA.ObjectToCharSequence(" in B4X")).PopAll();
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="xlbl.Text = cs";
_xlbl.setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=23199765;
 //BA.debugLineNum = 23199765;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=23199766;
 //BA.debugLineNum = 23199766;BA.debugLine="mBase.AddView(xlbl, 0, 0, mBase.Width, mBase.Heig";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=23199774;
 //BA.debugLineNum = 23199774;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.madewithlove __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="End Sub";
return "";
}
}