# Two Sum

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/two-sum/description/)

Given an array of integers `nums` and an integer `target`,
return indices of the two numbers such that they add up to _`target`_.

You may assume that each input would have exactly one
solution, and you may not use the same element twice.

You can return the answer in any order.

##### Example 1:

> **Input:** nums = [2,7,11,15], target = 9 <br>
> **Output:** [0,1]<br>
> **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].<br>

##### Example 2:

> **Input:** nums = [3,2,4], target = 6 <br>
> **Output:** [1,2] <br>

##### Example 3:

> **Input:** nums = [3,3], target = 6 <br>
> **Output:** [0,1] <br>

##### Constraints

* `2 <= nums.length <= 104`
* `-109 <= nums[i] <= 109`
* `-109 <= target <= 109`
* **Only one valid answer exists.**

**Follow-up:** Can you come up with an algorithm that is less than O(n2) time complexity?