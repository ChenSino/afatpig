package com.chen.entity;

import java.io.Serializable;

/**
 * @author afatpig
 * @date 2021/9/26 下午3:12
 */
public class Order implements Serializable {

    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
