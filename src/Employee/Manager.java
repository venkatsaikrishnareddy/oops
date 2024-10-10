package Employee;

public class Manager extends FullTimeEmployee{

    public Manager(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode, int i) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
    }

    // Override CalcSalary to include cab allowance for Manager
    @Override
    public double CalcSalary() {
        return super.CalcSalary() + cabAllowance;
    }
}
