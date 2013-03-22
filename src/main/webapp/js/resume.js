$(function() {
    $(".datePicker").datepicker({
                dateFormat:"yy-mm-dd",
                changeYear:true,
                changeMonth:true,
                regional:"zh-CN"
            }).attr("readonly", "readonly");

    $("#articleMenu").removeClass("active");
    $("#resumeMenu").addClass("active");
    $("table").attr("cellpadding", "10");
});

function addEducationExperienceItem() {
    var maxIndex = $("#educationExperienceContent").attr("educationExperienceMaxIndex");
    maxIndex = maxIndex * 1 + 1 * 1;
    $.get("educationExperienceItem/generate?index=" + maxIndex, function(result) {
        $("#educationExperienceContent").append(result);
        $("#educationExperienceContent").attr("educationExperienceMaxIndex", maxIndex);
    });
}

function addWorkExperienceItem() {
    var maxIndex = $("#workExperienceContent").attr("workExperienceMaxIndex");
    maxIndex = maxIndex * 1 + 1 * 1;
    $.get("workExperienceItem/generate?index=" + maxIndex, function(result) {
        $("#workExperienceContent").append(result);
        $("#workExperienceContent").attr("workExperienceMaxIndex", maxIndex);
    });
}

function addProjectExperienceItem() {
    var maxIndex = $("#projectExperienceContent").attr("projectExperienceMaxIndex");
    maxIndex = maxIndex * 1 + 1 * 1;
    $.get("projectExperienceItem/generate?index=" + maxIndex, function(result) {
        $("#projectExperienceContent").append(result);
        $("#projectExperienceContent").attr("projectExperienceMaxIndex", maxIndex);
    });
}

function removeExperienceItem(element) {
    $(element).parent().parent().remove();
}

function submitResumeForm(formObject) {
    $(formObject).submit();
}

function previewResumeForm(formObject) {
    $(formObject).attr("action", "preview");
    $(formObject).submit();
}