package com.chen.mapper;

import com.chen.entity.Order;
import com.chen.vo.OrderVo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author afatpig
 * @date 2021/9/26 下午3:20
 */
public interface OrderMapper {

    List<Order> findOrderList();

    Order findById(Long id);

    Order findByVo(OrderVo orderVo);

    List<Order> pageQuery(RowBounds rowBounds);

    void deleteOne();
}
