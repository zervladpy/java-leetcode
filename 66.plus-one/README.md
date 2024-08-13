# 66. Plus One (easy)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/plus-one/description/)

You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is the `i^th` digit
of
the
integer. The digits are ordered from most significant to the least significant in left-to-right order. The large integer
does not contain any leading `0`'s.

Increment the large integer by one and return _the resulting array of digits_.

##### Example 1:

> **Input:** digits = [1,2,3] <br>
> **Output:** [1,2,4] <br>
> **Explanation:** The array represents the integer 123. <br>
> Incrementing by one gives 123 + 1 = 124. <br>
> Thus, the result should be [1,2,4]. <br>

##### Example 2:

> **Input:** digits = [4,3,2,1] <br>
> **Output:** [4,3,2,2] <br>
> **Explanation:** The array represents the integer 4321. <br>
> Incrementing by one gives 4321 + 1 = 4322. <br>
> Thus, the result should be [4,3,2,2]. <br>

##### Example 3:

> **Input:** digits = [9] <br>
> **Output:** [1,0] <br>
> **Explanation:** The array represents the integer 9. <br>
> Incrementing by one gives 9 + 1 = 10. <br>
> Thus, the result should be [1,0]. <br>

##### Constraints:

* `1 <= digits.length <= 100`
* `0 <= digits[i] <= 9`
* `digits` does not contain any leading `0`'s.