package com.web.hotel.mapper;

import com.web.hotel.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface UsersMapper {
    Users getUserByTelAndPwd(@Param("tel") String tel,@Param("pwd") String pwd);
    ArrayList<Users> getUserList();
    Integer updateVipById(@Param("id") Integer id,@Param("vip") Integer vip);
    Users getUserById(@Param("id") Integer id);
}
