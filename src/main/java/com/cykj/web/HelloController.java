package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.Menu;
import com.cykj.bean.ReturnMsg;
import com.cykj.bean.User;
import com.cykj.service.AdminService;
import com.cykj.service.impl.AdminServiceImpl;
import com.google.gson.Gson;
import com.sun.media.sound.SoftTuning;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/12 15:55
 * @desc:
 */
@Controller
@RequestMapping("/admin")
public class HelloController {
    @Autowired
    private AdminServiceImpl adminService;
//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
//    登录
    @ResponseBody
    @PostMapping("/toLog")
    public String toLog(String username,String pwd){
        System.out.println("toLog:"+username+"--"+pwd);
        User log = adminService.log(username, pwd);
        System.out.println("登录成功"+log);
        return "tolog成功了";
    }
    @ResponseBody
    @RequestMapping("/getMenu")
    public String getMenu(){
        System.out.println("getMenu");
        List<Menu> menu = adminService.getMenu();
        ReturnMsg getMenu = new ReturnMsg();
        System.out.println("--"+menu);
        getMenu.setType("200");
        getMenu.setMenu(menu);
        String msg = JSON.toJSONString(getMenu);
        return msg;
    }
}
