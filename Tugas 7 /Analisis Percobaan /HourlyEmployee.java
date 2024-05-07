public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    private int productsProduced; //jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked, int productsProduced) {
        super(name, noKTP);
        setWage(hourlyWage);
        setHours(hoursWorked);
        setProductsProduced(productsProduced);
    }

    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }

    public double getWage(){
        return wage;
    }
    
    public void setHours(double hoursWorked){
        hours = hoursWorked;
    }
    
    public double getHours(){
        return hours;
    }

    public void setProductsProduced(int productsProduced) {
        this.productsProduced = productsProduced;
    }

    public int getProductsProduced() {
        return productsProduced;
    }
    public double earnings() {
        double totalEarnings;
        if (getHours() <= 40) {
            totalEarnings = getWage() * getHours();
        } else {
            totalEarnings = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
        return totalEarnings;
    }
    // no. 4 gaji berdasarkan banyaknya barang yang diproduksi per minggu
    //     totalEarnings += getWage() * getProductsProduced();

    //     if (LocalDate.now().getMonth() == getBirthDate().getMonth()) { // cek apakah bulan ini dia ulang tahun
    //         totalEarnings += 100000; // tambahkan bonus 100.000 jika bulan ini dia ulang tahun
    //     }
    //     return totalEarnings;
    // }
    
    public String toString(){
        return String.format("Hourly employee: "+super.toString() +"\nhourly wage"+getWage()+"\nhours worked: "+getHours());
    }
}  
