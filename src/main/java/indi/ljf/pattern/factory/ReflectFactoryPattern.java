package indi.ljf.pattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：ljf
 * @date ：2020/6/15 9:04
 * @description：反射实现工厂模式
 * @modified By：
 * @version: $ 1.0
 */
public class ReflectFactoryPattern {


    private static Map<String, Class> registeredProducts = new HashMap<String, Class>();

    public static void registerVehicle(String vehicleID, Class vehicleClass) {
        registeredProducts.put(vehicleID, vehicleClass);
    }

    public static Vehicle createVehicle(String type) throws IllegalAccessException, InstantiationException {
        Class productClass = registeredProducts.get(type);
        return (Vehicle) productClass.newInstance();
    }

    public static void main(String[] args) {
        ReflectFactoryPattern.registerVehicle("indi.ljf.pattern.factory.Car",Car.class);
        try {
            ReflectFactoryPattern.createVehicle("indi.ljf.pattern.factory.Car").running();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
