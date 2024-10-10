package Studentoops;

public class Main { // No need for an inner class
    public static void main(String[] args) {
        // Example for FastTrackBatchStudent
        FastTrackBatchStudent fastTrackStudent = new FastTrackBatchStudent();
        fastTrackStudent.setStudentId(1);
        fastTrackStudent.setName("John Doe");
        fastTrackStudent.setMobileNo("1234567890");
        fastTrackStudent.setCourse("Java");
        fastTrackStudent.setAddress("123 Main St");
        System.out.println("FastTrack Student Fee: " + fastTrackStudent.calculateFee());

        // Example for CorporateBatchStudent
        CorporateBatchStudent corporateStudent = new CorporateBatchStudent();
        corporateStudent.setStudentId(2);
        corporateStudent.setName("Jane Smith");
        corporateStudent.setMobileNo("0987654321");
        corporateStudent.setCourse("Python");
        corporateStudent.setAddress("456 Elm St");
        System.out.println("Corporate Batch Student Fee: " + corporateStudent.calculateFee());

        // Example for WeekendBatchStudent
        WeekendBatchStudent weekendStudent = new WeekendBatchStudent();
        weekendStudent.setStudentId(3);
        weekendStudent.setName("Tom Brown");
        weekendStudent.setMobileNo("9876543210");
        weekendStudent.setCourse("Web Development");
        weekendStudent.setAddress("789 Oak St");
        System.out.println("Weekend Batch Student Fee: " + weekendStudent.calculateFee());

        // Example for CorporateWeekendBatchStudent
        CorporateWeekendBatchStudent corporateWeekendStudent = new CorporateWeekendBatchStudent();
        corporateWeekendStudent.setStudentId(4);
        corporateWeekendStudent.setName("Lisa White");
        corporateWeekendStudent.setMobileNo("1029384756");
        corporateWeekendStudent.setCourse("Python");
        corporateWeekendStudent.setAddress("987 Pine St");
        System.out.println("Corporate Weekend Batch Student Fee: " + corporateWeekendStudent.calculateFee());
    }
}
