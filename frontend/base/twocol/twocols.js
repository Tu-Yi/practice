var wrapper = document.querySelector('#wrapper')
document.querySelector('#select').addEventListener('change', function (event) {
    var value = event.target.value
    switch (+value) {
        case 0:
            wrapper.className = 'wrapper wrapper-inline-block';
            break;
        case 1:
            wrapper.className = 'wrapper wrapper-double-float';
            break;
        case 2:
            wrapper.className = 'wrapper wrapper-float';
            break;
        case 4:
            wrapper.className = 'wrapper wrapper-float-bfc ';
            break;
        case 3:
            wrapper.className = 'wrapper wrapper-absolute';
            break;
        case 5:
            wrapper.className = 'wrapper wrapper-flex';
            break;
        case 6:
            wrapper.className = 'wrapper wrapper-grid';
            break;
    }
})
var rightDiv = document.querySelector('.right')
document.querySelector('#changeHeight').addEventListener('change', function (event) {
    var value = event.target.value
    switch (+value) {
        case 1:
            rightDiv.style.height = "700px";
            break;
        case 0:
            rightDiv.style.height = "auto";
            break;
    }
})