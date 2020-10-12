package indi.ljf.pattern.behavioralType.strategy.version2;

import indi.ljf.pattern.behavioralType.strategy.common.*;

import java.io.File;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:43
 * @description：
 * //由于排序算法的无状态，可以使用工厂模式代替ISortAlg实现类的重复创建
 * @modified By：
 * @version: $ 1.0
 */
public class Sorter {

    public static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg alg;

        if (fileSize < 6 * GB) {
            alg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            alg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            alg = new ConcurrentExternalSort();
        } else {
            alg = new MapReduceSort();
        }
        alg.sort(filePath);
    }

}
