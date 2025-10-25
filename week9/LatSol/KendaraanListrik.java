public abstract class KendaraanListrik implements KonsumsiEnergi {
    protected double kapasitasBaterai;
    protected double dayaSaatIni;
    protected double kecepatanPengisian;
    
    public KendaraanListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }
    
    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract double hitungWaktuPengisian();
    
    // Implementasi dari interface KonsumsiEnergi
    @Override
    public double hitungEnergiDibutuhkan() {
        return kapasitasBaterai - dayaSaatIni;
    }
}