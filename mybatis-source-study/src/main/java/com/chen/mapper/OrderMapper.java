package com.chen.mapper;

import com.chen.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * @author chenkun
 * @Description
 * @date 2022/4/26 上午11:45
 */
public interface OrderMapper {
    List<Order> queryOrderList(Map map);
}
