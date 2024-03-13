import java.util.*;

class Buku {
    String judul;
    List<String> penulis;

    Buku(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Map<String, List<Buku>> Perpustakaan = new HashMap<>();
        Perpustakaan.put("Sejarah", Arrays.asList(
            new Buku("A People's History of the United States", Arrays.asList("Howard Zinn")),
            new Buku("Sapiens: A Brief History of Humankind", Arrays.asList("Yuval Noah Harari")),
            new Buku("Guns, Germs, and Steel", Arrays.asList("Jared Diamond")),
            new Buku("The Rise and Fall of the Third Reich", Arrays.asList("William L. Shirer")),
            new Buku("The Silk Roads: A New History of the World", Arrays.asList("Peter Frankopan"))
        ));

        Perpustakaan.put("Agama", Arrays.asList(
            new Buku("The Bible", Arrays.asList("Various Authors")),
            new Buku("The Quran", Arrays.asList("Various Authors")),
            new Buku("The Tao Te Ching", Arrays.asList("Laozi")),
            new Buku("The Bhagavad Gita", Arrays.asList("Various Authors")),
            new Buku("The Tibetan Book of Living and Dying", Arrays.asList("Sogyal Rinpoche"))
        ));

        Perpustakaan.put("Filsafat", Arrays.asList(
            new Buku("Meditations", Arrays.asList("Marcus Aurelius")),
            new Buku("Critique of Pure Reason", Arrays.asList("Immanuel Kant")),
            new Buku("Beyond Good and Evil", Arrays.asList("Friedrich Nietzsche")),
            new Buku("The Republic", Arrays.asList("Plato")),
            new Buku("Sophie's World", Arrays.asList("Jostein Gaarder"))
        ));

        for (String kategori : Perpustakaan.keySet()) {
            System.out.println("Kategori: " + kategori);
            System.out.println("Buku:");
            for (Buku buku : Perpustakaan.get(kategori)) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + String.join(", ", buku.penulis));
                System.out.println();
            }
            System.out.println();
        }
    }
}
