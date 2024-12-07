public class Driver {
    public static void main(String[] args) {
        Adventurer p1 = new Soldier("Anzam", 50);
        Adventurer p2 = new Soldier("Siddek", 40);

        System.out.println(p1.getName() + " HP: " + p1.getHP());
        p1.setHP(45);
        System.out.println(p1.getName() + " HP: " + p1.getHP());

        System.out.println(p1.attack(p2));
        System.out.println(p2.getName() + " HP: " + p2.getHP());

        System.out.println(p2.support(p2));
        System.out.println(p2.getName() + " HP: " + p2.getHP());

        System.out.println(p1.support());
        System.out.println(p1.getName() + " HP: " + p1.getHP());

        System.out.println(p1.specialAttack(p2));
        System.out.println(p2.getName() + " HP: " + p2.getHP());
        System.out.println(p1.getName() + " HP: " + p1.getHP());

        System.out.println(p1.getName() + "'s special: " + p1.getSpecialName() + " = " + p1.getSpecial());
        p1.setSpecial(50);
        System.out.println(p1.getName() + "'s special: " + p1.getSpecialName() + " = " + p1.getSpecial());
    }
}
