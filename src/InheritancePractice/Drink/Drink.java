package InheritancePractice.Drink;

public class Drink {
    private String name;
    private int calories;
    private int numberOfIceCubes;
    private boolean ice;

    public int addIce(int numberOfIceCubes){   
        if(ice == true){
            System.out.println("There is already ice in ");
        }
        return numberOfIceCubes;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getNumberOfIceCubes() {
        return numberOfIceCubes;
    }

    public void setNumberOfIceCubes(int numberOfIceCubes) {
        this.numberOfIceCubes = numberOfIceCubes;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
