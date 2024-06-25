/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();

        for(int num: nums){
            numset.add(num);
        }
        int longeststreak = 0;
        for(int num: nums){
            if(!numset.contains(num-1)){
                int currentnum = num;
                int currentstreak = 1;

                while(numset.contains(currentnum + 1)){
                    currentnum += 1;
                    currentstreak +=1;
                }

                longeststreak = Math.max(longeststreak, currentstreak);
            }
        }
        return longeststreak;
    }
}
// @lc code=end

