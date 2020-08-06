package indi.ljf.mvc.ddd.dao;

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
public class TransferRecord {
    private BigInteger transferId;
    private Date transferTime;
    private BigDecimal transferAmount;
    private String transferType;
    private Integer transferFrom;
    private Integer transferTo;

    public TransferRecord(){}

    public TransferRecord(BigInteger transferId){
        this.transferTime = new Date();
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

    public Integer getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(Integer transferFrom) {
        this.transferFrom = transferFrom;
    }

    public Integer getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(Integer transferTo) {
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
