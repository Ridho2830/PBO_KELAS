package week9.praktikum2;

public class Kucing extends Animal implements swimable {
  public Kucing(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("miaw miaw.... ");
  }

  @Override
  public void swim() {
    System.out.println("Kucing tidak dapat berenang.");
  }

}
