package com.bevix.sysnchronousPush.controller;


import com.bevix.sysnchronousPush.service.RedisCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    private Logger logger = LoggerFactory.getLogger( this.getClass() );
    @Autowired
    private RedisCacheService redisCacheService;

    @RequestMapping("/view")
    public String view() {
        logger.info("你已通过springMVC进入controller方法");
        logger.info("-------存储数据---------");
        redisCacheService.putSessionObject("123","wwwwwww");
        logger.info("-------读取数据---------");
        redisCacheService.getsessionObject("123");
//        logger.info("-------删除数据---------");
//        redisCacheService.clearSessionObject("123");
//        logger.info("-------删除后再次读取数据---------");
//        redisCacheService.getsessionObject("123");
        return "index";
    }
}
