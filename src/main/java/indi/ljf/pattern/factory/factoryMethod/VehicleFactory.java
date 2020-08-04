package indi.ljf.pattern.factory.factoryMethod;


/**
 * @author ：ljf
 * @date ：2020/6/15 10:26
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public abstract class VehicleFactory {
    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.testVehicle();
        vehicle.setColor(color);
        return vehicle;
    }
}
