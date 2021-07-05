package com.web.hotel.mapper;

import com.web.hotel.pojo.UserInRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInRoomMapper {
    public Integer createRecord(UserInRoom userInRoom);
    public Integer deleteRecordById(@Param("userId") Integer userId,@Param("roomId") Integer roomId);
}
