package com.bevix.sysnchronousPush.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;



@Controller
@RequestMapping("/v1")
@Api(tags = "API功能测试接口")
public class UserController {
    @Autowired
    UserController userController;


    private Logger ptr = LoggerFactory.getLogger( UserController.class );

//    @RequestMapping(value = "/userlist", method = RequestMethod.GET )

    @ApiOperation( value = "查询用户信息", notes = "all user")
    @RequestMapping(value="/user/{id}",method= RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> getUserList( @PathVariable("id") String id ){

        ptr.info( "-----------------------------------------id" + id  );
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put( "success", true );
        modelMap.put( "shopList", "www" );
        modelMap.put( "user", "wxx" );
        return modelMap;
    }



}
