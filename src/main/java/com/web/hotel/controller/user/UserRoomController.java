package com.web.hotel.controller.user;

import com.web.hotel.pojo.RoomInfo;
import com.web.hotel.pojo.Rooms;
import com.web.hotel.pojo.UserBookRoom;
import com.web.hotel.pojo.UserInRoom;
import com.web.hotel.service.impl.RoomsServiceImpl;
import com.web.hotel.service.impl.UserBookRoomServiceImpl;
import com.web.hotel.service.impl.UserInRoomServiceImpl;
import com.web.hotel.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/user/user_room")
@SessionAttributes("userId")
public class UserRoomController {
    @Autowired
    RoomsServiceImpl roomsService;
    @Autowired
    UserInRoomServiceImpl userInRoomService;
    @Autowired
    UserBookRoomServiceImpl userBookRoomService;

    @RequestMapping(value = "/open_room/{roomId}",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse OpenRoom(@PathVariable Integer roomId,@ModelAttribute("userId") Integer userId){
        Rooms room = roomsService.getRoomById(roomId);
        if (room==null)
            return APIResponse.fail401("wrong room id");

        if (room.getStatus()==0){
            userInRoomService.createRecord(new UserInRoom(userId,room.getId()));
            roomsService.updateRoomStatusById(2,room.getId());
        } else if (room.getStatus()==1){
            UserBookRoom bookRoom = userBookRoomService.GetRecordByRoomId(room.getId());
            if (bookRoom==null)
                return APIResponse.fail500("database error");
            if (!bookRoom.getUserId().equals(userId))
                return APIResponse.fail401("this room has been booked");
            userInRoomService.createRecord(new UserInRoom(userId,room.getId()));
            roomsService.updateRoomStatusById(2,room.getId());
            userBookRoomService.DeleteRecordById(room.getId(),userId);
        } else {
            return APIResponse.fail401("this room is being used");
        }

        return APIResponse.success("open room success");
    }

    @RequestMapping(value = "/book_room/{roomId}",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse BookRoom(@PathVariable Integer roomId,@ModelAttribute("userId") Integer userId){
        Rooms room = roomsService.getRoomById(roomId);
        if (room==null)
            return APIResponse.fail401("wrong room id");

        if (room.getStatus()!=0)
            return APIResponse.fail401("this room can not be booked");

        userBookRoomService.CreateRecord(new UserBookRoom(userId,roomId));
        roomsService.updateRoomStatusById(1,roomId);

        return APIResponse.success("book room success");
    }

    @RequestMapping(value = "/return_room/{roomId}",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse ReturnRoom(@PathVariable Integer roomId,@ModelAttribute("userId") Integer userId){
        userInRoomService.deleteRecordById(userId,roomId);
        roomsService.updateRoomStatusById(0,roomId);
        return APIResponse.success("return room success");
    }

    @RequestMapping(value = "/list_room",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public APIResponse ListRoom(){
        ArrayList<RoomInfo> list = roomsService.getRoomList();
        if (list==null)
            return APIResponse.fail404("not found");
        return APIResponse.success(list);
    }
}
