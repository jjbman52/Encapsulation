package InheritancePractice.Animal;

public class Startup {
    
    public static void main(String[] args){
        Dragon dragon = new Dragon();
        dragon.setAge(8);
        dragon.setName("Dragon");
        dragon.setPower("Breathing Fire");
        dragon.setSpecies("Reptile");
        
        System.out.println("The " + dragon.getAge() + " year old " + dragon.getName());
    }
}
