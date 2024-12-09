import java.util.*;

public class Game{

  public static void main(String[] args){
    CodeWarrior bot = new CodeWarrior();
    Archer player = new Archer("Legolas");

    boolean continuePlay = true;
    boolean isValid = true;

    Scanner scan = new Scanner(System.in);

    while(continuePlay){
      System.out.println(bot.getName() + ", " + bot.getHP() + "/" + bot.getmaxHP() + " HP, " + bot.getSpecial() + "/" + bot.getSpecialMax() + " Special");
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " Special");

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      try{
        String move = scan.nextLine();
      }
      catch(Exception e){
        isValid = false;
        while(!isValid){
          System.out.println("Not a valid input. Try again: ");
        }

      }
    }

  }

  public boolean isValid(String input){
    String[] validInputs = {"attack", "a", "special", "sp", "support", "su", "quit"};

    for(int i = 0; i < validInputs.length; i++){
      if (validInputs[i].equals(input)){
        return true;
      }
    }
    return false;
  }
}
