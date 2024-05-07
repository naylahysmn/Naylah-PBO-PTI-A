public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    public double earnings() {
        return getWeeklySalary();
    }

    // no. 4
    // public double earnings() {
    //     double totalEarnings = getWeeklySalary() * 4; // gaji 1 bulannya (4 minggu)
    //    if (LocalDate.now().getMonth() == getBirthDate().getMonth()) { // cek apakah bulan ini dia ulang tahun
    //        totalEarnings += 100000; // tambahkan bonus 100.000 jika bulan ini dia ulang tahun
    //     }
    //     return totalEarnings;
    //  }

    
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
