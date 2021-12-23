package domain;

public class Smartphone extends Product {
    private String name;
    private String manufacturer;

    public Smartphone(int productId, String productName, int productPrice, String name, String manufacturer) {
        super(productId, productName, productPrice);
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
