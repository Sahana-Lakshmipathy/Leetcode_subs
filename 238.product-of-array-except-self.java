package Leetcode_subs;
/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result,1);
        // Prefix Prod
        int leftProd = 1;
        for(int i = 0; i < n; i++){
           result[i] *= leftProd;
           leftProd *= nums[i]; 
        }
        // Suffix Prod
        int rightProd = 1;
        for(int i= n-1; i >= 0; i--){
            result[i] *= rightProd;
            rightProd *= nums[i];
        }

        return result;
    }
}
// @lc code=end

