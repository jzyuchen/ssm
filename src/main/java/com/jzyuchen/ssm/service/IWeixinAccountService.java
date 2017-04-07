package com.jzyuchen.ssm.service;

import com.jzyuchen.ssm.model.WeixinAccountInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public interface IWeixinAccountService extends BaseService<WeixinAccountInfo, String> {

    List<WeixinAccountInfo> findByUserId(String userId);

    WeixinAccountInfo find(String userId, String appId);
}