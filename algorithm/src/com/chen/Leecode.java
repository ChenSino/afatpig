package com.chen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author afatpig
 * @date 2021/10/8 上午9:36
 */
public class Leecode {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
    }

    /**
     * 按顺序交换奇数和偶数的位置，第一个奇数和第一个偶数交换，第二个奇数和第二个偶数……
     * example: [1,2,3,4]->[2,1,4,3];
     * [100,25]->[25,100];
     * [11,55,100,200,300,7]->[100,200,11,55,7,300]
     *
     * @param nums
     * @return
     */
    public int[] evenOddSwap(int[] nums) {

        List<Integer> oddIndex = new ArrayList<>();
        List<Integer> evenIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                oddIndex.add(i);
            } else {
                evenIndex.add(i);
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[oddIndex.get(i)];
            nums[oddIndex.get(i)] = nums[evenIndex.get(i)];
            nums[evenIndex.get(i)] = temp;
        }
        return nums;
    }
}
