package indi.ljf.pattern.behavioralType.observer;

/**
 * @author ：ljf
 * @date ：2020/9/9 13:18
 * @description：被观察者
 * @modified By：
 * @version: $ 1.0
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @param message
     */
    void notifyObserver(Message message);
}
