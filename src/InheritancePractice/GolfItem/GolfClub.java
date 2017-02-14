package InheritancePractice.GolfItem;

public class GolfClub extends GolfItem{
    private int length;
    public String shaftType;
    private int loft;
    private String grip;
    
    public void hitBall(){
        System.out.println("");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getShaftType() {
        return shaftType;
    }

    public void setShaftType(String shaftType) {
        this.shaftType = shaftType;
    }

    public int getLoft() {
        return loft;
    }

    public void setLoft(int loft) {
        this.loft = loft;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }
}
