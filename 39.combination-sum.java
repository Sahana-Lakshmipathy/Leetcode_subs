/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<List<Integer>> combinationSum(int [] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(ans,cur, candidates, target, 0);
        return ans;
    }
    
    public void dfs(
        List<List<Integer>> ans,
        List<Integer> cur,
        int [] candidates,
        int target,
        int i
    ){
        if(target == 0){
            ans.add(new ArrayList<>(cur));
            return;
        } else if (target < 0 || i >= candidates.length){
            return;
        } else {
            cur.add(candidates[i]);
            dfs(ans,cur,candidates, target - candidates[i], i);
            cur.remove(cur.size()-1);
            dfs(ans, cur, candidates, target, i+1);
        }
    }
}

// @lc code=end

