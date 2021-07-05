package com.web.hotel.service;

import com.web.hotel.pojo.Users;
import java.util.ArrayList;

public interface UsersService {
    public Users getUserByTelAndPwd(String tel, String pwd);
    public ArrayList<Users> getUserList();
    Integer updateVipById(Integer id,Integer vip);
    Users getUserById(Integer id);
}
