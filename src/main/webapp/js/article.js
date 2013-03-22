$(function() {
    CKEDITOR.replace('content', {
                toolbar: 'Basic',
                uiColor: '#71D1FF',
                height:500,
                width:700
            });

    $("#articleMenu").addClass("active");
    $("#resumeMenu").removeClass("active");
});