package com.ljf.pattern.strategy;

/**
 * @author ：ljf
 * @date ：2020/6/14 10:52
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
