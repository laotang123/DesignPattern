package com.ljf.pattern.factory.factoryMethod;

/**
 * @author ：ljf
 * @date ：2020/6/15 10:28
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public abstract class Vehicle {
    protected String color;

    protected abstract void running();
    protected void testVehicle(){
        
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

