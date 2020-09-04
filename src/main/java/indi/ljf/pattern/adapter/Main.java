package indi.ljf.pattern.adapter;

import indi.ljf.pattern.adapter.geek.base.Adaptee;
import indi.ljf.pattern.adapter.geek.base.ClassAdaptor;
import indi.ljf.pattern.adapter.geek.base.ObjectAdaptor;

/**
 * @author ：ljf
 * @date ：2020/7/24 16:50
 * @description：适配器模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * geek时间下的设计模式：
 * 基于类实现的适配器模式，基于对象实现的适配器模式
 * 业务场景：
 *  新老接口的适配，统一接口
 *  兼容老版本接口
 *  适配不同版本的数据
 * @modified By：
 * @version: $ 1.0
 */
public class Main {
    public static void main(String[] args) {
//        Task task = new Task(100000L);
//        Thread thread = new Thread(new RunnableAdapter(task));
//        thread.start();

        ClassAdaptor classAdaptor = new ClassAdaptor();
        classAdaptor.f1();

        ObjectAdaptor objectAdaptor = new ObjectAdaptor(new Adaptee());
        objectAdaptor.f1();
    }
}
