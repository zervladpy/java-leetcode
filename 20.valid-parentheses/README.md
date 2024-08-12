# 20. Valid Parentheses (easy)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/valid-parentheses/description/)

Given a string s containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input
string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

##### Example 1:

> Input: s = "()"
> Output: true

##### Example 2:

> Input: s = "()[]{}"
> Output: true

##### Example 3:

> Input: s = "(]"
> Output: false

##### Constraints:

* `1 <= s.length <= 104`
* `s` consists of parentheses only `'()[]{}'`.