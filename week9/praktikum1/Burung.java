package week9.praktikum1;

public class Burung extends Hewan {
  public Burung(String nama, int jumlahKaki, boolean terbang) {
    super(nama, jumlahKaki, terbang);
  }
  @Override
  public void suara() {
    System.out.println("kiw kiw...");
  }
}
