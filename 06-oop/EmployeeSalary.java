public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 30000);
        System.out.println("Employee: " + e.name);
        System.out.println("Net Salary: " + e.netSalary());
    }
}

class Employee {
    String name;
    double basic;

    Employee(String name, double basic) {
        this.name = name;
        this.basic = basic;
    }

    double netSalary() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        return basic + hra + da;
    }
}
