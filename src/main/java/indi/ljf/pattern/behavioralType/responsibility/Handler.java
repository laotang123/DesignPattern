package indi.ljf.pattern.behavioralType.responsibility;

/**
 * @author ：ljf
 * @date ：2020/10/14 14:13
 * @description：处理器
 * @modified By：
 * @version: $ 1.0
 */
public abstract class Handler {
    public Handler successor = null;

    public void setHandler(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        Boolean handled = doHandle();
        //变体一：遇到能处理请求的处理器便终止传递
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract Boolean doHandle();
}
