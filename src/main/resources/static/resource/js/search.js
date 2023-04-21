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