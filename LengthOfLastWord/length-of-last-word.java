package LengthOfLastWord;

/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {

  public int lengthOfLastWord(String s) {
    int r = 0;
    boolean b = false;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ' && !b) continue; else if (
        s.charAt(i) == ' ' && b
      ) {
        break;
      } else {
        b = true;
        r++;
      }
    }
    return r;
  }
}
// @lc code=end
