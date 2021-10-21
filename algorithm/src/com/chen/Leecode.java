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

    //斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
    //
    //F(0) = 0，F(1)= 1
    //F(n) = F(n - 1) + F(n - 2)，其中 n > 1
    //给你 n ，请计算 F(n) 。
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1, c = a + b;
        for (int i = 0; i < n; i++) {
            a = b; //1 ,1
            b = c; //1,2
            c = a + b; //2,3
        }
        return c;
    }

    public int calculateVolume(int[][] arr) {
        int length = arr.length;
        //先找出边界上最小的那一块
        int min = arr[0][1];
        for (int i = 1; i < length - 1; i++) {
            min = arr[0][i] < min ? arr[0][i] : min;
            min = arr[length - 1][i] < min ? arr[length - 1][i] : min;
            min = arr[i][0] < min ? arr[i][0] : min;
            min = arr[i][length - 1] < min ? arr[i][length - 1] : min;
        }
        //结果
        int result = 0;
        for (int i = 1; i < length - 1; i++) {
            for (int j = 1; j < length - 1; j++) {
                if (arr[i][j] < min) {
                    result += min - arr[i][j];
                }
            }
        }
        return result;
    }
}
