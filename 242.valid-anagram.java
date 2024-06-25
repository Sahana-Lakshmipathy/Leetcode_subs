package Leetcode_subs;
/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */



// @lc code=start



import java.util.Arrays;
class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort the char arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}


// @lc code=end

