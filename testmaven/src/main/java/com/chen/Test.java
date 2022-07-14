package com.chen;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/5 上午10:46
 */
public class Test {
    public static void main(String[] args) {
   /*     ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        forkJoinPool.execute(new CustomRecursiveAction("abcdefghijklmnopqrst"));*/
    /*    Long a = 3L;
        Integer b  = Math.toIntExact(a);
        System.out.println(Objects.equals(3,b));*/
        String modelTypeStr = "P60 Exp、P60、P60 Pro、 P55S、 P60CV、P70S、P60VO、P50E、 P40、P40 Exp、P40 Pro 、P40S、P40 Plus、P37、P27 、 P35N、P30N、P40N、P50、P50 Exp、P50 Pro、P50 VO、P50S、P47、P50 Plus 、P55N、S55、S50 Elite、S50 Plus、S55S";
        String[] tempModelTypes = modelTypeStr.split("、");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tempModelTypes.length; i++) {
            sb.append("\"")
                    .append(tempModelTypes[i].trim()).append("\"").append(",");
        }
        System.out.println(sb.toString());
    }


}
