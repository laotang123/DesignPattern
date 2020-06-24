/*
 * @encoding:: utf-8
 * @Date: 2020-06-24 19:32:33
 * @LastEditors: liujunfeng
 * @LastEditTime: 2020-06-24 19:38:51
 * @FilePath: \DesignPattern\src\main\java\com\ljf\pattern\singleton\HungrySingleton.java
 * 饿汉式实现单列模式
 * 优势：类加载时进行初始化，实现简单
 * 劣势：不用时也会被加载
 */
package com.ljf.pattern.singleton;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    };

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h1 == h2);
    }
}