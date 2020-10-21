package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_telacadastro_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,61);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","activity_create", _firsttime);}
RemoteObject _etiqueta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _esquerda = RemoteObject.createImmutable(0);
RemoteObject _toposcrol = RemoteObject.createImmutable(0);
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _tamanhoedits = RemoteObject.createImmutable(0);
RemoteObject _tamanholabelobrigatorio = RemoteObject.createImmutable(0);
RemoteObject _esquerdadoslabels = RemoteObject.createImmutable(0);
RemoteObject _tamanhodoslabels = RemoteObject.createImmutable(0);
RemoteObject _tl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _lm = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _pt = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"Lay_TelaCadastro\")";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_TelaCadastro")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="painelImagem.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._painelimagem.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 65;BA.debugLine="panelCabecalho.Initialize (\"\")";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._panelcabecalho.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="panelEdTituloLivro.Initialize(\"\")";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._paneledtitulolivro.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 67;BA.debugLine="panelEdAutorLivro.Initialize(\"\")";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._paneledautorlivro.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 68;BA.debugLine="panelEdPaginasOuCap.Initialize(\"\")";
Debug.ShouldStop(8);
act_telacadastro.mostCurrent._paneledpaginasoucap.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="panelMeta.Initialize(\"\")";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent._panelmeta.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 70;BA.debugLine="panelDataPrevistaFim.Initialize(\"\")";
Debug.ShouldStop(32);
act_telacadastro.mostCurrent._paneldataprevistafim.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 71;BA.debugLine="panelEdits.Initialize(\"\")";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._paneledits.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="lblDadosLivro.Initialize(\"\")";
Debug.ShouldStop(256);
act_telacadastro.mostCurrent._lbldadoslivro.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 74;BA.debugLine="lblTipoLeitura.Initialize(\"\")";
Debug.ShouldStop(512);
act_telacadastro.mostCurrent._lbltipoleitura.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="lblMeta.Initialize(\"\")";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._lblmeta.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 76;BA.debugLine="lblPrevisaoTermino.Initialize(\"\")";
Debug.ShouldStop(2048);
act_telacadastro.mostCurrent._lblprevisaotermino.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 77;BA.debugLine="lblMaximoDigitosTitulo.Initialize(\"\")";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 78;BA.debugLine="lblMaximoDigitosAutor.Initialize(\"\")";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 79;BA.debugLine="lblMaximoDigitosPagOuCap.Initialize(\"\")";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 80;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Initialize(\"\")";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="lblIncongruenciaTitulo.Initialize(\"\")";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 82;BA.debugLine="lblIncongruenciaAutor.Initialize(\"\")";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._lblincongruenciaautor.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 83;BA.debugLine="lblIncongruenciaMetaPagOuCap.Initialize(\"\")";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 84;BA.debugLine="lblIncongruenciaPagOuCap.Initialize(\"\")";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 86;BA.debugLine="btCancelar.Initialize (\"Event_btCancelar\")";
Debug.ShouldStop(2097152);
act_telacadastro.mostCurrent._btcancelar.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btCancelar")));
 BA.debugLineNum = 87;BA.debugLine="btSalvar.Initialize(\"Event_btSalvar\")";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._btsalvar.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Event_btSalvar")));
 BA.debugLineNum = 88;BA.debugLine="btAddFoto.Initialize(\"\")";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._btaddfoto.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 90;BA.debugLine="radPagina.Initialize(\"radPagina\")";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._radpagina.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("radPagina")));
 BA.debugLineNum = 91;BA.debugLine="radCapitulo.Initialize(\"radCapitulo\")";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._radcapitulo.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("radCapitulo")));
 BA.debugLineNum = 92;BA.debugLine="radPagina.Checked = True";
Debug.ShouldStop(134217728);
act_telacadastro.mostCurrent._radpagina.runMethodAndSync(true,"setChecked",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="banco.Initialize";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_initialize" /*RemoteObject*/ ,act_telacadastro.processBA);
 BA.debugLineNum = 97;BA.debugLine="scrol.Initialize( 500 )";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._scrol.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 98;BA.debugLine="Main.fotos.Initialize(\"CC\")";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._main._fotos /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("CC")));
 BA.debugLineNum = 100;BA.debugLine="Dim etiqueta As Label";
Debug.ShouldStop(8);
_etiqueta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("etiqueta", _etiqueta);
 BA.debugLineNum = 101;BA.debugLine="etiqueta.Initialize(\"\")";
Debug.ShouldStop(16);
_etiqueta.runVoidMethod ("Initialize",act_telacadastro.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 104;BA.debugLine="lblMaximoDigitosTitulo.Text = \"0/100 \"";
Debug.ShouldStop(128);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setText",BA.ObjectToCharSequence("0/100 "));
 BA.debugLineNum = 105;BA.debugLine="lblMaximoDigitosAutor.Text = \"0/100 \"";
Debug.ShouldStop(256);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setText",BA.ObjectToCharSequence("0/100 "));
 BA.debugLineNum = 106;BA.debugLine="lblMaximoDigitosPagOuCap.Text = \"0/4 \"";
Debug.ShouldStop(512);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setText",BA.ObjectToCharSequence("0/4 "));
 BA.debugLineNum = 107;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = \"0/4 \"";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence("0/4 "));
 BA.debugLineNum = 109;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 110;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 111;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Black";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 112;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.B";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 114;BA.debugLine="lblIncongruenciaAutor.TextColor = Colors.Red";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 115;BA.debugLine="lblIncongruenciaMetaPagOuCap.TextColor = Colors.R";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 116;BA.debugLine="lblIncongruenciaPagOuCap.TextColor = Colors.Red";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 117;BA.debugLine="lblIncongruenciaTitulo.TextColor = Colors.Red";
Debug.ShouldStop(1048576);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 119;BA.debugLine="panelCabecalho.Color = Colors.RGB(0,165,255)";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._panelcabecalho.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 165)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 120;BA.debugLine="Activity.AddView(panelCabecalho, 0%x, 0%y, 100%x,";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._panelcabecalho.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 122;BA.debugLine="btCancelar.Color = Colors.Transparent";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._btcancelar.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 123;BA.debugLine="btCancelar.Text = \"CANCELAR\"";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._btcancelar.runMethod(true,"setText",BA.ObjectToCharSequence("CANCELAR"));
 BA.debugLineNum = 124;BA.debugLine="btCancelar.TextSize = 19";
Debug.ShouldStop(134217728);
act_telacadastro.mostCurrent._btcancelar.runMethod(true,"setTextSize",BA.numberCast(float.class, 19));
 BA.debugLineNum = 125;BA.debugLine="btCancelar.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
act_telacadastro.mostCurrent._btcancelar.runMethod(false,"setTypeface",act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 127;BA.debugLine="btSalvar.Color = Colors.Transparent";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._btsalvar.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 128;BA.debugLine="btSalvar.Text = \"SALVAR\"";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._btsalvar.runMethod(true,"setText",BA.ObjectToCharSequence("SALVAR"));
 BA.debugLineNum = 129;BA.debugLine="btSalvar.TextSize = 19";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._btsalvar.runMethod(true,"setTextSize",BA.numberCast(float.class, 19));
 BA.debugLineNum = 130;BA.debugLine="btSalvar.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._btsalvar.runMethod(false,"setTypeface",act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 133;BA.debugLine="panelCabecalho.AddView(btCancelar, 1%x,  1%y, 35%";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent._panelcabecalho.runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._btcancelar.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 134;BA.debugLine="Dim esquerda As Int = 100%x - btCancelar.Width -";
Debug.ShouldStop(32);
_esquerda = RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA),act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getWidth"),act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getLeft")}, "--",2, 1);Debug.locals.put("esquerda", _esquerda);Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 135;BA.debugLine="panelCabecalho.AddView(btSalvar, esquerda, 1%y, 3";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._panelcabecalho.runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._btsalvar.getObject())),(Object)(_esquerda),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 138;BA.debugLine="scrol.Color = Colors.Cyan";
Debug.ShouldStop(512);
act_telacadastro.mostCurrent._scrol.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 139;BA.debugLine="scrol.Panel.Color = Colors.RGB(223,223,223)";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 223)),(Object)(BA.numberCast(int.class, 223)),(Object)(BA.numberCast(int.class, 223))));
 BA.debugLineNum = 141;BA.debugLine="Dim topoScrol As Int = panelCabecalho.Top + panel";
Debug.ShouldStop(4096);
_toposcrol = RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._panelcabecalho.runMethod(true,"getTop"),act_telacadastro.mostCurrent._panelcabecalho.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("topoScrol", _toposcrol);Debug.locals.put("topoScrol", _toposcrol);
 BA.debugLineNum = 142;BA.debugLine="Activity.AddView(scrol, 0%x, topoScrol , 100%x, 1";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._activity.runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._scrol.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(_toposcrol),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA),_toposcrol}, "-",1, 1)));
 BA.debugLineNum = 144;BA.debugLine="lblDadosLivro.Color = Colors.Transparent";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lbldadoslivro.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 145;BA.debugLine="lblDadosLivro.Text = \"Dados do Livro\"";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"setText",BA.ObjectToCharSequence("Dados do Livro"));
 BA.debugLineNum = 146;BA.debugLine="lblDadosLivro.TextColor = Colors.Black";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 147;BA.debugLine="lblDadosLivro.TextSize = 17";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 151;BA.debugLine="Dim tf As Typeface";
Debug.ShouldStop(4194304);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("tf", _tf);
 BA.debugLineNum = 152;BA.debugLine="tf = tf.CreateNew(Typeface.DEFAULT_BOLD, Typeface";
Debug.ShouldStop(8388608);
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), _tf.runMethod(false,"CreateNew",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_ITALIC"))));
 BA.debugLineNum = 153;BA.debugLine="lblDadosLivro.Typeface = tf";
Debug.ShouldStop(16777216);
act_telacadastro.mostCurrent._lbldadoslivro.runMethod(false,"setTypeface",(_tf.getObject()));
 BA.debugLineNum = 162;BA.debugLine="lblDadosLivro.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 164;BA.debugLine="scrol.Panel.AddView(lblDadosLivro, 0%x, 0%y, 100%";
Debug.ShouldStop(8);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._lbldadoslivro.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 166;BA.debugLine="painelImagem.Width = 98%x";
Debug.ShouldStop(32);
act_telacadastro.mostCurrent._painelimagem.runMethod(true,"setWidth",act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),act_telacadastro.mostCurrent.activityBA));
 BA.debugLineNum = 170;BA.debugLine="Dim esquerda As Int = (100%x - painelImagem.Width";
Debug.ShouldStop(512);
_esquerda = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA),act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("esquerda", _esquerda);Debug.locals.put("esquerda", _esquerda);
 BA.debugLineNum = 171;BA.debugLine="Dim tamanhoEdits As Int = painelImagem.Width";
Debug.ShouldStop(1024);
_tamanhoedits = act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getWidth");Debug.locals.put("tamanhoEdits", _tamanhoedits);Debug.locals.put("tamanhoEdits", _tamanhoedits);
 BA.debugLineNum = 173;BA.debugLine="scrol.Panel.AddView(painelImagem, esquerda , lblD";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._painelimagem.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lbldadoslivro.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 175;BA.debugLine="painelImagem.LoadLayout(\"Lay_Imagem\")";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._painelimagem.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_Imagem")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 177;BA.debugLine="B4XImagem.ResizeMode = \"FILL\"";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._b4ximagem.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL"));
 BA.debugLineNum = 178;BA.debugLine="B4XImagem.Load(File.DirAssets, \"livro.jpg\")";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._b4ximagem.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(act_telacadastro.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("livro.jpg")));
 BA.debugLineNum = 180;BA.debugLine="scrol.Panel.Height = painelImagem.Top + painelIma";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getTop"),act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 182;BA.debugLine="scrol.Panel.AddView(panelEdits, esquerda, painelI";
Debug.ShouldStop(2097152);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._paneledits.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getTop"),act_telacadastro.mostCurrent._painelimagem.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(_tamanhoedits),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 183;BA.debugLine="panelEdits.LoadLayout(\"Lay_edTituloLivro\")";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._paneledits.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_edTituloLivro")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 184;BA.debugLine="scrol.Panel.Height = panelEdits.Top + panelEdits.";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledits.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledits.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 187;BA.debugLine="Dim tamanhoLabelObrigatorio As Int = (100%x / 2)";
Debug.ShouldStop(67108864);
_tamanholabelobrigatorio = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA),RemoteObject.createImmutable(2)}, "/",0, 0)),_esquerda}, "-",1, 0));Debug.locals.put("tamanhoLabelObrigatorio", _tamanholabelobrigatorio);Debug.locals.put("tamanhoLabelObrigatorio", _tamanholabelobrigatorio);
 BA.debugLineNum = 188;BA.debugLine="Dim esquerdaDosLabels As Int = esquerda + tamanho";
Debug.ShouldStop(134217728);
_esquerdadoslabels = RemoteObject.solve(new RemoteObject[] {_esquerda,_tamanholabelobrigatorio}, "+",1, 1);Debug.locals.put("esquerdaDosLabels", _esquerdadoslabels);Debug.locals.put("esquerdaDosLabels", _esquerdadoslabels);
 BA.debugLineNum = 189;BA.debugLine="Dim tamanhoDosLabels As Int = panelEdits.Width -";
Debug.ShouldStop(268435456);
_tamanhodoslabels = RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledits.runMethod(true,"getWidth"),_tamanholabelobrigatorio}, "-",1, 1);Debug.locals.put("tamanhoDosLabels", _tamanhodoslabels);Debug.locals.put("tamanhoDosLabels", _tamanhodoslabels);
 BA.debugLineNum = 191;BA.debugLine="lblIncongruenciaTitulo.Text = \"Obrigatório\"";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setText",BA.ObjectToCharSequence("Obrigatório"));
 BA.debugLineNum = 192;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaTitulo, pa";
Debug.ShouldStop(-2147483648);
_addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),act_telacadastro.mostCurrent._lblincongruenciatitulo,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledits.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledits.runMethod(true,"getHeight")}, "+",1, 1),_esquerda,_tamanholabelobrigatorio);
 BA.debugLineNum = 193;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
Debug.ShouldStop(1);
_etiqueta = _addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),act_telacadastro.mostCurrent._lblmaximodigitostitulo,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledits.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledits.runMethod(true,"getHeight")}, "+",1, 1),_esquerdadoslabels,_tamanhodoslabels);Debug.locals.put("etiqueta", _etiqueta);
 BA.debugLineNum = 194;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 196;BA.debugLine="scrol.Panel.AddView(panelEdAutorLivro, esquerda,";
Debug.ShouldStop(8);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._paneledautorlivro.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(_tamanhoedits),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 197;BA.debugLine="panelEdAutorLivro.LoadLayout(\"Lay_edAutorLivro\")";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent._paneledautorlivro.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_edAutorLivro")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 199;BA.debugLine="lblIncongruenciaAutor.Text = \"Obrigatório\"";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setText",BA.ObjectToCharSequence("Obrigatório"));
 BA.debugLineNum = 200;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaAutor,pane";
Debug.ShouldStop(128);
_addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),act_telacadastro.mostCurrent._lblincongruenciaautor,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledautorlivro.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledautorlivro.runMethod(true,"getHeight")}, "+",1, 1),_esquerda,_tamanholabelobrigatorio);
 BA.debugLineNum = 201;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
Debug.ShouldStop(256);
_etiqueta = _addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),act_telacadastro.mostCurrent._lblmaximodigitosautor,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledautorlivro.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledautorlivro.runMethod(true,"getHeight")}, "+",1, 1),_esquerdadoslabels,_tamanhodoslabels);Debug.locals.put("etiqueta", _etiqueta);
 BA.debugLineNum = 202;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
Debug.ShouldStop(512);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 204;BA.debugLine="lblTipoLeitura.Color = Colors.Transparent";
Debug.ShouldStop(2048);
act_telacadastro.mostCurrent._lbltipoleitura.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 205;BA.debugLine="lblTipoLeitura.Text = \"Tipo de leitura\"";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"setText",BA.ObjectToCharSequence("Tipo de leitura"));
 BA.debugLineNum = 206;BA.debugLine="lblTipoLeitura.TextColor = Colors.Black";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 207;BA.debugLine="lblTipoLeitura.TextSize = 17";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 209;BA.debugLine="Dim tl As Typeface";
Debug.ShouldStop(65536);
_tl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("tl", _tl);
 BA.debugLineNum = 210;BA.debugLine="tl = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
Debug.ShouldStop(131072);
_tl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), act_telacadastro.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_ITALIC"))));
 BA.debugLineNum = 211;BA.debugLine="lblTipoLeitura.Typeface = tl";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lbltipoleitura.runMethod(false,"setTypeface",(_tl.getObject()));
 BA.debugLineNum = 212;BA.debugLine="lblTipoLeitura.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 214;BA.debugLine="scrol.Panel.AddView(lblTipoLeitura, 0%x, lblMaxim";
Debug.ShouldStop(2097152);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._lbltipoleitura.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 215;BA.debugLine="scrol.Panel.Height = lblTipoLeitura.Top + lblTipo";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 217;BA.debugLine="radPagina.Text = \"Por página\"";
Debug.ShouldStop(16777216);
act_telacadastro.mostCurrent._radpagina.runMethod(true,"setText",BA.ObjectToCharSequence("Por página"));
 BA.debugLineNum = 218;BA.debugLine="radPagina.TextColor = Colors.RGB(83,0,0)";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._radpagina.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 219;BA.debugLine="radPagina.TextSize = 16";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._radpagina.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 220;BA.debugLine="radPagina.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
act_telacadastro.mostCurrent._radpagina.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 222;BA.debugLine="radCapitulo.Text = \"Por capítulo\"";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"setText",BA.ObjectToCharSequence("Por capítulo"));
 BA.debugLineNum = 223;BA.debugLine="radCapitulo.TextColor = Colors.RGB(83,0,0)";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 224;BA.debugLine="radCapitulo.TextSize = 16";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 225;BA.debugLine="radCapitulo.Gravity = Gravity.CENTER";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 227;BA.debugLine="scrol.Panel.AddView(radPagina, 0%x , lblTipoLeitu";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._radpagina.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 229;BA.debugLine="scrol.Panel.AddView(radCapitulo, radPagina.Width,";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._radcapitulo.getObject())),(Object)(act_telacadastro.mostCurrent._radpagina.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lbltipoleitura.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 230;BA.debugLine="scrol.Panel.Height = radPagina.Top + radPagina.He";
Debug.ShouldStop(32);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._radpagina.runMethod(true,"getTop"),act_telacadastro.mostCurrent._radpagina.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 232;BA.debugLine="scrol.Panel.AddView(panelEdPaginasOuCap, esquerda";
Debug.ShouldStop(128);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._paneledpaginasoucap.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"getTop"),act_telacadastro.mostCurrent._radcapitulo.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(_tamanhoedits),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 233;BA.debugLine="panelEdPaginasOuCap.LoadLayout(\"Lay_edPagOuCapitu";
Debug.ShouldStop(256);
act_telacadastro.mostCurrent._paneledpaginasoucap.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_edPagOuCapitulo")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 235;BA.debugLine="lblIncongruenciaPagOuCap.Text = \"Obrigatório\"";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence("Obrigatório"));
 BA.debugLineNum = 236;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaPagOuCap,";
Debug.ShouldStop(2048);
_addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),act_telacadastro.mostCurrent._lblincongruenciapagoucap,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledpaginasoucap.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledpaginasoucap.runMethod(true,"getHeight")}, "+",1, 1),_esquerda,_tamanholabelobrigatorio);
 BA.debugLineNum = 237;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
Debug.ShouldStop(4096);
_etiqueta = _addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),act_telacadastro.mostCurrent._lblmaximodigitospagoucap,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneledpaginasoucap.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneledpaginasoucap.runMethod(true,"getHeight")}, "+",1, 1),_esquerdadoslabels,_tamanhodoslabels);Debug.locals.put("etiqueta", _etiqueta);
 BA.debugLineNum = 238;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 240;BA.debugLine="lblMeta.Color = Colors.Transparent";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lblmeta.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 241;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas / cap ler";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas / cap ler por dia?"));
 BA.debugLineNum = 242;BA.debugLine="lblMeta.TextColor = Colors.Black";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 243;BA.debugLine="lblMeta.TextSize = 17";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 245;BA.debugLine="Dim lm As Typeface";
Debug.ShouldStop(1048576);
_lm = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("lm", _lm);
 BA.debugLineNum = 246;BA.debugLine="lm = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
Debug.ShouldStop(2097152);
_lm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), act_telacadastro.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_ITALIC"))));
 BA.debugLineNum = 247;BA.debugLine="lblMeta.Typeface = lm";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._lblmeta.runMethod(false,"setTypeface",(_lm.getObject()));
 BA.debugLineNum = 248;BA.debugLine="lblMeta.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 250;BA.debugLine="scrol.Panel.AddView(lblMeta, 0%x, etiqueta.Top +";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._lblmeta.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 251;BA.debugLine="scrol.Panel.Height = lblMeta.Top + lblMeta.Height";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lblmeta.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lblmeta.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 253;BA.debugLine="scrol.Panel.AddView(panelMeta, esquerda, lblMeta.";
Debug.ShouldStop(268435456);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._panelmeta.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lblmeta.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lblmeta.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(_tamanhoedits),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 254;BA.debugLine="panelMeta.LoadLayout(\"Lay_edMetaPagCap\")";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._panelmeta.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_edMetaPagCap")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 256;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \"Obrigatório\"";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence("Obrigatório"));
 BA.debugLineNum = 257;BA.debugLine="AddLabel(Gravity.LEFT, lblIncongruenciaMetaPagOuC";
Debug.ShouldStop(1);
_addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),act_telacadastro.mostCurrent._lblincongruenciametapagoucap,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._panelmeta.runMethod(true,"getTop"),act_telacadastro.mostCurrent._panelmeta.runMethod(true,"getHeight")}, "+",1, 1),_esquerda,_tamanholabelobrigatorio);
 BA.debugLineNum = 258;BA.debugLine="etiqueta = AddLabel(Gravity.RIGHT, lblMaximoDigit";
Debug.ShouldStop(2);
_etiqueta = _addlabel((act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap,RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._panelmeta.runMethod(true,"getTop"),act_telacadastro.mostCurrent._panelmeta.runMethod(true,"getHeight")}, "+",1, 1),_esquerdadoslabels,_tamanhodoslabels);Debug.locals.put("etiqueta", _etiqueta);
 BA.debugLineNum = 259;BA.debugLine="scrol.Panel.Height = etiqueta.Top + etiqueta.Heig";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 261;BA.debugLine="lblPrevisaoTermino.Color = Colors.Transparent";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent._lblprevisaotermino.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 262;BA.debugLine="lblPrevisaoTermino.Text = \"Previsão para término\"";
Debug.ShouldStop(32);
act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"setText",BA.ObjectToCharSequence("Previsão para término"));
 BA.debugLineNum = 263;BA.debugLine="lblPrevisaoTermino.TextColor = Colors.Black";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 264;BA.debugLine="lblPrevisaoTermino.TextSize = 17";
Debug.ShouldStop(128);
act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"setTextSize",BA.numberCast(float.class, 17));
 BA.debugLineNum = 266;BA.debugLine="Dim pt As Typeface";
Debug.ShouldStop(512);
_pt = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("pt", _pt);
 BA.debugLineNum = 267;BA.debugLine="pt = Typeface.CreateNew(Typeface.DEFAULT_BOLD, Ty";
Debug.ShouldStop(1024);
_pt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), act_telacadastro.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_ITALIC"))));
 BA.debugLineNum = 268;BA.debugLine="lblPrevisaoTermino.Typeface = pt";
Debug.ShouldStop(2048);
act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(false,"setTypeface",(_pt.getObject()));
 BA.debugLineNum = 269;BA.debugLine="lblPrevisaoTermino.Gravity = Gravity.CENTER";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 271;BA.debugLine="scrol.Panel.AddView(lblPrevisaoTermino, 0%x, etiq";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._lblprevisaotermino.getObject())),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),act_telacadastro.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_etiqueta.runMethod(true,"getTop"),_etiqueta.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 272;BA.debugLine="scrol.Panel.Height = lblPrevisaoTermino.Top + lbl";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 274;BA.debugLine="panelDataPrevistaFim.Color = Colors.Blue";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._paneldataprevistafim.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 275;BA.debugLine="scrol.Panel.AddView(panelDataPrevistaFim, esquerd";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((act_telacadastro.mostCurrent._paneldataprevistafim.getObject())),(Object)(_esquerda),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"getTop"),act_telacadastro.mostCurrent._lblprevisaotermino.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1)),(Object)(act_telacadastro.mostCurrent._paneledits.runMethod(true,"getWidth")),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 276;BA.debugLine="panelDataPrevistaFim.LoadLayout(\"Lay_Previsao_ter";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._paneldataprevistafim.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lay_Previsao_termino")),act_telacadastro.mostCurrent.activityBA);
 BA.debugLineNum = 277;BA.debugLine="scrol.Panel.Height = panelDataPrevistaFim.Top + p";
Debug.ShouldStop(1048576);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent._paneldataprevistafim.runMethod(true,"getTop"),act_telacadastro.mostCurrent._paneldataprevistafim.runMethod(true,"getHeight"),act_telacadastro.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1));
 BA.debugLineNum = 279;BA.debugLine="hoje = \"Dia: \" & DateTime.Date(DateTime.Now)";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._hoje = RemoteObject.concat(RemoteObject.createImmutable("Dia: "),act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 280;BA.debugLine="lblDataPrevisao.Text = hoje";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(act_telacadastro.mostCurrent._hoje));
 BA.debugLineNum = 282;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 283;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 284;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
Debug.ShouldStop(134217728);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 285;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
Debug.ShouldStop(268435456);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 286;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 288;BA.debugLine="lblIncongruenciaAutor.Visible = False";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 289;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 290;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 291;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,316);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 316;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,303);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","activity_resume");}
 BA.debugLineNum = 303;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="btCancelar.Top = -5%y";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._btcancelar.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA).<Integer>get().intValue())));
 BA.debugLineNum = 305;BA.debugLine="btCancelar.TextColor = Colors.Transparent";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._btcancelar.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 306;BA.debugLine="btCancelar.SetLayoutAnimated(1000, 1%x, 1%y, 35%x";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._btcancelar.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),act_telacadastro.mostCurrent.activityBA)),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 307;BA.debugLine="btCancelar.SetTextColorAnimated(1500, Colors.RGB(";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._btcancelar.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1500)),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 213)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 309;BA.debugLine="btSalvar.Top = -5%y";
Debug.ShouldStop(1048576);
act_telacadastro.mostCurrent._btsalvar.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_telacadastro.mostCurrent.activityBA).<Integer>get().intValue())));
 BA.debugLineNum = 310;BA.debugLine="btSalvar.TextColor = Colors.Transparent";
Debug.ShouldStop(2097152);
act_telacadastro.mostCurrent._btsalvar.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 311;BA.debugLine="btSalvar.SetLayoutAnimated(1000, 100%x - btSalvar";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._btsalvar.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(RemoteObject.solve(new RemoteObject[] {act_telacadastro.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_telacadastro.mostCurrent.activityBA),act_telacadastro.mostCurrent._btsalvar.runMethod(true,"getWidth"),act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getLeft")}, "--",2, 1)),(Object)(act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getTop")),(Object)(act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getWidth")),(Object)(act_telacadastro.mostCurrent._btcancelar.runMethod(true,"getHeight")));
 BA.debugLineNum = 312;BA.debugLine="btSalvar.SetTextColorAnimated(1500, Colors.RGB(21";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._btsalvar.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1500)),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 213)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 4)))));
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
public static RemoteObject  _addlabel(RemoteObject _gravidade,RemoteObject _etiqueta,RemoteObject _topo,RemoteObject _esquerda,RemoteObject _tamanho) throws Exception{
try {
		Debug.PushSubsStack("AddLabel (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,294);
if (RapidSub.canDelegate("addlabel")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","addlabel", _gravidade, _etiqueta, _topo, _esquerda, _tamanho);}
Debug.locals.put("gravidade", _gravidade);
Debug.locals.put("etiqueta", _etiqueta);
Debug.locals.put("topo", _topo);
Debug.locals.put("esquerda", _esquerda);
Debug.locals.put("tamanho", _tamanho);
 BA.debugLineNum = 294;BA.debugLine="Sub AddLabel(gravidade As Object, etiqueta As Labe";
Debug.ShouldStop(32);
 BA.debugLineNum = 296;BA.debugLine="etiqueta.Gravity = Bit.Or(gravidade, Gravity.CENT";
Debug.ShouldStop(128);
_etiqueta.runMethod(true,"setGravity",act_telacadastro.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, _gravidade)),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 297;BA.debugLine="etiqueta.Color = Colors.Transparent";
Debug.ShouldStop(256);
_etiqueta.runVoidMethod ("setColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 299;BA.debugLine="scrol.Panel.AddView(etiqueta, esquerda, topo, tam";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._scrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_etiqueta.getObject())),(Object)(_esquerda),(Object)(_topo),(Object)(_tamanho),(Object)(act_telacadastro.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),act_telacadastro.mostCurrent.activityBA)));
 BA.debugLineNum = 300;BA.debugLine="Return etiqueta";
Debug.ShouldStop(2048);
if (true) return _etiqueta;
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btaddimagem_click() throws Exception{
try {
		Debug.PushSubsStack("btAddImagem_Click (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,406);
if (RapidSub.canDelegate("btaddimagem_click")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","btaddimagem_click");}
 BA.debugLineNum = 406;BA.debugLine="Sub btAddImagem_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 408;BA.debugLine="Main.fotos.Show(\"image/*\", \"Choose image\")";
Debug.ShouldStop(8388608);
act_telacadastro.mostCurrent._main._fotos /*RemoteObject*/ .runVoidMethod ("Show",act_telacadastro.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Choose image")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_telacadastro.processBA, e4.toString()); BA.debugLineNum = 410;BA.debugLine="ToastMessageShow(\"Falha!\",True)";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Falha!")),(Object)(act_telacadastro.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CC_Result (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,414);
if (RapidSub.canDelegate("cc_result")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","cc_result", _success, _dir, _filename);}
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 414;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 415;BA.debugLine="If Success Then";
Debug.ShouldStop(1073741824);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 416;BA.debugLine="B4XImagem.ResizeMode = \"FIT\"";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._b4ximagem.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FIT"));
 BA.debugLineNum = 418;BA.debugLine="B4XImagem.Load(Dir, FileName)";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._b4ximagem.runClassMethod (b4a.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 }else {
 BA.debugLineNum = 421;BA.debugLine="ToastMessageShow(\"Nenhuma foto escolhida\",True)";
Debug.ShouldStop(16);
act_telacadastro.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nenhuma foto escolhida")),(Object)(act_telacadastro.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatautorlivro_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatAutorLivro_FocusChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,573);
if (RapidSub.canDelegate("edb4xfloatautorlivro_focuschanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatautorlivro_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 573;BA.debugLine="Sub edB4XFloatAutorLivro_FocusChanged (HasFocus As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(536870912);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 575;BA.debugLine="lblMaximoDigitosAutor.Visible = True";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 577;BA.debugLine="lblMaximoDigitosAutor.Visible = False";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatautorlivro_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatAutorLivro_TextChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,441);
if (RapidSub.canDelegate("edb4xfloatautorlivro_textchanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatautorlivro_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 441;BA.debugLine="Sub edB4XFloatAutorLivro_TextChanged (Old As Strin";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 442;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 443;BA.debugLine="edB4XFloatAutorLivro.Text = edB4XFloatAutorLivro";
Debug.ShouldStop(67108864);
act_telacadastro.mostCurrent._edb4xfloatautorlivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,act_telacadastro.mostCurrent._edb4xfloatautorlivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 446;BA.debugLine="If New.Length > 100 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 447;BA.debugLine="lblIncongruenciaAutor.Visible = True";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 448;BA.debugLine="lblIncongruenciaAutor.Text = \" Texto inválido\"";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setText",BA.ObjectToCharSequence(" Texto inválido"));
 BA.debugLineNum = 449;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Red";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 451;BA.debugLine="lblIncongruenciaAutor.Visible = False";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._lblincongruenciaautor.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 452;BA.debugLine="lblMaximoDigitosAutor.TextColor = Colors.Black";
Debug.ShouldStop(8);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 454;BA.debugLine="lblMaximoDigitosAutor.Text = New.Length & \"/100 \"";
Debug.ShouldStop(32);
act_telacadastro.mostCurrent._lblmaximodigitosautor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_new.runMethod(true,"length"),RemoteObject.createImmutable("/100 "))));
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatmetapagcap_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatMetaPagCap_FocusChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,589);
if (RapidSub.canDelegate("edb4xfloatmetapagcap_focuschanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatmetapagcap_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 589;BA.debugLine="Sub edB4XFloatMetaPagCap_FocusChanged (HasFocus As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 590;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(8192);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 591;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = True";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 593;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Visible = False";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatmetapagcap_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatMetaPagCap_TextChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,475);
if (RapidSub.canDelegate("edb4xfloatmetapagcap_textchanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatmetapagcap_textchanged", _old, _new);}
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _quantpag = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 475;BA.debugLine="Sub edB4XFloatMetaPagCap_TextChanged (Old As Strin";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 477;BA.debugLine="lblMaximoDigitosMetaPagOuCap.Text = New.Length &";
Debug.ShouldStop(268435456);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_new.runMethod(true,"length"),RemoteObject.createImmutable("/4 "))));
 BA.debugLineNum = 479;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",act_telacadastro.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 481;BA.debugLine="Dim meta As Int = New";
Debug.ShouldStop(1);
_meta = BA.numberCast(int.class, _new);Debug.locals.put("meta", _meta);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 482;BA.debugLine="Dim total As Int";
Debug.ShouldStop(2);
_total = RemoteObject.createImmutable(0);Debug.locals.put("total", _total);
 BA.debugLineNum = 483;BA.debugLine="Dim quantPag As Int";
Debug.ShouldStop(4);
_quantpag = RemoteObject.createImmutable(0);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 485;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",act_telacadastro.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 487;BA.debugLine="quantPag = edB4XFloatPagOuCap.Text";
Debug.ShouldStop(64);
_quantpag = BA.numberCast(int.class, act_telacadastro.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 489;BA.debugLine="total = quantPag  / meta";
Debug.ShouldStop(256);
_total = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_quantpag,_meta}, "/",0, 0));Debug.locals.put("total", _total);
 BA.debugLineNum = 491;BA.debugLine="lblQuantidadeDias.Visible = True";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 492;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
Debug.ShouldStop(2048);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total de dias: "),_total)));
 BA.debugLineNum = 494;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
Debug.ShouldStop(8192);
_data = act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_total))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 496;BA.debugLine="dataPrevistaFinal = data";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._dataprevistafinal = _data;
 BA.debugLineNum = 498;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
Debug.ShouldStop(131072);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Dia: "),_data)));
 }else {
 BA.debugLineNum = 500;BA.debugLine="lblDataPrevisao.Text = hoje";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(act_telacadastro.mostCurrent._hoje));
 BA.debugLineNum = 501;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(1048576);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 505;BA.debugLine="lblDataPrevisao.Text = hoje";
Debug.ShouldStop(16777216);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(act_telacadastro.mostCurrent._hoje));
 BA.debugLineNum = 506;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 509;BA.debugLine="If New.Length > 4 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 510;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = True";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 511;BA.debugLine="lblIncongruenciaMetaPagOuCap.Text = \" Texto invá";
Debug.ShouldStop(1073741824);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence(" Texto inválido"));
 BA.debugLineNum = 512;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 514;BA.debugLine="lblIncongruenciaMetaPagOuCap.Visible = False";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._lblincongruenciametapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 515;BA.debugLine="lblMaximoDigitosMetaPagOuCap.TextColor = Colors.";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 517;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatnomelivro_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatNomeLivro_FocusChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,565);
if (RapidSub.canDelegate("edb4xfloatnomelivro_focuschanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatnomelivro_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 565;BA.debugLine="Sub edB4XFloatNomeLivro_FocusChanged (HasFocus As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(2097152);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 567;BA.debugLine="lblMaximoDigitosTitulo.Visible = True";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 569;BA.debugLine="lblMaximoDigitosTitulo.Visible = False";
Debug.ShouldStop(16777216);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatnomelivro_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatNomeLivro_TextChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,457);
if (RapidSub.canDelegate("edb4xfloatnomelivro_textchanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatnomelivro_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 457;BA.debugLine="Sub edB4XFloatNomeLivro_TextChanged (Old As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 458;BA.debugLine="If New.IndexOf(\"'\") >= 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_new.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("'"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 459;BA.debugLine="edB4XFloatNomeLivro.Text = edB4XFloatNomeLivro.T";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._edb4xfloatnomelivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,act_telacadastro.mostCurrent._edb4xfloatnomelivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 462;BA.debugLine="If New.Length > 100 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 463;BA.debugLine="lblIncongruenciaTitulo.Visible = True";
Debug.ShouldStop(16384);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 464;BA.debugLine="lblIncongruenciaTitulo.Text = \" Texto inválido\"";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setText",BA.ObjectToCharSequence(" Texto inválido"));
 BA.debugLineNum = 465;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Red";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 467;BA.debugLine="lblIncongruenciaTitulo.Visible = False";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lblincongruenciatitulo.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 468;BA.debugLine="lblMaximoDigitosTitulo.TextColor = Colors.Black";
Debug.ShouldStop(524288);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 471;BA.debugLine="lblMaximoDigitosTitulo.Text = New.Length & \"/100";
Debug.ShouldStop(4194304);
act_telacadastro.mostCurrent._lblmaximodigitostitulo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_new.runMethod(true,"length"),RemoteObject.createImmutable("/100 "))));
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatpagoucap_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatPagOuCap_FocusChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,581);
if (RapidSub.canDelegate("edb4xfloatpagoucap_focuschanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatpagoucap_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 581;BA.debugLine="Sub edB4XFloatPagOuCap_FocusChanged (HasFocus As B";
Debug.ShouldStop(16);
 BA.debugLineNum = 582;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(32);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 583;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = True";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 585;BA.debugLine="lblMaximoDigitosPagOuCap.Visible = False";
Debug.ShouldStop(256);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 587;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edb4xfloatpagoucap_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edB4XFloatPagOuCap_TextChanged (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,519);
if (RapidSub.canDelegate("edb4xfloatpagoucap_textchanged")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","edb4xfloatpagoucap_textchanged", _old, _new);}
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _quantpag = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 519;BA.debugLine="Sub edB4XFloatPagOuCap_TextChanged (Old As String,";
Debug.ShouldStop(64);
 BA.debugLineNum = 521;BA.debugLine="lblMaximoDigitosPagOuCap.Text = New.Length & \"/4";
Debug.ShouldStop(256);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_new.runMethod(true,"length"),RemoteObject.createImmutable("/4 "))));
 BA.debugLineNum = 523;BA.debugLine="If edB4XFloatMetaPagCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",act_telacadastro.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 525;BA.debugLine="Dim meta As Int";
Debug.ShouldStop(4096);
_meta = RemoteObject.createImmutable(0);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 526;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
Debug.ShouldStop(8192);
_meta = BA.numberCast(int.class, act_telacadastro.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 528;BA.debugLine="Dim total As Int";
Debug.ShouldStop(32768);
_total = RemoteObject.createImmutable(0);Debug.locals.put("total", _total);
 BA.debugLineNum = 529;BA.debugLine="Dim quantPag As Int";
Debug.ShouldStop(65536);
_quantpag = RemoteObject.createImmutable(0);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 531;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",act_telacadastro.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 533;BA.debugLine="quantPag = New";
Debug.ShouldStop(1048576);
_quantpag = BA.numberCast(int.class, _new);Debug.locals.put("quantPag", _quantpag);
 BA.debugLineNum = 535;BA.debugLine="total = quantPag  / meta";
Debug.ShouldStop(4194304);
_total = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_quantpag,_meta}, "/",0, 0));Debug.locals.put("total", _total);
 BA.debugLineNum = 537;BA.debugLine="lblQuantidadeDias.Visible = True";
Debug.ShouldStop(16777216);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 538;BA.debugLine="lblQuantidadeDias.Text = \"Total de dias: \" & to";
Debug.ShouldStop(33554432);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total de dias: "),_total)));
 BA.debugLineNum = 540;BA.debugLine="Dim data As String = DateTime.Date( DateTime.Ad";
Debug.ShouldStop(134217728);
_data = act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_total))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 542;BA.debugLine="dataPrevistaFinal = data";
Debug.ShouldStop(536870912);
act_telacadastro.mostCurrent._dataprevistafinal = _data;
 BA.debugLineNum = 544;BA.debugLine="lblDataPrevisao.Text = \"Dia: \" & data";
Debug.ShouldStop(-2147483648);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Dia: "),_data)));
 }else {
 BA.debugLineNum = 546;BA.debugLine="lblDataPrevisao.Text = hoje";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(act_telacadastro.mostCurrent._hoje));
 BA.debugLineNum = 547;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 551;BA.debugLine="lblDataPrevisao.Text = hoje";
Debug.ShouldStop(64);
act_telacadastro.mostCurrent._lbldataprevisao.runMethod(true,"setText",BA.ObjectToCharSequence(act_telacadastro.mostCurrent._hoje));
 BA.debugLineNum = 552;BA.debugLine="lblQuantidadeDias.Visible = False";
Debug.ShouldStop(128);
act_telacadastro.mostCurrent._lblquantidadedias.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 555;BA.debugLine="If New.Length > 4 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 556;BA.debugLine="lblIncongruenciaPagOuCap.Visible = True";
Debug.ShouldStop(2048);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 557;BA.debugLine="lblIncongruenciaPagOuCap.Text = \" Texto inválido";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setText",BA.ObjectToCharSequence(" Texto inválido"));
 BA.debugLineNum = 558;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Red";
Debug.ShouldStop(8192);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 560;BA.debugLine="lblIncongruenciaPagOuCap.Visible = False";
Debug.ShouldStop(32768);
act_telacadastro.mostCurrent._lblincongruenciapagoucap.runMethod(true,"setVisible",act_telacadastro.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 561;BA.debugLine="lblMaximoDigitosPagOuCap.TextColor = Colors.Blac";
Debug.ShouldStop(65536);
act_telacadastro.mostCurrent._lblmaximodigitospagoucap.runMethod(true,"setTextColor",act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _event_btcancelar_click() throws Exception{
try {
		Debug.PushSubsStack("Event_btCancelar_Click (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,320);
if (RapidSub.canDelegate("event_btcancelar_click")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","event_btcancelar_click");}
 BA.debugLineNum = 320;BA.debugLine="Sub Event_btCancelar_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="btCancelar.SetColorAnimated(100, Colors.RGB(82,18";
Debug.ShouldStop(1);
act_telacadastro.mostCurrent._btcancelar.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 82)),(Object)(BA.numberCast(int.class, 183)),(Object)(BA.numberCast(int.class, 239)))),(Object)(act_telacadastro.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 322;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(2);
act_telacadastro.mostCurrent.__c.runVoidMethod ("StartActivity",act_telacadastro.processBA,(Object)((act_telacadastro.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 323;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
act_telacadastro.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _event_btsalvar_click() throws Exception{
try {
		Debug.PushSubsStack("Event_btSalvar_Click (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,326);
if (RapidSub.canDelegate("event_btsalvar_click")) { b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","event_btsalvar_click"); return;}
ResumableSub_Event_btSalvar_Click rsub = new ResumableSub_Event_btSalvar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Event_btSalvar_Click extends BA.ResumableSub {
public ResumableSub_Event_btSalvar_Click(b4a.example.act_telacadastro parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.act_telacadastro parent;
RemoteObject _pag_ou_cap = RemoteObject.createImmutable("");
RemoteObject _meta = RemoteObject.createImmutable(0);
RemoteObject _quantidade_pag_cap = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.createImmutable("");
RemoteObject _datainicial = RemoteObject.createImmutable("");
RemoteObject _tipoleitura = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Event_btSalvar_Click (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,326);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 327;BA.debugLine="btSalvar.SetColorAnimated(100, Colors.RGB(82,183,";
Debug.ShouldStop(64);
parent.mostCurrent._btsalvar.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 82)),(Object)(BA.numberCast(int.class, 183)),(Object)(BA.numberCast(int.class, 239)))),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 329;BA.debugLine="Dim pag_ou_cap As String";
Debug.ShouldStop(256);
_pag_ou_cap = RemoteObject.createImmutable("");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
 BA.debugLineNum = 331;BA.debugLine="If edB4XFloatNomeLivro.Text.Trim = \"\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edb4xfloatnomelivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 334;BA.debugLine="Else If edB4XFloatAutorLivro.Text.Trim = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edb4xfloatautorlivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 46;
 BA.debugLineNum = 332;BA.debugLine="MsgboxAsync(\"Opa! qual o título do livro?\",\"Calm";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual o título do livro?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),act_telacadastro.processBA);
 if (true) break;

case 5:
//C
this.state = 46;
 BA.debugLineNum = 335;BA.debugLine="MsgboxAsync(\"Opa! qual o nome do autor do livro?";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual o nome do autor do livro?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),act_telacadastro.processBA);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 339;BA.debugLine="pag_ou_cap = \"Quantos capítulos\"";
Debug.ShouldStop(262144);
_pag_ou_cap = BA.ObjectToString("Quantos capítulos");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
 BA.debugLineNum = 340;BA.debugLine="If radPagina.Checked Then pag_ou_cap = \"Quantas";
Debug.ShouldStop(524288);
if (true) break;

case 8:
//if
this.state = 13;
if (parent.mostCurrent._radpagina.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_pag_ou_cap = BA.ObjectToString("Quantas páginas");Debug.locals.put("pag_ou_cap", _pag_ou_cap);
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 342;BA.debugLine="If edB4XFloatPagOuCap.Text.Trim = \"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 14:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 16;
}else 
{ BA.debugLineNum = 346;BA.debugLine="else If edB4XFloatMetaPagCap.Text.Trim = \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 18;
}else {
this.state = 20;
}}
if (true) break;

case 16:
//C
this.state = 45;
 BA.debugLineNum = 343;BA.debugLine="MsgboxAsync(\"Opa! \" & pag_ou_cap & \" o livro te";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Opa! "),_pag_ou_cap,RemoteObject.createImmutable(" o livro tem?")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),act_telacadastro.processBA);
 if (true) break;

case 18:
//C
this.state = 45;
 BA.debugLineNum = 348;BA.debugLine="MsgboxAsync(\"Opa! qual a sua meta diária?\",\"Cal";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Opa! qual a sua meta diária?")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Calma..."))),act_telacadastro.processBA);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 351;BA.debugLine="Dim meta, quantidade_pag_cap As Int";
Debug.ShouldStop(1073741824);
_meta = RemoteObject.createImmutable(0);Debug.locals.put("meta", _meta);
_quantidade_pag_cap = RemoteObject.createImmutable(0);Debug.locals.put("quantidade_pag_cap", _quantidade_pag_cap);
 BA.debugLineNum = 353;BA.debugLine="meta = edB4XFloatMetaPagCap.Text";
Debug.ShouldStop(1);
_meta = BA.numberCast(int.class, parent.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 354;BA.debugLine="quantidade_pag_cap = edB4XFloatPagOuCap.Text";
Debug.ShouldStop(2);
_quantidade_pag_cap = BA.numberCast(int.class, parent.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("quantidade_pag_cap", _quantidade_pag_cap);
 BA.debugLineNum = 356;BA.debugLine="If meta > quantidade_pag_cap Then";
Debug.ShouldStop(8);
if (true) break;

case 21:
//if
this.state = 44;
if (RemoteObject.solveBoolean(">",_meta,BA.numberCast(double.class, _quantidade_pag_cap))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 44;
 BA.debugLineNum = 357;BA.debugLine="ToastMessageShow(\"Informações incoerentes\",Tru";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Informações incoerentes")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 360;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 26:
//try
this.state = 43;
this.catchState = 42;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 42;
 BA.debugLineNum = 361;BA.debugLine="Dim cmd, dataInicial, tipoLeitura As String";
Debug.ShouldStop(256);
_cmd = RemoteObject.createImmutable("");Debug.locals.put("cmd", _cmd);
_datainicial = RemoteObject.createImmutable("");Debug.locals.put("dataInicial", _datainicial);
_tipoleitura = RemoteObject.createImmutable("");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 363;BA.debugLine="tipoLeitura = \"páginas\"";
Debug.ShouldStop(1024);
_tipoleitura = BA.ObjectToString("páginas");Debug.locals.put("tipoLeitura", _tipoleitura);
 BA.debugLineNum = 364;BA.debugLine="If radCapitulo.Checked Then tipoLeitura = \"ca";
Debug.ShouldStop(2048);
if (true) break;

case 29:
//if
this.state = 34;
if (parent.mostCurrent._radcapitulo.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_tipoleitura = BA.ObjectToString("capítulos");Debug.locals.put("tipoLeitura", _tipoleitura);
if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 366;BA.debugLine="dataInicial = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(8192);
_datainicial = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("dataInicial", _datainicial);
 BA.debugLineNum = 368;BA.debugLine="cmd = \"exec sp_cad_livro_leitura '\" & edB4XFl";
Debug.ShouldStop(32768);
_cmd = RemoteObject.concat(RemoteObject.createImmutable("exec sp_cad_livro_leitura '"),parent.mostCurrent._edb4xfloatnomelivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable("', '"),parent.mostCurrent._edb4xfloatautorlivro.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable("', '"),parent.mostCurrent._main._id_do_usuario /*RemoteObject*/ ,RemoteObject.createImmutable("', '"),_datainicial,RemoteObject.createImmutable("', '"),_tipoleitura,RemoteObject.createImmutable("', '"),parent.mostCurrent._edb4xfloatpagoucap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable("', '"),parent.mostCurrent._dataprevistafinal,RemoteObject.createImmutable("', '"),parent.mostCurrent._edb4xfloatmetapagcap.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable("'"));Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 377;BA.debugLine="Wait For (banco.Insert_Consulta(cmd)) Complet";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_telacadastro.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_telacadastro", "event_btsalvar_click"), parent.mostCurrent._banco.runClassMethod (b4a.example.classbancodados.class, "_insert_consulta" /*RemoteObject*/ ,(Object)(_cmd)));
this.state = 47;
return;
case 47:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 379;BA.debugLine="Result.NextRow";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("NextRow");
 BA.debugLineNum = 381;BA.debugLine="If Result.GetString(\"RESULTADO\") = 1 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 35:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(1))) { 
this.state = 37;
}else 
{ BA.debugLineNum = 389;BA.debugLine="else if Result.GetString(\"RESULTADO\") = 0 The";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("RESULTADO"))),BA.NumberToString(0))) { 
this.state = 39;
}}
if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 383;BA.debugLine="Main.CadastrouAlgo = True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 384;BA.debugLine="ToastMessageShow(Result.GetString(\"MENSAGEM\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 385;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_telacadastro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_telacadastro", "event_btsalvar_click"),BA.numberCast(int.class, 100));
this.state = 48;
return;
case 48:
//C
this.state = 40;
;
 BA.debugLineNum = 386;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_telacadastro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 387;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 391;BA.debugLine="Main.CadastrouAlgo = False";
Debug.ShouldStop(64);
parent.mostCurrent._main._cadastroualgo /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 392;BA.debugLine="MsgboxAsync(Result.GetString(\"MENSAGEM\"), \"O";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(_result.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MENSAGEM"))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ops!!"))),act_telacadastro.processBA);
 BA.debugLineNum = 393;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_telacadastro.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_telacadastro", "event_btsalvar_click"),BA.numberCast(int.class, 1000));
this.state = 49;
return;
case 49:
//C
this.state = 40;
;
 BA.debugLineNum = 394;BA.debugLine="StartActivity(CodigoLayLeituras)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",act_telacadastro.processBA,(Object)((parent.mostCurrent._codigolayleituras.getObject())));
 BA.debugLineNum = 395;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 40:
//C
this.state = 43;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 0;
 BA.debugLineNum = 399;BA.debugLine="MsgboxAsync(\"Problemas ao tentar estabelecer";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Problemas ao tentar estabelecer a conexão. "),parent.mostCurrent.__c.runMethod(false,"LastException",act_telacadastro.mostCurrent.activityBA)))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Atenção"))),act_telacadastro.processBA);
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 0;
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_telacadastro.processBA, e0.toString());}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim painelImagem As			 			Panel";
act_telacadastro.mostCurrent._painelimagem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim panelCabecalho As 					Panel";
act_telacadastro.mostCurrent._panelcabecalho = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim panelEdAutorLivro As 				Panel";
act_telacadastro.mostCurrent._paneledautorlivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim panelMeta As 						Panel";
act_telacadastro.mostCurrent._panelmeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Dim panelDataPrevistaFim As 			Panel";
act_telacadastro.mostCurrent._paneldataprevistafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim panelEdTituloLivro As 				Panel";
act_telacadastro.mostCurrent._paneledtitulolivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim panelEdPaginasOuCap As 				Panel";
act_telacadastro.mostCurrent._paneledpaginasoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim panelEdits As 						Panel";
act_telacadastro.mostCurrent._paneledits = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim lblDadosLivro As 					Label";
act_telacadastro.mostCurrent._lbldadoslivro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim lblTipoLeitura As 					Label";
act_telacadastro.mostCurrent._lbltipoleitura = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim lblMeta As 							Label";
act_telacadastro.mostCurrent._lblmeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim lblPrevisaoTermino As 				Label";
act_telacadastro.mostCurrent._lblprevisaotermino = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim lblMaximoDigitosTitulo As 			Label";
act_telacadastro.mostCurrent._lblmaximodigitostitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim lblMaximoDigitosAutor As 			Label";
act_telacadastro.mostCurrent._lblmaximodigitosautor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim lblMaximoDigitosPagOuCap As			Label";
act_telacadastro.mostCurrent._lblmaximodigitospagoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim lblMaximoDigitosMetaPagOuCap  As	Label";
act_telacadastro.mostCurrent._lblmaximodigitosmetapagoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim lblIncongruenciaTitulo As			Label";
act_telacadastro.mostCurrent._lblincongruenciatitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim lblIncongruenciaAutor As			Label";
act_telacadastro.mostCurrent._lblincongruenciaautor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim lblIncongruenciaMetaPagOuCap As		Label";
act_telacadastro.mostCurrent._lblincongruenciametapagoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim lblIncongruenciaPagOuCap As			Label";
act_telacadastro.mostCurrent._lblincongruenciapagoucap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim btCancelar As 						Button";
act_telacadastro.mostCurrent._btcancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim btSalvar As 						Button";
act_telacadastro.mostCurrent._btsalvar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim btAddFoto As 						Button";
act_telacadastro.mostCurrent._btaddfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim radPagina As 						RadioButton";
act_telacadastro.mostCurrent._radpagina = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim radCapitulo As 						RadioButton";
act_telacadastro.mostCurrent._radcapitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim scrol As 							ScrollView";
act_telacadastro.mostCurrent._scrol = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private B4XImagem As 					B4XImageView";
act_telacadastro.mostCurrent._b4ximagem = RemoteObject.createNew ("b4a.example.b4ximageview");
 //BA.debugLineNum = 43;BA.debugLine="Private edB4XFloatNomeLivro As 			B4XFloatTextFie";
act_telacadastro.mostCurrent._edb4xfloatnomelivro = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 45;BA.debugLine="Dim hoje As String";
act_telacadastro.mostCurrent._hoje = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyy\"";
act_telacadastro.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyy"));
 //BA.debugLineNum = 50;BA.debugLine="Private lblDataPrevisao As Label";
act_telacadastro.mostCurrent._lbldataprevisao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private lblQuantidadeDias As Label";
act_telacadastro.mostCurrent._lblquantidadedias = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private edB4XFloatPagOuCap As B4XFloatTextField";
act_telacadastro.mostCurrent._edb4xfloatpagoucap = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 53;BA.debugLine="Private edB4XFloatAutorLivro As B4XFloatTextField";
act_telacadastro.mostCurrent._edb4xfloatautorlivro = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 54;BA.debugLine="Private edB4XFloatMetaPagCap As B4XFloatTextField";
act_telacadastro.mostCurrent._edb4xfloatmetapagcap = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 55;BA.debugLine="Private dataPrevistaFinal As String";
act_telacadastro.mostCurrent._dataprevistafinal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Dim banco As ClassBancoDados";
act_telacadastro.mostCurrent._banco = RemoteObject.createNew ("b4a.example.classbancodados");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radcapitulo_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radCapitulo_CheckedChange (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,433);
if (RapidSub.canDelegate("radcapitulo_checkedchange")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","radcapitulo_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 433;BA.debugLine="Sub radCapitulo_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="If Checked Then";
Debug.ShouldStop(131072);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 435;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
Debug.ShouldStop(262144);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 }else {
 BA.debugLineNum = 437;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
Debug.ShouldStop(1048576);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 };
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radpagina_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radPagina_CheckedChange (act_telacadastro) ","act_telacadastro",8,act_telacadastro.mostCurrent.activityBA,act_telacadastro.mostCurrent,425);
if (RapidSub.canDelegate("radpagina_checkedchange")) { return b4a.example.act_telacadastro.remoteMe.runUserSub(false, "act_telacadastro","radpagina_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 425;BA.debugLine="Sub radPagina_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="If Checked Then";
Debug.ShouldStop(512);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 427;BA.debugLine="lblMeta.Text = \"Meta - Quantas páginas ler por d";
Debug.ShouldStop(1024);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantas páginas ler por dia?"));
 }else {
 BA.debugLineNum = 429;BA.debugLine="lblMeta.Text = \"Meta - Quantos capítulos ler por";
Debug.ShouldStop(4096);
act_telacadastro.mostCurrent._lblmeta.runMethod(true,"setText",BA.ObjectToCharSequence("Meta - Quantos capítulos ler por dia?"));
 };
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}