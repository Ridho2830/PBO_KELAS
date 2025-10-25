package week9.praktikum1;

public class Sapi extends Hewan {
  public Sapi(String nama, int jumlahKaki, boolean terbang) {
    super(nama, jumlahKaki, terbang);
  }

  @Override
  public void suara() {
    System.out.println("Moo....");
  }
}
