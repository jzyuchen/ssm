package com.jzyuchen.ssm.dao;

import com.jzyuchen.ssm.model.WeixinAccountInfo;
import com.jzyuchen.ssm.model.WeixinAccountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WeixinAccountInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    @Delete({
        "delete from weixin_account_info",
        "where wxuserid = #{wxuserid,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String wxuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    @Insert({
        "insert into weixin_account_info (wxuserid, appid, ",
        "openid, username, userid, ",
        "regtime, status)",
        "values (#{wxuserid,jdbcType=CHAR}, #{appid,jdbcType=VARCHAR}, ",
        "#{openid,jdbcType=VARCHAR}, #{username,jdbcType=CHAR}, #{userid,jdbcType=CHAR}, ",
        "#{regtime,jdbcType=VARCHAR}, #{status,jdbcType=BIT})"
    })
    int insert(WeixinAccountInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    int insertSelective(WeixinAccountInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    List<WeixinAccountInfo> selectByExample(WeixinAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "wxuserid, appid, openid, username, userid, regtime, status",
        "from weixin_account_info",
        "where wxuserid = #{wxuserid,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    WeixinAccountInfo selectByPrimaryKey(String wxuserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WeixinAccountInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_account_info
     *
     * @mbggenerated
     */
    @Update({
        "update weixin_account_info",
        "set appid = #{appid,jdbcType=VARCHAR},",
          "openid = #{openid,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=CHAR},",
          "userid = #{userid,jdbcType=CHAR},",
          "regtime = #{regtime,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=BIT}",
        "where wxuserid = #{wxuserid,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(WeixinAccountInfo record);
}