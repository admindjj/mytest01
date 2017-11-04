package com.huarui.service.impl;

import com.huarui.dao.UsersDao;
import com.huarui.dao.impl.UsersDaoImpl;
import com.huarui.entity.Users;
import com.huarui.service.UsersService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UsersServiceimpl implements UsersService{
    @Override
    public List<Users> findall() {
        UsersDao usersDao = new UsersDaoImpl();
        return usersDao.findall();
    }
}
