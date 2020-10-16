package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_lancamento_leitura{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelprincipal").vw.setWidth((int)((92d / 100 * width)));
views.get("panelprincipal").vw.setTop((int)((5d / 100 * height)));
views.get("panelprincipal").vw.setHeight((int)((100d / 100 * height)-((views.get("panelprincipal").vw.getTop())*2d)));
views.get("panelprincipal").vw.setLeft((int)(((100d / 100 * width)-(views.get("panelprincipal").vw.getWidth()))/2d));
views.get("b4ximageviewfoto").vw.setWidth((int)((views.get("panelprincipal").vw.getWidth())));
views.get("b4ximageviewfoto").vw.setTop((int)((0d / 100 * height)));
views.get("b4ximageviewfoto").vw.setLeft((int)((0d / 100 * width)));
views.get("b4ximageviewfoto").vw.setHeight((int)((30d / 100 * height)));
views.get("lbltitulolivro").vw.setTop((int)((views.get("b4ximageviewfoto").vw.getTop())+(views.get("b4ximageviewfoto").vw.getHeight())));
views.get("lbltitulolivro").vw.setWidth((int)((80d / 100 * width)));
views.get("lbltitulolivro").vw.setLeft((int)(((views.get("b4ximageviewfoto").vw.getWidth())-(views.get("lbltitulolivro").vw.getWidth()))/2d));
views.get("lbltitulolivro").vw.setHeight((int)((7d / 100 * height)));
views.get("lblnomeusuario").vw.setWidth((int)((60d / 100 * width)));
views.get("lblnomeusuario").vw.setTop((int)((views.get("lbltitulolivro").vw.getTop())+(views.get("lbltitulolivro").vw.getHeight())));
views.get("lblnomeusuario").vw.setLeft((int)(((views.get("b4ximageviewfoto").vw.getWidth())-(views.get("lblnomeusuario").vw.getWidth()))/2d));
views.get("lblnomeusuario").vw.setHeight((int)((views.get("lbltitulolivro").vw.getHeight())));
views.get("panellancamento").vw.setWidth((int)((views.get("panelprincipal").vw.getWidth())-(5d / 100 * width)));
views.get("panellancamento").vw.setLeft((int)(((views.get("b4ximageviewfoto").vw.getWidth())-(views.get("panellancamento").vw.getWidth()))/2d));
views.get("panellancamento").vw.setTop((int)((views.get("lblnomeusuario").vw.getTop())+(views.get("lblnomeusuario").vw.getHeight())+(2.5d / 100 * height)));
views.get("panellancamento").vw.setHeight((int)((21d / 100 * height)));
views.get("lblpaginaatual").vw.setWidth((int)((28d / 100 * width)));
views.get("lblpaginaatual").vw.setHeight((int)((7d / 100 * height)));
views.get("lblpaginaatual").vw.setTop((int)((3d / 100 * height)));
views.get("lblpaginaatual").vw.setLeft((int)((12d / 100 * width)));
views.get("lbltotalpaginas").vw.setWidth((int)((views.get("lblpaginaatual").vw.getWidth())));
views.get("lbltotalpaginas").vw.setHeight((int)((views.get("lblpaginaatual").vw.getHeight())));
views.get("lbltotalpaginas").vw.setTop((int)((views.get("lblpaginaatual").vw.getTop())));
views.get("lbltotalpaginas").vw.setLeft((int)((views.get("panellancamento").vw.getWidth())-(views.get("lblpaginaatual").vw.getLeft())-(views.get("lbltotalpaginas").vw.getWidth())));
views.get("edpaginaatual").vw.setWidth((int)((18d / 100 * width)));
views.get("edpaginaatual").vw.setTop((int)((views.get("lblpaginaatual").vw.getTop())+(views.get("lblpaginaatual").vw.getHeight())));
views.get("edpaginaatual").vw.setHeight((int)((7.5d / 100 * height)));
views.get("edpaginaatual").vw.setLeft((int)((20d / 100 * width)));
views.get("edtotalpaginas").vw.setWidth((int)((views.get("edpaginaatual").vw.getWidth())));
views.get("edtotalpaginas").vw.setTop((int)((views.get("edpaginaatual").vw.getTop())));
views.get("edtotalpaginas").vw.setHeight((int)((views.get("edpaginaatual").vw.getHeight())));
views.get("edtotalpaginas").vw.setLeft((int)((views.get("panellancamento").vw.getWidth())-(views.get("edpaginaatual").vw.getLeft())-(views.get("edtotalpaginas").vw.getWidth())));
views.get("lblbarra").vw.setHeight((int)((views.get("edtotalpaginas").vw.getHeight())));
views.get("lblbarra").vw.setTop((int)((views.get("edtotalpaginas").vw.getTop())));
views.get("lblbarra").vw.setWidth((int)((6d / 100 * width)));
views.get("lblbarra").vw.setLeft((int)(((views.get("panellancamento").vw.getWidth())-(views.get("lblbarra").vw.getWidth()))/2d));
views.get("lblporcentagem").vw.setWidth((int)((views.get("panellancamento").vw.getWidth())/2d));
views.get("lblporcentagem").vw.setHeight((int)((6d / 100 * height)));
views.get("lblporcentagem").vw.setTop((int)((views.get("panellancamento").vw.getTop())+(views.get("panellancamento").vw.getHeight())));
views.get("lblporcentagem").vw.setLeft((int)((views.get("panellancamento").vw.getLeft())+(views.get("panellancamento").vw.getWidth())-(views.get("lblporcentagem").vw.getWidth())-(2d / 100 * width)));
views.get("lblprevisaoporcentagem").vw.setTop((int)((views.get("lblporcentagem").vw.getTop())+(views.get("lblporcentagem").vw.getHeight())-(0.5d / 100 * height)));
views.get("lblprevisaoporcentagem").vw.setWidth((int)((views.get("lblporcentagem").vw.getWidth())));
views.get("lblprevisaoporcentagem").vw.setLeft((int)((views.get("lblporcentagem").vw.getLeft())));
//BA.debugLineNum = 62;BA.debugLine="lblPrevisaoPorcentagem.Height = 3%y"[Lay_lancamento_leitura/General script]
views.get("lblprevisaoporcentagem").vw.setHeight((int)((3d / 100 * height)));
//BA.debugLineNum = 64;BA.debugLine="btOk.Width = 32%x"[Lay_lancamento_leitura/General script]
views.get("btok").vw.setWidth((int)((32d / 100 * width)));
//BA.debugLineNum = 65;BA.debugLine="btOk.Height = 8%y"[Lay_lancamento_leitura/General script]
views.get("btok").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 66;BA.debugLine="btOk.Top = PanelPrincipal.Height - btOk.Height - 2%y"[Lay_lancamento_leitura/General script]
views.get("btok").vw.setTop((int)((views.get("panelprincipal").vw.getHeight())-(views.get("btok").vw.getHeight())-(2d / 100 * height)));
//BA.debugLineNum = 67;BA.debugLine="btOk.Left = panelLancamento.Left + panelLancamento.Width - btOk.Width"[Lay_lancamento_leitura/General script]
views.get("btok").vw.setLeft((int)((views.get("panellancamento").vw.getLeft())+(views.get("panellancamento").vw.getWidth())-(views.get("btok").vw.getWidth())));
//BA.debugLineNum = 69;BA.debugLine="btCancelar.Width = btOk.Width"[Lay_lancamento_leitura/General script]
views.get("btcancelar").vw.setWidth((int)((views.get("btok").vw.getWidth())));
//BA.debugLineNum = 70;BA.debugLine="btCancelar.Height = btOk.Height"[Lay_lancamento_leitura/General script]
views.get("btcancelar").vw.setHeight((int)((views.get("btok").vw.getHeight())));
//BA.debugLineNum = 71;BA.debugLine="btCancelar.Top = btOk.Top"[Lay_lancamento_leitura/General script]
views.get("btcancelar").vw.setTop((int)((views.get("btok").vw.getTop())));
//BA.debugLineNum = 72;BA.debugLine="btCancelar.Left = btOk.Left - btCancelar.Width - 2%x"[Lay_lancamento_leitura/General script]
views.get("btcancelar").vw.setLeft((int)((views.get("btok").vw.getLeft())-(views.get("btcancelar").vw.getWidth())-(2d / 100 * width)));
//BA.debugLineNum = 74;BA.debugLine="lblIvalido.Width = edPaginaAtual.Width"[Lay_lancamento_leitura/General script]
views.get("lblivalido").vw.setWidth((int)((views.get("edpaginaatual").vw.getWidth())));
//BA.debugLineNum = 75;BA.debugLine="lblIvalido.Top = edPaginaAtual.Top + edPaginaAtual.Height - 1%y"[Lay_lancamento_leitura/General script]
views.get("lblivalido").vw.setTop((int)((views.get("edpaginaatual").vw.getTop())+(views.get("edpaginaatual").vw.getHeight())-(1d / 100 * height)));
//BA.debugLineNum = 76;BA.debugLine="lblIvalido.Left = edPaginaAtual.Left"[Lay_lancamento_leitura/General script]
views.get("lblivalido").vw.setLeft((int)((views.get("edpaginaatual").vw.getLeft())));
//BA.debugLineNum = 77;BA.debugLine="lblIvalido.Height = 3.5%y"[Lay_lancamento_leitura/General script]
views.get("lblivalido").vw.setHeight((int)((3.5d / 100 * height)));

}
}