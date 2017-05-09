<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html lang="zh">
	<head>
		<meta charset="utf-8">
		<title>制卷系统后台管理平台</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="icon" href="../image/icon.gif" type="image/x-icon" />
		<link rel="shortcut icon" href="../image/icon.gif" type="image/x-icon" />
		<link rel="bookmark" href="../image/icon.gif" type="image/x-icon" />
		<link href="../css/bootstrap.min.css" rel="stylesheet">
		<link href="../css/style.css" rel="stylesheet">
		<link href="../css/font-awesome.min.css" rel="stylesheet">
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../js/script.js"></script>
		<script type="text/javascript" src="../js/md5.js"></script>
		<script type="text/javascript"> 
			function loadimage(){ 
				document.getElementById("randImage").src = "image.jsp?"+Math.random(); 
			}
			
			function check_login(form){
				var msg = document.getElementById('password').value;
				document.getElementById('password').value = hex_md5(msg);
			}
		</script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div id="content" class="col-sm-12 full">
					<div class="row">
						<div class="login-box">
							<div class="header">制卷系统后台管理平台 用户登陆</div>
							<form method="post" action="u_login.action" class="form-horizontal login" onSubmit="check_login(this);">
								<fidldset class="col-sm-12">
									<div class="form-group">
										<div class="controls row">
											<div class="input-group col-sm-12">
												<input type="text" class="form-control" name="username" value="admin" placeholder="用户名">
												<span class="input-group-addon"><i class="fa fa-user"></i></span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="controls row">
											<div class="input-group col-sm-12">
												<input type="password" class="form-control" name="password" id="password" value="admin" placeholder="密码">
												<span class="input-group-addon"><i class="fa fa-key"></i></span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="controls row">
											<div class="input-group col-sm-6 pull-left">
												<input type="text" class="form-control" name="confirm" placeholder="验证码"> 
												<span class="input-group-addon"><i class="fa fa-check-circle-o"></i></span>
											</div>
											<div class="captcha pull-left">
												<img alt="code..." id="randImage" src="image.jsp" width="60" height="20">
												<a href="javascript:loadimage();" style="font-size: 9pt;">换一张</a>
											</div>
										</div>
									</div>
									<div class="row">
										<input name="type" type="hidden" value="1">
										<button type="submit" class="btn btn-lg btn-primary col-xs-12">登陆</button>
									</div>
									<font size="2" face="宋体" style="font-size: 9pt;color:red;"><s:property value="errorsMap.login" /></font>
								</fidldset>
							</form>
							<div class="clearfix"></div>
							<div class="row">
								<a href="../login.jsp">转到前台</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>