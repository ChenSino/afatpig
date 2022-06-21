package com.chen.chain.handler;

import com.chen.chain.Request;

/**
 * @author 204506
 * @Description
 * @create 2022-06-21 14:13
 */
public interface Handler {
    // 返回Boolean.TRUE = 成功
    // 返回Boolean.FALSE = 拒绝
    // 返回null = 交下一个处理
    Boolean process(Request request);
}
