public class Mobil {
        private String noPlat;
        private String warna;
        private String manufaktur;
        private double kecepatanMS;
        private double waktu; 
        
        public void setWaktu(double waktu) {
            this.waktu = waktu;
            rubahSekon(waktu);
        }
    
        private void rubahSekon(double jam) {
            this.waktu = jam * 3600;
        }
    
        public void setNoPlat(String noPlat) {
            this.noPlat = noPlat;
        }
    
        public void setWarna(String warna) {
            this.warna = warna;
        }
    
        public void setManufaktur(String manufaktur) {
            this.manufaktur = manufaktur;
        }
    
        public void setKecepatan(double kecepatanKMH) {
            this.kecepatanMS = kecepatanKMH / 3.6; 
            rubahKecepatan(kecepatanKMH); 
        }
    
        private void rubahKecepatan(double kecepatanKMH) {
            System.out.println("Kecepatan awal: " + kecepatanKMH + " km/h");
            System.out.println("Kecepatan setelah dirubah: " + kecepatanMS + " m/s");
        }
    
        public void displayMessage() {
            double jarakKM = hitungJarak() / 1000; 
            System.out.println("Mobil Anda adalah bermerek " + manufaktur);
            System.out.println("mempunyai nomor plat " + noPlat);
            System.out.println("serta memiliki warna " + warna);
            System.out.println("dan mampu menempuh kecepatan " + kecepatanMS + " m/s");
            System.out.println("dalam waktu " + waktu + " detik");
            System.out.println("Jarak yang dapat ditempuh: " + jarakKM + " km");
        }
    
        private double hitungJarak() {
            return kecepatanMS * waktu;
        }
    }
