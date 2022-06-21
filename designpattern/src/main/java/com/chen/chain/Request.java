package com.chen.chain;

import java.math.BigDecimal;

/**
 * @author 204506
 * @Description
 * @create 2022-06-21 14:12
 */
public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
