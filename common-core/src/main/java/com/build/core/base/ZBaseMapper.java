package com.build.core.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author zbhing
 * @description
 */
public interface ZBaseMapper<T> extends BaseMapper<T> {
    int insertBatchSomeColumn(List<T> entityList);
}