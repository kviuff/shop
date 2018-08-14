package com.kviuff.shop.common.exception;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义业务逻辑异常类
 *
 * @author kanglan
 * @date 2018/08/14
 */
@Data
public class LogicException extends RuntimeException {

    private Logger logger = LoggerFactory.getLogger(LogicException.class);

    /**
     * 错误消息内容
     */
    protected String errMsg;

    /**
     * 错误码
     */
    protected String errCode;

    /**
     * 格式化错误码时所需参数列表
     */
    protected String[] params;

    /**
     * 构造函数设置错误码以及错误参数列表
     *
     * @param errCode 错误码
     * @param params  错误参数列表
     */
    public LogicException(String errCode, String... params) {
        this.errCode = errCode;
        this.params = params;
//        this.errMsg =  ErrorMessageTools.getErrorMessage(errCode, params);
        logger.error("系统遇到如下异常，异常码：{}>>>异常信息：{}", errCode, errMsg);
    }

}
