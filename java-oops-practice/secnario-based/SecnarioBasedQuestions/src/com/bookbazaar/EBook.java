package com.bookbazaar;
public class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    @Override
    public double applyDiscount(int quantity) {
        
        double total = price * quantity;
        return total * 0.10;
    }
}
