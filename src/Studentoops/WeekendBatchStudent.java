package Studentoops;

public class WeekendBatchStudent  extends Student{
    @Override
    public double calculateFee(){
        return super.calculateFee() * 1.10;

    }
}
