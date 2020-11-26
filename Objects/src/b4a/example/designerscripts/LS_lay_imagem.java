package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_imagem{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("b4ximagem").vw.setLeft((int)((0d / 100 * width)));
views.get("b4ximagem").vw.setTop((int)((0d / 100 * height)));
views.get("b4ximagem").vw.setWidth((int)((100d / 100 * width)));
views.get("b4ximagem").vw.setHeight((int)((100d / 100 * height)));
views.get("btaddimagem").vw.setLeft((int)((83d / 100 * width)));
views.get("btaddimagem").vw.setWidth((int)((15d / 100 * width)));
views.get("btaddimagem").vw.setHeight((int)((17d / 100 * height)));
views.get("btaddimagem").vw.setTop((int)((100d / 100 * height)-(views.get("btaddimagem").vw.getHeight())-(1.5d / 100 * height)));

}
}