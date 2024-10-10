package Studentoops;

public class CorporateBatchStudent extends Student {

    @Override
    public double calculateFee() {
        // Corporate batch fee is 30% higher than normal
        return super.calculateFee() * 1.30;

    }
}
