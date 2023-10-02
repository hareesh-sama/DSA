/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

       HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

       for (int i=0; i < nums.length; i++) {
        int remaining = target - nums[i];
        if (seen.containsKey(remaining)) {
            return new int[] {i, seen.get(remaining)};
        }
        else {
            seen.put(nums[i],i);
        }
       }
        return new int[] {-1, -1}; 
    }
}
// @lc code=end

