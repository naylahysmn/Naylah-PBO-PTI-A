public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        // no. 4 -> error karena diatasnya tidak ada variabel bonus
        // super(name, salary, year, month, day, bonus);
        bonus = 0;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
