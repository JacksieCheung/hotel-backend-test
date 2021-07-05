package com.web.hotel;

import com.web.hotel.pojo.RoomType;
import com.web.hotel.pojo.Rooms;
import com.web.hotel.service.UsersService;
import com.web.hotel.service.impl.RoomTypeServiceImpl;
import com.web.hotel.service.impl.RoomsServiceImpl;
import com.web.hotel.service.impl.UsersServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class HotelApplicationTests {

    @Autowired
    UsersServiceImpl usersService;
    @Autowired
    RoomTypeServiceImpl roomTypeService;
    @Autowired
    RoomsServiceImpl roomsService;

    @Test
    void contextLoads() throws SQLException {
        // System.out.println(usersService.getUserByTelAndPwd("15811852133","15811852133"));
        // System.out.println(usersService.getUserList());

        // RoomType roomType = new RoomType(25,"标准单人房");
        // roomTypeService.createRoomType(roomType);

        // System.out.println(roomsService.createRoom(new Rooms(2,0)));
        // System.out.println(roomsService.getRoomById(1));
        // System.out.println(roomsService.getRoomList());
        // System.out.println(roomsService.updateRoomStatusById(1,1));


    }

}
