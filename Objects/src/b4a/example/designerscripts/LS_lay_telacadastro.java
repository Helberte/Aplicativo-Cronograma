package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_telacadastro{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("scrollview").vw.setTop((int)((5d / 100 * height)));
views.get("scrollview").vw.setLeft((int)((0d / 100 * width)));
views.get("scrollview").vw.setHeight((int)((100d / 100 * height)-(views.get("scrollview").vw.getTop())));
views.get("scrollview").vw.setWidth((int)((100d / 100 * width)));

}
}