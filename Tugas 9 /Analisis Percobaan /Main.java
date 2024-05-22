import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // No.1 >> Tidak ada eror

        // No.2 >> Terjadi eror karena interface tidak dapat menginstance objek
        // MakhlukHidup makhluk = new MakhlukHidup();

        // No.6 
        Manusia Naylah = new Manusia("Naylah Yasmin", 18);

        // No.7
        System.out.print("Masukkan nama Kamu: ");
        String namaPengguna = scanner.next();
        System.out.print("Masukkan umur Kamu: ");
        int umurPengguna = scanner.nextInt();
        System.out.println("Kamu telah terdaftar, nama mu adalah " + namaPengguna + " dan Kamu berusia " + umurPengguna + " tahun.");

        // No.8
        MakhlukHidup anjing = new Hewan();
        anjing.berjalan();
        anjing.makan();
    }
}
