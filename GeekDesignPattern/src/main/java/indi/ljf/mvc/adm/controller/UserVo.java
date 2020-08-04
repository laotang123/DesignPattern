package indi.ljf.mvc.adm.controller;

/**
 * @author ：ljf
 * @date ：2020/8/4 8:58
 * @description：user view object，controller层暴露接口，展示user对象
 * @modified By：
 * @version: $ 1.0
 */
public class UserVo {
    private long id;
    private String name;
    private String cellPhone;


    public UserVo(long id, String name, String cellPhone) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
    }

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

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}

