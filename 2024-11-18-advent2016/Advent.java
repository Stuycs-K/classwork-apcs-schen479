import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent{
  public static void main(String[] args){
    try{
      File file = new File("input.txt");
      Scanner scan = new Scanner(file);

      int curr_direction = 0;
      //0 - N, 1 - E, 2 - S, 3 - W
      int x = 0;
      int y = 0;
      while (scan.hasNext()){
        System.out.println("Hi");
        String move = scan.next();
        char direction = move.charAt(0);
        int amount = Integer.parseInt(move.substring(1));

        if(direction == 'L'){
          System.out.println(curr_direction);
          curr_direction = (curr_direction + 1) % 4;
        }
        else if (direction == 'R'){
          System.out.println(curr_direction);
          curr_direction = (curr_direction + 3) % 4;
        }

        if (curr_direction == 0){
          y += amount;
        }
        else if(curr_direction == 2){
          y -= amount;
        }
        else if(curr_direction == 1){
          x += amount;
        }
        else{
          x -= amount;
        }
      }
      System.out.println(Math.abs(x)+Math.abs(y));
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
