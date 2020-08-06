package indi.ljf.mvc.ddd.exception;

/**
 * @author ：ljf
 * @date ：2020/8/6 9:58
 * @description：错误匹配报错
 * @modified By：
 * @version: $ 1.0
 */
@SuppressWarnings("serial")
public class MisMatchException extends Exception{
    public MisMatchException(String message) {
        super(message);
    }

    public MisMatchException() {
        super();
    }

    public MisMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public MisMatchException(Throwable cause) {
        super(cause);
    }

    protected MisMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
