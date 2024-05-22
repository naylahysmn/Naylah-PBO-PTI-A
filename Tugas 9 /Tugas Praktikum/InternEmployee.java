public class InternEmployee extends Employee implements Contract {
    private String mentor;
    private int contractDuration;

    public InternEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, String mentor, int contractDuration) {
        super(registrationNumber, name, salaryPerMonth);
        this.mentor = mentor;
        this.contractDuration = contractDuration;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public double getPayableAmount() {
        return calculateNetSalary();
    }

    @Override
    public String workDetails() {
        return "Karyawan Magang di bawah " + mentor;
    }

    @Override
    public int getContractDuration() {
        return contractDuration;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " sedang menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi kontrak untuk " + getName() + " adalah " + contractDuration + " bulan.");
    }
}