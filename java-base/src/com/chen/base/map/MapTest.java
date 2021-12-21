package com.chen.base.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenkun
 * @Description 测试Map
 * @date 2021/12/21 上午9:57
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(4);
        map.put("abc", "1111");
        //如果map中不存在key为abc的，则把key为abc，value为xxx的item加入到map,如果已经存在了，则直接返回key为abc对应的值
        String abc = map.computeIfAbsent("abc", t -> "xxx");
        System.out.println(abc);
        System.out.println(map);
    }
}
