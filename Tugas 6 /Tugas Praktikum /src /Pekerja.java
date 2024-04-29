import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        LocalDate now = LocalDate.now();
        int tahunBekerja = now.getYear() - tahunMasuk.getYear();
        
        if (tahunBekerja >= 0 && tahunBekerja <= 5) {
            return 0.05 * gaji; 
        } else if (tahunBekerja > 5 && tahunBekerja <= 10) {
            return 0.10 * gaji; 
        } else {
            return 0.15 * gaji; 
        }
    }

    public double getPendapatan() {
        return gaji + getBonus() + (20 * jumlahAnak); 
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }
}
