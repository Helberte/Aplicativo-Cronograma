package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_anotar{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Lay_Anotar/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="panel_cabecalho.Top = 2%y"[Lay_Anotar/General script]
views.get("panel_cabecalho").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="panel_cabecalho.Width = 95%x"[Lay_Anotar/General script]
views.get("panel_cabecalho").vw.setWidth((int)((95d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="panel_cabecalho.Left = (100%x - panel_cabecalho.Width) / 2"[Lay_Anotar/General script]
views.get("panel_cabecalho").vw.setLeft((int)(((100d / 100 * width)-(views.get("panel_cabecalho").vw.getWidth()))/2d));
//BA.debugLineNum = 7;BA.debugLine="panel_cabecalho.Height = 20%y"[Lay_Anotar/General script]
views.get("panel_cabecalho").vw.setHeight((int)((20d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="lblTitulo.Top = 2.5%y"[Lay_Anotar/General script]
views.get("lbltitulo").vw.setTop((int)((2.5d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="lblTitulo.Width = panel_cabecalho.Width"[Lay_Anotar/General script]
views.get("lbltitulo").vw.setWidth((int)((views.get("panel_cabecalho").vw.getWidth())));
//BA.debugLineNum = 11;BA.debugLine="lblTitulo.Left = 0%x"[Lay_Anotar/General script]
views.get("lbltitulo").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="lblTitulo.Height = 6%y"[Lay_Anotar/General script]
views.get("lbltitulo").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 14;BA.debugLine="lblAnotacaoRefPag.Width = (lblTitulo.Width / 2) + 11%x"[Lay_Anotar/General script]
views.get("lblanotacaorefpag").vw.setWidth((int)(((views.get("lbltitulo").vw.getWidth())/2d)+(11d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="lblAnotacaoRefPag.Left = 2%x"[Lay_Anotar/General script]
views.get("lblanotacaorefpag").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 16;BA.debugLine="lblAnotacaoRefPag.Top = lblTitulo.Top + lblTitulo.Height"[Lay_Anotar/General script]
views.get("lblanotacaorefpag").vw.setTop((int)((views.get("lbltitulo").vw.getTop())+(views.get("lbltitulo").vw.getHeight())));
//BA.debugLineNum = 17;BA.debugLine="lblAnotacaoRefPag.Height = 5%y"[Lay_Anotar/General script]
views.get("lblanotacaorefpag").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 19;BA.debugLine="B4XComboBox1.Top = lblAnotacaoRefPag.Top"[Lay_Anotar/General script]
views.get("b4xcombobox1").vw.setTop((int)((views.get("lblanotacaorefpag").vw.getTop())));
//BA.debugLineNum = 20;BA.debugLine="B4XComboBox1.Left = lblAnotacaoRefPag.Left + lblAnotacaoRefPag.Width"[Lay_Anotar/General script]
views.get("b4xcombobox1").vw.setLeft((int)((views.get("lblanotacaorefpag").vw.getLeft())+(views.get("lblanotacaorefpag").vw.getWidth())));
//BA.debugLineNum = 21;BA.debugLine="B4XComboBox1.Height = lblAnotacaoRefPag.Height"[Lay_Anotar/General script]
views.get("b4xcombobox1").vw.setHeight((int)((views.get("lblanotacaorefpag").vw.getHeight())));
//BA.debugLineNum = 22;BA.debugLine="B4XComboBox1.Width = panel_cabecalho.Width - lblAnotacaoRefPag.Width - 8%x"[Lay_Anotar/General script]
views.get("b4xcombobox1").vw.setWidth((int)((views.get("panel_cabecalho").vw.getWidth())-(views.get("lblanotacaorefpag").vw.getWidth())-(8d / 100 * width)));
//BA.debugLineNum = 24;BA.debugLine="lblOpcional.Left = lblAnotacaoRefPag.Left"[Lay_Anotar/General script]
views.get("lblopcional").vw.setLeft((int)((views.get("lblanotacaorefpag").vw.getLeft())));
//BA.debugLineNum = 25;BA.debugLine="lblOpcional.Top = lblAnotacaoRefPag.Top + lblAnotacaoRefPag.Height"[Lay_Anotar/General script]
views.get("lblopcional").vw.setTop((int)((views.get("lblanotacaorefpag").vw.getTop())+(views.get("lblanotacaorefpag").vw.getHeight())));
//BA.debugLineNum = 26;BA.debugLine="lblOpcional.Width = lblAnotacaoRefPag.Width"[Lay_Anotar/General script]
views.get("lblopcional").vw.setWidth((int)((views.get("lblanotacaorefpag").vw.getWidth())));
//BA.debugLineNum = 27;BA.debugLine="lblOpcional.Height = 3%y"[Lay_Anotar/General script]
views.get("lblopcional").vw.setHeight((int)((3d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="panel_anotacao.Width = panel_cabecalho.Width"[Lay_Anotar/General script]
views.get("panel_anotacao").vw.setWidth((int)((views.get("panel_cabecalho").vw.getWidth())));
//BA.debugLineNum = 30;BA.debugLine="panel_anotacao.Top = panel_cabecalho.Top + panel_cabecalho.Height + 2%y"[Lay_Anotar/General script]
views.get("panel_anotacao").vw.setTop((int)((views.get("panel_cabecalho").vw.getTop())+(views.get("panel_cabecalho").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 31;BA.debugLine="panel_anotacao.Left = panel_cabecalho.Left"[Lay_Anotar/General script]
views.get("panel_anotacao").vw.setLeft((int)((views.get("panel_cabecalho").vw.getLeft())));
//BA.debugLineNum = 32;BA.debugLine="panel_anotacao.Height = (100%y - panel_anotacao.Top) - 8%y"[Lay_Anotar/General script]
views.get("panel_anotacao").vw.setHeight((int)(((100d / 100 * height)-(views.get("panel_anotacao").vw.getTop()))-(8d / 100 * height)));
//BA.debugLineNum = 35;BA.debugLine="lblTituloAnotacao.Width = panel_anotacao.Width - 3%x"[Lay_Anotar/General script]
views.get("lbltituloanotacao").vw.setWidth((int)((views.get("panel_anotacao").vw.getWidth())-(3d / 100 * width)));
//BA.debugLineNum = 36;BA.debugLine="lblTituloAnotacao.Left = (panel_anotacao.Width - lblTituloAnotacao.Width) / 2"[Lay_Anotar/General script]
views.get("lbltituloanotacao").vw.setLeft((int)(((views.get("panel_anotacao").vw.getWidth())-(views.get("lbltituloanotacao").vw.getWidth()))/2d));
//BA.debugLineNum = 37;BA.debugLine="lblTituloAnotacao.Top = 1%y"[Lay_Anotar/General script]
views.get("lbltituloanotacao").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 38;BA.debugLine="lblTituloAnotacao.Height = 3.2%y"[Lay_Anotar/General script]
views.get("lbltituloanotacao").vw.setHeight((int)((3.2d / 100 * height)));
//BA.debugLineNum = 40;BA.debugLine="edTituloAnotacao.Width = lblTituloAnotacao.Width"[Lay_Anotar/General script]
views.get("edtituloanotacao").vw.setWidth((int)((views.get("lbltituloanotacao").vw.getWidth())));
//BA.debugLineNum = 41;BA.debugLine="edTituloAnotacao.Left = lblTituloAnotacao.Left"[Lay_Anotar/General script]
views.get("edtituloanotacao").vw.setLeft((int)((views.get("lbltituloanotacao").vw.getLeft())));
//BA.debugLineNum = 42;BA.debugLine="edTituloAnotacao.Top = lblTituloAnotacao.Top + lblTituloAnotacao.Height"[Lay_Anotar/General script]
views.get("edtituloanotacao").vw.setTop((int)((views.get("lbltituloanotacao").vw.getTop())+(views.get("lbltituloanotacao").vw.getHeight())));
//BA.debugLineNum = 43;BA.debugLine="edTituloAnotacao.Height = 6.5%y"[Lay_Anotar/General script]
views.get("edtituloanotacao").vw.setHeight((int)((6.5d / 100 * height)));
//BA.debugLineNum = 45;BA.debugLine="lblAnotacao.Left = edTituloAnotacao.Left"[Lay_Anotar/General script]
views.get("lblanotacao").vw.setLeft((int)((views.get("edtituloanotacao").vw.getLeft())));
//BA.debugLineNum = 46;BA.debugLine="lblAnotacao.Top = edTituloAnotacao.Top + edTituloAnotacao.Height"[Lay_Anotar/General script]
views.get("lblanotacao").vw.setTop((int)((views.get("edtituloanotacao").vw.getTop())+(views.get("edtituloanotacao").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="lblAnotacao.Height = 4%y"[Lay_Anotar/General script]
views.get("lblanotacao").vw.setHeight((int)((4d / 100 * height)));
//BA.debugLineNum = 48;BA.debugLine="lblAnotacao.Width = edTituloAnotacao.Width / 2"[Lay_Anotar/General script]
views.get("lblanotacao").vw.setWidth((int)((views.get("edtituloanotacao").vw.getWidth())/2d));
//BA.debugLineNum = 50;BA.debugLine="panel_borda_anotacao.Left = lblAnotacao.Left"[Lay_Anotar/General script]
views.get("panel_borda_anotacao").vw.setLeft((int)((views.get("lblanotacao").vw.getLeft())));
//BA.debugLineNum = 51;BA.debugLine="panel_borda_anotacao.Top = lblAnotacao.Top + lblAnotacao.Height + 1%y"[Lay_Anotar/General script]
views.get("panel_borda_anotacao").vw.setTop((int)((views.get("lblanotacao").vw.getTop())+(views.get("lblanotacao").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 52;BA.debugLine="panel_borda_anotacao.Height = panel_anotacao.Height - panel_borda_anotacao.Top - 1%y"[Lay_Anotar/General script]
views.get("panel_borda_anotacao").vw.setHeight((int)((views.get("panel_anotacao").vw.getHeight())-(views.get("panel_borda_anotacao").vw.getTop())-(1d / 100 * height)));
//BA.debugLineNum = 53;BA.debugLine="panel_borda_anotacao.Width = edTituloAnotacao.Width"[Lay_Anotar/General script]
views.get("panel_borda_anotacao").vw.setWidth((int)((views.get("edtituloanotacao").vw.getWidth())));
//BA.debugLineNum = 55;BA.debugLine="edAnotacao.Top = 0.5%y"[Lay_Anotar/General script]
views.get("edanotacao").vw.setTop((int)((0.5d / 100 * height)));
//BA.debugLineNum = 56;BA.debugLine="edAnotacao.Width = panel_borda_anotacao.Width - 1.5%x"[Lay_Anotar/General script]
views.get("edanotacao").vw.setWidth((int)((views.get("panel_borda_anotacao").vw.getWidth())-(1.5d / 100 * width)));
//BA.debugLineNum = 57;BA.debugLine="edAnotacao.Left = (panel_borda_anotacao.Width - edAnotacao.Width) / 2"[Lay_Anotar/General script]
views.get("edanotacao").vw.setLeft((int)(((views.get("panel_borda_anotacao").vw.getWidth())-(views.get("edanotacao").vw.getWidth()))/2d));
//BA.debugLineNum = 58;BA.debugLine="edAnotacao.Height = (panel_borda_anotacao.Height - edAnotacao.Top) - 0.5%y"[Lay_Anotar/General script]
views.get("edanotacao").vw.setHeight((int)(((views.get("panel_borda_anotacao").vw.getHeight())-(views.get("edanotacao").vw.getTop()))-(0.5d / 100 * height)));
//BA.debugLineNum = 60;BA.debugLine="btOk.Width = 40%x"[Lay_Anotar/General script]
views.get("btok").vw.setWidth((int)((40d / 100 * width)));
//BA.debugLineNum = 61;BA.debugLine="btOk.Top = panel_anotacao.Top + panel_anotacao.Height"[Lay_Anotar/General script]
views.get("btok").vw.setTop((int)((views.get("panel_anotacao").vw.getTop())+(views.get("panel_anotacao").vw.getHeight())));
//BA.debugLineNum = 62;BA.debugLine="btOk.Left = (panel_anotacao.Left + panel_anotacao.Width) - btOk.Width"[Lay_Anotar/General script]
views.get("btok").vw.setLeft((int)(((views.get("panel_anotacao").vw.getLeft())+(views.get("panel_anotacao").vw.getWidth()))-(views.get("btok").vw.getWidth())));
//BA.debugLineNum = 63;BA.debugLine="btOk.Height = 100%y - btOk.Top - 1%y"[Lay_Anotar/General script]
views.get("btok").vw.setHeight((int)((100d / 100 * height)-(views.get("btok").vw.getTop())-(1d / 100 * height)));
//BA.debugLineNum = 65;BA.debugLine="btCancelar.Top = btOk.Top"[Lay_Anotar/General script]
views.get("btcancelar").vw.setTop((int)((views.get("btok").vw.getTop())));
//BA.debugLineNum = 66;BA.debugLine="btCancelar.Height = btOk.Height"[Lay_Anotar/General script]
views.get("btcancelar").vw.setHeight((int)((views.get("btok").vw.getHeight())));
//BA.debugLineNum = 67;BA.debugLine="btCancelar.Width = btOk.Width"[Lay_Anotar/General script]
views.get("btcancelar").vw.setWidth((int)((views.get("btok").vw.getWidth())));
//BA.debugLineNum = 68;BA.debugLine="btCancelar.Left = btOk.Left - btCancelar.Width - 2%x"[Lay_Anotar/General script]
views.get("btcancelar").vw.setLeft((int)((views.get("btok").vw.getLeft())-(views.get("btcancelar").vw.getWidth())-(2d / 100 * width)));

}
}