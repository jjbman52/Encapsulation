package InheritancePractice.Weapon;

public class LightSaber extends Sword{
    private String color;
    private int blades;

    @Override
    public void useWeapon(){
        System.out.println("");
    }
    
    @Override
    public void cut(){
        System.out.println("");
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBlades() {
        return blades;
    }

    public void setBlades(int blades) {
        this.blades = blades;
    }
    
}
