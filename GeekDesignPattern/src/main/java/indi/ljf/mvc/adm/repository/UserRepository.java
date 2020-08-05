package indi.ljf.mvc.adm.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:05
 * @description：操作实体对象user
 * @modified By：
 * @version: $ 1.0
 */
@Repository
public class UserRepository {
    private HashMap<Long, UserEntity> id2user = new HashMap<>();

    public UserEntity getUserById(long userId) {
        UserEntity userEntity = id2user.get(userId);
        if (userEntity == null) {
            userEntity = new UserEntity(userId, "小花", "1111");
        }
        return userEntity;
    }
}
