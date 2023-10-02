#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
   def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, value in enumerate(nums):
           remaining = target - value
           if remaining in seen:
               return [i, seen[remaining]]
           else:
               seen[value] = i
        return [-1, -1]
        
# @lc code=end



