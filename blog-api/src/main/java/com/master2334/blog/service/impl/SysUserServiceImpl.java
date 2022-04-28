package com.master2334.blog.service.impl;

import com.master2334.blog.dao.mapper.SysUserMapper;
import com.master2334.blog.dao.pojo.SysUser;
import com.master2334.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if(sysUser ==null){
            sysUser = new SysUser();
            sysUser.setNickname("码神之路");
        }
        return sysUserMapper.selectById(id);
    }

}
