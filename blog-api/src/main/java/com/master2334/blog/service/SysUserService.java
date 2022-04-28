package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.SysUser;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(long id);

    UserVo findUserVoById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据账户查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    /**
     * 根据 token 查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);
}
