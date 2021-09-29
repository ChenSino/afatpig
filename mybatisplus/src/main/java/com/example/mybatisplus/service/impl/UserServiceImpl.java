package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
