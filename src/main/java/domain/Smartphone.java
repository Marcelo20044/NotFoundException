package domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int productId, String productName, int productPrice, String manufacturer) {
        super(productId, productName, productPrice);
        this.manufacturer = manufacturer;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
