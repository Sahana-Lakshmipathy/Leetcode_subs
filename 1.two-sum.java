package Leetcode_subs;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // Build the hash table
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , i);
        }

        // Find the complement
        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i){
                // return the pair of indices
                return new int[]{i, map.get(complement)};
            }
        }

        // No solution found
        return new int[]{};
        
    }
}


// @lc code=end

