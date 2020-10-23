package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_previsao_termino{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelprevisaotermino").vw.setTop((int)((0d / 100 * height)));
views.get("panelprevisaotermino").vw.setWidth((int)((100d / 100 * width)));
views.get("panelprevisaotermino").vw.setLeft((int)(((100d / 100 * width)-(views.get("panelprevisaotermino").vw.getWidth()))/2d));
views.get("panelprevisaotermino").vw.setHeight((int)((100d / 100 * height)));
views.get("lblquantidadedias").vw.setLeft((int)((0d / 100 * width)));
views.get("lblquantidadedias").vw.setWidth((int)((views.get("panelprevisaotermino").vw.getWidth())));
views.get("lblquantidadedias").vw.setHeight((int)((40d / 100 * height)));
views.get("lblquantidadedias").vw.setTop((int)((1d / 100 * height)));
views.get("lbldataprevisao").vw.setWidth((int)((views.get("panelprevisaotermino").vw.getWidth())));
views.get("lbldataprevisao").vw.setTop((int)((views.get("lblquantidadedias").vw.getTop())+(views.get("lblquantidadedias").vw.getHeight())));
views.get("lbldataprevisao").vw.setHeight((int)((100d / 100 * height)-(views.get("lblquantidadedias").vw.getHeight())));
views.get("lbldataprevisao").vw.setLeft((int)((0d / 100 * width)));

}
}