package Employee;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);  // Call to Employee constructor
    }
    @Override
    public double CalcSalary() {
        // Different formula for part-time employees (for example, half the basic + allowance - deductions)
        return (getBasic() / 2) + getAllowance() - getDeductions();
    }
}
