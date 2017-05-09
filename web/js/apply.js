$(function() {
    $(".btn-up").click(function() {
        var a = parseInt($(".wen-num").val());

        a += 1;
        $(".wen-num").val(a);
    });

    $(".btn-down").click(function() {
        var a = parseInt($(".wen-num").val());

        if (a <= 1) {
            alert("输入数字不小于1");
        } else {
            a -= 1;
            $(".wen-num").val(a);
        }
    });

    $(".myimg").click(function() {
        $(".showimg").attr("src", $(this).find("img").attr("src"));
        $(".anyshow").show();
    });
    $(".anyshow").click(function() {
        $(this).hide();
    });

    sessionStorage.height = $('.pager').height() + 30;

    console.log(sessionStorage.height);
});
