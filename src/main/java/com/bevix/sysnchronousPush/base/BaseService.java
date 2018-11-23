package com.bevix.sysnchronousPush.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    protected T baseEntityMapper;
}
