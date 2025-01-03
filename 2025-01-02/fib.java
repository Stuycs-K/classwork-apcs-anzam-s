public class fib {
  public static int fibonacci(int num) {
    if (num == 0) {
      return 0;
    }
    if (num == 1) {
      return 1;
    }
    if (num > 1) {
      return (fibonacci(num-1) + fibonacci(num-2));
    }
    return 0;
  }

  public static void makeWords (int remainingLetters, String result, String alphabet) {
    if (remainingLetters > 0) {
      for (int x = 0; x < alphabet.length(); x++) {
        String letter = alphabet.substring(x, x+1);
        return makeWords(remainingLetters-1, result + letter, alphabet);
      }
    }
    else {
      System.out.println(result);
    }
  }

  public static void main(String [] args) {
    System.out.print(fibonacci(Integer.parseInt(args[0])));
  }
}
