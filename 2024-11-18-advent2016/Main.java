import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File file = new File("test.txt");//1
    Scanner input = new Scanner(file);

    String[] inputs = input.toString().split(", ");
    int xcor = 0;
    int ycor = 0;

    for (int x = 0; x < inputs.length; x++) {
      System.out.println(inputs[x]);
    }
  }
}
