package Abstract;

abstract class Kendaraan {
  abstract void move();
}

class Mobil extends Kendaraan {
  public void move() {
    System.out.println("Mobil berjalan");
  }
}

class Perahu extends Kendaraan {
  public void move() {
    System.out.println("Perahu berlayar");
  }
}

public class KendaraanMain {
  public static void main(String[] args) {
    Kendaraan kendaraan = new Mobil();
    kendaraan.move();
  }
}
