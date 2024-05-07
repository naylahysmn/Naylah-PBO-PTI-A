import java.time.LocalDate;

public class TestEmployeeNo4 {
    public static void main(String[] args) {
        LocalDate tanggalLahir = LocalDate.of(2005, 9, 27);

    SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, 100);
    CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);

    // set tanggal lahir untuk tes bonus di bulan ulang tahun
    salariedEmployee.setTanggalLahir(tanggalLahir);
    hourlyEmployee.setTanggalLahir(tanggalLahir);
    commissionEmployee.setTanggalLahir(tanggalLahir);
    basePlusCommissionEmployee.setTanggalLahir(tanggalLahir);

    // hitung gaji menggunakan polimorfisme
    System.out.println("Pendapatan Salaried Employee : " + salariedEmployee.earnings());
    System.out.println("Pendapatan Hourly Employee: " + hourlyEmployee.earnings());
    System.out.println("Pendapatan Commission Employee: " + commissionEmployee.earnings());
    System.out.println("Pendapatan Base Plus Commission Employee: " + basePlusCommissionEmployee.earnings());
    }
}
