package indi.ljf.pattern.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/8/28 10:12
 * @description：深拷贝与浅拷贝 深拷贝实现方式：
 * 1.递归拷贝对象，直到对象类型为基本数据类型
 * 2.现将对象序列化，再将对象反序列化
 * @modified By：
 * @version: $ 1.0
 */
public class Teacher implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private List<Student> students;

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Teacher clone() {
        Teacher result = null;
        try {
            result = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
        return result;
    }

    public Teacher deepCopy() throws Exception {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        return (Teacher) oi.readObject();
    }

    public Teacher lightCopy() {
        Teacher result = this.clone();
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", students=" + students +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("laowang", 20);
        teacher.addStudent(new Student(1, "job", 20));
        System.out.println(teacher);
        Teacher lightCopyTeacher = teacher.lightCopy();
        System.out.println(lightCopyTeacher);
        Teacher deepCopyTeacher = teacher.deepCopy();
        System.out.println(deepCopyTeacher);


        teacher.students.get(0).setAge(30);
        System.out.println(teacher);
        System.out.println(lightCopyTeacher);
        System.out.println(deepCopyTeacher);
    }
}
