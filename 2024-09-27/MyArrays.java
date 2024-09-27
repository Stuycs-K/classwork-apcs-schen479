public class MyArrays{

  public static void main(String[] args){

    //test cases for arrayToString
    System.out.println(arrayToString(new int[]{1, 2, 3}));
    System.out.println(arrayToString(new int[]{1}));

    //test cases for returnCopy
    int[] test = {1, 2, 3, 4};
    int[] test1 = {1};
    int[] test2 = {};

    int[] test_result = returnCopy(test);
    System.out.println(test_result != test);
    for(int i = 0; i < test.length; i++){
      System.out.println("Original Value: " + test[i] + " Copied Value: " + test_result[i]);
    }
    
    int[] test1_result = returnCopy(test1);
    System.out.println(test1_result != test1);
    for(int i = 0; i < test1.length; i++){
      System.out.println("Original Value: " + test1[i] + " Copied Value: " + test1_result[i]);
    }

    int[] test2_result = returnCopy(test2);
    System.out.println(test2_result != test2);
    for(int i = 0; i < test2.length; i++){
      System.out.println("Original Value: " + test2[i] + " Copied Value: " + test2_result[i]);
    }

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
