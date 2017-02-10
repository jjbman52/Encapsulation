package InheritancePractice.GolfClub;

public class Iron extends GolfClub{
    private int faceWidth;
    private int weight;
    
    public void takeDivot(){
        System.out.println("");
    }

    public int getFaceWidth() {
        return faceWidth;
    }

    public void setFaceWidth(int faceWidth) {
        this.faceWidth = faceWidth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
