package com.build.bus.base;

import com.baomidou.mybatisplus.extension.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zbhing
 * @description
 */
public class BaseController <T, S extends IService<T>>{

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    protected final String PAGE_NO = "pageNo";
    protected final String PAGE_SIZE = "pageSize";
    protected final String DEFAULT_PAGE_NO = "1";
    protected final String DEFAULT_PAGE_SIZE = "10";
}