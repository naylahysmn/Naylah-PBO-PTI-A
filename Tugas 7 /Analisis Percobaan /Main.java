public class Main {
    public static void main(String[] args) {
        // no.1 error karena terdapat dua argument konstruktor yang memiliki dua parameter String, sedangkan pada kelas Main hanya membuat sebuah instansiasi objek tanpa memberikan argumen.
        // Employee employee = new Employee();
    SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, 100);
    CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);

    System.out.println("Employees diproses secara terpisah:\n");
    System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
 
    Employee[] employees = new Employee[4];
    employees[0] = salariedEmployee;
    employees[1] = hourlyEmployee;
    employees[2] = commissionEmployee;
    employees[3] = basePlusCommissionEmployee;

    System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
    System.out.println(currentEmployee);
    // no.2 konsep polimorfisme ditunjukkan oleh currentEmployee instanceof BasePlusCommissionEmployee
    if (currentEmployee instanceof BasePlusCommissionEmployee) {
    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
        employee.setBaseSalary(1.10 * employee.getBaseSalary());
    
    System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
        }

    System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

    for (int j = 0; j < employees.length; j++) {
    System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }

    // no.3 : hourlyEmployee merupakan objek dari kelas Employee karena dia subklass dari employee. outputnya yakni nama karyawannya
    // HourlyEmployee pekerja = new HourlyEmployee("Karina", "234", 16.75, 40);
    //    System.out.println(pekerja.getName());
    }
}

// no.2 Output yang dihasilkan pada program tersebut dengan menggunakan konsep polimorfisme 
// untuk memproses objek objek dari kelas kelas yang berbeda dengan cara yang sama. Output 
// program ini akan mencakup informasi pendapatan dari BasePlusCommissionEmployee, dan 
// juga akan mencakup gaji pokok yang telah dinaikkan
