package com.chen.service;

import com.baomidou.mybatisplus.service.IService;
import com.chen.entity.Order;
import com.chen.vo.OrderVo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/12 下午5:02
 */
public interface IOrderService extends IService<Order> {

    List<Order> findOrderList();

    Order findById(Long id);

    Order findByVo(OrderVo orderVo);

    List<Order> pageQuery(RowBounds rowBounds);

    void deleteOne();
}
