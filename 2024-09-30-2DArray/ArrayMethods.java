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
}
