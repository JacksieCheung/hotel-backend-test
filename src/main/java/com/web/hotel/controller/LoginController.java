package com.web.hotel.controller;

import com.web.hotel.pojo.Users;
import com.web.hotel.service.impl.UsersServiceImpl;
import com.web.hotel.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    UsersServiceImpl usersService;

    @RequestMapping(value = "/login",headers="Accept=*/*",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public APIResponse login(HttpServletRequest request, @RequestBody Map params){
        String tel = (String) params.get("tel");
        String pwd = (String) params.get("pwd");
        Users user = usersService.getUserByTelAndPwd(tel,pwd);
        if (user==null){
            return APIResponse.fail401("wrong pwd or tel");
        }

        HttpSession session = request.getSession();
        session.setAttribute("userId",user.getId());
        session.setAttribute("role",user.getRole());
        HashMap map = new HashMap<>();
        map.put("sessionId",session.getId());
        map.put("role",user.getRole());
        return APIResponse.success(map);
    }
}
