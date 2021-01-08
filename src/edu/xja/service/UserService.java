package edu.xja.service;

import edu.xja.entity.User;

public interface UserService {
    User getById(Integer id);

    User selectUserOrdersById2(User user);

}
