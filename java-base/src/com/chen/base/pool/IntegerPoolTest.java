package com.chen.base.pool;

/**
 * @author chenkun
 * @date 2021/10/9 上午10:09
 */
public class IntegerPoolTest {
    //    -XX:AutoBoxCacheMax=300
    public static void main(String[] args) {
        String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        System.out.println(integerCacheHighPropValue);
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
    }
}
