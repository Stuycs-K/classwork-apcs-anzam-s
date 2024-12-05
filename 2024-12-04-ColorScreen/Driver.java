import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        //create 80x30 border of color
        Text.color(Text.WHITE, Text.background(Text.BLUE));
        
        for (int col = 1; col <= 80; col++) {
            Text.go(1, col);
            System.out.print("#");
        }

        for (int col = 1; col <= 80; col++) {
            Text.go(30, col);
            System.out.print("#");
        }

        for (int row = 1; row < 30; row++) {
            Text.go(row, 1);
            System.out.print("#");
            Text.go(row, 80);
            System.out.print("#");
        }

        //array of 3 random ints
        Random rng = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = rng.nextInt(100);
        }

        Text.go(2,20);
        changeColor(numbers[0]);
        System.out.print(numbers[0]);
        Text.go(2,40);
        changeColor(numbers[1]);
        System.out.print(numbers[1]);
        Text.go(2,60);
        changeColor(numbers[2]);
        System.out.print(numbers[2]);

        for (int col = 2; col <= 30; col++) {
            Text.go(3, col);
            System.out.print("-");
        }

        Text.go(82, 0);
        System.out.println(Text.RESET);
    }

    public static void changeColor(int number) {
        if (number < 25) {
            Text.color(Text.BRIGHT, Text.RED);
        }

        if (number > 75) {
            Text.color(Text.BRIGHT, Text.GREEN);
        }
    }
}
