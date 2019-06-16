<%-- 
    Document   : pruebas formularios
    Created on : 27/05/2019, 09:31:16 AM
    Author     : horo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
    <head>
        <title>Agregar campos al formulario dinámicamente</title>
        <script src="<%=context%>/js/jquery-1.4.1.min.js"></script>
        <script>
            jQuery.fn.generaNuevosCampos = function(etiqueta, nombreCampo, indice){
            $(this).each(function(){
            elem = $(this); }{
            elem.data("etiqueta", etiqueta);
            elem.data("nombreCampo", nombreCampo);
            elem.data("indice", indice);
            elem.click(function(e){
            e.preventDefault();
            elem = $(this);
            etiqueta = elem.data("etiqueta");
            nombreCampo = elem.data("nombreCampo");
            indice = elem.data("indice");
            texto_insertar = '<p>' + etiqueta + ' ' + indice + ':<br><input type="text" name="' + nombreCampo + indice + '" /></p>';
            indice ++;
            elem.data("indice", indice);
            nuevo_campo = $(texto_insertar);
            elem.before(nuevo_campo);
            });
            });
            return this;
            }
            $(document).ready(function(){
            $("#mascampos").generaNuevosCampos("Compra", "compra", 2);
            });
        </script>
    </head>

    <body>
        <form>
            <p>
                Nombre:<br>
                <input type="Text" name="nombre">
            </p><p>
                Edad:<br>
                <input type="Text" name="Edad">
            </p><p>
                Compra:<br>
                <input type="Text" name="compra1">
            <p>
                <a href="#" id="mascampos">Más campos</a>
            </p><p>
                <input type=submit value="enviar">
            </p>
        </form>


    </body>


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
    <!-- Input Mask JS
                ============================================ -->
    <script src="<%=context%>/js/jasny-bootstrap.min.js"></script>
    <!-- icheck JS
                ============================================ -->
    <script src="<%=context%>/js/icheck/icheck.min.js"></script>
    <script src="<%=context%>/js/icheck/icheck-active.js"></script>
    <!-- rangle-slider JS
                ============================================ -->
    <script src="<%=context%>/js/rangle-slider/jquery-ui-1.10.4.custom.min.js"></script>
    <script src="<%=context%>/js/rangle-slider/jquery-ui-touch-punch.min.js"></script>
    <script src="<%=context%>/js/rangle-slider/rangle-active.js"></script>
    <!-- datapicker JS
                ============================================ -->
    <script src="<%=context%>/js/datapicker/bootstrap-datepicker.js"></script>
    <script src="<%=context%>/js/datapicker/datepicker-active.js"></script>
    <!-- bootstrap select JS
                ============================================ -->
    <script src="<%=context%>/js/bootstrap-select/bootstrap-select.js"></script>
    <!--  color-picker JS
                ============================================ -->
    <script src="<%=context%>/js/color-picker/farbtastic.min.js"></script>
    <script src="<%=context%>/js/color-picker/color-picker.js"></script>
    <!--  notification JS
                ============================================ -->
    <script src="<%=context%>/js/notification/bootstrap-growl.min.js"></script>
    <script src="<%=context%>/js/notification/notification-active.js"></script>
    <!--  summernote JS
                ============================================ -->
    <script src="<%=context%>/js/summernote/summernote-updated.min.js"></script>
    <script src="<%=context%>/js/summernote/summernote-active.js"></script>
    <!-- dropzone JS
                ============================================ -->
    <script src="<%=context%>/js/dropzone/dropzone.js"></script>
    <!--  wave JS
                ============================================ -->
    <script src="<%=context%>/js/wave/waves.min.js"></script>
    <script src="<%=context%>/js/wave/wave-active.js"></script>
    <!--  chosen JS
                ============================================ -->
    <script src="<%=context%>/js/chosen/chosen.jquery.js"></script>
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
</html>
