public class MainEmployee {
    // No. 3
    // private String name;

    // public MainEmployee(String name) {
    //    this.name = name;
    // }
public static void main(String[] args) {
// No. 8 private static void main(String[] args) {
// No. 8 protected static void main(String[] args) {
    Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);

        System.out.println("nama boss : "+boss.getName()+", salary = "+boss.getSalary());
        System.out.println("nama staff : "+staff.getName()+", salary = "+staff.getSalary());
    }
}


// No. 1 tidak ditemukan kesalahan
// No. 2 untuk memanggil konstruktor dari superclass dalam konstruktor subclass menggunakan kata kunci 'super()'. ini memanggil konstruktor superclass yang sesuai
// dengan parameter yang diberikan. hal ini perlu dilakukan karena digunakan untuk memastikan bahwa keadaan superclass diinisialisasi dengan benar sebelum inisialisasi subclass dimulai
// No. 7 protected digunakan pada atribut atau method dari suatu kelas untuk memberikan akses yang terbatas kepada kelas yang sama, subclass, atau kelas dalam package yang sama
