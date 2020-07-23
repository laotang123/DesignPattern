package com.ljf.pattern.prototype;

/**
 * @author ：ljf
 * @date ：2020/7/23 14:45
 * @description：接口可clone的studnet
 * @modified By：
 * @version: $ 1.0
 */
public class Student implements Cloneable {
    private int id;
    private String name;
    private int age;

    @Override
    public Object clone() {
        Student stu = new Student();
        stu.setAge(age);
        stu.setId(id);
        stu.setName(name);
        return stu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
