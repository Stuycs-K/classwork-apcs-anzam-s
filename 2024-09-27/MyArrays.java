public class MyArrays{
  public static void main(String[] args) {
    //testing aryToString
    int[] ary = {1, 2, 3, 4, 5};
    System.out.println(arytoString(ary));
  }

  public static String aryToString(int[] nums) {
    if (nums.length == 0) {
      return "[]";
    }

    String res = "[";

    for (int x = 0; x < nums.length; x++) {
      res += nums[x];
      if (x != (nums.length - 1)) {
        res += ", ";
      }
    }
  }

  res += "]";
  return res;
}
