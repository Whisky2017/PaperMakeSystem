$(function() {
	sessionStorage.height = 867;
	$("#maincontent").load(function () {
		var height =  parseInt(sessionStorage.height);
        $(this).attr("height",height);
	});
});