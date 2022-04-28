package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.SysUser;

public interface UserService {

    SysUser findUserById(Long userId);
}

