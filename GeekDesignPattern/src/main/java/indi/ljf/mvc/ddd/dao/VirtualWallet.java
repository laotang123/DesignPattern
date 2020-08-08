package indi.ljf.mvc.ddd.dao;

import com.sun.xml.internal.messaging.saaj.soap.ver1_2.BodyElement1_2Impl;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/5 22:38
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
@Repository
abstract public class VirtualWallet {
    protected BigDecimal balance;
    protected BigInteger walletId;

    public abstract BigDecimal getBalance();
    public abstract BigInteger getWalletId();

    protected abstract void setBalance(BigDecimal balance);

    public abstract void recharge(BigInteger walletId,BigDecimal amount);

    public abstract void withdraw(BigInteger walletId, BigDecimal amount);

}
