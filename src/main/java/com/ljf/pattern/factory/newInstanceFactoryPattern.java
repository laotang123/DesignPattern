package com.ljf.pattern.factory;

import java.util.HashMap;

/**
 * @author ：ljf
 * @date ：2020/6/15 9:41
 * @description：通过new instance实现工厂模式
 * @modified By：
 * @version: $ 1.0
 */
public class newInstanceFactoryPattern {
    private static HashMap<String,Vehicle> registeredProducts =new HashMap<String, Vehicle>();

    public static void registerVehicle(String vehicleID,Vehicle vehicle){
        registeredProducts.put(vehicleID,vehicle);
    }

    public static Vehicle createVehicle(String vehicleID){
        return registeredProducts.get(vehicleID).newInstance();
    }

    public static void main(String[] args) {
        newInstanceFactoryPattern.registerVehicle("com.ljf.pattern.factory.Car",new Car());
        newInstanceFactoryPattern.createVehicle("com.ljf.pattern.factory.Car").running();
    }
}
