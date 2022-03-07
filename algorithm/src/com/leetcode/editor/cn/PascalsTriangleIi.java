//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 👍 367 👎 0


package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
        solution.getRow(3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            /**
             * 获取杨辉三角的指定行，C(n,i) ：第n行i个数
             * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
             * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
             */
            List<Integer> result = new ArrayList<>();
            long current = 1;
            for (int i = 0; i <= rowIndex; i++) {
                result.add((int) current);
                current = current * (rowIndex - i) / (i + 1);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}