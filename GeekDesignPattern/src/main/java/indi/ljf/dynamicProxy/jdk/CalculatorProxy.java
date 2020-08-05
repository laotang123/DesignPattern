package indi.ljf.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ：ljf
 * @date ：2020/8/5 9:22
 * @description：calculator的代理类
 * @modified By：
 * @version: $ 1.0
 */
public class CalculatorProxy {
    public static Object getProxy(Object object) {
        ClassLoader classLoader = object.getClass().getClassLoader();
        Class<?>[] interfaces = object.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println(method.getName()+"方法开始执行，执行参数为："+ Arrays.toString(args));
                    result = method.invoke(object, args);
                    System.out.println(method.getName()+"方法执行结束");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return result;
            }
        };
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
        return o;
    }
}
