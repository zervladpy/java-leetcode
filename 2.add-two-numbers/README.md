# 2. Add Two Numbers (medium)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/add-two-numbers/)

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse
order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

##### Example 1:

[2]--> [4]--> [3]<br>
[5]--> [6]--> [4]<br>
____________ <br>
[7]--> [0]--> [8]<br>

> **Input:** l1 = [2,4,3], l2 = [5,6,4] <br>
> **Output:** [7,0,8] <br>
> **Explanation:** 342 + 465 = 807. <br>

##### Example 2:

> **Input:** l1 = [0], l2 = [0] <br>
> **Output:** [0] <br>

##### Example 3:

> **Input:** l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] <br>
> **Output:** [8,9,9,9,0,0,0,1] <br>

##### Constraints:

* The number of nodes in each linked list is in the range `[1, 100]`.
* `0 <= Node.val <= 9`
* It is guaranteed that the list represents a number that does not have leading zeros.