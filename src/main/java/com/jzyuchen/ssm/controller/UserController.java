package com.jzyuchen.ssm.controller;

import com.jzyuchen.ssm.model.User;
import com.jzyuchen.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String index(@RequestBody String code) {
        return code;
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public
    @ResponseBody
    User show(@PathVariable(value = "id") int id) {
        return this.userService.find(id);
    }
}
