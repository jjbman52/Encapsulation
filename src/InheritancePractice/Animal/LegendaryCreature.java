package InheritancePractice.Animal;

public class LegendaryCreature extends Animal{
    private String name;
    private String power;
    
    public void usePower(){
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    
}
