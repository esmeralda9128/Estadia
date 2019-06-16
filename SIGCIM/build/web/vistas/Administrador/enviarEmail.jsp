<%-- 
    Document   : enviarEmail
    Created on : 12/06/2019, 01:30:29 PM
    Author     : Esmeralda Estefanía Rodríguez Ramos
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>
<!DOCTYPE html>
<html>

    <link rel="shortcut icon" type="image/x-icon" href="<%=context%>/img/MP-logo.ico">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <link rel="stylesheet" href="<%=context%>/style.css">
    <link rel="stylesheet" href="<%=context%>/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=context%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=context%>/css/owl.carousel.css">
    <link rel="stylesheet" href="<%=context%>/css/owl.theme.css">
    <link rel="stylesheet" href="<%=context%>/css/owl.transitions.css">
    <link rel="stylesheet" href="<%=context%>/css/meanmenu/meanmenu.min.css">
    <link rel="stylesheet" href="<%=context%>/css/animate.css">
    <link rel="stylesheet" href="<%=context%>/css/normalize.css">
    <link rel="stylesheet" href="<%=context%>/css/scrollbar/jquery.mCustomScrollbar.min.css">
    <link rel="stylesheet" href="<%=context%>/css/notika-custom-icon.css">
    <link rel="stylesheet" href="<%=context%>/css/wave/waves.min.css">
    <link rel="stylesheet" href="<%=context%>/css/wave/button.css">
    <link rel="stylesheet" href="<%=context%>/css/main.css">
    <link rel="stylesheet" href="<%=context%>/css/dialog/sweetalert2.min.css">
    <link rel="stylesheet" href="<%=context%>/css/dialog/dialog.css">
    <link rel="stylesheet" href="<%=context%>/css/responsive.css">
    <script src="<%=context%>/js/vendor/modernizr-2.8.3.min.js"></script>
    <link rel="stylesheet" href="<%=context%>/css/style.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviar Correo-Administrador</title>
    </head>
    <body>
        <!-- Start Header Top Area -->
        <div class="header-top-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-1 col-md-1 col-sm-4 col-xs-4">
                        <div class="logo-area">
                            <a href="#"><img src="<%=context%>/images/MP-logo.png" width="50" height="49"  alt="" /></a>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-4 col-xs-4">
                        <div class="basic-tb-en">
                            Administrador
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9 col-sm-4 col-xs-4">
                        <div class="header-top-menu">
                            <ul class="nav navbar-nav notika-top-nav">
                                <li class="nav-item"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle"><span><i class="notika-icon notika-settings"></i></span></a>
                                    <div role="menu" class="dropdown-menu message-dd chat-dd animated zoomIn">
                                        <div class="hd-mg-tt">
                                            <h2>Opciones</h2>
                                        </div>
                                        <button src=""  class="btn btn-success notika-btn-success dropbtn" id="sa-success" ><span class="notika-icon notika-support"></span>Perfil</button>
                                        <button src=""  class="btn btn-success notika-btn-success dropbtn" id="sa-success" ><span class="notika-icon notika-close"></span>Cerrar Sesión</button>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- End Header Top Area -->
        <!-- Mobile Menu start -->
        <div class="mobile-menu-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="mobile-menu">
                            <nav id="dropdown">
                                <ul class="mobile-menu-nav">
                                    <li><a data-toggle="collapse" data-target="#Charts" href="#">Clientes</a>
                                        <ul class="collapse dropdown-header-top">
                                            <li><a href="verClientesAdministrador">Ver Clientes</a></li>
                                            <li><a href="<%=context%>/vistas/Administrador/agregarCliente.jsp">Agergar Cliente</a></li>                                        

                                        </ul>
                                    </li>
                                    <li><a data-toggle="collapse" data-target="#demoevent" href="#">Contactos</a>
                                        <ul id="demoevent" class="collapse dropdown-header-top">
                                            <li><a href="inbox.html">Ver contactos</a></li>                                        
                                        </ul>
                                    </li>
                                    <li><a data-toggle="collapse" data-target="#demoevent" href="#">Email</a>
                                        <ul id="demoevent" class="collapse dropdown-header-top">
                                            <li><a href="inbox.html">Nuevo email</a></li>                                        
                                        </ul>
                                    </li>
                                    <li><a data-toggle="collapse" data-target="#democrou" href="#">Vendedores</a>
                                        <ul id="democrou" class="collapse dropdown-header-top">
                                            <li><a href="animations.html">Ver vendedores</a></li>
                                            <li><a href="animations.html">Agregar vendedor</a></li>
                                        </ul>
                                    </li>
                                    <li><a data-toggle="collapse" data-target="#democrou" href="#">Productos</a>
                                        <ul id="democrou" class="collapse dropdown-header-top">
                                            <li><a href="animations.html">Ver productos</a></li>
                                            <li><a href="animations.html">Agregar producto</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Mobile Menu end -->
        <!-- Main Menu area start-->
        <div class="main-menu-area mg-tb-40">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <ul class="nav nav-tabs notika-menu-wrap menu-it-icon-pro" >
                            <li  ><a data-toggle="tab" href="#inicio"><i  class="notika-icon notika-dollar"></i> Clientes</a>
                            </li>
                            <li  ><a data-toggle="tab" href="#contactos"><i class="notika-icon notika-phone"></i> Contactos</a>
                            </li>
                            <li class="active" ><a data-toggle="tab" href="#email"><i class="notika-icon notika-mail"></i> Email</a>
                            </li>
                            <li><a data-toggle="tab" href="#vendedores"><i class="notika-icon notika-finance"></i> Vendedores</a>
                            </li>
                            <li><a data-toggle="tab" href="#productos"><i class="notika-icon notika-tax"></i> Productos</a>
                            </li>
                        </ul>
                        <div class="tab-content custom-menu-content">
                            <div id="inicio" class="tab-pane notika-tab-menu-bg animated flipInX">
                                <ul class="notika-main-menu-dropdown">
                                    <li><a href="<%=context%>/vistas/Administrador/inico.jsp">Ver clientes</a>
                                    </li>
                                    <li><a href="<%=context%>/vistas/Administrador/agregarCliente.jsp">Agregar cliente</a>
                                    </li>

                                </ul>
                            </div>
                            <div id="contactos" class="tab-pane notika-tab-menu-bg animated flipInX">
                                <ul class="notika-main-menu-dropdown">
                                    <li><a href="inbox.html">Ver contactos</a>
                                    </li>

                                </ul>
                            </div>
                            <div id="email" class="tab-pane  active  notika-tab-menu-bg animated flipInX">
                                <ul class="notika-main-menu-dropdown">
                                    <li><a href="inbox.html">Email nuevo</a>
                                    </li>

                                </ul>
                            </div>
                            <div id="vendedores" class="tab-pane notika-tab-menu-bg animated flipInX">
                                <ul class="notika-main-menu-dropdown">
                                    <li><a href="inbox.html">Ver vendedores</a>
                                    </li>
                                    <li><a href="view-email.html">Agregar vendedor</a>
                                    </li>

                                </ul>
                            </div>
                            <div id="productos" class="tab-pane notika-tab-menu-bg animated flipInX">
                                <ul class="notika-main-menu-dropdown">
                                    <li><a href="animations.html">Ver productos</a>
                                    </li>
                                    <li><a href="google-map.html">Agregar Producto</a>
                                    </li>
                                    <li><a href="google-map.html">Hacer Pedido</a>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Main Menu area End-->
        <div class="inbox-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
                        <div class="view-mail-list sm-res-mg-t-30">
                            <div class="view-mail-hd">
                                <div class="view-mail-hrd">
                                    <h2>Nuevo Email</h2>
                                </div>
                            </div>
                            <div class="cmp-int mg-t-20">
                                <div class="row">
                                    <div class="col-lg-1 col-md-2 col-sm-2 col-xs-12">
                                        <div class="cmp-int-lb cmp-int-lb1 text-right">
                                            <span>Para: </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-11 col-md-10 col-sm-10 col-xs-12">
                                        <div class="form-group">
                                            <div class="nk-int-st cmp-int-in cmp-email-over">
                                                <input type="email" class="form-control" placeholder="example@email.com" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-1 col-md-2 col-sm-2 col-xs-12">
                                        <div class="cmp-int-lb cmp-int-lb1 text-right">
                                            <span>Bcc: </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-11 col-md-10 col-sm-10 col-xs-12">
                                        <div class="form-group">
                                            <div class="nk-int-st cmp-int-in cmp-email-over">
                                                <input type="email" class="form-control" placeholder="" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-1 col-md-2 col-sm-2 col-xs-12">
                                        <div class="cmp-int-lb text-right">
                                            <span>Asunto: </span>
                                        </div>
                                    </div>
                                    <div class="col-lg-11 col-md-10 col-sm-10 col-xs-12">
                                        <div class="form-group cmp-em-mg">
                                            <div class="nk-int-st cmp-int-in cmp-email-over">
                                                <input type="text" class="form-control" placeholder="" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="summernote-area">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="summernote-wrap mg-t-30">
                                                <div class="cmp-tb-hd">
                                                    <h2>HTML Editor</h2>
                                                    <p>Super Simple WYSIWYG Editor on Bootstrap</p>
                                                </div>
                                                <div class="cmp-tb-hd bsc-smp-sm">
                                                    <label>Basic Example</label>
                                                </div>
                                                <div class="html-editor"></div>
                                                <div class="cmp-tb-hd mg-t-20">
                                                    <h2>Click to edit</h2>
                                                    <p>You can edit content on the fly</p>
                                                </div>
                                                <div class="summernote-clickable">
                                                    <button class="btn btn-primary btn-sm hec-button">Click here to edit the content
                                                    </button>
                                                    <button class="btn btn-success btn-sm hec-save" style="display:none;">Save</button>
                                                </div>
                                                <div class="html-editor-click">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vehicula erat sit amet aliquam vehicula. Aliquam aliquet et risus et consequat. Quisque ultrices nulla eu magna vulputate, quis varius massa tempor. Suspendisse
                                                        sed condimentum purus, eget consequat dolor. Fusce aliquet ultricies porta. Nunc semper commodo leo at maximus. Duis maximus maximus leo, id lobortis nisi aliquam sit amet. Nullam vel ex id augue scelerisque congue sit
                                                        amet eget urna.</p>
                                                </div>
                                                <div class="cmp-tb-hd mg-t-20 air-mode-ctn">
                                                    <h2>Air-mode</h2>
                                                    <p>Air-mode gives clearer interface with hiddened toolbar. To reveal toolbar, select a text below where you want to shape up. </p>
                                                </div>
                                                <div class="html-editor-airmod" contenteditable="true">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce euismod quam vel lacinia facilisis. Sed condimentum nisi vel ante maximus, sit amet vestibulum leo euismod. Curabitur viverra faucibus nisi eu molestie. Donec convallis
                                                        finibus felis porttitor tristique. Nulla pretium est et ante dignissim.</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>



                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Start Footer area-->

        <!-- End Footer area-->

        <script src="<%=context%>/js/vendor/jquery-1.12.4.min.js"></script>
        <script src="<%=context%>/js/bootstrap.min.js"></script>
        <script src="<%=context%>/js/wow.min.js"></script>
        <script src="<%=context%>/js/jquery-price-slider.js"></script>
        <script src="<%=context%>/js/owl.carousel.min.js"></script>
        <script src="<%=context%>/js/jquery.scrollUp.min.js"></script>
        <script src="<%=context%>/js/meanmenu/jquery.meanmenu.js"></script>
        <script src="<%=context%>/js/counterup/jquery.counterup.min.js"></script>
        <script src="<%=context%>/js/counterup/waypoints.min.js"></script>
        <script src="<%=context%>/js/counterup/counterup-active.js"></script>
        <script src="<%=context%>/js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="<%=context%>/js/sparkline/jquery.sparkline.min.js"></script>
        <script src="<%=context%>/js/sparkline/sparkline-active.js"></script>
        <script src="<%=context%>/js/flot/jquery.flot.js"></script>
        <script src="<%=context%>/js/flot/jquery.flot.resize.js"></script>
        <script src="<%=context%>/js/flot/flot-active.js"></script>
        <script src="<%=context%>/js/knob/jquery.knob.js"></script>
        <script src="<%=context%>/js/knob/jquery.appear.js"></script>
        <script src="<%=context%>/js/knob/knob-active.js"></script>
        <script src="<%=context%>/js/chat/jquery.chat.js"></script>
        <script src="<%=context%>/js/todo/jquery.todo.js"></script>
        <script src="<%=context%>/js/wave/waves.min.js"></script>
        <script src="<%=context%>/js/wave/wave-active.js"></script>
        <script src="<%=context%>/js/plugins.js"></script>
        <script src="<%=context%>/js/data-table/jquery.dataTables.min.js"></script>
        <script src="<%=context%>/js/data-table/data-table-act.js"></script>
        <script src="<%=context%>/js/main.js"></script>

    </body>

</html>
