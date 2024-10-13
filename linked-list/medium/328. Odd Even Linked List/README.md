# 328. Odd Even Linked List

**Link**: [https://leetcode.com/problems/odd-even-linked-list/description/](https://leetcode.com/problems/odd-even-linked-list/description/)

## Problem Statement

Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

### Example 1:
![oddeven-linked-list](https://github.com/user-attachments/assets/d140a3cc-a323-470f-8770-b7da7bd6cdcb)

**Input**: 
```
head = [1,2,3,4,5]
```
**Output**: 
```
[1,3,5,2,4]
```

### Example 2:
![oddeven2-linked-list](https://github.com/user-attachments/assets/66859e33-6fc6-434e-a016-c6d281af3d75)

**Input**: 
```
head = [2,1,3,5,6,4,7]
```
**Output**: 
```
[2,3,6,7,1,5,4]
```

### Constraints:

- The number of nodes in the linked list is in the range `[0, 10^4]`.
- `-10^6 <= Node.val <= 10^6`