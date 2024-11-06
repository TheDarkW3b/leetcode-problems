# 46. Permutations

**Link**: [https://leetcode.com/problems/permutations/](https://leetcode.com/problems/permutations/)

## Problem Statement

Given an array `nums` of distinct integers, return all possible permutations. The answer can be returned in any order.

## Examples

### Example 1

**Input**:
```
nums = [1,2,3]
```
**Output**:
```
[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

### Example 2

**Input**:
```
nums = [0,1]
```
**Output**:
```
[[0,1],[1,0]]
```

### Example 3

**Input**:
```
nums = [1]
```
**Output**:
```
[[1]]
```

## Constraints

- `1 <= nums.length <= 6`
- `-10 <= nums[i] <= 10`
- All integers in `nums` are unique.