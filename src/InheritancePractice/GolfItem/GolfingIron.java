package InheritancePractice.GolfItem;

public class GolfingIron extends GolfClub{
    private boolean blade;
    private boolean cavityBack;
    private boolean hybrid;
    GolfItem gi = new GolfItem();
    
    @Override
    public double checkForDiscount(double price){
        if(gi.isDiscount() == true){
            price *= .8;
        }
        return price;
    }
    
    public void findGolfIronHeadType(){
        if(blade == true){
            cavityBack = false;
            hybrid = false;
            System.out.println("This Golfing Iron Head is a blade.");
        } else if(cavityBack == true){
            blade = false;
            hybrid = false;
            System.out.println("This Golfing Iron Head is a cavity back.");
        } else {
            blade = false;
            cavityBack = false;
            System.out.println("This Golfing Iron Head is a hybrid.");
        }
    }

    public boolean isBlade() {
        return blade;
    }

    public void setBlade(boolean blade) {
        this.blade = blade;
    }

    public boolean isCavityBack() {
        return cavityBack;
    }

    public void setCavityBack(boolean cavityBack) {
        this.cavityBack = cavityBack;
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }
}
