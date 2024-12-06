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
    this.specialAmount += n;
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
    other.applyDamage(10);
    return super.getName() + " does 10 damage to " + other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(10);
    return super.getName() + " heals " + other.getName() + " by 10 points";
  }

  //heall or buff self
  public String support(){
    this.setHP(10);
    return super.getName() + " heals itself by 10 points";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (this.specialAmount < 10){
      this.restoreSpecial(10);
      this.setSpecial(-5);
    }
    other.applyDamage(15);
    return super.getName() + " used 5 mana to deal 5 extra points of damage to " + other.getName();
  }

}
