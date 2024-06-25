package Leetcode_subs;
/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;

        while ( start <= last){
            char currfirst = s.charAt(start);
            char currlast = s.charAt(last);

             // If the start character is not alphanumeric, move the start pointer forward
            if(!Character.isLetterOrDigit(currfirst)) start++;
            // If the last character is not alphanumeric, move the last pointer backward
            else if(!Character.isLetterOrDigit(currlast)) last--;
            // If both characters are alphanumeric, compare them
            else{
                // Convert characters to lowercase and compare
                if (Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
        
    }
}
// @lc code=end

