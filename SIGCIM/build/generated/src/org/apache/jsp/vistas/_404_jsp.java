package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String context = request.getContextPath();

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Página no encontrada</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- favicon\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(context);
      out.write("/img/MP-logo.ico\">\n");
      out.write("    <!-- Google Fonts\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/bootstrap.min.css\">\n");
      out.write("    <!-- font awesome CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/font-awesome.min.css\">\n");
      out.write("    <!-- owl.carousel CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.transitions.css\">\n");
      out.write("    <!-- animate CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/animate.css\">\n");
      out.write("    <!-- normalize CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/normalize.css\">\n");
      out.write("    <!-- mCustomScrollbar CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <!-- wave CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/wave/waves.min.css\">\n");
      out.write("    <!-- Notika icon CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/notika-custom-icon.css\">\n");
      out.write("    <!-- main CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/main.css\">\n");
      out.write("    <!-- style CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/style.css\">\n");
      out.write("    <!-- responsive CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/responsive.css\">\n");
      out.write("    <!-- modernizr JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <!-- 404 Page area Start-->\n");
      out.write("    <div class=\"error-page-area\">\n");
      out.write("        <div class=\"error-page-wrap\">\n");
      out.write("            <i class=\"notika-icon notika-close\"></i>\n");
      out.write("            <h2>ERROR <span class=\"counter\">404</span></h2>\n");
      out.write("            <p>Lo sentimos revisa tu dirección URL o regresa al inicio</p>\n");
      out.write("            <a href=\"vistaLog.action\" method=\"post\" class=\"btn\">Iniciar sesión</a>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- 404 Page area End-->\n");
      out.write("    <!-- jquery\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <!-- bootstrap JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- wow JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wow.min.js\"></script>\n");
      out.write("    <!-- price-slider JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/jquery-price-slider.js\"></script>\n");
      out.write("    <!-- owl.carousel JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/owl.carousel.min.js\"></script>\n");
      out.write("    <!-- scrollUp JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <!-- meanmenu JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/meanmenu/jquery.meanmenu.js\"></script>\n");
      out.write("    <!-- counterup JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/counterup-active.js\"></script>\n");
      out.write("    <!-- mCustomScrollbar JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/scrollbar/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <!-- sparkline JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/sparkline/sparkline-active.js\"></script>\n");
      out.write("    <!-- flot JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/flot-active.js\"></script>\n");
      out.write("    <!-- knob JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.knob.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/knob-active.js\"></script>\n");
      out.write("    <!--  wave JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wave/waves.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wave/wave-active.js\"></script>\n");
      out.write("    <!--  Chat JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/chat/jquery.chat.js\"></script>\n");
      out.write("    <!--  todo JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/todo/jquery.todo.js\"></script>\n");
      out.write("    <!-- plugins JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/plugins.js\"></script>\n");
      out.write("    <!-- main JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
