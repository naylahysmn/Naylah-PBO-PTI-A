class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return getPenjualan() * komisi;
    }

    @Override
    public String toString() {
        return "\nSales\t\t: " + this.getNama() +
                "\nNo. KTP\t\t: " + this.getNoKTP() +
                "\nTotal Penjualan\t: " + this.getPenjualan() +
                "\nBesaran Komisi\t: Rp " + this.getKomisi() +
                "\nPendapatan\t: Rp " + this.gaji();
    }
}
