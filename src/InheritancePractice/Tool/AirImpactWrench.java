package InheritancePractice.Tool;

public class AirImpactWrench extends AirTool{
    private String rpm;
    private String driveSize;

    @Override
    public void useTool(){
        System.out.println("Tool is being used");
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getDriveSize() {
        return driveSize;
    }

    public void setDriveSize(String driveSize) {
        this.driveSize = driveSize;
    }
}
