package indi.ljf.mvc.adm.repository;

import indi.ljf.mvc.adm.exception.KeyNonExistedException;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ：ljf
 * @date ：2020/8/6 9:17
 * @description：抽象的钱包管理类
 * @modified By：
 * @version: $ 1.0
 */
@Repository
public abstract class VirtualWalletRepo {
    public abstract VirtualWallet getVirtualWallet(BigInteger walletId) throws KeyNonExistedException;

    public abstract void putVirtualWallet(BigInteger walletId, VirtualWallet wallet);

    public abstract void updateBalance(BigInteger walletId, BigDecimal balance);
}
