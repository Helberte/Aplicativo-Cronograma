package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layleitura_menu1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("scrollview1").vw.setTop((int)((0d / 100 * height)));
views.get("scrollview1").vw.setHeight((int)((100d / 100 * height)));
views.get("scrollview1").vw.setWidth((int)((100d / 100 * width)));
views.get("scrollview1").vw.setLeft((int)((0d / 100 * width)));
views.get("panelleituras").vw.setWidth((int)((views.get("scrollview1").vw.getWidth())-(((views.get("scrollview1").vw.getWidth())*3d)/100d)));
views.get("panelleituras").vw.setHeight((int)((25d / 100 * height)));
views.get("panelleituras").vw.setLeft((int)(((views.get("scrollview1").vw.getWidth())-(views.get("panelleituras").vw.getWidth()))/2d));
views.get("panelleituras").vw.setTop((int)((1d / 100 * height)));
views.get("lbltitulolivro").vw.setLeft((int)((2d / 100 * width)));
views.get("lbltitulolivro").vw.setWidth((int)((views.get("panelleituras").vw.getWidth())-(5d / 100 * width)));
views.get("lbltitulolivro").vw.setTop((int)((views.get("panelleituras").vw.getHeight())-(26d / 100 * height)));
views.get("lbldatacomecoleitura").vw.setLeft((int)((views.get("lbltitulolivro").vw.getLeft())));
views.get("lbldatacomecoleitura").vw.setWidth((int)((views.get("lbltitulolivro").vw.getWidth())));
views.get("lbldatacomecoleitura").vw.setTop((int)((views.get("lbltitulolivro").vw.getTop())+(5d / 100 * height)));
views.get("lblprevisaotermino").vw.setLeft((int)((views.get("lbldatacomecoleitura").vw.getLeft())));
views.get("lblprevisaotermino").vw.setWidth((int)((views.get("lbltitulolivro").vw.getWidth())));
views.get("lblprevisaotermino").vw.setTop((int)((views.get("lbldatacomecoleitura").vw.getTop())+(4d / 100 * height)));
views.get("lblquantidadepaginas").vw.setLeft((int)((views.get("lbldatacomecoleitura").vw.getLeft())));
views.get("lblquantidadepaginas").vw.setWidth((int)((views.get("lbldatacomecoleitura").vw.getWidth())));
views.get("lblquantidadepaginas").vw.setTop((int)((views.get("lblprevisaotermino").vw.getTop())+(4d / 100 * height)));
views.get("btanotar").vw.setTop((int)((views.get("panelleituras").vw.getHeight())-(7.5d / 100 * height)));
views.get("btanotar").vw.setWidth((int)((views.get("panelleituras").vw.getWidth())-(70d / 100 * width)));
views.get("btanotar").vw.setLeft((int)((0d / 100 * width)));
views.get("btanotar").vw.setHeight((int)((7.5d / 100 * height)));
views.get("btlancar").vw.setTop((int)((views.get("btanotar").vw.getTop())));
views.get("btlancar").vw.setWidth((int)((views.get("btanotar").vw.getWidth())));
views.get("btlancar").vw.setLeft((int)((views.get("btanotar").vw.getLeft())+(33d / 100 * width)));
views.get("btlancar").vw.setHeight((int)((7.5d / 100 * height)));

}
}