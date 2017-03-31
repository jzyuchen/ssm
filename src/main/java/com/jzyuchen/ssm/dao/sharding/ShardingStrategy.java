package com.jzyuchen.ssm.dao.sharding;

import com.google.code.shardbatis.strategy.ShardStrategy;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class ShardingStrategy implements ShardStrategy {
    public String getTargetTableName(String tableName, Object o, String s1) {
        String sTableName = tableName + "_A01";
        return sTableName;
    }
}
