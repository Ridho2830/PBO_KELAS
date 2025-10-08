package UML;

public class Main {
  public static void main(String[] args) {
    Animal hewan = new Animal("Hewan", 0);
    Kambing kambing1 = new Kambing("Kambing", 1, "Mountain");

    hewan.makeSound();
    kambing1.makeSound();
  }
}
