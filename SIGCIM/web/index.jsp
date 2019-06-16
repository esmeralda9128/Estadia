<%-- 
    Document   : index
    Created on : 6/06/2019, 08:46:33 AM
    Author     : Esmeralda Estefanía Rodríguez Ramos
--%>

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
    <link rel="stylesheet" href="<%=context%>/css/responsive.css">
    <script src="<%=context%>/js/vendor/modernizr-2.8.3.min.js"></script>
    <link rel="stylesheet" href="<%=context%>/css/style.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión</title>
    </head>
    <body>
        <div class="login_form">
            <section class="login-wrapper">

                <form id="login" method="post" action="iniciarSesion">      
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="form-example-wrap">
                                <div class="logo">
                                    <img src="<%=context%>/images/MP-logo.png"alt=""></a>
                                </div>
                                <div class="form-example-int">
                                    <div class="form-group">
                                        <label>Usuario</label>
                                        <div class="nk-int-st">
                                            <input type="text" required name="user" autocapitalize="off" autocorrect="off" class="form-control input-sm" placeholder="Ingresa tu usuario">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-example-int mg-t-7">
                                    <div class="form-group">
                                        <label>Contraseña</label>
                                        <div class="nk-int-st">
                                            <input  class="form-control input-sm"  required name="pass" type="password" placeholder="Ingresa tu contraseña">
                                            <div class="hide-show">
                                                <span> Mostrar</span>                             
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <br/>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="form-example-int mg-t-7">
                                            <button type="submit" class="btn btn-success notika-btn-success">Iniciar sesión</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </body>

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
    <script src="<%=context%>/js/icheck/icheck.min.js"></script>
    <script src="<%=context%>/js/icheck/icheck-active.js"></script>
    <script src="<%=context%>/js/wave/waves.min.js"></script>
    <script src="<%=context%>/js/wave/wave-active.js"></script>
    <script src="<%=context%>/js/chat/jquery.chat.js"></script>
    <script src="<%=context%>/js/todo/jquery.todo.js"></script>
    <script src="<%=context%>/js/plugins.js"></script>
    <script src="<%=context%>/js/index.js"></script>


</html>
