package com.jzyuchen.wechat;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
public class WechatThirdParty {

    private final String appId;
    private final String appSecret;

    public WechatThirdParty(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getAccessToken() {

        String baseUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
        String url = String.format(baseUrl, this.appId, this.appSecret);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet method = new HttpGet(url);
        try (CloseableHttpResponse response = httpClient.execute(method)) {
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
