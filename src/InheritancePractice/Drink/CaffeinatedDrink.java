package InheritancePractice.Drink;

public class CaffeinatedDrink extends Drink{
    private int caffeineAmount;
    
    public int findCaffeineHoursOfLastingPower(int caffeineAmount){
        int caffeineLastingPower = 0;
        while (caffeineAmount > 0){
            caffeineAmount /= 2;
            caffeineLastingPower += 1;
        }
        return caffeineLastingPower;
    }

    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    public void setCaffeineAmount(int caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }
}