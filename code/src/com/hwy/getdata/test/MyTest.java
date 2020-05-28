package com.hwy.getdata.test;

import com.hwy.getdata.dao.impl.UserDaoImpl;
import com.hwy.getdata.dao.impl.UserDaoMysqlImpl;
import com.hwy.getdata.dao.impl.UserDaoOracleImpl;
import com.hwy.getdata.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.SetUserDao(new UserDaoImpl());
        userService.GetUser();

        userService.SetUserDao(new UserDaoMysqlImpl());
        userService.GetUser();

        userService.SetUserDao(new UserDaoOracleImpl());
        userService.GetUser();
    }
}
