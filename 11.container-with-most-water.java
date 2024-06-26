package Leetcode_subs;
/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start

class Solution {
    public int maxArea(int[] height) {
        int left  = 0;
        int right = height.length -1;
        int res = 0;
        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            res = Math.max(res,area);

            //Maximizing the height of the container
            if (height[left] < height[right]){
                left++;
            } else {
                right++;
            }
        }

        return res;
    }
}


// @lc code=end

