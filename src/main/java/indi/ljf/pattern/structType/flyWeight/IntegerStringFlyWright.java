package indi.ljf.pattern.structType.flyWeight;

/**
 * @author ：ljf
 * @date ：2020/9/7 11:43
 * @description：享元模式在Integer和String中的应用
 * @modified By：
 * @version: $ 1.0
 */
public class IntegerStringFlyWright {
    public static void main(String[] args) {
        Integer i1 = 56;
        Integer i2 = 56;
        Integer i3 = 129;
        Integer i4 = 129;

        /**
         * 自动装箱触发Integer.valueOf，值在-128到127会从IntegerCache类中查找
         */
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);


        System.out.println("String 中的字符串常量池=============================");
        String s1 = String.valueOf("刘俊峰");
        String s2 = String.valueOf("刘俊峰");
        String s3 = new String("刘俊峰");

        /**
         * 字符串常量池，享元模式，对象复用
         */
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
//        String.valueOf()
    }
}
