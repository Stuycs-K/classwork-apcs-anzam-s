public class MyArrays{
  public static void main(String[] args) {
    //testing aryToString
    int[] ary = {11, 28, 13, 94, 45};
    System.out.println(aryToString(ary));

    //testing returnCopy
    System.out.println("Original: " + aryToString(ary) + " Copy: " + aryToString(returnCopy(ary)));
    System.out.println("Original address " + ary + " Copy address: " + returnCopy(ary));
    int[] ary2 = {};
    System.out.println("Original: " + aryToString(ary2) + " Copy: " + aryToString(returnCopy(ary2)));
    System.out.println("Original address " + ary2 + " Copy address: " + returnCopy(ary2));
    int[] ary3 = {1};
    System.out.println("Original: " + aryToString(ary3) + " Copy: " + aryToString(returnCopy(ary3)));
    System.out.println("Original address " + ary3 + " Copy address: " + returnCopy(ary3));

    //testing concatArray
    System.out.println("Array 1: " + aryToString(ary) + " Array 2: " + aryToString(ary2));
    System.out.println("Concatenated Array: " + aryToString(concatArray(ary, ary2)));
    System.out.println("Array 1: " + aryToString(ary3) + " Array 2: " + aryToString(ary));
    System.out.println("Concatenated Array: " + aryToString(concatArray(ary3, ary)));
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] res = new int[ary1.length + ary2.length];
    int counter = 0;

    if (ary1.length != 0) {
      for (int x = 0; x < ary1.length; x++) {
        res[counter] = ary1[x];
        counter ++;
      }
    }

    if (ary2.length != 0) {
      for (int x = 0; x < ary2.length; x++) {
        res[counter] = ary2[x];
        counter ++;
      }
    }

    return res;
  }

  public static int[] returnCopy(int[]ary) {
    if (ary.length == 0) {
      return new int[0];
    }

    int[] res = new int[ary.length];

    for (int x = 0; x < ary.length; x++) {
      res[x] = ary[x];
    }

    return res;
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

    res += "]";
    return res;
  }
}
