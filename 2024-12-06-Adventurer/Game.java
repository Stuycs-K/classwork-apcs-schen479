import java.util.*;

public class Game{

  public static void main(String[] args){
    CodeWarrior bot = new CodeWarrior();
    Archer player = new Archer("Legolas");

    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    while(player.getHP() > 0 && bot.getHP() > 0){
      System.out.println(bot.getName() + ", " + bot.getHP() + "/" + bot.getmaxHP() + " HP, " + bot.getSpecial() + "/" + bot.getSpecialMax() + " Special");
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " Special");

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = scan.nextLine();

      if(move.equals("a") || move.equals("attack")){
        System.out.println(player.attack(bot));
      }
      else if (move.equals("sp") || move.equals("special")){
        System.out.println(player.specialAttack(bot));
      }
      else if (move.equals("su") || move.equals("support")){
        System.out.println(player.support());
      }
      else if (move.equals("quit")){
        System.exit(0);
      }
      else{
        System.out.println("Invalid input letter. Try again: ");
        continue;
      }

      if(bot.getHP() > 0){
        int botMove = random.nextInt(3);

        if (botMove == 0){
          System.out.println(bot.attack(player));
        }
        else if (botMove == 1){
          System.out.println(bot.specialAttack(player));
        }
        else{
          System.out.println(bot.support());
        }
      }
    }
    if (player.getHP() < 0){
      System.out.println("Bot Wins");
    }
    else {
      System.out.println("Player Wins");
    }
  }
}
