package com.hwy.getdata.service.impl;

import com.hwy.getdata.dao.UserDao;
import com.hwy.getdata.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return this.userDao;
    }

    public void SetUserDao (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void GetUser() {
        userDao.GetUser();
    }
}
