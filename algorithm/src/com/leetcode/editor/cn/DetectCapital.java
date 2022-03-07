//我们定义，在以下情况时，单词的大写用法是正确的：
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
// Related Topics 字符串 👍 198 👎 0


package com.leetcode.editor.cn;

public class DetectCapital {
    public static void main(String[] args) {
        Solution solution = new DetectCapital().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            //排除首字母小写，第二个大写的情况，比如：jUst
            if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
                return false;
            }
            //无论首字母大写或小写，第二个之后的大小写都应该和第二个保持一致
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(1)) ^ Character.isLowerCase(word.charAt(i))) {
                    return  false;
                }
            }
            return true;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}