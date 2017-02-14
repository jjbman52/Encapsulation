package InheritancePractice.Humaoid;

public class Humanoid {
    private String name;
    private int age;
    
    public void walk(){
        System.out.println("You are Walking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
