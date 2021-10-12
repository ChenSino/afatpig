package com.chen.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.chen.entity.Order;
import com.chen.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
/**
 * @author afatpig
 * @date 2021/9/26 下午3:20
 */
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> findOrderList();

    Order findById(Long id);

    Order findByVo(OrderVo orderVo);

    List<Order> pageQuery(RowBounds rowBounds);

    void deleteOne();
}
