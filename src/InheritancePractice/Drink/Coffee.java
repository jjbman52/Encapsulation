package InheritancePractice.Drink;

public class Coffee extends CaffeinatedDrink{
    private String brand;
    private String strength;

    @Override
    public void hydrate(){
        System.out.println("You recieved some hydration");
    }
    
    @Override
    public void giveEnergy(){
        System.out.println("You gained energy");
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
    
}
