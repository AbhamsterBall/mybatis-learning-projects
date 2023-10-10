// 获取<textarea>元素
var textarea = document.getElementsByClassName('code');
for (var i = 0 ; i < textarea.length ; i++) {
    textarea[i].style.height = textarea[i].scrollHeight - 150 + "px";
    textarea[i].setAttribute("readonly", "")
    textarea[i].addEventListener("click", createClickHandler(textarea[i]));
}
var textareaN = document.getElementsByClassName('codeNonClose');
for (var i = 0 ; i < textareaN.length ; i++) {
    textareaN[i].style.height = textareaN[i].scrollHeight - 150 + "px";
    textareaN[i].setAttribute("readonly", "")
}

function createClickHandler(textarea) {
    return function () {
        if (parseInt(textarea.style.height.substr(0, textarea.style.height.length - 2)) < textarea.scrollHeight - 175) {
            textarea.style.height = textarea.scrollHeight - 150 + "px";
            // console.log(parseInt(textarea.style.height.substr(0, textarea.style.height.length - 2)))
            // console.log(textarea.scrollHeight - 150)
            // console.log("000")
        }
        else {
            if (textarea.scrollHeight - 150 > 25)
                textarea.style.height = 25 + "px";
            else
                textarea.style.height = textarea.scrollHeight - 150 + "px";
        }
    }
}

var isHidden = false
function hideAll() {
    if (!isHidden) {
        document.getElementsByClassName('expand')[0].innerHTML = "代码全部展开"
        for (var i = 0; i < textarea.length; i++) {
            if (textarea[i].scrollHeight - 150 > 25)
                textarea[i].style.height = 25 + "px";
            else
                textarea[i].style.height = textarea[i].scrollHeight - 150 + "px";
        }
        isHidden = true
    } else {
        document.getElementsByClassName('expand')[0].innerHTML = "代码全部收起"
        for (var i = 0 ; i < textarea.length ; i++) {
            textarea[i].style.height = textarea[i].scrollHeight - 150 + "px";
        }
        isHidden = false
    }
}


