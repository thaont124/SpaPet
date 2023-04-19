// Gọi đến API của ServiceController để lấy danh sách dịch vụ
fetch('/serviceList')
    .then(response => response.json())
    .then(services => {
// Hiển thị danh sách dịch vụ lên trang JSP
        const serviceList = document.querySelector('.pricing-menu');
        services.forEach(service => {
            const serviceItem = document.createElement('li');
            serviceItem.classList.add('pricing-item', 'all', service.category.toLowerCase().replace(' ', '-'));
            serviceItem.innerHTML = <span>${service.category}</span> <span>${service.name}</span> <p>${service.description}</p> ;
            serviceList.appendChild(serviceItem);
        });
    })
    .catch(error => console.error(error));