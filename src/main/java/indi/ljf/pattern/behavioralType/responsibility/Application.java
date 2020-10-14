package indi.ljf.pattern.behavioralType.responsibility;

/**
 * @author ：ljf
 * @date ：2020/10/14 14:13
 * @description：责任链模式：
 * 将一个请求依次发送给多个处理器进行处理，两种变体：
 * 1.只要遇到一个处理器能够处理请求便终止传递
 * 2.只要还有处理器便一直将请求向下传递
 * @modified By：
 * @version: $ 1.0
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();

        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
