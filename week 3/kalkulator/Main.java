package kalkulator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Hitung hitung = new Hitung(0, 0);
    System.out.print("Masukkan pertama: ");
    double a = scanner.nextInt();
    System.out.print("Masukkan angka kedua: ");
    int b = scanner.nextInt();

    System.out.println("+ - x /");
    System.out.print("Masukkan Operasi: ");
    String c = scanner.next();

    switch (c) {
      case "+":
        Hitung.tambah(a, b);
        break;
      case "-":
        Hitung.kurang(a, b);
        break;
      case "x":
        Hitung.kali(a, b);
        break;
      case "/":
        Hitung.bagi(a, b);
        break;
      default:
        break;
    }
    scanner.close();
  }

}
