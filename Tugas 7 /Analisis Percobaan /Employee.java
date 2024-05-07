import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    // no. 4
    private LocalDate tanggalLahir;
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }

    public String getName(){
        return name;
    }
    
    public String getNoKTP(){
        return noKTP;
    }

    // no. 4
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP());
    }
    
    public abstract double earnings();//pendapatan
}
