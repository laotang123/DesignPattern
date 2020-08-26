package indi.ljf.pattern.exceptions;

/**
 * @author ：ljf
 * @date ：2020/8/26 10:29
 * @description：简单工厂模式下的配置无效异常
 * @modified By：
 * @version: $ 1.0
 */
public class InvalidRuleConfigException extends Exception{
    public InvalidRuleConfigException() {
        super();
    }

    public InvalidRuleConfigException(String message) {
        super(message);
    }

    public InvalidRuleConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRuleConfigException(Throwable cause) {
        super(cause);
    }

    protected InvalidRuleConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
