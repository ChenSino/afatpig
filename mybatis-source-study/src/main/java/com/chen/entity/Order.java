package com.chen.entity;

import java.util.Date;
import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2022/4/26 上午11:42
 */
public class Order {
    private Integer id;

    private String orderNo;

    private Date orderTime;

    private Date payTime;

    private String remark;
    /**订单详情*/
    private List<Detail> orderDetailList;
    private List<Picture> pictureList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Detail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<Detail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", orderTime=" + orderTime +
                ", payTime=" + payTime +
                ", remark='" + remark + '\'' +
                ", orderDetailList=" + orderDetailList +
                ", pictureList=" + pictureList +
                '}';
    }
}
