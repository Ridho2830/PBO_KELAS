package week9.praktikum2;

public abstract class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract void makeSound();

  public void eat() {
    System.out.println(name + " sedang makan...");
  }
}
