import java.util.Scanner;

public class MainMobilInteraktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan informasi mobil pertama:");
        Mobil m1 = inputMobil(input);

        System.out.println("Informasi mobil pertama:");
        m1.displayMessage();
        System.out.println("================");

        System.out.println("Masukkan informasi mobil kedua:");
        Mobil m2 = inputMobil(input);

        System.out.println("Informasi mobil kedua:");
        m2.displayMessage();
        System.out.println("================");

        System.out.println("Masukkan warna baru untuk mobil pertama:");
        String warnaBaruM1 = input.nextLine();
        m1.setWarna(warnaBaruM1);

        System.out.println("Informasi mobil pertama setelah perubahan warna:");
        m1.displayMessage();

        input.close(); 
    }

    public static Mobil inputMobil(Scanner input) {
        Mobil mobil = new Mobil();

        System.out.println("Masukkan kecepatan mobil:");
        int kecepatan = input.nextInt();
        input.nextLine(); 
        mobil.setKecepatan(kecepatan);

        System.out.println("Masukkan manufaktur mobil:");
        String manufaktur = input.nextLine();
        mobil.setManufaktur(manufaktur);

        System.out.println("Masukkan nomor plat mobil:");
        String noPlat = input.nextLine();
        mobil.setNoPlat(noPlat);

        System.out.println("Masukkan warna mobil:");
        String warna = input.nextLine();
        mobil.setWarna(warna);

        return mobil;
    }
}
