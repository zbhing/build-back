package com.build.sys.service;

import com.build.core.base.BaseService;
import com.build.sys.entity.TUser;
import org.springframework.transaction.annotation.Transactional;

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