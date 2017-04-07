package com.jzyuchen.ssm.dao.sharding;

import com.google.code.shardbatis.strategy.ShardStrategy;
import com.google.common.base.Strings;

import java.util.zip.CRC32;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class ShardingStrategy implements ShardStrategy {
    public String getTargetTableName(String tableName, Object o, String mapper) {
        if (mapper.equals("com.jzyuchen.ssm.dao.WeixinAccountInfoMapper.selectByPrimaryKey")) {
            String primaryKey = (String) o;
            String tableId = hashTableId(primaryKey, 20);
            String sTableName = tableName + "_" + Strings.padStart(tableId, 2, '0');
            return sTableName;
        }

        return tableName;
    }

    private static String hashTableId(String data, int range) {
        CRC32 crc32 = new CRC32();
        crc32.update(data.getBytes());
        long hash = crc32.getValue();
        System.out.println("hash=" + hash);
        hash = hash % range + 1;
        System.out.println("id=" + hash);
        return String.valueOf(hash);
    }
}
