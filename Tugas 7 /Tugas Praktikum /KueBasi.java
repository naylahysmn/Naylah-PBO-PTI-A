class KueBasi extends Kue {
    private int lamaHari;

    
    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    
    @Override
    public double hitungHarga() {
        return getHarga() - (lamaHari * (getHarga() * 0.1));
    }


    public int getLamaHari() {
       return lamaHari;
    }
}
