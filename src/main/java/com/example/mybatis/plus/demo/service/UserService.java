package com.example.mybatis.plus.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.plus.demo.entity.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findList();

    IPage<SysUser> selectPage(Page<SysUser> page);
}
