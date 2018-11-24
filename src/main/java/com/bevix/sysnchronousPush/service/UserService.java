package com.bevix.sysnchronousPush.service;


import com.bevix.sysnchronousPush.base.BaseService;
import com.bevix.sysnchronousPush.dao.UserDao;
import com.bevix.sysnchronousPush.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{
    public List<User> getUserList();

}
