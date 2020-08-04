package indi.ljf.pattern.strategy;

/**
 * @author ：ljf
 * @date ：2020/6/14 10:54
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
