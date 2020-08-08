package indi.ljf.mvc.adm.repository;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/5 22:59
 * @description：用户虚拟钱包
 * @modified By：
 * @version: 1.0
 */
@Repository
public class UserVirtualWallet extends VirtualWallet {
    private String userName;

    public UserVirtualWallet(){}

    public UserVirtualWallet(BigInteger walletId){
        this.walletId = walletId;
        this.userName = "";
        this.balance = BigDecimal.ZERO;
    }
    public UserVirtualWallet(String userName,BigInteger walletId){
        this.userName = userName;
        this.walletId = walletId;
        this.balance = BigDecimal.ZERO;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public void setWalletId(BigInteger walletId){
        this.walletId = walletId;
    }
    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public BigInteger getWalletId() {
        return walletId;
    }

    @Override
    public String toString() {
        return "UserVirtualWallet{" +
                "userName='" + userName + '\'' +
                ", balance=" + balance +
                ", walletId=" + walletId +
                '}';
    }

    public static void main(String[] args) {
        VirtualWallet userVirtualWallet = new UserVirtualWallet("小红",BigInteger.valueOf(1));
        userVirtualWallet.setBalance(BigDecimal.valueOf(100000));
        System.out.println(userVirtualWallet);

    }
}
