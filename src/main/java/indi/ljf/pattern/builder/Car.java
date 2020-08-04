package indi.ljf.pattern.builder;

import java.util.ArrayList;

/**
 * @author ：ljf
 * @date ：2020/6/16 9:50
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class Car {

    private ArrayList<String> engines;
    private ArrayList<String> batteries;
    private ArrayList<String> wheels;
    private ArrayList<String> colors;
    private String transmission;
    private String gasTank;

    public Car(){
        this.engines = new ArrayList<String>();
        this.batteries = new ArrayList<String>();
        this.wheels = new ArrayList<String>();
        this.colors = new ArrayList<String>();
    }

    public ArrayList<String> getEngines() {
        return engines;
    }

    public void setEngines(String engines) {
        this.engines.add(engines);
    }

    public ArrayList<String> getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries.add(batteries);
    }

    public ArrayList<String> getWheels() {
        return wheels;
    }

    public void setWheels(String wheel) {
        this.wheels.add(wheel);
    }

    public ArrayList<String> getColor() {
        return colors;
    }

    public void setColor(String color) {
        this.colors.add(color);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engines=" + engines +
                ", batteries=" + batteries +
                ", wheels=" + wheels +
                ", colors=" + colors +
                ", transmission='" + transmission + '\'' +
                ", gasTank='" + gasTank + '\'' +
                '}';
    }
}
