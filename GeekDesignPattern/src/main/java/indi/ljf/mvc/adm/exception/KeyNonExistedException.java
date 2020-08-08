package indi.ljf.mvc.adm.exception;

/**
 * @author ：ljf
 * @date ：2020/8/6 10:03
 * @description：map key不存在异常类型
 * @modified By：
 * @version: $ 1.0
 */
public class KeyNonExistedException extends Exception{
    public KeyNonExistedException() {
        super();
    }

    public KeyNonExistedException(String message) {
        super(message);
    }

    public KeyNonExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyNonExistedException(Throwable cause) {
        super(cause);
    }

    protected KeyNonExistedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
