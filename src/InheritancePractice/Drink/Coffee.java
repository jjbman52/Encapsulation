package InheritancePractice.Drink;

public class Coffee extends CaffeinatedDrink{
    private String roast;
    private String coffeeStrength;

    @Override
    public int addIce(int numberOfIceCubes){
        coffeeStrength = "The Coffee is losing it's strength.";
        return numberOfIceCubes;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getCoffeeStrength() {
        return coffeeStrength;
    }

    public void setCoffeeStrength(String coffeeStrength) {
        this.coffeeStrength = coffeeStrength;
    }
}
