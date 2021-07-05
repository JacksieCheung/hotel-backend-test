package com.web.hotel.service.impl;

import com.web.hotel.mapper.UsersMapper;
import com.web.hotel.pojo.Users;
import com.web.hotel.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users getUserByTelAndPwd(String tel, String pwd) {
        return usersMapper.getUserByTelAndPwd(tel,pwd);
    }

    @Override
    public ArrayList<Users> getUserList() {
        return usersMapper.getUserList();
    }

    @Override
    public Integer updateVipById(Integer id,Integer vip){
        return usersMapper.updateVipById(id,vip);
    }

    @Override
    public Users getUserById(Integer id) {
        return usersMapper.getUserById(id);
    }
}
