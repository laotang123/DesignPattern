package indi.ljf.mvc.adm.controller;

import indi.ljf.mvc.adm.service.UserBo;
import indi.ljf.mvc.adm.service.UserService;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:14
 * @description：controller暴露接口给前端调用，控制user对象
 * @modified By：
 * @version: $ 1.0
 */
public class UserController {
    private UserService userService;//TODO: 使用IOC容器注入

    public UserController(){
        userService = new UserService();
    }

    public UserVo getUserById(long userId){
        UserBo userBo = userService.getUserById(userId);
        UserVo userVo = userBo.createVo();
        return userVo;
    }
}
