import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> randomList = ArrayListPractice.createRandomArray(10);
        System.out.println("Original List: " + randomList);

        ArrayListPractice.replaceEmpty(randomList);
        System.out.println("After Replacing Empty: " + randomList);

        ArrayList<String> reversedList = ArrayListPractice.makeReversedList(randomList);
        System.out.println("Reversed List: " + reversedList);

        ArrayList<String> mixedList = ArrayListPractice.mixLists(randomList, reversedList);
        System.out.println("Mixed List: " + mixedList);

        ArrayList<String> randomList2 = ArrayListPractice.createRandomArray(4);
        System.out.println("2nd Random List: " + randomList2);

        ArrayList<String> mixedList2 = ArrayListPractice.mixLists(randomList, randomList2);
        System.out.println("2nd Mixed List: " + mixedList2);
      }
}