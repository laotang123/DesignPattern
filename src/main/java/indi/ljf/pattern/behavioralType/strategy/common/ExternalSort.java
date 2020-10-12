package indi.ljf.pattern.behavioralType.strategy.common;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:40
 * @description：
 * @modified By：
 * @version: $ 1.0
 */
public class ExternalSort implements ISortAlg{
    @Override
    public void sort(String filePath) {
        System.out.println("实现外部排序算法");
    }
}
