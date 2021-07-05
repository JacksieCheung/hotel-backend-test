package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBookRoom {
    private Integer id;
    private Integer userId;
    private Integer roomId;
    private Integer re;
    private String createAt;

    public UserBookRoom(Integer userId,Integer roomId){
        this.userId = userId;
        this.roomId = roomId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getRe() {
        return re;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void setRe(Integer re) {
        this.re = re;
    }
}
