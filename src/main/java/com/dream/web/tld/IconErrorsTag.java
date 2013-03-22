package com.dream.web.tld;

import com.dream.util.Constant;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.tags.form.ErrorsTag;
import org.springframework.web.servlet.tags.form.TagWriter;

import javax.servlet.jsp.JspException;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-8
 * Time: 下午7:46
 */
public class IconErrorsTag extends ErrorsTag {

    private String errorImgUrl = Constant.ERROR_IMG_URL;

    @Override
    protected void renderDefaultContent(TagWriter tagWriter) throws JspException {
        tagWriter.startTag(getElement());
        writeDefaultAttributes(tagWriter);
        String title = generateTitleContent();
        String html = "<img src=\"" + getErrorImgUrl() + "\" alt=\"error\" title=\"" + title + "\"/>";
        tagWriter.appendValue(html);
        tagWriter.endTag();
    }

    private String generateTitleContent() throws JspException {
        String delimiter = ObjectUtils.getDisplayString(evaluate("delimiter", getDelimiter()));
        StringBuilder titleContent = new StringBuilder();
        String[] errorMessages = getBindStatus().getErrorMessages();
        for (int i = 0; i < errorMessages.length; i++) {
            String errorMessage = errorMessages[i];
            if (i > 0) {
                titleContent.append(delimiter);
            }
            titleContent.append(getDisplayString(errorMessage));
        }
        return titleContent.toString();
    }

    public String getErrorImgUrl() {
        return errorImgUrl;
    }

    /**
     * Set error image url
     *
     * @param errorImgUrl Error image full url path
     */
    public void setErrorImgUrl(String errorImgUrl) {
        this.errorImgUrl = errorImgUrl;
    }
}
