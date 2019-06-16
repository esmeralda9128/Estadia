package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iconos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    String context = request.getContextPath();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(context);
      out.write("/img/MP-logo.ico\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/owl.transitions.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/meanmenu/meanmenu.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/notika-custom-icon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/wave/waves.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/wave/button.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/responsive.css\">\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Iconos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .notika-icon {\n");
      out.write("              \n");
      out.write("              line-height: 6;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h1>Iconos</h1>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <i class=\"notika-icon notika-support icon-lg\">Support</i>\n");
      out.write("                <i class=\"notika-icon notika-menu-befores\">Befores</i>\n");
      out.write("                <i class=\"notika-icon notika-menu-sidebar\">sidebar</i>\n");
      out.write("                <i class=\"notika-icon notika-skype\">Skype</i>\n");
      out.write("                <i class=\"notika-icon notika-menu-after\">After</i>\n");
      out.write("                <i class=\"notika-icon notika-app\">App</i>\n");
      out.write("                <i class=\"notika-icon notika-form\">Form</i>\n");
      out.write("                <i class=\"notika-icon notika-windows\">Windows</i>\n");
      out.write("                <i class=\"notika-icon notika-bar-chart\">Chart</i>\n");
      out.write("                <i class=\"notika-icon notika-alarm\">Alarm</i>\n");
      out.write("                <i class=\"notika-icon notika-arrow-right\">Arrow Right</i>\n");
      out.write("          \n");
      out.write("                <i class=\"notika-icon notika-avable\">Avable</i>\n");
      out.write("                <i class=\"notika-icon notika-back\">Back</i>\n");
      out.write("                <i class=\"notika-icon notika-calendar\">Calendar</i>\n");
      out.write("                <i class=\"notika-icon notika-chat\">Chat</i>\n");
      out.write("                <i class=\"notika-icon notika-checked\">Checked</i>\n");
      out.write("                <i class=\"notika-icon notika-close\">Close</i>\n");
      out.write("                <i class=\"notika-icon notika-cloud\">Cloud</i>\n");
      out.write("                <i class=\"notika-icon notika-credit-card\">Credit Card</i>\n");
      out.write("                <i class=\"notika-icon notika-dollar\">Dollar</i>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <i class=\"notika-icon notika-dot\">Dot</i>\n");
      out.write("                <i class=\"notika-icon notika-down-arrow\">Down Arrow</i>\n");
      out.write("                <i class=\"notika-icon notika-draft\">Draft</i>\n");
      out.write("                <i class=\"notika-icon notika-edit\">Edit</i>\n");
      out.write("                <i class=\"notika-icon notika-eye\">Eye</i>\n");
      out.write("                <i class=\"notika-icon notika-facebook\">Facebook</i>\n");
      out.write("                <i class=\"notika-icon notika-file\">File</i>\n");
      out.write("                <i class=\"notika-icon notika-finance\">Finance</i>\n");
      out.write("                <i class=\"notika-icon notika-flag\">Flag</i>\n");
      out.write("                <i class=\"notika-icon notika-house\">House</i>\n");
      out.write("                <i class=\"notika-icon notika-ip-locator\">Ip Locator</i>\n");
      out.write("                <i class=\"notika-icon notika-left-arrow\">Left arrow</i>\n");
      out.write("                <i class=\"notika-icon notika-mail\">Mail</i>\n");
      out.write("                <i class=\"notika-icon notika-map\">Map</i>\n");
      out.write("                <i class=\"notika-icon notika-menu\">Menu</i>\n");
      out.write("                <i class=\"notika-icon notika-menus\">Menus</i>\n");
      out.write("                <i class=\"notika-icon notika-minus-symbol\">Minus Symbol</i>\n");
      out.write("                <i class=\"notika-icon notika-more-button\">More button</i>\n");
      out.write("                <i class=\"notika-icon notika-next\">Next</i>\n");
      out.write("                <i class=\"notika-icon notika-next-pro\">Next Pro</i>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <i class=\"notika-icon notika-paperclip\">PaperClip</i>\n");
      out.write("                <i class=\"notika-icon notika-phone\">Phone</i>\n");
      out.write("                <i class=\"notika-icon notika-picture\">Picture</i>\n");
      out.write("                <i class=\"notika-icon notika-pinterest\">Pinterest</i>\n");
      out.write("                <i class=\"notika-icon notika-plus-symbol\">Plus Symbol</i>\n");
      out.write("                <i class=\"notika-icon notika-print\">Print</i>\n");
      out.write("                <i class=\"notika-icon notika-promos\">Promos</i>\n");
      out.write("                <i class=\"notika-icon notika-refresh\">Refresh</i>\n");
      out.write("                <i class=\"notika-icon notika-right-arrow\">Right Arrow</i>\n");
      out.write("                <i class=\"notika-icon notika-search\">Search</i>\n");
      out.write("                <i class=\"notika-icon notika-sent\">Sent</i>\n");
      out.write("                <i class=\"notika-icon notika-settings\">Settings</i>\n");
      out.write("                <i class=\"notika-icon notika-social\">Social</i>\n");
      out.write("                <i class=\"notika-icon notika-star\">Start</i>\n");
      out.write("                <i class=\"notika-icon notika-success\">Success</i>\n");
      out.write("                <i class=\"notika-icon notika-tax\">Tax</i>\n");
      out.write("                <i class=\"notika-icon notika-trash\">Trash</i>\n");
      out.write("                <i class=\"notika-icon notika-travel\">Travel</i>\n");
      out.write("                <i class=\"notika-icon notika-twitter\">Twitter</i>\n");
      out.write("                <i class=\"notika-icon notika-up-arrow\">Up arrow</i>\n");
      out.write("                <i class=\"notika-icon notika-wifi\">Wifi</i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
