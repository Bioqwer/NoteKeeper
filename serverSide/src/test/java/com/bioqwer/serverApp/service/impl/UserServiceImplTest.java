package com.bioqwer.serverApp.service.impl;

import com.bioqwer.serverApp.config.DataConfig;
import com.bioqwer.serverApp.model.User;
import com.bioqwer.serverApp.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;
    User user;

    @Before
    public void setUp() {
        user = new User();
        user.setEmail("email@ka.ru");
        user.setLogin("bioqw");
        user.setPassword("las12tn@ame");
    }

    @Test
    public void sampleTestCase() {
        for (int i = 0; i < 2; i++) {
            userService.addUser(user);
        }
    }

    @Test
    public void findSavedUserById() {
        User dbUser = userService.getById(1);
        System.out.println("dbUser = " + dbUser);
    }


}