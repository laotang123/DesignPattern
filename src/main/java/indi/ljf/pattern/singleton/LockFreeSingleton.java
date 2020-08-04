package indi.ljf.pattern.singleton;

/**
 * @author ：ljf
 * @date ：2020/6/14 21:29
 * @description：无锁版单例模式，实例化静态成员变量；这种方式避免了同步锁机制和双重检查耗费的时间
 * @modified By：
 * @version: $ 1.0
 */

public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("singleton is initialized");
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomethind() {
        System.out.println("something is done");
    }

    public static void main(String[] args) throws InterruptedException {
        final LockFreeSingleton l1 = LockFreeSingleton.getInstance();
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println("l1 hashCode: "+l1.hashCode());
                    System.out.println("new Object hashCode: "+LockFreeSingleton.getInstance().hashCode());
                    System.out.println(l1 == LockFreeSingleton.getInstance() );
                }
            }.start();
        }
    }
}
