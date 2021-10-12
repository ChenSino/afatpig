package com.chen.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.chen.entity.Order;
import com.chen.mapper.OrderMapper;
import com.chen.service.IOrderService;
import com.chen.vo.OrderVo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/12 下午5:02
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findOrderList() {
        return orderMapper.findOrderList();
    }

    @Override
    public Order findById(Long id) {
        return orderMapper.findById(id);
    }

    @Override
    public Order findByVo(OrderVo orderVo) {
        return orderMapper.findByVo(orderVo);
    }

    @Override
    public List<Order> pageQuery(RowBounds rowBounds) {
        return orderMapper.pageQuery(rowBounds);
    }

    @Override
    public void deleteOne() {
        orderMapper.deleteOne();
    }
}
