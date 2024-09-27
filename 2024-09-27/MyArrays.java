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
    System.out.println("Addresses are different: " + test_result != test);
    System.out.println("Values are the same: " + arrayToString(test).equals(arrayToString(test_result)));
    
    int[] test1_result = returnCopy(test1);
    System.out.println("Addresses are different: " + test1_result != test1);
    System.out.println("Values are the same: " +arrayToString(test1).equals(arrayToString(test1_result)));

    int[] test2_result = returnCopy(test2);
    System.out.println("Addresses are different: " + test2_result != test2);
    System.out.println("Values are the same: " + arrayToString(test2).equals(arrayToString(test2_result)));

    //test cases for concatArray
    //int[] arr1 = 
    //System.out.println("Expected Value [1, 3, 4, 5, 6, 7, 8, 9], Actual Values: ")
    //for(int i = 0; i < )

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
