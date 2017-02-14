package InheritancePractice.GolfItem;

public class Startup {
    
    public static void main(String[] args){
        GolfingIron gi = new GolfingIron();
        
        gi.setBlade(true);
        gi.findGolfIronHeadType();
        
        gi.setDiscount(true);
        System.out.println(gi.checkForDiscount(120));
    }
}
