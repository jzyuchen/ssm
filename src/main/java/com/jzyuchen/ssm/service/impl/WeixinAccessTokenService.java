package com.jzyuchen.ssm.service.impl;

import com.jzyuchen.ssm.dao.WeixinAccessTokenMapper;
import com.jzyuchen.ssm.model.WeixinAccessToken;
import com.jzyuchen.ssm.model.WeixinAccessTokenExample;
import com.jzyuchen.ssm.model.WeixinAccountInfoExample;
import com.jzyuchen.ssm.service.IWeixinAccessTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
@Service
public class WeixinAccessTokenService implements IWeixinAccessTokenService {

    @Resource(name = "weixinAccessTokenMapper")
    private WeixinAccessTokenMapper weixinAccessTokenMapper;

    @Override
    public WeixinAccessToken find(Integer primaryKey) {
        return this.weixinAccessTokenMapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public List<WeixinAccessToken> findAll() {
        return this.weixinAccessTokenMapper.selectByExample(null);
    }

    @Override
    public Integer insert(WeixinAccessToken entity) {
        return this.weixinAccessTokenMapper.insert(entity);
    }

    @Override
    public void delete(Integer primaryKey) {
        this.weixinAccessTokenMapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public void update(WeixinAccessToken entity) {
        this.weixinAccessTokenMapper.updateByPrimaryKey(entity);
    }

    @Override
    public WeixinAccessToken findByAppId(String appId) {
        WeixinAccessTokenExample example = new WeixinAccessTokenExample();
        example.createCriteria().andAppIdEqualTo(appId);
        List<WeixinAccessToken> list = this.weixinAccessTokenMapper.selectByExample(example);

        return list != null && list.size() > 0 ? list.get(0) : null;
    }
}
