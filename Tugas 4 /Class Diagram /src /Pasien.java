public class Pasien {
    private String nama;
    private int umur;
    private String alamat;

    public Pasien(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String toString() {
        return "Dokter: " + nama + "\nSpesialisasi: " + "\nNomor Praktek: " + "\nAlamat Praktek: " +  "\nJadwal Praktek: ";
    }
}
