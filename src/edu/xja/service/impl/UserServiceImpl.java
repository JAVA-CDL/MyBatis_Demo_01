package edu.xja.service.impl;

import edu.xja.dao.UserMapper;
import edu.xja.dao.UserOrderMapper;
import edu.xja.entity.User;
import edu.xja.entity.UserOrder;
import edu.xja.service.UserService;
import edu.xja.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public User getById(Integer id) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getById(id);

        return user;
    }

    @Override
    public User selectUserOrdersById2(User user) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSessionFactory().openSession();
        UserOrderMapper userOrderMapper = sqlSession.getMapper(UserOrderMapper.class);
        List<UserOrder> userOrderList = userOrderMapper.selectUserOrderByUserId(user.getUid());
        user.setUserOrderList(userOrderList);
        return user;
    }
}
