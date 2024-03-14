import java.util.ArrayList;
import java.util.List;

class Dokter {
    public String nama;
    public String spesialisasi;
    public String nomorPraktek;
    public String alamatPraktek;
    public String jadwalPraktek;

    public void periksaPasien(Pasien pasien) {
        System.out.println("Dokter " + nama + " memeriksa pasien " + pasien.nama);
    }

    public Resep beriResep(Pasien pasien) {
        System.out.println("Dokter " + nama + " memberikan resep kepada pasien " + pasien.nama);
        return new Resep();
    }

    public void tambahKeahlian(String keahlianBaru) {
        System.out.println("Dokter " + nama + " menambah keahlian: " + keahlianBaru);
    }
}

class Pasien {
    public String nama;
    public int usia;
    public String gejala;

    public void konsultasiGejala(String gejala) {
        System.out.println("Pasien " + nama + " berkonsultasi gejala: " + gejala);
    }

    public Resep mintaResep() {
        System.out.println("Pasien " + nama + " meminta resep");
        return new Resep();
    }

    public void periksaDiagnosis(String diagnosis) {
        System.out.println("Pasien " + nama + " memeriksa diagnosis: " + diagnosis);
    }
}

class Resep {
    public List<String> obat = new ArrayList<>();
    public List<Integer> dosis = new ArrayList<>();
    public String pemakaianObat;

    public void tampilkanResep() {
        System.out.println("Resep:");
        for (int i = 0; i < obat.size(); i++) {
            System.out.println(obat.get(i) + " - Dosis: " + dosis.get(i));
        }
    }

    public void tambahObat(String obatBaru, int dosisBaru) {
        obat.add(obatBaru);
        dosis.add(dosisBaru);
        System.out.println("Tambah obat: " + obatBaru + " - Dosis: " + dosisBaru);
    }

    public void hapusObat(String obat) {
        int index = this.obat.indexOf(obat);
        if (index != -1) {
            this.obat.remove(index);
            this.dosis.remove(index);
            System.out.println("Hapus obat: " + obat);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dokter dokter = new Dokter();
        dokter.nama = "Dr. Naylah Yasmin";
        dokter.spesialisasi = "Dokter Umum";
        dokter.nomorPraktek = "270905";
        dokter.alamatPraktek = "Jl. Sidoarjo No. 345";
        dokter.jadwalPraktek = "Senin - Jumat, 08.00 - 17.00";

        Pasien pasien1 = new Pasien();
        pasien1.nama = "Sevira";
        pasien1.usia = 19;
        pasien1.gejala = "Sakit kepala";

        Pasien pasien2 = new Pasien();
        pasien2.nama = "Keyne";
        pasien2.usia = 18;
        pasien2.gejala = "Demam";

        dokter.periksaPasien(pasien1);
        dokter.periksaPasien(pasien2);

        Resep resep1 = dokter.beriResep(pasien1);
        Resep resep2 = dokter.beriResep(pasien2);

        resep1.tambahObat("Paramex", 500);
        resep1.tambahObat("Panadol", 250);
        resep1.tampilkanResep();

        resep2.tambahObat("Sanmol", 300);
        resep2.tambahObat("Paracetamol", 600);
        resep2.tampilkanResep();
    }
}
