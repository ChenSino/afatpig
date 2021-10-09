package com.chen.base;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * @author afatpig
 * @date 2021/9/23 上午10:38
 */
public class Answer {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        String s = prefixStr("abcccc", "abdef");
        System.out.println(s);
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && x > 7) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && x < -8) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && temp % 10 > 7) {
                return false;
            }
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return x == reverse;
    }

    public String longestCommonPrefix(String[] strs) {
        Objects.requireNonNull(strs);

        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = prefixStr(result, strs[i]);
        }
        return result;
    }

    public static String prefixStr(String str1, String str2) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    // 1,2,2,4
    @Test
    public void removeDuplicates() {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
    }

    @Test
    public void isValid() {
        String s = "{[]}{}[]{]{{}()}";
        Map<Character, Character> map = new HashMap() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Character character = map.get('(');

        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.peekFirst() != null && stack.peekFirst().equals(map.get(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack.isEmpty());
    }

    //3 ,2 ,2 ,3    target :2
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }


    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    //9,9,9
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;

            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
