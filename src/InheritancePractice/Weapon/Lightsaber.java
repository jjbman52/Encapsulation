package InheritancePractice.Weapon;

public class Lightsaber extends Sword{
    private String lightsaberColor;
    private boolean bladeActivated;

    public void activateBlade(){
        if (bladeActivated == false){
            bladeActivated = true;
            System.out.println("Lightsaber is now activated.");
        }else{
            System.out.println("Lightsaber is already activated.");
        }
    }
    
    public void deactivateBlade(){
        if (bladeActivated == true){
            bladeActivated = false;
            System.out.println("Lightsaber is now deactivated.");
        }else{
            System.out.println("Lightsaber is already deactivated.");
        }
    }

    public String getLightsaberColor() {
        return lightsaberColor;
    }

    public void setLightsaberColor(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public boolean isBladeActivated() {
        return bladeActivated;
    }

    public void setBladeActivated(boolean bladeActivated) {
        this.bladeActivated = bladeActivated;
    }
}
