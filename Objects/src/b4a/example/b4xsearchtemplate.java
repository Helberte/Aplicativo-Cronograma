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
public b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public b4a.example.codigolayanotacao _codigolayanotacao = null;
public b4a.example.codigolayleituras _codigolayleituras = null;
public b4a.example.codigolaylogin _codigolaylogin = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xsearchtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="IME.ShowKeyboard(SearchField.TextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()==0 && _full.length()>0 && __ref._allowunlistedtext /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
 };
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="cs.Initialize.Append(item.SubString2(0, x)).Colo";
_cs.Initialize().Append(BA.ObjectToCharSequence(_item.substring((int) (0),_x))).Color(__ref._texthighlightcolor /*int*/ ).Append(BA.ObjectToCharSequence(_item.substring(_x,(int) (_x+_full.length())))).Pop();
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="cs.Append(item.SubString(x + full.Length))";
_cs.Append(BA.ObjectToCharSequence(_item.substring((int) (_x+_full.length()))));
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="If ItemsCache.Size > 0 Then";
if (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="Dim p As B4XView = ItemsCache.Get(ItemsCache.Si";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=15138841;
 //BA.debugLineNum = 15138841;BA.debugLine="ItemsCache.RemoveAt(ItemsCache.Size - 1)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="p.GetView(0).Text = cs";
_p.GetView((int) (0)).setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=15138848;
 //BA.debugLineNum = 15138848;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=15138849;
 //BA.debugLineNum = 15138849;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(_item));
 }else {
RDebugUtils.currentLine=15138851;
 //BA.debugLineNum = 15138851;BA.debugLine="CustomListView1.AddTextItem(cs, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem((Object)(_cs.getObject()),(Object)(_item));
 };
 }
};
RDebugUtils.currentLine=15138872;
 //BA.debugLineNum = 15138872;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step28 = 1;
final int limit28 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=15138873;
 //BA.debugLineNum = 15138873;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=15138874;
 //BA.debugLineNum = 15138874;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=15138875;
 //BA.debugLineNum = 15138875;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=15138876;
 //BA.debugLineNum = 15138876;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=15138879;
 //BA.debugLineNum = 15138879;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4a.example.b4xfloattextfield();
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = (int) (0xfffd5c5c);
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = (int) (0x7e008eff);
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=14549007;
 //BA.debugLineNum = 14549007;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=14549009;
 //BA.debugLineNum = 14549009;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=14549011;
 //BA.debugLineNum = 14549011;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4a.example.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=14614548;
 //BA.debugLineNum = 14614548;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14614549;
 //BA.debugLineNum = 14614549;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14614550;
 //BA.debugLineNum = 14614550;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14614552;
 //BA.debugLineNum = 14614552;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=14614553;
 //BA.debugLineNum = 14614553;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=14614554;
 //BA.debugLineNum = 14614554;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=14614556;
 //BA.debugLineNum = 14614556;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4a.example3.customlistview*/ ._asview();
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),(int) (0),_c.getTop(),_width,(int) (_height-_c.getTop()));
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(b4a.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If AllowUnlistedText Then";
if (__ref._allowunlistedtext /*boolean*/ ) { 
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="SelectedItem = LastTerm";
__ref._selecteditem /*String*/  = __ref._lastterm /*String*/ ;
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 }else 
{RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Else If CustomListView1.Size > 0 And LastTerm.Len";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue((int) (0)));
 }}
;
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(b4a.example.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=14942222;
 //BA.debugLineNum = 14942222;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=14942228;
 //BA.debugLineNum = 14942228;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=14942230;
 //BA.debugLineNum = 14942230;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=14942231;
 //BA.debugLineNum = 14942231;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=14942233;
 //BA.debugLineNum = 14942233;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4a.example.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (0)]));
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (1)]));
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="item = Items.Get(i)";
_item = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="item = item.ToLowerCase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="For start = 0 To item.Length";
{
final int step14 = 1;
final int limit14 = _item.length();
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_item.length()) {
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="str = item.SubString2(start, start + count)";
_str = _item.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=15204377;
 //BA.debugLineNum = 15204377;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
_li.Add(_items.Get(_i));
 };
RDebugUtils.currentLine=15204381;
 //BA.debugLineNum = 15204381;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=15204385;
 //BA.debugLineNum = 15204385;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("915204385","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
RDebugUtils.currentLine=15204386;
 //BA.debugLineNum = 15204386;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=15204387;
 //BA.debugLineNum = 15204387;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=15204388;
 //BA.debugLineNum = 15204388;BA.debugLine="End Sub";
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