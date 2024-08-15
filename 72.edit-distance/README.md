# 72. Edit Distance (medium)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/edit-distance/)

Given two strings **word1** and **word2**, return the minimum number of operations required to convert **word1** to
**word2**.

You have the following three operations permitted on a word:

* Insert a character
* Delete a character
* Replace a character

##### Example 1:

> **Input:** word1 = "horse", word2 = "ros" <br>
> **Output:** 3 <br>
> **Explanation:** <br>
> horse -> rorse (replace 'h' with 'r') <br>
> rorse -> rose (remove 'r') <br>
> rose -> ros (remove 'e') <br>

##### Example 2:

> **Input:** word1 = "intention", word2 = "execution" <br>
> **Output:** 5 <br>
> **Explanation:** <br>
> intention -> inention (remove 't') <br>
> inention -> enention (replace 'i' with 'e') <br>
> enention -> exention (replace 'n' with 'x') <br>
> exention -> exection (replace 'n' with 'c') <br>
> exection -> execution (insert 'u') <br>

##### Constraints:

* `0 <= word1.length, word2.length <= 500`
* `word1` and `word2` consist of lowercase English letters.