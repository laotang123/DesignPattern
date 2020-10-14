package indi.ljf.pattern.behavioralType.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/9/9 13:27
 * @description：被观察者实现
 * @modified By：
 * @version: $ 1.0
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
