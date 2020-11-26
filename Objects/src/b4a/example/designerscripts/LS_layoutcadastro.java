package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutcadastro{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblmensagem").vw.setWidth((int)((80d / 100 * width)));
views.get("lblmensagem").vw.setLeft((int)((10d / 100 * width)));
views.get("lblmensagem").vw.setTop((int)((2d / 100 * height)));
views.get("panelednome").vw.setWidth((int)((100d / 100 * width)-(((100d / 100 * width)*(10d / 100 * width))/(100d / 100 * width))));
views.get("panelednome").vw.setLeft((int)((5d / 100 * width)));
views.get("panelednome").vw.setTop((int)((views.get("lblmensagem").vw.getTop())+(13d / 100 * height)));
views.get("paneledlogin").vw.setWidth((int)((views.get("panelednome").vw.getWidth())));
views.get("paneledlogin").vw.setLeft((int)((views.get("panelednome").vw.getLeft())));
views.get("paneledlogin").vw.setTop((int)((views.get("panelednome").vw.getTop())+(12d / 100 * height)));
views.get("paneledsenha").vw.setWidth((int)((views.get("paneledlogin").vw.getWidth())));
views.get("paneledsenha").vw.setLeft((int)((views.get("paneledlogin").vw.getLeft())));
views.get("paneledsenha").vw.setTop((int)((views.get("paneledlogin").vw.getTop())+(12d / 100 * height)));
views.get("paneledrepitasenha").vw.setWidth((int)((views.get("paneledsenha").vw.getWidth())));
views.get("paneledrepitasenha").vw.setLeft((int)((views.get("paneledsenha").vw.getLeft())));
views.get("paneledrepitasenha").vw.setTop((int)((views.get("paneledsenha").vw.getTop())+(12d / 100 * height)));
views.get("lblmostrarsenha").vw.setWidth((int)((views.get("paneledrepitasenha").vw.getWidth())/3d));
views.get("lblmostrarsenha").vw.setTop((int)((views.get("paneledrepitasenha").vw.getTop())+(views.get("paneledrepitasenha").vw.getHeight())));
views.get("lblmostrarsenha").vw.setLeft((int)(((views.get("paneledrepitasenha").vw.getLeft())+(views.get("paneledrepitasenha").vw.getWidth()))-(views.get("lblmostrarsenha").vw.getWidth())));
views.get("lblmostrarsenha").vw.setHeight((int)((5d / 100 * height)));
views.get("panelcadsalvo").vw.setWidth((int)((views.get("paneledrepitasenha").vw.getWidth())));
views.get("panelcadsalvo").vw.setLeft((int)((views.get("paneledrepitasenha").vw.getLeft())));
views.get("panelcadsalvo").vw.setTop((int)((views.get("paneledrepitasenha").vw.getTop())+(15.4d / 100 * height)));
views.get("btsalvar").vw.setWidth((int)((views.get("paneledrepitasenha").vw.getWidth())));
views.get("btsalvar").vw.setLeft((int)((views.get("paneledrepitasenha").vw.getLeft())));
views.get("btsalvar").vw.setTop((int)((views.get("paneledrepitasenha").vw.getTop())+(50d / 100 * width)));

}
}