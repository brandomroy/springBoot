package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/12 16:23
 * @desc:
 */

public interface AdminService {
    User log(String username, String pwd);
    List<Menu> getMenu();
}
