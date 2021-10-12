package com.chen.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenkun
 * @Description UserDetail实现类
 * @date 2021/10/12 下午5:26
 */
@TableName(value = "t_user")
@Data
public class SysUser implements Serializable {
    @TableId(value = "uuid", type = IdType.UUID)
    private String uuid;
    @TableField(value = "username")
    private String username;
    @TableField(value = "password")
    private String password;

}
