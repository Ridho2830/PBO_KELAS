package UML;

public class Kambing extends Animal {
  private String breed;

  public Kambing(String name, int age, String breed) {
    super(name, age);
  }

  public void makeSound() {
    System.out.println("mbek mbek mbekk.... ");
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }
}
