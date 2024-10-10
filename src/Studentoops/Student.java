package Studentoops;

class Student {
    private int studentId;
    private String name;
    private String mobileNo;
    private String address;
    private String course;

    // Getters and Setters with validation
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should not be greater than 15 characters.");
        }
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if (mobileNo.matches("\\d{10}")) { // Check for exactly 10 digits
            this.mobileNo = mobileNo;
        } else {
            throw new IllegalArgumentException("Mobile number should have exactly 10 digits.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to calculate fee (will be overridden in child classes)
    public double calculateFee() {
        // Base fee structure for general course
        switch (course.toLowerCase()) {
            case "java":
                return 5000;
            case "python":
                return 6000;
            case "web development":
                return 7000;
            default:
                return 4000; // Default fee
        }
    }
}
