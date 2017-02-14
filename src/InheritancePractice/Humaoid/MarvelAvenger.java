package InheritancePractice.Humaoid;

public class MarvelAvenger extends SuperHuman{
    private String mission;
    private String outfit;

    public void finishMission() {
        System.out.println("You finished your mission");
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }
}
