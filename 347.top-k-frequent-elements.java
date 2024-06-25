package Leetcode_subs;
/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// @lc code=start

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initialize an array to hold the result of the top k frequent elements
        int[] arr = new int[k];
        // Create a HashMap to count the frequency of each number in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Create a min-heap (PriorityQueue) to keep track of the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        // Iterate over the entries in the map
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            // Add the current entry (number and its frequency) to the priority queue
            pq.add(it);
            // If the size of the priority queue exceeds k, remove the element with the lowest frequency
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Extracted elements of top k from pq are placed into the result array from the end towards the beginning
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}








// @lc code=end

