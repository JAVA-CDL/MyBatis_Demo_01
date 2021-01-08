package edu.xja.dao;

import edu.xja.entity.Role;
import edu.xja.entity.User;
import edu.xja.pojo.SeletUserParam;

import java.util.List;

public interface RoleMapper {
    Role selectById(Integer id);
    List<Role> findAll();
    Integer add(Role role);
    Integer delete(Integer id);
    Integer update(Role role);
}
