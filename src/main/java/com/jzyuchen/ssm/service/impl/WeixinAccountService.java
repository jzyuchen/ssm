package com.jzyuchen.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.jzyuchen.ssm.dao.DynamicDataSourceContextHolder;
import com.jzyuchen.ssm.dao.WeixinAccountInfoMapper;
import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.model.WeixinAccountInfoExample;
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
        PageHelper.startPage(1, 10);
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

    @Override
    public List<WeixinAccountInfo> findByUserId(String userId) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        WeixinAccountInfoExample example = new WeixinAccountInfoExample();
        example.createCriteria().andUseridEqualTo(userId);

        return this.weixinAccountInfoMapper.selectByExample(example);
    }

    @Override
    public WeixinAccountInfo find(String userId, String appId) {
        DynamicDataSourceContextHolder.setCustomerType(DynamicDataSourceContextHolder.DATA_SOURCE_WEIXIN);
        WeixinAccountInfoExample example = new WeixinAccountInfoExample();
        example.createCriteria().andUseridEqualTo(userId).andAppidEqualTo(appId);

        List<WeixinAccountInfo> list = this.weixinAccountInfoMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
