package InheritancePractice.Weapon;

public class Sword extends Weapon{
    private String sharpness;
    private String numberOfBlades;

    public void cut(){
        System.out.println("You are cutting");
    }

    public String getSharpness() {
        return sharpness;
    }

    public void setSharpness(String sharpness) {
        this.sharpness = sharpness;
    }

    public String getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(String numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }
}
