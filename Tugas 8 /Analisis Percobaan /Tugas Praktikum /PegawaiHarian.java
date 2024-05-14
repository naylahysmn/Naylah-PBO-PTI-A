class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            return (40 * upahPerJam) + ((totalJam - 40) * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        return "\nPegawai Harian\t: " + this.getNama() +
                "\nNo. KTP\t\t: " + this.getNoKTP() +
                "\nUpah/jam\t: Rp " + this.getUpahPerJam() +
                "\nTotal jam kerja\t: " + this.getTotalJam() +
                "\nPendapatan\t: Rp " + this.gaji();
    }
}
