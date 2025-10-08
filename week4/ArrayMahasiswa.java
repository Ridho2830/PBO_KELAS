public class ArrayMahasiswa {
  public static void main(String[] args) {
    String[][] daftarMahasiswa = {
        { "NIM01", "Budi", "Pemrograman", "85" },
        { "NIM02", "Siti", "Pemrograman", "78" },
        { "NIM01", "Budi", "Basis Data", "90" },
        { "NIM03", "Andi", "Pemrograman", "88" },
        { "NIM02", "Siti", "Basis Data", "82" },
        { "NIM03", "Andi", "Basis Data", "75" }
    };

    // Tampilkan semua data mahasiswa
    System.out.println("=== DAFTAR MAHASISWA ===");
    for (int i = 0; i < daftarMahasiswa.length; i++) {
      System.out.println("NIM: " + daftarMahasiswa[i][0] +
          ", Nama: " + daftarMahasiswa[i][1] +
          ", Matakuliah: " + daftarMahasiswa[i][2] +
          ", Nilai: " + daftarMahasiswa[i][3]);
    }

    System.out.println("\n=== RATA-RATA NILAI ===");

    // Hitung rata-rata
    int totalNilaiBudi = 0;
    int jumlahMataKuliahBudi = 0;
    for (int i = 0; i < daftarMahasiswa.length; i++) {
      if (daftarMahasiswa[i][1].equals("Budi")) {
        totalNilaiBudi = totalNilaiBudi + Integer.parseInt(daftarMahasiswa[i][3]);
        jumlahMataKuliahBudi++;
      }
    }
    if (jumlahMataKuliahBudi > 0) {
      double rataRataBudi = (double) totalNilaiBudi / jumlahMataKuliahBudi;
      System.out.println("Rata-rata nilai Budi: " + rataRataBudi);
    }

    int totalNilaiSiti = 0;
    int jumlahMataKuliahSiti = 0;
    for (int i = 0; i < daftarMahasiswa.length; i++) {
      if (daftarMahasiswa[i][1].equals("Siti")) {
        totalNilaiSiti = totalNilaiSiti + Integer.parseInt(daftarMahasiswa[i][3]);
        jumlahMataKuliahSiti++;
      }
    }
    if (jumlahMataKuliahSiti > 0) {
      double rataRataSiti = (double) totalNilaiSiti / jumlahMataKuliahSiti;
      System.out.println("Rata-rata nilai Siti: " + rataRataSiti);
    }

    int totalNilaiAndi = 0;
    int jumlahMataKuliahAndi = 0;
    for (int i = 0; i < daftarMahasiswa.length; i++) {
      if (daftarMahasiswa[i][1].equals("Andi")) {
        totalNilaiAndi = totalNilaiAndi + Integer.parseInt(daftarMahasiswa[i][3]);
        jumlahMataKuliahAndi++;
      }
    }
    if (jumlahMataKuliahAndi > 0) {
      double rataRataAndi = (double) totalNilaiAndi / jumlahMataKuliahAndi;
      System.out.println("Rata-rata nilai Andi: " + rataRataAndi);
    }
  }
}