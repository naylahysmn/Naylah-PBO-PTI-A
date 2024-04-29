import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Test Case Manusia
        Manusia lakiLakiMenikah = new Manusia("Arhan", true, "0987654321", true);
        Manusia perempuanMenikah = new Manusia("Azizah", false, "1234567890", true);
        Manusia belumMenikah = new Manusia("Rayyanza", true, "1029384756", false);
        System.out.println("Test case Manusia:");
        System.out.println("a. " + lakiLakiMenikah.toString());
        System.out.println("b. " + perempuanMenikah.toString());
        System.out.println("c. " + belumMenikah.toString());

        // Test Case MahasiswaFILKOM
        MahasiswaFILKOM ipkKurangDariTiga = new MahasiswaFILKOM("Ibadun", false, "1122334455", false, "235150601111001", 2.75);
        MahasiswaFILKOM ipkTigaSampaiTigaSetengah = new MahasiswaFILKOM("Vanessa", false, "6677889900", true, "235150601111005", 3.25);
        MahasiswaFILKOM ipkTigaSetengahSampaiEmpat = new MahasiswaFILKOM("Naylah", false, "0192837465", false, "235150600111004", 3.75);
        System.out.println("\nTest case MahasiswaFILKOM:");
        System.out.println("a. " + ipkKurangDariTiga.toString());
        System.out.println("b. " + ipkTigaSampaiTigaSetengah.toString());
        System.out.println("c. " + ipkTigaSetengahSampaiEmpat.toString());

        // Test Case Pekerja
        LocalDate tahunSekarang = LocalDate.now();
        Pekerja lamaBekerja2TahunAnak2 = new Pekerja("Ibadun", false, "1122334455", true, 5000, tahunSekarang.minusYears(2), 2);
        Pekerja lamaBekerja9Tahun = new Pekerja("Vanessa", false, "6677889900", true, 6000, tahunSekarang.minusYears(9), 0);
        Pekerja lamaBekerja20TahunAnak10 = new Pekerja("Naylah", false, "0192837465", false, 7500, tahunSekarang.minusYears(20), 10);
        System.out.println("\nTest case Pekerja:");
        System.out.println("a. " + lamaBekerja2TahunAnak2.toString());
        System.out.println("b. " + lamaBekerja9Tahun.toString());
        System.out.println("c. " + lamaBekerja20TahunAnak10.toString());

        // Test Case Manager
        LocalDate tahunMasuk = LocalDate.now().minusYears(15); // Mengurangi 15 tahun dari tanggal sekarang
        Manager manager = new Manager("Naylah", false, "0192837465", true, 7500, tahunMasuk, 0, "Sistem Informasi");
        System.out.println("\nTest case Manager:");
        System.out.println(manager.toString());
    }
}
