package com.jzyuchen.ssm.service.impl;

import com.jzyuchen.ssm.dao.UserMapper;
import com.jzyuchen.ssm.model.User;
import com.jzyuchen.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Service
public class UserService implements IUserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public User find(Integer primaryKey) {
        return this.userMapper.selectByPrimaryKey(primaryKey);
    }

    public List<User> findAll() {
        return this.userMapper.selectByExample(null);
    }

    public Integer insert(User entity) {
        return this.userMapper.insert(entity);
    }

    public void delete(Integer primaryKey) {
        this.userMapper.deleteByPrimaryKey(primaryKey);
    }

    public void update(User entity) {
        this.userMapper.updateByPrimaryKey(entity);
    }
}
