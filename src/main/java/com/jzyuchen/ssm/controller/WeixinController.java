package com.jzyuchen.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.jzyuchen.ssm.model.WeixinAccessToken;
import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.IWeixinAccessTokenService;
import com.jzyuchen.ssm.service.IWeixinAccountService;
import com.jzyuchen.ssm.service.IWeixinConfigurationService;
import com.jzyuchen.wechat.WechatTemplateMessage;
import com.jzyuchen.wechat.WechatTemplateMessageBody;
import com.jzyuchen.wechat.WechatThirdParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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
    @Autowired
    private IWeixinAccessTokenService weixinAccessTokenService;

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
            // 获取accessToken;
            WeixinAccessToken weixinAccessToken = this.weixinAccessTokenService.findByAppId(configuration.getAppid());
            if (weixinAccessToken == null || weixinAccessToken.isExpired()) {
                WeixinAccountInfo accountInfo = this.weixinAccountService.find(userId, configuration.getAppid());
                WechatThirdParty wechatThirdParty = new WechatThirdParty(configuration.getAppid(), configuration.getAppsecret());
                String accessToken = wechatThirdParty.getAccessToken();
                weixinAccessToken = JSON.parseObject(accessToken, WeixinAccessToken.class);
                weixinAccessToken.setAppId(configuration.getAppid());
                if (weixinAccessToken.getId() == 0) {
                    this.weixinAccessTokenService.insert(weixinAccessToken);
                } else {
                    this.weixinAccessTokenService.update(weixinAccessToken);
                }

                this.sendTemplateMessage(accountInfo.getOpenid());
//                WechatTemplateMessage templateMessage = new WechatTemplateMessage();
//                templateMessage.setToUsername(accountInfo.getOpenid());
//                WechatTemplateMessageBody body = new WechatTemplateMessageBody();
////                body.setTemplateId();
//                wechatThirdParty.sendTemplateMessage(new WechatTemplateMessage(accountInfo.getOpenid(), new Tem))
            }
        }

        return "null";
//        return new WechatThirdParty("wxec25fb385ae5dce5", "b812cbe521c4451785d3515cb4bd92a6").getAccessToken();
    }

    private void sendTemplateMessage(String openId) {
        String templateId = "";
        WechatTemplateMessage msg = new WechatTemplateMessage();
        msg.setToUsername(openId);
//        msg.addData(key, content, Color.getColor("#000000"));
//        msg.addData(key, content, color);
//        msg.addData(key, content, color);
//        msg.addData(key, content, color);
//        msg.addData(key, content, color);
//        msg.send();
    }
}