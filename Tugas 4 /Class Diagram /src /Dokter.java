// Import class Resep dan Pasien
import java.util.Scanner;

public class Dokter {
    private String nama;
    private String spesialisasi;
    private String nomorPraktek;
    private String alamatPraktek;
    private String jadwalPraktek;

    public Dokter() {
    }

    public Dokter(String nama, String spesialisasi, String nomorPraktek, String alamatPraktek, String jadwalPraktek) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.nomorPraktek = nomorPraktek;
        this.alamatPraktek = alamatPraktek;
        this.jadwalPraktek = jadwalPraktek;
    }

    public Dokter(String nama, String spesialisasi, String nomorPraktek) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.nomorPraktek = nomorPraktek;
    }

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public void periksaPasien(Pasien pasien) {
        System.out.println("Pasien " + pasien.getNama() + " diperiksa oleh Dokter " + this.nama);
    }

    public Resep beriResep(Pasien pasien) {
        System.out.println("Dokter " + this.nama + " memberikan resep kepada Pasien " + pasien.getNama());
        return new Resep();
    }

    public void tambahKeahlian(String keahlianBaru) {
        System.out.println("Keahlian baru '" + keahlianBaru + "' berhasil ditambahkan untuk Dokter " + this.nama);
    }

    public void informasiPraktek() {
        System.out.println("Informasi Praktek Dokter:");
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Nomor Praktek: " + nomorPraktek);
        System.out.println("Alamat Praktek: " + alamatPraktek);
        System.out.println("Jadwal Praktek: " + jadwalPraktek);
    }

    public void tambahJadwalPraktek(String jadwalBaru) {
        this.jadwalPraktek = jadwalBaru;
        System.out.println("Jadwal Praktek untuk Dokter " + this.nama + " berhasil diubah menjadi: " + jadwalBaru);
    }

    public void tambahAlamatPraktek(String alamatBaru) {
        this.alamatPraktek = alamatBaru;
        System.out.println("Alamat Praktek untuk Dokter " + this.nama + " berhasil diubah menjadi: " + alamatBaru);
    }

    public void ubahNomorPraktek(String nomorBaru) {
        this.nomorPraktek = nomorBaru;
        System.out.println("Nomor Praktek untuk Dokter " + this.nama + " berhasil diubah menjadi: " + nomorBaru);
    }

    public Dokter getSelf() {
        return this;
    }

    public void periksaPasien(Pasien pasien, String kondisi) {
        System.out.println("Pasien " + pasien.getNama() + " diperiksa oleh Dokter " + this.nama + " dengan kondisi: " + kondisi);
    }

    public Resep beriResep(Pasien pasien, String catatan) {
        System.out.println("Dokter " + this.nama + " memberikan resep kepada Pasien " + pasien.getNama() + " dengan catatan: " + catatan);
        return new Resep();
    }

    public void tambahKeahlian(String keahlianBaru, String spesialisasiBaru) {
        System.out.println("Keahlian baru '" + keahlianBaru + "' berhasil ditambahkan untuk Dokter " + this.nama + " di bidang " + spesialisasiBaru);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dokter dokter = new Dokter("Dr. Naylah Yasmin", "Dokter Umum", "270905", "Jl. Sidoarjo No.25", "Senin - Kamis");

        Pasien pasien = new Pasien("Nela", 18, "Jl. Sukodono No. 100");
        dokter.periksaPasien(pasien, "Demam");
        Resep resep = dokter.beriResep(pasien, "Obat Demam");
        resep.tampilkanResep();
        dokter.tambahKeahlian("Spesialis Jantung", "Umum");

        Dokter dokterSelf = dokter.getSelf();
        System.out.println("Dokter: " + dokterSelf.nama);

        scanner.close();
    }
}
