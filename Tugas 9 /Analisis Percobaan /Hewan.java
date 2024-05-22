public class Hewan implements MakhlukHidup, Identitas {
    // No.3 >> Bisa karena dapat memungkinkan desain yang lebih modular dan fleksibel, serta untuk mendorong penggunaan komposisi atas pewarisan.
    // manusia.berjalan();
    // manusia.makan();
    // manusia.bekerja();
    // manusia.istirahat();

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }
    
    // No.5 >> Tidak terjadi eror karena tidak ada keterangan override pada tampilkanNama dan tampilkanUmur
    public void tampilkanNama (){}
    
    public void tampilkanUmur () {}
}   
