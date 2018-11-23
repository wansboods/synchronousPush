package com.bevix.sysnchronousPush.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


//private Logger logger = LoggerFactory.getLogger( UserController.class );


@Controller
@RequestMapping("/v1")
public class UserController {
    @Autowired
    UserController userController;

    @RequestMapping(value = "/userlist", method = RequestMethod.GET )
    @ResponseBody
    private Map<String,Object> getUserList(HttpServletRequest request ){

        System.out.print( "-----------------------------------------" );
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put( "success", true );
        modelMap.put( "shopList", "www" );
        modelMap.put( "user", "wxx" );
        return modelMap;
    }



}
