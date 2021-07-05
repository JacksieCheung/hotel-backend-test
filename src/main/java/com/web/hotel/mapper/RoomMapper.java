package com.web.hotel.mapper;

import com.web.hotel.pojo.RoomInfo;
import com.web.hotel.pojo.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface RoomMapper {
    Rooms  getRoomById(@Param("id") Integer id);
    ArrayList<RoomInfo> getRoomList();
    Integer updateRoomStatusById(@Param("status") Integer status,@Param("id") Integer id);
    Integer createRoom(Rooms room);
}
