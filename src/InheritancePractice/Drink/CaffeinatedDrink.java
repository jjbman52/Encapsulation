package InheritancePractice.Drink;

public class CaffeinatedDrink extends Drink{
    private int caffeineAmount;
    private String name;
    
    public void giveEnergy(){
        System.out.println("");
    }

    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    public void setCaffeineAmount(int caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
