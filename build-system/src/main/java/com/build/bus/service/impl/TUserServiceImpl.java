package com.build.bus.service.impl;

import com.build.bus.base.BaseServiceImpl;
import com.build.bus.entity.TUser;
import com.build.bus.mapper.TUserMapper;
import com.build.bus.service.TUserService;
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