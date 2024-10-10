package Studentoops;

public class CorporateWeekendBatchStudent extends Student{
    @Override
    public double calculateFee() {
        // Corporate weekend batch fee is 40% higher than normal
        return super.calculateFee() * 1.40;
    }
}
