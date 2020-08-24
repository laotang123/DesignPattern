import indi.ljf.mvc.ddd.controller.VirtualWalletController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/8 9:45
 * @description：ddd 充血模式测试
 * @modified By：
 * @version: 1.0
 */
public class DDDTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("ddd.xml");

    @Test
    public void test01(){
        VirtualWalletController virtualWalletController = context.getBean(VirtualWalletController.class);
        virtualWalletController.addUser(BigInteger.valueOf(1));
        virtualWalletController.addUser(BigInteger.valueOf(2));

        virtualWalletController.recharge(BigInteger.valueOf(1), BigDecimal.valueOf(100));
        virtualWalletController.recharge(BigInteger.valueOf(2),BigDecimal.valueOf(1000));
        virtualWalletController.transfer(BigInteger.valueOf(2),BigInteger.valueOf(1),BigDecimal.valueOf(100));
        System.out.println(virtualWalletController.getBalance(BigInteger.valueOf(1)));
        System.out.println(virtualWalletController.getTransferRecord(BigInteger.valueOf(1)));

    }
}
