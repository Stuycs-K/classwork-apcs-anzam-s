import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        //2 Opening a file requires a try/catch
        try {
          File file = new File("ReadFile.java");//1
          Scanner input = new Scanner(file);
          //CODE THAT SCANS THE FILE.
          int count = 0;
        //   while(input.hasNextLine()) {
        //     if (count % 2 == 0) {
        //         System.out.println(input.nextLine());
        //     }
        //     else {
        //         input.nextLine();
        //     }
        //     count++;
        //   }

        while(input.hasNextLine()) {
            String currentLine = input.nextLine();
            if (currentLine.contains("{")) {
                System.out.println(currentLine);
            }
          }
          input.close();//releases the file from your program
    
        } catch (FileNotFoundException ex) {
          //File not found what should you do?
          System.out.println("File not found");
          return; //you can return from a void function just don't put a value.
        }

        
      }
}