package InheritancePractice.Creature;

public class LegendaryCreature extends Creature{
    private String power;
    
    public void usePower(){
        System.out.println("");
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
