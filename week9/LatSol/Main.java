// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat array kendaraan listrik menggunakan polimorfisme
        KendaraanListrik[] kendaraan = new KendaraanListrik[4];
        
        // Data simulasi sesuai dokumen
        kendaraan[0] = new MobilListrik(80, 20, 10);
        kendaraan[1] = new MotorListrik(30, 10, 5);
        kendaraan[2] = new MobilListrik(60, 45, 12);
        kendaraan[3] = new MotorListrik(25, 20, 4);
        
        // Variabel untuk menghitung total
        double totalWaktu = 0;
        double totalEnergi = 0;
        
        // Proses perhitungan dan menampilkan hasil
        for (int i = 0; i < kendaraan.length; i++) {
            double waktu = kendaraan[i].hitungWaktuPengisian();
            double energi = kendaraan[i].hitungEnergiDibutuhkan();
            
            // Menentukan jenis kendaraan untuk output
            String jenisKendaraan;
            if (kendaraan[i] instanceof MobilListrik) {
                jenisKendaraan = "Mobil Listrik";
            } else {
                jenisKendaraan = "Motor Listrik";
            }
            
            // Menampilkan hasil per kendaraan
            System.out.println(jenisKendaraan + " → waktu: " + waktu + " jam, energi: " + energi + " kWh");
            
            // Menambahkan ke total
            totalWaktu += waktu;
            totalEnergi += energi;
        }
        
        // Menampilkan total keseluruhan
        System.out.println("Total waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}