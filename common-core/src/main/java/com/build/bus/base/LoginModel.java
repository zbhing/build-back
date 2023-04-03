package com.build.bus.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author zbhing
 * @description 登陆用户模版
 */
@ApiModel(value = "登录对象",description = "登录对象")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginModel {
    @ApiModelProperty(value = "账号",position = 1)
    private String account;
    @ApiModelProperty(value = "密码",position = 2)
    private String password;
    @ApiModelProperty(value = "验证码",position = 3)
    private String captcha;
    @ApiModelProperty(value = "验证码Key",position = 4)
    private String checkKey;
    @ApiModelProperty(value = "邮箱验证码",position = 5)
    private String emailAuthCode;
    /**
     * 客户端id
     */
    private String clientId;
    /**
     * 返回类型
     */
    private String responseType;
    /**
     * 重定向URI
     */
    private String redirectUri;
    /**
     * 第三方id
     */
    private String thirdUserUuid;
}