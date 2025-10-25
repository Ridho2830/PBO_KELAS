package week9.praktikum1;

public abstract class Hewan {
  private String nama;
  private int jumlahKaki;
  private boolean terbang;

  public Hewan(String nama, int jumlahKaki, boolean terbang) {
    this.nama = nama;
    this.jumlahKaki = jumlahKaki;
    this.terbang = terbang;
  }

  public String getNama() {
    return this.nama;
  }

  public int getJumlahKaki() {
    return this.jumlahKaki;
  }

  public boolean getTerbang() {
    return this.terbang;
  }

  public void isHewan() {
    System.out.println("Nama: " + this.nama + "\nJumlah Kaki: " + this.jumlahKaki + "\nTerbang: " + this.terbang);
  }

  public abstract void suara();
}
