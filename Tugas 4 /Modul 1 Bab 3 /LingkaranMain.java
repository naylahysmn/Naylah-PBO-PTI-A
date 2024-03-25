public class LingkaranMain{
public static void main(String[] args){
    // no.1 sebelum perbaikan
    //lingkaran l = new lingkaran(3);
    //l.setTinggi(10);
    //l.displayMessage();
    //lingkaran l2 = new lingkaran(4, 10);
    //l2.displayMessage();

    // no.1 setelah perbaikan
    lingkaran satu = new lingkaran(3);
    satu.setTinggi(10);
    satu.displayMessage();
    lingkaran duaBelas = new lingkaran(4,10);
    duaBelas.displayMessage();

    lingkaran Lstring = new lingkaran(10,20);
    System.out.println(Lstring.hitungLuas());
  }
}
