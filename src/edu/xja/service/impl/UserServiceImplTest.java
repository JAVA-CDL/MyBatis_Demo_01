package edu.xja.service.impl;

import edu.xja.entity.User;
import edu.xja.service.UserService;
import org.junit.Test;


public class UserServiceImplTest {

    @Test
    public void getById() {
        UserService userService = new UserServiceImpl();
        User user = userService.getById(1);
        System.out.println(user.getUid());
        User user1 = userService.selectUserOrdersById2(user);
        System.out.println(user1);
    }
}
