package com.web.hotel.service.impl;

import com.web.hotel.mapper.RoomMapper;
import com.web.hotel.pojo.RoomInfo;
import com.web.hotel.pojo.Rooms;
import com.web.hotel.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomsServiceImpl implements RoomsService {
    @Autowired
    RoomMapper roomMapper;

    public Rooms getRoomById(Integer id){
        return roomMapper.getRoomById(id);
    }

    public ArrayList<RoomInfo> getRoomList(){
        return roomMapper.getRoomList();
    }

    public Integer updateRoomStatusById(Integer status,Integer id){
        if (status<0||status>3)
            return -1;
        return roomMapper.updateRoomStatusById(status,id);
    }

    public Integer createRoom(Rooms room){
        if (room==null)
            return -1;
        return roomMapper.createRoom(room);
    }
}
