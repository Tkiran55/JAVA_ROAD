package InventoryManagementV2;

public class PhysicalProduct extends Product{

    private double shippingCost;

    public PhysicalProduct(String name, double price, double shippingCost) {
        super(name, price);
        this.shippingCost = shippingCost;
    }

    @Override
    public double calculatePrice() {
        return price + shippingCost;
    }
}
