$(function() {
    sessionStorage.height = $('.pager').height() + 10;

    $(".head-search").hide();
    $(".click-search").click(function() {
        $(".head-search").toggle();
    });

    $(".myimg").click(function() {
        $(".showimg").attr("src", $(this).find("img").attr("src"));
        $(".anyshow").show();
    });
    $(".anyshow").click(function() {
        $(this).hide();
    });
    $(".add_click").click(function() {
        $(".form_card").show();
    });

    $(".cancel").click(function() {
        $(".form_card").hide();
    });
});
