package InheritancePractice.Drink;

public class Startup {
    
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        
        coffee.addIce(4);
        
        System.out.println(coffee.findCaffeineHoursOfLastingPower(165) + " hours");
        System.out.println(coffee.getCoffeeStrength());
    }
}
