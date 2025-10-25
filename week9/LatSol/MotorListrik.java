public class MotorListrik extends KendaraanListrik {
    
    public MotorListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    @Override
    public double hitungWaktuPengisian() {
        // Efisiensi 95% berarti waktu x 1.05
        double waktuDasar = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktuDasar * 1.05;
    }
}