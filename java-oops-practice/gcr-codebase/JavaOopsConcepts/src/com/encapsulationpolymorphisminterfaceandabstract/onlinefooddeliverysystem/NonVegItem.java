package com.encapsulationpolymorphisminterfaceandabstract.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50; // hygiene/handling charge

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }
}
