import java.util.Scanner;

public class Buku {
    private int jumlahLembar;
    private int kataPerHari;
    private int kataPerLembar;

    public Buku(int jumlahLembar, int kataPerHari, int kataPerLembar) {
        this.jumlahLembar = jumlahLembar;
        this.kataPerHari = kataPerHari;
        this.kataPerLembar = kataPerLembar;
    }

    public int hitungHariMenghabiskan() {
        int totalKata = jumlahLembar * kataPerLembar;
        int hari = totalKata / kataPerHari;
        return hari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah lembar buku tulis: ");
        int jumlahLembar = input.nextInt();

        System.out.println("Masukkan jumlah kata yang ditulis per hari: ");
        int kataPerHari = input.nextInt();

        System.out.println("Masukkan jumlah kata per lembar: ");
        int kataPerLembar = input.nextInt();

        Buku buku = new Buku(jumlahLembar, kataPerHari, kataPerLembar);
        int hariMenghabiskan = buku.hitungHariMenghabiskan();

        System.out.println("Mahasiswa A akan menghabiskan buku tulis dalam " + hariMenghabiskan + " hari.");

        input.close();
    }
}
