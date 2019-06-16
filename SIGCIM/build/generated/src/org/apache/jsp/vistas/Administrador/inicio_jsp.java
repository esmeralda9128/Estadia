package org.apache.jsp.vistas.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_var_includeParams_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_var_includeParams_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_url_var_includeParams_action.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_a_href.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("/css/dialog/sweetalert2.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/css/dialog/dialog.css\">\n");
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
      out.write("        <title>Inicio Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Header Top Area -->\n");
      out.write("        <div class=\"header-top-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-1 col-md-1 col-sm-4 col-xs-4\">\n");
      out.write("                        <div class=\"logo-area\">\n");
      out.write("                            <a href=\"#\"><img src=\"");
      out.print(context);
      out.write("/images/MP-logo.png\" width=\"50\" height=\"49\"  alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-4\">\n");
      out.write("                        <div class=\"basic-tb-en\">\n");
      out.write("                            Administrador\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-4 col-xs-4\">\n");
      out.write("                        <div class=\"header-top-menu\">\n");
      out.write("                            <ul class=\"nav navbar-nav notika-top-nav\">\n");
      out.write("                                <li class=\"nav-item\"><a href=\"#\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" class=\"nav-link dropdown-toggle\"><span><i class=\"notika-icon notika-settings\"></i></span></a>\n");
      out.write("                                    <div role=\"menu\" class=\"dropdown-menu message-dd chat-dd animated zoomIn\">\n");
      out.write("                                        <div class=\"hd-mg-tt\">\n");
      out.write("                                            <h2>Opciones</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button src=\"\"  class=\"btn btn-success notika-btn-success dropbtn\" id=\"sa-success\" ><span class=\"notika-icon notika-support\"></span>Perfil</button>\n");
      out.write("                                        <button src=\"\"  class=\"btn btn-success notika-btn-success dropbtn\" id=\"sa-success\" ><span class=\"notika-icon notika-close\"></span>Cerrar Sesión</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- End Header Top Area -->\n");
      out.write("        <!-- Mobile Menu start -->\n");
      out.write("        <div class=\"mobile-menu-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"mobile-menu\">\n");
      out.write("                            <nav id=\"dropdown\">\n");
      out.write("                                <ul class=\"mobile-menu-nav\">\n");
      out.write("                                    <li><a data-toggle=\"collapse\" data-target=\"#Charts\" href=\"#\">Clientes</a>\n");
      out.write("                                        <ul class=\"collapse dropdown-header-top\">\n");
      out.write("                                            <li><a href=\"verClientesAdministrador\">Ver Clientes</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(context);
      out.write("/vistas/Administrador/agregarCliente.jsp\">Agergar Cliente</a></li>                                        \n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a data-toggle=\"collapse\" data-target=\"#demoevent\" href=\"#\">Contactos</a>\n");
      out.write("                                        <ul id=\"demoevent\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                            <li><a href=\"inbox.html\">Ver contactos</a></li>                                        \n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a data-toggle=\"collapse\" data-target=\"#demoevent\" href=\"#\">Email</a>\n");
      out.write("                                        <ul id=\"demoevent\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                            <li><a href=\"inbox.html\">Nuevo email</a></li>                                        \n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a data-toggle=\"collapse\" data-target=\"#democrou\" href=\"#\">Vendedores</a>\n");
      out.write("                                        <ul id=\"democrou\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                            <li><a href=\"animations.html\">Ver vendedores</a></li>\n");
      out.write("                                            <li><a href=\"animations.html\">Agregar vendedor</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a data-toggle=\"collapse\" data-target=\"#democrou\" href=\"#\">Productos</a>\n");
      out.write("                                        <ul id=\"democrou\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                            <li><a href=\"animations.html\">Ver productos</a></li>\n");
      out.write("                                            <li><a href=\"animations.html\">Agregar producto</a></li>\n");
      out.write("                                            <li><a href=\"abrirPedidoAdmin\">Hacer Pedido</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Mobile Menu end -->\n");
      out.write("        <!-- Main Menu area start-->\n");
      out.write("        <div class=\"main-menu-area mg-tb-40\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <ul class=\"nav nav-tabs notika-menu-wrap menu-it-icon-pro\" >\n");
      out.write("                            <li class=\"active\" ><a data-toggle=\"tab\" href=\"#inicio\"><i  class=\"notika-icon notika-dollar\"></i> Clientes</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li ><a data-toggle=\"tab\" href=\"#contactos\"><i  class=\"notika-icon notika-phone\"></i> Contactos</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a data-toggle=\"tab\" href=\"#email\"><i class=\"notika-icon notika-mail\"></i> Email</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a data-toggle=\"tab\" href=\"#vendedores\"><i class=\"notika-icon notika-finance\"></i> Vendedores</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a data-toggle=\"tab\" href=\"#productos\"><i class=\"notika-icon notika-tax\"></i> Productos</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content custom-menu-content\">\n");
      out.write("                            <div id=\"inicio\" class=\"tab-pane active notika-tab-menu-bg animated flipInX\">\n");
      out.write("                                <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                    <li><a href=\"");
      out.print(context);
      out.write("/vistas/Administrador/inico.jsp\">Ver clientes</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"");
      out.print(context);
      out.write("/vistas/Administrador/agregarCliente.jsp\">Agregar cliente</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"contactos\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                                <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                    <li><a href=\"inbox.html\">Ver contactos</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"email\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                                <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                    <li><a href=\"inbox.html\">Email nuevo</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"vendedores\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                                <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                    <li><a href=\"inbox.html\">Ver vendedores</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"view-email.html\">Agregar vendedor</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"productos\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                                <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                    <li><a href=\"animations.html\">Ver productos</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"google-map.html\">Agregar Producto</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"abrirPedidoAdmin\">Hacer Pedido</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Main Menu area End-->\n");
      out.write("\n");
      out.write("        <!-- Data Table area Start-->\n");
      out.write("        <div class=\"data-table-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"data-table-list\">\n");
      out.write("                            <div class=\"basic-tb-hd\">\n");
      out.write("                                <h2>Clientes</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table id=\"data-table-basic\" class=\"table table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>No.</th>\n");
      out.write("                                            <th>Nombre Comercial</th>\n");
      out.write("                                            <th>Razón Social</th>\n");
      out.write("                                            <th>RFC</th>\n");
      out.write("                                            <th>Calle</th>\n");
      out.write("                                            <th>Colonia</th>\n");
      out.write("                                            <th>Municipio/Delegación</th>\n");
      out.write("                                            <th>Estado</th>\n");
      out.write("                                            <th>Teléfono</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Tipo</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                    <tfoot>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>No.</th>\n");
      out.write("                                            <th>Nombre Comercial</th>\n");
      out.write("                                            <th>Razón Social</th>\n");
      out.write("                                            <th>RFC</th>\n");
      out.write("                                            <th>Calle</th>\n");
      out.write("                                            <th>Colonia</th>\n");
      out.write("                                            <th>Municipio/Delegación</th>\n");
      out.write("                                            <th>Estado</th>\n");
      out.write("                                            <th>Teléfono</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Tipo</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tfoot>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Data Table area End-->\n");
      out.write("        <!-- Start Footer area-->\n");
      out.write("\n");
      out.write("        <!-- End Footer area-->\n");
      out.write("\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/wow.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/jquery-price-slider.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/meanmenu/jquery.meanmenu.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/counterup/jquery.counterup.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/counterup/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/counterup/counterup-active.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/scrollbar/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/sparkline/sparkline-active.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/flot/flot-active.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.knob.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/knob/jquery.appear.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/knob/knob-active.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/chat/jquery.chat.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/todo/jquery.todo.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/wave/waves.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/wave/wave-active.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/plugins.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/data-table/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/data-table/data-table-act.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(context);
      out.write("/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("clientes");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td>                                                    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                                <td> ");
        if (_jspx_meth_s_url_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </td>\n");
        out.write("                                            </tr>\n");
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_0.setAction("verClienteAdmin");
    _jspx_th_s_url_0.setIncludeParams("doPost");
    _jspx_th_s_url_0.setVar("wiLink");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_0.setName("unCliente.idCliente");
    _jspx_th_s_param_0.setValue("idCliente");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_0.setHref("%{wiLink}");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_property_0.setValue("numCliente");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_1.setAction("verClienteAdmin");
    _jspx_th_s_url_1.setIncludeParams("post");
    _jspx_th_s_url_1.setVar("wiLink");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_1);
    _jspx_th_s_param_1.setName("unCliente.idCliente");
    _jspx_th_s_param_1.setValue("idCliente");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_s_a_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_1.setPageContext(_jspx_page_context);
    _jspx_th_s_a_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_1.setHref("%{wiLink}");
    int _jspx_eval_s_a_1 = _jspx_th_s_a_1.doStartTag();
    if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_1);
    _jspx_th_s_property_1.setValue("nombre");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_2.setAction("verClienteAdmin");
    _jspx_th_s_url_2.setIncludeParams("post");
    _jspx_th_s_url_2.setVar("wiLink");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_2 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_2.setPageContext(_jspx_page_context);
    _jspx_th_s_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_2);
    _jspx_th_s_param_2.setName("unCliente.idCliente");
    _jspx_th_s_param_2.setValue("idCliente");
    int _jspx_eval_s_param_2 = _jspx_th_s_param_2.doStartTag();
    if (_jspx_th_s_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_2);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_2);
    return false;
  }

  private boolean _jspx_meth_s_a_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_2.setPageContext(_jspx_page_context);
    _jspx_th_s_a_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_2.setHref("%{wiLink}");
    int _jspx_eval_s_a_2 = _jspx_th_s_a_2.doStartTag();
    if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_2);
    _jspx_th_s_property_2.setValue("razonSocial");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_3.setAction("verClienteAdmin");
    _jspx_th_s_url_3.setIncludeParams("post");
    _jspx_th_s_url_3.setVar("wiLink");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_3 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_3.setPageContext(_jspx_page_context);
    _jspx_th_s_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_3);
    _jspx_th_s_param_3.setName("unCliente.idCliente");
    _jspx_th_s_param_3.setValue("idCliente");
    int _jspx_eval_s_param_3 = _jspx_th_s_param_3.doStartTag();
    if (_jspx_th_s_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_3);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_3);
    return false;
  }

  private boolean _jspx_meth_s_a_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_3.setPageContext(_jspx_page_context);
    _jspx_th_s_a_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_3.setHref("%{wiLink}");
    int _jspx_eval_s_a_3 = _jspx_th_s_a_3.doStartTag();
    if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_3);
    _jspx_th_s_property_3.setValue("rfc");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_4.setAction("verClienteAdmin");
    _jspx_th_s_url_4.setIncludeParams("post");
    _jspx_th_s_url_4.setVar("wiLink");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_4 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_4.setPageContext(_jspx_page_context);
    _jspx_th_s_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_4);
    _jspx_th_s_param_4.setName("unCliente.idCliente");
    _jspx_th_s_param_4.setValue("idCliente");
    int _jspx_eval_s_param_4 = _jspx_th_s_param_4.doStartTag();
    if (_jspx_th_s_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_4);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_4);
    return false;
  }

  private boolean _jspx_meth_s_a_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_4.setPageContext(_jspx_page_context);
    _jspx_th_s_a_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_4.setHref("%{wiLink}");
    int _jspx_eval_s_a_4 = _jspx_th_s_a_4.doStartTag();
    if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_4);
    _jspx_th_s_property_4.setValue("calle");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_5.setAction("verClienteAdmin");
    _jspx_th_s_url_5.setIncludeParams("post");
    _jspx_th_s_url_5.setVar("wiLink");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_param_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_5 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_5.setPageContext(_jspx_page_context);
    _jspx_th_s_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_5);
    _jspx_th_s_param_5.setName("unCliente.idCliente");
    _jspx_th_s_param_5.setValue("idCliente");
    int _jspx_eval_s_param_5 = _jspx_th_s_param_5.doStartTag();
    if (_jspx_th_s_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_5);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_5);
    return false;
  }

  private boolean _jspx_meth_s_a_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_5.setPageContext(_jspx_page_context);
    _jspx_th_s_a_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_5.setHref("%{wiLink}");
    int _jspx_eval_s_a_5 = _jspx_th_s_a_5.doStartTag();
    if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_5);
    _jspx_th_s_property_5.setValue("colonia");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_url_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_6.setAction("verClienteAdmin");
    _jspx_th_s_url_6.setIncludeParams("post");
    _jspx_th_s_url_6.setVar("wiLink");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_param_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_6 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_6.setPageContext(_jspx_page_context);
    _jspx_th_s_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_6);
    _jspx_th_s_param_6.setName("unCliente.idCliente");
    _jspx_th_s_param_6.setValue("idCliente");
    int _jspx_eval_s_param_6 = _jspx_th_s_param_6.doStartTag();
    if (_jspx_th_s_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_6);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_6);
    return false;
  }

  private boolean _jspx_meth_s_a_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_6 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_6.setPageContext(_jspx_page_context);
    _jspx_th_s_a_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_6.setHref("%{wiLink}");
    int _jspx_eval_s_a_6 = _jspx_th_s_a_6.doStartTag();
    if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_6);
    _jspx_th_s_property_6.setValue("municipio");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_url_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_7.setAction("verClienteAdmin");
    _jspx_th_s_url_7.setIncludeParams("post");
    _jspx_th_s_url_7.setVar("wiLink");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_param_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_7 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_7.setPageContext(_jspx_page_context);
    _jspx_th_s_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_7);
    _jspx_th_s_param_7.setName("unCliente.idCliente");
    _jspx_th_s_param_7.setValue("idCliente");
    int _jspx_eval_s_param_7 = _jspx_th_s_param_7.doStartTag();
    if (_jspx_th_s_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_7);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_7);
    return false;
  }

  private boolean _jspx_meth_s_a_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_7 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_7.setPageContext(_jspx_page_context);
    _jspx_th_s_a_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_7.setHref("%{wiLink}");
    int _jspx_eval_s_a_7 = _jspx_th_s_a_7.doStartTag();
    if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_7);
    _jspx_th_s_property_7.setValue("estado");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_url_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_8.setAction("verClienteAdmin");
    _jspx_th_s_url_8.setIncludeParams("post");
    _jspx_th_s_url_8.setVar("wiLink");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_eval_s_url_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_param_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_8 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_8.setPageContext(_jspx_page_context);
    _jspx_th_s_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_8);
    _jspx_th_s_param_8.setName("unCliente.idCliente");
    _jspx_th_s_param_8.setValue("idCliente");
    int _jspx_eval_s_param_8 = _jspx_th_s_param_8.doStartTag();
    if (_jspx_th_s_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_8);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_8);
    return false;
  }

  private boolean _jspx_meth_s_a_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_8 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_8.setPageContext(_jspx_page_context);
    _jspx_th_s_a_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_8.setHref("%{wiLink}");
    int _jspx_eval_s_a_8 = _jspx_th_s_a_8.doStartTag();
    if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_8);
    _jspx_th_s_property_8.setValue("telefono");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_url_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_9.setAction("verClienteAdmin");
    _jspx_th_s_url_9.setIncludeParams("post");
    _jspx_th_s_url_9.setVar("wiLink");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_param_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_9 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_9.setPageContext(_jspx_page_context);
    _jspx_th_s_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_9);
    _jspx_th_s_param_9.setName("unCliente.idCliente");
    _jspx_th_s_param_9.setValue("idCliente");
    int _jspx_eval_s_param_9 = _jspx_th_s_param_9.doStartTag();
    if (_jspx_th_s_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_9);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_9);
    return false;
  }

  private boolean _jspx_meth_s_a_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_9 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_9.setPageContext(_jspx_page_context);
    _jspx_th_s_a_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_9.setHref("%{wiLink}");
    int _jspx_eval_s_a_9 = _jspx_th_s_a_9.doStartTag();
    if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
    return false;
  }

  private boolean _jspx_meth_s_property_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_9);
    _jspx_th_s_property_9.setValue("email");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }

  private boolean _jspx_meth_s_url_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_includeParams_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_10.setAction("verClienteAdmin");
    _jspx_th_s_url_10.setIncludeParams("post");
    _jspx_th_s_url_10.setVar("wiLink");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_var_includeParams_action.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_param_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_10 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_10.setPageContext(_jspx_page_context);
    _jspx_th_s_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_10);
    _jspx_th_s_param_10.setName("unCliente.idCliente");
    _jspx_th_s_param_10.setValue("idCliente");
    int _jspx_eval_s_param_10 = _jspx_th_s_param_10.doStartTag();
    if (_jspx_th_s_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_10);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_10);
    return false;
  }

  private boolean _jspx_meth_s_a_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_10 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_10.setPageContext(_jspx_page_context);
    _jspx_th_s_a_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_10.setHref("%{wiLink}");
    int _jspx_eval_s_a_10 = _jspx_th_s_a_10.doStartTag();
    if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
    return false;
  }

  private boolean _jspx_meth_s_property_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_10 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_10.setPageContext(_jspx_page_context);
    _jspx_th_s_property_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_10);
    _jspx_th_s_property_10.setValue("tipo");
    int _jspx_eval_s_property_10 = _jspx_th_s_property_10.doStartTag();
    if (_jspx_th_s_property_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
    return false;
  }
}
