package com.medistore;
import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        ISellable med = new Tablet(
                "Paracetamol",
                50,
                LocalDate.of(2026, 5, 1)
        );

        double bill = med.sell(5);
        System.out.println("Total Bill: " + bill);
    }
}
