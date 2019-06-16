<%-- 
    Document   : mas preubas formaurios dinamicos
    Created on : 4/06/2019, 09:09:00 AM
    Author     : horo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>

<!DOCTYPE html>
<html>
    <head>

        <!-- Latest compiled and minified CSS -->

        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Form Components | Notika - Notika Admin Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

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
        <!-- meanmenu CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/meanmenu/meanmenu.min.css">
        <!-- animate CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/animate.css">
        <!-- summernote CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/summernote/summernote.css">
        <!-- Range Slider CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/themesaller-forms.css">
        <!-- normalize CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/normalize.css">
        <!-- mCustomScrollbar CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/scrollbar/jquery.mCustomScrollbar.min.css">
        <!-- Notika icon CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/notika-custom-icon.css">
        <!-- bootstrap select CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/bootstrap-select/bootstrap-select.css">
        <!-- datapicker CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/datapicker/datepicker3.css">
        <!-- Color Picker CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/color-picker/farbtastic.css">
        <!-- main CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/chosen/chosen.css">
        <!-- notification CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/notification/notification.css">
        <!-- dropzone CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/dropzone/dropzone.css">
        <!-- wave CSS
                    ============================================ -->
        <link rel="stylesheet" href="<%=context%>/css/wave/waves.min.css">
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

    <body style="background: white">
        <div class="container">
            <h3>Formulario de canciones de CD</h3>
            <form action="formulario2.html" id="formulario" method="get">
                <div class="row">
                    <div class="col-md-offset-1 col-md-4"><label>Nombre CD</label></div>
                    <div class="col-md-4"><input class="form-control" name="nombre_cd" type="text"/></div>
                </div>
                <div class="row">
                    <div class="col-md-offset-1 col-md-6"><label>T&iacute;tulo canci&oacute;n</label></div>
                    <div class="col-md-2"><label>Duraci&oacute;n</label></div>
                    <div class="col-md-1"><input type="button" class="btn btn-info" onClick="addCancion()" value="+" /></div>
                </div>
                <!-- El id="canciones" indica que la función de JavaScript dejará aquí el resultado -->
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="form-element-list mg-t-30">
                            <div class="row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" >                           
                                    <div class="row" id="productos">
                                        <div class="chosen-select-act fm-cmp-mg">
                                            <select class="chosen" id="s1" data-placeholder="Choose a Country...">
                                                <option value="Producto">Producto</option>                                             
                                                <option value="United States">United States</option>                                             
                                                <option value="United Kingdom">United Kingdom</option>                                    
                                            </select>
                                        </div>
                                    </div>
                                </div>                      
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>

        <!--        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list mg-t-30">
                        <div class="row">
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" >                           
                                <div class="row">
                                    <div class="chosen-select-act fm-cmp-mg">
                                        <select class="chosen" id="s1" data-placeholder="Choose a Country...">
                                            <option value="Producto">Producto</option>                                             
                                            <option value="United States">United States</option>                                             
                                            <option value="United Kingdom">United Kingdom</option>                                    
                                        </select>
                                    </div>
        
        
        
                                    <div class="chosen-select-act fm-cmp-mg">
                                        <select class="chosen" id="s2" data-placeholder="Choose a Country...">
                                            <option value="Cliente">Cliente</option>                                             
                                            <option value="United States">United States</option>                                             
                                            <option value="United Kingdom">United Kingdom</option>
                                            <option value="Afghanistan">Afghanistan</option>                                    
                                        </select>
                                    </div>
        
                                </div>
                            </div>                      
                        </div>
                    </div>
                </div>-->
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


    <script>
                        a = 0;
                        b = 0;
//            function addCancion() {
//                a++;
//
//                var div = document.createElement('div');
//                div.setAttribute('class', 'form-inline');
//                div.innerHTML = '<div style="clear:both" class="cancion_' + a + ' col-md-offset-1 col-md-6"><input class="form-control" id="cancion_' + a + '" type="text"/>';
//                document.getElementById('canciones').appendChild(div);
//                document.getElementById('canciones').appendChild(div);
//            }
                        function addCancion() {
                            b++;
                            var div = document.createElement('div');
                            div.setAttribute('class', 'chosen-select-act fm-cmp-mg');
                            div.innerHTML = '<select class="chosen" data-placeholder="Choose a Country..."><option value="United States">United States</option>                                             <option value="United Kingdom">United Kingdom</option><option value="Afghanistan">Afghanistan</option><option value="Aland Islands">Aland Islands</option><option value="Albania">Albania</option><option value="Algeria">Algeria</option><option value="American Samoa">American Samoa</option></select>';
                            document.getElementById('productos').appendChild(div);
                            document.getElementById('productos').appendChild(div);

                            $(".chosen")[0] && $(".chosen").chosen({
                                width: "100%",
                                allow_single_deselect: !0
                            });
                        }



                        function mostrarInfo() {
                            if (b > 0) {
                                var text = document.getElementById("producto_1");

                                alert(text);
                            }




                        }
    </script>
</html>
