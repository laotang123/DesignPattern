package indi.ljf.pattern.behavioralType.strategy.common;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:41
 * @description：
 * @modified By：
 * @version: $ 1.0
 */
public class ConcurrentExternalSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("多线程并发外部排序");
    }
}
