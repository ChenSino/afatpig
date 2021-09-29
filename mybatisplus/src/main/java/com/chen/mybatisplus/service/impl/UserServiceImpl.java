package com.chen.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mybatisplus.entity.User;
import com.chen.mybatisplus.mapper.UserMapper;
import com.chen.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
