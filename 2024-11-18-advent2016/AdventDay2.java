import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AdventDay2{
    public static void main(String[] args){
        try{
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);

            int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            String answer = "";
            int x = 1;
            int y = 1;

            while(scan.hasNextLine()){
                String directions = scan.nextLine();
                for(int i = 0; i < directions.length(); i++){
                    char move = directions.charAt(i);
                    if (move == 'U' && x != 0){
                        x--;
                    }
                    else if(move == 'D' && x != 2){
                        x++;
                    }
                    else if(move == 'L' && y != 0){
                        y--;
                    }
                    else if(move == 'R' && y != 2){
                        y++;
                    }
                }
                System.out.println(keypad[x][y]);
                answer += keypad[x][y];
            }
            System.out.println(answer);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}