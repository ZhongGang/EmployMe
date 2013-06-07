$(function() {
    $("table").attr("cellpadding", "10");

    initFormErrors();
});

function initFormErrors() {
    $(".form-error").each(function() {
        $(this).prev().css('border', '1px solid red');

        var content = $(this).html();
        $(this).prev().tooltip({
                    title:content,
                    placement:'right',
                    delay: { show: 0, hide: 3000 }
                });
    });
}

function forward(url) {
    location.href = url;
}

function createUserInfoChangeFormDialog() {
    createDynamicDialog("用户信息修改", 500, 400, true, "/user/change");
}

function submitUserInfoChangeFormDialog(formObject) {
    $.post(formObject.action, $(formObject).serialize(), function(result) {
        if ((typeof(result) == 'object') || ("" == result)) {
            closeDialog();
            location.reload();
        } else {
            $("#dialog").html(result);
            initFormErrors();
        }
    });
}

function createDynamicDialog(title, width, height, modal, url) {
    $("#formDialog").dialog({
                autoOpen: true,
                title:title,
                width:width,
                height:height,
                modal:modal,
                resizable:false
            });
    $("#formDialog").load(url);
}

function closeDialog() {
    $("#formDialog").dialog('close');
}

function confirm(title, content, url) {
    $("#confirmDialog").confirmModal({
                heading: title,
                body: content,
                callback:function() {
                    location.href = url;
                }
            });
}