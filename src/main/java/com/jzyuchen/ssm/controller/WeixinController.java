package com.jzyuchen.ssm.controller;

import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.impl.WeixinAccountService;
import com.jzyuchen.ssm.service.impl.WeixinConfigurationService;
import com.jzyuchen.wechat.WechatThirdParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Controller
@RequestMapping(value = "weixin")
public class WeixinController {
    @Autowired
    private WeixinConfigurationService weixinConfigurationService;
    @Autowired
    private WeixinAccountService weixinAccountService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public
    @ResponseBody
    List<WeixinConfiguration> index() {
        return this.weixinConfigurationService.findAll();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public
    @ResponseBody
    WeixinAccountInfo show(@PathVariable(value = "id") String id) {
        return this.weixinAccountService.find(id);
    }

    @RequestMapping(value = {"/template"}, method = RequestMethod.POST)
    public
    @ResponseBody
    String sendTemplate() {
        return new WechatThirdParty("wxec25fb385ae5dce5", "b812cbe521c4451785d3515cb4bd92a6").getAccessToken();
    }
}