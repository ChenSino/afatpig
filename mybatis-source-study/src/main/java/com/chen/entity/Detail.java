package com.chen.entity;

/**
 * @author chenkun
 * @Description
 * @date 2022/4/26 上午11:43
 */
public class Detail {
    private Integer id;

    private Integer goodId;
    private String orderNo;
    private String goodName;
    private Integer goodCount;


    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

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

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", orderNo='" + orderNo + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodCount=" + goodCount +
                '}';
    }
}
