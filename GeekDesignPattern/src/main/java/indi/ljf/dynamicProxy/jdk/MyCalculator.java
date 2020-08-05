package indi.ljf.dynamicProxy.jdk;

/**
 * @author ：ljf
 * @date ：2020/8/5 9:18
 * @description：实现类
 * @modified By：
 * @version: $ 1.0
 */
public class MyCalculator implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
