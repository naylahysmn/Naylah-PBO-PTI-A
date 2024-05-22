public class PermanentEmployee extends Employee {
    private String pensionPlan;

    public PermanentEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, String pensionPlan) {
        super(registrationNumber, name, salaryPerMonth);
        this.pensionPlan = pensionPlan;
    }

    public String getPensionPlan() {
        return pensionPlan;
    }

    public void setPensionPlan(String pensionPlan) {
        this.pensionPlan = pensionPlan;
    }

    @Override
    public double getPayableAmount() {
        return calculateNetSalary();
    }

    @Override
    public String workDetails() {
        return "Karyawan Tetap dengan rencana pensiun " + pensionPlan;
    }
}