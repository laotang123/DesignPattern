package indi.ljf.mvc.ddd.dao;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/5 22:38
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
abstract public class VirtualWallet {
    protected BigDecimal balance;
    protected BigInteger walletId;

    public abstract BigDecimal getBalance();
    public abstract BigInteger getWalletId();

    public abstract void setBalance(BigDecimal balance);

}