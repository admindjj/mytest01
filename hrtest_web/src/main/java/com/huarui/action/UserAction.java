package com.huarui.action;

import com.huarui.entity.Users;
import com.huarui.service.UsersService;
import com.huarui.service.impl.UsersServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@Controller
public class UserAction {
    @RequestMapping("/testfindall")
    @ResponseBody
    public List<Users> findall(){
        UsersService usersService= new UsersServiceimpl();
        return  usersService.findall();
    }
}
