package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_detalhes_leituras{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel_cabecalho").vw.setTop((int)((0d / 100 * height)));
views.get("panel_cabecalho").vw.setLeft((int)((0d / 100 * width)));
views.get("panel_cabecalho").vw.setHeight((int)((14d / 100 * width)));
views.get("panel_cabecalho").vw.setWidth((int)((100d / 100 * width)));
views.get("bt_voltar").vw.setHeight((int)((6d / 100 * height)));
views.get("bt_voltar").vw.setLeft((int)((2d / 100 * width)));
views.get("bt_voltar").vw.setTop((int)(((views.get("panel_cabecalho").vw.getHeight())-(views.get("bt_voltar").vw.getHeight()))/2d));
views.get("bt_voltar").vw.setWidth((int)((11d / 100 * width)));
views.get("lbl_detalhes_do_livro").vw.setLeft((int)((views.get("bt_voltar").vw.getLeft())+(views.get("bt_voltar").vw.getWidth())));
views.get("lbl_detalhes_do_livro").vw.setWidth((int)((100d / 100 * width)-(views.get("lbl_detalhes_do_livro").vw.getLeft())));
views.get("lbl_detalhes_do_livro").vw.setHeight((int)((views.get("bt_voltar").vw.getHeight())));
views.get("lbl_detalhes_do_livro").vw.setTop((int)((views.get("bt_voltar").vw.getTop())));
views.get("scrol").vw.setTop((int)((views.get("panel_cabecalho").vw.getTop())+(views.get("panel_cabecalho").vw.getHeight())));
views.get("scrol").vw.setLeft((int)((0d / 100 * width)));
views.get("scrol").vw.setWidth((int)((100d / 100 * width)));
views.get("scrol").vw.setHeight((int)((100d / 100 * height)-(views.get("panel_cabecalho").vw.getHeight())));

}
}