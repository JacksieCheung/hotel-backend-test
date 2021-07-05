package com.web.hotel.mapper;

import com.web.hotel.pojo.UserBookRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserBookRoomMapper {
    public Integer CreateRecord(UserBookRoom userBookRoom);
    public Integer DeleteRecordById(@Param("rid") Integer roomId,@Param("uid") Integer userId);
    public UserBookRoom GetRecordByRoomId(@Param("roomId") Integer roomId);
}
