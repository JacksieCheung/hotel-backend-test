package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInRoom {
    private Integer id;
    private Integer userId;
    private Integer roomId;
    private Integer re;
    private String createAt;
    private String deleteAt;

    public UserInRoom(Integer userId,Integer roomId){
        this.userId = userId;
        this.roomId = roomId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRe(Integer re) {
        this.re = re;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Integer getRe() {
        return re;
    }

    public String getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
    }
}
