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
views.get("btadicionarleitura").vw.setTop((int)(((views.get("tabstrip").vw.getHeight())+(views.get("tabstrip").vw.getTop()))-(10.5d / 100 * height)));
views.get("btadicionarleitura").vw.setLeft((int)((views.get("tabstrip").vw.getWidth())-(18d / 100 * width)));
views.get("btadicionarleitura").vw.setWidth((int)((views.get("tabstrip").vw.getWidth())-(((views.get("tabstrip").vw.getWidth())*(85d / 100 * width))/(100d / 100 * width))));
views.get("btadicionarleitura").vw.setHeight((int)((views.get("btadicionarleitura").vw.getWidth())));
views.get("panel_parabens").vw.setTop((int)((14d / 100 * height)));
views.get("panel_parabens").vw.setWidth((int)((90d / 100 * width)));
views.get("panel_parabens").vw.setLeft((int)(((100d / 100 * width)-(views.get("panel_parabens").vw.getWidth()))/2d));
views.get("panel_parabens").vw.setHeight((int)((100d / 100 * height)-((views.get("panel_parabens").vw.getTop())*2d)));
views.get("lblparabens").vw.setTop((int)((0d / 100 * height)));
views.get("lblparabens").vw.setLeft((int)((0d / 100 * width)));
views.get("lblparabens").vw.setWidth((int)((views.get("panel_parabens").vw.getWidth())));
views.get("lblparabens").vw.setHeight((int)((8d / 100 * height)));
views.get("b4ximage_parabens").vw.setWidth((int)((views.get("panel_parabens").vw.getWidth())-(8d / 100 * width)));
views.get("b4ximage_parabens").vw.setLeft((int)(((views.get("panel_parabens").vw.getWidth())-(views.get("b4ximage_parabens").vw.getWidth()))/2d));
views.get("b4ximage_parabens").vw.setTop((int)((views.get("lblparabens").vw.getTop())+(views.get("lblparabens").vw.getHeight())+(2d / 100 * height)));
views.get("b4ximage_parabens").vw.setHeight((int)((40d / 100 * height)));
views.get("lbl_frase_motivacional").vw.setTop((int)((views.get("b4ximage_parabens").vw.getTop())+(views.get("b4ximage_parabens").vw.getHeight())+(2d / 100 * height)));
views.get("lbl_frase_motivacional").vw.setLeft((int)((4d / 100 * width)));
views.get("lbl_frase_motivacional").vw.setHeight((int)((views.get("panel_parabens").vw.getHeight())-(views.get("lbl_frase_motivacional").vw.getTop())-(3d / 100 * height)));
views.get("lbl_frase_motivacional").vw.setWidth((int)((65d / 100 * width)));
views.get("btok_parabens").vw.setTop((int)((views.get("b4ximage_parabens").vw.getTop())+(views.get("b4ximage_parabens").vw.getHeight())+(10d / 100 * height)));
views.get("btok_parabens").vw.setLeft((int)((views.get("lbl_frase_motivacional").vw.getLeft())+(views.get("lbl_frase_motivacional").vw.getWidth())));
views.get("btok_parabens").vw.setWidth((int)((17d / 100 * width)));
views.get("btok_parabens").vw.setHeight((int)((views.get("panel_parabens").vw.getHeight())-(views.get("btok_parabens").vw.getTop())-(3d / 100 * height)));

}
}