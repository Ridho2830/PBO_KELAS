public class MobilListrik extends KendaraanListrik {
    
    public MobilListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    @Override
    public double hitungWaktuPengisian() {
        // Efisiensi 90% berarti waktu x 1.1
        double waktuDasar = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktuDasar * 1.1;
    }
}