import java.util.ArrayList;

public class Resep {
    private ArrayList<String> obat;

    public Resep() {
        this.obat = new ArrayList<>();
    }

    public void tambahObat(String obatBaru) {
        obat.add(obatBaru);
    }

    public void tampilkanResep() {
        System.out.println("Resep:");
        for (String item : obat) {
            System.out.println("- " + item);
        }
    }
}
