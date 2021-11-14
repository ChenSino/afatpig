package com.chen;

import com.alibaba.fastjson.JSON;
import com.chen.entity.Order;
import com.chen.vo.OrderVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author afatpig
 * @date 2021/9/26 下午3:26
 */
public class Client {

    @Test
    public void findOrderList() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Order> orderList = sqlSession.selectList("com.chen.mapper.OrderMapper.findOrderList");
        orderList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void findById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order = sqlSession.selectOne("com.chen.mapper.OrderMapper.findById", 1L);
        System.out.println(order);
        sqlSession.close();
    }

    @Test
    public void findByUsername() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order = sqlSession.selectOne("com.chen.mapper.OrderMapper.findByUsername", "zhangsan");
        System.out.println(order);
        sqlSession.close();
    }

    @Test
    public void findByVo() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderVo orderVo = new OrderVo();
        orderVo.setUsername("zhangsan");
        Order order = sqlSession.selectOne("com.chen.mapper.OrderMapper.findByVo", orderVo);
        System.out.println(order);
        sqlSession.close();
    }

    @Test
    public void pageQuery() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        RowBounds rowBounds = new RowBounds(2, 2);
        List<Order> orders = sqlSession.selectList("com.chen.mapper.OrderMapper.pageQuery", rowBounds);
        System.out.println(orders.size());
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        sqlSession2.delete("com.chen.mapper.OrderMapper.deleteOne");
        sqlSession2.commit();
        List<Order> orders1 = sqlSession.selectList("com.chen.mapper.OrderMapper.pageQuery", rowBounds);
        System.out.println(orders1.size());
        sqlSession.close();
        sqlSession2.close();
    }

    @Test
    public void testJson() {
        String str = "abcd";
        String s = JSON.toJSONString(str);
        System.out.println(s);
    }
}
