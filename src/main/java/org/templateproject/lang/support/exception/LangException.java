package org.templateproject.lang.support.exception;


import org.templateproject.lang.TP;

/**
 * 工具类异常
 * 修改剔除额外的依赖类,以适应template-xxx系列的规范
 *
 * @author xiaoleilu
 * @since 1.0
 */
public class LangException extends RuntimeException {

    public LangException(Throwable e) {
        super(TP.stringhelper.format("{}: {}", e.getClass().getSimpleName(), e.getMessage()));
    }

    public LangException(String message) {
        super(message);
    }

    public LangException(String messageTemplate, Object... params) {
        super(TP.stringhelper.format(messageTemplate, params));
    }

    public LangException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public LangException(Throwable throwable, String messageTemplate, Object... params) {
        super(TP.stringhelper.format(messageTemplate, params), throwable);
    }

}
