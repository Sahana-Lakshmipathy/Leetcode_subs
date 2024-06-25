package Leetcode_subs;
/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

import java.util.HashMap;

// @lc code=start

class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
      int maxLength = 0;
      int start = 0;
      
      for(int end = 0; end < s.length(); end++){
        char currentChar = s.charAt(end);
        if (map.containsKey(currentChar) && map.get(currentChar) >= start){
            start = map.get(currentChar) + 1;
        }
        map.put(currentChar, end);
        maxLength = Math.max(maxLength, end - start + 1);
      }
      return maxLength;
    }
}


// @lc code=end

