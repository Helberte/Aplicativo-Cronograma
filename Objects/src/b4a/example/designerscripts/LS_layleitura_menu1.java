package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layleitura_menu1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel_lendo").vw.setTop((int)((0d / 100 * height)));
views.get("panel_lendo").vw.setHeight((int)((100d / 100 * height)));
views.get("panel_lendo").vw.setWidth((int)((100d / 100 * width)));
views.get("panel_lendo").vw.setLeft((int)((0d / 100 * width)));

}
}