import java.util.Scanner;

public class Game{
  public static void main(String[] args) {
      //do this once
      Scanner userInput = new Scanner(System.in);

      //You can do the rest many times:

      System.out.println("Enter username");
      //Read one line of user input
      String userName = userInput.nextLine();
      //Do something with the input
      System.out.println("Username is: " + userName);

      CodeWarrior user = new CodeWarrior(userName, 100);
      CodeWarrior enemy = new CodeWarrior("enemy", 100);

      System.out.println(userName + ": " + user.getHP() + "HP/" + user.getSpecial() + " " + user.getSpecialName());
      System.out.println("enemy: " + enemy.getHP() + "HP/" + enemy.getSpecial() + " " + enemy.getSpecialName());

      while (user.getHP() > 0 && enemy.getHP() > 0) {
          int randomNum = (int)(Math.random() * 3) + 1;

          if (randomNum == 1) {
            System.out.println(enemy.attack(user));
          }
          else if (randomNum == 2) {
            System.out.println(enemy.specialAttack(user));
          }
          else if (randomNum == 3) {
            System.out.println(enemy.support());
          }

          if (user.getHP() <= 0) {
            System.out.println("Enemy won!");
            return;
          }

          System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
          String choice = userInput.nextLine();

          if (choice.equals("a") || choice.equals("attack")) {
            System.out.println(user.attack(enemy));
          }
          else if (choice.equals("sp") || choice.equals("special")) {
            System.out.println(user.specialAttack(enemy));
          }
          else if (choice.equals("su") || choice.equals("support")) {
            System.out.println(user.support());
          }
          else if (choice.equals("quit")) {
            System.out.println("Game quit.");
            return;
          }
      }

      System.out.println(userName + " won!");
  }
}
