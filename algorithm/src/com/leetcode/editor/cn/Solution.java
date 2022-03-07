package com.leetcode.editor.cn;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/19 下午1:58
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        //1. 个位不为9,直接把个位+1返回
        if (digits[n - 1] != 9) {
            digits[n - 1]++;
            return digits;
        }

        //2. 只有后面若干位9,非全部,[1,2,9,9]
        for (int i = n - 1; i >= 0; i++) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = 1;
                return digits;
            }
        }
        // 3. digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
