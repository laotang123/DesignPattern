package com.ljf.pattern.factory.factoryMethod;

/**
 * @author ：ljf
 * @date ：2020/6/16 8:57
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class CarFactory extends VehicleFactory {
    protected Vehicle createVehicle(String size) {
        if (size.equals("small")) return new SportCar();
        else if (size.equals("large")) return new SedanCar();
        return null;
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.orderVehicle("small", "red"));
        System.out.println(carFactory.orderVehicle("large", "green"));
    }
}
