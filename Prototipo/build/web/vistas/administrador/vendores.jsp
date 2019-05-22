<%-- 
    Document   : vendores
    Created on : 22/05/2019, 01:17:12 PM
    Author     : horo_
--%>

%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>
<!DOCTYPE html>
<html>

    <link rel="shortcut icon" type="image/x-icon" href="<%=context%>/img/MP-logo.ico">
    <link rel="stylesheet" href="<%=context%>/css/style.css">
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
    <link rel="stylesheet" href="<%=context%>/css/responsive.css">
    <script src="<%=context%>/js/vendor/modernizr-2.8.3.min.js"></script>
    <link rel="stylesheet" href="<%=context%>/css/style.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Administrador</title>
    </head>
    
    <!-- Start Header Top Area -->
    <div class="header-top-area" >
        <div class="container">
            <div class="row">
                <!-- As a link -->
                <!-- Image and text -->
                <nav class="navbar navbar-light bg-light">
                    <a class="navbar-brand" href="#">
                        <img src="<%=context%>/images/MP-logo.png" width="50" height="49" class="d-inline-block align-top" alt="">
                    </a>
                    <div class="offset-md-2" >
                       <div class="basic-tb-hd">
                            <h2>Administrador</h2>
                        </div>
                    </div>
                   
                </nav>

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
                                        <li><a href="index.html">Ver Clientes</a></li>
                                        <li><a href="index-2.html">Agergar Clientes</a></li>
                                        <li><a href="index-3.html">Seguimiento</a></li>

                                    </ul>
                                </li>
                                <li><a data-toggle="collapse" data-target="#demoevent" href="#">Email</a>
                                    <ul id="demoevent" class="collapse dropdown-header-top">
                                        <li><a href="inbox.html">Inbox</a></li>
                                        <li><a href="view-email.html">View Email</a></li>
                                        <li><a href="compose-email.html">Compose Email</a></li>
                                    </ul>
                                </li>
                                <li><a data-toggle="collapse" data-target="#democrou" href="#">Vendedores</a>
                                    <ul id="democrou" class="collapse dropdown-header-top">
                                        <li><a href="animations.html">Ver vendedores</a></li>
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
                        <li class="active" ><a data-toggle="tab" href="#Home"><i  class="notika-icon notika-dollar"></i> Clientes</a>
                        </li>
                        <li><a data-toggle="tab" href="#mailbox"><i class="notika-icon notika-mail"></i> Email</a>
                        </li>
                        <li><a data-toggle="tab" href="#Interface"><i class="notika-icon notika-support"></i> Vendedores</a>
                        </li>

                        </li>
                    </ul>
                    <div class="tab-content custom-menu-content">
                        <div id="Home" class="tab-pane active notika-tab-menu-bg animated flipInX">
                            <ul class="notika-main-menu-dropdown">
                                <li><a href="<%=context%>/vistas/administrador/inicio.jsp">Ver Clientes</a>
                                </li>
                                <li><a href="<%=context%>/vistas/administrador/agregarCliente.jsp">Agregar Cliente</a>
                                </li>
                            </ul>
                        </div>
                        <div id="mailbox" class="tab-pane notika-tab-menu-bg animated flipInX">
                            <ul class="notika-main-menu-dropdown">
                                <li><a href="inbox.html">Inbox</a>
                                </li>
                                <li><a href="view-email.html">View Email</a>
                                </li>
                                <li><a href="compose-email.html">Compose Email</a>
                                </li>
                            </ul>
                        </div>
                        <div id="Interface" class="tab-pane notika-tab-menu-bg animated flipInX">
                            <ul class="notika-main-menu-dropdown">
                                <li><a href="animations.html">Animations</a>
                                </li>
                                <li><a href="google-map.html">Google Map</a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Main Menu area End-->

    <!-- Data Table area Start-->
   
    <!-- Start Footer area-->
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
<!-- End Footer area-->
</body>

</html>