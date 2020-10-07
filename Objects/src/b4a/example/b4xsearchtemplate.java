package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xsearchtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xsearchtemplate.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _customlistview1 = null;
public b4a.example.b4xdialog _xdialog = null;
public b4a.example.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public anywheresoftware.b4a.objects.IME _ime = null;
public boolean _allowunlistedtext = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.codigocadastro _codigocadastro = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xsearchtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.b4xsearchtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xsearchtemplate parent,b4a.example.b4xsearchtemplate __ref,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.b4xsearchtemplate __ref;
b4a.example.b4xsearchtemplate parent;
b4a.example.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="IME.ShowKeyboard(SearchField.TextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.b4xsearchtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return "";
}
public String  _additemstolist(b4a.example.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "additemstolist", true))
	 {return ((String) Debug.delegate(ba, "additemstolist", new Object[] {_li,_full}));}
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()==0 && _full.length()>0 && __ref._allowunlistedtext /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
 };
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=17891349;
 //BA.debugLineNum = 17891349;BA.debugLine="cs.Initialize.Append(item.SubString2(0, x)).Colo";
_cs.Initialize().Append(BA.ObjectToCharSequence(_item.substring((int) (0),_x))).Color(__ref._texthighlightcolor /*int*/ ).Append(BA.ObjectToCharSequence(_item.substring(_x,(int) (_x+_full.length())))).Pop();
RDebugUtils.currentLine=17891350;
 //BA.debugLineNum = 17891350;BA.debugLine="cs.Append(item.SubString(x + full.Length))";
_cs.Append(BA.ObjectToCharSequence(_item.substring((int) (_x+_full.length()))));
RDebugUtils.currentLine=17891351;
 //BA.debugLineNum = 17891351;BA.debugLine="If ItemsCache.Size > 0 Then";
if (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=17891352;
 //BA.debugLineNum = 17891352;BA.debugLine="Dim p As B4XView = ItemsCache.Get(ItemsCache.Si";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="ItemsCache.RemoveAt(ItemsCache.Size - 1)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=17891355;
 //BA.debugLineNum = 17891355;BA.debugLine="p.GetView(0).Text = cs";
_p.GetView((int) (0)).setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=17891360;
 //BA.debugLineNum = 17891360;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=17891361;
 //BA.debugLineNum = 17891361;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(_item));
 }else {
RDebugUtils.currentLine=17891363;
 //BA.debugLineNum = 17891363;BA.debugLine="CustomListView1.AddTextItem(cs, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem((Object)(_cs.getObject()),(Object)(_item));
 };
 }
};
RDebugUtils.currentLine=17891384;
 //BA.debugLineNum = 17891384;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step28 = 1;
final int limit28 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=17891385;
 //BA.debugLineNum = 17891385;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=17891386;
 //BA.debugLineNum = 17891386;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=17891387;
 //BA.debugLineNum = 17891387;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=17891388;
 //BA.debugLineNum = 17891388;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=17891391;
 //BA.debugLineNum = 17891391;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4a.example.b4xfloattextfield();
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = (int) (0xfffd5c5c);
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = (int) (0x7e008eff);
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=17301519;
 //BA.debugLineNum = 17301519;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
RDebugUtils.currentLine=17301524;
 //BA.debugLineNum = 17301524;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4a.example.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xsearchtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
int _height = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17367061;
 //BA.debugLineNum = 17367061;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17367064;
 //BA.debugLineNum = 17367064;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=17367066;
 //BA.debugLineNum = 17367066;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=17367068;
 //BA.debugLineNum = 17367068;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4a.example3.customlistview*/ ._asview();
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),(int) (0),_c.getTop(),_width,(int) (_height-_c.getTop()));
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(b4a.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="If AllowUnlistedText Then";
if (__ref._allowunlistedtext /*boolean*/ ) { 
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="SelectedItem = LastTerm";
__ref._selecteditem /*String*/  = __ref._lastterm /*String*/ ;
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 }else 
{RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="Else If CustomListView1.Size > 0 And LastTerm.Len";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue((int) (0)));
 }}
;
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(b4a.example.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.b4xsearchtemplate __ref,String _term,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_term,_force}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=17694732;
 //BA.debugLineNum = 17694732;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=17694733;
 //BA.debugLineNum = 17694733;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=17694734;
 //BA.debugLineNum = 17694734;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=17694735;
 //BA.debugLineNum = 17694735;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=17694737;
 //BA.debugLineNum = 17694737;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=17694738;
 //BA.debugLineNum = 17694738;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=17694740;
 //BA.debugLineNum = 17694740;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=17694742;
 //BA.debugLineNum = 17694742;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=17694743;
 //BA.debugLineNum = 17694743;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=17694745;
 //BA.debugLineNum = 17694745;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4a.example.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (0)]));
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (1)]));
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(b4a.example.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((Object) Debug.delegate(ba, "setitems", new Object[] {_items}));}
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _item = "";
int _start = 0;
int _count = 0;
String _str = "";
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="item = Items.Get(i)";
_item = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="item = item.ToLowerCase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=17956878;
 //BA.debugLineNum = 17956878;BA.debugLine="For start = 0 To item.Length";
{
final int step14 = 1;
final int limit14 = _item.length();
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_item.length()) {
RDebugUtils.currentLine=17956881;
 //BA.debugLineNum = 17956881;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=17956882;
 //BA.debugLineNum = 17956882;BA.debugLine="str = item.SubString2(start, start + count)";
_str = _item.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=17956883;
 //BA.debugLineNum = 17956883;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=17956884;
 //BA.debugLineNum = 17956884;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=17956885;
 //BA.debugLineNum = 17956885;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=17956886;
 //BA.debugLineNum = 17956886;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=17956887;
 //BA.debugLineNum = 17956887;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=17956888;
 //BA.debugLineNum = 17956888;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=17956889;
 //BA.debugLineNum = 17956889;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=17956891;
 //BA.debugLineNum = 17956891;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
_li.Add(_items.Get(_i));
 };
RDebugUtils.currentLine=17956893;
 //BA.debugLineNum = 17956893;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=17956897;
 //BA.debugLineNum = 17956897;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("917956897","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
RDebugUtils.currentLine=17956898;
 //BA.debugLineNum = 17956898;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=17956899;
 //BA.debugLineNum = 17956899;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=17956900;
 //BA.debugLineNum = 17956900;BA.debugLine="End Sub";
return null;
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
	h.add("tf_focuschanged");
}
}