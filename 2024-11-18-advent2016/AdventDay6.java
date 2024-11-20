import java.util.*;
import java.io.*;

public class AdventDay6{
  public static void main(String[] args){
    try{
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);

        String answer = "";
        ArrayList<String> input = new ArrayList<String>();
        while(scan.hasNextLine() ){
            input.add(scan.nextLine());
        }
        for(int i = 0; i < input.get(0).size(); i++){
          String column = "";
          for(int j = 0; j < input.size(); j++){
            column += input.get(j).charAt(i);
          }
          answer += getChars(column.toCharArray());
        }
        System.out.println(answer);
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
  }

  public static char getChars(char[] input){
      char[] characters = new char[26];
      int[] occurrences = new int[26];
      int[] copy = new int[26];

      for(int i = 0; i < 26; i++){
          characters[i] = (char) ('a' + i);
      }

      for(int i = 0; i < input.length; i++){
          if (Character.isLetter(input[i])){
              occurrences[input[i] - 'a']++;
              copy[input[i] - 'a']++;
          }
      }

      Arrays.sort(copy);

      return characters[occurrences.indexOf(copy[0])];

  }
}
