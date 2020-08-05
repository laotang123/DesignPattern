package indi.ljf.dynamicProxy.jdk;

/**
 * @author ：ljf
 * @date ：2020/8/5 9:17
 * @description：jdk实现动态代理中的接口类
 * @modified By：
 * @version: $ 1.0
 */
public interface Calculator {
    public int add(int i, int j);

    public int sub(int i, int j);

    public int mul(int i, int j);

    public int div(int i, int j);
}
