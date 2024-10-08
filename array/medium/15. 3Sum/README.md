# 15. 3Sum

**Link**: [https://leetcode.com/problems/3sum/description/](https://leetcode.com/problems/3sum/description/)

### Problem Statement

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `i != k`, and `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

### Examples

**Example 1:**
```plaintext
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1, 0, 1] and [-1, -1, 2].
```
**Example 2:**
```
Input: nums = [0, 1, 1]
Output: []
Explanation: There are no triplets that sum up to 0.
```

**Example 3:**
```plaintext
Input: nums = [0, 0, 0]
Output: [[0, 0, 0]]
Explanation: The only possible triplet sums up to 0.
```

### Constraints
- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`