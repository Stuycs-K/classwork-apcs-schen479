import java.util.Arrays;

public class ArrayDemo{
  public static void main(String[] args){
    int[] test1 = new int[]{1, 2, 4};
    int[] test2 = new int[]{};
    int[] test3 = new int[]{2};
    int[][] test5 = {{4, 5, -6}, {7, -8, -9}};
    int[][] test6 = {{-4, 5, -2}, {7, -5, -1}, {8, 9, -10}};
    int[][] test7 = {{-4, 5}, {7}, {8, 9, -10}}; 
    int[][] test8 = {{1, 3, 4}, {2, 5, 6}};
    int[][] test9 = {{1, 3, 4}, {2, 5, 6}, {9, 10, 11}};
    int[][] test10 = {{1, 3}, {2}, {5, 6, 7}};

    System.out.println("arrToString");
    String test1_result = Arrays.toString(test1);
    String test2_result = Arrays.toString(test2);
    String test3_result = Arrays.toString(test3);
    System.out.println("Array method: " + test1_result + " My method: " + arrToString(new int[]{1, 2, 4}));
    System.out.println("Array method: " + test2_result + " My method: " + arrToString(new int[]{}));
    System.out.println("Array method: " + test3_result + " My method: " + arrToString(new int[]{2}));

    System.out.println("countZero2D");
    System.out.println("Expected 0, Got: " + countZeros2D(new int[][]{{1, 2, 3}}));
    System.out.println("Expected 0, Got: " + countZeros2D(new int[][]{}));
    System.out.println("Expected 0, Got: " + countZeros2D(new int[][]{{}, {}}));
    System.out.println("Expected 2, Got: " + countZeros2D(new int[][]{{1, 0, 10}, {0, 1, 2}, {8, 7, 9}}));
    System.out.println("Expected 3, Got: " + countZeros2D(new int[][]{{0, 1, 2}, {3, 0}, {3, 4, 5, 0}}));
    System.out.println("Expected 4, Got: " + countZeros2D(new int[][]{{0, 1, 2, 0}, {}, {3, 0, 5, 0}}));

    System.out.println("arr2DSum");
    System.out.println("Expected: 25 Got: " + arr2DSum(new int[][]{{1,2},{4,5},{6,7}}));
    System.out.println("Expected: 0 Got: " + arr2DSum(new int[][]{}));
    System.out.println("Expected: 0 Got: " + arr2DSum(new int[][]{{}}));
    System.out.println("Expected: 21 Got: " + arr2DSum(new int[][]{{1,2},{},{5,6,7}}));
    System.out.println("Expected: 24 Got: " + arr2DSum(new int[][]{{1,2},{3},{5,6,7}}));
    System.out.println("Expected: 45 Got: " + arr2DSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));   

    System.out.println("replaceNegative");
    System.out.println("Test 5 Before: " + arrToString(test5));
    replaceNegative(test5);
    System.out.println("Test 5 After: " + arrToString(test5));
    System.out.println("Test 6 Before: " + arrToString(test6));
    replaceNegative(test6);
    System.out.println("Test 6 After: " + arrToString(test6));
    System.out.println("Test 7 Before: " + arrToString(test7));
    replaceNegative(test7);
    System.out.println("Test 7 After: " + arrToString(test7));

    System.out.println("copy");
    int[][] test5_result = copy(test5);
    System.out.println("Addresses are different: " + (test5_result != test5));
    System.out.println("Original Values: " + arrToString(test5) + " Copied Values: " + (arrToString(test5_result)));
    
    int[][] test6_result = copy(test6);
    System.out.println("Addresses are different: " + (test6_result != test6));
    System.out.println("Original Values: " + arrToString(test6) + " Copied Values: " + arrToString(test6_result));

    int[][] test7_result = copy(test7);
    System.out.println("Addresses are different: " + (test7_result != test7));
    System.out.println("Original Values: " + arrToString(test7) + " Copied Values: " + arrToString(test7_result));

    int[][] test8_result = copy(test8);
    System.out.println("Addresses are different: " + (test8_result != test8));
    System.out.println("Original Values: " + arrToString(test8) + " Copied Values: " + arrToString(test8_result));
      
    int[][] test9_result = copy(test9);
    System.out.println("Addresses are different: " + (test9_result != test9));
    System.out.println("Original Values: " + arrToString(test9) + " Copied Values: " + arrToString(test9_result));

    int[][] test10_result = copy(test10);
    System.out.println("Addresses are different: " + (test10_result != test10));
    System.out.println("Original Values: " + arrToString(test10) + " Copied Values: " + arrToString(test10_result));

    System.out.println("swapRC");
    System.out.println("Expected: [[1, 4, 6], [2, 5, 7]] Got: " + arrToString(swapRC(new int[][]{{1,2},{4,5},{6,7}})));
    System.out.println("Expected: [[1, 4], [2, 5], [6, 7]] Got: " + arrToString(swapRC(new int[][]{{1,2,6},{4,5,7}})));
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]] Got: " + arrToString(swapRC(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
    System.out.println("Expected: [[1, 5, 9], [2, 6, 10], [3, 7, 11], [4, 8, 12]] Got: " + arrToString(swapRC(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})));
    System.out.println("Expected: [[1, 2, 3]] Got: " + arrToString(swapRC(new int[][]{{1},{2},{3}})));
    System.out.println("Expected: [[1], [2], [3]] Got: " + arrToString(swapRC(new int[][]{{1, 2, 3}})));

    System.out.println("swapRC");
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table> Got: " + htmlTable(new int[][]{{1,2},{3}}));
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td><td>4</td></tr><tr><td>1</td><td>5</td></tr></table> Got: " + htmlTable(new int[][]{{1,2}, {3, 4}, {1, 5}}));
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td><td>4</td></tr></table> Got: " + htmlTable(new int[][]{{1,2},{3, 4}}));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++){
      if(i == ary.length-1){
        result += ary[i];
      }
      else{
      result += ary[i] + ", ";
      }
    }
    return result + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++){
        if (i == ary.length-1){
          result += arrToString(ary[i]);
        }
        else{
          result += arrToString(ary[i]) + ", ";
        }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        count += nums[i][j];
      }
    }
    return count;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int j = 0; j < vals[i].length; j++){
        if (vals[i][j] < 0){
          if(i == j){
            vals[i][j] = -1;
          }
          else{
            vals[i][j] = 0;
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
  public static int[][] copy(int[][] nums){
    int[][] newNums = new int[nums.length][];

    for(int i = 0; i < newNums.length; i++){
      newNums[i] = returnCopy(nums[i]);
    }
    return newNums;
  }

  public static int[] returnCopy(int[] ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] newNums = new int[nums[0].length][nums.length];

    for(int i = 0; i < nums[0].length; i++){
      for(int j = 0; j < nums.length; j++){
        newNums[i][j] = nums[j][i];
      }
    }
    return newNums;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++){
      result += "<tr>";
      for (int j = 0; j < nums[i].length; j++){
        result += "<td>" + nums[i][j] + "</td>";
      }
      result += "</tr>";
    }
    return result += "</table>";
  }
}
