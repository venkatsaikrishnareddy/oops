package Employee;

public class Main {
        public static void main(String[] args) {
            // Full-time Employee example
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, 50000, 10000, 5000, "John", "Doe", "123 Main St", "123456");
            System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.CalcSalary());

            // Part-time Employee example
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, 30000, 5000, 2000, "Jane", "Smith", "456 Elm St", "654321");
            System.out.println("Part-Time Employee Salary: " + partTimeEmployee.CalcSalary());

            // Night Shift Employee example
            NightShiftEmployee nightShiftEmployee = new NightShiftEmployee(3, 40000, 8000, 3000, "Tom", "Brown", "789 Oak St", "789123", 2000);
            System.out.println("Night Shift Employee Salary: " + nightShiftEmployee.CalcSalary());

            // Manager example (Full-time + Night shift)
            Manager manager = new Manager(4, 60000, 15000, 7000, "Lisa", "White", "123 Pine St", "987654", 3000);
            System.out.println("Manager Salary: " + manager.CalcSalary());
        }
    }


