package com.jzyuchen.wechat;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class WechatTemplateMessage extends WechatMessage {
    private WechatTemplateMessageBody messageBody;

    public WechatTemplateMessageBody getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(WechatTemplateMessageBody messageBody) {
        this.messageBody = messageBody;
    }
}
