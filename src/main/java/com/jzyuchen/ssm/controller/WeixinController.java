package com.jzyuchen.ssm.controller;

import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.impl.WeixinService;
import com.jzyuchen.wechat.WechatThirdParty;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Controller
@RequestMapping(value = "weixin")
public class WeixinController {
    @Autowired
    private WeixinService weixinService;

    @RequestMapping(value = {"", "/"})
    public
    @ResponseBody
    List<WeixinConfiguration> index() {
        return this.weixinService.listConfiguration();
    }

    public
    @ResponseBody
    WeixinConfiguration show(@PathVariable(value = "id") int id) {
        return this.weixinService.find(id);
    }

    @RequestMapping(value = {"/template"})
    public
    @ResponseBody
    String sendTemplate() {
        return new WechatThirdParty("wxec25fb385ae5dce5", "b812cbe521c4451785d3515cb4bd92a6").getAccessToken();
    }
}