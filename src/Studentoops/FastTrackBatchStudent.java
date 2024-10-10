package Studentoops;

public class FastTrackBatchStudent extends Student{
    @Override
    public double calculateFee() {
        // Fast track batch fee is 20% higher than normal
        return super.calculateFee() * 1.20;
    }
}
