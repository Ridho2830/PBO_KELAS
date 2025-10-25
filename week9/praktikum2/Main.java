package week9.praktikum2;

public class Main {
  public static void main(String[] args) {
    Bebek bebek = new Bebek("Bebek");
    Kucing kucing = new Kucing("Kucing");
    bebek.eat();
    bebek.swim();
    bebek.fly();
    kucing.eat();
    kucing.swim();
  }
}
