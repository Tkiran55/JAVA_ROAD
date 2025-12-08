package InventoryManagementV2;

public class DigitalProduct extends Product{

    private String downloadLink;
    public DigitalProduct(String name, double price, String downloadLink) {
        super(name, price);
        this.downloadLink = downloadLink;
    }

    @Override
    public double calculatePrice() {
        System.out.println("Instant delivery via email: " + downloadLink);
        return price;
    }

}
