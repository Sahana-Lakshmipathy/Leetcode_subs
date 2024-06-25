package Leetcode_subs;
/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create a new hashmap of String - List of String
       HashMap<String, List<String>> map = new HashMap<>();
       
       for(String word : strs){
        // String - Array - Sort - String
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sortedword = new String(chars);

        // if not present add sorted word as key in hashmap
        if (!map.containsKey(sortedword)) map.put(sortedword, new ArrayList<>());

        // you must add the original word itself since we are looking at words with similar letters
        map.get(sortedword).add(word);
       }
       // bring a new list of value mappings
       return new ArrayList<>(map.values());
       
    }
}


// @lc code=end

