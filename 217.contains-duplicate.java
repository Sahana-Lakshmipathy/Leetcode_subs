package Leetcode_subs;
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums){
            if (set.contains(num)){
                return true;  
            }

            set.add(num);
        }
        return false;
    }
}
// @lc code=end

