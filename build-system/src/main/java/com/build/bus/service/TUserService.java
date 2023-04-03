package com.build.bus.service;

import com.build.bus.base.BaseService;
import com.build.bus.entity.TUser;

import java.util.Optional;

/**
 * @author zbhing
 * @description TUserService
 */

public interface TUserService  extends BaseService<TUser> {


    /**
     * 查找一个
     * @param id t_user.id
     * @return TUser
     */
    Optional<TUser> findById(String id);

}