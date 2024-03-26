import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dokter dokter1 = new Dokter("Dr. Naylah Yasmin", "Dokter Umum", "270905", "Jl. Sidoarjo No. 25", "Senin - Kamis");
        Dokter dokter2 = new Dokter("Dr. Ibadun Nazratul", "Dokter Anak", "54321");
        Dokter dokter3 = new Dokter("Dr. Vanessa Dewi", "Dokter Spesialis Jiwa");

        dokter1.tambahKeahlian("Spesialis Jantung");
        dokter2.tambahAlamatPraktek("Jl. Sukodono No. 100");
        dokter3.tambahJadwalPraktek("Jumat");

        System.out.println("Dokter 1: " + dokter1);
        System.out.println("Dokter 2: " + dokter2);
        System.out.println("Dokter 3: " + dokter3);
        
        scanner.close();
    }
}
