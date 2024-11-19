import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      File file = new File("test.txt");//1
      Scanner input = new Scanner(file);

      String[] inputs = input.nextLine().split(", ");
      int xcor = 0;
      int ycor = 0;
      int facing = 0;

      for (int x = 0; x < inputs.length; x++) {
        String direction = inputs[x].substring(0,1);
        String dist = (inputs[x].substring(1));
        int distance = Integer.parseInt(dist);

        if (facing == 0) {
          if (direction.equals("L")) {
            xcor -= distance;
            facing = 3;
          }
          else {
            xcor += distance;
            facing = 1;
          }
        } else if (facing == 1) {
          if (direction.equals("L")) {
            ycor += distance;
            facing = 0;
          }
          else {
            ycor -= distance;
            facing = 2;
          }
        } else if (facing == 2) {
          if (direction.equals("L")) {
            xcor += distance;
            facing = 1;
          }
          else {
            xcor -= distance;
            facing = 3;
          }
        } else if (facing == 3) {
          if (direction.equals("L")) {
            ycor -= distance;
            facing = 2;
          }
          else {
            ycor += distance;
            facing = 0;
          }
        }
      }

      int res = Math.abs(0 - xcor) + Math.abs(0 - ycor);
      System.out.println(res);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
