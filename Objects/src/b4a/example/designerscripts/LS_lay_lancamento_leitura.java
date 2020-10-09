package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lay_lancamento_leitura{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelprincipal").vw.setWidth((int)((95d / 100 * width)));
views.get("panelprincipal").vw.setTop((int)((3d / 100 * height)));
views.get("panelprincipal").vw.setHeight((int)((100d / 100 * height)-((views.get("panelprincipal").vw.getTop())*2d)));
views.get("panelprincipal").vw.setLeft((int)(((100d / 100 * width)-(views.get("panelprincipal").vw.getWidth()))/2d));
views.get("b4ximageview").vw.setWidth((int)((views.get("panelprincipal").vw.getWidth())));
views.get("b4ximageview").vw.setTop((int)((0d / 100 * height)));
views.get("b4ximageview").vw.setLeft((int)((0d / 100 * width)));
views.get("b4ximageview").vw.setHeight((int)((32d / 100 * height)));
views.get("lbltitulolivro").vw.setTop((int)((views.get("b4ximageview").vw.getTop())+(views.get("b4ximageview").vw.getHeight())));
views.get("lbltitulolivro").vw.setWidth((int)((80d / 100 * width)));
views.get("lbltitulolivro").vw.setLeft((int)(((views.get("b4ximageview").vw.getWidth())-(views.get("lbltitulolivro").vw.getWidth()))/2d));
views.get("lbltitulolivro").vw.setHeight((int)((7d / 100 * height)));
views.get("lblnomeusuario").vw.setWidth((int)((60d / 100 * width)));
views.get("lblnomeusuario").vw.setTop((int)((views.get("lbltitulolivro").vw.getTop())+(views.get("lbltitulolivro").vw.getHeight())));
views.get("lblnomeusuario").vw.setLeft((int)(((views.get("b4ximageview").vw.getWidth())-(views.get("lblnomeusuario").vw.getWidth()))/2d));
views.get("lblnomeusuario").vw.setHeight((int)((views.get("lbltitulolivro").vw.getHeight())));
views.get("panellancamento").vw.setWidth((int)((90d / 100 * width)));
views.get("panellancamento").vw.setLeft((int)(((views.get("b4ximageview").vw.getWidth())-(views.get("panellancamento").vw.getWidth()))/2d));
views.get("panellancamento").vw.setTop((int)((views.get("lblnomeusuario").vw.getTop())+(views.get("lblnomeusuario").vw.getHeight())+(2.5d / 100 * height)));
views.get("lblpaginaatual").vw.setWidth((int)((28d / 100 * width)));
views.get("lblpaginaatual").vw.setHeight((int)((7d / 100 * height)));
views.get("lblpaginaatual").vw.setTop((int)((3d / 100 * height)));
views.get("lblpaginaatual").vw.setLeft((int)((6d / 100 * width)));
views.get("lbltotalpaginas").vw.setWidth((int)((views.get("lblpaginaatual").vw.getWidth())));
views.get("lbltotalpaginas").vw.setHeight((int)((views.get("lblpaginaatual").vw.getHeight())));
views.get("lbltotalpaginas").vw.setTop((int)((views.get("lblpaginaatual").vw.getTop())));
views.get("lbltotalpaginas").vw.setLeft((int)(((views.get("panellancamento").vw.getWidth())-((views.get("lblpaginaatual").vw.getLeft())+(views.get("lblpaginaatual").vw.getWidth())))-(views.get("lbltotalpaginas").vw.getWidth())-(views.get("lblpaginaatual").vw.getLeft())));

}
}