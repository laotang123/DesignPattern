import indi.ljf.mvc.adm.controller.UserController;
import indi.ljf.mvc.adm.controller.UserVo;
import org.junit.Test;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:27
 * @description：测试贫血和充血两种模式下的扩展性
 * @modified By：
 * @version: $ 1.0
 */
public class MVCTest01 {

    @Test
    public void test01(){
        UserController controller = new UserController();
        UserVo userVo = controller.getUserById(1);
        System.out.println(userVo);
    }
}
