package com.ljf.pattern.factory.factoryMethod;

/**
 * @author ：ljf
 * @date ：2020/6/15 10:37
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class SportCar extends Vehicle {


    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.running();
    }

    protected void running() {
        System.out.println("sportCar is running");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "color='" + color + '\'' +
                '}';
    }
}
