package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigo_laydetalheslivro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_create", _firsttime);}
RemoteObject _largura = RemoteObject.createImmutable(0);
RemoteObject _esquerda = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"Lay_detalhes_leituras\")";
Debug.ShouldStop(-2147483648);
codigo_laydetalheslivro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_detalhes_leituras")),codigo_laydetalheslivro.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="bt_voltar.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(1);
codigo_laydetalheslivro.mostCurrent._bt_voltar.runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_voltar.png"))).getObject())));
 BA.debugLineNum = 35;BA.debugLine="painel_imagem.Initialize( \"\" )";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 36;BA.debugLine="lbl_livro.Initialize(\"\")";
Debug.ShouldStop(8);
codigo_laydetalheslivro.mostCurrent._lbl_livro.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 37;BA.debugLine="lbl_usuario.Initialize(\"\")";
Debug.ShouldStop(16);
codigo_laydetalheslivro.mostCurrent._lbl_usuario.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="dm.Initialize";
Debug.ShouldStop(64);
codigo_laydetalheslivro.mostCurrent._dm.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="lbl.Initialize";
Debug.ShouldStop(128);
codigo_laydetalheslivro.mostCurrent._lbl.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="dm.esquerda = 1%x";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._dm.setField ("esquerda" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 43;BA.debugLine="dm.tamanho = 98%x";
Debug.ShouldStop(1024);
codigo_laydetalheslivro.mostCurrent._dm.setField ("tamanho" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 44;BA.debugLine="dm.topo = 1%y";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 46;BA.debugLine="cores(0) = Colors.Cyan";
Debug.ShouldStop(8192);
codigo_laydetalheslivro._cores.setArrayElement (codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 47;BA.debugLine="cores(1) = Colors.Cyan";
Debug.ShouldStop(16384);
codigo_laydetalheslivro._cores.setArrayElement (codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 48;BA.debugLine="gradient.Initialize(\"TOP_BOTTOM\", cores)";
Debug.ShouldStop(32768);
codigo_laydetalheslivro.mostCurrent._gradient.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(codigo_laydetalheslivro._cores));
 BA.debugLineNum = 49;BA.debugLine="gradient.CornerRadius = 60";
Debug.ShouldStop(65536);
codigo_laydetalheslivro.mostCurrent._gradient.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 60));
 BA.debugLineNum = 52;BA.debugLine="painel_imagem.Color = Colors.Cyan";
Debug.ShouldStop(524288);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runVoidMethod ("setColor",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 54;BA.debugLine="scrol.Panel.AddView(painel_imagem, dm.esquerda, d";
Debug.ShouldStop(2097152);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._painel_imagem.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 55;BA.debugLine="painel_imagem.LoadLayout(\"Lay_imagem_tela_detalhe";
Debug.ShouldStop(4194304);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_imagem_tela_detalhes")),codigo_laydetalheslivro.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="lbl_livro = Configura_label(\"Helberte costa\", Col";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro.mostCurrent._lbl_livro = _configura_label(BA.ObjectToString("Helberte costa"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),BA.numberCast(int.class, 13),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 58;BA.debugLine="lbl_usuario = Configura_label(\"As cronicas\", Colo";
Debug.ShouldStop(33554432);
codigo_laydetalheslivro.mostCurrent._lbl_usuario = _configura_label(BA.ObjectToString("As cronicas"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),BA.numberCast(int.class, 13),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 60;BA.debugLine="lbl_livro.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
codigo_laydetalheslivro.mostCurrent._lbl_livro.runMethod(true,"setGravity",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 61;BA.debugLine="lbl_usuario.Gravity = Gravity.CENTER";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._lbl_usuario.runMethod(true,"setGravity",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 63;BA.debugLine="dm.topo = dm.topo + painel_imagem.Height + 1dip";
Debug.ShouldStop(1073741824);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._painel_imagem.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 64;BA.debugLine="scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.to";
Debug.ShouldStop(-2147483648);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_livro.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 66;BA.debugLine="dm.topo = dm.topo + lbl_livro.Height + 1dip";
Debug.ShouldStop(2);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._lbl_livro.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 67;BA.debugLine="scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_usuario.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 69;BA.debugLine="dm.topo = dm.topo + lbl_usuario.Height + 1dip";
Debug.ShouldStop(16);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._lbl_usuario.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 71;BA.debugLine="Dim largura As Int = 17%x";
Debug.ShouldStop(64);
_largura = codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),codigo_laydetalheslivro.mostCurrent.activityBA);Debug.locals.put("largura", _largura);Debug.locals.put("largura", _largura);
 BA.debugLineNum = 73;BA.debugLine="Dim esquerda As Int = 1.5%x";
Debug.ShouldStop(256);
_esquerda = codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1.5)),codigo_laydetalheslivro.mostCurrent.activityBA);Debug.locals.put("esquerda", _esquerda);Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 75;BA.debugLine="esquerda = (100%x -((esquerda * 4) + (largura * 5";
Debug.ShouldStop(1024);
_esquerda = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigo_laydetalheslivro.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_esquerda,RemoteObject.createImmutable(4)}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {_largura,RemoteObject.createImmutable(5)}, "*",0, 1))}, "+",1, 1))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 77;BA.debugLine="For i = 0 To botoes.Length - 1";
Debug.ShouldStop(4096);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._botoes.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="botoes(i).Initialize(\"Event_botoes\")";
Debug.ShouldStop(16384);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_botoes")));
 BA.debugLineNum = 80;BA.debugLine="botoes(i).Color = Colors.Cyan";
Debug.ShouldStop(32768);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("setColor",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 81;BA.debugLine="botoes(i).Background = gradient";
Debug.ShouldStop(65536);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(codigo_laydetalheslivro.mostCurrent._gradient.getObject()));
 BA.debugLineNum = 83;BA.debugLine="scrol.Panel.AddView(botoes(i), esquerda, dm.topo";
Debug.ShouldStop(262144);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_esquerda),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(_largura),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 85;BA.debugLine="esquerda = esquerda + botoes(i).Width + 1.5%x";
Debug.ShouldStop(1048576);
_esquerda = RemoteObject.solve(new RemoteObject[] {_esquerda,codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1.5)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("esquerda", _esquerda);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,108);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,104);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_resume");}
 BA.debugLineNum = 104;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bt_voltar_click() throws Exception{
try {
		Debug.PushSubsStack("bt_voltar_Click (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,113);
if (RapidSub.canDelegate("bt_voltar_click")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","bt_voltar_click");}
 BA.debugLineNum = 113;BA.debugLine="Sub bt_voltar_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
codigo_laydetalheslivro.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configura_label(RemoteObject _texto,RemoteObject _cor_fundo,RemoteObject _fonte,RemoteObject _cor_texto) throws Exception{
try {
		Debug.PushSubsStack("Configura_label (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,91);
if (RapidSub.canDelegate("configura_label")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","configura_label", _texto, _cor_fundo, _fonte, _cor_texto);}
RemoteObject _label = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("texto", _texto);
Debug.locals.put("cor_fundo", _cor_fundo);
Debug.locals.put("fonte", _fonte);
Debug.locals.put("cor_texto", _cor_texto);
 BA.debugLineNum = 91;BA.debugLine="Sub Configura_label(texto As String, cor_fundo As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim label As Label";
Debug.ShouldStop(134217728);
_label = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("label", _label);
 BA.debugLineNum = 94;BA.debugLine="label.Initialize(\"\")";
Debug.ShouldStop(536870912);
_label.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 96;BA.debugLine="label.Text = texto";
Debug.ShouldStop(-2147483648);
_label.runMethod(true,"setText",BA.ObjectToCharSequence(_texto));
 BA.debugLineNum = 97;BA.debugLine="label.Color = cor_fundo";
Debug.ShouldStop(1);
_label.runVoidMethod ("setColor",_cor_fundo);
 BA.debugLineNum = 98;BA.debugLine="label.TextSize = fonte";
Debug.ShouldStop(2);
_label.runMethod(true,"setTextSize",BA.numberCast(float.class, _fonte));
 BA.debugLineNum = 99;BA.debugLine="label.TextColor = cor_texto";
Debug.ShouldStop(4);
_label.runMethod(true,"setTextColor",_cor_texto);
 BA.debugLineNum = 101;BA.debugLine="Return label";
Debug.ShouldStop(16);
if (true) return _label;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private bt_voltar As 				Button";
codigo_laydetalheslivro.mostCurrent._bt_voltar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private panel_cabecalho As 			Panel";
codigo_laydetalheslivro.mostCurrent._panel_cabecalho = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private scrol As 					ScrollView";
codigo_laydetalheslivro.mostCurrent._scrol = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim painel_imagem As				Panel";
codigo_laydetalheslivro.mostCurrent._painel_imagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Type Dimensoes (esquerda As Int, topo As Int, tam";
;
 //BA.debugLineNum = 19;BA.debugLine="Type Dm_labels (topo As Int)";
;
 //BA.debugLineNum = 20;BA.debugLine="Dim lbl As 							Dm_labels";
codigo_laydetalheslivro.mostCurrent._lbl = RemoteObject.createNew ("b4a.example.codigo_laydetalheslivro._dm_labels");
 //BA.debugLineNum = 21;BA.debugLine="Dim dm As 							Dimensoes";
codigo_laydetalheslivro.mostCurrent._dm = RemoteObject.createNew ("b4a.example.codigo_laydetalheslivro._dimensoes");
 //BA.debugLineNum = 22;BA.debugLine="Dim gradient As 					GradientDrawable";
codigo_laydetalheslivro.mostCurrent._gradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");
 //BA.debugLineNum = 23;BA.debugLine="Dim cores(2) As 					Int";
codigo_laydetalheslivro._cores = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="Dim botoes(5) As 					Button";
codigo_laydetalheslivro.mostCurrent._botoes = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {5}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Dim lbl_usuario As 					Label";
codigo_laydetalheslivro.mostCurrent._lbl_usuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim lbl_livro	As					Label";
codigo_laydetalheslivro.mostCurrent._lbl_livro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}