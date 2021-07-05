package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Integer id;
    private String tel;
    private Integer role;
    private String idCard;
    private Integer vip;
    private String createAt;
    private String password;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Integer getRole() {
        return role;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getVip() {
        return vip;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getPassword() {
        return password;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }
}
