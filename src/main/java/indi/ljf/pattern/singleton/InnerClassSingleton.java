/*
 * @encoding:: utf-8
 * @Date: 2020-06-24 19:48:10
 * @LastEditors: liujunfeng
 * @LastEditTime: 2020-06-24 20:03:57
 * @FilePath: \DesignPattern\src\main\java\com\ljf\pattern\singleton\InnerClassSingleton.java
 * 内部类实现单例模式; JVM保证单例，加载外部类时不会加载内部类，实现懒加载
 */
package indi.ljf.pattern.singleton;

public class InnerClassSingleton {
    private InnerClassSingleton() {
        System.out.println("外部类初始化");
    }

    private static class InnerClass{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(InnerClassSingleton.getInstance().hashCode());
            }).start();
        }
    }
}
