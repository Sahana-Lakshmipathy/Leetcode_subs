package Leetcode_subs;
/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right -left)/2;

            if (nums[mid] == target){
                return mid;
            }
            // check if left is sorted
            if (nums[left] <= nums[mid]){
                // check which half it is present
                if ((nums[left] <= target) && (target <= nums[mid])){
                    // first half
                    right = mid - 1;
                }
                else {
                    // second half
                    left = mid + 1;
                }
            }
            //right is sorted
            else{
                if ((nums[mid] <=target) && (target <= nums[right])){
                    //second half
                    left = mid +1;
                }
                else{
                    // first half
                    right = mid -1;
                }
            }
        }

        return -1;
    }
}



// @lc code=end

