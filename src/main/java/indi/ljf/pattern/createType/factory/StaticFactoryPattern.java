package indi.ljf.pattern.createType.factory;

/**
 * @author ：ljf
 * @date ：2020/6/14 22:31
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */

/**
 * 枚举类实现简单静态工厂模式
 */
abstract class Vehicle {
    abstract void running();
    abstract Vehicle newInstance();
}

class Bike extends Vehicle {
    @Override
    void running() {
        System.out.println("bike is running!");
    }

    Vehicle newInstance() {
        return new Bike();
    }
}

class Car extends Vehicle {
    @Override
    void running() {
        System.out.println("car is running!");
    }

    Vehicle newInstance() {
        return new Car();
    }
}

class Truck extends Vehicle {
    @Override
    void running() {
        System.out.println("truck is running!");
    }

    Vehicle newInstance() {
        return new Truck();
    }
}


public class StaticFactoryPattern {
    public enum VehicleType {
        BIKE, CAR, TRUCK
    }

    public static Vehicle create(VehicleType type) {
        if (type == VehicleType.BIKE) return new Bike();
        else if (type == VehicleType.CAR) return new Car();
        else if (type == VehicleType.TRUCK) return new Truck();
        else return null;
    }

    public static void main(String[] args) {
        System.out.println(StaticFactoryPattern.create(VehicleType.BIKE));
        System.out.println(StaticFactoryPattern.create(VehicleType.CAR));
        System.out.println(StaticFactoryPattern.create(VehicleType.TRUCK));
        StaticFactoryPattern.create(VehicleType.TRUCK).running();
    }
}
