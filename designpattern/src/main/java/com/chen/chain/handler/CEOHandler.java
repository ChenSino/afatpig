package com.chen.chain.handler;

import com.chen.chain.Request;

import java.util.Random;

/**
 * @author 204506
 * @Description
 * @create 2022-06-21 14:15
 */
public class CEOHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        return new Random().nextBoolean();
    }
}
