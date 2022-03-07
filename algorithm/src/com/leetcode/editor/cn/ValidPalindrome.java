//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 473 👎 0


package com.leetcode.editor.cn;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        solution.isPalindrome("race a car");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //,.*
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
            }
            String temp = sb.toString();

            return temp.equals(sb.reverse().toString());
         /*   s = s.toLowerCase();
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);
                while (!Character.isLetterOrDigit(leftChar) && left < s.length() - 1) {
                    leftChar = s.charAt(++left);
                }
                while (!Character.isLetterOrDigit(rightChar) && right > 0) {
                    rightChar = s.charAt(--right);
                }
                //特殊情况，全是符号返回true
                if (left == s.length() - 1 && right == 0) {
                    return true;
                } else if (leftChar != rightChar) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;*/
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}