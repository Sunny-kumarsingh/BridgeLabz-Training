package com.flashdealz;
public class FlashDealzApp {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Mobile", 30),
                new Product("Laptop", 50),
                new Product("Headphones", 20),
                new Product("Smartwatch", 40),
                new Product("Camera", 60)
        };

        QuickSort.quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "% OFF");
        }
    }
}
