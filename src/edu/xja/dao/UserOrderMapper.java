package edu.xja.dao;

import edu.xja.entity.UserOrder;

import java.util.List;

public interface UserOrderMapper {
    List<UserOrder> selectUserOrderByUserId(Integer id);
}
