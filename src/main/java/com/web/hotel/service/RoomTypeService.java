package com.web.hotel.service;

import com.web.hotel.pojo.RoomType;

import java.util.ArrayList;

public interface RoomTypeService {
    public Integer createRoomType(RoomType roomType);
    public ArrayList<RoomType> getRoomTypeList();
}
