package InheritancePractice.Animal;

public class Dragon extends LegendaryCreature{
    private int wings = 2;
    private int legs = 4;
    
    @Override
    public void usePower(){
        System.out.println("Breath Fire");
    }
    
    @Override
    public void move(){
        System.out.println("Flying");
    }
}
