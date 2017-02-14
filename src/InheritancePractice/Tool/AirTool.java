package InheritancePractice.Tool;

public class AirTool extends Tool{
    private int airPressure;
    private boolean airHoseAttached;

    public void attachAirHose(){
        if (airHoseAttached == false){
            airHoseAttached = true;
            System.out.println("Air Hose is now attached.");
        }else{
            System.out.println("Air Hose is already attached.");
        }
    }
    
    public void detachAirHose(){
        if (airHoseAttached == true){
            airHoseAttached = false;
            System.out.println("Air Hose is now detached.");
        }else{
            System.out.println("Air Hose is already detached.");
        }
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }
    
    public boolean isAirHoseAttached() {
        return airHoseAttached;
    }

    public void setAirHoseAttached(boolean airHoseAttached) {
        this.airHoseAttached = airHoseAttached;
    }
}
