
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xcombobox {
    public static RemoteObject myClass;
	public b4xcombobox() {
	}
    public static PCBA staticBA = new PCBA(null, b4xcombobox.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lastselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _cmbbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _delaybeforechangeevent = RemoteObject.createImmutable(0);
public static RemoteObject _delayindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _b4icancelbutton = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.codigocadastro _codigocadastro = null;
public static b4a.example.codigocadastrolivro _codigocadastrolivro = null;
public static b4a.example.codigolayanotacao _codigolayanotacao = null;
public static b4a.example.codigolayleituras _codigolayleituras = null;
public static b4a.example.codigolaylogin _codigolaylogin = null;
public static b4a.example.starter _starter = null;
public static b4a.example.codigolancamentoleitura _codigolancamentoleitura = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"B4iCancelButton",_ref.getField(false, "_b4icancelbutton"),"cmbBox",_ref.getField(false, "_cmbbox"),"DateUtils",_ref.getField(false, "_dateutils"),"DelayBeforeChangeEvent",_ref.getField(false, "_delaybeforechangeevent"),"DelayIndex",_ref.getField(false, "_delayindex"),"LastSelectedIndex",_ref.getField(false, "_lastselectedindex"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}