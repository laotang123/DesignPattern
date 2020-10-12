package indi.ljf.pattern.behavioralType.strategy.version3;

import indi.ljf.pattern.behavioralType.strategy.common.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：ljf
 * @date ：2020/10/12 13:51
 * @description：排序算法工厂，便于缓存无状态类
 * @modified By：
 * @version: $ 1.0
 */
public class SortAlgFactory {
    public static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("quickSort",new QuickSort());
        algs.put("externalSort",new ExternalSort());
        algs.put("concurrentExternalSort",new ConcurrentExternalSort());
        algs.put("mapReduceSort",new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type){
        if(type == null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return algs.get(type);
    }

}
