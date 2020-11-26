package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_edmetapagcap{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel").vw.setLeft((int)((0d / 100 * width)));
views.get("panel").vw.setTop((int)((0d / 100 * height)));
views.get("panel").vw.setWidth((int)((100d / 100 * width)));
views.get("panel").vw.setHeight((int)((100d / 100 * height)));
views.get("edb4xfloatmetapagcap").vw.setWidth((int)((96d / 100 * width)));
views.get("edb4xfloatmetapagcap").vw.setLeft((int)(((100d / 100 * width)-(views.get("edb4xfloatmetapagcap").vw.getWidth()))/2d));
views.get("edb4xfloatmetapagcap").vw.setTop((int)((2d / 100 * height)));
views.get("edb4xfloatmetapagcap").vw.setHeight((int)((100d / 100 * height)-((views.get("edb4xfloatmetapagcap").vw.getTop())*2d)));

}
}