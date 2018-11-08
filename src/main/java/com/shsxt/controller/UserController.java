package com.shsxt.controller;

import com.shsxt.po.User;
import com.shsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Integer id) throws Exception {
        return userService.queryById(6);
    }

    @RequestMapping("delUser")
    @ResponseBody
    public Integer delUser(Integer id) throws Exception {
        return userService.delete(39);
    }

    @RequestMapping("addUser")
    @ResponseBody
    public Integer addUser(User user) throws Exception {
        return userService.insert(user);
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public Integer updateUser(User user) throws Exception {
        return userService.update(user);
    }

    @RequestMapping("queryByParams")
    @ResponseBody
    public List<User> queryByParams(Map map) throws Exception {
        return userService.queryByParams(map);
    }
}
