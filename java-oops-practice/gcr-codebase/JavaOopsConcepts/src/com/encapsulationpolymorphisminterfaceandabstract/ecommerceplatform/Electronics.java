package com.encapsulationpolymorphisminterfaceandabstract.ecommerceplatform;

class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
    	// 10% discount
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
    	// 18% GST
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
