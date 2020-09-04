package indi.ljf.pattern.adapter.geek.base;

/**
 * @author ：ljf
 * @date ：2020/9/4 10:42
 * @description：对象适配器
 * @modified By：
 * @version: $ 1.0
 */
public class ObjectAdaptor implements ITarget {
    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void f3() {
        adaptee.fc();
    }
}
