package indi.ljf.pattern.behavioralType.strategy;

import java.io.File;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:21
 * @description：实现对不同大小文件的排序
 *
 * //当前版本中的排序算法会占用较多的代码行数，易读性差。选择拆分
 * @modified By：
 * @version: $ 1.0
 */
class Sorter {
    public static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();

        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } else if(fileSize < 100*GB){
            concurrentExternalSort(filePath);
        } else{
            mapReduceSort(filePath);
        }
    }

    private void mapReduceSort(String filePath) {

    }

    private void concurrentExternalSort(String filePath) {

    }

    private void externalSort(String filePath) {
        //外部排序
    }

    private void quickSort(String filePath) {
        //快排
    }
}

public class SortingTool {
}
