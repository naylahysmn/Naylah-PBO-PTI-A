import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kue> daftarKue = new ArrayList<>();
        Kue[] arrayKue = new Kue[20];
        arrayKue[0] = new KuePesanan("Bolu Kukus", 20000, 0.5);
        arrayKue[1] = new KuePesanan("Brownies", 8000, 0.3);
        arrayKue[2] = new KuePesanan("Klepon", 5000, 0.4);
        arrayKue[3] = new KuePesanan("Donat", 10000, 0.8);
        arrayKue[4] = new KuePesanan("Lemper", 5000, 0.8);
        arrayKue[5] = new KuePesanan("Onde-Onde", 3000, 0.8);
        arrayKue[6] = new KuePesanan("Nagasari", 3000, 0.8);
        arrayKue[7] = new KuePesanan("Dadar Gulung", 4000, 0.8);
        arrayKue[8] = new KuePesanan("Bikang", 10000, 0.8);
        arrayKue[9] = new KuePesanan("Cenil", 8000, 0.8);
        arrayKue[10] = new KueJadi("Kue Lapis", 10000, 2);
        arrayKue[11] = new KueJadi("Kue Putu", 7000, 10);
        arrayKue[12] = new KueJadi("Kue Lumpur", 5000, 15);
        arrayKue[13] = new KueJadi("Kue Tart", 10000, 8);
        arrayKue[14] = new KueJadi("Kue Putri Mandi", 8000, 12);
        arrayKue[15] = new KueJadi("Kue Talam", 5000, 12);
        arrayKue[16] = new KueJadi("Kue Mangkok", 9000, 12);
        arrayKue[17] = new KueJadi("Kue Bugis Ketan", 10000, 12);
        arrayKue[18] = new KueBasi("Kue Lupis", 7000, 12);
        arrayKue[19] = new KueBasi("Kue Putu Ayu", 8000, 12);

        isiDaftarKue(daftarKue);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tampilkanSemuaKue(daftarKue);
                    break;
                case 2:
                    hitungTotalHarga(daftarKue);
                    break;
                case 3:
                    hitungTotalKuePesanan(daftarKue);
                    break;
                case 4:
                    hitungTotalKueJadi(daftarKue);
                    break;
                case 5:
                    tampilkanKueHargaTerbesar(daftarKue);
                    break;
                case 6:
                    hitungTotalKueBasi(daftarKue);
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 7);

        scanner.close();
    }

    public static void isiDaftarKue(ArrayList<Kue> daftarKue) {
        for (int i = 0; i < 10; i++) {
            daftarKue.add(new KuePesanan("Kue Pesanan " + (i + 1), 10 + i, i + 1));
        }

        for (int i = 10; i < 20; i++) {
            daftarKue.add(new KueJadi("Kue Jadi " + (i - 9), 15 + i, i - 9));
        }

        tambahKueBasi(daftarKue);
    }

    public static void tambahKueBasi(ArrayList<Kue> daftarKue) {
        daftarKue.add(new KueBasi("Kue Basi 1", 20, 5));
        daftarKue.add(new KueBasi("Kue Basi 2", 25, 3));
    }

    public static void tampilkanSemuaKue(ArrayList<Kue> daftarKue) {
        if (daftarKue.isEmpty()) {
            System.out.println("Daftar kue kosong.");
            return;
        }

        System.out.println("\nDaftar Kue:");
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                System.out.println("Jenis: Kue Pesanan, " + kue.toString());
            } else if (kue instanceof KueJadi) {
                System.out.println("Jenis: Kue Jadi, " + kue.toString());
            } else if (kue instanceof KueBasi) {
                System.out.println("Jenis: Kue Basi, " + kue.toString());
            }
        }
    }

    public static void hitungTotalHarga(ArrayList<Kue> daftarKue) {
        double totalHarga = 0;
        for (Kue kue : daftarKue) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total harga semua jenis kue: " + totalHarga);
    }

    public static void hitungTotalKuePesanan(ArrayList<Kue> daftarKue) {
        double totalHarga = 0;
        double totalBerat = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHarga += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total harga Kue Pesanan: " + totalHarga);
        System.out.println("Total berat Kue Pesanan: " + totalBerat);
    }

    public static void hitungTotalKueJadi(ArrayList<Kue> daftarKue) {
        double totalHarga = 0;
        double totalJumlah = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHarga += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total harga Kue Jadi: " + totalHarga);
        System.out.println("Total jumlah Kue Jadi: " + totalJumlah);
    }

    public static void hitungTotalKueBasi(ArrayList<Kue> daftarKue) {
        double totalHarga = 0;
        int totalLamaHari = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueBasi) {
                totalHarga += kue.hitungHarga();
                totalLamaHari += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println("Total harga Kue Basi: " + totalHarga);
        System.out.println("Total lama hari Kue Basi: " + totalLamaHari);
    }

    public static void tampilkanKueHargaTerbesar(ArrayList<Kue> daftarKue) {
        if (daftarKue.isEmpty()) {
            System.out.println("Daftar kue kosong.");
            return;
        }

        Kue kueHargaTerbesar = Collections.max(daftarKue, Comparator.comparingDouble(Kue::hitungHarga));
        System.out.println("Informasi kue dengan harga terbesar:");
        System.out.println(kueHargaTerbesar.toString());
    }
}
