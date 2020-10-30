package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codigo_laydetalheslivro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_create", _firsttime);}
RemoteObject _g = RemoteObject.declareNull("Object");
RemoteObject _gd_color = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _cores_label = null;
RemoteObject _lbl_cor_fundo = RemoteObject.createImmutable(0);
RemoteObject _lbl_cor_fonte = RemoteObject.createImmutable(0);
RemoteObject _fonte_rot = RemoteObject.createImmutable(0);
RemoteObject _largura = RemoteObject.createImmutable(0);
RemoteObject _esquerda = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Activity.LoadLayout(\"Lay_detalhes_leituras\")";
Debug.ShouldStop(8388608);
codigo_laydetalheslivro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_detalhes_leituras")),codigo_laydetalheslivro.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="bt_voltar.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro.mostCurrent._bt_voltar.runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_voltar.png"))).getObject())));
 BA.debugLineNum = 58;BA.debugLine="painel_botoes.Initialize(\"\")";
Debug.ShouldStop(33554432);
codigo_laydetalheslivro.mostCurrent._painel_botoes.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="banco.Initialize";
Debug.ShouldStop(134217728);
codigo_laydetalheslivro._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,codigo_laydetalheslivro.processBA);
 BA.debugLineNum = 61;BA.debugLine="painel_imagem.Initialize( \"\" )";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="lbl_livro.Initialize(\"\")";
Debug.ShouldStop(536870912);
codigo_laydetalheslivro.mostCurrent._lbl_livro.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 63;BA.debugLine="lbl_usuario.Initialize(\"\")";
Debug.ShouldStop(1073741824);
codigo_laydetalheslivro.mostCurrent._lbl_usuario.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 64;BA.debugLine="panel_detalhes.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="lbl_dt_inicio.Initialize(\"\")";
Debug.ShouldStop(2);
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 67;BA.debugLine="lbl_dt_termino.Initialize(\"\")";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 68;BA.debugLine="lbl_pg_atual.Initialize(\"\")";
Debug.ShouldStop(8);
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="lbl_pg_total.Initialize(\"\")";
Debug.ShouldStop(16);
codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 70;BA.debugLine="lbl_pg_meta.Initialize(\"\")";
Debug.ShouldStop(32);
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 72;BA.debugLine="rot_dt_inicio.Initialize(\"\")";
Debug.ShouldStop(128);
codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="rot_dt_termino.Initialize(\"\")";
Debug.ShouldStop(256);
codigo_laydetalheslivro.mostCurrent._rot_dt_termino.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 74;BA.debugLine="rot_pg_atual.Initialize(\"\")";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._rot_pg_atual.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="rot_pg_meta.Initialize(\"\")";
Debug.ShouldStop(1024);
codigo_laydetalheslivro.mostCurrent._rot_pg_meta.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 76;BA.debugLine="rot_pg_total.Initialize(\"\")";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._rot_pg_total.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 78;BA.debugLine="Dim g As Object";
Debug.ShouldStop(8192);
_g = RemoteObject.createNew ("Object");Debug.locals.put("g", _g);
 BA.debugLineNum = 79;BA.debugLine="Dim gd_color As GradientDrawable";
Debug.ShouldStop(16384);
_gd_color = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd_color", _gd_color);
 BA.debugLineNum = 80;BA.debugLine="Dim cores_label(2) As Int";
Debug.ShouldStop(32768);
_cores_label = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("cores_label", _cores_label);
 BA.debugLineNum = 82;BA.debugLine="g = Bit.Or(Gravity.LEFT, Gravity.CENTER_VERTICAL)";
Debug.ShouldStop(131072);
_g = (codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));Debug.locals.put("g", _g);
 BA.debugLineNum = 84;BA.debugLine="cores_label(0) = Colors.RGB(241, 201, 201)";
Debug.ShouldStop(524288);
_cores_label.setArrayElement (codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 241)),(Object)(BA.numberCast(int.class, 201)),(Object)(BA.numberCast(int.class, 201))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 85;BA.debugLine="cores_label(1) = Colors.RGB(241, 201, 201)";
Debug.ShouldStop(1048576);
_cores_label.setArrayElement (codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 241)),(Object)(BA.numberCast(int.class, 201)),(Object)(BA.numberCast(int.class, 201))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 87;BA.debugLine="gd_color.Initialize(\"TOP_BOTTOM\", cores_label)";
Debug.ShouldStop(4194304);
_gd_color.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_cores_label));
 BA.debugLineNum = 88;BA.debugLine="gd_color.CornerRadius = 100";
Debug.ShouldStop(8388608);
_gd_color.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 100));
 BA.debugLineNum = 90;BA.debugLine="Dim lbl_cor_fundo As Int = Colors.RGB(241, 201, 2";
Debug.ShouldStop(33554432);
_lbl_cor_fundo = codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 241)),(Object)(BA.numberCast(int.class, 201)),(Object)(BA.numberCast(int.class, 201)));Debug.locals.put("lbl_cor_fundo", _lbl_cor_fundo);Debug.locals.put("lbl_cor_fundo", _lbl_cor_fundo);
 BA.debugLineNum = 91;BA.debugLine="Dim lbl_cor_fonte As Int = Colors.RGB(104,30,30)";
Debug.ShouldStop(67108864);
_lbl_cor_fonte = codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 104)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 30)));Debug.locals.put("lbl_cor_fonte", _lbl_cor_fonte);Debug.locals.put("lbl_cor_fonte", _lbl_cor_fonte);
 BA.debugLineNum = 93;BA.debugLine="lbl_dt_inicio = Configura_label(dt_inicio, lbl_co";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio = _configura_label(codigo_laydetalheslivro._dt_inicio,_lbl_cor_fundo,BA.numberCast(int.class, 20),_lbl_cor_fonte);
 BA.debugLineNum = 94;BA.debugLine="lbl_dt_termino = Configura_label(dt_termino, lbl_";
Debug.ShouldStop(536870912);
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino = _configura_label(codigo_laydetalheslivro._dt_termino,_lbl_cor_fundo,BA.numberCast(int.class, 20),_lbl_cor_fonte);
 BA.debugLineNum = 95;BA.debugLine="lbl_pg_atual = Configura_label(pg_atual, lbl_cor_";
Debug.ShouldStop(1073741824);
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual = _configura_label(codigo_laydetalheslivro._pg_atual,_lbl_cor_fundo,BA.numberCast(int.class, 20),_lbl_cor_fonte);
 BA.debugLineNum = 96;BA.debugLine="lbl_pg_total = Configura_label(pg_total, lbl_cor_";
Debug.ShouldStop(-2147483648);
codigo_laydetalheslivro.mostCurrent._lbl_pg_total = _configura_label(codigo_laydetalheslivro._pg_total,_lbl_cor_fundo,BA.numberCast(int.class, 20),_lbl_cor_fonte);
 BA.debugLineNum = 97;BA.debugLine="lbl_pg_meta = Configura_label(pg_meta, lbl_cor_fu";
Debug.ShouldStop(1);
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta = _configura_label(codigo_laydetalheslivro._pg_meta,_lbl_cor_fundo,BA.numberCast(int.class, 20),_lbl_cor_fonte);
 BA.debugLineNum = 99;BA.debugLine="Dim fonte_rot As Int = 15";
Debug.ShouldStop(4);
_fonte_rot = BA.numberCast(int.class, 15);Debug.locals.put("fonte_rot", _fonte_rot);Debug.locals.put("fonte_rot", _fonte_rot);
 BA.debugLineNum = 100;BA.debugLine="If tipo_leitura = \"páginas\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",codigo_laydetalheslivro._tipo_leitura,BA.ObjectToString("páginas"))) { 
 BA.debugLineNum = 101;BA.debugLine="tipo_leitura = \"Página\"";
Debug.ShouldStop(16);
codigo_laydetalheslivro._tipo_leitura = BA.ObjectToString("Página");
 }else {
 BA.debugLineNum = 103;BA.debugLine="tipo_leitura = \"Capítulo\"";
Debug.ShouldStop(64);
codigo_laydetalheslivro._tipo_leitura = BA.ObjectToString("Capítulo");
 };
 BA.debugLineNum = 105;BA.debugLine="rot_dt_inicio = Configura_label(\"Data de início\",";
Debug.ShouldStop(256);
codigo_laydetalheslivro.mostCurrent._rot_dt_inicio = _configura_label(BA.ObjectToString("Data de início"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),_fonte_rot,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 106;BA.debugLine="rot_dt_termino = Configura_label(\"Previsão de tér";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._rot_dt_termino = _configura_label(BA.ObjectToString("Previsão de término"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),_fonte_rot,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 107;BA.debugLine="rot_pg_atual = Configura_label( tipo_leitura & \"";
Debug.ShouldStop(1024);
codigo_laydetalheslivro.mostCurrent._rot_pg_atual = _configura_label(RemoteObject.concat(codigo_laydetalheslivro._tipo_leitura,RemoteObject.createImmutable(" atual")),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),_fonte_rot,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 108;BA.debugLine="rot_pg_meta = Configura_label(\"Meta\", Colors.Tran";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._rot_pg_meta = _configura_label(BA.ObjectToString("Meta"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),_fonte_rot,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 109;BA.debugLine="If tipo_leitura = \"Página\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",codigo_laydetalheslivro._tipo_leitura,BA.ObjectToString("Página"))) { 
 BA.debugLineNum = 110;BA.debugLine="tipo_leitura = \"páginas\"";
Debug.ShouldStop(8192);
codigo_laydetalheslivro._tipo_leitura = BA.ObjectToString("páginas");
 }else {
 BA.debugLineNum = 112;BA.debugLine="tipo_leitura = \"capítulos\"";
Debug.ShouldStop(32768);
codigo_laydetalheslivro._tipo_leitura = BA.ObjectToString("capítulos");
 };
 BA.debugLineNum = 114;BA.debugLine="rot_pg_total = Configura_label(\"Total de \" & tipo";
Debug.ShouldStop(131072);
codigo_laydetalheslivro.mostCurrent._rot_pg_total = _configura_label(RemoteObject.concat(RemoteObject.createImmutable("Total de "),codigo_laydetalheslivro._tipo_leitura),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),_fonte_rot,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 116;BA.debugLine="lbl_dt_inicio.Gravity = g";
Debug.ShouldStop(524288);
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 117;BA.debugLine="lbl_dt_termino.Gravity = g";
Debug.ShouldStop(1048576);
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 118;BA.debugLine="lbl_pg_atual.Gravity = g";
Debug.ShouldStop(2097152);
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 119;BA.debugLine="lbl_pg_total.Gravity = g";
Debug.ShouldStop(4194304);
codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 120;BA.debugLine="lbl_pg_meta.Gravity = g";
Debug.ShouldStop(8388608);
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 122;BA.debugLine="lbl_dt_inicio.Background = gd_color";
Debug.ShouldStop(33554432);
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runMethod(false,"setBackground",(_gd_color.getObject()));
 BA.debugLineNum = 123;BA.debugLine="lbl_dt_termino.Background = gd_color";
Debug.ShouldStop(67108864);
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runMethod(false,"setBackground",(_gd_color.getObject()));
 BA.debugLineNum = 124;BA.debugLine="lbl_pg_atual.Background = gd_color";
Debug.ShouldStop(134217728);
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runMethod(false,"setBackground",(_gd_color.getObject()));
 BA.debugLineNum = 125;BA.debugLine="lbl_pg_total.Background = gd_color";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runMethod(false,"setBackground",(_gd_color.getObject()));
 BA.debugLineNum = 126;BA.debugLine="lbl_pg_meta.Background = gd_color";
Debug.ShouldStop(536870912);
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta.runMethod(false,"setBackground",(_gd_color.getObject()));
 BA.debugLineNum = 128;BA.debugLine="lbl_dt_inicio.Padding = Array As Int (25dip, 0dip";
Debug.ShouldStop(-2147483648);
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 129;BA.debugLine="lbl_dt_termino.Padding = Array As Int (25dip, 0di";
Debug.ShouldStop(1);
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 130;BA.debugLine="lbl_pg_atual.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(2);
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 131;BA.debugLine="lbl_pg_total.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 132;BA.debugLine="lbl_pg_meta.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(8);
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 134;BA.debugLine="rot_dt_inicio.Gravity = g";
Debug.ShouldStop(32);
codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 135;BA.debugLine="rot_dt_termino.Gravity = g";
Debug.ShouldStop(64);
codigo_laydetalheslivro.mostCurrent._rot_dt_termino.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 136;BA.debugLine="rot_pg_atual.Gravity = g";
Debug.ShouldStop(128);
codigo_laydetalheslivro.mostCurrent._rot_pg_atual.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 137;BA.debugLine="rot_pg_meta.Gravity = g";
Debug.ShouldStop(256);
codigo_laydetalheslivro.mostCurrent._rot_pg_meta.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 138;BA.debugLine="rot_pg_total.Gravity = g";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._rot_pg_total.runMethod(true,"setGravity",BA.numberCast(int.class, _g));
 BA.debugLineNum = 140;BA.debugLine="rot_dt_inicio.Padding = Array As Int (25dip, 0dip";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 141;BA.debugLine="rot_dt_termino.Padding = Array As Int (25dip, 0di";
Debug.ShouldStop(4096);
codigo_laydetalheslivro.mostCurrent._rot_dt_termino.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 142;BA.debugLine="rot_pg_atual.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(8192);
codigo_laydetalheslivro.mostCurrent._rot_pg_atual.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 143;BA.debugLine="rot_pg_meta.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(16384);
codigo_laydetalheslivro.mostCurrent._rot_pg_meta.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 144;BA.debugLine="rot_pg_total.Padding = Array As Int (25dip, 0dip,";
Debug.ShouldStop(32768);
codigo_laydetalheslivro.mostCurrent._rot_pg_total.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 146;BA.debugLine="lbl_livro = Configura_label(nome_livro, Colors.Tr";
Debug.ShouldStop(131072);
codigo_laydetalheslivro.mostCurrent._lbl_livro = _configura_label(codigo_laydetalheslivro._nome_livro,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),BA.numberCast(int.class, 13),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 147;BA.debugLine="lbl_usuario = Configura_label(nome_usuario, Color";
Debug.ShouldStop(262144);
codigo_laydetalheslivro.mostCurrent._lbl_usuario = _configura_label(codigo_laydetalheslivro._nome_usuario,codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),BA.numberCast(int.class, 13),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 149;BA.debugLine="lbl_livro.Gravity = Gravity.CENTER";
Debug.ShouldStop(1048576);
codigo_laydetalheslivro.mostCurrent._lbl_livro.runMethod(true,"setGravity",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 150;BA.debugLine="lbl_usuario.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
codigo_laydetalheslivro.mostCurrent._lbl_usuario.runMethod(true,"setGravity",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 152;BA.debugLine="dm.Initialize";
Debug.ShouldStop(8388608);
codigo_laydetalheslivro.mostCurrent._dm.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="lbl.Initialize";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro.mostCurrent._lbl.runVoidMethod ("Initialize");
 BA.debugLineNum = 155;BA.debugLine="dm.esquerda = 1%x";
Debug.ShouldStop(67108864);
codigo_laydetalheslivro.mostCurrent._dm.setField ("esquerda" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 156;BA.debugLine="dm.tamanho = 98%x";
Debug.ShouldStop(134217728);
codigo_laydetalheslivro.mostCurrent._dm.setField ("tamanho" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 157;BA.debugLine="dm.topo = 1%y";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 159;BA.debugLine="painel_imagem.Color = Colors.Cyan";
Debug.ShouldStop(1073741824);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runVoidMethod ("setColor",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 161;BA.debugLine="scrol.Panel.AddView(painel_imagem, dm.esquerda, d";
Debug.ShouldStop(1);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._painel_imagem.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 162;BA.debugLine="painel_imagem.LoadLayout(\"Lay_imagem_tela_detalhe";
Debug.ShouldStop(2);
codigo_laydetalheslivro.mostCurrent._painel_imagem.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_imagem_tela_detalhes")),codigo_laydetalheslivro.mostCurrent.activityBA);
 BA.debugLineNum = 163;BA.debugLine="b4x_imagem.Load(File.DirAssets, \"livro.jpg\")";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._b4x_imagem.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("livro.jpg")));
 BA.debugLineNum = 164;BA.debugLine="b4x_imagem.ResizeMode = \"FILL\"";
Debug.ShouldStop(8);
codigo_laydetalheslivro.mostCurrent._b4x_imagem.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL"));
 BA.debugLineNum = 166;BA.debugLine="dm.topo = dm.topo + painel_imagem.Height + 1dip";
Debug.ShouldStop(32);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._painel_imagem.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 167;BA.debugLine="scrol.Panel.AddView(lbl_livro, dm.esquerda, dm.to";
Debug.ShouldStop(64);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_livro.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 169;BA.debugLine="dm.topo = dm.topo + lbl_livro.Height + 1dip";
Debug.ShouldStop(256);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._lbl_livro.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 170;BA.debugLine="scrol.Panel.AddView(lbl_usuario, dm.esquerda, dm.";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_usuario.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 172;BA.debugLine="dm.topo = dm.topo + lbl_usuario.Height + 1dip";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._lbl_usuario.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 1));
 BA.debugLineNum = 174;BA.debugLine="painel_botoes.Color = Colors.Transparent";
Debug.ShouldStop(8192);
codigo_laydetalheslivro.mostCurrent._painel_botoes.runVoidMethod ("setColor",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 175;BA.debugLine="scrol.Panel.AddView(painel_botoes, 0%x, dm.topo,";
Debug.ShouldStop(16384);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._painel_botoes.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),codigo_laydetalheslivro.mostCurrent.activityBA)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigo_laydetalheslivro.mostCurrent.activityBA)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 177;BA.debugLine="Dim largura As Int = 17%x";
Debug.ShouldStop(65536);
_largura = codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 17)),codigo_laydetalheslivro.mostCurrent.activityBA);Debug.locals.put("largura", _largura);Debug.locals.put("largura", _largura);
 BA.debugLineNum = 178;BA.debugLine="Dim esquerda As Int = 1.7%x";
Debug.ShouldStop(131072);
_esquerda = codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1.7)),codigo_laydetalheslivro.mostCurrent.activityBA);Debug.locals.put("esquerda", _esquerda);Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 180;BA.debugLine="esquerda = (100%x -((esquerda * 4) + (largura * 5";
Debug.ShouldStop(524288);
_esquerda = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),codigo_laydetalheslivro.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_esquerda,RemoteObject.createImmutable(4)}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {_largura,RemoteObject.createImmutable(5)}, "*",0, 1))}, "+",1, 1))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 182;BA.debugLine="For i = 0 To botoes.Length - 1";
Debug.ShouldStop(2097152);
{
final int step99 = 1;
final int limit99 = RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._botoes.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step99 > 0 && _i <= limit99) || (step99 < 0 && _i >= limit99) ;_i = ((int)(0 + _i + step99))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 184;BA.debugLine="botoes(i).Initialize(\"Event_botoes\")";
Debug.ShouldStop(8388608);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_botoes")));
 BA.debugLineNum = 185;BA.debugLine="botoes(i).Color = Colors.Cyan";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("setColor",codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 186;BA.debugLine="botoes(i).Background = Gradient_border(Colors.Cy";
Debug.ShouldStop(33554432);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(_gradient_border(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"),BA.numberCast(int.class, 60)).getObject()));
 BA.debugLineNum = 187;BA.debugLine="botoes(i).Tag = i";
Debug.ShouldStop(67108864);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 189;BA.debugLine="painel_botoes.AddView(botoes(i), esquerda, 0%y,";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._painel_botoes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_esquerda),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),codigo_laydetalheslivro.mostCurrent.activityBA)),(Object)(_largura),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 191;BA.debugLine="esquerda = esquerda + botoes(i).Width + 1.7%x";
Debug.ShouldStop(1073741824);
_esquerda = RemoteObject.solve(new RemoteObject[] {_esquerda,codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1.7)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("esquerda", _esquerda);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 194;BA.debugLine="botoes(0).SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(2);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_add_leitura.ico"))).getObject())));
 BA.debugLineNum = 195;BA.debugLine="botoes(1).SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(4);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_anotacao.ico"))).getObject())));
 BA.debugLineNum = 196;BA.debugLine="botoes(2).SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(8);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bt_editar.ico"))).getObject())));
 BA.debugLineNum = 197;BA.debugLine="botoes(3).SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(16);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("img_bt_apagar.ico"))).getObject())));
 BA.debugLineNum = 198;BA.debugLine="botoes(4).SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(32);
codigo_laydetalheslivro.mostCurrent._botoes.getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("SetBackgroundImageNew",(Object)((codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("img_historicos.ico"))).getObject())));
 BA.debugLineNum = 200;BA.debugLine="dm.topo = dm.topo + painel_botoes.Height + 3%y";
Debug.ShouldStop(128);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._painel_botoes.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 201;BA.debugLine="panel_detalhes.Background = Gradient_border(Color";
Debug.ShouldStop(256);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(false,"setBackground",(_gradient_border(codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 239))),codigo_laydetalheslivro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 239))),BA.numberCast(int.class, 15)).getObject()));
 BA.debugLineNum = 203;BA.debugLine="scrol.Panel.AddView(panel_detalhes, dm.esquerda,";
Debug.ShouldStop(1024);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._panel_detalhes.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 205;BA.debugLine="panel_detalhes.AddView(rot_dt_inicio, dm.esquerda";
Debug.ShouldStop(4096);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 206;BA.debugLine="panel_detalhes.AddView(lbl_dt_inicio, dm.esquerda";
Debug.ShouldStop(8192);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent._rot_dt_inicio.runMethod(true,"getTop")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 208;BA.debugLine="panel_detalhes.AddView(rot_dt_termino, dm.esquerd";
Debug.ShouldStop(32768);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._rot_dt_termino.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runMethod(true,"getTop"),codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 209;BA.debugLine="panel_detalhes.AddView(lbl_dt_termino, dm.esquerd";
Debug.ShouldStop(65536);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._rot_dt_termino.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent._rot_dt_termino.runMethod(true,"getTop")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 211;BA.debugLine="panel_detalhes.AddView(rot_pg_atual, dm.esquerda,";
Debug.ShouldStop(262144);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._rot_pg_atual.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runMethod(true,"getTop"),codigo_laydetalheslivro.mostCurrent._lbl_dt_termino.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 212;BA.debugLine="panel_detalhes.AddView(lbl_pg_atual, dm.esquerda,";
Debug.ShouldStop(524288);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._rot_pg_atual.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent._rot_pg_atual.runMethod(true,"getTop")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 214;BA.debugLine="panel_detalhes.AddView(rot_pg_total, dm.esquerda,";
Debug.ShouldStop(2097152);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._rot_pg_total.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runMethod(true,"getTop"),codigo_laydetalheslivro.mostCurrent._lbl_pg_atual.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 215;BA.debugLine="panel_detalhes.AddView(lbl_pg_total, dm.esquerda,";
Debug.ShouldStop(4194304);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_pg_total.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._rot_pg_total.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent._rot_pg_total.runMethod(true,"getTop")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 217;BA.debugLine="panel_detalhes.AddView(rot_pg_meta, dm.esquerda,";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._rot_pg_meta.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runMethod(true,"getTop"),codigo_laydetalheslivro.mostCurrent._lbl_pg_total.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "++",2, 1)),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"tamanho" /*RemoteObject*/ )),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 218;BA.debugLine="panel_detalhes.AddView(lbl_pg_meta, dm.esquerda,";
Debug.ShouldStop(33554432);
codigo_laydetalheslivro.mostCurrent._panel_detalhes.runVoidMethod ("AddView",(Object)((codigo_laydetalheslivro.mostCurrent._lbl_pg_meta.getObject())),(Object)(codigo_laydetalheslivro.mostCurrent._dm.getField(true,"esquerda" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._rot_pg_meta.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent._rot_pg_meta.runMethod(true,"getTop")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getWidth"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),codigo_laydetalheslivro.mostCurrent.activityBA)}, "-",1, 1)),(Object)(codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),codigo_laydetalheslivro.mostCurrent.activityBA)));
 BA.debugLineNum = 220;BA.debugLine="dm.topo = dm.topo + panel_detalhes.Height + 15dip";
Debug.ShouldStop(134217728);
codigo_laydetalheslivro.mostCurrent._dm.setField ("topo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ),codigo_laydetalheslivro.mostCurrent._panel_detalhes.runMethod(true,"getHeight"),codigo_laydetalheslivro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "++",2, 1));
 BA.debugLineNum = 221;BA.debugLine="scrol.Panel.Height = dm.topo";
Debug.ShouldStop(268435456);
codigo_laydetalheslivro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",codigo_laydetalheslivro.mostCurrent._dm.getField(true,"topo" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,311);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 311;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="Main.CadastrouAlgo = seguro_cadastrou_algo";
Debug.ShouldStop(8388608);
codigo_laydetalheslivro.mostCurrent._main._cadastroualgo /*RemoteObject*/  = codigo_laydetalheslivro._seguro_cadastrou_algo;
 BA.debugLineNum = 313;BA.debugLine="seguro_cadastrou_algo = False";
Debug.ShouldStop(16777216);
codigo_laydetalheslivro._seguro_cadastrou_algo = codigo_laydetalheslivro.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,248);
if (RapidSub.canDelegate("activity_resume")) { b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.codigo_laydetalheslivro parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.codigo_laydetalheslivro parent;
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
int _i = 0;
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,248);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 250;BA.debugLine="Dim cmd As String";
Debug.ShouldStop(33554432);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 252;BA.debugLine="If Main.CadastrouAlgo Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 32;
if (parent.mostCurrent._main._cadastroualgo /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 253;BA.debugLine="seguro_cadastrou_algo = Main.CadastrouAlgo";
Debug.ShouldStop(268435456);
parent._seguro_cadastrou_algo = parent.mostCurrent._main._cadastroualgo /*RemoteObject*/ ;
 BA.debugLineNum = 254;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(536870912);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 256;BA.debugLine="cmd = \"exec sp_atualiza_leituras \" & Main.Id_do_";
Debug.ShouldStop(-2147483648);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_atualiza_leituras "),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ );Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 258;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

case 4:
//try
this.state = 31;
this.catchState = 30;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 30;
 BA.debugLineNum = 259;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complete";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", codigo_laydetalheslivro.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "codigo_laydetalheslivro", "activity_resume"), parent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 261;BA.debugLine="Result.NextRow";
Debug.ShouldStop(16);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 264;BA.debugLine="If Result.GetString(\"RESULTADO\") = 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 267;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 2 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(2))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 279;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(1))) { 
this.state = 17;
}}}
if (true) break;

case 9:
//C
this.state = 28;
 BA.debugLineNum = 266;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 269;BA.debugLine="If CodigoLancamentoLeitura.terminouLeitura The";
Debug.ShouldStop(4096);
if (true) break;

case 12:
//if
this.state = 15;
if (parent.mostCurrent._codigolancamentoleitura._terminouleitura /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 271;BA.debugLine="painel_botoes.RemoveViewAt(0)";
Debug.ShouldStop(16384);
parent.mostCurrent._painel_botoes.runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 272;BA.debugLine="painel_botoes.RemoveViewAt(1)";
Debug.ShouldStop(32768);
parent.mostCurrent._painel_botoes.runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 273;BA.debugLine="painel_botoes.RemoveViewAt(2)";
Debug.ShouldStop(65536);
parent.mostCurrent._painel_botoes.runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 274;BA.debugLine="painel_botoes.RemoveViewAt(3)";
Debug.ShouldStop(131072);
parent.mostCurrent._painel_botoes.runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 275;BA.debugLine="painel_botoes.RemoveViewAt(4)";
Debug.ShouldStop(262144);
parent.mostCurrent._painel_botoes.runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, 4)));
 if (true) break;

case 15:
//C
this.state = 28;
;
 BA.debugLineNum = 278;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"),";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 281;BA.debugLine="For i = 0 To Result.GetString(\"QUANTIDADE\") -";
Debug.ShouldStop(16777216);
if (true) break;

case 18:
//for
this.state = 27;
step21 = 1;
limit21 = (int) (0 + RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("QUANTIDADE")))),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue());
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 27;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 20;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step21)) ;
Debug.locals.put("i", _i);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 283;BA.debugLine="If Result.GetInt(\"fk_id_livro\") = id_livro T";
Debug.ShouldStop(67108864);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fk_id_livro"))),BA.numberCast(double.class, parent._id_livro))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 285;BA.debugLine="lbl_dt_inicio.Text = Result.GetString(\"data_";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbl_dt_inicio.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_inicial")))));
 BA.debugLineNum = 286;BA.debugLine="lbl_dt_termino.Text = Result.GetString(\"data";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbl_dt_termino.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_prevista_final")))));
 BA.debugLineNum = 287;BA.debugLine="lbl_pg_atual.Text = Result.GetInt(\"paginas_o";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbl_pg_atual.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos")))));
 BA.debugLineNum = 288;BA.debugLine="lbl_pg_total.Text = Result.GetString(\"quanti";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_pg_total.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("quantidade_paginas")))));
 BA.debugLineNum = 289;BA.debugLine="lbl_pg_meta.Text = Result.GetString(\"meta\")";
Debug.ShouldStop(1);
parent.mostCurrent._lbl_pg_meta.runMethod(true,"setText",BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("meta")))));
 BA.debugLineNum = 291;BA.debugLine="pg_meta = Result.GetString(\"meta\")";
Debug.ShouldStop(4);
parent._pg_meta = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("meta")));
 BA.debugLineNum = 292;BA.debugLine="nome_usuario = Result.GetString(\"usuarioNome";
Debug.ShouldStop(8);
parent._nome_usuario = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("usuarioNome")));
 BA.debugLineNum = 293;BA.debugLine="pg_atual = Result.GetString(\"paginas_ou_cap_";
Debug.ShouldStop(16);
parent._pg_atual = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paginas_ou_cap_lidos")));
 BA.debugLineNum = 294;BA.debugLine="tipo_leitura = Result.GetString(\"tipo_de_lei";
Debug.ShouldStop(32);
parent._tipo_leitura = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipo_de_leitura")));
 BA.debugLineNum = 295;BA.debugLine="pg_total = Result.GetString(\"quantidade_pagi";
Debug.ShouldStop(64);
parent._pg_total = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("quantidade_paginas")));
 BA.debugLineNum = 296;BA.debugLine="id_livro = Result.GetString(\"fk_id_livro\")";
Debug.ShouldStop(128);
parent._id_livro = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fk_id_livro")));
 BA.debugLineNum = 297;BA.debugLine="nome_livro = Result.GetString(\"nome\")";
Debug.ShouldStop(256);
parent._nome_livro = _result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nome")));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 299;BA.debugLine="Result.NextRow";
Debug.ShouldStop(1024);
_result.runVoidMethod ("NextRow");
 if (true) break;

case 26:
//C
this.state = 35;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("i", _i);
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
 BA.debugLineNum = 305;BA.debugLine="ToastMessageShow(\"Algo deu errado\",True)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Algo deu errado")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",codigo_laydetalheslivro.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _bt_voltar_click() throws Exception{
try {
		Debug.PushSubsStack("bt_voltar_Click (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,317);
if (RapidSub.canDelegate("bt_voltar_click")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","bt_voltar_click");}
 BA.debugLineNum = 317;BA.debugLine="Sub bt_voltar_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
codigo_laydetalheslivro.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Configura_label (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,235);
if (RapidSub.canDelegate("configura_label")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","configura_label", _texto, _cor_fundo, _fonte, _cor_texto);}
RemoteObject _label = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("texto", _texto);
Debug.locals.put("cor_fundo", _cor_fundo);
Debug.locals.put("fonte", _fonte);
Debug.locals.put("cor_texto", _cor_texto);
 BA.debugLineNum = 235;BA.debugLine="Sub Configura_label(texto As String, cor_fundo As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim label As Label";
Debug.ShouldStop(2048);
_label = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("label", _label);
 BA.debugLineNum = 238;BA.debugLine="label.Initialize(\"\")";
Debug.ShouldStop(8192);
_label.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 240;BA.debugLine="label.Text = texto";
Debug.ShouldStop(32768);
_label.runMethod(true,"setText",BA.ObjectToCharSequence(_texto));
 BA.debugLineNum = 241;BA.debugLine="label.Color = cor_fundo";
Debug.ShouldStop(65536);
_label.runVoidMethod ("setColor",_cor_fundo);
 BA.debugLineNum = 242;BA.debugLine="label.TextSize = fonte";
Debug.ShouldStop(131072);
_label.runMethod(true,"setTextSize",BA.numberCast(float.class, _fonte));
 BA.debugLineNum = 243;BA.debugLine="label.TextColor = cor_texto";
Debug.ShouldStop(262144);
_label.runMethod(true,"setTextColor",_cor_texto);
 BA.debugLineNum = 245;BA.debugLine="Return label";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return _label;
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_botoes_click() throws Exception{
try {
		Debug.PushSubsStack("Event_botoes_Click (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,321);
if (RapidSub.canDelegate("event_botoes_click")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","event_botoes_click");}
RemoteObject _botao = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _numero = RemoteObject.createImmutable(0);
 BA.debugLineNum = 321;BA.debugLine="Sub Event_botoes_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="Dim botao As Button";
Debug.ShouldStop(2);
_botao = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("botao", _botao);
 BA.debugLineNum = 323;BA.debugLine="Dim numero As Int";
Debug.ShouldStop(4);
_numero = RemoteObject.createImmutable(0);Debug.locals.put("numero", _numero);
 BA.debugLineNum = 324;BA.debugLine="botao.Initialize(\"\")";
Debug.ShouldStop(8);
_botao.runVoidMethod ("Initialize",codigo_laydetalheslivro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 325;BA.debugLine="botao = Sender";
Debug.ShouldStop(16);
_botao = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), codigo_laydetalheslivro.mostCurrent.__c.runMethod(false,"Sender",codigo_laydetalheslivro.mostCurrent.activityBA));
 BA.debugLineNum = 327;BA.debugLine="numero = botao.Tag";
Debug.ShouldStop(64);
_numero = BA.numberCast(int.class, _botao.runMethod(false,"getTag"));Debug.locals.put("numero", _numero);
 BA.debugLineNum = 328;BA.debugLine="If numero = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_numero,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 330;BA.debugLine="CodigoLancamentoLeitura.meta = pg_meta";
Debug.ShouldStop(512);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._meta /*RemoteObject*/  = BA.numberCast(int.class, codigo_laydetalheslivro._pg_meta);
 BA.debugLineNum = 331;BA.debugLine="CodigoLancamentoLeitura.nomeUsuario = nome_usuar";
Debug.ShouldStop(1024);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._nomeusuario /*RemoteObject*/  = codigo_laydetalheslivro._nome_usuario;
 BA.debugLineNum = 332;BA.debugLine="CodigoLancamentoLeitura.paginaAtual = pg_atual";
Debug.ShouldStop(2048);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._paginaatual /*RemoteObject*/  = BA.numberCast(int.class, codigo_laydetalheslivro._pg_atual);
 BA.debugLineNum = 333;BA.debugLine="CodigoLancamentoLeitura.tipoLeitura = tipo_leitu";
Debug.ShouldStop(4096);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._tipoleitura /*RemoteObject*/  = codigo_laydetalheslivro._tipo_leitura;
 BA.debugLineNum = 334;BA.debugLine="CodigoLancamentoLeitura.totalPaginas = pg_total";
Debug.ShouldStop(8192);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._totalpaginas /*RemoteObject*/  = BA.numberCast(int.class, codigo_laydetalheslivro._pg_total);
 BA.debugLineNum = 335;BA.debugLine="CodigoLancamentoLeitura.idLivro = id_livro";
Debug.ShouldStop(16384);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._idlivro /*RemoteObject*/  = BA.numberCast(int.class, codigo_laydetalheslivro._id_livro);
 BA.debugLineNum = 336;BA.debugLine="CodigoLancamentoLeitura.tituloLivro = nome_livro";
Debug.ShouldStop(32768);
codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura._titulolivro /*RemoteObject*/  = codigo_laydetalheslivro._nome_livro;
 BA.debugLineNum = 338;BA.debugLine="StartActivity(CodigoLancamentoLeitura)";
Debug.ShouldStop(131072);
codigo_laydetalheslivro.mostCurrent.__c.runVoidMethod ("StartActivity",codigo_laydetalheslivro.processBA,(Object)((codigo_laydetalheslivro.mostCurrent._codigolancamentoleitura.getObject())));
 };
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private bt_voltar As 				Button";
codigo_laydetalheslivro.mostCurrent._bt_voltar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private panel_cabecalho As 			Panel";
codigo_laydetalheslivro.mostCurrent._panel_cabecalho = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private scrol As 					ScrollView";
codigo_laydetalheslivro.mostCurrent._scrol = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim painel_imagem As				Panel";
codigo_laydetalheslivro.mostCurrent._painel_imagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Type Dimensoes (esquerda As Int, topo As Int, tam";
;
 //BA.debugLineNum = 29;BA.debugLine="Type Dm_labels (topo As Int)";
;
 //BA.debugLineNum = 30;BA.debugLine="Dim lbl As 							Dm_labels";
codigo_laydetalheslivro.mostCurrent._lbl = RemoteObject.createNew ("b4a.example.codigo_laydetalheslivro._dm_labels");
 //BA.debugLineNum = 31;BA.debugLine="Dim dm As 							Dimensoes";
codigo_laydetalheslivro.mostCurrent._dm = RemoteObject.createNew ("b4a.example.codigo_laydetalheslivro._dimensoes");
 //BA.debugLineNum = 32;BA.debugLine="Dim botoes(5) As 					Button";
codigo_laydetalheslivro.mostCurrent._botoes = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {5}, new Object[]{});
 //BA.debugLineNum = 33;BA.debugLine="dim painel_botoes as 				Panel";
codigo_laydetalheslivro.mostCurrent._painel_botoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim lbl_usuario As 					Label";
codigo_laydetalheslivro.mostCurrent._lbl_usuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim lbl_livro	As					Label";
codigo_laydetalheslivro.mostCurrent._lbl_livro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim panel_detalhes As				Panel";
codigo_laydetalheslivro.mostCurrent._panel_detalhes = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim lbl_dt_inicio As 				Label";
codigo_laydetalheslivro.mostCurrent._lbl_dt_inicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim lbl_dt_termino As 				Label";
codigo_laydetalheslivro.mostCurrent._lbl_dt_termino = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim lbl_pg_atual As 				Label";
codigo_laydetalheslivro.mostCurrent._lbl_pg_atual = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim lbl_pg_total As 				Label";
codigo_laydetalheslivro.mostCurrent._lbl_pg_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim lbl_pg_meta As 			    	Label";
codigo_laydetalheslivro.mostCurrent._lbl_pg_meta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim rot_dt_inicio As				Label";
codigo_laydetalheslivro.mostCurrent._rot_dt_inicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim rot_dt_termino As 				Label";
codigo_laydetalheslivro.mostCurrent._rot_dt_termino = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Dim rot_pg_atual As 				Label";
codigo_laydetalheslivro.mostCurrent._rot_pg_atual = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim rot_pg_total As 				Label";
codigo_laydetalheslivro.mostCurrent._rot_pg_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Dim rot_pg_meta As 			    	Label";
codigo_laydetalheslivro.mostCurrent._rot_pg_meta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private b4x_imagem As B4XImageView";
codigo_laydetalheslivro.mostCurrent._b4x_imagem = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 52;BA.debugLine="Dim seguro_cadastrou_algo As 		Boolean = False";
codigo_laydetalheslivro._seguro_cadastrou_algo = codigo_laydetalheslivro.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gradient_border(RemoteObject _cor_1,RemoteObject _cor_2,RemoteObject _corner_radius) throws Exception{
try {
		Debug.PushSubsStack("Gradient_border (codigo_laydetalheslivro) ","codigo_laydetalheslivro",9,codigo_laydetalheslivro.mostCurrent.activityBA,codigo_laydetalheslivro.mostCurrent,224);
if (RapidSub.canDelegate("gradient_border")) { return b4a.example.codigo_laydetalheslivro.remoteMe.runUserSub(false, "codigo_laydetalheslivro","gradient_border", _cor_1, _cor_2, _corner_radius);}
RemoteObject _g_p = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _cor_p = null;
Debug.locals.put("cor_1", _cor_1);
Debug.locals.put("cor_2", _cor_2);
Debug.locals.put("corner_radius", _corner_radius);
 BA.debugLineNum = 224;BA.debugLine="Sub Gradient_border(cor_1 As Int, cor_2 As Int, co";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 226;BA.debugLine="Dim g_p As GradientDrawable";
Debug.ShouldStop(2);
_g_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("g_p", _g_p);
 BA.debugLineNum = 227;BA.debugLine="Dim cor_p(2) As Int";
Debug.ShouldStop(4);
_cor_p = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("cor_p", _cor_p);
 BA.debugLineNum = 228;BA.debugLine="cor_p(0) = cor_1";
Debug.ShouldStop(8);
_cor_p.setArrayElement (_cor_1,BA.numberCast(int.class, 0));
 BA.debugLineNum = 229;BA.debugLine="cor_p(1) = cor_2";
Debug.ShouldStop(16);
_cor_p.setArrayElement (_cor_2,BA.numberCast(int.class, 1));
 BA.debugLineNum = 230;BA.debugLine="g_p.Initialize(\"TOP_BOTTOM\", cor_p)";
Debug.ShouldStop(32);
_g_p.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_cor_p));
 BA.debugLineNum = 231;BA.debugLine="g_p.CornerRadius = corner_radius";
Debug.ShouldStop(64);
_g_p.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _corner_radius));
 BA.debugLineNum = 232;BA.debugLine="Return g_p";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return _g_p;
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public dt_inicio As 	String";
codigo_laydetalheslivro._dt_inicio = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Public dt_termino As 	String";
codigo_laydetalheslivro._dt_termino = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Public pg_atual As 		String";
codigo_laydetalheslivro._pg_atual = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public pg_total As 		String";
codigo_laydetalheslivro._pg_total = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public pg_meta As 		String";
codigo_laydetalheslivro._pg_meta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public nome_usuario As	String";
codigo_laydetalheslivro._nome_usuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public nome_livro As 	String";
codigo_laydetalheslivro._nome_livro = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public tipo_leitura As 	String";
codigo_laydetalheslivro._tipo_leitura = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Public id_livro As 		String";
codigo_laydetalheslivro._id_livro = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private banco As 		ClassBancoDados";
codigo_laydetalheslivro._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}