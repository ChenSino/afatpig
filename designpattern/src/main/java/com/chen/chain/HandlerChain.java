package com.chen.chain;

import com.chen.chain.handler.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 204506
 * @Description
 * @create 2022-06-21 14:16
 */
public class HandlerChain {
    // 持有所有Handler:
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

//    Handler添加的顺序很重要，如果顺序不对，处理的结果可能就不是符合要求的
    public boolean process(Request request) {
        // 依次调用每个Handler:
        for (Handler handler : handlers) {
            Boolean r = handler.process(request);
            if (r != null) {
                // 如果返回TRUE或FALSE，处理结束:
                System.out.println(request + " " + (r ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return r;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}
