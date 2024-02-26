package Tugas1;
import java.util.Scanner;

public class Tugas1 {
    static Scanner scanner = new Scanner(System.in);
    final static int namaMataKuliah = 5;
    static String[] mataKuliah = new String[namaMataKuliah];
    static int jumlahMataKuliah = 0;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            System.out.println("Selamat datang di Sistem Akademik Mahasiswa Universitas Brawijaya");
            System.out.println("1. Pendaftaran Mata Kuliah");
            System.out.println("2. Lihat Daftar Mata Kuliah");
            System.out.println("3. Lihat KRS");
            System.out.println("4. Keluar");

            System.out.print("Silakan pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pendaftaranMataKuliah(scanner);
                    break;
                case 2:
                    lihatDaftarMataKuliah();
                    break;
                case 3:
                    lihatKRS();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Sistem Akademik Universitas Brawijaya.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    static void pendaftaranMataKuliah(Scanner scanner) {
        if (jumlahMataKuliah >= namaMataKuliah) {
            System.out.println("Anda sudah mencapai batas maksimal pengambilan mata kuliah.");
            return;
        }

        System.out.print("Masukkan nama mata kuliah: ");
        String namaMatkul = scanner.next();
        mataKuliah[jumlahMataKuliah] = namaMatkul;
        jumlahMataKuliah++;
        System.out.println("Pendaftaran mata kuliah berhasil.");
    }

    static void lihatDaftarMataKuliah() {
        System.out.println("Daftar Mata Kuliah yang Anda Ambil:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println((i+1) + ". " + mataKuliah[i]);
        }
    }

    static void lihatKRS() {
        if (jumlahMataKuliah == 0) {
            System.out.println("Anda belum mengambil mata kuliah apa pun.");
        } else {
            System.out.println("Kartu Rencana Studi (KRS):");
            for (int i = 0; i < jumlahMataKuliah; i++) {
                System.out.println((i+1) + ". " + mataKuliah[i]);
            }
        }
    }
}
