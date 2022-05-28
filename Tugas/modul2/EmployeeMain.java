package Tugas.modul2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Budi", "Setiawan", 100000);
        // System.out.println("ID: " + employee.getId());
        // System.out.println("Name: " + employee.getname());
        // System.out.println("Salary: " + employee.getSalary());
        // System.out.println("Annual Salary: " + employee.getAnnualSalary());
        // System.out.println("Raise Salary by 10%: " + employee.raiseSalary());
        System.out.println(employee.toString());
    }
}
