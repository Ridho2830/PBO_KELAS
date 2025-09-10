package PerulanganKasus;

public class Parkiran {
    String kendaraan;
    int bayaran;
    private int totalMobil = 0;
    private int totalMotor = 0;
    private int totalBiaya = 0;

    public Parkiran(String kendaraan, int bayaran) {
        this.kendaraan = kendaraan;
        this.bayaran = bayaran;
    }

    public void Total(int hari) {
        switch (kendaraan) {
            case "mobil":
                totalMobil += 1;
                totalBiaya += 5000;
                break;
            case "motor":
                totalMotor += 1;
                totalBiaya += 2000;
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid!");
                return;
        }
        
        System.out.println("Hari ke-" + hari + ": " + kendaraan + " parkir");
        System.out.println("Total mobil: " + totalMobil + ", Total motor: " + totalMotor);
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
        System.out.println("------------------------");
    }
    
    public void tampilkanRekapFinal() {
        System.out.println("\n=== REKAP FINAL ===");
        System.out.println("Total mobil: " + totalMobil);
        System.out.println("Total motor: " + totalMotor);
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }
}