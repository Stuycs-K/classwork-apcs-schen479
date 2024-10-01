// Sean Chen, seanc4194@nycstudents.net, Stephen Chen stephenc88@nycstsudents.net
public class ArrayMethods{

  public static void main(String[] args){
    System.out.println("arrToString");
    System.out.println("Expected: [[1, 2], [4, 5], [6, 7]] Got: " + arrToString(new int[][]{{1,2},{4,5},{6,7}}));
    System.out.println("Expected: [] Got: " + arrToString(new int[][]{}));
    System.out.println("Expected: [[]] Got: " + arrToString(new int[][]{{}}));
    System.out.println("Expected: [[1, 2], [], [5, 6, 7]] Got: " + arrToString(new int[][]{{1,2},{},{5,6,7}}));
    System.out.println("Expected: [[1, 2], [3], [5, 6, 7]] Got: " + arrToString(new int[][]{{1,2},{3},{5,6,7}}));
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] Got: " + arrToString(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));

    System.out.println("arr2DSum");
    System.out.println("Expected: 25 Got: " + arr2DSum(new int[][]{{1,2},{4,5},{6,7}}));
    System.out.println("Expected: 0 Got: " + arr2DSum(new int[][]{}));
    System.out.println("Expected: 0 Got: " + arr2DSum(new int[][]{{}}));
    System.out.println("Expected: 21 Got: " + arr2DSum(new int[][]{{1,2},{},{5,6,7}}));
    System.out.println("Expected: 24 Got: " + arr2DSum(new int[][]{{1,2},{3},{5,6,7}}));
    System.out.println("Expected: 45 Got: " + arr2DSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));

    System.out.println("swapRC");
    System.out.println("Expected: [[1, 4, 6], [2, 5, 7]] Got: " + arrToString(swapRC(new int[][]{{1,2},{4,5},{6,7}})));
    System.out.println("Expected: [[1, 4], [2, 5], [6, 7]] Got: " + arrToString(swapRC(new int[][]{{1,2,6},{4,5,7}})));
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]] Got: " + arrToString(swapRC(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
    System.out.println("Expected: [[1, 5, 9], [2, 6, 10], [3, 7, 11], [4, 8, 12]] Got: " + arrToString(swapRC(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})));
    System.out.println("Expected: [[1, 2, 3]] Got: " + arrToString(swapRC(new int[][]{{1},{2},{3}})));
    System.out.println("Expected: [[1], [2], [3]] Got: " + arrToString(swapRC(new int[][]{{1, 2, 3}})));

    System.out.println("replaceNegative");
    int[][] test1 = {};
    int[][] test2 = {{}};
    int[][] test3 = {{-1, -2, -3}};
    int[][] test4 = {{4, 5, -6}, {7, -8, -9}};
    int[][] test5 = {{-4, 5, -2}, {7, -5, -1}, {8, 9, -10}};
    int[][] test6 = {{-4, 5}, {7}, {8, 9, -10}};

    System.out.println("Test 1 Before: " + arrToString(test1));
    replaceNegative(test1);
    System.out.println("Test 1 After: " + arrToString(test1));
    System.out.println("Test 2 Before: " + arrToString(test2));
    replaceNegative(test2);
    System.out.println("Test 2 After: " + arrToString(test2));
    System.out.println("Test 3 Before: " + arrToString(test3));
    replaceNegative(test3);
    System.out.println("Test 3 After: " + arrToString(test3));
    System.out.println("Test 4 Before: " + arrToString(test4));
    replaceNegative(test4);
    System.out.println("Test 4 After: " + arrToString(test4));
    System.out.println("Test 5 Before: " + arrToString(test5));
    replaceNegative(test5);
    System.out.println("Test 5 After: " + arrToString(test5));
    System.out.println("Test 6 Before: " + arrToString(test6));
    replaceNegative(test6);
    System.out.println("Test 6 After: " + arrToString(test6));
   
  }
  

  public static String arrToString(int[] nums){
    String result = "[";
    for(int i = 0; i < nums.length; i++){
      if(i == nums.length-1){
        result += nums[i];
      }
      else{
      result += nums[i] + ", ";
      }
    }
    return result + "]";
  }

  public static String arrToString(int[][] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++){
        if (i == nums.length-1){
          result += arrToString(nums[i]);
        }
        else{
          result += arrToString(nums[i]) + ", ";
        }
    }
    return result + "]";
  }

  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        sum += nums[i][j];
      }
    }
    return sum;
  }


  public static int[][] swapRC(int[][]nums){
    int[][] newNums = new int[nums[0].length][nums.length];

    for(int i = 0; i < nums[0].length; i++){
      for(int j = 0; j < nums.length; j++){
        newNums[i][j] = nums[j][i];
      }
    }
    return newNums;
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
    return null;//placeholder so it compiles
  }
}
