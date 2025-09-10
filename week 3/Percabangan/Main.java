
// package week 3.Percabangan;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double nilai;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Masukkan nilai anda: ");
      nilai = scanner.nextDouble();
    } while (nilai > 100);
    MasterGrade.grade(nilai);
    scanner.close();
  }

}
