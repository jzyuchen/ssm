package com.jzyuchen.ssm.dao;

import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class DynamicDataSourceContextHolder {
    public static final String DATA_SOURCE_ORGANIZATION = "organizationDataSource";
    public static final String DATA_SOURCE_WEIXIN = "weixinDataSource";
    //用ThreadLocal来设置当前线程使用哪个dataSource
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        String dataSource = contextHolder.get();
        if (StringUtils.isEmpty(dataSource)) {
            return DATA_SOURCE_ORGANIZATION;
        } else {
            return dataSource;
        }
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
