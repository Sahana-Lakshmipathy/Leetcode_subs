package Leetcode_subs;
/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>> result = new ArrayList<>();
          Arrays.sort(nums);
          for (int i = 0; i < nums.length - 2; i++) {
              // Skip duplicate elements
              if (i > 0 && nums[i] == nums[i - 1]) continue;
              // Initialize two pointers
              int left = i + 1;
              int right = nums.length - 1;
              // Use two-pointer technique to find pairs that sum up to the negative of nums[i]
              while (left < right) {
                  int sum = nums[i] + nums[left] + nums[right];
  
                  if (sum == 0) {
                      // Found a triplet
                      result.add(Arrays.asList(nums[i], nums[left], nums[right]));
  
                      // Skip duplicate elements for left pointer
                      while (left < right && nums[left] == nums[left + 1]) {
                          left++;
                      }
                      // Skip duplicate elements for right pointer
                      while (left < right && nums[right] == nums[right - 1]) {
                          right--;
                      }
  
                      // Move pointers to the next unique elements
                      left++;
                      right--;
                  } else if (sum < 0) {
                      // If the sum is less than zero, move the left pointer to the right
                      left++;
                  } else {
                      // If the sum is greater than zero, move the right pointer to the left
                      right--;
                  }
              }
          }
          return result;



      }
  }


// @lc code=end
