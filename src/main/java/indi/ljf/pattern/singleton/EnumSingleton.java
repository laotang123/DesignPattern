/*
 * @encoding:: utf-8
 * @Date: 2020-06-24 20:04:13
 * @LastEditors: liujunfeng
 * @LastEditTime: 2020-06-24 20:06:49
 * @FilePath: \DesignPattern\src\main\java\com\ljf\pattern\singleton\EnumSingleton.java
 */ 
package indi.ljf.pattern.singleton;

//枚举类实现单例模式，防止反序列化
public enum EnumSingleton{
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(EnumSingleton.INSTANCE.hashCode());
            }).start();
        }
    }
}