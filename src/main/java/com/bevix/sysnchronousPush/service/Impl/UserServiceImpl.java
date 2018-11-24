package com.bevix.sysnchronousPush.service.Impl;

import com.bevix.sysnchronousPush.base.BaseService;
import com.bevix.sysnchronousPush.dao.UserDao;
import com.bevix.sysnchronousPush.entity.User;
import com.bevix.sysnchronousPush.service.UserService;

import java.util.List;

public class UserServiceImpl extends BaseService<UserDao> implements UserService {

    public List<User> getUserList() {
        return baseEntityMapper.queryUser();
    }
}
