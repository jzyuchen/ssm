package com.jzyuchen.ssm.controller;

import com.jzyuchen.ssm.model.User;
import com.jzyuchen.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public
    @ResponseBody
    List<User> index() {
        return userService.findAll();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public
    @ResponseBody
    User show(@PathVariable(value = "id") int id) {
        return this.userService.find(id);
    }
}