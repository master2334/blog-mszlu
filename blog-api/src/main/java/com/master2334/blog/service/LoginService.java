package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.SysUser;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.params.LoginParam;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Transactional
public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}


