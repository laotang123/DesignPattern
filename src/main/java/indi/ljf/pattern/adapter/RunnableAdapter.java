package indi.ljf.pattern.adapter;

import java.util.concurrent.Callable;

/**
 * @author ：ljf
 * @date ：2020/7/24 16:53
 * @description：Callable对象转为Runnable对象的转换适配器
 * @modified By：
 * @version: $ 1.0
 */
public class RunnableAdapter implements Runnable{
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable){
        this.callable = callable;
    }
    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
