public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup",100);
        hero1.display();
    //upcasting
        Hero heroUp = (Hero)hero1;
        heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    //Object dgn class Hero
        Hero heroReg = new Hero("Boy",100);
        heroReg.display();
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    //heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); //ini berhasil downcasting
    // No.3
    // HeroAgility hero3 = (HeroAgility) heroUp;
    // hero3.display();

    // No.4 
    HeroAgility heroAgility = new HeroAgility("AgilityHero", 100);
    System.out.println(heroAgility.type);
    HeroIntel heroIntel = new HeroIntel("IntelHero", 100);
    System.out.println(heroIntel.type);

    // No.5
    HeroMagic magicHero = new HeroMagic("Naylahhh", 200);

        // Upcasting
        Hero hero = magicHero; 
        hero.display(); 

        // Downcasting
        HeroMagic downcastedHeroMagic = (HeroMagic) hero; 
        downcastedHeroMagic.display();
    }
}

// No.1 Jelaskan apa fungsi dari extends dan super pada kode subclass?
// extends: digunakan untuk membuat mewarisi sifat dan perilaku dari superclass yang mana heroAgility dan HeroIntel merupakan subclass dari superclass Hero. kedua subclass tersebut dapat mengakses, menambah, atau mengubah metode dan variabel yang telah didefinisikan dalam kelas Hero. 
// super: digunakan untuk memanggil konstruktor, metode, atau merujuk ke superclass yang mana super(name, health) dalam konstruktor HeroAgility dan HeroIntel dapat memanggil konstruktor dari superclass Hero

// No.2 Untuk apa digunakan keyword this pada constructor, setter dan getter?
// konstruktor: digunakan untuk merujuk pada variabel instance kelas agar bisa membedakan antara variabel instance dan parameter yang sama namanya.
// setter: digunakan untuk menunjukkan bahwa nilai yang diteruskan akan diatur  ke variabel instance dari objek yang sedang berlangsung.
// getter: digunakan untuk mengembalikan nilai variabel instance objek dan memastikan nilai yang dikembalikan sesuai dengan instansinya.

// No.3 Tambahkan dan jalankan kode ini di kelas Main, lalu amati apa yang terjadi?
// terjadi ClassCastException karena karena tipe runtime dari heroUp adalah HeroIntel, yang tidak kompatibel dengan HeroAgility.
