package com.web.hotel.service.impl;

import com.web.hotel.mapper.UserInRoomMapper;
import com.web.hotel.pojo.UserInRoom;
import com.web.hotel.service.UserInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInRoomServiceImpl implements UserInRoomService {
    @Autowired
    UserInRoomMapper userInRoomMapper;

    @Override
    public Integer createRecord(UserInRoom userInRoom) {
        if (userInRoom==null)
            return -1;
        return userInRoomMapper.createRecord(userInRoom);
    }

    @Override
    public Integer deleteRecordById(Integer userId, Integer roomId) {
        return userInRoomMapper.deleteRecordById(userId,roomId);
    }
}
