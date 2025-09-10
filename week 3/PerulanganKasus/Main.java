package PerulanganKasus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parkiran parkir = new Parkiran(null, 0);
        
        System.out.print("Masukkan jumlah hari: ");
        int masuk = scanner.nextInt();

        for (int i = 1; i <= masuk; i++) {
            System.out.print("Masukkan jenis kendaraan hari ke-" + i + " (mobil/motor): ");
            String kendaraan = scanner.next();
            parkir.kendaraan = kendaraan;
            parkir.Total(i);
        }
        
        parkir.tampilkanRekapFinal();
        
        scanner.close();
    }
}