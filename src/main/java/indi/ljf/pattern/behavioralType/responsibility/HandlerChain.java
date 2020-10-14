package indi.ljf.pattern.behavioralType.responsibility;

/**
 * @author ：ljf
 * @date ：2020/10/14 14:20
 * @description：责任链
 * @modified By：
 * @version: $ 1.0
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setHandler(handler);
        tail = handler;

    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
