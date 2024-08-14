# 71. Simplify Path (medium)

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

[link to problem](https://leetcode.com/problems/simplify-path/)

Given an absolute path for a Unix-style file system, which begins with a slash `'/'`, transform this path into its
**simplified canonical path**.

In Unix-style file system context, a single period `'.'` signifies the current directory, a double period ".." denotes
moving up one directory level, and multiple slashes such as `"//"` are interpreted as a single slash. In this problem,
treat sequences of periods not covered by the previous rules (like `"..."`) as valid names for files or directories.

The simplified canonical path should adhere to the following rules:

* It must start with a single slash `'/'`.
* Directories within the path should be separated by only one slash `'/'`.
* It should not end with a slash `'/'`, unless it's the root directory.
* It should exclude any single or double periods used to denote current or parent directories.

Return the new path.

##### Example 1:

> **Input:** path = "/home/" <br>
> **Output:** "/home" <br>
> **Explanation:** <br>
> The trailing slash should be removed. <br>

##### Example 2:

> **Input:** path = "/home//foo/" <br>
> **Output:** "/home/foo" <br>
> **Explanation:** <br>
> Multiple consecutive slashes are replaced by a single one. <br>

##### Example 3:

> **Input:** path = "/home/user/Documents/../Pictures" <br>
> **Output:** "/home/user/Pictures" <br>
> **Explanation:** <br>
> A double period ".." refers to the directory up a level. <br>

##### Example 4:

> **Input:** path = "/../" <br>
> **Output:** "/" <br>
> **Explanation:** <br>
> Going one level up from the root directory is not possible. <br>

##### Example 5:

> **Input:** path = "/.../a/../b/c/../d/./" <br>
> **Output:** "/.../b/d" <br>
> **Explanation:** <br>
> "..." is a valid name for a directory in this problem. <br>

##### Constraints:

* `1 <= path.length <= 3000`
* `path` consists of English letters, digits, period `'.'`, slash `'/'` or `'_'`.
* `path` is a valid absolute Unix path.