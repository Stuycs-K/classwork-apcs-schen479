import java.util.*;

public class Driver{

  public static void main(String[] args){
    Adventurer arch1 = new Archer("John", 45, 30);
    Adventurer arch2 = new Archer("Bob", 35);

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
    }

    for(Adventurer archer : archers){
      System.out.println(archer.support());
      System.out.println(archer.getHP());
    }

    arch1.attack(arch2);
    arch2.attack(arch1);
    arch1.attack(arch2);
    arch2.attack(arch1);

    System.out.println("arch1 HP " + arch1.getHP());
    System.out.println("arch2 HP " + arch2.getHP());

    arch1.support(arch2);
    arch2.support(arch1);

    System.out.println("arch1 HP " + arch1.getHP());
    System.out.println("arch2 HP " + arch2.getHP());

    arch1.specialAttack(arch2);
    arch2.specialAttack(arch1);

    System.out.println("arch1 HP " + arch1.getHP());
    System.out.println("arch2 HP " + arch2.getHP());
    System.out.println("arch1 special " +arch1.getSpecial());
    System.out.println("arch2 special " +arch2.getSpecial());

    arch1.setSpecial(0);
    System.out.println("arch1 special " +arch1.getSpecial());
    arch1.specialAttack(arch2);
    System.out.println("arch2 HP " + arch2.getHP());
    System.out.println("arch1 special " +arch1.getSpecial());


  }
}
