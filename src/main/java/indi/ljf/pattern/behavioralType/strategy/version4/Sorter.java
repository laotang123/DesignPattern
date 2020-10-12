package indi.ljf.pattern.behavioralType.strategy.version4;

import indi.ljf.pattern.behavioralType.strategy.common.*;
import indi.ljf.pattern.behavioralType.strategy.version3.SortAlgFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/10/12 14:01
 * @description：
 * @modified By：
 * @version: $ 1.0
 */
public class Sorter {
    public static final long GB = 1000 * 1000 * 1000;
    public static final List<AlgRange> algs = new ArrayList<>();

    static {
        algs.add(new AlgRange(0, 6 * GB, new QuickSort()));
        algs.add(new AlgRange(6 * GB, 10 * GB, new ExternalSort()));
        algs.add(new AlgRange(10 * GB, 100 * GB, new ConcurrentExternalSort()));
        algs.add(new AlgRange(100 * GB, Long.MAX_VALUE, new MapReduceSort()));
    }

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;

        for (AlgRange alg : algs) {
            if(alg.inRange(fileSize)){
                sortAlg = alg.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

    private static class AlgRange {
        private long start;
        private long end;
        private ISortAlg alg;


        public AlgRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }

        public ISortAlg getAlg() {
            return alg;
        }

        public boolean inRange(long size) {
            return size >= start && size <= end;
        }
    }
}
