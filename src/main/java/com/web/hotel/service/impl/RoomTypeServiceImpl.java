package com.web.hotel.service.impl;

import com.web.hotel.mapper.RoomTypeMapper;
import com.web.hotel.pojo.RoomType;
import com.web.hotel.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    RoomTypeMapper roomTypeMapper;

    @Override
    public Integer createRoomType(RoomType roomType) {
        if (roomType==null)
            return -1;
        return roomTypeMapper.createRoomType(roomType);
    }

    @Override
    public ArrayList<RoomType> getRoomTypeList() {
        return roomTypeMapper.getRoomTypeList();
    }
}
