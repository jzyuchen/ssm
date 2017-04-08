package com.jzyuchen.ssm.service;

import com.jzyuchen.ssm.model.WeixinAccessToken;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public interface IWeixinAccessTokenService extends BaseService<WeixinAccessToken, Integer> {
    WeixinAccessToken findByAppId(String appId);
}
