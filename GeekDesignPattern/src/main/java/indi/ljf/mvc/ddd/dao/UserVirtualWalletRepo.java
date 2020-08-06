package indi.ljf.mvc.ddd.dao;

import indi.ljf.mvc.ddd.exception.KeyNonExistedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

/**
 * @author ：ljf
 * @date ：2020/8/6 9:20
 * @description：用户虚拟钱包管理类
 * @modified By：
 * @version: $ 1.0
 */
@Repository
public class UserVirtualWalletRepo extends VirtualWalletRepo {
    @Autowired
    private static HashMap<BigInteger,VirtualWallet> map;

    public UserVirtualWalletRepo(){
    }

    @Override
    public VirtualWallet getVirtualWallet(BigInteger walletId) throws KeyNonExistedException {
        VirtualWallet wallet = map.get(walletId);
        if(wallet == null){
            throw new KeyNonExistedException("the key: " + walletId + "not exist in HashMap<BigInteger,VirtualWallet> ");
        }

        return wallet;
    }

    @Override
    public void putVirtualWallet(BigInteger walletId, VirtualWallet wallet) {
        if(!map.containsKey(walletId)){
            map.put(walletId,wallet);
        }
    }

    @Override
    public void updateBalance(BigInteger walletId, BigDecimal amount){
        VirtualWallet wallet = map.get(walletId);
        wallet.setBalance(amount);
    }
}
