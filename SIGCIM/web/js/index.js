$(function(){
  $('.hide-show').show();
  $('.hide-show span').addClass('show')
  
  $('.hide-show span').click(function(){
    if( $(this).hasClass('show') ) {
      $(this).text('Ocultar');
      $('input[name="login[password]"]').attr('type','text');
      $(this).removeClass('show');
    } else {
       $(this).text('Mostrar');
       $('input[name="login[password]"]').attr('type','password');
       $(this).addClass('show');
    }
  });
	
	$('form button[type="submit"]').on('click', function(){
		$('.hide-show span').text('Mostar').addClass('show');
		$('.hide-show').parent().find('input[name="login[password]"]').attr('type','password');
	}); 
});