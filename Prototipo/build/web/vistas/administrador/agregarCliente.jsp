<%-- 
    Document   : agregarCliente
    Created on : 21/05/2019, 03:05:49 PM
    Author     : horo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String context = request.getContextPath();
%>
<!DOCTYPE html>
<html>

 
    <head>
           <link rel="shortcut icon" type="image/x-icon" href="<%=context%>/img/MP-logo.ico">
    <link rel="stylesheet" href="<%=context%>/css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
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
    <link rel="stylesheet" href="<%=context%>/css/summernote/summernote.css">
    <link rel="stylesheet" href="<%=context%>/css/datapicker/datepicker3.css">
    <link rel="stylesheet" href="<%=context%>/css/dropzone/dropzone.css">
    <link rel="stylesheet" href="<%=context%>/css/bootstrap-select/bootstrap-select.css">
    <link rel="stylesheet" href="<%=context%>/css/color-picker/farbtastic.css">
    <link rel="stylesheet" href="<%=context%>/css/chosen/chosen.css">
    <link rel="stylesheet" href="<%=context%>/css/notification/notification.css">
    <link rel="stylesheet" href="<%=context%>/css/themesaller-forms.css">
    <link rel="stylesheet" href="<%=context%>/css/dialog/sweetalert2.min.css">
    <link rel="stylesheet" href="<%=context%>/css/dialog/dialog.css">
    <script src="<%=context%>/js/vendor/modernizr-2.8.3.min.js"></script>
    <link rel="stylesheet" href="<%=context%>/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Cliente/Prospecto</title>
    </head>

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
                                    <button class="btn btn-success notika-btn-success dropbtn" id="sa-success"><span class="notika-icon notika-close">Cerrar sesión</button>
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

    <!-- Main Menu area End-->


    <div class="form-example-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-example-area">
                        <form action="" method="">
                            <div class="form-element-list mg-t-30">
                                <div class="cmp-tb-hd">
                                    <h2>Agregar Cliente/Prospecto</h2>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="nk-int-mk">
                                            <h2>Nombre</h2>
                                        </div>
                                        <div class="form-group ic-cmp-int">
                                            <div class="form-ic-cmp">
                                                <i class="notika-icon notika-menu-after"></i>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text" class="form-control" placeholder="Ingresa el nombre" pattern="[ A-Za-z0-9-äÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙÑñ.]+" required>
                                            </div>
                                        </div>
                                    </div> 
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="toggle-select-act sm-res-mg-t-10">
                                            <div class="nk-toggle-switch" data-ts-color="blue">
                                                <label for="ts3" class="ts-label">Cliente/Prospecto</label>
                                                <input id="ts3" type="checkbox" hidden="hidden" required>
                                                <label for="ts3" class="ts-helper"></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="nk-int-mk">
                                            <h2>Dirección</h2>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="nk-int-mk">
                                            <h3>Calle</h3>
                                        </div>
                                        <div class="form-group ic-cmp-int">
                                            <div class="form-ic-cmp">
                                                <i class="notika-icon notika-ip-locator"></i>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text" class="form-control" placeholder="Ingresa la calle">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="form-group">
                                            <div class="nk-int-mf">
                                                <h3>Colonia</h3>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text" class="form-control" placeholder="Ingresa la colonia">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="form-group">
                                            <div class="nk-int-mf">
                                                <h3>Código Postal</h3>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text"  data-mask="99999" class="form-control" placeholder="Ingresa el Código Postal" required>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="nk-int-mk">
                                            <h2>Teléfono</h2>
                                        </div>
                                        <div class="form-group ic-cmp-int">
                                            <div class="form-ic-cmp">
                                                <i class="notika-icon notika-phone"></i>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text" class="form-control" placeholder="Ingresa el número teléfonico"  data-mask="(999)-999-99-99" required>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="nk-int-mk">
                                            <h2>Teléfono</h2>
                                        </div>
                                        <div class="form-group ic-cmp-int">
                                            <div class="form-ic-cmp">
                                                <i class="notika-icon notika-phone"></i>
                                            </div>
                                            <div class="nk-int-st">
                                                <input type="text" class="form-control" placeholder="Ingresa el número teléfonico"  data-mask="(999)-999-99-99" required>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                        <div class="form-group nk-datapk-ctm form-elet-mg" id="data_1">
                                            <div class="nk-int-mf">
                                                <h2>Elige un fecha</h2>
                                            </div>
                                            <div class="input-group date nk-int-st">
                                                <span class="input-group-addon"></span>
                                                <input type="text" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                        <div class="nk-int-mk sl-dp-mn">
                                            <h2>Basic Example</h2>
                                        </div>
                                        <div class="chosen-select-act fm-cmp-mg">
                                            <select class="chosen" data-placeholder="Choose a Country...">
                                                <option value="United States">United States</option>
                                                <option value="United Kingdom">United Kingdom</option>
                                                <option value="Afghanistan">Afghanistan</option>
                                                <option value="Aland Islands">Aland Islands</option>
                                                <option value="Albania">Albania</option>
                                                <option value="Algeria">Algeria</option>
                                                <option value="American Samoa">American Samoa</option>
                                            </select>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </form>   
                    </div>  
                </div>
            </div>
        </div>
    </div>

    <!-- Form End-->
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
    <script src="<%=context%>/js/jasny-bootstrap.min.js"></script>
    <script src="<%=context%>/js/data-table/jquery.dataTables.min.js"></script>
    <script src="<%=context%>/js/data-table/data-table-act.js"></script>
    <script src="<%=context%>/js/plugins.js"></script>
    <script src="<%=context%>/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="<%=context%>/js/icheck/icheck.min.js"></script>
    <script src="<%=context%>/js/icheck/icheck-active.js"></script>
    <script src="<%=context%>/js/rangle-slider/jquery-ui-1.10.4.custom.min.js"></script>
    <script src="<%=context%>/js/rangle-slider/jquery-ui-touch-punch.min.js"></script>
    <script src="<%=context%>/js/rangle-slider/rangle-active.js"></script>
    <script src="<%=context%>/js/datapicker/bootstrap-datepicker.js"></script>
    <script src="<%=context%>/js/datapicker/datepicker-active.js"></script>
    <script src="<%=context%>/js/bootstrap-select/bootstrap-select.js"></script>
    <script src="<%=context%>/js/color-picker/farbtastic.min.js"></script>
    <script src="<%=context%>/js/color-picker/color-picker.js"></script>
    <script src="<%=context%>/js/notification/bootstrap-growl.min.js"></script>
    <script src="<%=context%>/js/notification/notification-active.js"></script>
    <script src="<%=context%>/js/summernote/summernote-updated.min.js"></script>
    <script src="<%=context%>/js/summernote/summernote-active.js"></script>
    <script src="<%=context%>/js/dropzone/dropzone.js"></script>
    <script src="<%=context%>/js/chosen/chosen.jquery.js"></script>
    <script src="<%=context%>/js/chat/jquery.chat.js"></script>     
    <script src="<%=context%>/js/main.js"></script>
    <script src="<%=context%>/js/dialog/dialog-active.js"></script>
    <script src="<%=context%>/js/dialog/sweetalert2.min.js"></script>
</body>
</html>