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

    for(int i = 0; i < archers.size(); i++){
      Adventurer currArch = archers.get(i);
      currArch.setName("Legolas " + i);
      currArch.setHP(currArch.getHP() + 10);
      currArch.setmaxHP(currArch.getmaxHP() + 10);
    }


  }
}
