package com.ljf.pattern.adapter;

import java.util.concurrent.Callable;

/**
 * @author ：ljf
 * @date ：2020/7/24 16:45
 * @description：试下Callable接口
 * @modified By：
 * @version: $ 1.0
 */
public class Task implements Callable {
    private long num;

    public Task(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long res = 0;
        for (long i = 0; i < num; i++) {
            res += i;
        }
        System.out.println("Result: " + res);
        return res;
    }
}
