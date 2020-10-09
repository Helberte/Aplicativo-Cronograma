package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_laycadastrolivro{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneltitulo").vw.setTop((int)((0d / 100 * height)));
views.get("paneltitulo").vw.setWidth((int)((100d / 100 * width)));
views.get("paneltitulo").vw.setHeight((int)((10d / 100 * height)));
views.get("paneltitulo").vw.setLeft((int)((0d / 100 * width)));
views.get("lbldadosdolivro").vw.setWidth((int)((100d / 100 * width)));
views.get("lbldadosdolivro").vw.setHeight((int)((5d / 100 * height)));
views.get("lbldadosdolivro").vw.setTop((int)((views.get("paneltitulo").vw.getHeight())));
views.get("b4ximageview1").vw.setTop((int)((views.get("paneltitulo").vw.getHeight())+(views.get("lbldadosdolivro").vw.getHeight())));
views.get("b4ximageview1").vw.setWidth((int)((98d / 100 * width)));
views.get("b4ximageview1").vw.setLeft((int)(((100d / 100 * width)-(views.get("b4ximageview1").vw.getWidth()))/2d));
views.get("b4ximageview1").vw.setHeight((int)((27d / 100 * height)));
views.get("lblfotolivro").vw.setTop((int)((views.get("b4ximageview1").vw.getTop())+(7d / 100 * height)));
views.get("lblfotolivro").vw.setWidth((int)((views.get("b4ximageview1").vw.getWidth())-(20d / 100 * width)));
views.get("lblfotolivro").vw.setLeft((int)(((views.get("b4ximageview1").vw.getWidth())-(views.get("lblfotolivro").vw.getWidth()))/2d));
views.get("lblfotolivro").vw.setHeight((int)((views.get("b4ximageview1").vw.getHeight())-(20d / 100 * height)));
views.get("btaddfoto").vw.setHeight((int)((views.get("b4ximageview1").vw.getHeight())-(21d / 100 * height)));
views.get("btaddfoto").vw.setWidth((int)((views.get("btaddfoto").vw.getHeight())+(4d / 100 * width)));
views.get("btaddfoto").vw.setTop((int)((views.get("b4ximageview1").vw.getTop())+(20d / 100 * height)));
views.get("btaddfoto").vw.setLeft((int)((views.get("b4ximageview1").vw.getWidth())-(views.get("btaddfoto").vw.getWidth())));
views.get("paneltitulolivro").vw.setTop((int)((views.get("b4ximageview1").vw.getTop())+(views.get("b4ximageview1").vw.getHeight())));
views.get("paneltitulolivro").vw.setWidth((int)((views.get("b4ximageview1").vw.getWidth())));
views.get("paneltitulolivro").vw.setLeft((int)(((100d / 100 * width)-(views.get("paneltitulolivro").vw.getWidth()))/2d));
views.get("paneltitulolivro").vw.setHeight((int)((6d / 100 * height)));
views.get("edtitulolivro").vw.setHeight((int)((views.get("panelautorlivro").vw.getHeight())));
views.get("edtitulolivro").vw.setWidth((int)((views.get("paneltitulolivro").vw.getWidth())-(2d / 100 * width)));
views.get("edtitulolivro").vw.setLeft((int)((((views.get("paneltitulolivro").vw.getWidth())-(views.get("edtitulolivro").vw.getWidth()))/2d)));
views.get("edtitulolivro").vw.setTop((int)(((views.get("paneltitulolivro").vw.getHeight())-(views.get("edtitulolivro").vw.getHeight()))/2d));
views.get("panelautorlivro").vw.setTop((int)((views.get("paneltitulo").vw.getHeight())+(views.get("lbldadosdolivro").vw.getHeight())+(views.get("b4ximageview1").vw.getHeight())+(views.get("paneltitulolivro").vw.getHeight())));
views.get("panelautorlivro").vw.setWidth((int)((views.get("paneltitulolivro").vw.getWidth())));
views.get("panelautorlivro").vw.setHeight((int)((views.get("paneltitulolivro").vw.getHeight())));
views.get("panelautorlivro").vw.setLeft((int)((views.get("paneltitulolivro").vw.getLeft())));
views.get("edautorlivro").vw.setWidth((int)((views.get("edtitulolivro").vw.getWidth())));
views.get("edautorlivro").vw.setLeft((int)((views.get("edtitulolivro").vw.getLeft())));
views.get("edautorlivro").vw.setHeight((int)((views.get("edtitulolivro").vw.getHeight())));
views.get("edautorlivro").vw.setTop((int)((views.get("edtitulolivro").vw.getTop())));
views.get("btcancelar").vw.setLeft((int)((1d / 100 * width)));
views.get("btcancelar").vw.setTop((int)((1d / 100 * height)));
views.get("btcancelar").vw.setHeight((int)((views.get("paneltitulo").vw.getHeight())-(3d / 100 * height)));
views.get("btcancelar").vw.setWidth((int)((100d / 100 * width)-(65d / 100 * width)));
views.get("btsalvar").vw.setLeft((int)((64d / 100 * width)));
views.get("btsalvar").vw.setTop((int)((1d / 100 * height)));
views.get("btsalvar").vw.setHeight((int)((views.get("btcancelar").vw.getHeight())));
views.get("btsalvar").vw.setWidth((int)((views.get("btcancelar").vw.getWidth())));
views.get("lbltipoleitura").vw.setTop((int)((views.get("panelautorlivro").vw.getTop())+(views.get("panelautorlivro").vw.getHeight())));
views.get("lbltipoleitura").vw.setWidth((int)((100d / 100 * width)));
views.get("lbltipoleitura").vw.setLeft((int)((0d / 100 * width)));
views.get("lbltipoleitura").vw.setHeight((int)((4d / 100 * height)));
views.get("radpagina").vw.setHeight((int)((5d / 100 * height)));
views.get("radpagina").vw.setTop((int)((views.get("lbltipoleitura").vw.getTop())+(views.get("lbltipoleitura").vw.getHeight())));
views.get("radpagina").vw.setWidth((int)((50d / 100 * width)));
views.get("radpagina").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 68;BA.debugLine="radCapitulo.Height = radPagina.Height"[LayCadastroLivro/General script]
views.get("radcapitulo").vw.setHeight((int)((views.get("radpagina").vw.getHeight())));
//BA.debugLineNum = 69;BA.debugLine="radCapitulo.Top = radPagina.Top"[LayCadastroLivro/General script]
views.get("radcapitulo").vw.setTop((int)((views.get("radpagina").vw.getTop())));
//BA.debugLineNum = 70;BA.debugLine="radCapitulo.Width = 50%x"[LayCadastroLivro/General script]
views.get("radcapitulo").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 71;BA.debugLine="radCapitulo.Left = 50%x"[LayCadastroLivro/General script]
views.get("radcapitulo").vw.setLeft((int)((50d / 100 * width)));
//BA.debugLineNum = 73;BA.debugLine="panelQuantidadePagCap.Top = radCapitulo.Top + radCapitulo.Height"[LayCadastroLivro/General script]
views.get("panelquantidadepagcap").vw.setTop((int)((views.get("radcapitulo").vw.getTop())+(views.get("radcapitulo").vw.getHeight())));
//BA.debugLineNum = 74;BA.debugLine="panelQuantidadePagCap.Height = panelAutorLivro.Height"[LayCadastroLivro/General script]
views.get("panelquantidadepagcap").vw.setHeight((int)((views.get("panelautorlivro").vw.getHeight())));
//BA.debugLineNum = 75;BA.debugLine="panelQuantidadePagCap.Width = panelAutorLivro.Width"[LayCadastroLivro/General script]
views.get("panelquantidadepagcap").vw.setWidth((int)((views.get("panelautorlivro").vw.getWidth())));
//BA.debugLineNum = 76;BA.debugLine="panelQuantidadePagCap.Left = panelAutorLivro.Left"[LayCadastroLivro/General script]
views.get("panelquantidadepagcap").vw.setLeft((int)((views.get("panelautorlivro").vw.getLeft())));
//BA.debugLineNum = 78;BA.debugLine="edQuantPagOuCap.Left = edAutorLivro.Left"[LayCadastroLivro/General script]
views.get("edquantpagoucap").vw.setLeft((int)((views.get("edautorlivro").vw.getLeft())));
//BA.debugLineNum = 79;BA.debugLine="edQuantPagOuCap.Width = edAutorLivro.Width"[LayCadastroLivro/General script]
views.get("edquantpagoucap").vw.setWidth((int)((views.get("edautorlivro").vw.getWidth())));
//BA.debugLineNum = 80;BA.debugLine="edQuantPagOuCap.Height = panelQuantidadePagCap.Height"[LayCadastroLivro/General script]
views.get("edquantpagoucap").vw.setHeight((int)((views.get("panelquantidadepagcap").vw.getHeight())));
//BA.debugLineNum = 81;BA.debugLine="edQuantPagOuCap.Top = 0%y"[LayCadastroLivro/General script]
views.get("edquantpagoucap").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 83;BA.debugLine="lblMeta.Top = panelQuantidadePagCap.Top + panelQuantidadePagCap.Height"[LayCadastroLivro/General script]
views.get("lblmeta").vw.setTop((int)((views.get("panelquantidadepagcap").vw.getTop())+(views.get("panelquantidadepagcap").vw.getHeight())));
//BA.debugLineNum = 84;BA.debugLine="lblMeta.Width = lblDadosDoLivro.Width"[LayCadastroLivro/General script]
views.get("lblmeta").vw.setWidth((int)((views.get("lbldadosdolivro").vw.getWidth())));
//BA.debugLineNum = 85;BA.debugLine="lblMeta.Height = lblDadosDoLivro.Height"[LayCadastroLivro/General script]
views.get("lblmeta").vw.setHeight((int)((views.get("lbldadosdolivro").vw.getHeight())));
//BA.debugLineNum = 86;BA.debugLine="lblMeta.Left = 0%x"[LayCadastroLivro/General script]
views.get("lblmeta").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 88;BA.debugLine="panelMeta.Top = lblMeta.Top + lblMeta.Height"[LayCadastroLivro/General script]
views.get("panelmeta").vw.setTop((int)((views.get("lblmeta").vw.getTop())+(views.get("lblmeta").vw.getHeight())));
//BA.debugLineNum = 89;BA.debugLine="panelMeta.Height = panelAutorLivro.Height"[LayCadastroLivro/General script]
views.get("panelmeta").vw.setHeight((int)((views.get("panelautorlivro").vw.getHeight())));
//BA.debugLineNum = 90;BA.debugLine="panelMeta.Left = panelAutorLivro.Left"[LayCadastroLivro/General script]
views.get("panelmeta").vw.setLeft((int)((views.get("panelautorlivro").vw.getLeft())));
//BA.debugLineNum = 91;BA.debugLine="panelMeta.Width = panelAutorLivro.Width"[LayCadastroLivro/General script]
views.get("panelmeta").vw.setWidth((int)((views.get("panelautorlivro").vw.getWidth())));
//BA.debugLineNum = 93;BA.debugLine="edMeta.Height = panelMeta.Height"[LayCadastroLivro/General script]
views.get("edmeta").vw.setHeight((int)((views.get("panelmeta").vw.getHeight())));
//BA.debugLineNum = 94;BA.debugLine="edMeta.Width = edAutorLivro.Width"[LayCadastroLivro/General script]
views.get("edmeta").vw.setWidth((int)((views.get("edautorlivro").vw.getWidth())));
//BA.debugLineNum = 95;BA.debugLine="edMeta.Left = edAutorLivro.Left"[LayCadastroLivro/General script]
views.get("edmeta").vw.setLeft((int)((views.get("edautorlivro").vw.getLeft())));
//BA.debugLineNum = 96;BA.debugLine="edMeta.Top = 0%x"[LayCadastroLivro/General script]
views.get("edmeta").vw.setTop((int)((0d / 100 * width)));
//BA.debugLineNum = 98;BA.debugLine="lblPrevisaoTermino.Top = panelMeta.Top + panelMeta.Height"[LayCadastroLivro/General script]
views.get("lblprevisaotermino").vw.setTop((int)((views.get("panelmeta").vw.getTop())+(views.get("panelmeta").vw.getHeight())));
//BA.debugLineNum = 99;BA.debugLine="lblPrevisaoTermino.Left = 0%x"[LayCadastroLivro/General script]
views.get("lblprevisaotermino").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 100;BA.debugLine="lblPrevisaoTermino.Width = 100%x"[LayCadastroLivro/General script]
views.get("lblprevisaotermino").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 101;BA.debugLine="lblPrevisaoTermino.Height = lblDadosDoLivro.Height"[LayCadastroLivro/General script]
views.get("lblprevisaotermino").vw.setHeight((int)((views.get("lbldadosdolivro").vw.getHeight())));
//BA.debugLineNum = 103;BA.debugLine="panelPrevisaoTermino.Top = lblPrevisaoTermino.Top + lblPrevisaoTermino.Height"[LayCadastroLivro/General script]
views.get("panelprevisaotermino").vw.setTop((int)((views.get("lblprevisaotermino").vw.getTop())+(views.get("lblprevisaotermino").vw.getHeight())));
//BA.debugLineNum = 104;BA.debugLine="panelPrevisaoTermino.Width = 97%x"[LayCadastroLivro/General script]
views.get("panelprevisaotermino").vw.setWidth((int)((97d / 100 * width)));
//BA.debugLineNum = 105;BA.debugLine="panelPrevisaoTermino.Left = (100%x - panelPrevisaoTermino.Width)/2"[LayCadastroLivro/General script]
views.get("panelprevisaotermino").vw.setLeft((int)(((100d / 100 * width)-(views.get("panelprevisaotermino").vw.getWidth()))/2d));
//BA.debugLineNum = 106;BA.debugLine="panelPrevisaoTermino.Height = 12%y"[LayCadastroLivro/General script]
views.get("panelprevisaotermino").vw.setHeight((int)((12d / 100 * height)));
//BA.debugLineNum = 108;BA.debugLine="lblQuantidadeDias.Left = 0%x"[LayCadastroLivro/General script]
views.get("lblquantidadedias").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 109;BA.debugLine="lblQuantidadeDias.Width = panelPrevisaoTermino.Width"[LayCadastroLivro/General script]
views.get("lblquantidadedias").vw.setWidth((int)((views.get("panelprevisaotermino").vw.getWidth())));
//BA.debugLineNum = 110;BA.debugLine="lblQuantidadeDias.Height = 4%y"[LayCadastroLivro/General script]
views.get("lblquantidadedias").vw.setHeight((int)((4d / 100 * height)));
//BA.debugLineNum = 111;BA.debugLine="lblQuantidadeDias.Top = 1%y"[LayCadastroLivro/General script]
views.get("lblquantidadedias").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 113;BA.debugLine="lblPrevisao.Width = panelPrevisaoTermino.Width"[LayCadastroLivro/General script]
views.get("lblprevisao").vw.setWidth((int)((views.get("panelprevisaotermino").vw.getWidth())));
//BA.debugLineNum = 114;BA.debugLine="lblPrevisao.Top = lblQuantidadeDias.Top + lblQuantidadeDias.Height"[LayCadastroLivro/General script]
views.get("lblprevisao").vw.setTop((int)((views.get("lblquantidadedias").vw.getTop())+(views.get("lblquantidadedias").vw.getHeight())));
//BA.debugLineNum = 115;BA.debugLine="lblPrevisao.Height = 6%y"[LayCadastroLivro/General script]
views.get("lblprevisao").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 116;BA.debugLine="lblPrevisao.Left = 0%x"[LayCadastroLivro/General script]
views.get("lblprevisao").vw.setLeft((int)((0d / 100 * width)));

}
}