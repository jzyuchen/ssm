package com.jzyuchen.ssm.controller;

import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.IWeixinAccountService;
import com.jzyuchen.ssm.service.IWeixinConfigurationService;
import com.jzyuchen.wechat.WechatThirdParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Controller
@RequestMapping(value = "weixin")
public class WeixinController {
    @Autowired
    private IWeixinConfigurationService weixinConfigurationService;
    @Autowired
    private IWeixinAccountService weixinAccountService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public
    @ResponseBody
    List<WeixinAccountInfo> index() {
        return this.weixinAccountService.findAll();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public
    @ResponseBody
    List<WeixinAccountInfo> show(@PathVariable(value = "id") String id) {
        return this.weixinAccountService.findByUserId(id);
    }

    @RequestMapping(value = {"/template"}, method = RequestMethod.POST)
    public
    @ResponseBody
    String sendTemplate(@RequestParam("orgId") int orgId, @RequestParam("userId") String userId) {
        WeixinConfiguration configuration = this.weixinConfigurationService.findByOrginzationId(orgId);

        if (configuration != null) {
            WeixinAccountInfo accountInfo = this.weixinAccountService.find(userId, configuration.getAppid());
            String accessToken = new WechatThirdParty(configuration.getAppid(), configuration.getAppsecret()).getAccessToken();
            return accessToken;
        }

        return "null";
//        return new WechatThirdParty("wxec25fb385ae5dce5", "b812cbe521c4451785d3515cb4bd92a6").getAccessToken();
    }
}