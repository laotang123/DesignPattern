package indi.ljf.mvc.adm.repository;

import indi.ljf.mvc.adm.service.UserBo;

/**
 * @author ：ljf
 * @date ：2020/8/4 9:02
 * @description：user实体对象
 * @modified By：
 * @version: $ 1.0
 */
public class UserEntity {
    private long id;
    private String name;
    private String cellPhone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public UserEntity(long id, String name, String cellPhone) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
    }


    public UserBo createBo() {
        return new UserBo(id, name, cellPhone);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
