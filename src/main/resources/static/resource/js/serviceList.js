//khời tạo đội tượng request


const xhttp = new XMLHttpRequest();
//nhận dự liệu về (http response)
xhttp.onload = function () {
    //lấy dữ liệu dạng json
    var ResponseJson = xhttp.responseText
    //chuyển về dữ liệU javascript
    var Response = JSON.parse(ResponseJson)
    if (xhttp.status == 200) {

        //lấy element có id là service-List
        var serverListElement = document.getElementById('service-list');
        //khai báo biến String(dùng để thay đổi html trong thẻ bên trên)
        var serverListHTML = '';
        for (var i = 0; i < Response.length; i++) {

            serverListHTML += '<li class="pricing-item all facial massage"><span >' + Response[i].name + '</span><p >' + Response[i].description + '</p></li>';
        }
        serverListElement.innerHTML = serverListHTML;

    } else {

    }
}
//khai báo phương thức và đường dẫn để request
xhttp.open("GET", "/api/serviceList", false);
//khai báo định dạng gửi đi là json
xhttp.setRequestHeader("Content-type", "application/json")
//gửi
xhttp.send();