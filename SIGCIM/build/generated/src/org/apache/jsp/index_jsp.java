package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(context);
      out.write("/img/MP-logo.ico\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.transitions.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/meanmenu/meanmenu.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/notika-custom-icon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/wave/waves.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/wave/button.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/responsive.css\">\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/style.css\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio de sesión</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login_form\">\n");
      out.write("            <section class=\"login-wrapper\">\n");
      out.write("\n");
      out.write("                <form id=\"login\" method=\"post\" action=\"iniciarSesion\">      \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"form-example-wrap\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <img src=\"");
      out.print(context);
      out.write("/images/MP-logo.png\"alt=\"\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-example-int\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Usuario</label>\n");
      out.write("                                        <div class=\"nk-int-st\">\n");
      out.write("                                            <input type=\"text\" required name=\"user\" autocapitalize=\"off\" autocorrect=\"off\" class=\"form-control input-sm\" placeholder=\"Ingresa tu usuario\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-example-int mg-t-7\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Contraseña</label>\n");
      out.write("                                        <div class=\"nk-int-st\">\n");
      out.write("                                            <input  class=\"form-control input-sm\"  required name=\"pass\" type=\"password\" placeholder=\"Ingresa tu contraseña\">\n");
      out.write("                                            <div class=\"hide-show\">\n");
      out.write("                                                <span> Mostrar</span>                             \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <br/>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                        <div class=\"form-example-int mg-t-7\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success notika-btn-success\">Iniciar sesión</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wow.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/jquery-price-slider.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/meanmenu/jquery.meanmenu.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/counterup/counterup-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/scrollbar/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/sparkline/sparkline-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/flot/flot-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.knob.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/knob/knob-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/icheck/icheck.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/icheck/icheck-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wave/waves.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/wave/wave-active.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/chat/jquery.chat.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/todo/jquery.todo.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/plugins.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(context);
      out.write("/js/index.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
