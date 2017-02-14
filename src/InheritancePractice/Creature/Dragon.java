package InheritancePractice.Creature;

public class Dragon extends LegendaryCreature{
    private int wings = 2;
    
    @Override
    public void usePower(){
        System.out.println("Breath Fire");
    }
    
    @Override
    public void move(){
        System.out.println("Flying");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
