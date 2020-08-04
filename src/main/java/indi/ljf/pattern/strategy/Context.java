package indi.ljf.pattern.strategy;

/**
 * @author ：ljf
 * @date ：2020/6/14 10:55
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
