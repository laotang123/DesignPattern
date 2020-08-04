package indi.ljf.mvc.adm.service;

import indi.ljf.mvc.adm.repository.UserEntity;
import indi.ljf.mvc.adm.repository.UserRepository;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:18
 * @description：service层，负责业务逻辑
 * @modified By：
 * @version: $ 1.0
 */
public class UserService {
    private UserRepository repository;//TODO: 使用IOC容器注入

    public UserService() {
        repository = new UserRepository();
    }

    public UserBo getUserById(long userId) {
        UserEntity userEntity = repository.getUserById(userId);
        UserBo userBo = userEntity.createBo();
        return userBo;
    }
}