package indi.ljf.pattern.behavioralType.strategy.version3;

import indi.ljf.pattern.behavioralType.strategy.common.ISortAlg;

import java.io.File;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:57
 * @description：
 * 再次升级，使用查表法省略if else
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
            alg = SortAlgFactory.getSortAlg("quickSort");
        } else if (fileSize < 10 * GB) {
            alg = SortAlgFactory.getSortAlg("externalSort");
        } else if (fileSize < 100 * GB) {
            alg = SortAlgFactory.getSortAlg("concurrentExternalSort");
        } else {
            alg = SortAlgFactory.getSortAlg("mapReduceSort");
        }
        alg.sort(filePath);
    }
}
