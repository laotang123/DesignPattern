package indi.ljf.pattern.adapter.geek.base;

/**
 * @author ：ljf
 * @date ：2020/9/4 10:09
 * @description：待转换为ITarget适配接口的类
 * 针对这两种实现方式，在实际的开发中，到底该如何选择使用哪一种呢？
 * 判断的标准主要有两个，一个是 Adaptee 接口的个数，另一个是 Adaptee 和 ITarget 的契合程度。
 * 如果 Adaptee 接口并不多，那两种实现方式都可以。
 * 如果 Adaptee 接口很多，而且 Adaptee 和 ITarget 接口定义大部分都相同，那我们推荐使用类适配器，因为 Adaptor 复用父类 Adaptee 的接口，比起对象适配器的实现方式，Adaptor 的代码量要少一些。如果 Adaptee 接口很多，而且 Adaptee 和 ITarget 接口定义大部分都不相同，那我们推荐使用对象适配器，因为组合结构相对于继承更加灵活。
 * @modified By：
 * @version: $ 1.0
 */
public class Adaptee {
    public void fa(){
        System.out.println("fa method is called");
    }
    public void fb(){
        System.out.println("fa method is called");
    }

    public void fc(){
        System.out.println("fa method is called");
    }
}
