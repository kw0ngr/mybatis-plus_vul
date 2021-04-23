package com.example.mybatis.plus.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.plus.demo.entity.SysUser;
import com.example.mybatis.plus.demo.mapper.UserMapper;
import com.example.mybatis.plus.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<SysUser> findList() {
        return userMapper.selectList(null);
    }

    @Override
    public IPage<SysUser> selectPage(Page<SysUser> page) {
        return userMapper.selectPage(page);
    }
}
