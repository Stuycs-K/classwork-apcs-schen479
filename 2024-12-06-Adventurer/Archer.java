public class Archer extends Adventurer{
  private int specialAmount;
  private int specialMax;
  private String specialName = "Mana";

  public Archer(String name){
    super(name);
    this.specialAmount = 20;
    this.specialMax = 20;
  }

  public Archer(String name, int hp){
    super(name, hp);
    this.specialAmount = 20;
    this.specialMax = 20;
  }

  public Archer(String name, int hp, int specialAmount){
    super(name, hp);
    this.specialAmount = specialAmount;
    this.specialMax = specialAmount;
  }

  public String getSpecialName(){
    return this.specialName;
  }
  //accessor methods
  public int getSpecial(){
    return this.specialAmount;
  }
  public void setSpecial(int n){
    this.specialAmount = n;
  }
  public int getSpecialMax(){
    return this.specialMax;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int n = other.getHP();
    if (n < 5){
      other.applyDamage(n);
    }
    else{
      n = 5;
      other.applyDamage(n);
    }
    return super.getName() + " did " + n + " damage to " + other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int n = other.getmaxHP() - other.getHP();
    if(n < 5){
      other.setHP(other.getHP() + n);
    } 
    else{
      n = 5;
      other.setHP(other.getHP() + n);

    }
    return other.getName() + " healed themselves for " + n + " points";
  }

  //heall or buff self
  public String support(){
    int n = this.getmaxHP() - this.getHP();
    if(n < 10){
      this.setHP(this.getHP() + n);
    } 
    else{
      n = 10;
      this.setHP(this.getHP() + 10);

    }
    return this.getName() + " healed themselves for " + n + " points";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (this.specialAmount < 5){
      this.restoreSpecial(10);
    }
    this.setSpecial(this.getSpecial() -5);

    int n = other.getHP();
    if (n < 15){
      other.applyDamage(n);
    }
    else{
      n = 15;
      other.applyDamage(15);
    }

    return this.getName() + " used 5 mana to deal 5 extra points of damage to " + other.getName();
  }

}
