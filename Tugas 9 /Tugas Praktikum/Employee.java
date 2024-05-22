import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private List<Invoice> invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new ArrayList<>();
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(Integer salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public double calculateNetSalary() {
        double totalInvoiceAmount = 0.0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    @Override
    public double getPayableAmount() {
        return calculateNetSalary();
    }

    public static void displayCompanyName() {
        System.out.println("Perusahaan: PT. Google Indonesia");
    }

    public abstract String workDetails();
}