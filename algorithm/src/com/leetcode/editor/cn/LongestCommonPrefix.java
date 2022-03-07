//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 👍 2041 👎 0


package com.leetcode.editor.cn;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String pre = strs[0];
            for (int i = 0; i < strs.length ; i++) {
                pre = helper(strs[i], pre);
            }
            return  pre;
        }

        public String helper(String s1, String s2) {
            if (s1 == null || s2 == null) {
                return "";
            }
            int len = Math.min(s1.length(), s2.length());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    sb.append(s1.charAt(i));
                } else {
                    break;
                }
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}