package com.web.hotel.service;

import com.web.hotel.pojo.UserInRoom;

public interface UserInRoomService {
    public Integer createRecord(UserInRoom userInRoom);
    public Integer deleteRecordById(Integer userId,Integer roomId);
}
