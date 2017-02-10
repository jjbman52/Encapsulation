package InheritancePractice.Tool;

public class AirTool extends Tool{
    private int size;
    private int price;

    public void storeTool(){
        System.out.println("");
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
