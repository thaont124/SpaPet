// ================= Way point - nav sticky and scroll-top ================
$('header').waypoint(function (direction) {
    if (direction === 'down') {
        $('nav').addClass('nav-sticky');
        $('.scroll-top').css({
            'visibility': 'visible',
            'opacity': '1'
        });
    } else {
        $('nav').removeClass('nav-sticky');
        $('.scroll-top').css({
            'visibility': 'hidden',
            'opacity': '0'
        });
    }
}, {
    offset: '-10px'
});
