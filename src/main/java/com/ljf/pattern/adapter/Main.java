package com.ljf.pattern.adapter;

/**
 * @author ：ljf
 * @date ：2020/7/24 16:50
 * @description：适配器模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @modified By：
 * @version: $ 1.0
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task(100000L);
        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();
    }
}
