import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int jenisRekening;
    private int pin;
    private int percobaanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, int jenisRekening, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = pin;
        this.percobaanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getJenisRekening() {
        return jenisRekening;
    }

    public boolean verifikasiPin(int pin) {
        if (this.pin == pin) {
            percobaanAutentikasi = 0; // Reset percobaan autentikasi jika verifikasi berhasil
            return true;
        } else {
            percobaanAutentikasi++;
            return false;
        }
    }

    public boolean isBlocked() {  // akun akan terblokir jika gagal lebih dari 3 kali
        return percobaanAutentikasi >= 3;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

class SistemTransaksi {
    private Map<String, Pelanggan> databasePelanggan;

    public SistemTransaksi() {
        databasePelanggan = new HashMap<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        databasePelanggan.put(pelanggan.getNomorPelanggan(), pelanggan);
    }

    public void topUp(String nomorPelanggan, int pin, double jumlah) {
        Pelanggan pelanggan = databasePelanggan.get(nomorPelanggan);
        if (pelanggan != null && !pelanggan.isBlocked() && pelanggan.verifikasiPin(pin)) {
            pelanggan.setSaldo(pelanggan.getSaldo() + jumlah);
            System.out.println("Top-up berhasil yeyy. Saldo baru kamu adalah: " + pelanggan.getSaldo());
        } else {
            System.out.println("Yahh Top-up gagal. Periksa status akun kamu lagi yaa.");
        }
    }

    public void pembelian(String nomorPelanggan, int pin, double jumlah) {
        Pelanggan pelanggan = databasePelanggan.get(nomorPelanggan);
        if (pelanggan != null && !pelanggan.isBlocked() && pelanggan.verifikasiPin(pin)) {
            if (pelanggan.getSaldo() >= jumlah) {
                double cashback = 0.0;
                int jenisRekening = pelanggan.getJenisRekening();
                if (jumlah > 1000000) {
                    switch (jenisRekening) {
                        case 38: // pelanggan jenis silver
                            cashback = jumlah * 0.05; // dapat cashback 5%
                            break;
                        case 56: // pelanggan jenis gold
                            cashback = jumlah * 0.07; // dapat cashback 7%
                            break; 
                        case 74:  // pelanggan jenis platinum
                            cashback = jumlah * 0.10;  // dapat cashback 10%
                            break;
                    }
                } else {
                    switch (jenisRekening) {
                        case 56: // pelanggan jenis gold
                            cashback = jumlah * 0.02; // cashback 2% kembali ke saldo
                            break;
                        case 74: // pelanggan jenis platinum
                            cashback = jumlah * 0.05; // cashback 5% kembali ke saldo
                            break;
                    }
                }
                pelanggan.setSaldo(pelanggan.getSaldo() - jumlah + cashback);
                System.out.println("Pembelian berhasil yeyy. Saldo baru kamu adalah: " + pelanggan.getSaldo());
            } else {
                System.out.println("Yahh Pembelian gagal. Saldo kamu tidak cukup.");
            }
        } else {
            System.out.println("Yahh Pembelian gagal. Periksa status akun kamu lagi yaa.");
        }
    }
}

public class Swalayan {
    public static void main(String[] args) {
        SistemTransaksi sistemTransaksi = new SistemTransaksi();

        // Tambahkan beberapa pelanggan
        Pelanggan pelanggan1 = new Pelanggan("3890123456", "Nela", 1500000, 38, 1234);
        Pelanggan pelanggan2 = new Pelanggan("5678901234", "Vanes", 2000000, 56, 5678);
        Pelanggan pelanggan3 = new Pelanggan("7456789012", "Dun", 3000000, 74, 9876);
        sistemTransaksi.tambahPelanggan(pelanggan1);
        sistemTransaksi.tambahPelanggan(pelanggan2);
        sistemTransaksi.tambahPelanggan(pelanggan3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Top-up");
            System.out.println("2. Pembelian");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();

            if (opsi == 1) {
                System.out.print("Masukkan nomor pelanggan: ");
                String nomorPelanggan = scanner.next();
                System.out.print("Masukkan PIN: ");
                int pin = scanner.nextInt();
                System.out.print("Masukkan jumlah untuk top-up: ");
                double jumlah = scanner.nextDouble();
                sistemTransaksi.topUp(nomorPelanggan, pin, jumlah);
            } else if (opsi == 2) {
                System.out.print("Masukkan nomor pelanggan: ");
                String nomorPelanggan = scanner.next();
                System.out.print("Masukkan PIN: ");
                int pin = scanner.nextInt();
                System.out.print("Masukkan jumlah pembelian: ");
                double jumlah = scanner.nextDouble();
                sistemTransaksi.pembelian(nomorPelanggan, pin, jumlah);
            } else if (opsi == 3) {
                System.out.println("Keluar...");
                break;
            } else {
                System.out.println("Opsi tidak valid. Coba lagi yaa.");
            }
        }

        scanner.close();
    }
}
