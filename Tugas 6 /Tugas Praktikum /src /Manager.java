import java.time.LocalDate;
public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + (0.10 * getGaji()); // Tambahan tunjangan 10% dari gaji
    }

    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}
