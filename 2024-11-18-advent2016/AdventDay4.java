import java.util.*;
import java.io.*;

public class AdventDay4{
    public static void main(String[] args){
        try{
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);
            
            int sum = 0;
            while(scan.hasNextLine() ){
                String room = scan.nextLine();
                String top5 = getChars(room.toCharArray());
                if (top5.equals(room.substring(room.length()-6,room.length()-1))){
                    sum += Integer.parseInt(room.substring(room.lastIndexOf("-")+1, room.indexOf("[")));
                }
            }
            System.out.println(sum);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static String getChars(char[] input){
        char[] characters = new char[26];
        ArrayList<Integer> occurrences = new ArrayList<Integer>(26);
        int[] copy = new int[26];
        String result = "";

        for(int i = 0; i < 26; i++){
            characters[i] = (char) ('a' + i);
            occurrences.add(new Integer(0));
        }

        for(int i = 0; i < input.length; i++){
            if (Character.isLetter(input[i])){
                occurrences.set(input[i] - 'a', occurrences.get(input[i] - 'a') + 1);
                copy[input[i] - 'a']++;
            }
        }

        Arrays.sort(copy);

        for (int i = 25; i > 20; i--){
            int index = occurrences.indexOf(copy[i]);
            result += characters[index];
            occurrences.set(index, 0);
        }
        return result;
        
    }

}