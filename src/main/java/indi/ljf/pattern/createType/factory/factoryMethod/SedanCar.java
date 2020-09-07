package indi.ljf.pattern.createType.factory.factoryMethod;

/**
 * @author ：ljf
 * @date ：2020/6/16 8:54
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class SedanCar extends Vehicle{

    protected void running() {
        System.out.println("sedanCar is running");
    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "color='" + color + '\'' +
                '}';
    }
}
