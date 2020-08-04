package indi.ljf.mvc.adm.service;

import indi.ljf.mvc.adm.controller.UserVo;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:16
 * @description：user business object
 * @modified By：
 * @version: $ 1.0
 */
public class UserBo {
    private long userId;
    private String name;
    private String cellPhone;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public UserBo(long userId, String name, String cellPhone) {
        this.userId = userId;
        this.name = name;
        this.cellPhone = cellPhone;
    }

    public UserVo createVo() {
        return new UserVo(userId, name, cellPhone);
    }

    @Override
    public String toString() {
        return "UserBo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
