$(function() {
	if(sessionStorage.wenIndex > -1){
		$(".sec").eq(sessionStorage.wenIndex).addClass("selected");
	}
	sessionStorage.wenIndex = -1;
	sessionStorage.height = $('.pager').height() + 30;

	$(".wen-type .sec").click(function(){
		$(this).addClass("selected");
		$(this).siblings().removeClass("selected");
		sessionStorage.wenIndex = $(".wen-type .sec").index($('.wen-type .selected'));
	});
});
