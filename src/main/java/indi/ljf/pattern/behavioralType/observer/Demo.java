package indi.ljf.pattern.behavioralType.observer;

/**
 * @author ：ljf
 * @date ：2020/9/9 13:46
 * @description：测试demo
 * @modified By：
 * @version: $ 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObserver(new Message());
    }
}
