package indi.ljf.mvc.adm.controller;

import indi.ljf.mvc.adm.repository.TransferRecord;
import indi.ljf.mvc.adm.service.UserVirtualWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/8/6 9:13
 * @description：controller层，主要功能暴露接口给前端
 * @modified By：
 * @version: $ 1.0
 */
@Controller
public class VirtualWalletController {
    @Autowired
    private UserVirtualWalletService userVirtualWalletService;

    public BigDecimal getBalance(BigInteger walletId){
        return userVirtualWalletService.getBalance(walletId);
    }

    public List<TransferRecord> getTransferRecord(BigInteger walletId){
        return userVirtualWalletService.getTransferRecord(walletId);
    }

    public void withdraw(BigInteger walletId, BigDecimal amount){
        userVirtualWalletService.withdraw(walletId,amount);
    }

    public void recharge(BigInteger walletId, BigDecimal amount){
        userVirtualWalletService.recharge(walletId,amount);
    }

    public void addUser(BigInteger walletId){
        userVirtualWalletService.addUser(walletId);
    }
    public void transfer(BigInteger fromWalletId, BigInteger toWalletId, BigDecimal amount){
        userVirtualWalletService.transfer(fromWalletId,toWalletId,amount);
    }
}
