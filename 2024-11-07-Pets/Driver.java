public class Driver {
  public static void main(String [] args) {
    Animal a = new Animal("moo", 10, "cow");

    a.speak();
    Bird b = new Bird ("chirp", 5, "birdy", 7, "blue");
    b.speak();
  }
}
