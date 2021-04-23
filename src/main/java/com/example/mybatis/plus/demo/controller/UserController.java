package com.example.mybatis.plus.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.plus.demo.entity.SysUser;
import com.example.mybatis.plus.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findList")
    public List<SysUser> findList() {
        return userService.findList();
    }

    /**
     * Page(current,size)
     * current:当前页,long类型
     * size:每页显示的数量,long类型
     * 可参考其构造方法
     */
    @RequestMapping("selectPage")
    public Object selectPage(Page<SysUser> page) {
        try {
            return userService.selectPage(page);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
