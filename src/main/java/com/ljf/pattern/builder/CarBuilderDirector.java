package com.ljf.pattern.builder;

/**
 * @author ：ljf
 * @date ：2020/6/16 10:10
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class CarBuilderDirector {
    public Car buildElectricCar(CarBuilder builder){

        builder.buildCar();
        builder.addEngine("Electric 150 kW");
        builder.addBatteries("1500 kWh");
        builder.addTransmission("Manual");
        for (int i = 0; i < 4; i++)
            builder.addWheel("20x12x30");
        builder.paint("red");

        return builder.getCar();
    }

    public Car buildHybridCar(CarBuilder builder){

        builder.buildCar();
        builder.addEngine("Electric 150 kW");
        builder.addBatteries("1500 kWh");
        builder.addTransmission("Manual");
        for (int i = 0; i < 4; i++)
            builder.addWheel("20x12x30");
        builder.paint("red");

        builder.addGasTank("1500 kWh");
        builder.addEngine("Gas 1600cc");

        return builder.getCar();
    }

    public static void main(String[] args) {
        CarBuilderDirector director = new CarBuilderDirector();
        System.out.println(director.buildHybridCar(new CarBuilder()));
        System.out.println(director.buildElectricCar(new CarBuilder()));
    }
}
