package com.ljf.pattern.strategy;

/**
 * @author ：ljf
 * @date ：2020/6/14 10:57
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("加法策略："+context.executeStrategy(1,2));

        context = new Context(new OperationSubtract());
        System.out.println("减法策略："+context.executeStrategy(5,2));
        context = new Context(new OperationMultiply());
        System.out.println("乘法策略："+context.executeStrategy(5,2));
    }
}
