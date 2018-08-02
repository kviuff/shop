package com.kviuff.shop.common.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "system_user")
public class UserPo implements Serializable {

    /**
     * id
     */
    private String id;

    /**
     * 登录账号
     */
    private String loginCode;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户昵称
     */
    private String nickCode;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 用户类型
     */
    private String userType;

}
