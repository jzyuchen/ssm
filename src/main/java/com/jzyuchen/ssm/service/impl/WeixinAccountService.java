package com.jzyuchen.ssm.service.impl;

import com.jzyuchen.ssm.dao.DynamicDataSourceContextHolder;
import com.jzyuchen.ssm.dao.WeixinAccountInfoMapper;
import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.service.IWeixinAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
@Service
public class WeixinAccountService implements IWeixinAccountService {

    @Resource(name = "weixinAccountInfoMapper")
    private WeixinAccountInfoMapper weixinAccountInfoMapper;

    @Override
    public WeixinAccountInfo find(String primaryKey) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        return this.weixinAccountInfoMapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public List<WeixinAccountInfo> findAll() {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        return this.weixinAccountInfoMapper.selectByExample(null);
    }

    @Override
    public String insert(WeixinAccountInfo entity) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        return this.weixinAccountInfoMapper.insert(entity) + "";
    }

    @Override
    public void delete(String primaryKey) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        this.weixinAccountInfoMapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public void update(WeixinAccountInfo entity) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        this.weixinAccountInfoMapper.updateByPrimaryKey(entity);
    }
}
