# 102. Binary Tree Level Order Traversal

**Link**: [https://leetcode.com/problems/binary-tree-level-order-traversal/description/](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)

## Problem Statement

Given the root of a binary tree, return the level order traversal of its nodes' values.  
(i.e., from left to right, level by level).

## Examples

### Example 1
![tree1](https://github.com/user-attachments/assets/d3eebae4-804e-49db-9768-3d30b92196da)

**Input**:
```
root = [3,9,20,null,null,15,7]
```

**Output**:
```
[[3],[9,20],[15,7]]
```

### Example 2

**Input**:
```
root = [1]
```

**Output**:
```
[[1]]
```

### Example 3

**Input**:
```
root = []
```

**Output**:
```
[]
```

## Constraints

- The number of nodes in the tree is in the range `[0, 2000]`.
- `-1000 <= Node.val <= 1000`
