package indi.ljf.mvc.adm.repository;

import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/6 20:49
 * @description：操作交易记录
 * @modified By：
 * @version: 1.0
 */
@Repository
public class TransferRecordRepo {

    private static HashMap<BigInteger, List<TransferRecord>> map = new HashMap<>();

    public static List<TransferRecord> getTransferRecords(BigInteger walletId){
        List<TransferRecord> records = map.getOrDefault(walletId, new ArrayList<>());
        return records;
    }

    public static void putTransferRecord(BigInteger walletId, TransferRecord record){
        List<TransferRecord> records = map.getOrDefault(walletId, new ArrayList<>());
        records.add(record);
        if(records.size() == 1){
            map.put(walletId,records);
        }
    }
}
