import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdventDay1{
  public static void main(String[] args){
    try{
      File file = new File("input.txt");
      Scanner scan = new Scanner(file);

      int curr_direction = 0;
      int x = 0;
      int y = 0;

      String input = scan.nextLine();
      scan.close();
      String[] moves = input.split(", ");

      for (int i = 0; i < moves.length; i++){
        System.out.println(moves[i]);
        char direction = moves[i].charAt(0);
        int distance = Integer.parseInt(moves[i].substring(1));
        if(direction == 'L'){
          curr_direction = (curr_direction + 1) % 4;
        }
        else if (direction == 'R'){
          curr_direction = (curr_direction + 3) % 4;
        }

        if (curr_direction == 0){
          y += distance;
        }
        else if(curr_direction == 2){
          y -= distance;
        }
        else if(curr_direction == 1){
          x += distance;
        }
        else{
          x -= distance;
        }
      }
      System.out.println(Math.abs(x)+Math.abs(y));
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdventDay1{
  public static void main(String[] args){
	try{
  	File file = new File("input.txt");
  	Scanner scan = new Scanner(file);

  	int curr_direction = 0;
  	int x = 0;
  	int y = 0;

  	String input = scan.nextLine();
  	scan.close();
  	String[] moves = input.split(", ");

  	for (int i = 0; i < moves.length; i++){
    	System.out.println(moves[i]);
    	char direction = moves[i].charAt(0);
    	int distance = Integer.parseInt(moves[i].substring(1));
    	if(direction == 'L'){
      	curr_direction = (curr_direction + 1) % 4;
    	}
    	else if (direction == 'R'){
      	curr_direction = (curr_direction + 3) % 4;
    	}

    	if (curr_direction == 0){
      	y += distance;
    	}
    	else if(curr_direction == 2){
      	y -= distance;
    	}
    	else if(curr_direction == 1){
      	x += distance;
    	}
    	else{
      	x -= distance;
    	}
  	}
  	System.out.println(Math.abs(x)+Math.abs(y));
	}
	catch (FileNotFoundException e){
  	e.printStackTrace();
	}
  }
}
