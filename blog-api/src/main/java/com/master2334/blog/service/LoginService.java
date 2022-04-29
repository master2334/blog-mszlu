package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.SysUser;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.params.LoginParam;

public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);
}


