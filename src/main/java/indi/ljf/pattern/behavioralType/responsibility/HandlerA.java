package indi.ljf.pattern.behavioralType.responsibility;

/**
 * @author ：ljf
 * @date ：2020/10/14 14:28
 * @description：A处理器
 * @modified By：
 * @version: $ 1.0
 */
public class HandlerA extends Handler {
    @Override
    protected Boolean doHandle() {
        boolean handled = false;
        //...
        System.out.println("调用HandlerA");
        return handled;
    }
}
