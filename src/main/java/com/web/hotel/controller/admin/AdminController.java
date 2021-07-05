package com.web.hotel.controller.admin;

import com.web.hotel.pojo.RoomType;
import com.web.hotel.pojo.Rooms;
import com.web.hotel.pojo.UserCost;
import com.web.hotel.pojo.Users;
import com.web.hotel.service.impl.RoomTypeServiceImpl;
import com.web.hotel.service.impl.RoomsServiceImpl;
import com.web.hotel.service.impl.UserCostServiceImpl;
import com.web.hotel.service.impl.UsersServiceImpl;
import com.web.hotel.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/admin")
@SessionAttributes("userId")
public class AdminController {
    @Autowired
    RoomTypeServiceImpl roomTypeService;
    @Autowired
    RoomsServiceImpl roomsService;
    @Autowired
    UserCostServiceImpl userCostService;
    @Autowired
    UsersServiceImpl usersService;

    @RequestMapping(value = "/room_type",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse AddRoomType(@RequestBody Map params){
        roomTypeService.createRoomType(new RoomType(Integer.parseInt((String) params.get("price")),(String) params.get("info")));
        return APIResponse.success("add room type success");
    }

    @RequestMapping(value = "/room_num",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse AddRoom(@RequestBody Map params){
        roomsService.createRoom(new Rooms((Integer) params.get("type_id")));
        return APIResponse.success("add room success");
    }

    @RequestMapping(value = "/user_cost",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse CreateCostRecord(@RequestBody Map params){
        userCostService.CreateRecord(new UserCost(Integer.parseInt((String) params.get("cost")),(String) params.get("info"),(Integer) params.get("user_id")));
        return APIResponse.success("create cost record success");
    }

    @RequestMapping(value = "/user_vip",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    public APIResponse UpdateVip(@RequestBody Map params){
        Users user = usersService.getUserById((Integer) params.get("user_id"));
        if (user==null)
            return APIResponse.fail401("wrong user id");

        if (user.getVip()==1){
            usersService.updateVipById(user.getId(),0);
            return APIResponse.success("update success");
        }

        usersService.updateVipById(user.getId(),1);
        return APIResponse.success("update success");
    }

    @RequestMapping(value = "/list_user",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public APIResponse listUser(){
        ArrayList<Users> list = usersService.getUserList();
        if (list==null)
            return APIResponse.fail404("no user");
        return APIResponse.success(list);
    }

    @RequestMapping(value = "/list_room_type",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public APIResponse ListRoomType(){
        ArrayList<RoomType> list = roomTypeService.getRoomTypeList();
        if (list==null)
            return APIResponse.fail404("no room type");
        return APIResponse.success(list);
    }
}
