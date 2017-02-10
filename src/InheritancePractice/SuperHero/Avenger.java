package InheritancePractice.SuperHero;

public class Avenger extends SuperHero{
    private String mission;
    private String outfit;
    
    public void savePerson(){
        System.out.println("");
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }
}
