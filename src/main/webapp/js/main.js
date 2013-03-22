$(function() {
    $("table").attr("cellpadding", "10");
});

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
            $("#formDialog").html(result);
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