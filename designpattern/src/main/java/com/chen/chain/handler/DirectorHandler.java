package com.chen.chain.handler;

import com.chen.chain.Request;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author 204506
 * @Description
 * @create 2022-06-21 14:14
 */
public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过10000元，处理不了，交下一个处理:
        if (request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
            return null;
        }
        //随机审批
        return  new Random().nextBoolean();
    }
}
