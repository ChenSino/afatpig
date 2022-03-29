package com.chen.base.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author chenkun
 * @Description 自定义LRU算法
 * @date 2022/3/22 下午10:36
 */
public class MyLRU<K, V> extends LinkedHashMap<K, V> {

    private int cacheCount;

    public MyLRU(int initialCapacity) {
        //必须指定accessOrder为true,true代表会重新排序，刚被访问的元素会被放到头部，false则按照插入顺序排序
        super(initialCapacity, .75f, true);
        this.cacheCount = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        //当集合中实际数量超过最大缓存，就移除最老的元素
        return size() > cacheCount;
    }
}
