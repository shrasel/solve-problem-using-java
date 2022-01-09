class Solution {

  public int[] findEvenNumbers(int[] digits) {
    int[] nums = new int[10];
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < digits.length; i++) {
      nums[digits[i]]++;
    }
    for (int i = 100; i < 1000; i += 2) {
      int[] w = new int[10];
      int n = i;
      while (n != 0) {
        w[n % 10]++;
        n /= 10;
      }
      if (exist(nums, w)) {
        res.add(i);
      }
    }
    return res.stream().mapToInt(Number::intValue).toArray();
  }

  public boolean exist(int[] nums, int[] w) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < w[i]) return false;
    }
    return true;
  }
}
