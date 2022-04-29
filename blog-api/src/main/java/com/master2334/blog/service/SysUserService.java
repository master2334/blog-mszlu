package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.SysUser;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(long id);

    SysUser findUser(String account, String pwd);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);
}
