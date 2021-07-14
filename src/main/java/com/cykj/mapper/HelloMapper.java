package com.cykj.mapper;


import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/9 17:08
 * @desc:
 */

@Mapper
public interface HelloMapper {
    public User login(@Param("username") String username, @Param("pwd") String pwd);
    List<Menu> getMenu();
}
