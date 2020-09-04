package indi.ljf.pattern.adapter.geek.base;

/**
 * @author ：ljf
 * @date ：2020/9/4 10:14
 * @description：基于继承的类适配器
 * @modified By：
 * @version: $ 1.0
 */
public class ClassAdaptor extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    @Override
    public void f3() {
        super.fc();
    }
}
