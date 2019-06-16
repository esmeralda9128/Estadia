<%-- 
    Document   : 404
    Created on : 6/06/2019, 04:38:58 PM
    Author     : horo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>
<!doctype html>
<html class="no-js" lang="">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Página no encontrada</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="<%=context%>/img/MP-logo.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/bootstrap.min.css">
    <!-- font awesome CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/font-awesome.min.css">
    <!-- owl.carousel CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/owl.carousel.css">
    <link rel="stylesheet" href="<%=context%>/css/owl.theme.css">
    <link rel="stylesheet" href="<%=context%>/css/owl.transitions.css">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/animate.css">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/normalize.css">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- wave CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/wave/waves.min.css">
    <!-- Notika icon CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/notika-custom-icon.css">
    <!-- main CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/main.css">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/style.css">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="<%=context%>/css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="<%=context%>/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <!-- 404 Page area Start-->
    <div class="error-page-area">
        <div class="error-page-wrap">
            <i class="notika-icon notika-close"></i>
            <h2>ERROR <span class="counter">404</span></h2>
            <p>Lo sentimos revisa tu dirección URL o regresa al inicio</p>
            <a href="vistaLog.action" method="post" class="btn">Iniciar sesión</a>
           
        </div>
    </div>
    <!-- 404 Page area End-->
    <!-- jquery
		============================================ -->
    <script src="<%=context%>/js/vendor/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="<%=context%>/js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="<%=context%>/js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
    <script src="<%=context%>/js/jquery-price-slider.js"></script>
    <!-- owl.carousel JS
		============================================ -->
    <script src="<%=context%>/js/owl.carousel.min.js"></script>
    <!-- scrollUp JS
		============================================ -->
    <script src="<%=context%>/js/jquery.scrollUp.min.js"></script>
    <!-- meanmenu JS
		============================================ -->
    <script src="<%=context%>/js/meanmenu/jquery.meanmenu.js"></script>
    <!-- counterup JS
		============================================ -->
    <script src="<%=context%>/js/counterup/jquery.counterup.min.js"></script>
    <script src="<%=context%>/js/counterup/waypoints.min.js"></script>
    <script src="<%=context%>/js/counterup/counterup-active.js"></script>
    <!-- mCustomScrollbar JS
		============================================ -->
    <script src="<%=context%>/js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <!-- sparkline JS
		============================================ -->
    <script src="<%=context%>/js/sparkline/jquery.sparkline.min.js"></script>
    <script src="<%=context%>/js/sparkline/sparkline-active.js"></script>
    <!-- flot JS
		============================================ -->
    <script src="<%=context%>/js/flot/jquery.flot.js"></script>
    <script src="<%=context%>/js/flot/jquery.flot.resize.js"></script>
    <script src="<%=context%>/js/flot/flot-active.js"></script>
    <!-- knob JS
		============================================ -->
    <script src="<%=context%>/js/knob/jquery.knob.js"></script>
    <script src="<%=context%>/js/knob/jquery.appear.js"></script>
    <script src="<%=context%>/js/knob/knob-active.js"></script>
    <!--  wave JS
		============================================ -->
    <script src="<%=context%>/js/wave/waves.min.js"></script>
    <script src="<%=context%>/js/wave/wave-active.js"></script>
    <!--  Chat JS
		============================================ -->
    <script src="<%=context%>/js/chat/jquery.chat.js"></script>
    <!--  todo JS
		============================================ -->
    <script src="<%=context%>/js/todo/jquery.todo.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="<%=context%>/js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="<%=context%>/js/main.js"></script>
</body>

</html>