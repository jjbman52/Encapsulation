package InheritancePractice.SuperHero;

public class Hulk extends Avenger{
    private int age;
    private int weight;
    
    @Override
    public void usePower(){
        System.out.println("");
    }
    
    @Override
    public void savePerson(){
        System.out.println("");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
