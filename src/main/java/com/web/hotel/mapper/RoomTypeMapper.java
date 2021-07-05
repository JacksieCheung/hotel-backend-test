package com.web.hotel.mapper;

import com.web.hotel.pojo.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface RoomTypeMapper {
    Integer createRoomType(RoomType roomType);
    ArrayList<RoomType> getRoomTypeList();
}
