package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mas_0020preubas_0020formaurios_0020dinamicos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("a = 0;\n");
      out.write("function addCancion(){\n");
      out.write("        a++;\n");
      out.write("\n");
      out.write("        var div = document.createElement('div');\n");
      out.write("        div.setAttribute('class', 'form-inline');\n");
      out.write("            div.innerHTML = '<div style=\"clear:both\" class=\"cancion_'+a+' col-md-offset-1 col-md-6\"><input class=\"form-control\" name=\"cancion_'+a+'\" type=\"text\"/></div><div class=\"cancion_'+a+' col-md-2\"\"><input class=\"form-control\" name=\"duracion_'+a+'\" type=\"text\"/></div>';\n");
      out.write("            document.getElementById('canciones').appendChild(div);document.getElementById('canciones').appendChild(div);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h3>Formulario de canciones de CD</h3>\n");
      out.write("    <form action=\"formulario2.html\" id=\"formulario\" method=\"get\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-offset-1 col-md-4\"><label>Nombre CD</label></div>\n");
      out.write("        <div class=\"col-md-4\"><input class=\"form-control\" name=\"nombre_cd\" type=\"text\"/></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-offset-1 col-md-6\"><label>T&iacute;tulo canci&oacute;n</label></div>\n");
      out.write("        <div class=\"col-md-2\"><label>Duraci&oacute;n</label></div>\n");
      out.write("        <div class=\"col-md-1\"><input type=\"button\" class=\"btn btn-success\" id=\"add_cancion()\" onClick=\"addCancion()\" value=\"+\" /></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- El id=\"canciones\" indica que la función de JavaScript dejará aquí el resultado -->\n");
      out.write("    <div class=\"row\" id=\"canciones\">\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
