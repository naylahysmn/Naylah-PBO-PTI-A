public class Student {
    private String name; 
    private String address; 
    private int age;
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    // No. 5
    private static int jumlahObjek = 0;

    // no.1 : student() --> Student()
    public Student(){
        name = ""; 
        address = ""; 
        age = 0;
        // No. 5
        jumlahObjek++;
    }
    public Student(String n, String a, int ag){ 
        name = n;
        address = a; 
        age = ag;
        // No. 5
        jumlahObjek++;
    }
    // no.2 --> tambah constructor baru
    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        // No. 5
        jumlahObjek++;
    }
        public void setName(String n){
        name = n;
    }
    public void setAddress(String a){ 
        address = a;
    }
    public void setAge(int ag){ 
        age = ag;
    }
    public void setMath(int math){ 
        mathGrade = math;
    }
    public void setEnglish(int english){ 
        englishGrade = english;
    }
    public void setScience(int science){ 
        scienceGrade = science;
    }
    private double getAverage(){ 
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }
    // no.3 : tambah method untuk menentukan siswa yang remidi
    public boolean statusAkhir(){ 
        return getAverage() >= 61;
    }
    public void displayMessage(){ 
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address); 
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata-rata" + getAverage());

        // no.3
        if (statusAkhir()) {
            System.out.println("Selamat Kamu Lolos!! (Tidak perlu remidi)");
        } else {
            System.out.println("Yah Kamu Gagal, Coba lagi ya (Perlu remidi)");
        }
    }

    // no.5 : method untuk menghitung jumlah objek yang telah dibuat
    public static void jumlahObjek() {
        System.out.println("Anda telah memanggil objek sebanyak "+jumlahObjek+", ngeriiii");
    }
}
