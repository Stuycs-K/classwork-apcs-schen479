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
  return 0;
}


public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
}
