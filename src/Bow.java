/**
 * Created by Zach on 9/8/16.
 */
public class Bow {
    private String type;
    private  String brand;
    private String size;
    private String material;
    private double cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("CURRENT INFORMATION:\nType of bow is: %s.  Brand of bow is: %s.  " +
                        "Size of bow is: %s.  Bow material is: %s.  Cost of bow is: $%.2f\n",type, brand, size, material, cost);
    }
}
