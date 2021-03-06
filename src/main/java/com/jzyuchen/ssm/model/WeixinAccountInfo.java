package com.jzyuchen.ssm.model;

public class WeixinAccountInfo extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.wxuserid
     *
     * @mbggenerated
     */
    private String wxuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.appid
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.openid
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.userid
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.regtime
     *
     * @mbggenerated
     */
    private String regtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_account_info.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    public WeixinAccountInfo(String wxuserid, String appid, String openid, String username, String userid, String regtime, Boolean status) {
        this.wxuserid = wxuserid;
        this.appid = appid;
        this.openid = openid;
        this.username = username;
        this.userid = userid;
        this.regtime = regtime;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    public WeixinAccountInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.wxuserid
     *
     * @return the value of weixin_account_info.wxuserid
     *
     * @mbggenerated
     */
    public String getWxuserid() {
        return wxuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.wxuserid
     *
     * @param wxuserid the value for weixin_account_info.wxuserid
     *
     * @mbggenerated
     */
    public void setWxuserid(String wxuserid) {
        this.wxuserid = wxuserid == null ? null : wxuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.appid
     *
     * @return the value of weixin_account_info.appid
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.appid
     *
     * @param appid the value for weixin_account_info.appid
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.openid
     *
     * @return the value of weixin_account_info.openid
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.openid
     *
     * @param openid the value for weixin_account_info.openid
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.username
     *
     * @return the value of weixin_account_info.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.username
     *
     * @param username the value for weixin_account_info.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.userid
     *
     * @return the value of weixin_account_info.userid
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.userid
     *
     * @param userid the value for weixin_account_info.userid
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.regtime
     *
     * @return the value of weixin_account_info.regtime
     *
     * @mbggenerated
     */
    public String getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.regtime
     *
     * @param regtime the value for weixin_account_info.regtime
     *
     * @mbggenerated
     */
    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_account_info.status
     *
     * @return the value of weixin_account_info.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_account_info.status
     *
     * @param status the value for weixin_account_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}