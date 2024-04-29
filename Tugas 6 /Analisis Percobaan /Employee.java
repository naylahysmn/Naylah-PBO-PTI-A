import java.util.*;
public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    // No. 3 dan No. 6 -> tidak ada perubahan (tidak ngaruh)
    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary, int year,int month, int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.hireday = calendar.getTime();
    }

    // No.5 -> tidak berpengaruh dan tetap bisa dijalankan karena data yang dimasukkan tidak memiliki nama yang sama
    // GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
    // hireday = calendar.getTime();
    // }

    public Date getHireDay(){
        return hireday;
    }

    // No. 8 (private) -> tidak dapat diakses dari luar kelas 'employee' 
    // private Date getHireDay(){
    // return hireday;
    // }

    // No.8 (protected) -> dapat diakses oleh subclass tetapi tidak dapat diakses oleh kelas hirarki turunan 
    // protected Date getHireDay(){
    //    return hireday;
    // }
    

    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
