<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fieldset>
    <legend>
        <strong>工作经历</strong>
        <a href="javascript:void(0)" onclick="removeExperienceItem(this)" class="btn btn-mini btn-primary">-</a>
    </legend>
    <script type="text/javascript" src="/js/resume.js"></script>
    <table>
        <tr>
            <td>开始日期</td>
            <td>
                <input type="text" class="datePicker" name="workExperienceDTOs[${index}].startDate"/>
            </td>
            <td>结束日期</td>
            <td>
                <input type="text" class="datePicker" name="workExperienceDTOs[${index}].endDate"/>
            </td>
        </tr>
        <tr>
            <td>公司名称</td>
            <td>
                <input type="text" name="workExperienceDTOs[${index}].company"/>
            </td>
            <td>职位</td>
            <td>
                <input type="text" name="workExperienceDTOs[${index}].position"/>
            </td>
        </tr>
        <tr>
            <td>部门</td>
            <td colspan="3">
                <input type="text" name="workExperienceDTOs[${index}].department"/>
            </td>
        </tr>
        <tr>
            <td>职位描述</td>
            <td colspan="3">
                <textarea rows="10" cols="93"
                          name="workExperienceDTOs[${index}].description"></textarea>
            </td>
        </tr>
    </table>
</fieldset>
