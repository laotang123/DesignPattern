package indi.ljf.pattern.createType.singleton;

/**
 * @author ：ljf
 * @date ：2020/6/14 22:00
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class Main {
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
