package com.chen.entity;

/**
 * @author chenkun
 * @Description
 * @date 2022/4/28 下午2:25
 */
public class Picture {

    private Integer id;
    private String desc;
    private Integer size;

    private String orderNo;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", size=" + size +
                ", orderNo=" + orderNo +
                '}';
    }
}
