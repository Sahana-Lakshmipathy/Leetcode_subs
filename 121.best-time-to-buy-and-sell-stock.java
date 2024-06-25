package Leetcode_subs;
/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start

class Solution {
    public int maxProfit(int[] prices) {
        int left  = 0;
        int right = 1;
        int max_profit = 0;

        while( right < prices.length){
            if(prices[left] < prices[right]){
                max_profit = Math.max(max_profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return max_profit;
    }
}





// @lc code=end

