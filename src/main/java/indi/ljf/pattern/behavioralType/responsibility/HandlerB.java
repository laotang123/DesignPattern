package indi.ljf.pattern.behavioralType.responsibility;

/**
 * @author ：ljf
 * @date ：2020/10/14 14:32
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class HandlerB extends Handler {
    @Override
    protected Boolean doHandle() {
        boolean handled = false;
        //......
        System.out.println("调用HandlerB");
        return handled;
    }
}
