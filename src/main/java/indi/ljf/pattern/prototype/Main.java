package indi.ljf.pattern.prototype;

/**
 * @author ：ljf
 * @date ：2020/7/23 14:53
 * @description：原型模式，深拷贝与浅拷贝
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @modified By：
 * @version: $ 1.0
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);
        student.setName("小明");
        student.setAge(30);
        System.out.println(student);
        System.out.println(student.clone());
        System.out.println(student.clone() == student);
    }
}
