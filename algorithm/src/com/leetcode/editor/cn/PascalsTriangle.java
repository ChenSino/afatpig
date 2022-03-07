//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
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
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划 👍 694 👎 0


package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) {
                        temp.add(1);
                    } else {
                        temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                    }
                }
                result.add(temp);
            }
            return result;
        }
        //数学公式排列组合，因最终递归的long型数字超过有效长度导致运算结果不准，放弃此方法
       /* public List<List<Integer>> generate(int numRows) {
            System.out.println(recursion(15));
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        temp.add(1);
                    } else {
                        temp.add((int)(recursion(i) / recursion(j) / recursion(i - j)));
                    }
                }
                result.add(temp);
            }
            return result;
        }

        public long recursion(int n) {
            if (n == 1||n == 0) {
                return 1;
            }
            return recursion(n - 1) * n;
        }*/
    }
//leetcode submit region end(Prohibit modification and deletion)

}