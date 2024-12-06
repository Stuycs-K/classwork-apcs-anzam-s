public class Soldier extends Adventurer{
  private String specialName = "SpecialAbility";
  private int special = 1;
  private int specialMax = 100;

  public Soldier(String name, int hp) {
    Adventurer(name, hp);
  }

  String getSpecialName() {
    return specialName;
  }

  int getSpecial() {
    return special;
  }

  void setSpecial(int n) {
    if (n <= specialMax) {
      special = n;
    }
  }

  int getSpecialMax() {
    return specialMax;
  }

  String attack(Adventurer other) {
    other.applyDamage(10);
    return other.getName() + "lost 10 HP";
  }

  String support(Adventurer other) {
    int health = other.getHP();
    other.setHP(health+10);
    return other.getName() + "gained 10 HP";
  }

  String support() {
    int health = super.getHP();
    super.setHP(health + 10);
    return super.getName() + "gained 10 HP";
  }

  String specialAttack(Adventurer other) {
    other.applyDamage(20);
    support();

    return other.getName() + "lost 20 HP and " super.getSpecialName() + "gained 10 HP";
  }
}
