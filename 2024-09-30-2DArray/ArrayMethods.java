// Sean Chen, seanc4194@nycstudents.net, Stephen Chen stephenc88@nycstsudents.net
public class ArrayMethods{
  public static String arrToString(int[] nums){
    String result = "[";
    for(int i = 0; i < nums.length; i++)
    {
      if(i == nums.length-1)
      {
        result += nums[i];
      }
      else
      {
      result += nums[i] + ",";
      }
    }
    return result + "]";
  }
  public static void main(String[] args){
    System.out.println("arrToString");
    System.out.println(arrToString(new int[][]{{1,2},{4,5},{6,7}}));
    System.out.println(arrToString(new int[][]{}));
    System.out.println(arrToString(new int[][]{{}}));
    System.out.println(arrToString(new int[][]{{1,2},{3},{5,6,7}}));
    System.out.println(arrToString(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
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
}
