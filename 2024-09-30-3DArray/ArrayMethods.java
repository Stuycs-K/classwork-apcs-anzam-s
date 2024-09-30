public class ArrayMethods{
  public static void main(String[] args) {
    int[] test_arr = new int[]{1, 2, 3, 4};
    System.out.println(arrToString(test_arr));

    int[][] test_2Darr = new int[][]{{0, 1, 2, 3}, {4, 5}, {6}};
    System.out.println(arrToString2D(test_2Darr));

    System.out.println(arr2DSum(test_2Darr) == 21);

    int[][] rec_2Darr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(swapRC(rec_2Darr) + "should equal to: " + "{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}");

  }

  //1. Anzam S: anzams@nycstudents.net
  // Sean: seanyutot@nycstudents.net

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums) {
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString2D(int[][]ary){
    if (ary.length == 0) {
      return "[]";
    }

    String res = "[";

    for (int x = 0; x < ary.length; x++) {
      res += arrToString(ary[x]);

      if (x != (ary.length - 1)) {
        res += ", ";
      }
    }

    res += "]";

    //this should use arrToString(int[])
    return res;
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    return 0;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
}
