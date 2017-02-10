package InheritancePractice.Tool;

public class ImpactWrench extends AirTool{
    private String brand;
    private String model;

    @Override
    public void useTool(){
        System.out.println("Tool is being used");
    }
    
    @Override
    public void storeTool(){
        System.out.println("Tool is being stored");
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
