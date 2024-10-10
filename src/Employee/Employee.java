package Employee;


public class Employee {
    protected double cabAllowance;
    private int empId;
    private double sal = 0;  // Read-only, calculated via CalcSalary
    private double basic;
    private double allowance;
    private double deductions;
    private String firstName;
    private String lastName;
    private String address;
    private String pincode;

    // Parameterized Constructor
    public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        this.empId = empId;
        this.basic = basic;
        this.allowance = allowance;
        this.deductions = deductions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pincode = pincode;
        this.sal = CalcSalary();  // Automatically calculate salary when object is created
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public double getSal() {
        return sal;  // Salary is read-only, no setter
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // Method to return real name
    public String getRealName() {
        String realName = firstName + " " + lastName;
        if (realName.trim().length() == 0) {
            throw new IllegalArgumentException("Real name should not be less than 0 characters.");
        }
        return realName;
    }

    // Method to calculate salary
    public double CalcSalary() {
        sal = basic + allowance - deductions;
        return sal;
    }
}

