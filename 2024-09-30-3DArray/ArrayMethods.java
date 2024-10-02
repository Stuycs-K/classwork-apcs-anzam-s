public class ArrayMethods{
  public static void main(String[] args) {
    //test cases for arrToString
    int[] test_arr = new int[]{1, 2, 3, 4};
    System.out.println(arrToString(test_arr));
    int[][] test_2Darr = new int[][]{{0, 1, 2, 3}, {4, 5}, {6}};
    System.out.println(arrToString(test_2Darr));
    int[][] test_2Darr2 = new int[][]{};
    System.out.println(arrToString(test_2Darr2));
    int[][] test_2Darr3 = new int[][]{{0, 1, 2}, {4, 5, 6}, {}};
    System.out.println(arrToString(test_2Darr3));

    // test cases for test_2Darr
    System.out.println(arr2DSum(test_2Darr) == 21);
    System.out.println(arr2DSum(test_2Darr2) == 0);
    System.out.println(arr2DSum(test_2Darr3) == 18);

    // test cases for swapRC
    int[][] rec_2Darr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(arrToString(swapRC(rec_2Darr)) + " should equal to: " + "{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}");

    //test cases for replaceNegative
    int[][] negativeArray = new int[][]{{1, -2, 3}, {4, -5, -6}, {-7, 8, 9}};
    replaceNegative(negativeArray);
    System.out.println(arrToString(negativeArray));
    int[][] negativeArray2 = new int[][]{{}, {4, -5, -6}, {-7, 8, 9}};
    replaceNegative(negativeArray2);
    System.out.println(arrToString(negativeArray2));

    //test cases for copy
    System.out.println(arrToString(copy(negativeArray)));
    System.out.println(arrToString(copy(negativeArray2)));
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){ 
    for (int x = 0; x < vals.length; x++) {
      for (int y = 0; y < vals[x].length; y++) {
        if (vals[x][y] < 0) {
          if (y == x) {
            vals[x][y] = 1;
          }
          else {
            vals[x][y] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copyArray(int[] nums) {
    int[] res = new int[nums.length];

    for (int x = 0; x < nums.length; x++) {
      res[x] = nums[x];
    }

    return res;
  }

  public static int[][] copy(int[][] nums){
    int[][] res = new int[nums.length][];

    for (int x = 0; x < nums.length; x++) {
      res[x] = copyArray(nums[x]);
    }

    return res;
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
  public static String arrToString(int[][]ary){
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
    int summ = 0;

    for (int x = 0; x < nums.length; x++) {
      for (int y = 0; y < nums[x].length; y++) {
        summ += nums[x][y];
      }
    }

    return summ;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] res = new int[nums[0].length][nums.length];

    for (int x = 0; x < nums[0].length; x++) {
      for (int y = 0; y < nums.length; y++) {
        res[x][y] = nums[y][x];
      }
    }

    return res;
  }

}
