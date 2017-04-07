package com.jzyuchen.ssm.service.impl;

import com.jzyuchen.ssm.dao.DynamicDataSourceContextHolder;
import com.jzyuchen.ssm.dao.WeixinConfigurationMapper;
import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.IWeixinConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Service
public class WeixinConfigurationService implements IWeixinConfigurationService {

    @Resource(name = "weixinConfigurationMapper")
    private WeixinConfigurationMapper weixinConfigurationMapper;

    @Override
    public WeixinConfiguration find(Integer primaryKey) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_ORGANIZATION);
        return this.weixinConfigurationMapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public List<WeixinConfiguration> findAll() {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_ORGANIZATION);
        return this.weixinConfigurationMapper.selectByExample(null);
    }

    @Override
    public Integer insert(WeixinConfiguration entity) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_ORGANIZATION);
        return this.weixinConfigurationMapper.insert(entity);
    }

    @Override
    public void delete(Integer primaryKey) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_ORGANIZATION);
        this.weixinConfigurationMapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public void update(WeixinConfiguration entity) {

        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_ORGANIZATION);
        this.weixinConfigurationMapper.updateByPrimaryKey(entity);
    }
}
