import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    makeWords(3, "", "abc");
    makeWords(4, "", "abcd");

  }

  public static int fibonacci(int n){
    if (n == 0){
      return 0;
    }
    else if (n == 1){
      return 1;
    }
    else{
      return fibonacci(n - 2) + fibonacci (n - 1);
    }
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for (int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }
    }
  }
}
