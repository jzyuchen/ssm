package com.jzyuchen.wechat;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class WechatTemplateMessageBody {
    private String templateId;
    private Map<String, String> args;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }
}
