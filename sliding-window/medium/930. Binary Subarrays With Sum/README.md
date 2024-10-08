# 930. Binary Subarrays With Sum

**Link**: [https://leetcode.com/problems/binary-subarrays-with-sum/description/](https://leetcode.com/problems/binary-subarrays-with-sum/description/)

## Problem Statement

Given a binary array `nums` and an integer `goal`, return the number of non-empty subarrays whose sum equals `goal`.
A subarray is a contiguous part of the array.

### Examples

#### Example 1:
- **Input**: 
```
nums = [1,0,1,0,1], goal = 2
```
- **Output**: 
```
4
```
- **Explanation**: 
The 4 subarrays are bolded and underlined below:
```
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
```

#### Example 2:
- **Input**: 
```
nums = [0,0,0,0,0], goal = 0
```
- **Output**: 
```
15
```
## Constraints:
- `1 <= nums.length <= 3 * 10^4`
- `nums[i]` is either `0` or `1`.
- `0 <= goal <= nums.length`
