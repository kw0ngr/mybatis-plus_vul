package com.example.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.plus.demo.entity.SysUser;

public interface UserMapper extends BaseMapper<SysUser> {
    IPage<SysUser> selectPage(Page<SysUser> page);
}
