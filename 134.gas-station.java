package Leetcode_subs;
/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;

       int total = 0;
       int ans = 0;

       for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];

            if (total < 0){
                total = 0;
                ans = i+1;
            }
       }

       return ans;
    }
}
// @lc code=end

