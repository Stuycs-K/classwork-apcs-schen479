public class MyArrays{

  public static void main(String[] args){

    //test cases for arrayToString
    System.out.println(arrayToString(new int[]{1, 2, 3}));
    System.out.println(arrayToString(new int[]{1}));

    //test cases for returnCopy
    int[] test = {1, 2, 3, -4};
    int[] test1 = {3, 4, 5};
    int[] test2 = {6};
    int[] test3 = {};

    int[] test_result = returnCopy(test);
    System.out.println("Addresses are different: " + (test_result != test));
    System.out.println("Original Values: " + arrayToString(test) + " Copied Values: " + (arrayToString(test_result)));
    
    int[] test1_result = returnCopy(test1);
    System.out.println("Addresses are different: " + (test1_result != test1));
    System.out.println("Original Values: " + arrayToString(test1) + " Copied Values: " + arrayToString(test1_result));

    int[] test2_result = returnCopy(test2);
    System.out.println("Addresses are different: " + (test2_result != test2));
    System.out.println("Original Values: " + arrayToString(test2) + " Copied Values: " + arrayToString(test2_result));

    int[] test3_result = returnCopy(test3);
    System.out.println("Addresses are different: " + (test3_result != test3));
    System.out.println("Original Values: " + arrayToString(test3) + " Copied Values: " + arrayToString(test3_result));

    //test cases for concatArray
    System.out.println("Original Arrays : " + arrayToString(test) + " " + arrayToString(test1) + " Concatenated Values: " + arrayToString(concatArray(test, test1)));
    System.out.println("Original Arrays : " + arrayToString(test) + " " + arrayToString(test2) + " Concatenated Values: " + arrayToString(concatArray(test, test2)));
    System.out.println("Original Arrays : " + arrayToString(test) + " " + arrayToString(test3) + " Concatenated Values: " + arrayToString(concatArray(test, test3)));
    System.out.println("Original Arrays : " + arrayToString(test3) + " " + arrayToString(test) + " Concatenated Values: " + arrayToString(concatArray(test3, test)));
    System.out.println("Original Arrays : " + arrayToString(test2) + " " + arrayToString(test) + " Concatenated Values: " + arrayToString(concatArray(test2, test)));
    System.out.println("Original Arrays : " + arrayToString(test1) + " " + arrayToString(test) + " Concatenated Values: " + arrayToString(concatArray(test1, test)));




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
    int[] combinedArr = new int[ary1.length + ary2.length];
    int arrIndex = 0;
    for (int i = 0; i < combinedArr.length; i++){
      if (i == ary1.length){
        arrIndex = 0;
      }
      if (i >= ary1.length){
        combinedArr[i] = ary2[arrIndex];
        arrIndex++;
      }
      else{
        combinedArr[i] = ary1[arrIndex];
        arrIndex++;
      }
    }
    return combinedArr;
  }
}
