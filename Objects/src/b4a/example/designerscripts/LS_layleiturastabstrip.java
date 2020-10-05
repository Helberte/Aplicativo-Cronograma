package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layleiturastabstrip{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("tabstrip").vw.setTop((int)((15d / 100 * width)));
views.get("tabstrip").vw.setWidth((int)((100d / 100 * width)));
views.get("tabstrip").vw.setLeft((int)((0d / 100 * width)));
views.get("tabstrip").vw.setHeight((int)((100d / 100 * height)-(views.get("tabstrip").vw.getTop())));
views.get("lblorganizeleituras").vw.setLeft((int)((2d / 100 * width)));
views.get("lblorganizeleituras").vw.setWidth((int)((100d / 100 * width)-(views.get("lblorganizeleituras").vw.getLeft())));
views.get("lblorganizeleituras").vw.setTop((int)((1d / 100 * height)));
views.get("lblorganizeleituras").vw.setHeight((int)((5d / 100 * height)));
views.get("btadicionarleitura").vw.setTop((int)(((views.get("tabstrip").vw.getHeight())+(views.get("tabstrip").vw.getTop()))-(14d / 100 * height)));
views.get("btadicionarleitura").vw.setLeft((int)((views.get("tabstrip").vw.getWidth())-(21d / 100 * width)));
views.get("btadicionarleitura").vw.setWidth((int)((views.get("tabstrip").vw.getWidth())-(((views.get("tabstrip").vw.getWidth())*(80d / 100 * width))/(100d / 100 * width))));
views.get("btadicionarleitura").vw.setHeight((int)((views.get("btadicionarleitura").vw.getWidth())));

}
}