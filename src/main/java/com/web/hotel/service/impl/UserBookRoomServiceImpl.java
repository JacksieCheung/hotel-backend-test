package com.web.hotel.service.impl;

import com.web.hotel.mapper.UserBookRoomMapper;
import com.web.hotel.pojo.UserBookRoom;
import com.web.hotel.service.UserBookRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBookRoomServiceImpl implements UserBookRoomService {
    @Autowired
    UserBookRoomMapper userBookRoomMapper;

    @Override
    public Integer CreateRecord(UserBookRoom userBookRoom) {
        if (userBookRoom==null)
            return -1;
        return userBookRoomMapper.CreateRecord(userBookRoom);
    }

    @Override
    public Integer DeleteRecordById(Integer roomId, Integer userId) {
        return userBookRoomMapper.DeleteRecordById(roomId,userId);
    }

    @Override
    public UserBookRoom GetRecordByRoomId(Integer roomId){
        return userBookRoomMapper.GetRecordByRoomId(roomId);
    }
}
