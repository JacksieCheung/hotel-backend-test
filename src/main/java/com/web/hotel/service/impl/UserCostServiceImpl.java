package com.web.hotel.service.impl;

import com.web.hotel.mapper.UserCostMapper;
import com.web.hotel.pojo.UserCost;
import com.web.hotel.service.UserCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCostServiceImpl implements UserCostService {
    @Autowired
    UserCostMapper userCostMapper;

    @Override
    public Integer CreateRecord(UserCost userCost) {
        if (userCost==null)
            return -1;
        return userCostMapper.CreateRecord(userCost);
    }
}
