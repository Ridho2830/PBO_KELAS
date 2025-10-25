package week9.praktikum2;

public class Bebek extends Animal implements flyable, swimable {

  public Bebek(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Kwak kwak....");
  }

  @Override
  public void fly() {
    System.out.println("Bebek tidak dapat terbang.");
  }

  @Override
  public void swim() {
    System.out.println("Bebek dapat berenang.");
  }

}
