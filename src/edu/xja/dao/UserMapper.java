package edu.xja.dao;

import edu.xja.entity.User;
import edu.xja.pojo.MapUser;
import edu.xja.pojo.SeletUserParam;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser(SeletUserParam param);
    Integer addUser(User user);
    List<MapUser> selectuserMap();
    User getById(Integer id);
}
