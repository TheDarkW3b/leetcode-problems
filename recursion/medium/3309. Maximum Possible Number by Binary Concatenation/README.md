# 3309. Maximum Possible Number by Binary Concatenation
Link: [https://leetcode.com/problems/maximum-possible-number-by-binary-concatenation/](https://leetcode.com/problems/maximum-possible-number-by-binary-concatenation/)

## Problem Statement
You are given an array of integers `nums` of size 3. Return the maximum possible number whose binary representation can be formed by concatenating the binary representation of all elements in `nums` in some order.

### Example 1:
- **Input**: `nums = [1, 2, 3]`
- **Output**: `30`
- **Explanation**: Concatenate the numbers in the order `[3, 1, 2]` to get the result "11110", which is the binary representation of `30`.

### Example 2:
- **Input**: `nums = [2, 8, 16]`
- **Output**: `1296`
- **Explanation**: Concatenate the numbers in the order `[2, 8, 16]` to get the result "10100010000", which is the binary representation of `1296`.

### Constraints:
- `nums.length == 3`
- `1 <= nums[i] <= 127`