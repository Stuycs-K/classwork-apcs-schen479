import java.util.*;

public class Driver{

  public static void main(String[] args){
    Adventurer arch1 = new Archer("John", 15, 20, 30);
    Adventurer arch2 = new Archer("Bob", 15);

    ArrayList<Adventurer> archers = new ArrayList<Adventurer>();
    archers.add(arch1);
    archers.add(arch2);

    for(Adventurer archer : archers){
      System.out.println(archer.getName());
      System.out.println(archer.getHP());
      System.out.println(archer.getmaxHP());
      System.out.println(archer.getSpecialName());
      System.out.println(archer.getSpecial());
      System.out.println(archer.getSpecialMax());

    }

  }
}
