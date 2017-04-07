package com.jzyuchen.ssm.service;

import com.jzyuchen.ssm.model.WeixinConfiguration;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
public interface IWeixinConfigurationService extends BaseService<WeixinConfiguration, Integer> {

    WeixinConfiguration findByOrginzationId(int orgId);

}
