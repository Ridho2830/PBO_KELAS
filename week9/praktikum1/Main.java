package week9.praktikum1;

public class Main {
  public static void main(String[] args) {
    Sapi sapi = new Sapi("Sapi", 4, false);
    Burung burung = new Burung("Burung", 2, true);

    sapi.isHewan();
    sapi.suara();
    burung.isHewan();
    burung.suara();
  }
}
