package kalkulator;

public class Hitung {
  int angka1;
  int angka2;

  public Hitung(int angka1, int angka2) {
    this.angka1 = angka1;
    this.angka2 = angka2;
  }

  public static double tambah(double angka1, double angka2) {
    double hasil = angka1 + angka2;
    System.out.print("Hasil dari penjumlahan: " + angka1 + " + " + angka2 + " = " + hasil);
    return hasil;
  }

  public static double kali(double angka1, double angka2) {
    double hasil = angka1 * angka2;
    System.out.print("Hasil dari perkalian: " + angka1 + " + " + angka2 + " = " + hasil);
    return hasil;
  }

  public static double kurang(double angka1, double angka2) {
    double hasil = angka1 - angka2;
    System.out.print("Hasil dari pengurangan: " + angka1 + " + " + angka2 + " = " + hasil);
    return hasil;
  }

  public static double bagi(double angka1, double angka2) {
    double hasil = angka1 / angka2;
    System.out.print("Hasil dari pembagian: " + angka1 + " + " + angka2 + " = " + hasil);
    return hasil;
  }
}
