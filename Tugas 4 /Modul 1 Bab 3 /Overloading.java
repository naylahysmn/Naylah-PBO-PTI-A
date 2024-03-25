import java.util.Scanner;

public class Overloading {
    // no.3
    static double hasil;
    public static void HitungLuas(int a,int b){
    int nilai = a*b;
    System.out.println("maka hasil luas : "+nilai);
    }
    // no.3 sebelum diubah
    // public static double HitungLuas(double value, double value2){
    // double nilai = value* value2;
    // return nilai;
    // }

    // no.3 setelah diubah
    public static void HitungLuas(double value, double value2) {
        hasil = value*value2;
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);
        System.out.print("masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("masukkan nilai double 2 : ");
        double double2 = in.nextDouble();
        // no.3 setelah diubah
        HitungLuas(double1,double2);
        System.out.println("Maka hasil luas :"+hasil);
        // no.3 sebelum diubah
        // HitungLuas(integer1, integer2);
        // System.out.println("Maka hasil luas : "+HitungLuas(double1, double2));
        
        in.close();
    }
}
