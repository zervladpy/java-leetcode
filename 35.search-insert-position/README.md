# 35. Search Insert Position (easy)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/search-insert-position/)

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

##### Example 1:

> **Input:** nums = [1,3,5,6], target = 5
> **Output:** 2

##### Example 2:

> **Input:** nums = [1,3,5,6], target = 2
> **Output:** 1

##### Example 3:

> **Input:** nums = [1,3,5,6], target = 7
> **Output:** 4

##### Constraints:

* `1 <= nums.length <= 104`
* `-104 <= nums[i] <= 104`
* `nums` contains **distinct** values sorted in **ascending** order.
* `-104 <= target <= 104`