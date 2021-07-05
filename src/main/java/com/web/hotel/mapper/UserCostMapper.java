package com.web.hotel.mapper;

import com.web.hotel.pojo.UserCost;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserCostMapper {
    public Integer CreateRecord(UserCost userCost);
}
