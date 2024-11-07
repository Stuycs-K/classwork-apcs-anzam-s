//instead of calling the getName of Animal.java, it called the getName of Bird.java


//Only the third test did not work because Bird is a more specific class than Animal;
//every Bird is an Animal, but not every Animal is a Bird

public class Driver {
  public static void main(String [] args) {
    Animal a = new Animal("moo", 10, "cow");

    a.speak();
    Bird b = new Bird ("chirp", 5, "birdy", 7, "blue");
    b.speak();

    Animal a1 = new Animal("moo", 10, "cow");
    Bird b1 = new Bird("chirp", 5, "birdy", 7, "blue");
    //Bird b2 = new Animal("moo", 10, "cow");
    Animal a2 = new Bird("chirp", 5, "birdy", 7, "blue");

    System.out.println();
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
