package com.web.hotel.service;

import com.web.hotel.pojo.RoomInfo;
import com.web.hotel.pojo.Rooms;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface RoomsService {
    Rooms getRoomById(Integer id);
    ArrayList<RoomInfo> getRoomList();
    Integer updateRoomStatusById(Integer status,Integer id);
    Integer createRoom(Rooms room);
}
