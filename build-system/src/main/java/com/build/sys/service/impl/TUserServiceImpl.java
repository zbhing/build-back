package com.build.sys.service.impl;

import com.build.core.base.BaseServiceImpl;
import com.build.sys.entity.TUser;
import com.build.sys.mapper.TUserMapper;
import com.build.sys.service.TUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author zbhing
 * @description impl
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class TUserServiceImpl extends BaseServiceImpl<TUserMapper, TUser> implements TUserService {

    private final TUserMapper tUserMapper;


    @Override
    public Optional<TUser> findById(String id) {
        TUser tUser = tUserMapper.selectById(id);
        return Optional.ofNullable(tUser);
    }
}