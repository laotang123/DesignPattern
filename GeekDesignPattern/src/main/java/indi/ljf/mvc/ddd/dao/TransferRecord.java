package indi.ljf.mvc.ddd.dao;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/5 23:10
 * @description：交易记录
 * @modified By：
 * @version: 1.0
 */
@Repository
public class TransferRecord {
    /**
     * 转账id
     */
    private BigInteger transferId;

    /**
     * 转账时间记录，默认是new 该对象的时间
     * 也可以接受new 对象输入
     */
    private Date transferTime;

    /**
     * 转账金额
     */
    private BigDecimal transferAmount;

    /**
     * 转账类型，可接收参数为，transfer，withdraw，recharge
     */
    private String transferType;

    /**
     * 出账账户
     */
    private BigInteger transferFrom;

    /**
     * 入账账户
     */
    private BigInteger transferTo;

    public TransferRecord() {
    }

    public TransferRecord(BigInteger transferId, BigDecimal transferAmount, String transferType, BigInteger transferFrom, BigInteger transferTo) {
        this.transferTime = new Date();
        this.transferId = transferId;
        this.transferAmount = transferAmount;
        this.transferType = transferType;
        this.transferFrom = transferFrom;
        this.transferTo = transferTo;
    }


    public TransferRecord(BigInteger transferId, Date transferTime, BigDecimal transferAmount, String transferType, BigInteger transferFrom, BigInteger transferTo) {
        this.transferTime = transferTime;
        this.transferId = transferId;
        this.transferAmount = transferAmount;
        this.transferType = transferType;
        this.transferFrom = transferFrom;
        this.transferTo = transferTo;
    }

    public BigInteger getTransferId() {
        return transferId;
    }

    public void setTransferId(BigInteger transferId) {
        this.transferId = transferId;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public BigInteger getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(BigInteger transferFrom) {
        this.transferFrom = transferFrom;
    }

    public BigInteger getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(BigInteger transferTo) {
        this.transferTo = transferTo;
    }

    @Override
    public String toString() {
        return "TransferRecord{" +
                "transferId=" + transferId +
                ", transferTime=" + transferTime +
                ", transferAmount=" + transferAmount +
                ", transferType='" + transferType + '\'' +
                ", transferFrom=" + transferFrom +
                ", transferTo=" + transferTo +
                '}';
    }
}
