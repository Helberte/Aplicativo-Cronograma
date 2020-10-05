package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_laylogin{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panellogin").vw.setWidth((int)((100d / 100 * width)));
views.get("panellogin").vw.setHeight((int)((38d / 100 * height)));
views.get("lblcronograma").vw.setWidth((int)((views.get("panellogin").vw.getWidth())-(((views.get("panellogin").vw.getWidth())*20d)/100d)));
views.get("lblcronograma").vw.setLeft((int)((9d / 100 * width)));
views.get("panelprincipal").vw.setTop((int)(((views.get("panellogin").vw.getHeight())-90d)));
views.get("panelprincipal").vw.setWidth((int)((views.get("panellogin").vw.getWidth())-(((views.get("panellogin").vw.getWidth())*(10d / 100 * width))/(100d / 100 * width))));
views.get("panelprincipal").vw.setLeft((int)((5d / 100 * width)));
views.get("edlogin").vw.setWidth((int)((views.get("panelprincipal").vw.getWidth())-(((views.get("panelprincipal").vw.getWidth())*(10d / 100 * width))/(100d / 100 * width))));
views.get("edsenha").vw.setWidth((int)((views.get("edlogin").vw.getWidth())));
views.get("edlogin").vw.setLeft((int)((views.get("panelprincipal").vw.getLeft())+(((views.get("panelprincipal").vw.getWidth())-(views.get("edlogin").vw.getWidth()))/-10d)));
views.get("edsenha").vw.setLeft((int)((views.get("edlogin").vw.getLeft())));
views.get("edlogin").vw.setTop((int)((views.get("panelprincipal").vw.getTop())+(0-(26d / 100 * height))));
views.get("edsenha").vw.setTop((int)((views.get("edlogin").vw.getTop())+(17d / 100 * width)));
views.get("btesquecisenha").vw.setLeft((int)((views.get("edsenha").vw.getLeft() + views.get("edsenha").vw.getWidth()) - (views.get("btesquecisenha").vw.getWidth())));
views.get("btesquecisenha").vw.setTop((int)((views.get("edsenha").vw.getTop())+(13d / 100 * width)));
views.get("btconectar").vw.setWidth((int)((views.get("panelprincipal").vw.getWidth())-(((views.get("panelprincipal").vw.getWidth())*27d)/100d)));
views.get("btconectar").vw.setLeft((int)((views.get("panelprincipal").vw.getLeft())+(11.5d / 100 * width)));
views.get("btconectar").vw.setTop((int)(((views.get("panelprincipal").vw.getTop())+(views.get("panelprincipal").vw.getHeight()))-((views.get("btconectar").vw.getHeight())/2d)));
views.get("lblcadastro").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcadastro").vw.setWidth((int)((views.get("panellogin").vw.getWidth())-((views.get("btcadastro").vw.getWidth())+35d)));
views.get("lblcadastro").vw.setTop((int)((views.get("btconectar").vw.getTop())+(30d / 100 * width)));
views.get("btcadastro").vw.setTop((int)((views.get("btconectar").vw.getTop())+(30d / 100 * width)));
views.get("btcadastro").vw.setLeft((int)((100d / 100 * width)-(views.get("lblcadastro").vw.getLeft()) - (views.get("btcadastro").vw.getWidth())));
views.get("btcadastro").vw.setWidth((int)((100d / 100 * width)-((views.get("lblcadastro").vw.getWidth())+(views.get("lblcadastro").vw.getLeft()))));

}
}