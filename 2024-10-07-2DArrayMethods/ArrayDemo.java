import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    int[] test_arr = new int[]{1, 2, 3, 4};
    System.out.println(arrToString(test_arr));
    System.out.println(Arrays.toString(test_arr));

    int[][] test_2Darr = new int[][]{{0, 1, 2, 3}, {4, 5}, {6}, {}};
    System.out.println(htmlTable(test_2Darr));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    if (ary.length == 0) {
      return "[]";
    }

    String res = "[";

    for (int x = 0; x < ary.length; x++) {
      res += ary[x];
      if (x != (ary.length - 1)) {
        res += ", ";
      }
    }

    res += "]";
    return res;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int summ = 0;

    for (int x = 0; x < nums.length; x++) {
      for (int y = 0; y < nums[x].length; y++) {
        summ += nums[x][y];
      }
    }

    return summ;
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

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] res = new int[nums[0].length][nums.length];

    for (int x = 0; x < nums[0].length; x++) {
      for (int y = 0; y < nums.length; y++) {
        res[x][y] = nums[y][x];
      }
    }

    return res;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String res = "<table>";

    for (int x = 0; x < nums.length; x++) {
      res += "<tr>";

      for (int i = 0; i < nums[x].length; i++) { 
        res += "<td>";
        res += nums[x][i];
        res += "</td>";
      }

      res += "</tr>";
    }

    return res += "</table>";
  }
}
