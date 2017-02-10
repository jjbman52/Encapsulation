package InheritancePractice.GolfClub;

public class EightIron extends Iron{
    private String brand;
    private String flex;
    
    @Override
    public void takeDivot(){
        System.out.println("You took a divot");
    }
    
    @Override
    public void hitBall(){
        System.out.println("You hit the ball");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlex() {
        return flex;
    }

    public void setFlex(String flex) {
        this.flex = flex;
    }
}
