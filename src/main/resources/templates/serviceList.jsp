<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Natuspa - Beauty Salon & Spa Template</title>
    <link rel="stylesheet" href="./resource/css/style.css">
    <link rel="stylesheet" href="./resource/css/queries.css">
    <link rel="stylesheet" href="./resource/css/animation.css">
    <link rel="stylesheet" href="./vendor/css/bootstrap.min.css">
    <link rel="stylesheet" href="./vendor/fonts/fontawesome-5.0.13/css/all.css">
    <link rel="stylesheet" href="./vendor/fonts/natuspa-font/css/natuspa-icons.css">
    <link rel="stylesheet" href="./vendor/js/slick/slick.css">
    <link rel="stylesheet" href="./vendor/js/slick/slick-theme.css">
    <!-- <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" /> -->
    <link rel="stylesheet" href="./vendor/js/datetimepicker-master/jquery.datetimepicker.css">
    <link rel="stylesheet" href="./vendor/js/Magnific-Popup-master/magnific-popup.css">
    <!-- favicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-/+hMbnNhXbgcGpjyBpL6bJfdyV1xWWxMLUaZ1d6b3U6q9X6vyItLE7g51tv6GM1HnyVLRweRbZgDfhW0M8dzQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="apple-touch-icon" sizes="76x76" href="/resource/favicons/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/resource/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/resource/favicons/favicon-16x16.png">
    <link rel="manifest" href="/resource/favicons/site.webmanifest">
    <link rel="mask-icon" href="/resource/favicons/safari-pinned-tab.svg" color="#5bbad5">
    <link rel="shortcut icon" href="/resource/favicons/favicon.ico">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="msapplication-config" content="/resource/favicons/browserconfig.xml">
    <meta name="theme-color" content="#ffffff">
</head>

<body class="preload">

<!-- Loading ......... -->
<div class="loader" id="loader">
    <div class="loader-inner">
        <img src="./imgs/loader.svg" alt="Loader" class="loader-img">
    </div>
</div>

<!-- overlay for focus -->
<div id="overlay" style="display: none;"></div>

<!-- scroll top -->
<a class="scroll-top link-text" href="#home">Top</a>

<!-- page wrapper -->
<div class="page-wrapper">
    <!-- Header -->
    <header id="home" class="other-pages">
        <!-- Navigation -->
        <nav class="navbar navbar-expand-xl navbar-dark">
            <!-- logo site -->
            <a class="navbar-brand main-logo" href="index.html" rel="home" title="Natuspa">
                <img src="./imgs/logo_white.png" alt="Natuspa Logo" width="193" height="76">
            </a>
            <!--  main nav -->
            <button class="navbar-toggler mobile-nav-icon" type="button" data-toggle="collapse"
                    data-target="#main-nav-mobile">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse main-nav">
                <ul class="navbar-nav menu" id="mainNav">
                    <li class="nav-item menu-item">
                        <a class="nav-link" href="index.html">Trang chủ</a>
                    </li>
                    <li class="nav-item menu-item">
                        <a class="nav-link" href="spaServices.html">Dịch vụ</a>
                    </li>
                    <li class="nav-item menu-item">
                        <a class="nav-link" href="contact-us.html">Liên hệ</a>
                    </li>
                    <li class="nav-item menu-item">
                        <a class="nav-link" href="contact-us.html">Đăng nhập</a>
                    </li>
                </ul>
            </div>
            <!-- nav icon -->
            <div class="main-nav-icon">
                <!-- shopping bag -->
                <a class="bag-button">
                        <span class="bag-icon nav-icon">
                            <i class="far fa-calendar"><span class="badge badge-danger">2</span></i>
                        </span>
                </a>
                <!-- search icon -->
                <a id="search-icon" href="#">
                        <span class="bag-icon nav-icon">
                            <i class="fas fa-search"></i>
                        </span>
                </a>
                <div class="search-form">
                    <span class="close-search"><i class="fal fa-times-circle"></i></span>
                    <form class="search-input" action="#">
                        <input type="text" name="search" id="searchForm" placeholder="Type and hit enter...">
                    </form>
                </div>
            </div>
        </nav>
        <!-- title pages -->
        <h1 class="page-title">Services</h1>

    </header>

    <!-- pricing plan -->
    <div class="pricing-plan container">
        <div class="spacer-clearfix" style="height: 80px;"></div>
        <div class="row">
            <div class="heading col-12">
                <div class="main-heading section-title">Service List</div>
                <div class="sub-heading">
                    <p>Chào mừng đến với Pet Friend
                    </p>
                </div>
            </div>
            <div class="spacer-clearfix" style="height: 40px;"></div>
            <ul class="pricing-menu col-12" id="service-list">
                <li class="pricing-item all facial massage" th:each="service : ${services}">
                    <span th:text="${service.category}"></span>
                    <span th:text="${service.name}"></span>
                    <p th:text="${service.description}"></p>
                </li>
            </ul>

            <span id="filter-option"></span>
        </div>
        <div class="spacer-clearfix" style="height: 60px;"></div>
    </div>
<!-- footer -->
<footer id="footer">
    <div class="footer-content">
        <a href="index.html"><img src="./imgs/footer-logo-white.png" alt="footer-logo"></a>
        <div class="sub-heading">Design by @CBR-Themes</div>
        <div class="slogan">Pro inimicus sapientem an, ad cibo velit.</div>
        <ul class="footer-social">
            <li class="social-media" style="background-color: #4b64a6;">
                <a class="social-popup-icon" target="_blank" href="https://fb.com/Tuannguyentn2504">
                    <i class="fab fa-facebook-f"></i>
                </a>
            </li>
            <li class="social-media" style="background-color: #0cace4;">
                <a class="social-popup-icon" target="_blank" href="#">
                    <i class="fab fa-twitter"></i>
                </a>
            </li>
            <li class="social-media" style="background-color: #f12756;">
                <a class="social-popup-icon" target="_blank" href="#">
                    <i class="fab fa-instagram"></i>
                </a>
            </li>
        </ul>
    </div>
    <div class="footer-bottom">Copyright © 2019. Natuspa. All Rights Reserved.</div>
</footer>

<script src="./vendor/js/jquery-v3.4.1.min.js"></script>
<script src="./vendor/js/bootstrap.min.js"></script>
<script src="./vendor/js/jquery.waypoints.min.js"></script>
<!-- <script src="https://kit.fontawesome.com/7534282567.js" crossorigin="anonymous"></script> -->
<script src="./vendor/js/slick/slick.min.js"></script>
<!-- <script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script> -->
<script src="./vendor/js/datetimepicker-master/build/jquery.datetimepicker.full.js"></script>
<script src="./vendor/js/Magnific-Popup-master/jquery.magnific-popup.min.js"></script>
<script src="./resource/js/script.js"></script>
<script>
    // ================= Way point - nav sticky and scroll-top ================
    $('.maps').waypoint(function (dicrection) {
        if (dicrection === 'down') {
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
        offset: '0px'
    });
</script>
<script>
    // Lấy biểu tượng tìm kiếm và khung tìm kiếm
    const searchIcon = document.getElementById("search-icon");
    const searchForm = document.querySelector(".search-form");

    // Thêm sự kiện click vào biểu tượng tìm kiếm
    searchIcon.addEventListener("click", function () {
        // Nếu khung tìm kiếm đang ẩn thì hiển thị khung tìm kiếm
        if (searchForm.style.visibility === "hidden") {
            searchForm.style.opacity = 1;
            searchForm.style.visibility = "visible";
        }
        // Ngược lại, ẩn khung tìm kiếm
        else {
            searchForm.style.opacity = 0;
            searchForm.style.visibility = "hidden";
        }
    });

    // Thêm sự kiện click vào nút đóng khung tìm kiếm
    document.querySelector(".close-search").addEventListener("click", function () {
        searchForm.style.opacity = 0;
        searchForm.style.visibility = "hidden";
    });

</script>
</body>

</html>