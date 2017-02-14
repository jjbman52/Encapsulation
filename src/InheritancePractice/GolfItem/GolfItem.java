package InheritancePractice.GolfItem;

public class GolfItem {
    private String brand;
    private double price;
    private boolean discount;
    
    public double checkForDiscount(double price){
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
