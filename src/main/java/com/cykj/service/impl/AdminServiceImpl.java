package com.cykj.service.impl;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import com.cykj.mapper.HelloMapper;
import com.cykj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/12 16:24
 * @desc:
 */
@Service("helloService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public User log(String username, String pwd) {
        User login = helloMapper.login(username, pwd);
        return login;
    }

    @Override
    public List<Menu> getMenu() {
        List<Menu> getMenu = helloMapper.getMenu();
        return getMenu;
    }
}
