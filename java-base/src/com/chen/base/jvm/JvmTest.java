package com.chen.base.jvm;

import org.junit.Test;

/**
 * @author afatpig
 * @date 2021/10/8 下午9:57
 */
public class JvmTest {
    public void test() {
        String s2 = "hel" + "lo";
    }

    @Test
    public void testLoop() {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 65536; i++) {
            sb.append("s");
            sb1.append("s");
        }
        String s1 = sb.toString().intern();
        String s2 = sb1.toString().intern();
        System.out.println(s1 == s2);
    }
}
