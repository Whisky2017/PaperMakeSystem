$(function() {
	$(".btn-click").click(function() {
		var name = $("#name").val();
		var password = $("#pw").val();

		if ( $.trim(name)==""||$.trim(password)=="") {
			$(".title").html("请输入账号或密码");
			$(".title").css("color","red");
		}else{
			$.ajax({
				type:"post",
				url:"index.html",  
				data:{
					username:name,
					password:password
				},
				success:function(data) {
					if (data == 0) {
						$(".title").html("账号或密码有误");
						$(".title").css("color","red");
					}else{
						$(this).val("登录中...");
						location.href = "home.html";
					}
				}
			});
		}
	});
});