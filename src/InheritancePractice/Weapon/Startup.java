package InheritancePractice.Weapon;

public class Startup {
    
    public static void main(String[] args){
        Lightsaber ls = new Lightsaber();
        
        ls.activateBlade();
        ls.deactivateBlade();
        ls.cut();
    }
}
