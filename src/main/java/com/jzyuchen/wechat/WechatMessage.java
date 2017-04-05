package com.jzyuchen.wechat;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
public abstract class WechatMessage {

    private String toUsername;
    private String fromUserName;
    private Date createTime;

    public String getToUsername() {
        return toUsername;
    }

    public void setToUsername(String toUsername) {
        this.toUsername = toUsername;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
