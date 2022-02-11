public class Solution {

  public static void printNumberWithLeadingZero(int number) {
    int max = String.valueOf(number).length();

    for (int i = 1; i <= number; i++) {
      System.out.println(String.format("%0" + (max) + "d", i));
    }
  }
}
