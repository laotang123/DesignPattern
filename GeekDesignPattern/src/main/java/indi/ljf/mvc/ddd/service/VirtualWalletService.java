package indi.ljf.mvc.ddd.service;

import indi.ljf.mvc.ddd.dao.TransferRecord;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/8/6 9:36
 * @description：虚拟钱包服务
 * @modified By：
 * @version: $ 1.0
 */
@Service
public abstract class VirtualWalletService {
    /**
     * 获取指定钱包id的钱包金额
     * @param walletId
     * @return
     */
    public abstract BigDecimal getBalance(BigInteger walletId);

    /**
     * 根据钱包Id，返回对应的转账记录；TODO：实现多种形式的转账记录查询：Byid，byTime
     * @param walletId
     * @return
     */
    public abstract List<TransferRecord> getTransferRecord(BigInteger walletId);
    /**
     * 取现业务
     * @param walletId：取钱的账户
     * @param amount：取钱的金额
     */
    public abstract void withdraw(BigInteger walletId, BigDecimal amount);

    /**
     * 充值业务
     * @param walletId：待充值钱包id
     * @param amount：充值金额
     */
    public abstract void recharge(BigInteger walletId,BigDecimal amount);

    /**
     * 转账业务 TODO: 根据id判断获取对应的服务
     * @param fromWalletId：转出钱包id
     * @param toWalletId：转入钱包id
     * @param amount：转账金额
     */
    public abstract void transfer(BigInteger fromWalletId,BigInteger toWalletId,BigDecimal amount);
}
