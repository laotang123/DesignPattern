package indi.ljf.pattern.behavioralType.observer;

/**
 * @author ：ljf
 * @date ：2020/9/9 13:34
 * @description：观察者实现二
 * @modified By：
 * @version: $ 1.0
 */
public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(Message message) {
        //TODO: 接受通知后的逻辑
        System.out.println("ConcreteObserverTwo is notified");
    }
}
