package com.web.hotel.service;

import com.web.hotel.pojo.UserBookRoom;

public interface UserBookRoomService {
    public Integer CreateRecord(UserBookRoom userBookRoom);
    public Integer DeleteRecordById(Integer roomId,Integer userId);
    public UserBookRoom GetRecordByRoomId(Integer roomId);
}
