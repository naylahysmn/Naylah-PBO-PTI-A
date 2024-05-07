import java.time.LocalDate;

public class TestEmployeeNo5 {
    public static void main(String[] args) {
        LocalDate tanggalLahir = LocalDate.of(2005, 9, 27);
        
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("John Doe", "1234567890", 50000, 45, 100);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Jane Smith", "0987654321", 50000, 35, 150);
        HourlyEmployee hourlyEmployee3 = new HourlyEmployee("Alice Johnson", "1357924680", 60000, 40, 120);
        HourlyEmployee hourlyEmployee4 = new HourlyEmployee("Bob Brown", "2468013579", 60000, 50, 90);

        // set tanggal lahir untuk tes bonus bulan ulang tahun (jika diperlukan)
        hourlyEmployee1.setTanggalLahir(tanggalLahir);
        hourlyEmployee2.setTanggalLahir(tanggalLahir);
        hourlyEmployee3.setTanggalLahir(tanggalLahir);
        hourlyEmployee4.setTanggalLahir(tanggalLahir);

        // hitung gaji menggunakan polimorfisme
        System.out.println("Hourly Employee 1 Earnings: " + hourlyEmployee1.earnings());
        System.out.println("Hourly Employee 2 Earnings: " + hourlyEmployee2.earnings());
        System.out.println("Hourly Employee 3 Earnings: " + hourlyEmployee3.earnings());
        System.out.println("Hourly Employee 4 Earnings: " + hourlyEmployee4.earnings());
    }
}
