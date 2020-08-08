package indi.ljf.mvc.adm.service;

import indi.ljf.mvc.adm.repository.*;
import indi.ljf.mvc.adm.exception.KeyNonExistedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/6 20:41
 * @description：用户虚拟钱包，服务层
 * @modified By：
 * @version: 1.0
 */
@Service
public class UserVirtualWalletService extends VirtualWalletService {
    @Autowired
    private UserVirtualWalletRepo userVirtualWalletRepo;
    private TransferRecordRepo transferRecordRepo;

    private BigInteger transferId = BigInteger.valueOf(0);

    @Override
    public BigDecimal getBalance(BigInteger walletId) {
        VirtualWallet wallet = null;
        try {
            wallet = userVirtualWalletRepo.getVirtualWallet(walletId);
        } catch (KeyNonExistedException e) {
            e.printStackTrace();
        }
        BigDecimal balance = wallet.getBalance();
        return balance;
    }

    @Override
    public List<TransferRecord> getTransferRecord(BigInteger walletId) {
        List<TransferRecord> records = transferRecordRepo.getTransferRecords(walletId);
        return records;
    }


    @Override
    public void withdraw(BigInteger walletId, BigDecimal amount) {
        VirtualWallet wallet = null;
        try {
           wallet  = userVirtualWalletRepo.getVirtualWallet(walletId);
        } catch (KeyNonExistedException e) {
            e.printStackTrace();
        }
        BigDecimal balance = wallet.getBalance();
        wallet.setBalance(balance.subtract(amount));

        TransferRecord record = new TransferRecord();
        record.setTransferType("withdraw");
        record.setTransferTime(new Date());
        transferId = this.transferId.add(BigInteger.valueOf(1));
        record.setTransferId(transferId);
        record.setTransferTo(null);
        record.setTransferFrom(walletId);
        record.setTransferAmount(amount);

        transferRecordRepo.putTransferRecord(walletId,record);
    }

    @Override
    public void recharge(BigInteger walletId, BigDecimal amount) {
        VirtualWallet wallet = null;
        try {
            wallet = userVirtualWalletRepo.getVirtualWallet(walletId);
        } catch (KeyNonExistedException e) {
            e.printStackTrace();
        }
        BigDecimal balance = wallet.getBalance();
        wallet.setBalance(balance.add(amount));

        TransferRecord record = new TransferRecord();
        record.setTransferType("recharge");
        record.setTransferTime(new Date());
        transferId = this.transferId.add(BigInteger.valueOf(1));
        record.setTransferId(transferId);
        record.setTransferTo(walletId);
        record.setTransferFrom(null);
        record.setTransferAmount(amount);

        transferRecordRepo.putTransferRecord(walletId,record);
    }

    @Override
    public void transfer(BigInteger fromWalletId, BigInteger toWalletId, BigDecimal amount) {
        VirtualWallet fromWallet = null;
        VirtualWallet toWallet = null;
        try {
            fromWallet = userVirtualWalletRepo.getVirtualWallet(fromWalletId);
            toWallet = userVirtualWalletRepo.getVirtualWallet(toWalletId);
        } catch (KeyNonExistedException e) {
            e.printStackTrace();
        }

        //先取钱，再充钱
        withdraw(fromWalletId,amount);
        recharge(toWalletId,amount);
        TransferRecord record = new TransferRecord();
        record.setTransferAmount(amount);
        record.setTransferFrom(fromWalletId);
        record.setTransferTo(toWalletId);
        transferId = transferId.add(BigInteger.valueOf(1));
        record.setTransferId(transferId);
        record.setTransferTime(new Date());
        record.setTransferType("transfer");

        //更新交易记录，转入和转出账户都要更新
        transferRecordRepo.putTransferRecord(fromWalletId,record);
        transferRecordRepo.putTransferRecord(toWalletId,record);
    }

    public void addUser(BigInteger walletId){
        userVirtualWalletRepo.putVirtualWallet(walletId,new UserVirtualWallet(walletId));
    }

}
