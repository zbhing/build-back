package com.build.core.api.vo;

import com.build.core.api.constant.CommonConstant;

import java.io.Serial;
import java.io.Serializable;

/**
 * API 层通用返回对象
 * @author zbhing
 * @description
 */
public class Result<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    // @ApiModelProperty("成功标志")
    private boolean success = true;
    // @ApiModelProperty("返回处理消息")
    private String message = "操作成功！";
    // @ApiModelProperty("返回代码")
    private Integer code;
    // @ApiModelProperty("返回数据对象")
    private T result;
    // @ApiModelProperty("时间戳")
    private long timestamp;

    public Result() {
        this.code = CommonConstant.SC_OK_200;
        this.timestamp = System.currentTimeMillis();
    }

    public Result<T> success(String message) {
        this.message = message;
        this.code = CommonConstant.SC_OK_200;
        this.success = true;
        return this;
    }

    public static Result<Object> ok() {
        Result<Object> r = new Result<>();
        r.setSuccess(true);
        r.setCode(CommonConstant.SC_OK_200);
        r.setMessage("成功");
        return r;
    }

    public static Result<Object> ok(String msg) {
        Result<Object> r = new Result<>();
        r.setSuccess(true);
        r.setCode(CommonConstant.SC_OK_200);
        r.setMessage(msg);
        return r;
    }

    public static Result<Object> ok(Object data) {
        Result<Object> r = new Result<>();
        r.setSuccess(true);
        r.setCode(CommonConstant.SC_OK_200);
        r.setResult(data);
        return r;
    }

    public static Result<Object> ok(String msg, Object data) {
        Result<Object> r = new Result<>();
        r.setSuccess(true);
        r.setCode(CommonConstant.SC_OK_200);
        r.setResult(data);
        r.setMessage(msg);
        return r;
    }

    public static Result<Object> error(String msg) {
        return error(CommonConstant.SC_INTERNAL_SERVER_ERROR_500, msg);
    }

    public static Result<Object> error(int code, String msg) {
        Result<Object> r = new Result<>();
        r.setCode(code);
        r.setMessage(msg);
        r.setSuccess(false);
        return r;
    }

    public Result<T> error500(String message) {
        this.message = message;
        this.code = CommonConstant.SC_INTERNAL_SERVER_ERROR_500;
        this.success = false;
        return this;
    }

    public static Result<Object> noAuth(String msg) {
        return error(CommonConstant.SC_ELS_NO_AUTHZ, msg);
    }

    public static Result<Object> tokenExpire(String msg) {
        return error(CommonConstant.SC_ELS_TOKEN_EXPIRE, msg);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getCode() {
        return this.code;
    }

    public T getResult() {
        return this.result;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setResult(final T result) {
        this.result = result;
    }

    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
}