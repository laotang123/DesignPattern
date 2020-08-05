package indi.ljf.dynamicProxy.jdk;

/**
 * @author ：ljf
 * @date ：2020/8/5 9:31
 * @description：测试类
 * @modified By：
 * @version: $ 1.0
 */
public class Test {
    public static void main(String[] args) {
        Calculator proxy = (Calculator)CalculatorProxy.getProxy(new MyCalculator());
        System.out.println(proxy.add(1, 2));
    }
}
