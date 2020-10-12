package indi.ljf.pattern.behavioralType.strategy.common;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:42
 * @description：
 * @modified By：
 * @version: $ 1.0
 */
public class MapReduceSort implements ISortAlg{
    @Override
    public void sort(String filePath) {
        System.out.println("MapReduce超大数据排序");
    }
}
