package InheritancePractice.Weapon;

public class Sword extends Weapon{
    private String length;
    private String width;

    public void cut(){
        System.out.println("");
    }
    
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
}
