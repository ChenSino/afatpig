package com.chen.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
