package com.medistore;
import java.time.LocalDate;

public class Syrup extends Medicine implements ISellable {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public double sell(int q) {
        if (hasStock(q) && !checkExpiry()) {
            reduceStock(q);
            return calculateTotal(q);
        }
        return 0;
    }
}
