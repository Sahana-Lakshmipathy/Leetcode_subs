package Leetcode_subs;
/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

import java.util.Stack;

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') ) return false;

            else {
                if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}



// @lc code=end

