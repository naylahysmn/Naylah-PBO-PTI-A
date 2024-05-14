public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424082344", 2000000.0);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Rina", "350728490327424082345", 2500000.0);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Sinta", "350728490327424082346", 3000000.0);

        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Edo", "350728490327424082347", 8500.0, 40);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Budi", "350728490327424082348", 9000.0, 45);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Ani", "350728490327424082349", 8000.0, 38);

        Sales sales1 = new Sales("Tika", "350728490327424082350", 50, 50000.0);
        Sales sales2 = new Sales("Doni", "350728490327424082351", 60, 55000.0);
        Sales sales3 = new Sales("Susi", "350728490327424082352", 70, 60000.0);

        Pegawai[] pegawai = {pegawaiTetap1, pegawaiTetap2, pegawaiTetap3, pegawaiHarian1, pegawaiHarian2, pegawaiHarian3, sales1, sales2, sales3};
        for (Pegawai p : pegawai) {
            System.out.println(p);
        }

        System.out.println("\nDowncasting successful:");
        Pegawai pegawaiUp = new PegawaiTetap("Anton", "350728490327424082353", 3500000.0);
        if (pegawaiUp instanceof PegawaiTetap) {
            PegawaiTetap pegawaiDown = (PegawaiTetap) pegawaiUp;
            System.out.println(pegawaiDown);
        }
    }
}