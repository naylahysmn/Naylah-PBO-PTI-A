public class lingkaran {
    int alas, tinggi;
    public lingkaran(int alas){
    this.alas = alas;
    }
    
    public lingkaran(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
    }
    
    // no.2 menambahkan costructor dengan parameter int tinggi yang sama seperti baris ke 3
    // public lingkaran(int tinggi) {
    //    this.tinggi = tinggi;
    // }

    // no.3 
    public lingkaran(String strAlas, String strTinggi) {
    this.alas = parseStringToInt(strAlas);
    this.tinggi = parseStringToInt(strTinggi);
    }

    private int parseStringToInt(String str) {
    return Integer.parseInt(str);
    }

    public void setAlas(int alas){
    this.alas = alas;
    }

    public void setTinggi(int tinggi){
    this.tinggi = tinggi;
    }
    public int getAlas(){
    return alas;
    }
    
    public int getTinggi(){
    return tinggi;
    }
    
    public double hitungLuas(){
    double hasil = (double)(getTinggi()*getAlas())/2;
    return hasil;
    }

    public void displayMessage(){
    System.out.println("Hitung Luas : "+hitungLuas());
    }    
}
