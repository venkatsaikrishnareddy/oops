package Employee;

public class FullTimeEmployee extends Employee{

    // Constructor for FullTimeEmployee, passing to Employee constructor
    public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);  // Call to Employee constructor
    }
}
