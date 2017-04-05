package com.jzyuchen.ssm.service.impl;

import com.jzyuchen.ssm.dao.UserMapper;
import com.jzyuchen.ssm.dao.WeixinConfigurationMapper;
import com.jzyuchen.ssm.model.WeixinConfiguration;
import com.jzyuchen.ssm.service.IWeixinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
@Service
public class WeixinService implements IWeixinService {

    @Resource(name = "weixinConfigurationMapper")
    private WeixinConfigurationMapper weixinConfigurationMapper;

    public void addConfiguration(WeixinConfiguration configuration) {
        this.weixinConfigurationMapper.insert(configuration);
    }

    public void deleteConfiguration(int primaryKey) {
        this.weixinConfigurationMapper.deleteByPrimaryKey(primaryKey);
    }

    public List<WeixinConfiguration> listConfiguration() {
        return this.weixinConfigurationMapper.selectByExample(null);
    }

    public void updateConfiguration(WeixinConfiguration configuration) {
        this.weixinConfigurationMapper.updateByPrimaryKey(configuration);
    }

    public WeixinConfiguration find(int primaryKey) {
        return this.weixinConfigurationMapper.selectByPrimaryKey(primaryKey);
    }
}
