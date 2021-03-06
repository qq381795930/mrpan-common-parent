package com.mrpan.vpsplatform.web.freemarker;

import freemarker.template.TemplateModelException;

/**
 * Created by mrpan on 2016/11/14.
 */

/**
 * 非数字参数异常
 */
@SuppressWarnings("serial")
public class MustStringException extends TemplateModelException {
    public MustStringException(String paramName) {
        super("The \"" + paramName + "\" parameter must be a string.");
    }
}
