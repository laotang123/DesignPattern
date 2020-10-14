package indi.ljf.pattern.behavioralType.observer;

/**
 * @author ：ljf
 * @date ：2020/9/9 13:33
 * @description：观察者实现一
 * @modified By：
 * @version: $ 1.0
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        //TODO: 当接收到通知信息，运行自己的逻辑
        System.out.println("ConcreteObserverOne is notified");
    }
}
