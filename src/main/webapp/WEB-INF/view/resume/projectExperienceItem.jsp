<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fieldset>
    <legend>项目经验<a href="javascript:void(0)" onclick="removeExperienceItem(this)">-</a></legend>
    <script type="text/javascript" src="/js/resume.js"></script>
    <table>
        <tr>
            <td>开始日期</td>
            <td>
                <input type="text" class="datePicker" name="projectExperienceDTOs[${index}].startDate"/>
            </td>
            <td>结束日期</td>
            <td>
                <input type="text" class="datePicker" name="projectExperienceDTOs[${index}].endDate"/>
            </td>
        </tr>
        <tr>
            <td>项目名称</td>
            <td>
                <input type="text" name="projectExperienceDTOs[${index}].project"/>
            </td>
            <td>使用技术</td>
            <td>
                <input type="text" name="projectExperienceDTOs[${index}].technologies"/>
            </td>
        </tr>
        <tr>
            <td>项目描述</td>
            <td colspan="3">
                <textarea rows="10" cols="93"
                          name="projectExperienceDTOs[${index}].remark"></textarea>
            </td>
        </tr>
        <tr>
            <td>职责描述</td>
            <td colspan="3">
                <textarea rows="10" cols="93"
                          name="projectExperienceDTOs[${index}].duty"></textarea>
            </td>
        </tr>
    </table>
</fieldset>
