# Palindrome Number (easy)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/palindrome-number/)

Given an integer `x`, return `true` if `x` is a palindrome*, and `false` otherwise.

*An integer is a **palindrome** when it reads the same forward and backward.
For example, `121` is a palindrome while `123` is
not.

##### Example 1:

> **Input:** x = 121 <br>
> **Output:** true <br>
> **Explanation:** 121 reads as 121 from left to right and from right to left. <br>

##### Example 2:

> **Input:** x = -121 <br>
> **Output:** false <br>
> **Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a
> palindrome. <br>

##### Example 3:

> **Input:** x = 10 <br>
> **Output:** false <br>
> **Explanation:** Reads 01 from right to left. Therefore it is not a palindrome. <br>

##### Constraints:

* `-231 <= x <= 231 - 1`

**Follow up:** Could you solve it without converting the integer to a string?