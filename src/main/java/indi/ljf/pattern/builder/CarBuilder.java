package indi.ljf.pattern.builder;

/**
 * @author ：ljf
 * @date ：2020/6/16 10:00
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class CarBuilder {

    private Car car;

    public void buildCar(){
        this.car = new Car();
    }


    public void addEngine(String engine){
        this.car.setEngines(engine);
    }

    public void addBatteries(String battery){
        this.car.setBatteries(battery);
    }

    public void addTransmission(String transmission){
        this.car.setTransmission(transmission);
    }

    public void addWheel(String wheel){
        this.car.setWheels(wheel);
    }

    public void paint(String color){
        this.car.setColor(color);
    }

    public Car getCar(){
        return car;
    }

    public void addGasTank(String gasTank){
        this.car.setGasTank(gasTank);
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        System.out.println(car);
    }
}
