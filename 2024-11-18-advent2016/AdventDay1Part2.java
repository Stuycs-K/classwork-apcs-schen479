import java.util.*;
import java.io.*;

public class AdventDay1Part2{
    public static void main(String[] args){
        try{
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);

        int curr_direction = 0;
        int x = 0;
        int y = 0;

        String input = scan.nextLine();
        String[] moves = input.split(", ");

        List<int[]> visited = new ArrayList<>();

      for (int i = 0; i < moves.length; i++){
        char direction = moves[i].charAt(0);
        int distance = Integer.parseInt(moves[i].substring(1));
        if(direction == 'L'){
          curr_direction = (curr_direction + 1) % 4;
        }
        else if (direction == 'R'){
          curr_direction = (curr_direction + 3) % 4;
        }

        for(int j = 0; j < distance; j++){
        if (curr_direction == 0){
          y ++;
        }
        else if(curr_direction == 2){
          y --;
        }
        else if(curr_direction == 1){
          x ++;
        }
        else{
          x --;
        }
        

        for(int k = 0; k < visited.size(); k++){
            if(visited.get(k)[0] == x && visited.get(k)[1] == y){
                System.out.println(Math.abs(x)+Math.abs(y));
            }
        }

        visited.add(new int[]{x, y});
        }
      }
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
    }