package com.build.sys.handler;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.build.core.api.vo.Result;
import com.build.core.base.BaseController;
import com.build.core.base.LoginModel;
import com.build.core.mybatis.TenantContext;
import com.build.sys.entity.TUser;
import com.build.sys.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author zbhing
 * @description
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Api(tags = "系统用户")
public class TUserController extends BaseController<TUser, TUserService> {

    private final  TUserService tUserService;

    @ApiOperation(value = "根据指定用户账号查询接口")
    @GetMapping("/getUser/{id}")
    public Result<?> getUserById(@PathVariable String id)
    {
        Optional<TUser> byId = tUserService.findById(id);
        return Result.ok(byId.orElse(null));
    }

    @ApiOperation(value = "系统用户分页接口")
    @GetMapping("/page")
    public Result<?> getPage(TUser tUser,
                             @RequestParam(name = PAGE_NO, defaultValue = DEFAULT_PAGE_NO) Integer pageNo,
                             @RequestParam(name = PAGE_SIZE, defaultValue = DEFAULT_PAGE_SIZE) Integer pageSize)
    {
        Page<TUser> tUserPage =new Page<>(pageNo,pageSize);
        LambdaQueryWrapper<TUser> queryWrapper = Wrappers.lambdaQuery();
        IPage<TUser> page = tUserService.page(tUserPage, queryWrapper);
        return Result.ok(page);
    }

    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public Result<JSONObject> login(@RequestBody LoginModel logUser)
    {
        Result<JSONObject> result = new Result<>();
        // 存全局当前登陆用户
        TenantContext.setTenant(logUser.getAccount());
        //check user
        return result;
    }

}