package Employee;

public class NightShiftEmployee extends Employee{

    public NightShiftEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode, double cabAllowance) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);  // Call to Employee constructor
        this.cabAllowance = cabAllowance;
    }

    @Override
    public double CalcSalary() {
        return getBasic() + getAllowance() + cabAllowance - getDeductions();
    }
}
