<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fieldset>
    <legend>教育经历<a href="javascript:void(0)" onclick="removeExperienceItem(this)">-</a></legend>
    <script type="text/javascript" src="/js/resume.js"></script>
    <table>
        <tr>
            <td>开始日期</td>
            <td>
                <input type="text" class="datePicker" name="educationExperienceDTOs[${index}].startDate"/>
            </td>
            <td>结束日期</td>
            <td>
                <input type="text" class="datePicker" name="educationExperienceDTOs[${index}].endDate"/>
            </td>
        </tr>
        <tr>
            <td>学校名称</td>
            <td>
                <input type="text" name="educationExperienceDTOs[${index}].school"/>
            </td>
            <td>专业名称</td>
            <td>
                <input type="text" name="educationExperienceDTOs[${index}].major"/>
            </td>
        </tr>
        <tr>
            <td>自我评价</td>
            <td colspan="3">
                <textarea rows="10" cols="93" name="educationExperienceDTOs[${index}].description"></textarea>
            </td>
        </tr>
    </table>
</fieldset>