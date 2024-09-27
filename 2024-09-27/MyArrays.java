public class MyArrays{

  public static void main(String[] args){

    //test cases for arrayToString
    System.out.println(arrayToString(new int[]{1, 2, 3}));
    System.out.println(arrayToString(new int[]{1}));

    //test cases for returnCopy
    int[] test = {1, 2, 3, 4};
    int[] test1 = {1};
    int[] test2 = {};
    System.out.println(returnCopy(test) != test);
    System.out.println(returnCopy(test1) != test1);
    System.out.println(returnCopy(test2) != test2);

  }

  public static String arrayToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++){
      result += nums[i];
      if(i < nums.length - 1){
        result += ", ";
      }
    }
    return result + "]";
  }

  public static int[] returnCopy(int[] ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;
  }

  public static int[] concatArray(int[] ary1,int[] ary2){
    return new int[0];
  }
}
